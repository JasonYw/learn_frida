package cn.com.chinatelecom.account.api.p034a;

import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.nio.charset.Charset;

/* renamed from: cn.com.chinatelecom.account.api.a.d */
/* loaded from: classes26.dex */
public class C0632d {

    /* renamed from: a */
    public static byte[] f20865a = {68, 64, 94, 49, 50, 83};

    static {
        Covode.recordClassIndex(2683);
        C0632d.class.getSimpleName();
        Charset.forName(C34037f.f43302f);
    }

    /* renamed from: a */
    public static String m20735a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = bArr[i];
                for (byte b : f20865a) {
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
