package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteProgram;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes13.dex */
public class RoomSQLiteQuery implements SupportSQLiteProgram, SupportSQLiteQuery {
    public static final TreeMap<Integer, RoomSQLiteQuery> sQueryPool = new TreeMap<>();
    public int mArgCount;
    public final int[] mBindingTypes;
    public final byte[][] mBlobBindings;
    public final int mCapacity;
    public final double[] mDoubleBindings;
    public final long[] mLongBindings;
    public volatile String mQuery;
    public final String[] mStringBindings;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public int getArgCount() {
        return this.mArgCount;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public String getSql() {
        return this.mQuery;
    }

    static {
        Covode.recordClassIndex(1833);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.mBindingTypes, 1);
        Arrays.fill(this.mStringBindings, (Object) null);
        Arrays.fill(this.mBlobBindings, (Object) null);
        this.mQuery = null;
    }

    public void release() {
        synchronized (sQueryPool) {
            sQueryPool.put(Integer.valueOf(this.mCapacity), this);
            prunePoolLocked();
        }
    }

    public static void prunePoolLocked() {
        if (sQueryPool.size() > 15) {
            int size = sQueryPool.size() - 10;
            Iterator<Integer> it = sQueryPool.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.mBindingTypes[i] = 1;
    }

    public RoomSQLiteQuery(int i) {
        this.mCapacity = i;
        int i2 = i + 1;
        this.mBindingTypes = new int[i2];
        this.mLongBindings = new long[i2];
        this.mDoubleBindings = new double[i2];
        this.mStringBindings = new String[i2];
        this.mBlobBindings = new byte[i2];
    }

    public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
        supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery.1
            static {
                Covode.recordClassIndex(1834);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void clearBindings() {
                RoomSQLiteQuery.this.clearBindings();
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void bindNull(int i) {
                RoomSQLiteQuery.this.bindNull(i);
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void bindBlob(int i, byte[] bArr) {
                RoomSQLiteQuery.this.bindBlob(i, bArr);
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void bindDouble(int i, double d) {
                RoomSQLiteQuery.this.bindDouble(i, d);
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void bindLong(int i, long j) {
                RoomSQLiteQuery.this.bindLong(i, j);
            }

            @Override // androidx.sqlite.p021db.SupportSQLiteProgram
            public final void bindString(int i, String str) {
                RoomSQLiteQuery.this.bindString(i, str);
            }
        });
        return acquire;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i = 1; i <= this.mArgCount; i++) {
            int i2 = this.mBindingTypes[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                supportSQLiteProgram.bindBlob(i, this.mBlobBindings[i]);
                            }
                        } else {
                            supportSQLiteProgram.bindString(i, this.mStringBindings[i]);
                        }
                    } else {
                        supportSQLiteProgram.bindDouble(i, this.mDoubleBindings[i]);
                    }
                } else {
                    supportSQLiteProgram.bindLong(i, this.mLongBindings[i]);
                }
            } else {
                supportSQLiteProgram.bindNull(i);
            }
        }
    }

    public void copyArgumentsFrom(RoomSQLiteQuery roomSQLiteQuery) {
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        System.arraycopy(roomSQLiteQuery.mBindingTypes, 0, this.mBindingTypes, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mLongBindings, 0, this.mLongBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mStringBindings, 0, this.mStringBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mBlobBindings, 0, this.mBlobBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mDoubleBindings, 0, this.mDoubleBindings, 0, argCount);
    }

    public void init(String str, int i) {
        this.mQuery = str;
        this.mArgCount = i;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        this.mBindingTypes[i] = 5;
        this.mBlobBindings[i] = bArr;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.mBindingTypes[i] = 3;
        this.mDoubleBindings[i] = d;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.mBindingTypes[i] = 2;
        this.mLongBindings[i] = j;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        this.mBindingTypes[i] = 4;
        this.mStringBindings[i] = str;
    }

    public static RoomSQLiteQuery acquire(String str, int i) {
        synchronized (sQueryPool) {
            Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = sQueryPool.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                sQueryPool.remove(ceilingEntry.getKey());
                RoomSQLiteQuery value = ceilingEntry.getValue();
                value.init(str, i);
                return value;
            }
            RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i);
            roomSQLiteQuery.init(str, i);
            return roomSQLiteQuery;
        }
    }
}
