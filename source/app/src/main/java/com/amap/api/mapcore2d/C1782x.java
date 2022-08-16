package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.RemoteException;
import com.amap.api.interfaces.IOverlay;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.x */
/* loaded from: classes19.dex */
public class C1782x implements AbstractC1461aa {

    /* renamed from: c */
    public AbstractC1783y f24058c;

    /* renamed from: d */
    public BitmapDescriptor f24059d;

    /* renamed from: e */
    public LatLng f24060e;

    /* renamed from: f */
    public float f24061f;

    /* renamed from: g */
    public float f24062g;

    /* renamed from: h */
    public LatLngBounds f24063h;

    /* renamed from: i */
    public float f24064i;

    /* renamed from: j */
    public float f24065j;

    /* renamed from: l */
    public float f24067l;

    /* renamed from: o */
    public String f24070o;

    /* renamed from: p */
    public Bitmap f24071p;

    /* renamed from: a */
    public final double f24056a = 0.01745329251994329d;

    /* renamed from: b */
    public final double f24057b = 6371000.79d;

    /* renamed from: k */
    public boolean f24066k = true;

    /* renamed from: m */
    public float f24068m = 0.5f;

    /* renamed from: n */
    public float f24069n = 0.5f;

    static {
        Covode.recordClassIndex(5330);
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public float getBearing() {
        return this.f24064i;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public LatLngBounds getBounds() {
        return this.f24063h;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public float getHeight() {
        return this.f24062g;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public LatLng getPosition() {
        return this.f24060e;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public float getTransparency() {
        return this.f24067l;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public float getWidth() {
        return this.f24061f;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public float getZIndex() {
        return this.f24065j;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean isVisible() {
        return this.f24066k;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public int hashCodeRemote() {
        return super.hashCode();
    }

    /* renamed from: b */
    public void m17152b() {
        if (this.f24060e == null) {
            m17150d();
        } else if (this.f24063h == null) {
            m17151c();
        }
    }

    @Override // com.amap.api.interfaces.IOverlay
    public String getId() {
        if (this.f24070o == null) {
            this.f24070o = C1778v.m17170a("GroundOverlay");
        }
        return this.f24070o;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void remove() {
        this.f24058c.removeGLOverlay(getId());
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public boolean mo17155a() {
        if (this.f24063h == null) {
            return false;
        }
        LatLngBounds mapBounds = this.f24058c.getMapBounds();
        if (mapBounds != null && !mapBounds.contains(this.f24063h) && !this.f24063h.intersects(mapBounds)) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void destroy() {
        Bitmap bitmap;
        try {
            remove();
            if (this.f24059d != null && (bitmap = this.f24059d.getBitmap()) != null) {
                bitmap.recycle();
                this.f24059d = null;
            }
            this.f24060e = null;
            this.f24063h = null;
        } catch (Exception e) {
            C1569cm.m18147a(e, "GroundOverlayDelegateImp", "destroy");
        }
    }

    /* renamed from: c */
    private void m17151c() {
        double cos = this.f24061f / ((Math.cos(this.f24060e.latitude * 0.01745329251994329d) * 6371000.79d) * 0.01745329251994329d);
        double d = this.f24062g / 111194.94043265979d;
        try {
            this.f24063h = new LatLngBounds(new LatLng(this.f24060e.latitude - ((1.0f - this.f24069n) * d), this.f24060e.longitude - (this.f24068m * cos)), new LatLng(this.f24060e.latitude + (this.f24069n * d), this.f24060e.longitude + ((1.0f - this.f24068m) * cos)));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m17150d() {
        LatLng latLng = this.f24063h.southwest;
        LatLng latLng2 = this.f24063h.northeast;
        this.f24060e = new LatLng(latLng.latitude + ((1.0f - this.f24069n) * (latLng2.latitude - latLng.latitude)), latLng.longitude + (this.f24068m * (latLng2.longitude - latLng.longitude)));
        this.f24061f = (float) (Math.cos(this.f24060e.latitude * 0.01745329251994329d) * 6371000.79d * (latLng2.longitude - latLng.longitude) * 0.01745329251994329d);
        this.f24062g = (float) ((latLng2.latitude - latLng.latitude) * 6371000.79d * 0.01745329251994329d);
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setImage(BitmapDescriptor bitmapDescriptor) {
        this.f24059d = bitmapDescriptor;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setTransparency(float f) {
        this.f24067l = f;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setDimensions(float f) {
        float f2 = this.f24061f;
        this.f24061f = f;
        this.f24062g = f;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setVisible(boolean z) {
        this.f24066k = z;
        this.f24058c.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setZIndex(float f) {
        this.f24065j = f;
        this.f24058c.postInvalidate();
    }

    /* renamed from: a */
    private C1781w m17153a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new C1781w((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean equalsRemote(IOverlay iOverlay) {
        if (!equals(iOverlay) && !iOverlay.getId().equals(getId())) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setBearing(float f) {
        float f2 = (((-f) % 360.0f) + 360.0f) % 360.0f;
        Double.doubleToLongBits(this.f24064i);
        Double.doubleToLongBits(f2);
        this.f24064i = f2;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setPosition(LatLng latLng) {
        LatLng latLng2 = this.f24060e;
        if (latLng2 != null && !latLng2.equals(latLng)) {
            this.f24060e = latLng;
            m17151c();
            return;
        }
        this.f24060e = latLng;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        LatLngBounds latLngBounds2 = this.f24063h;
        if (latLngBounds2 != null && !latLngBounds2.equals(latLngBounds)) {
            this.f24063h = latLngBounds;
            m17150d();
            return;
        }
        this.f24063h = latLngBounds;
    }

    public C1782x(AbstractC1783y abstractC1783y) {
        this.f24058c = abstractC1783y;
        try {
            this.f24070o = getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlayDelegateImp", "GroundOverlayDelegateImp");
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public void mo17154a(Canvas canvas) {
        if (this.f24066k) {
            if ((this.f24060e != null || this.f24063h != null) && this.f24059d != null) {
                m17152b();
                if (this.f24061f == 0.0f && this.f24062g == 0.0f) {
                    return;
                }
                this.f24071p = this.f24059d.getBitmap();
                Bitmap bitmap = this.f24071p;
                if (bitmap != null && !bitmap.isRecycled()) {
                    LatLng latLng = this.f24063h.southwest;
                    LatLng latLng2 = this.f24063h.northeast;
                    LatLng latLng3 = this.f24060e;
                    C1781w m17153a = m17153a(latLng);
                    C1781w m17153a2 = m17153a(latLng2);
                    C1781w m17153a3 = m17153a(latLng3);
                    Point point = new Point();
                    Point point2 = new Point();
                    Point point3 = new Point();
                    this.f24058c.mo17142d().mo18286a(m17153a, point);
                    this.f24058c.mo17142d().mo18286a(m17153a2, point2);
                    this.f24058c.mo17142d().mo18286a(m17153a3, point3);
                    Paint paint = new Paint();
                    RectF rectF = new RectF(point.x, point2.y, point2.x, point.y);
                    paint.setAlpha((int) (255.0f - (this.f24067l * 255.0f)));
                    paint.setFilterBitmap(true);
                    canvas.save();
                    canvas.rotate(this.f24064i, point3.x, point3.y);
                    canvas.drawBitmap(this.f24071p, (Rect) null, rectF, paint);
                    canvas.restore();
                }
            }
        }
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setAnchor(float f, float f2) {
        this.f24068m = f;
        this.f24069n = f2;
    }

    @Override // com.amap.api.interfaces.IGroundOverlay
    public void setDimensions(float f, float f2) {
        if (this.f24061f != f) {
            float f3 = this.f24062g;
        }
        this.f24061f = f;
        this.f24062g = f2;
    }
}
