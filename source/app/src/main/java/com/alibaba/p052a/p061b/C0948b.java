package com.alibaba.p052a.p061b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.p052a.p061b.p065d.C0961c;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import com.p3039ut.mini.UTAnalytics;
import com.p3039ut.mini.core.appstatus.UTMCAppStatusRegHelper;
import com.p3039ut.mini.core.sign.IUTRequestAuthentication;
import com.p3039ut.mini.internal.UTOriginalCustomHitBuilder;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import p003X.G4Y;

/* renamed from: com.alibaba.a.b.b */
/* loaded from: classes13.dex */
public class C0948b {

    /* renamed from: a */
    public static C0948b f21310a = new C0948b();

    /* renamed from: b */
    public Context f21311b;

    /* renamed from: c */
    public String f21312c;

    /* renamed from: d */
    public String f21313d;

    /* renamed from: e */
    public String f21314e;

    /* renamed from: f */
    public String f21315f;

    /* renamed from: g */
    public Application f21316g;

    /* renamed from: h */
    public String f21317h;

    /* renamed from: i */
    public IUTRequestAuthentication f21318i;

    /* renamed from: j */
    public boolean f21319j;

    /* renamed from: k */
    public boolean f21320k;

    static {
        Covode.recordClassIndex(4258);
    }

    /* renamed from: a */
    public static C0948b m20202a() {
        return f21310a;
    }

    /* renamed from: b */
    private void m20196b(String str) {
        Context context;
        this.f21312c = str;
        if (!TextUtils.isEmpty(str)) {
            this.f21313d = str;
        }
        if (TextUtils.isEmpty(str) || (context = this.f21311b) == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, "UTCommon", 0).edit();
            edit.putString("_lun", new String(C0961c.m20128c(str.getBytes(C34037f.f43302f), 2)));
            edit.commit();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m20194c(String str) {
        Context context;
        this.f21314e = str;
        if (!TextUtils.isEmpty(str)) {
            this.f21315f = str;
        }
        if (TextUtils.isEmpty(str) || (context = this.f21311b) == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, "UTCommon", 0).edit();
            edit.putString("_luid", new String(C0961c.m20128c(str.getBytes(C34037f.f43302f), 2)));
            edit.commit();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m20191f() {
        if (!this.f21319j) {
            int i = Build.VERSION.SDK_INT;
            try {
                if (m20202a().m20192e() != null) {
                    UTMCAppStatusRegHelper.registeActivityLifecycleCallbacks(m20202a().m20192e());
                    this.f21319j = true;
                    return;
                }
                UTMCAppStatusRegHelper.registeActivityLifecycleCallbacks((Application) m20202a().m20193d().getApplicationContext());
                this.f21319j = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m20201a(Application application) {
        this.f21316g = application;
        m20191f();
    }

    /* renamed from: a */
    public void m20200a(Context context) {
        if (context != null) {
            this.f21311b = context;
            SharedPreferences LIZ = G4Y.LIZ(this.f21311b, "UTCommon", 0);
            String string = LIZ.getString("_lun", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f21313d = new String(C0961c.m20132a(string.getBytes(), 2), C34037f.f43302f);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String string2 = LIZ.getString("_luid", "");
            if (!TextUtils.isEmpty(string2)) {
                try {
                    this.f21315f = new String(C0961c.m20132a(string2.getBytes(), 2), C34037f.f43302f);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        }
        m20191f();
    }

    /* renamed from: a */
    public void m20199a(String str) {
        this.f21317h = str;
    }

    /* renamed from: a */
    public void m20198a(String str, String str2) {
        m20196b(str);
        m20194c(str2);
        if (!TextUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("UT", 1007, str, str2, null, null).build());
        }
    }

    /* renamed from: b */
    public String m20197b() {
        return this.f21317h;
    }

    /* renamed from: c */
    public void m20195c() {
        C0974i.m20096a(true);
    }

    /* renamed from: d */
    public Context m20193d() {
        return this.f21311b;
    }

    /* renamed from: e */
    public Application m20192e() {
        return this.f21316g;
    }
}
