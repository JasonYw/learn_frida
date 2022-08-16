package cn.com.chinatelecom.account.api.p036c;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import cn.com.chinatelecom.account.api.C0665e;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p037d.C0657b;
import cn.com.chinatelecom.account.api.p037d.C0658c;
import cn.com.chinatelecom.account.api.p037d.C0663h;
import cn.com.chinatelecom.account.api.p038e.C0666a;
import cn.com.chinatelecom.account.api.p038e.C0667b;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0670e;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import cn.com.chinatelecom.account.api.p038e.C0674i;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: cn.com.chinatelecom.account.api.c.a */
/* loaded from: classes2.dex */
public final class C0640a {

    /* renamed from: a */
    public static final String f20897a = C0640a.class.getSimpleName();

    /* renamed from: b */
    public boolean f20898b;

    /* renamed from: c */
    public Context f20899c;

    /* renamed from: d */
    public String f20900d;

    /* renamed from: e */
    public String f20901e;

    /* renamed from: f */
    public C0645f f20902f;

    static {
        Covode.recordClassIndex(2691);
    }

    public C0640a(Context context, String str, String str2) {
        this.f20899c = context;
        this.f20900d = str;
        this.f20901e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m20725a(Context context, String str, String str2, String str3, CtSetting ctSetting, Network network, String str4, String str5, int i) {
        String m20580b;
        String m20579b;
        try {
            long m20656a = C0666a.m20656a(context);
            if (i == C0665e.f20988a) {
                m20580b = C0674i.m20584a();
                m20579b = C0674i.m20582a(context, str, str2, str3, m20656a, "");
            } else {
                m20580b = C0674i.m20580b();
                m20579b = C0674i.m20579b(context, str, str2, str3, m20656a, "");
            }
            if (C0673h.m20598a() != null) {
                m20580b = m20580b.replace(C0632d.m20735a(C0667b.f20991b), C0673h.m20598a());
            }
            JSONObject jSONObject = new JSONObject(m20579b);
            String optString = jSONObject.optString("p");
            String optString2 = jSONObject.optString("k");
            C0663h c0663h = new C0663h();
            c0663h.m20671a(str5);
            c0663h.m20669a(false, C0658c.m20691a(), C0632d.m20735a(C0667b.f20991b));
            c0663h.m20666b(str4);
            c0663h.m20673a(network);
            c0663h.m20674a(CtSetting.getConnTimeout(ctSetting));
            c0663h.m20668b(CtSetting.getReadTimeout(ctSetting));
            JSONObject m20654a = C0666a.m20654a(context, new C0657b(context).mo20682a(m20580b, optString, 1, c0663h.m20675a()), optString2, network, true, str4);
            C0671f.m20600b(str4, m20654a, optString);
            return m20654a;
        } catch (Throwable th) {
            JSONObject m20569g = C0676k.m20569g();
            C0670e m20603a = C0671f.m20603a(str4);
            m20603a.m20606g(C0002O.m25086C("gpm ：", th.getMessage()));
            m20603a.m20617a(80102);
            m20603a.m20608e(C0632d.m20735a(C0676k.f21040g));
            CtAuth.warn(f20897a, "GPM Throwable", th);
            return m20569g;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m20724a(C0640a c0640a) {
        C0645f c0645f = c0640a.f20902f;
        if (c0645f != null) {
            c0645f.m20710a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m20723a(C0640a c0640a, int i, String str, String str2, long j, String str3, ResultListener resultListener) {
        C0670e m20603a = C0671f.m20603a(str2);
        m20603a.m20617a(i);
        m20603a.m20608e(str);
        m20603a.m20616a(j);
        m20603a.m20606g(str3);
        C0671f.m20599c(str2);
        String m20576a = C0676k.m20576a(i, str, str2);
        if (resultListener != null) {
            resultListener.onResult(m20576a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m20718a(String str, CtSetting ctSetting, Network network, ResultListener resultListener, long j, String str2, String str3, int i) {
        new C0651l().execute(new C0643d(this, j, str, ctSetting, network, str2, str3, i, resultListener));
    }

    /* renamed from: a */
    public final void m20719a(String str, CtSetting ctSetting, int i, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String m20638a = C0669d.m20638a();
        String m20637a = C0669d.m20637a(this.f20899c);
        String m20657a = C0666a.m20657a(i);
        C0670e m20603a = C0671f.m20603a(m20638a);
        m20603a.m20615a(m20637a);
        m20603a.m20610c(m20657a);
        m20603a.m20611b(C0673h.m20591d(this.f20899c));
        m20603a.m20607f(C0673h.m20587h(this.f20899c));
        m20718a(str, ctSetting, null, resultListener, totalTimeout, m20638a, m20657a, i);
    }

    /* renamed from: b */
    public final void m20716b(String str, CtSetting ctSetting, int i, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String m20638a = C0669d.m20638a();
        String m20637a = C0669d.m20637a(this.f20899c);
        String m20657a = C0666a.m20657a(i);
        C0670e m20603a = C0671f.m20603a(m20638a);
        m20603a.m20615a(m20637a);
        m20603a.m20610c(m20657a);
        m20603a.m20611b("BOTH");
        m20603a.m20607f(C0673h.m20587h(this.f20899c));
        int i2 = Build.VERSION.SDK_INT;
        this.f20902f = new C0645f(this.f20899c);
        this.f20902f.m20709a(new C0641b(this, totalTimeout, str, ctSetting, resultListener, m20638a, m20657a, i));
    }
}
