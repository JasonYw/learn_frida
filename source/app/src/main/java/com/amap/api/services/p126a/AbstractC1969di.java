package com.amap.api.services.p126a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.util.Map;

/* renamed from: com.amap.api.services.a.di */
/* loaded from: classes19.dex */
public abstract class AbstractC1969di {

    /* renamed from: f */
    public int f24754f = 20000;

    /* renamed from: g */
    public int f24755g = 20000;

    /* renamed from: h */
    public Proxy f24756h;

    static {
        Covode.recordClassIndex(5580);
    }

    /* renamed from: d */
    public abstract Map<String, String> mo16450d();

    /* renamed from: e */
    public abstract Map<String, String> mo16388e();

    /* renamed from: h */
    public byte[] mo16449h() {
        return null;
    }

    /* renamed from: i */
    public abstract String mo16250i();

    /* renamed from: n */
    public String m16447n() {
        return "";
    }

    /* renamed from: p */
    public boolean m16445p() {
        return false;
    }

    /* renamed from: o */
    public boolean m16446o() {
        if (!TextUtils.isEmpty(m16447n())) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public byte[] m16444q() {
        byte[] mo16449h = mo16449h();
        if (mo16449h == null || mo16449h.length == 0) {
            String m16472a = C1962dg.m16472a(mo16450d());
            if (!TextUtils.isEmpty(m16472a)) {
                return C1892bp.m16786a(m16472a);
            }
            return mo16449h;
        }
        return mo16449h;
    }

    /* renamed from: m */
    public String m16448m() {
        byte[] mo16449h = mo16449h();
        if (mo16449h != null && mo16449h.length != 0) {
            Map<String, String> mo16450d = mo16450d();
            if (mo16450d == null) {
                return mo16250i();
            }
            String m16472a = C1962dg.m16472a(mo16450d);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(mo16250i());
            stringBuffer.append("?");
            stringBuffer.append(m16472a);
            return stringBuffer.toString();
        }
        return mo16250i();
    }

    /* renamed from: a */
    public final void m16453a(int i) {
        this.f24754f = i;
    }

    /* renamed from: b */
    public final void m16451b(int i) {
        this.f24755g = i;
    }

    /* renamed from: a */
    public final void m16452a(Proxy proxy) {
        this.f24756h = proxy;
    }
}
