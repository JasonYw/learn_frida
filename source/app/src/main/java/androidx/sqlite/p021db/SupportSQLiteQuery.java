package androidx.sqlite.p021db;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.sqlite.db.SupportSQLiteQuery */
/* loaded from: classes13.dex */
public interface SupportSQLiteQuery {
    static {
        Covode.recordClassIndex(1894);
    }

    void bindTo(SupportSQLiteProgram supportSQLiteProgram);

    int getArgCount();

    String getSql();
}
