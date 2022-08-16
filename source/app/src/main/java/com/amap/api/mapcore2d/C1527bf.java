package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.RemoteException;
import androidx.core.view.ViewCompat;
import com.amap.api.interfaces.IOverlay;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.bf */
/* loaded from: classes19.dex */
public class C1527bf implements AbstractC1467ag {

    /* renamed from: a */
    public AbstractC1783y f22996a;

    /* renamed from: d */
    public float f22999d;

    /* renamed from: f */
    public boolean f23001f;

    /* renamed from: g */
    public boolean f23002g;

    /* renamed from: h */
    public String f23003h;

    /* renamed from: b */
    public float f22997b = 10.0f;

    /* renamed from: c */
    public int f22998c = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: e */
    public boolean f23000e = true;

    /* renamed from: i */
    public List<C1465ae> f23004i = new ArrayList();

    /* renamed from: j */
    public List<LatLng> f23005j = new ArrayList();

    /* renamed from: k */
    public LatLngBounds f23006k = null;

    static {
        Covode.recordClassIndex(5075);
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void destroy() {
    }

    @Override // com.amap.api.interfaces.IPolyline
    public int getColor() {
        return this.f22998c;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public float getWidth() {
        return this.f22997b;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public float getZIndex() {
        return this.f22999d;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public boolean isDottedLine() {
        return this.f23001f;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public boolean isGeodesic() {
        return this.f23002g;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean isVisible() {
        return this.f23000e;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.amap.api.interfaces.IOverlay
    public String getId() {
        if (this.f23003h == null) {
            this.f23003h = C1778v.m17170a("Polyline");
        }
        return this.f23003h;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public List<LatLng> getPoints() {
        if (!this.f23002g && !this.f23001f) {
            return m18297b();
        }
        return this.f23005j;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void remove() {
        this.f22996a.removeGLOverlay(getId());
    }

    /* renamed from: b */
    private List<LatLng> m18297b() {
        if (this.f23004i != null) {
            ArrayList arrayList = new ArrayList();
            for (C1465ae c1465ae : this.f23004i) {
                if (c1465ae != null) {
                    C1774s c1774s = new C1774s();
                    this.f22996a.mo17143b(c1465ae.f22658a, c1465ae.f22659b, c1774s);
                    arrayList.add(new LatLng(c1774s.f24038b, c1774s.f24037a));
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public boolean mo17155a() {
        if (this.f23006k == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f22996a.getMapBounds();
        if (mapBounds != null && !mapBounds.contains(this.f23006k) && !this.f23006k.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public void setColor(int i) {
        this.f22998c = i;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public void setDottedLine(boolean z) {
        this.f23001f = z;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setVisible(boolean z) {
        this.f23000e = z;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public void setWidth(float f) {
        this.f22997b = f;
    }

    @Override // com.amap.api.interfaces.IPolyline
    public void setGeodesic(boolean z) {
        if (this.f23002g != z) {
            this.f23002g = z;
        }
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setZIndex(float f) {
        this.f22999d = f;
        this.f22996a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IPolyline
    public void setPoints(List<LatLng> list) {
        if (this.f23002g || this.f23001f) {
            this.f23005j = list;
        }
        m18299a(list);
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean equalsRemote(IOverlay iOverlay) {
        if (!equals(iOverlay) && !iOverlay.getId().equals(getId())) {
            return false;
        }
        return true;
    }

    public C1527bf(AbstractC1783y abstractC1783y) {
        this.f22996a = abstractC1783y;
        try {
            this.f23003h = getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "PolylineDelegateImp", "PolylineDelegateImp");
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public void mo17154a(Canvas canvas) {
        List<C1465ae> list = this.f23004i;
        if (list != null && list.size() != 0 && this.f22997b > 0.0f) {
            try {
                Path path = new Path();
                Point mo18286a = this.f22996a.mo17142d().mo18286a(new C1781w(this.f23004i.get(0).f22659b, this.f23004i.get(0).f22658a), new Point());
                path.moveTo(mo18286a.x, mo18286a.y);
                for (int i = 1; i < this.f23004i.size(); i++) {
                    Point mo18286a2 = this.f22996a.mo17142d().mo18286a(new C1781w(this.f23004i.get(i).f22659b, this.f23004i.get(i).f22658a), new Point());
                    path.lineTo(mo18286a2.x, mo18286a2.y);
                }
                Paint paint = new Paint();
                paint.setColor(getColor());
                paint.setAntiAlias(true);
                paint.setStrokeWidth(getWidth());
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                if (this.f23001f) {
                    int width = (int) getWidth();
                    float f = width * 3;
                    float f2 = width;
                    paint.setPathEffect(new DashPathEffect(new float[]{f, f2, f, f2}, 1.0f));
                }
                canvas.drawPath(path, paint);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "PolylineDelegateImp", "draw");
            }
        }
    }

    /* renamed from: a */
    public void m18299a(List<LatLng> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    LatLngBounds.Builder builder = LatLngBounds.builder();
                    this.f23004i.clear();
                    LatLng latLng = null;
                    for (int i = 0; i < list.size(); i++) {
                        LatLng latLng2 = list.get(i);
                        if (latLng2 != null && !latLng2.equals(latLng)) {
                            if (!this.f23002g) {
                                C1465ae c1465ae = new C1465ae();
                                this.f22996a.mo17148a(latLng2.latitude, latLng2.longitude, c1465ae);
                                this.f23004i.add(c1465ae);
                                builder.include(latLng2);
                            } else if (latLng != null) {
                                if (Math.abs(latLng2.longitude - latLng.longitude) < 0.01d) {
                                    C1465ae c1465ae2 = new C1465ae();
                                    this.f22996a.mo17148a(latLng.latitude, latLng.longitude, c1465ae2);
                                    this.f23004i.add(c1465ae2);
                                    builder.include(latLng);
                                    C1465ae c1465ae3 = new C1465ae();
                                    this.f22996a.mo17148a(latLng2.latitude, latLng2.longitude, c1465ae3);
                                    this.f23004i.add(c1465ae3);
                                    builder.include(latLng2);
                                } else {
                                    m18300a(latLng, latLng2, this.f23004i, builder);
                                }
                            }
                            latLng = latLng2;
                        }
                    }
                    if (this.f23004i.size() > 0) {
                        this.f23006k = builder.build();
                    }
                }
            } catch (Throwable th) {
                C1569cm.m18147a(th, "PolylineDelegateImp", "calLatLng2Geo");
            }
        }
    }

    /* renamed from: a */
    public void m18298a(List<C1465ae> list, List<C1465ae> list2, double d) {
        float f;
        if (list.size() != 3) {
            return;
        }
        int i = 0;
        int i2 = 0;
        do {
            float f2 = i2;
            float f3 = f2 / 10.0f;
            C1465ae c1465ae = new C1465ae();
            double d2 = 1.0d - f3;
            double d3 = d2 * d2;
            double d4 = 2.0f * f3 * d2;
            double d5 = (list.get(i).f22658a * d3) + (list.get(1).f22658a * d4 * d) + (list.get(2).f22658a * f);
            double d6 = (list.get(i).f22659b * d3) + (list.get(1).f22659b * d4 * d) + (list.get(2).f22659b * f);
            double d7 = d3 + (d4 * d) + (f3 * f3);
            c1465ae.f22658a = (int) (d5 / d7);
            c1465ae.f22659b = (int) (d6 / d7);
            list2.add(c1465ae);
            i2 = (int) (1.0f + f2);
            i = 0;
        } while (i2 <= 10);
    }

    /* renamed from: a */
    public void m18300a(LatLng latLng, LatLng latLng2, List<C1465ae> list, LatLngBounds.Builder builder) {
        int i;
        double abs = (Math.abs(latLng.longitude - latLng2.longitude) * 3.141592653589793d) / 180.0d;
        LatLng latLng3 = new LatLng((latLng2.latitude + latLng.latitude) / 2.0d, (latLng2.longitude + latLng.longitude) / 2.0d);
        builder.include(latLng);
        builder.include(latLng3);
        builder.include(latLng2);
        if (latLng3.latitude > 0.0d) {
            i = 1;
        } else {
            i = -1;
        }
        C1465ae c1465ae = new C1465ae();
        this.f22996a.mo17148a(latLng.latitude, latLng.longitude, c1465ae);
        C1465ae c1465ae2 = new C1465ae();
        this.f22996a.mo17148a(latLng2.latitude, latLng2.longitude, c1465ae2);
        C1465ae c1465ae3 = new C1465ae();
        this.f22996a.mo17148a(latLng3.latitude, latLng3.longitude, c1465ae3);
        double d = abs * 0.5d;
        double cos = Math.cos(d);
        C1465ae m18301a = m18301a(c1465ae, c1465ae2, c1465ae3, Math.hypot(c1465ae.f22658a - c1465ae2.f22658a, c1465ae.f22659b - c1465ae2.f22659b) * 0.5d * Math.tan(d), i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1465ae);
        arrayList.add(m18301a);
        arrayList.add(c1465ae2);
        m18298a(arrayList, list, cos);
    }

    /* renamed from: a */
    public C1465ae m18301a(C1465ae c1465ae, C1465ae c1465ae2, C1465ae c1465ae3, double d, int i) {
        C1465ae c1465ae4 = new C1465ae();
        double d2 = c1465ae2.f22658a - c1465ae.f22658a;
        double d3 = c1465ae2.f22659b - c1465ae.f22659b;
        c1465ae4.f22659b = (int) (((i * d) / Math.sqrt(((d3 * d3) / (d2 * d2)) + 1.0d)) + c1465ae3.f22659b);
        c1465ae4.f22658a = (int) ((((c1465ae3.f22659b - c1465ae4.f22659b) * d3) / d2) + c1465ae3.f22658a);
        return c1465ae4;
    }
}
