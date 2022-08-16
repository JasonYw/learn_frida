package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.room.p020a.AbstractC0399a;
import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p003X.C116211Vor;
import p003X.C144366eVM;
import p003X.ExecutorC135053c4m;

/* loaded from: classes13.dex */
public abstract class RoomDatabase {
    public boolean mAllowMainThreadQueries;
    public List<Callback> mCallbacks;
    public volatile SupportSQLiteDatabase mDatabase;
    public SupportSQLiteOpenHelper mOpenHelper;
    public Executor mQueryExecutor;
    public Executor mTransactionExecutor;
    public boolean mWriteAheadLoggingEnabled;
    public final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    public final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
    public final InvalidationTracker mInvalidationTracker = createInvalidationTracker();

    /* loaded from: classes13.dex */
    public static abstract class Callback {
        static {
            Covode.recordClassIndex(1828);
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    static {
        Covode.recordClassIndex(1826);
    }

    public abstract void clearAllTables();

    public abstract InvalidationTracker createInvalidationTracker();

    public abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    /* loaded from: classes13.dex */
    public static class Builder<T extends RoomDatabase> {
        public boolean mAllowDestructiveMigrationOnDowngrade;
        public boolean mAllowMainThreadQueries;
        public ArrayList<Callback> mCallbacks;
        public final Context mContext;
        public final Class<T> mDatabaseClass;
        public SupportSQLiteOpenHelper.Factory mFactory;
        public Set<Integer> mMigrationStartAndEndVersions;
        public Set<Integer> mMigrationsNotRequiredFrom;
        public boolean mMultiInstanceInvalidation;
        public final String mName;
        public Executor mQueryExecutor;
        public Executor mTransactionExecutor;
        public JournalMode mJournalMode = JournalMode.AUTOMATIC;
        public boolean mRequireMigration = true;
        public final C0397a mMigrationContainer = new C0397a();

        static {
            Covode.recordClassIndex(1827);
        }

        public Builder<T> allowMainThreadQueries() {
            this.mAllowMainThreadQueries = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.mRequireMigration = false;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.mRequireMigration = true;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            boolean z;
            if (this.mName != null) {
                z = true;
            } else {
                z = false;
            }
            this.mMultiInstanceInvalidation = z;
            return this;
        }

        public T build() {
            Executor executor;
            if (this.mContext != null) {
                if (this.mDatabaseClass != null) {
                    if (this.mQueryExecutor == null && this.mTransactionExecutor == null) {
                        Executor LIZJ = C144366eVM.LIZJ();
                        this.mTransactionExecutor = LIZJ;
                        this.mQueryExecutor = LIZJ;
                    } else {
                        Executor executor2 = this.mQueryExecutor;
                        if (executor2 != null && this.mTransactionExecutor == null) {
                            this.mTransactionExecutor = executor2;
                        } else if (this.mQueryExecutor == null && (executor = this.mTransactionExecutor) != null) {
                            this.mQueryExecutor = executor;
                        }
                    }
                    Set<Integer> set = this.mMigrationStartAndEndVersions;
                    if (set != null && this.mMigrationsNotRequiredFrom != null) {
                        for (Integer num : set) {
                            if (this.mMigrationsNotRequiredFrom.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    if (this.mFactory == null) {
                        this.mFactory = new C116211Vor();
                    }
                    Context context = this.mContext;
                    String str = this.mName;
                    SupportSQLiteOpenHelper.Factory factory = this.mFactory;
                    C0397a c0397a = this.mMigrationContainer;
                    ArrayList<Callback> arrayList = this.mCallbacks;
                    boolean z = this.mAllowMainThreadQueries;
                    JournalMode journalMode = this.mJournalMode;
                    if (journalMode == JournalMode.AUTOMATIC) {
                        int i = Build.VERSION.SDK_INT;
                        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                        if (activityManager != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            if (!activityManager.isLowRamDevice()) {
                                journalMode = JournalMode.WRITE_AHEAD_LOGGING;
                            }
                        }
                        journalMode = JournalMode.TRUNCATE;
                    }
                    DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str, factory, c0397a, arrayList, z, journalMode, this.mQueryExecutor, this.mTransactionExecutor, this.mMultiInstanceInvalidation, this.mRequireMigration, this.mAllowDestructiveMigrationOnDowngrade, this.mMigrationsNotRequiredFrom);
                    T t = (T) Room.getGeneratedImplementation(this.mDatabaseClass, "_Impl");
                    t.init(databaseConfiguration);
                    return t;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.mFactory = factory;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            this.mJournalMode = journalMode;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            this.mQueryExecutor = executor;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            this.mTransactionExecutor = executor;
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new ArrayList<>();
            }
            this.mCallbacks.add(callback);
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(int... iArr) {
            if (this.mMigrationsNotRequiredFrom == null) {
                this.mMigrationsNotRequiredFrom = new HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.mMigrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            return this;
        }

        public Builder<T> addMigrations(AbstractC0399a... abstractC0399aArr) {
            if (this.mMigrationStartAndEndVersions == null) {
                this.mMigrationStartAndEndVersions = new HashSet();
            }
            for (AbstractC0399a abstractC0399a : abstractC0399aArr) {
                this.mMigrationStartAndEndVersions.add(Integer.valueOf(abstractC0399a.LIZ));
                this.mMigrationStartAndEndVersions.add(Integer.valueOf(abstractC0399a.LIZIZ));
            }
            this.mMigrationContainer.LIZ(abstractC0399aArr);
            return this;
        }

        public Builder(Context context, Class<T> cls, String str) {
            this.mContext = context;
            this.mDatabaseClass = cls;
            this.mName = str;
        }
    }

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().inTransaction();
    }

    public boolean isOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
            return true;
        }
        return false;
    }

    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void assertNotMainThread() {
        if (this.mAllowMainThreadQueries || !isMainThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.syncTriggers(writableDatabase);
        writableDatabase.beginTransaction();
    }

    public void endTransaction() {
        this.mOpenHelper.getWritableDatabase().endTransaction();
        if (!inTransaction()) {
            this.mInvalidationTracker.refreshVersionsAsync();
        }
    }

    /* loaded from: classes13.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        static {
            Covode.recordClassIndex(1829);
        }
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            try {
                writeLock.lock();
                this.mInvalidationTracker.stopMultiInstanceInvalidation();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.mInvalidationTracker.internalInit(supportSQLiteDatabase);
    }

    public SupportSQLiteStatement compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().compileStatement(str);
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                try {
                    V call = callable.call();
                    setTransactionSuccessful();
                    return call;
                } catch (Exception e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } finally {
            endTransaction();
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    /* loaded from: classes13.dex */
    public static class C0397a {
        public SparseArrayCompat<SparseArrayCompat<AbstractC0399a>> LIZ = new SparseArrayCompat<>();

        static {
            Covode.recordClassIndex(1830);
        }

        public final void LIZ(AbstractC0399a... abstractC0399aArr) {
            for (AbstractC0399a abstractC0399a : abstractC0399aArr) {
                int i = abstractC0399a.LIZ;
                int i2 = abstractC0399a.LIZIZ;
                SparseArrayCompat<AbstractC0399a> sparseArrayCompat = this.LIZ.get(i);
                if (sparseArrayCompat == null) {
                    sparseArrayCompat = new SparseArrayCompat<>();
                    this.LIZ.put(i, sparseArrayCompat);
                }
                sparseArrayCompat.get(i2);
                sparseArrayCompat.append(i2, abstractC0399a);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
            if (r8 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
            r0 = r2 - 1;
            r2 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
            if (r0 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1 = r4.keyAt(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r8 == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
            if (r1 > r10) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
            if (r1 <= r9) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
            r7.add(r4.valueAt(r0));
            r9 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
            if (r8 == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
            if (r9 > r10) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
            r0 = r0 + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
            if (r1 < r10) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
            if (r1 >= r9) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
            if (r9 < r10) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
            r4 = r6.LIZ.get(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r4 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
            r2 = r4.size();
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:4:0x0005). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:5:0x0007). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<androidx.room.p020a.AbstractC0399a> LIZ(java.util.List<androidx.room.p020a.AbstractC0399a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
                r0 = -1
                r0 = 1
                if (r8 == 0) goto L3e
                r5 = -1
            L5:
                if (r9 >= r10) goto L43
            L7:
                androidx.collection.SparseArrayCompat<androidx.collection.SparseArrayCompat<androidx.room.a.a>> r0 = r6.LIZ
                java.lang.Object r4 = r0.get(r9)
                androidx.collection.SparseArrayCompat r4 = (androidx.collection.SparseArrayCompat) r4
                r3 = 0
                if (r4 != 0) goto L13
                return r3
            L13:
                int r2 = r4.size()
                r0 = 0
                if (r8 == 0) goto L3c
                int r0 = r2 + (-1)
                r2 = -1
            L1d:
                if (r0 == r2) goto L42
                int r1 = r4.keyAt(r0)
                if (r8 == 0) goto L35
                if (r1 > r10) goto L3a
                if (r1 <= r9) goto L3a
            L29:
                java.lang.Object r0 = r4.valueAt(r0)
                r7.add(r0)
                r9 = r1
                r0 = 1
                if (r8 == 0) goto L3f
                goto L5
            L35:
                if (r1 < r10) goto L3a
                if (r1 >= r9) goto L3a
                goto L29
            L3a:
                int r0 = r0 + r5
                goto L1d
            L3c:
                r0 = 0
                goto L1d
            L3e:
                r5 = 1
            L3f:
                if (r9 <= r10) goto L43
                goto L7
            L42:
                return r3
            L43:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.C0397a.LIZ(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public void init(DatabaseConfiguration databaseConfiguration) {
        this.mOpenHelper = createOpenHelper(databaseConfiguration);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (databaseConfiguration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
            z = true;
        }
        this.mOpenHelper.setWriteAheadLoggingEnabled(z);
        this.mCallbacks = databaseConfiguration.callbacks;
        this.mQueryExecutor = databaseConfiguration.queryExecutor;
        this.mTransactionExecutor = new ExecutorC135053c4m(databaseConfiguration.transactionExecutor);
        this.mAllowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
        this.mWriteAheadLoggingEnabled = z;
        if (databaseConfiguration.multiInstanceInvalidation) {
            this.mInvalidationTracker.startMultiInstanceInvalidation(databaseConfiguration.context, databaseConfiguration.name);
        }
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().query(new SimpleSQLiteQuery(str, objArr));
    }
}
