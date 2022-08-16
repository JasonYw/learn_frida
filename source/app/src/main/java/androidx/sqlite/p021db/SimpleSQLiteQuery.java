package androidx.sqlite.p021db;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.sqlite.db.SimpleSQLiteQuery */
/* loaded from: classes13.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public final Object[] mBindArgs;
    public final String mQuery;

    static {
        Covode.recordClassIndex(1886);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public final String getSql() {
        return this.mQuery;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public final int getArgCount() {
        Object[] objArr = this.mBindArgs;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public SimpleSQLiteQuery(String str) {
        this(str, null);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        bind(supportSQLiteProgram, this.mBindArgs);
    }

    public SimpleSQLiteQuery(String str, Object[] objArr) {
        this.mQuery = str;
        this.mBindArgs = objArr;
    }

    public static void bind(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            bind(supportSQLiteProgram, i, obj);
        }
    }

    public static void bind(SupportSQLiteProgram supportSQLiteProgram, int i, Object obj) {
        long j;
        if (obj == null) {
            supportSQLiteProgram.bindNull(i);
        } else if (obj instanceof byte[]) {
            supportSQLiteProgram.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            supportSQLiteProgram.bindDouble(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            supportSQLiteProgram.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            supportSQLiteProgram.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            supportSQLiteProgram.bindLong(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            supportSQLiteProgram.bindLong(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            supportSQLiteProgram.bindLong(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            supportSQLiteProgram.bindString(i, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            supportSQLiteProgram.bindLong(i, j);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }
}
