package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.mapcore2d.C1638eb;
import com.amap.api.mapcore2d.C1643ee;
import com.amap.api.mapcore2d.C1674et;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.RandomAccessFile;
import p003X.C116971W2r;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.dz */
/* loaded from: classes19.dex */
public class C1633dz implements C1674et.AbstractC1675a {

    /* renamed from: a */
    public C1637ea f23408a;

    /* renamed from: b */
    public C1599da f23409b;

    /* renamed from: c */
    public String f23410c;

    /* renamed from: d */
    public RandomAccessFile f23411d;

    /* renamed from: e */
    public Context f23412e;

    /* renamed from: f */
    public C1674et f23413f;

    static {
        Covode.recordClassIndex(5181);
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: b */
    public void mo17601b() {
    }

    /* renamed from: a */
    public void m17796a() {
        try {
            C1647eg.m17710b().m17713a().submit(new RunnableC1634a(0));
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "startDownload()");
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: c */
    public void mo17600c() {
        try {
            if (this.f23411d == null) {
                return;
            }
            C1650eh.m17696a(this.f23411d);
            String m17772b = this.f23408a.m17772b();
            if (C1650eh.m17692b(this.f23410c, m17772b)) {
                m17793a(m17772b);
                C1698ff c1698ff = new C1698ff(this.f23412e, this.f23409b.m17972a(), this.f23409b.m17968b(), "O008");
                c1698ff.m17532a("{\"param_int_first\":1}");
                C1699fg.m17527a(c1698ff, this.f23412e);
                return;
            }
            C116971W2r.LIZ(new File(this.f23410c));
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "onFinish()");
        }
    }

    /* renamed from: d */
    public boolean m17792d() {
        boolean z;
        C1637ea c1637ea = this.f23408a;
        if (c1637ea != null && c1637ea.m17770d()) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (C1602db.m17934b(this.f23412e) || !C1650eh.m17700a(this.f23409b, this.f23408a) || !C1650eh.m17697a(this.f23408a) || !C1650eh.m17701a(this.f23412e, z) || C1650eh.m17702a(this.f23412e, this.f23408a, this.f23409b) || !C1650eh.m17706a(this.f23412e, this.f23409b, this.f23408a)) {
                return false;
            }
            C1638eb.m17755b(this.f23412e, this.f23409b.m17972a());
            return true;
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    /* renamed from: com.amap.api.mapcore2d.dz$a */
    /* loaded from: classes19.dex */
    public class RunnableC1634a implements Runnable {

        /* renamed from: b */
        public int f23415b;

        /* renamed from: c */
        public C1627dt f23416c;

        /* renamed from: d */
        public String f23417d;

        static {
            Covode.recordClassIndex(5182);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f23415b;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        try {
                            C1638eb.m17764a(C1633dz.this.f23412e, this.f23416c, C1633dz.this.f23409b, C1633dz.this.f23410c, this.f23417d);
                            C1638eb.m17766a(C1633dz.this.f23412e, C1633dz.this.f23409b);
                            return;
                        } catch (Throwable th) {
                            C1650eh.m17694a(th, "dDownLoad", "processDownloadedFile()");
                            return;
                        }
                    }
                    return;
                }
                try {
                    C1638eb.m17764a(C1633dz.this.f23412e, this.f23416c, C1633dz.this.f23409b, C1633dz.this.f23410c, C1633dz.this.f23408a.f23430e);
                    C1638eb.m17766a(C1633dz.this.f23412e, C1633dz.this.f23409b);
                    return;
                } catch (Throwable th2) {
                    C1650eh.m17694a(th2, "dDownLoad", "onFinish2");
                    return;
                }
            }
            try {
                if (C1633dz.this.m17792d()) {
                    C1698ff c1698ff = new C1698ff(C1633dz.this.f23412e, C1633dz.this.f23409b.m17972a(), C1633dz.this.f23409b.m17968b(), "O008");
                    c1698ff.m17532a("{\"param_int_first\":0}");
                    C1699fg.m17527a(c1698ff, C1633dz.this.f23412e);
                    C1633dz.this.f23413f.m17604a(C1633dz.this);
                }
            } catch (Throwable th3) {
                C1650eh.m17694a(th3, "dDownLoad", "run()");
            }
        }

        public RunnableC1634a(int i) {
            this.f23415b = i;
        }

        public RunnableC1634a(C1627dt c1627dt, int i) {
            this.f23415b = i;
            this.f23416c = c1627dt;
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: a */
    public void mo17603a(Throwable th) {
        try {
            C1650eh.m17696a(this.f23411d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m17793a(String str) {
        String m17771c = this.f23408a.m17771c();
        C1627dt c1627dt = new C1627dt(this.f23412e, C1642ed.m17742c());
        C1643ee.C1644a c1644a = new C1643ee.C1644a(this.f23408a.f23427b, str, this.f23408a.f23428c, m17771c, this.f23408a.f23430e);
        c1644a.m17727a("copy");
        C1638eb.C1640a.m17751a(c1627dt, c1644a.m17729a(), C1643ee.m17738a(this.f23408a.f23427b, this.f23408a.f23428c, m17771c, this.f23408a.f23430e));
        m17795a(this.f23412e, this.f23408a.f23428c);
        try {
            C1647eg.m17710b().m17713a().submit(new RunnableC1634a(c1627dt, 2));
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "onFinish1");
        }
    }

    /* renamed from: a */
    private void m17795a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, str, 0).edit();
            edit.clear();
            edit.commit();
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "clearMarker()");
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: a */
    public void mo17602a(byte[] bArr, long j) {
        try {
            if (this.f23411d == null) {
                File file = new File(this.f23410c);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f23411d = new RandomAccessFile(file, "rw");
            }
            this.f23411d.seek(j);
            this.f23411d.write(bArr);
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "onDownload()");
        }
    }

    public C1633dz(Context context, C1637ea c1637ea, C1599da c1599da) {
        try {
            this.f23412e = context.getApplicationContext();
            this.f23409b = c1599da;
            if (c1637ea == null) {
                return;
            }
            this.f23408a = c1637ea;
            this.f23413f = new C1674et(new C1654ej(this.f23408a));
            this.f23410c = C1638eb.m17760a(context, this.f23408a.f23427b);
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dDownLoad", "DexDownLoad()");
        }
    }
}
