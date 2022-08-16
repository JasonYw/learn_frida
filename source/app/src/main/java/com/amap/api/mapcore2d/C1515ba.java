package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.ba */
/* loaded from: classes22.dex */
public class C1515ba {

    /* renamed from: a */
    public final C1517a[] f22915a;

    /* renamed from: b */
    public final int f22916b;

    /* renamed from: c */
    public final int f22917c;

    /* renamed from: d */
    public final C1517a[] f22918d;

    /* renamed from: e */
    public boolean f22919e;

    /* renamed from: f */
    public long f22920f;

    /* renamed from: g */
    public C1475an f22921g;

    /* renamed from: h */
    public Paint f22922h;

    /* renamed from: i */
    public Path f22923i;

    static {
        Covode.recordClassIndex(5063);
    }

    /* renamed from: d */
    private long m18344d() {
        return System.nanoTime();
    }

    /* renamed from: b */
    public int m18347b() {
        int i = -1;
        for (int i2 = 0; i2 < this.f22916b; i2++) {
            C1517a[] c1517aArr = this.f22915a;
            if (c1517aArr[i2] == null) {
                c1517aArr[i2] = new C1517a();
                this.f22915a[i2].f22930e = i2;
                return i2;
            }
            if (!c1517aArr[i2].f22928c && i < 0) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void m18345c() {
        for (int i = 0; i < this.f22916b; i++) {
            C1517a[] c1517aArr = this.f22915a;
            if (c1517aArr[i] != null) {
                if (c1517aArr[i].f22926a != null && !this.f22915a[i].f22926a.isRecycled()) {
                    this.f22915a[i].f22926a.recycle();
                }
                this.f22915a[i].f22926a = null;
            }
        }
    }

    /* renamed from: a */
    public int m18355a() {
        for (int i = 0; i < this.f22917c; i++) {
            this.f22918d[i] = null;
        }
        for (int i2 = 0; i2 < this.f22916b; i2++) {
            C1517a c1517a = this.f22915a[i2];
            int i3 = 0;
            while (true) {
                if (i3 < this.f22917c) {
                    C1517a[] c1517aArr = this.f22918d;
                    if (c1517aArr[i3] == null) {
                        c1517aArr[i3] = c1517a;
                        break;
                    }
                    if (c1517aArr[i3].f22929d > c1517a.f22929d) {
                        C1517a[] c1517aArr2 = this.f22918d;
                        C1517a c1517a2 = c1517aArr2[i3];
                        c1517aArr2[i3] = c1517a;
                        c1517a = c1517a2;
                    }
                    i3++;
                }
            }
        }
        int i4 = -1;
        for (int i5 = 0; i5 < this.f22917c; i5++) {
            C1517a[] c1517aArr3 = this.f22918d;
            if (c1517aArr3[i5] != null) {
                c1517aArr3[i5].f22928c = false;
                if (i4 < 0) {
                    i4 = c1517aArr3[i5].f22930e;
                }
            }
        }
        return i4;
    }

    /* renamed from: com.amap.api.mapcore2d.ba$a */
    /* loaded from: classes22.dex */
    public class C1517a {

        /* renamed from: a */
        public Bitmap f22926a;

        /* renamed from: c */
        public boolean f22928c;

        /* renamed from: d */
        public long f22929d;

        /* renamed from: f */
        public long f22931f;

        /* renamed from: g */
        public List<C1548bx> f22932g;

        /* renamed from: b */
        public String f22927b = "";

        /* renamed from: e */
        public int f22930e = -1;

        static {
            Covode.recordClassIndex(5065);
        }

        public C1517a() {
        }
    }

    /* renamed from: a */
    public Bitmap m18354a(int i) {
        if (i < 0 || i >= this.f22916b) {
            return null;
        }
        C1517a[] c1517aArr = this.f22915a;
        if (c1517aArr[i] == null) {
            return null;
        }
        return c1517aArr[i].f22926a;
    }

    /* renamed from: a */
    public int m18349a(String str) {
        if (str != null && !str.equals("")) {
            for (int i = 0; i < this.f22916b; i++) {
                C1517a[] c1517aArr = this.f22915a;
                if (c1517aArr[i] != null && c1517aArr[i].f22927b != null && this.f22915a[i].f22927b.equals(str)) {
                    if (!this.f22915a[i].f22928c) {
                        return -1;
                    }
                    if (this.f22919e && m18344d() - this.f22915a[i].f22931f > this.f22920f) {
                        this.f22915a[i].f22928c = false;
                        return -1;
                    } else if (this.f22915a[i].f22926a == null) {
                        return -1;
                    } else {
                        this.f22915a[i].f22929d = m18344d();
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m18353a(Bitmap bitmap, final List<C1548bx> list) {
        AbstractC1760j abstractC1760j = new AbstractC1760j() { // from class: com.amap.api.mapcore2d.ba.1
            static {
                Covode.recordClassIndex(5064);
            }

            @Override // com.amap.api.mapcore2d.AbstractC1760j
            /* renamed from: a */
            public void mo17245a(Canvas canvas) {
                if (C1515ba.this.f22922h == null) {
                    C1515ba.this.f22922h = new Paint();
                    C1515ba.this.f22922h.setStyle(Paint.Style.STROKE);
                    C1515ba.this.f22922h.setDither(true);
                    C1515ba.this.f22922h.setAntiAlias(true);
                    C1515ba.this.f22922h.setStrokeJoin(Paint.Join.ROUND);
                    C1515ba.this.f22922h.setStrokeCap(Paint.Cap.ROUND);
                }
                if (C1515ba.this.f22923i == null) {
                    C1515ba.this.f22923i = new Path();
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C1548bx c1548bx = (C1548bx) list.get(i);
                    if (c1548bx != null) {
                        C1515ba.this.f22922h.setStrokeWidth(3.0f);
                        int m18222b = c1548bx.m18222b();
                        if (m18222b == 1) {
                            C1515ba.this.f22922h.setColor(-65536);
                        } else if (m18222b == 2) {
                            C1515ba.this.f22922h.setColor(-256);
                        } else if (m18222b == 3) {
                            C1515ba.this.f22922h.setColor(-16711936);
                        }
                        List<PointF> m18223a = c1548bx.m18223a();
                        int size2 = m18223a.size();
                        boolean z = true;
                        for (int i2 = 0; i2 < size2; i2++) {
                            PointF pointF = m18223a.get(i2);
                            if (pointF != null) {
                                if (z) {
                                    C1515ba.this.f22923i.moveTo(pointF.x, pointF.y);
                                    z = false;
                                } else {
                                    C1515ba.this.f22923i.lineTo(pointF.x, pointF.y);
                                }
                            }
                        }
                        canvas.drawPath(C1515ba.this.f22923i, C1515ba.this.f22922h);
                        C1515ba.this.f22923i.reset();
                    }
                }
            }
        };
        C1759i c1759i = new C1759i(null);
        c1759i.m17247a(bitmap);
        c1759i.m17246a(abstractC1760j);
    }

    public C1515ba(int i, int i2, boolean z, long j, C1475an c1475an) {
        this.f22916b = i;
        this.f22917c = i2;
        this.f22921g = c1475an;
        this.f22919e = z;
        this.f22920f = j * 1000000;
        int i3 = this.f22916b;
        if (i3 > 0) {
            this.f22915a = new C1517a[i3];
            this.f22918d = new C1517a[this.f22917c];
            return;
        }
        this.f22915a = null;
        this.f22918d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #6 {all -> 0x00f0, blocks: (B:59:0x0010, B:12:0x0018, B:16:0x001e, B:18:0x0025, B:20:0x002d, B:22:0x0039, B:23:0x0048, B:25:0x0050, B:33:0x0092, B:34:0x00b3, B:36:0x00bb, B:40:0x00c5, B:42:0x00cb, B:44:0x00e5, B:30:0x0065, B:56:0x007c), top: B:58:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[Catch: all -> 0x00f0, TryCatch #6 {all -> 0x00f0, blocks: (B:59:0x0010, B:12:0x0018, B:16:0x001e, B:18:0x0025, B:20:0x002d, B:22:0x0039, B:23:0x0048, B:25:0x0050, B:33:0x0092, B:34:0x00b3, B:36:0x00bb, B:40:0x00c5, B:42:0x00cb, B:44:0x00e5, B:30:0x0065, B:56:0x007c), top: B:58:0x0010 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int m18348a(byte[] r8, byte[] r9, boolean r10, java.util.List<com.amap.api.mapcore2d.C1548bx> r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1515ba.m18348a(byte[], byte[], boolean, java.util.List, java.lang.String):int");
    }
}
