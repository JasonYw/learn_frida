package cn.com.chinatelecom.account.api.p038e;

import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.e.m */
/* loaded from: classes2.dex */
public class C0678m {

    /* renamed from: a */
    public static byte[] f21047a = {68, 64, 94, 49, 69, 35, 50, 83};

    static {
        Covode.recordClassIndex(2729);
        C0678m.class.getSimpleName();
    }

    /* renamed from: a */
    public static String m20564a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = bArr[i];
                for (byte b : f21047a) {
                    bArr2[i] = (byte) (b ^ bArr2[i]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
