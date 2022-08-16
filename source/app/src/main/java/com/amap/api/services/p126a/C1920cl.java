package com.amap.api.services.p126a;

import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.services.p126a.C1923cn;
import com.amap.api.services.p126a.C1928cq;
import com.amap.api.services.p126a.C1960df;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.RandomAccessFile;
import p003X.C116971W2r;
import p003X.G4Y;

/* renamed from: com.amap.api.services.a.cl */
/* loaded from: classes19.dex */
public class C1920cl implements C1960df.AbstractC1961a {

    /* renamed from: a */
    public C1922cm f24601a;

    /* renamed from: b */
    public C1889bo f24602b;

    /* renamed from: c */
    public String f24603c;

    /* renamed from: d */
    public RandomAccessFile f24604d;

    /* renamed from: e */
    public Context f24605e;

    /* renamed from: f */
    public C1960df f24606f;

    static {
        Covode.recordClassIndex(5531);
    }

    /* renamed from: c */
    public boolean m16662c() {
        return false;
    }

    @Override // com.amap.api.services.p126a.C1960df.AbstractC1961a
    /* renamed from: e */
    public void mo16482e() {
    }

    /* renamed from: a */
    public void m16667a() {
        try {
            C1932cs.m16597b().m16600a().submit(new RunnableC1921a(0));
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "startDownload()");
        }
    }

    /* renamed from: b */
    public boolean m16663b() {
        boolean z;
        C1922cm c1922cm = this.f24601a;
        if (c1922cm != null && c1922cm.m16657d()) {
            z = true;
        } else {
            z = false;
        }
        try {
            if ((!m16662c() && C1892bp.m16780b(this.f24605e)) || !C1935ct.m16587a(this.f24602b, this.f24601a) || !C1935ct.m16584a(this.f24601a) || !C1935ct.m16588a(this.f24605e, z) || C1935ct.m16589a(this.f24605e, this.f24601a, this.f24602b) || !C1935ct.m16593a(this.f24605e, this.f24602b, this.f24601a)) {
                return false;
            }
            C1923cn.m16642b(this.f24605e, this.f24602b.m16818a());
            return true;
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    @Override // com.amap.api.services.p126a.C1960df.AbstractC1961a
    /* renamed from: d */
    public void mo16483d() {
        try {
            if (this.f24604d == null) {
                return;
            }
            C1935ct.m16583a(this.f24604d);
            String m16659b = this.f24601a.m16659b();
            if (C1935ct.m16579b(this.f24603c, m16659b)) {
                m16664a(m16659b);
                C1979dq c1979dq = new C1979dq(this.f24605e, this.f24602b.m16818a(), this.f24602b.m16814b(), "O008");
                c1979dq.m16426a("{\"param_int_first\":1}");
                C1980dr.m16421a(c1979dq, this.f24605e);
                return;
            }
            C116971W2r.LIZ(new File(this.f24603c));
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "onFinish()");
        }
    }

    /* renamed from: com.amap.api.services.a.cl$a */
    /* loaded from: classes19.dex */
    public class RunnableC1921a implements Runnable {

        /* renamed from: b */
        public int f24608b;

        /* renamed from: c */
        public C1914cf f24609c;

        /* renamed from: d */
        public String f24610d;

        static {
            Covode.recordClassIndex(5532);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f24608b;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        try {
                            C1923cn.m16651a(C1920cl.this.f24605e, this.f24609c, C1920cl.this.f24602b, C1920cl.this.f24603c, this.f24610d);
                            C1923cn.m16653a(C1920cl.this.f24605e, C1920cl.this.f24602b);
                            return;
                        } catch (Throwable th) {
                            C1935ct.m16581a(th, "dDownLoad", "processDownloadedFile()");
                            return;
                        }
                    }
                    return;
                }
                try {
                    C1923cn.m16651a(C1920cl.this.f24605e, this.f24609c, C1920cl.this.f24602b, C1920cl.this.f24603c, C1920cl.this.f24601a.f24615e);
                    C1923cn.m16653a(C1920cl.this.f24605e, C1920cl.this.f24602b);
                    return;
                } catch (Throwable th2) {
                    C1935ct.m16581a(th2, "dDownLoad", "onFinish2");
                    return;
                }
            }
            try {
                if (C1920cl.this.m16663b()) {
                    C1979dq c1979dq = new C1979dq(C1920cl.this.f24605e, C1920cl.this.f24602b.m16818a(), C1920cl.this.f24602b.m16814b(), "O008");
                    c1979dq.m16426a("{\"param_int_first\":0}");
                    C1980dr.m16421a(c1979dq, C1920cl.this.f24605e);
                    C1920cl.this.f24606f.m16486a(C1920cl.this);
                }
            } catch (Throwable th3) {
                C1935ct.m16581a(th3, "dDownLoad", "run()");
            }
        }

        public RunnableC1921a(int i) {
            this.f24608b = i;
        }

        public RunnableC1921a(C1914cf c1914cf, int i) {
            this.f24608b = i;
            this.f24609c = c1914cf;
        }
    }

    @Override // com.amap.api.services.p126a.C1960df.AbstractC1961a
    /* renamed from: a */
    public void mo16485a(Throwable th) {
        try {
            C1935ct.m16583a(this.f24604d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m16664a(String str) {
        String m16658c = this.f24601a.m16658c();
        C1914cf c1914cf = new C1914cf(this.f24605e, C1927cp.m16629c());
        C1928cq.C1929a c1929a = new C1928cq.C1929a(this.f24601a.f24612b, str, this.f24601a.f24613c, m16658c, this.f24601a.f24615e);
        c1929a.m16614a("copy");
        C1923cn.C1925a.m16638a(c1914cf, c1929a.m16616a(), C1928cq.m16625a(this.f24601a.f24612b, this.f24601a.f24613c, m16658c, this.f24601a.f24615e));
        m16666a(this.f24605e, this.f24601a.f24613c);
        try {
            C1932cs.m16597b().m16600a().submit(new RunnableC1921a(c1914cf, 2));
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "onFinish1");
        }
    }

    /* renamed from: a */
    private void m16666a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, str, 0).edit();
            edit.clear();
            edit.commit();
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "clearMarker()");
        }
    }

    @Override // com.amap.api.services.p126a.C1960df.AbstractC1961a
    /* renamed from: a */
    public void mo16484a(byte[] bArr, long j) {
        try {
            if (this.f24604d == null) {
                File file = new File(this.f24603c);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f24604d = new RandomAccessFile(file, "rw");
            }
            this.f24604d.seek(j);
            this.f24604d.write(bArr);
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "onDownload()");
        }
    }

    public C1920cl(Context context, C1922cm c1922cm, C1889bo c1889bo) {
        try {
            this.f24605e = context.getApplicationContext();
            this.f24602b = c1889bo;
            if (c1922cm == null) {
                return;
            }
            this.f24601a = c1922cm;
            this.f24606f = new C1960df(new C1939cv(this.f24601a));
            this.f24603c = C1923cn.m16647a(context, this.f24601a.f24612b);
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dDownLoad", "DexDownLoad()");
        }
    }
}
