package androidx.sqlite.p021db;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.sqlite.db.SupportSQLiteStatement */
/* loaded from: classes13.dex */
public interface SupportSQLiteStatement extends SupportSQLiteProgram {
    static {
        Covode.recordClassIndex(1895);
    }

    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    String simpleQueryForString();
}
