package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.lifecycle.LiveData;
import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p002O.C0002O;
import p003X.C116335Vqr;
import p003X.C116336Vqs;
import p003X.C116338Vqu;
import p003X.C116466Vsy;
import p003X.C146498f3s;

/* loaded from: classes13.dex */
public class InvalidationTracker {
    public static final String[] TRIGGERS = {"UPDATE", C146498f3s.f19555LJ, "INSERT"};
    public volatile SupportSQLiteStatement mCleanupStatement;
    public final RoomDatabase mDatabase;
    public volatile boolean mInitialized;
    public final C0401d mInvalidationLiveDataContainer;
    public C116466Vsy mMultiInstanceInvalidationClient;
    public C116336Vqs mObservedTableTracker;
    public final SafeIterableMap<Observer, C0394b> mObserverMap;
    public AtomicBoolean mPendingRefresh;
    public Runnable mRefreshRunnable;
    public final ArrayMap<String, Integer> mTableIdLookup;
    public final String[] mTableNames;
    public Map<String, Set<String>> mViewTables;

    public void refreshVersionsSync() {
        syncTriggers();
        this.mRefreshRunnable.run();
    }

    static {
        Covode.recordClassIndex(1814);
    }

    public boolean ensureInitialization() {
        if (!this.mDatabase.isOpen()) {
            return false;
        }
        if (!this.mInitialized) {
            this.mDatabase.getOpenHelper().getWritableDatabase();
        }
        if (!this.mInitialized) {
            return false;
        }
        return true;
    }

