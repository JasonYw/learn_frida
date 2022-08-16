package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.RemoteException;
import com.amap.api.interfaces.IOverlay;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.be */
/* loaded from: classes19.dex */
public class C1526be implements AbstractC1466af {

    /* renamed from: a */
    public AbstractC1783y f22986a;

    /* renamed from: b */
    public float f22987b;

    /* renamed from: d */
    public String f22989d;

    /* renamed from: e */
    public float f22990e;

    /* renamed from: f */
    public int f22991f;

    /* renamed from: g */
    public int f22992g;

    /* renamed from: h */
    public List<LatLng> f22993h;

    /* renamed from: c */
    public boolean f22988c = true;

    /* renamed from: i */
    public List<C1465ae> f22994i = new ArrayList();

    /* renamed from: j */
    public LatLngBounds f22995j = null;

    static {
        Covode.recordClassIndex(5074);
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void destroy() {
    }

    @Override // com.amap.api.interfaces.IPolygon
    public int getFillColor() {
        return this.f22991f;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public int getStrokeColor() {
        return this.f22992g;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public float getStrokeWidth() {
        return this.f22990e;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public float getZIndex() {
        return this.f22987b;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean isVisible() {
        return this.f22988c;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public List<LatLng> getPoints() {
        return m18302b();
    }

    @Override // com.amap.api.interfaces.IOverlay
    public int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.amap.api.interfaces.IOverlay
    public String getId() {
        if (this.f22989d == null) {
            this.f22989d = C1778v.m17170a("Polygon");
        }
        return this.f22989d;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void remove() {
        this.f22986a.removeGLOverlay(getId());
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public boolean mo17155a() {
        if (this.f22995j == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f22986a.getMapBounds();
        if (mapBounds != null && !this.f22995j.contains(mapBounds) && !this.f22995j.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public List<LatLng> m18302b() {
        if (this.f22994i != null) {
            ArrayList arrayList = new ArrayList();
            for (C1465ae c1465ae : this.f22994i) {
                if (c1465ae != null) {
                    C1774s c1774s = new C1774s();
                    this.f22986a.mo17143b(c1465ae.f22658a, c1465ae.f22659b, c1774s);
                    arrayList.add(new LatLng(c1774s.f24038b, c1774s.f24037a));
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public void setFillColor(int i) {
        this.f22991f = i;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public void setStrokeColor(int i) {
        this.f22992g = i;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public void setStrokeWidth(float f) {
        this.f22990e = f;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setVisible(boolean z) {
        this.f22988c = z;
    }

    @Override // com.amap.api.interfaces.IPolygon
    public void setPoints(List<LatLng> list) {
        this.f22993h = list;
        m18303a(list);
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setZIndex(float f) {
        this.f22987b = f;
        this.f22986a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IPolygon
    public boolean contains(LatLng latLng) {
        return C1569cm.m18151a(latLng, getPoints());
    }

    public C1526be(AbstractC1783y abstractC1783y) {
        this.f22986a = abstractC1783y;
        try {
            this.f22989d = getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "PolygonDelegateImp", "PolygonDelegateImp");
        }
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean equalsRemote(IOverlay iOverlay) {
        if (!equals(iOverlay) && !iOverlay.getId().equals(getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m18303a(List<LatLng> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        this.f22994i.clear();
        if (list != null) {
            Object obj = null;
            for (LatLng latLng : list) {
                if (latLng != null && !latLng.equals(obj)) {
                    C1465ae c1465ae = new C1465ae();
                    this.f22986a.mo17148a(latLng.latitude, latLng.longitude, c1465ae);
                    this.f22994i.add(c1465ae);
                    builder.include(latLng);
                    obj = latLng;
                }
            }
            int size = this.f22994i.size();
            if (size > 1) {
                C1465ae c1465ae2 = this.f22994i.get(0);
                int i = size - 1;
                C1465ae c1465ae3 = this.f22994i.get(i);
                if (c1465ae2.f22658a == c1465ae3.f22658a && c1465ae2.f22659b == c1465ae3.f22659b) {
                    this.f22994i.remove(i);
                }
            }
        }
        this.f22995j = builder.build();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public void mo17154a(Canvas canvas) {
        List<C1465ae> list = this.f22994i;
        if (list != null && list.size() != 0) {
            Path path = new Path();
            Point mo18286a = this.f22986a.mo17142d().mo18286a(new C1781w(this.f22994i.get(0).f22659b, this.f22994i.get(0).f22658a), new Point());
            path.moveTo(mo18286a.x, mo18286a.y);
            for (int i = 1; i < this.f22994i.size(); i++) {
                Point mo18286a2 = this.f22986a.mo17142d().mo18286a(new C1781w(this.f22994i.get(i).f22659b, this.f22994i.get(i).f22658a), new Point());
                path.lineTo(mo18286a2.x, mo18286a2.y);
            }
            Paint paint = new Paint();
            paint.setColor(getFillColor());
            paint.setAntiAlias(true);
            path.close();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(getStrokeColor());
            paint.setStrokeWidth(getStrokeWidth());
            canvas.drawPath(path, paint);
        }
    }
}
