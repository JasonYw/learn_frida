package com.alipay.sdk.p082m.p108m0;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.p082m.p106l0.C1326f;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.alipay.sdk.m.m0.a */
/* loaded from: classes13.dex */
public class C1332a {

    /* renamed from: a */
    public String f22272a;

    /* renamed from: b */
    public SharedPreferences f22273b;

    /* renamed from: c */
    public SharedPreferences.Editor f22274c = null;

    /* renamed from: d */
    public Context f22275d;

    /* renamed from: e */
    public boolean f22276e;

    static {
        Covode.recordClassIndex(4832);
    }

    /* renamed from: b */
    private void m19086b() {
        SharedPreferences sharedPreferences;
        if (this.f22274c == null && (sharedPreferences = this.f22273b) != null) {
            this.f22274c = sharedPreferences.edit();
        }
    }

    /* renamed from: a */
    public boolean m19089a() {
        boolean z;
        Context context;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f22274c;
        if (editor != null) {
            if (!this.f22276e && this.f22273b != null) {
                editor.putLong("t", currentTimeMillis);
            }
            if (!this.f22274c.commit()) {
                z = false;
                if (this.f22273b != null && (context = this.f22275d) != null) {
                    this.f22273b = G4Y.LIZ(context, this.f22272a, 0);
                }
                return z;
            }
        }
        z = true;
        if (this.f22273b != null) {
            this.f22273b = G4Y.LIZ(context, this.f22272a, 0);
        }
        return z;
    }

    /* renamed from: a */
    public String m19088a(String str) {
        SharedPreferences sharedPreferences = this.f22273b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!C1326f.m19144a(string)) {
                return string;
            }
        }
        return "";
    }

    /* renamed from: b */
    public void m19085b(String str) {
        if (!C1326f.m19144a(str) && !str.equals("t")) {
            m19086b();
            SharedPreferences.Editor editor = this.f22274c;
            if (editor != null) {
                editor.remove(str);
            }
        }
    }

    /* renamed from: a */
    public void m19087a(String str, String str2) {
        if (!C1326f.m19144a(str) && !str.equals("t")) {
            m19086b();
            SharedPreferences.Editor editor = this.f22274c;
            if (editor != null) {
                editor.putString(str, str2);
            }
        }
    }

    public C1332a(Context context, String str, String str2, boolean z, boolean z2) {
        this.f22272a = "";
        this.f22273b = null;
        this.f22275d = null;
        this.f22276e = false;
        this.f22276e = z2;
        this.f22272a = str2;
        this.f22275d = context;
        if (context != null) {
            this.f22273b = G4Y.LIZ(context, str2, 0);
        }
    }
}
