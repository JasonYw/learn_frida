package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p003X.C116971W2r;

/* renamed from: com.amap.api.services.a.db */
/* loaded from: classes8.dex */
public final class C1955db {

    /* renamed from: a */
    public static final Charset f24722a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f24723b = Charset.forName(C34037f.f43302f);

    static {
        Covode.recordClassIndex(5566);
    }

    /* renamed from: a */
    public static void m16505a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16504a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m16504a(file2);
                }
                if (!C116971W2r.LIZ(file2)) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