    public void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            this.mDatabase.getQueryExecutor().execute(this.mRefreshRunnable);
        }
    }

    public void stopMultiInstanceInvalidation() {
        C116466Vsy c116466Vsy = this.mMultiInstanceInvalidationClient;
        if (c116466Vsy != null) {
            if (c116466Vsy.LJIIIIZZ.compareAndSet(false, true)) {
                c116466Vsy.LJI.execute(c116466Vsy.LJIIL);
            }
            this.mMultiInstanceInvalidationClient = null;
        }
    }

    public void syncTriggers() {
        if (!this.mDatabase.isOpen()) {
            return;
        }
        syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
    }

    /* loaded from: classes13.dex */
    public static abstract class Observer {
        public final String[] mTables;

        static {
            Covode.recordClassIndex(1816);
        }

        public boolean isRemote() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        public Observer(String[] strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public Observer(String str, String... strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.mTables[strArr.length] = str;
        }
    }

    public void addWeakObserver(Observer observer) {
        addObserver(new C116335Vqr(this, observer));
    }

    public void removeObserver(Observer observer) {
        C0394b remove;
        synchronized (this.mObserverMap) {
            remove = this.mObserverMap.remove(observer);
        }
        if (remove != null && this.mObservedTableTracker.LIZIZ(remove.LIZ)) {
            syncTriggers();
        }
    }

    private String[] resolveViews(String[] strArr) {
        ArraySet arraySet = new ArraySet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.mViewTables.containsKey(lowerCase)) {
                arraySet.addAll(this.mViewTables.get(lowerCase));
            } else {
                arraySet.add(str);
            }
        }
        return (String[]) arraySet.toArray(new String[arraySet.size()]);
    }

    private String[] validateAndResolveTableNames(String[] strArr) {
        String[] resolveViews = resolveViews(strArr);
        for (String str : resolveViews) {
            if (!this.mTableIdLookup.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(C0002O.m25086C("There is no table with name ", str));
            }
        }
        return resolveViews;
    }

    public void internalInit(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            if (this.mInitialized) {
                return;
            }
            supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            syncTriggers(supportSQLiteDatabase);
            this.mCleanupStatement = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.mInitialized = true;
        }
    }

    public void addObserver(Observer observer) {
        C0394b putIfAbsent;
        String[] resolveViews = resolveViews(observer.mTables);
        int[] iArr = new int[resolveViews.length];
        int length = resolveViews.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.mTableIdLookup.get(resolveViews[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException(C0002O.m25086C("There is no table with name ", resolveViews[i]));
            }
        }
        C0394b c0394b = new C0394b(observer, iArr, resolveViews);
        synchronized (this.mObserverMap) {
            putIfAbsent = this.mObserverMap.putIfAbsent(observer, c0394b);
        }
        if (putIfAbsent == null && this.mObservedTableTracker.LIZ(iArr)) {
            syncTriggers();
        }
    }

    public void notifyObserversByTableNames(String... strArr) {
        Set<String> set;
        synchronized (this.mObserverMap) {
            Iterator<Map.Entry<Observer, C0394b>> it = this.mObserverMap.iterator();
            while (it.hasNext()) {
                Map.Entry<Observer, C0394b> next = it.next();
                if (!next.getKey().isRemote()) {
                    C0394b value = next.getValue();
                    if (value.LIZIZ.length == 1) {
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (strArr[i].equalsIgnoreCase(value.LIZIZ[0])) {
                                set = value.LIZLLL;
                                if (set != null) {
                                }
                            } else {
                                i++;
                            }
                        }
                    } else {
                        set = new ArraySet<>();
                        for (String str : strArr) {
                            String[] strArr2 = value.LIZIZ;
                            int length2 = strArr2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    String str2 = strArr2[i2];
                                    if (str2.equalsIgnoreCase(str)) {
                                        set.add(str2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        if (set.size() > 0) {
                            value.LIZJ.onInvalidated(set);
                        }
                    }
                }
            }
        }
    }

    public void syncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.mDatabase.getCloseLock();
                closeLock.lock();
                int[] LIZ = this.mObservedTableTracker.LIZ();
                if (LIZ != null) {
                    int length = LIZ.length;
                    supportSQLiteDatabase.beginTransaction();
                    for (int i = 0; i < length; i++) {
                        int i2 = LIZ[i];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                stopTrackingTable(supportSQLiteDatabase, i);
                            }
                        } else {
                            startTrackingTable(supportSQLiteDatabase, i);
                        }
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    C116336Vqs c116336Vqs = this.mObservedTableTracker;
                    synchronized (c116336Vqs) {
                        c116336Vqs.f14233LJ = false;
                    }
                    closeLock.unlock();
                } else {
                    closeLock.unlock();
                    return;
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }

    public <T> LiveData<T> createLiveData(String[] strArr, Callable<T> callable) {
        return createLiveData(strArr, false, callable);
    }

    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.emptyMap(), strArr);
    }

    public void startMultiInstanceInvalidation(Context context, String str) {
        this.mMultiInstanceInvalidationClient = new C116466Vsy(context, str, this, this.mDatabase.getQueryExecutor());
    }

    private void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            appendTriggerName(sb, str, str2);
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            appendTriggerName(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log");
            sb.append(" SET invalidated");
            sb.append(" = 1 WHERE ");
            sb.append("table_id = ");
            sb.append(i);
            sb.append(" AND invalidated");
            sb.append(" = 0; END");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    public <T> LiveData<T> createLiveData(String[] strArr, boolean z, Callable<T> callable) {
        C0401d c0401d = this.mInvalidationLiveDataContainer;
        return new C116338Vqu(c0401d.LIZIZ, c0401d, z, callable, validateAndResolveTableNames(strArr));
    }

    public static void appendTriggerName(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: androidx.room.InvalidationTracker$b */
    /* loaded from: classes13.dex */
    public static class C0394b {
        public final int[] LIZ;
        public final String[] LIZIZ;
        public final Observer LIZJ;
        public final Set<String> LIZLLL;

        static {
            Covode.recordClassIndex(1818);
        }

        public C0394b(Observer observer, int[] iArr, String[] strArr) {
            this.LIZJ = observer;
            this.LIZ = iArr;
            this.LIZIZ = strArr;
            if (iArr.length == 1) {
                ArraySet arraySet = new ArraySet();
                arraySet.add(this.LIZIZ[0]);
                this.LIZLLL = Collections.unmodifiableSet(arraySet);
                return;
            }
            this.LIZLLL = null;
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.mPendingRefresh = new AtomicBoolean(false);
        this.mInitialized = false;
        this.mObserverMap = new SafeIterableMap<>();
        this.mRefreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker.1
            static {
                Covode.recordClassIndex(1815);
            }

            private Set<Integer> LIZ() {
                ArraySet arraySet = new ArraySet();
                Cursor query = InvalidationTracker.this.mDatabase.query(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                while (query.moveToNext()) {
                    try {
                        arraySet.add(Integer.valueOf(query.getInt(0)));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                if (!arraySet.isEmpty()) {
                    InvalidationTracker.this.mCleanupStatement.executeUpdateDelete();
                }
                return arraySet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Set<Integer> set;
                Lock closeLock = InvalidationTracker.this.mDatabase.getCloseLock();
                try {
                    try {
                        closeLock.lock();
                    } catch (SQLiteException | IllegalStateException unused) {
                        set = null;
                    }
                    if (!InvalidationTracker.this.ensureInitialization()) {
                        return;
                    }
                    if (!InvalidationTracker.this.mPendingRefresh.compareAndSet(true, false)) {
                        return;
                    }
                    if (InvalidationTracker.this.mDatabase.inTransaction()) {
                        return;
                    }
                    if (InvalidationTracker.this.mDatabase.mWriteAheadLoggingEnabled) {
                        try {
                            SupportSQLiteDatabase writableDatabase = InvalidationTracker.this.mDatabase.getOpenHelper().getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                set = LIZ();
                                try {
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                } catch (Throwable th) {
                                    th = th;
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException | IllegalStateException unused2) {
                        }
                    } else {
                        set = LIZ();
                    }
                    if (set != null && !set.isEmpty()) {
                        synchronized (InvalidationTracker.this.mObserverMap) {
                            Iterator<Map.Entry<Observer, C0394b>> it = InvalidationTracker.this.mObserverMap.iterator();
                            while (it.hasNext()) {
                                C0394b value = it.next().getValue();
                                int length = value.LIZ.length;
                                Set<String> set2 = null;
                                for (int i = 0; i < length; i++) {
                                    if (set.contains(Integer.valueOf(value.LIZ[i]))) {
                                        if (length == 1) {
                                            set2 = value.LIZLLL;
                                        } else {
                                            if (set2 == null) {
                                                set2 = new ArraySet<>(length);
                                            }
                                            set2.add(value.LIZIZ[i]);
                                        }
                                    }
                                }
                                if (set2 != null) {
                                    value.LIZJ.onInvalidated(set2);
                                }
                            }
                        }
                    }
                } finally {
                    closeLock.unlock();
                }
            }
        };
        this.mDatabase = roomDatabase;
        this.mObservedTableTracker = new C116336Vqs(strArr.length);
        this.mTableIdLookup = new ArrayMap<>();
        this.mViewTables = map2;
        this.mInvalidationLiveDataContainer = new C0401d(this.mDatabase);
        int length = strArr.length;
        this.mTableNames = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.mTableIdLookup.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.mTableNames[i] = str.toLowerCase(Locale.US);
            } else {
                this.mTableNames[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.mTableIdLookup.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                ArrayMap<String, Integer> arrayMap = this.mTableIdLookup;
                arrayMap.put(lowerCase3, arrayMap.get(lowerCase2));
            }
        }
    }
}
