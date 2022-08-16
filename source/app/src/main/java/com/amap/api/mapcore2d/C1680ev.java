package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.net.Proxy;

/* renamed from: com.amap.api.mapcore2d.ev */
/* loaded from: classes19.dex */
public class C1680ev extends C1671er {

    /* renamed from: c */
    public static C1680ev f23560c;

    /* renamed from: d */
    public C1717fw f23561d;

    /* renamed from: e */
    public Handler f23562e;

    static {
        Covode.recordClassIndex(5228);
    }

    /* renamed from: com.amap.api.mapcore2d.ev$a */
    /* loaded from: classes19.dex */
    public static class HandlerC1682a extends Handler {
        static {
            Covode.recordClassIndex(5230);
        }

        public HandlerC1682a() {
        }

        public HandlerC1682a(Looper looper) {
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
                    C1686ez c1686ez = (C1686ez) message.obj;
                    c1686ez.f23574b.m17563a(c1686ez.f23573a);
                    return;
                }
                ((C1686ez) message.obj).f23574b.m17564a();
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ HandlerC1682a(Looper looper, C16811 c16811) {
            this(looper);
        }
    }

    /* renamed from: com.amap.api.mapcore2d.ev$1 */
    /* loaded from: classes19.dex */
    public class C16811 extends AbstractRunnableC1719fx {

        /* renamed from: a */
        public final /* synthetic */ AbstractC1683ew f23563a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1684ex f23564b;

        /* renamed from: c */
        public final /* synthetic */ C1680ev f23565c;

        static {
            Covode.recordClassIndex(5229);
        }

        @Override // com.amap.api.mapcore2d.AbstractRunnableC1719fx
        /* renamed from: a */
        public void mo17500a() {
            try {
                this.f23565c.m17579a(this.f23565c.m17575b(this.f23563a, false), this.f23564b);
            } catch (C1572cp e) {
                this.f23565c.m17582a(e, this.f23564b);
            }
        }
    }

    /* renamed from: a */
    public static C1680ev m17578a(boolean z) {
        return m17577a(z, 5);
    }

    /* renamed from: d */
    public byte[] m17574d(AbstractC1683ew abstractC1683ew) {
        try {
            C1685ey m17575b = m17575b(abstractC1683ew, false);
            if (m17575b != null) {
                return m17575b.f23569a;
            }
            return null;
        } catch (C1572cp e) {
            throw e;
        }
    }

    /* renamed from: e */
    public byte[] m17573e(AbstractC1683ew abstractC1683ew) {
        try {
            C1685ey m17575b = m17575b(abstractC1683ew, true);
            if (m17575b != null) {
                return m17575b.f23569a;
            }
            return null;
        } catch (C1572cp e) {
            throw e;
        }
    }

    @Override // com.amap.api.mapcore2d.C1671er
    /* renamed from: b */
    public byte[] mo17576b(AbstractC1683ew abstractC1683ew) {
        try {
            C1685ey m17613a = m17613a(abstractC1683ew, false);
            if (m17613a != null) {
                return m17613a.f23569a;
            }
            return null;
        } catch (C1572cp e) {
            throw e;
        } catch (Throwable th) {
            C1616do.m17864e().m17868b(th, "NetManager", "makeSyncPostRequest");
            throw new C1572cp("未知的错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17582a(C1572cp c1572cp, AbstractC1684ex abstractC1684ex) {
        C1686ez c1686ez = new C1686ez();
        c1686ez.f23573a = c1572cp;
        c1686ez.f23574b = abstractC1684ex;
        Message obtain = Message.obtain();
        obtain.obj = c1686ez;
        obtain.what = 1;
        this.f23562e.sendMessage(obtain);
    }

    public C1680ev(boolean z, int i) {
        if (z) {
            try {
                this.f23561d = C1717fw.m17503a(i);
            } catch (Throwable th) {
                C1616do.m17866c(th, "NetManger", "NetManger1");
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.f23562e = new HandlerC1682a(Looper.getMainLooper(), null);
        } else {
            this.f23562e = new HandlerC1682a();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x001f -> B:7:0x001f). Please submit an issue!!! */
    /* renamed from: a */
    public static synchronized C1680ev m17577a(boolean z, int i) {
        C1680ev c1680ev;
        synchronized (C1680ev.class) {
            try {
                if (f23560c == null) {
                    f23560c = new C1680ev(z, i);
                } else if (z && f23560c.f23561d == null) {
                    f23560c.f23561d = C1717fw.m17503a(i);
                }
            } catch (Throwable unused) {
            }
            c1680ev = f23560c;
        }
        return c1680ev;
    }

    /* renamed from: b */
    public C1685ey m17575b(AbstractC1683ew abstractC1683ew, boolean z) {
        Proxy proxy;
        try {
            m17612c(abstractC1683ew);
            if (abstractC1683ew.f23568e == null) {
                proxy = null;
            } else {
                proxy = abstractC1683ew.f23568e;
            }
            return new C1676eu(abstractC1683ew.f23566c, abstractC1683ew.f23567d, proxy, z).m17596a(abstractC1683ew.mo17320h(), abstractC1683ew.m17567n(), abstractC1683ew.mo17317m(), abstractC1683ew.mo17322f(), abstractC1683ew.mo17321g(), abstractC1683ew.m17566o());
        } catch (C1572cp e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17579a(C1685ey c1685ey, AbstractC1684ex abstractC1684ex) {
        abstractC1684ex.m17562a(c1685ey.f23570b, c1685ey.f23569a);
        C1686ez c1686ez = new C1686ez();
        c1686ez.f23574b = abstractC1684ex;
        Message obtain = Message.obtain();
        obtain.obj = c1686ez;
        obtain.what = 0;
        this.f23562e.sendMessage(obtain);
    }
}
