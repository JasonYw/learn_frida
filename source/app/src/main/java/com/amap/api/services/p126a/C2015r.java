package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.r */
/* loaded from: classes19.dex */
public class C2015r {

    /* renamed from: a */
    public static C1889bo f24828a;

    /* renamed from: b */
    public static C2015r f24829b;

    /* renamed from: c */
    public static Context f24830c;

    /* renamed from: d */
    public HandlerC2017a f24831d;

    /* renamed from: e */
    public HandlerThread f24832e = new HandlerThread("manifestThread") { // from class: com.amap.api.services.a.r.1
        static {
            Covode.recordClassIndex(5627);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
            java.lang.Thread.sleep(10000);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
            if (r10.f24833a.f24831d == null) goto L24;
         */
        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r10 = this;
                java.lang.String r6 = "run"
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r0 = "ManifestConfigThread"
                r1.setName(r0)
                android.os.Message r2 = new android.os.Message
                r2.<init>()
                r5 = 3
                android.content.Context r3 = com.amap.api.services.p126a.C2015r.m16284a()     // Catch: java.lang.Throwable -> L92
                r9 = 0
                com.amap.api.services.a.bo r1 = com.amap.api.services.p126a.C2006i.m16379a(r9)     // Catch: java.lang.Throwable -> L92
                java.lang.String r0 = "11K;001"
                r4 = 0
                com.amap.api.services.a.bg$a r8 = com.amap.api.services.p126a.C1865bg.m16956a(r3, r1, r0, r4)     // Catch: java.lang.Throwable -> L92
                if (r8 == 0) goto La3
                com.amap.api.services.a.bg$a$a r0 = r8.f24431x     // Catch: java.lang.Throwable -> L92
                if (r0 == 0) goto L36
                com.amap.api.services.a.s r3 = new com.amap.api.services.a.s     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.bg$a$a r0 = r8.f24431x     // Catch: java.lang.Throwable -> L92
                boolean r1 = r0.f24435b     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.bg$a$a r0 = r8.f24431x     // Catch: java.lang.Throwable -> L92
                boolean r0 = r0.f24434a     // Catch: java.lang.Throwable -> L92
                r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L92
                r2.obj = r3     // Catch: java.lang.Throwable -> L92
            L36:
                com.amap.api.services.a.bg$a$d r0 = r8.f24432y     // Catch: java.lang.Throwable -> L92
                if (r0 == 0) goto La3
                com.amap.api.services.a.bg$a$d r0 = r8.f24432y     // Catch: java.lang.Throwable -> L92
                if (r0 == 0) goto L81
                java.lang.String r7 = r0.f24445b     // Catch: java.lang.Throwable -> L92
                java.lang.String r3 = r0.f24444a     // Catch: java.lang.Throwable -> L92
                java.lang.String r1 = r0.f24446c     // Catch: java.lang.Throwable -> L92
                boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L70
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L70
                boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L70
                com.amap.api.services.a.cm r4 = new com.amap.api.services.a.cm     // Catch: java.lang.Throwable -> L92
                boolean r0 = r8.m16943a()     // Catch: java.lang.Throwable -> L92
                r4.<init>(r3, r7, r1, r0)     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.cl r3 = new com.amap.api.services.a.cl     // Catch: java.lang.Throwable -> L92
                android.content.Context r1 = com.amap.api.services.p126a.C2015r.m16284a()     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.bo r0 = com.amap.api.services.p126a.C2006i.m16379a(r9)     // Catch: java.lang.Throwable -> L92
                r3.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> L92
                r3.m16667a()     // Catch: java.lang.Throwable -> L92
                goto La3
            L70:
                com.amap.api.services.a.cl r3 = new com.amap.api.services.a.cl     // Catch: java.lang.Throwable -> L92
                android.content.Context r1 = com.amap.api.services.p126a.C2015r.m16284a()     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.bo r0 = com.amap.api.services.p126a.C2006i.m16379a(r9)     // Catch: java.lang.Throwable -> L92
                r3.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> L92
                r3.m16667a()     // Catch: java.lang.Throwable -> L92
                goto La3
            L81:
                com.amap.api.services.a.cl r3 = new com.amap.api.services.a.cl     // Catch: java.lang.Throwable -> L92
                android.content.Context r1 = com.amap.api.services.p126a.C2015r.m16284a()     // Catch: java.lang.Throwable -> L92
                com.amap.api.services.a.bo r0 = com.amap.api.services.p126a.C2006i.m16379a(r9)     // Catch: java.lang.Throwable -> L92
                r3.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> L92
                r3.m16667a()     // Catch: java.lang.Throwable -> L92
                goto La3
            L92:
                r1 = move-exception
                java.lang.String r0 = "ManifestConfig"
                com.amap.api.services.p126a.C2007j.m16371a(r1, r0, r6)     // Catch: java.lang.Throwable -> Lc2
                r2.what = r5
                com.amap.api.services.a.r r0 = com.amap.api.services.p126a.C2015r.this
                com.amap.api.services.a.r$a r0 = com.amap.api.services.p126a.C2015r.m16282a(r0)
                if (r0 == 0) goto Lb6
                goto Lad
            La3:
                r2.what = r5
                com.amap.api.services.a.r r0 = com.amap.api.services.p126a.C2015r.this
                com.amap.api.services.a.r$a r0 = com.amap.api.services.p126a.C2015r.m16282a(r0)
                if (r0 == 0) goto Lb6
            Lad:
                com.amap.api.services.a.r r0 = com.amap.api.services.p126a.C2015r.this
                com.amap.api.services.a.r$a r0 = com.amap.api.services.p126a.C2015r.m16282a(r0)
                r0.sendMessage(r2)
            Lb6:
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lbc
                goto Lc1
            Lbc:
                r0 = move-exception
                r0.printStackTrace()
                return
            Lc1:
                return
            Lc2:
                r1 = move-exception
                r2.what = r5
                com.amap.api.services.a.r r0 = com.amap.api.services.p126a.C2015r.this
                com.amap.api.services.a.r$a r0 = com.amap.api.services.p126a.C2015r.m16282a(r0)
                if (r0 == 0) goto Ld6
                com.amap.api.services.a.r r0 = com.amap.api.services.p126a.C2015r.this
                com.amap.api.services.a.r$a r0 = com.amap.api.services.p126a.C2015r.m16282a(r0)
                r0.sendMessage(r2)
            Ld6:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C2015r.HandlerThreadC20161.run():void");
        }
    };

