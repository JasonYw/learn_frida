package cn.com.chinatelecom.account.api.p037d;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n;
import cn.com.chinatelecom.account.api.p038e.C0667b;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0670e;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: cn.com.chinatelecom.account.api.d.d */
/* loaded from: classes2.dex */
public final class C0659d extends AbstractRunnableC0653n {

    /* renamed from: a */
    public /* synthetic */ Context f20960a;

    static {
        Covode.recordClassIndex(2710);
    }

    public C0659d(Context context) {
        this.f20960a = context;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: a */
    public final void mo20683a() {
        String m20684b;
        C0670e m20603a;
        String m20735a;
        long j;
        MethodCollector.m14708i(180);
        try {
            String m20638a = C0669d.m20638a();
            String m20637a = C0669d.m20637a(this.f20960a);
            C0670e m20603a2 = C0671f.m20603a(m20638a);
            m20603a2.m20615a(m20637a);
            m20603a2.m20610c("dns");
            m20603a2.m20611b(C0673h.m20590e(this.f20960a));
            String m20735a2 = C0632d.m20735a(C0667b.f20991b);
            m20684b = C0658c.m20684b(m20735a2, m20638a, 0);
            if (TextUtils.isEmpty(m20684b)) {
                m20684b = C0658c.m20684b(m20735a2, m20638a, 1);
            }
            synchronized (C0658c.class) {
                if (!TextUtils.isEmpty(m20684b)) {
                    String unused = C0658c.f20957a = m20684b;
                    long currentTimeMillis = System.currentTimeMillis();
                    j = C0658c.f20959c;
                    long unused2 = C0658c.f20958b = currentTimeMillis + j;
                    m20603a = C0671f.m20603a(m20638a);
                    m20603a.m20617a(0);
                    m20735a = "success";
                } else {
                    m20603a = C0671f.m20603a(m20638a);
                    m20603a.m20617a(80011);
                    m20735a = C0632d.m20735a(C0676k.f21043j);
                }
                m20603a.m20608e(m20735a);
            }
            C0671f.m20601b(m20638a);
            MethodCollector.m14707o(180);
        } catch (Throwable th) {
            th.printStackTrace();
            MethodCollector.m14707o(180);
        }
    }
}
