package com.alipay.sdk.p082m.p086b0;

import android.os.Environment;
import com.bytedance.covode.number.Covode;
import java.io.File;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.b0.c */
/* loaded from: classes2.dex */
public final class C1230c {
    static {
        Covode.recordClassIndex(4730);
    }

    /* renamed from: a */
    public static String m19350a(String str) {
        try {
            if (!m19351a()) {
                return null;
            }
            File file = new File(C116971W2r.LIZIZ().getAbsolutePath(), str);
            if (!file.exists()) {
                return null;
            }
            C116971W2r.LIZ(file);
            return "";
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m19351a() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && C116971W2r.LIZIZ() != null;
    }
}
