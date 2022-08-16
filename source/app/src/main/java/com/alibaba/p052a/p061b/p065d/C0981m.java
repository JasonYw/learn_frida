package com.alibaba.p052a.p061b.p065d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import p003X.G4Y;

/* renamed from: com.alibaba.a.b.d.m */
/* loaded from: classes13.dex */
public class C0981m {

    /* renamed from: a */
    public static final Random f21417a = new Random();

    static {
        Covode.recordClassIndex(4291);
    }

    /* renamed from: a */
    public static final String m20079a() {
        int nanoTime = (int) System.nanoTime();
        int nextInt = f21417a.nextInt();
        int nextInt2 = f21417a.nextInt();
        byte[] m20112a = C0968f.m20112a((int) (System.currentTimeMillis() / 1000));
        byte[] m20112a2 = C0968f.m20112a(nanoTime);
        byte[] m20112a3 = C0968f.m20112a(nextInt);
        byte[] m20112a4 = C0968f.m20112a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(m20112a, 0, bArr, 0, 4);
        System.arraycopy(m20112a2, 0, bArr, 4, 4);
        System.arraycopy(m20112a3, 0, bArr, 8, 4);
        System.arraycopy(m20112a4, 0, bArr, 12, 4);
        return C0961c.m20130b(bArr, 2);
    }

    /* renamed from: a */
    public static String m20078a(Context context) {
        if (context != null) {
            try {
                String string = G4Y.LIZ(context, "UTCommon", 0).getString("_ie", "");
                if (!TextUtils.isEmpty(string)) {
                    String str = new String(C0961c.m20132a(string.getBytes(), 2), C34037f.f43302f);
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str2 = m20079a();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = G4Y.LIZ(context, "UTCommon", 0).edit();
                edit.putString("_ie", new String(C0961c.m20128c(str2.getBytes(C34037f.f43302f), 2)));
                edit.commit();
                return str2;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static String m20077b(Context context) {
        if (context != null) {
            try {
                String string = G4Y.LIZ(context, "UTCommon", 0).getString("_is", "");
                if (!TextUtils.isEmpty(string)) {
                    String str = new String(C0961c.m20132a(string.getBytes(), 2), C34037f.f43302f);
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str2 = m20079a();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = G4Y.LIZ(context, "UTCommon", 0).edit();
                edit.putString("_is", new String(C0961c.m20128c(str2.getBytes(C34037f.f43302f), 2)));
                edit.commit();
                return str2;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str2;
    }
}
