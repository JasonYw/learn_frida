package cn.com.chinatelecom.account.api.p036c;

import android.content.Context;
import android.net.Network;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.c.d */
/* loaded from: classes2.dex */
public final class C0643d extends AbstractRunnableC0653n {

    /* renamed from: a */
    public /* synthetic */ String f20919a;

    /* renamed from: b */
    public /* synthetic */ CtSetting f20920b;

    /* renamed from: c */
    public /* synthetic */ Network f20921c;

    /* renamed from: d */
    public /* synthetic */ String f20922d;

    /* renamed from: e */
    public /* synthetic */ String f20923e;

    /* renamed from: f */
    public /* synthetic */ int f20924f;

    /* renamed from: g */
    public /* synthetic */ ResultListener f20925g;

    /* renamed from: h */
    public /* synthetic */ C0640a f20926h;

    static {
        Covode.recordClassIndex(2694);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643d(C0640a c0640a, long j, String str, CtSetting ctSetting, Network network, String str2, String str3, int i, ResultListener resultListener) {
        super(j);
        this.f20926h = c0640a;
        this.f20919a = str;
        this.f20920b = ctSetting;
        this.f20921c = network;
        this.f20922d = str2;
        this.f20923e = str3;
        this.f20924f = i;
        this.f20925g = resultListener;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: a */
    public final void mo20683a() {
        Context context;
        String str;
        String str2;
        JSONObject m20725a;
        MethodCollector.m14708i(172);
        C0640a c0640a = this.f20926h;
        context = c0640a.f20899c;
        str = this.f20926h.f20900d;
        str2 = this.f20926h.f20901e;
        m20725a = c0640a.m20725a(context, str, str2, this.f20919a, this.f20920b, this.f20921c, this.f20922d, this.f20923e, this.f20924f);
        synchronized (this) {
            try {
                if (!m20696c()) {
                    m20698a(true);
                    m20695d();
                    CtAuth.postResultOnMainThread(this.f20922d, m20725a, this.f20925g);
                }
            } finally {
                MethodCollector.m14707o(172);
            }
        }
        if (this.f20921c != null) {
            C0640a.m20724a(this.f20926h);
        }
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: b */
    public final void mo20697b() {
        MethodCollector.m14708i(173);
        super.mo20697b();
        synchronized (this.f20926h) {
            try {
                this.f20926h.f20898b = true;
            } finally {
                MethodCollector.m14707o(173);
            }
        }
        synchronized (this) {
            try {
                if (!m20696c()) {
                    m20698a(true);
                    C0640a.m20723a(this.f20926h, 80000, C0632d.m20735a(C0676k.f21034a), this.f20922d, 0L, "", this.f20925g);
                }
            } finally {
                MethodCollector.m14707o(173);
            }
        }
        if (this.f20921c != null) {
            C0640a.m20724a(this.f20926h);
        }
    }
}
