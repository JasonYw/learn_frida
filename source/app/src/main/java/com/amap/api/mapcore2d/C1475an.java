package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.amap.api.maps2d.model.TileProvider;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.amap.api.mapcore2d.an */
/* loaded from: classes19.dex */
public class C1475an extends AbstractC1476ao {

    /* renamed from: a */
    public C1492av f22664a;

    /* renamed from: f */
    public boolean f22669f;

    /* renamed from: g */
    public boolean f22670g;

    /* renamed from: i */
    public long f22672i;

    /* renamed from: j */
    public AbstractC1554cb f22673j;

    /* renamed from: k */
    public TileProvider f22674k;

    /* renamed from: n */
    public C1515ba f22677n;

    /* renamed from: o */
    public C1776u f22678o;

    /* renamed from: p */
    public C1536bn<C1541bs> f22679p;

    /* renamed from: s */
    public boolean f22681s;

    /* renamed from: r */
    public String f22680r = "LayerPropertys";

    /* renamed from: b */
    public String f22665b = "";

    /* renamed from: c */
    public int f22666c = 19;

    /* renamed from: d */
    public int f22667d = 3;

    /* renamed from: e */
    public boolean f22668e = true;

    /* renamed from: h */
    public boolean f22671h = true;

    /* renamed from: l */
    public int f22675l = -1;

    /* renamed from: m */
    public String f22676m = "";

    static {
        Covode.recordClassIndex(5023);
    }

    /* renamed from: a */
    public boolean m18617a() {
        return this.f22681s;
    }

    public int hashCode() {
        return this.f22675l;
    }

    public String toString() {
        return this.f22665b;
    }

    /* renamed from: b */
    public void m18614b() {
        this.f22682q.m17552e();
        this.f22678o.m17188a((C1515ba) null);
        this.f22677n.m18345c();
        this.f22679p.clear();
    }

    public C1475an(C1492av c1492av) {
        this.f22664a = c1492av;
    }

    /* renamed from: a */
    public void m18615a(boolean z) {
        this.f22681s = z;
        if (z) {
            this.f22682q.mo17553d();
            return;
        }
        this.f22677n.m18345c();
        this.f22682q.mo17554c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475an)) {
            return false;
        }
        return this.f22665b.equals(((C1475an) obj).f22665b);
    }

    /* renamed from: a */
    public void m18616a(Canvas canvas) {
        try {
            if (this.f22679p == null) {
                return;
            }
            Iterator<C1541bs> it = this.f22679p.iterator();
            while (it.hasNext()) {
                C1541bs next = it.next();
                if (next != null) {
                    if (next.f23059h < 0) {
                        boolean z = this.f22668e;
                    } else {
                        Bitmap m18354a = this.f22677n.m18354a(next.f23059h);
                        PointF m18520a = this.f22664a.m18520a(next.f23053b, next.f23054c);
                        if (m18354a != null && m18520a != null) {
                            canvas.drawBitmap(m18354a, (Rect) null, new RectF(m18520a.x, m18520a.y, m18520a.x + this.f22664a.f22730a, m18520a.y + this.f22664a.f22730a), (Paint) null);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, this.f22680r, "drawLayer");
        }
    }
}