    static {
        Covode.recordClassIndex(5626);
    }

    /* renamed from: a */
    public static C2015r m16283a(Context context) {
        if (f24829b == null) {
            f24829b = new C2015r(context);
        }
        return f24829b;
    }

    /* renamed from: com.amap.api.services.a.r$a */
    /* loaded from: classes19.dex */
    public class HandlerC2017a extends Handler {

        /* renamed from: a */
        public String f24834a = "handleMessage";

        static {
            Covode.recordClassIndex(5628);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null && message.what == 3) {
                try {
                    C2018s c2018s = (C2018s) message.obj;
                    if (c2018s == null) {
                        c2018s = new C2018s(false, false);
                    }
                    C1906cb.m16729a(C2015r.f24830c, C2006i.m16379a(c2018s.m16281a()));
                    C2015r.f24828a = C2006i.m16379a(c2018s.m16281a());
                } catch (Throwable th) {
                    C2007j.m16371a(th, "ManifestConfig", this.f24834a);
                }
            }
        }

        public HandlerC2017a(Looper looper) {
            super(looper);
        }
    }

    public C2015r(Context context) {
        f24830c = context;
        f24828a = C2006i.m16379a(false);
        try {
            this.f24831d = new HandlerC2017a(Looper.getMainLooper());
            this.f24832e.start();
        } catch (Throwable th) {
            C2007j.m16371a(th, "ManifestConfig", "ManifestConfig");
        }
    }
}
