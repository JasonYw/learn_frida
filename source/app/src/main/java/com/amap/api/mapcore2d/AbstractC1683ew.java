package com.amap.api.mapcore2d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.ew */
/* loaded from: classes19.dex */
public abstract class AbstractC1683ew {

    /* renamed from: c */
    public int f23566c = 20000;

    /* renamed from: d */
    public int f23567d = 20000;

    /* renamed from: e */
    public Proxy f23568e;

    static {
        Covode.recordClassIndex(5231);
    }

    /* renamed from: a_ */
    public byte[] mo17570a_() {
        return null;
    }

    /* renamed from: f */
    public abstract Map<String, String> mo17322f();

    /* renamed from: g */
    public abstract Map<String, String> mo17321g();

    /* renamed from: h */
    public abstract String mo17320h();

    /* renamed from: m */
    public String mo17317m() {
        return "";
    }

    /* renamed from: o */
    public boolean m17566o() {
        return false;
    }

    /* renamed from: n */
    public boolean m17567n() {
        if (!TextUtils.isEmpty(mo17317m())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public byte[] m17565p() {
        byte[] mo17570a_ = mo17570a_();
        if (mo17570a_ == null || mo17570a_.length == 0) {
            String m17591a = C1676eu.m17591a(mo17321g());
            if (!TextUtils.isEmpty(m17591a)) {
                return C1602db.m17940a(m17591a);
            }
            return mo17570a_;
        }
        return mo17570a_;
    }

    /* renamed from: l */
    public String m17568l() {
        byte[] mo17570a_ = mo17570a_();
        if (mo17570a_ != null && mo17570a_.length != 0) {
            Map<String, String> mo17321g = mo17321g();
            if (mo17321g == null) {
                return mo17320h();
            }
            String m17591a = C1676eu.m17591a(mo17321g);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(mo17320h());
            stringBuffer.append("?");
            stringBuffer.append(m17591a);
            return stringBuffer.toString();
        }
        return mo17320h();
    }

    /* renamed from: a */
    public final void m17572a(int i) {
        this.f23566c = i;
    }

    /* renamed from: b */
    public final void m17569b(int i) {
        this.f23567d = i;
    }

    /* renamed from: a */
    public final void m17571a(Proxy proxy) {
        this.f23568e = proxy;
    }
}
