package cn.com.chinatelecom.account.api.p036c;

import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.o */
/* loaded from: classes2.dex */
public final class RunnableC0654o implements Runnable {

    /* renamed from: a */
    public AbstractRunnableC0653n f20950a;

    static {
        Covode.recordClassIndex(2705);
    }

    public RunnableC0654o(AbstractRunnableC0653n abstractRunnableC0653n) {
        this.f20950a = abstractRunnableC0653n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractRunnableC0653n abstractRunnableC0653n = this.f20950a;
        if (abstractRunnableC0653n != null) {
            abstractRunnableC0653n.mo20697b();
        }
    }
}
