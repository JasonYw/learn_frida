package cn.com.chinatelecom.account.api.p035b;

import android.content.Context;
import android.net.Network;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.b.e */
/* loaded from: classes2.dex */
public final class C0638e extends AbstractRunnableC0653n {

    /* renamed from: a */
    public /* synthetic */ Context f20889a;

    /* renamed from: b */
    public /* synthetic */ String f20890b;

    /* renamed from: c */
    public /* synthetic */ String f20891c;

    /* renamed from: d */
    public /* synthetic */ Network f20892d;

    /* renamed from: e */
    public /* synthetic */ String f20893e;

    /* renamed from: f */
    public /* synthetic */ String f20894f;

    /* renamed from: g */
    public /* synthetic */ AbstractC0634a f20895g;

    /* renamed from: h */
    public /* synthetic */ C0635b f20896h;

    static {
        Covode.recordClassIndex(2689);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638e(C0635b c0635b, long j, Context context, String str, String str2, Network network, String str3, String str4, AbstractC0634a abstractC0634a) {
        super(j);
        this.f20896h = c0635b;
        this.f20889a = context;
        this.f20890b = str;
        this.f20891c = str2;
        this.f20892d = network;
        this.f20893e = str3;
        this.f20894f = str4;
        this.f20895g = abstractC0634a;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: a */
    public final void mo20683a() {
        JSONObject m20733a;
        MethodCollector.m14708i(170);
        C0635b c0635b = this.f20896h;
        m20733a = C0635b.m20733a(this.f20889a, this.f20890b, this.f20891c, this.f20892d, this.f20893e, this.f20894f);
        synchronized (this) {
            try {
                if (!m20696c()) {
                    m20698a(true);
                    m20695d();
                    if (this.f20895g != null) {
                        try {
                            m20733a.put("reqId", this.f20893e);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        this.f20895g.callbackPreCode(m20733a.toString());
                    }
                    C0671f.m20599c(this.f20893e);
                }
            } finally {
                MethodCollector.m14707o(170);
            }
        }
        if (this.f20892d != null) {
            C0635b.m20732a(this.f20896h);
        }
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: b */
    public final void mo20697b() {
        MethodCollector.m14708i(171);
        super.mo20697b();
        synchronized (this) {
            try {
                if (!m20696c()) {
                    m20698a(true);
                    C0635b.m20731a(this.f20896h, 80000, C0632d.m20735a(C0676k.f21034a), this.f20893e, 0L, "", this.f20895g);
                }
            } finally {
                MethodCollector.m14707o(171);
            }
        }
        if (this.f20892d != null) {
            C0635b.m20732a(this.f20896h);
        }
    }
}
