package cn.com.chinatelecom.account.api.p036c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.i */
/* loaded from: classes2.dex */
public final class C0648i extends AbstractRunnableC0653n {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0644e f20937a;

    /* renamed from: b */
    public /* synthetic */ String f20938b;

    /* renamed from: c */
    public /* synthetic */ C0645f f20939c;

    static {
        Covode.recordClassIndex(2699);
    }

    public C0648i(C0645f c0645f, String str, AbstractC0644e abstractC0644e) {
        this.f20939c = c0645f;
        this.f20938b = str;
        this.f20937a = abstractC0644e;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractRunnableC0653n
    /* renamed from: a */
    public final void mo20683a() {
        int m20700c;
        Handler handler;
        Handler handler2;
        long currentTimeMillis = System.currentTimeMillis();
        m20700c = this.f20939c.m20700c(this.f20938b);
        if (m20700c == 0) {
            this.f20937a.mo20711a(null, System.currentTimeMillis() - currentTimeMillis);
        } else if (m20700c == -1) {
            handler2 = C0645f.f20928b;
            handler2.post(new RunnableC0649j(this, currentTimeMillis));
        } else {
            handler = C0645f.f20928b;
            handler.post(new RunnableC0650k(this));
        }
    }
}
