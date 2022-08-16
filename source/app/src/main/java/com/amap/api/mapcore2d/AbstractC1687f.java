package com.amap.api.mapcore2d;

import com.amap.api.maps2d.AMapException;
import com.amap.api.maps2d.MapsInitializer;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* renamed from: com.amap.api.mapcore2d.f */
/* loaded from: classes19.dex */
public abstract class AbstractC1687f<T, V> extends C1494aw {

    /* renamed from: a */
    public C1537bo<T> f23575a;

    /* renamed from: d */
    public Vector<Thread> f23577d;

    /* renamed from: g */
    public C1539bq f23580g;

    /* renamed from: c */
    public volatile boolean f23576c = true;

    /* renamed from: e */
    public Runnable f23578e = new Runnable() { // from class: com.amap.api.mapcore2d.f.1
        static {
            Covode.recordClassIndex(5236);
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<T> arrayList;
            ArrayList<T> arrayList2;
            Thread currentThread = Thread.currentThread();
            if (currentThread != null) {
                currentThread.setName("TaskRunDownLoad");
            }
            try {
                if (AbstractC1687f.this.f23577d != null) {
                    AbstractC1687f.this.f23577d.add(currentThread);
                }
                arrayList = null;
                arrayList2 = null;
            } catch (Throwable th) {
                C1569cm.m18147a(th, "AsyncServer", "run");
                return;
            }
            while (AbstractC1687f.this.f23576c && !Thread.interrupted()) {
                if (AbstractC1687f.this.f22753b != null) {
                    if (!MapsInitializer.getNetworkEnable()) {
                        try {
                            if (!Thread.interrupted()) {
                                Thread.sleep(200L);
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (Exception e) {
                            C1569cm.m18147a(e, "AsyncServer", "run");
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        if (AbstractC1687f.this.f23575a != null) {
                            arrayList = AbstractC1687f.this.f23575a.m18265a(AbstractC1687f.this.mo17550g(), false);
                        }
                        if (arrayList == null || arrayList.size() != 0) {
                            if (AbstractC1687f.this.f23576c) {
                                if (arrayList != null) {
                                    if (AbstractC1687f.this.f23576c) {
                                        if (AbstractC1687f.this.f22753b != null) {
                                            try {
                                                arrayList2 = AbstractC1687f.this.mo17558a(arrayList);
                                            } catch (AMapException e2) {
                                                C1569cm.m18147a(e2, "AsyncServer", "run");
                                            }
                                            if (arrayList2 != null && AbstractC1687f.this.f23575a != null) {
                                                AbstractC1687f.this.f23575a.m18264a((List) arrayList2, false);
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (AbstractC1687f.this.f23576c && !Thread.interrupted()) {
                                    try {
                                        Thread.sleep(50L);
                                    } catch (InterruptedException unused2) {
                                        Thread.currentThread().interrupt();
                                    } catch (Exception e3) {
                                        C1569cm.m18147a(e3, "AsyncServer", "run");
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    C1569cm.m18147a(th, "AsyncServer", "run");
                    return;
                }
                AbstractC1687f.this.f23576c = false;
            }
        }
    };

    /* renamed from: f */
    public Runnable f23579f = new Runnable() { // from class: com.amap.api.mapcore2d.f.2
        static {
            Covode.recordClassIndex(5237);
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread != null) {
                currentThread.setName("TaskRunCach");
            }
            try {
                if (AbstractC1687f.this.f23577d != null && currentThread != null) {
                    AbstractC1687f.this.f23577d.add(currentThread);
                }
                ArrayList<T> arrayList = null;
                while (AbstractC1687f.this.f23576c && !Thread.interrupted()) {
                    if (AbstractC1687f.this.f22753b != null) {
                        if (AbstractC1687f.this.f23575a != null) {
                            arrayList = AbstractC1687f.this.f23575a.m18265a(AbstractC1687f.this.mo17550g(), true);
                        }
                        if (arrayList == null || arrayList.size() != 0) {
                            if (AbstractC1687f.this.f23576c) {
                                ArrayList<T> mo17555b = AbstractC1687f.this.mo17555b(arrayList);
                                if (mo17555b != null && AbstractC1687f.this.f23575a != null && C1569cm.m18155a(C1484ar.f22704a)) {
                                    AbstractC1687f.this.f23575a.m18264a((List) mo17555b, false);
                                }
                                if (AbstractC1687f.this.f23576c && !Thread.interrupted()) {
                                    try {
                                        Thread.sleep(50L);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                    } catch (Throwable th) {
                                        C1569cm.m18147a(th, "AsyncServer", "run");
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        AbstractC1687f.this.f23576c = false;
                    }
                }
            } catch (Throwable th2) {
                C1569cm.m18147a(th2, "AsyncServer", "run");
            }
        }
    };

    static {
        Covode.recordClassIndex(5235);
    }

    /* renamed from: a */
    public abstract ArrayList<T> mo17558a(ArrayList<T> arrayList);

    /* renamed from: b */
    public abstract ArrayList<T> mo17555b(ArrayList<T> arrayList);

    /* renamed from: f */
    public abstract int mo17551f();

    /* renamed from: g */
    public abstract int mo17550g();

    @Override // com.amap.api.mapcore2d.C1494aw
    /* renamed from: c */
    public void mo17554c() {
        super.mo17554c();
        m17552e();
    }

    /* renamed from: a */
    public void m17561a() {
        if (this.f23577d == null) {
            this.f23577d = new Vector<>();
        }
        this.f23580g = new C1539bq(mo17551f(), this.f23579f, this.f23578e);
        this.f23580g.m18262a();
    }

    @Override // com.amap.api.mapcore2d.C1494aw
    /* renamed from: b */
    public void mo17557b() {
        C1537bo<T> c1537bo = this.f23575a;
        if (c1537bo != null) {
            c1537bo.m18266a();
        }
        m17552e();
        C1537bo<T> c1537bo2 = this.f23575a;
        if (c1537bo2 != null) {
            c1537bo2.m18263b();
        }
        this.f23575a = null;
        this.f23579f = null;
        this.f23578e = null;
        this.f22753b = null;
    }

    @Override // com.amap.api.mapcore2d.C1494aw
    /* renamed from: d */
    public void mo17553d() {
        try {
            if (this.f23576c) {
                return;
            }
            this.f23576c = true;
            if (this.f23577d == null) {
                this.f23577d = new Vector<>();
            }
            if (this.f23580g == null) {
                this.f23580g = new C1539bq(mo17551f(), this.f23579f, this.f23578e);
                this.f23580g.m18262a();
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AsyncServer", "onResume");
        }
    }

    /* renamed from: e */
    public void m17552e() {
        try {
            this.f23576c = false;
            if (this.f23577d != null) {
                int size = this.f23577d.size();
                for (int i = 0; i < size; i++) {
                    Thread thread = this.f23577d.get(0);
                    if (thread != null) {
                        thread.interrupt();
                        this.f23577d.remove(0);
                    }
                }
                this.f23577d = null;
            }
            if (this.f23580g != null) {
                this.f23580g.m18261b();
                this.f23580g = null;
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AsyncServer", "stopThreads");
        }
    }

    public AbstractC1687f(C1499az c1499az) {
        super(c1499az);
    }
}
