package androidx.sqlite.p021db;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: androidx.sqlite.db.SupportSQLiteProgram */
/* loaded from: classes13.dex */
public interface SupportSQLiteProgram extends Closeable {
    static {
        Covode.recordClassIndex(1893);
    }

    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);

    void clearBindings();
}
