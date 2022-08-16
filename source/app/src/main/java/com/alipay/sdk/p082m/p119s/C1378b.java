package com.alipay.sdk.p082m.p119s;

import android.content.Context;
import com.alipay.sdk.p082m.p107m.C1331b;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.alipay.sdk.m.s.b */
/* loaded from: classes2.dex */
public class C1378b {

    /* renamed from: b */
    public static C1378b f22376b;

    /* renamed from: a */
    public Context f22377a;

    static {
        Covode.recordClassIndex(4878);
    }

    /* renamed from: b */
    public Context m18917b() {
        return this.f22377a;
    }

    /* renamed from: a */
    public C1331b m18919a() {
        return C1331b.m19097b();
    }

    /* renamed from: c */
    public String m18916c() {
        return C1405b.m18749c(null, this.f22377a);
    }

    /* renamed from: d */
    public static C1378b m18915d() {
        if (f22376b == null) {
            f22376b = new C1378b();
        }
        return f22376b;
    }

    /* renamed from: e */
    public static boolean m18914e() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        int i = 0;
        while (!new File(strArr[i]).exists()) {
            i++;
            if (i >= 10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m18918a(Context context) {
        C1331b.m19097b();
        this.f22377a = context.getApplicationContext();
    }
}
