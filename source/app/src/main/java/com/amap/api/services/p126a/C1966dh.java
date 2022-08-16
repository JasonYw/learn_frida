package com.amap.api.services.p126a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.net.Proxy;

/* renamed from: com.amap.api.services.a.dh */
/* loaded from: classes19.dex */
public class C1966dh extends C1957dd {

    /* renamed from: c */
    public static C1966dh f24748c;

    /* renamed from: d */
    public C1999eh f24749d;

    /* renamed from: e */
    public Handler f24750e;

    static {
        Covode.recordClassIndex(5577);
    }

    /* renamed from: com.amap.api.services.a.dh$a */
    /* loaded from: classes19.dex */
    public static class HandlerC1968a extends Handler {
        static {
            Covode.recordClassIndex(5579);
        }

        public HandlerC1968a() {
        }

        public HandlerC1968a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    C1972dl c1972dl = (C1972dl) message.obj;
                    c1972dl.f24762b.m16442a(c1972dl.f24761a);
                    return;
                }
                ((C1972dl) message.obj).f24762b.m16443a();
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ HandlerC1968a(Looper looper, C19671 c19671) {
            this(looper);
        }
    }

    /* renamed from: com.amap.api.services.a.dh$1 */
    /* loaded from: classes19.dex */
    public class C19671 extends AbstractRunnableC2001ei {

        /* renamed from: a */
        public final /* synthetic */ AbstractC1969di f24751a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1970dj f24752b;

        /* renamed from: c */
        public final /* synthetic */ C1966dh f24753c;

        static {
            Covode.recordClassIndex(5578);
        }

        @Override // com.amap.api.services.p126a.AbstractRunnableC2001ei
        /* renamed from: a */
        public void mo16393a() {
            try {
                this.f24753c.m16460a(this.f24753c.m16456b(this.f24751a, false), this.f24752b);
            } catch (C1863be e) {
                this.f24753c.m16463a(e, this.f24752b);
            }
        }
    }

    /* renamed from: a */
    public static C1966dh m16459a(boolean z) {
        return m16458a(z, 5);
    }

    /* renamed from: d */
    public byte[] m16455d(AbstractC1969di abstractC1969di) {
        try {
            C1971dk m16456b = m16456b(abstractC1969di, false);
            if (m16456b != null) {
                return m16456b.f24757a;
            }
            return null;
        } catch (C1863be e) {
            throw e;
        }
    }

    /* renamed from: e */
    public byte[] m16454e(AbstractC1969di abstractC1969di) {
        try {
            C1971dk m16456b = m16456b(abstractC1969di, true);
            if (m16456b != null) {
                return m16456b.f24757a;
            }
            return null;
        } catch (C1863be e) {
            throw e;
        }
    }

    @Override // com.amap.api.services.p126a.C1957dd
    /* renamed from: b */
    public byte[] mo16457b(AbstractC1969di abstractC1969di) {
        try {
            C1971dk m16501a = m16501a(abstractC1969di, false);
            if (m16501a != null) {
                return m16501a.f24757a;
            }
            return null;
        } catch (C1863be e) {
            throw e;
        } catch (Throwable th) {
            C1906cb.m16715d().m16718b(th, "NetManager", "makeSyncPostRequest");
            throw new C1863be("未知的错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16463a(C1863be c1863be, AbstractC1970dj abstractC1970dj) {
        C1972dl c1972dl = new C1972dl();
        c1972dl.f24761a = c1863be;
        c1972dl.f24762b = abstractC1970dj;
        Message obtain = Message.obtain();
        obtain.obj = c1972dl;
        obtain.what = 1;
        this.f24750e.sendMessage(obtain);
    }

    public C1966dh(boolean z, int i) {
        if (z) {
            try {
                this.f24749d = C1999eh.m16396a(i);
            } catch (Throwable th) {
                C1906cb.m16716c(th, "NetManger", "NetManger1");
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.f24750e = new HandlerC1968a(Looper.getMainLooper(), null);
        } else {
            this.f24750e = new HandlerC1968a();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x001f -> B:7:0x001f). Please submit an issue!!! */
    /* renamed from: a */
    public static synchronized C1966dh m16458a(boolean z, int i) {
        C1966dh c1966dh;
        synchronized (C1966dh.class) {
            try {
                if (f24748c == null) {
                    f24748c = new C1966dh(z, i);
                } else if (z && f24748c.f24749d == null) {
                    f24748c.f24749d = C1999eh.m16396a(i);
                }
            } catch (Throwable unused) {
            }
            c1966dh = f24748c;
        }
        return c1966dh;
    }

    /* renamed from: b */
    public C1971dk m16456b(AbstractC1969di abstractC1969di, boolean z) {
        Proxy proxy;
        try {
            m16500c(abstractC1969di);
            if (abstractC1969di.f24756h == null) {
                proxy = null;
            } else {
                proxy = abstractC1969di.f24756h;
            }
            return new C1962dg(abstractC1969di.f24754f, abstractC1969di.f24755g, proxy, z).m16478a(abstractC1969di.mo16250i(), abstractC1969di.m16446o(), abstractC1969di.m16447n(), abstractC1969di.mo16388e(), abstractC1969di.mo16450d(), abstractC1969di.m16445p());
        } catch (C1863be e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16460a(C1971dk c1971dk, AbstractC1970dj abstractC1970dj) {
        abstractC1970dj.m16441a(c1971dk.f24758b, c1971dk.f24757a);
        C1972dl c1972dl = new C1972dl();
        c1972dl.f24762b = abstractC1970dj;
        Message obtain = Message.obtain();
        obtain.obj = c1972dl;
        obtain.what = 0;
        this.f24750e.sendMessage(obtain);
    }
}
