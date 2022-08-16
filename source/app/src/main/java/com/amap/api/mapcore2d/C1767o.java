package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.RemoteException;
import androidx.core.view.ViewCompat;
import com.amap.api.interfaces.IOverlay;
import com.amap.api.maps2d.AMapUtils;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.o */
/* loaded from: classes19.dex */
public class C1767o implements AbstractC1784z {

    /* renamed from: a */
    public LatLng f23996a;

    /* renamed from: b */
    public double f23997b;

    /* renamed from: e */
    public int f24000e;

    /* renamed from: f */
    public float f24001f;

    /* renamed from: h */
    public String f24003h;

    /* renamed from: i */
    public AbstractC1783y f24004i;

    /* renamed from: c */
    public float f23998c = 10.0f;

    /* renamed from: d */
    public int f23999d = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: g */
    public boolean f24002g = true;

    static {
        Covode.recordClassIndex(5315);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public boolean mo17155a() {
        return true;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void destroy() {
        this.f23996a = null;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public int hashCodeRemote() {
        return 0;
    }

    @Override // com.amap.api.interfaces.ICircle
    public LatLng getCenter() {
        return this.f23996a;
    }

    @Override // com.amap.api.interfaces.ICircle
    public int getFillColor() {
        return this.f24000e;
    }

    @Override // com.amap.api.interfaces.ICircle
    public double getRadius() {
        return this.f23997b;
    }

    @Override // com.amap.api.interfaces.ICircle
    public int getStrokeColor() {
        return this.f23999d;
    }

    @Override // com.amap.api.interfaces.ICircle
    public float getStrokeWidth() {
        return this.f23998c;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public float getZIndex() {
        return this.f24001f;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean isVisible() {
        return this.f24002g;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public String getId() {
        if (this.f24003h == null) {
            this.f24003h = C1778v.m17170a("Circle");
        }
        return this.f24003h;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void remove() {
        this.f24004i.removeGLOverlay(getId());
        this.f24004i.postInvalidate();
    }

    @Override // com.amap.api.interfaces.ICircle
    public void setCenter(LatLng latLng) {
        this.f23996a = latLng;
    }

    @Override // com.amap.api.interfaces.ICircle
    public void setFillColor(int i) {
        this.f24000e = i;
    }

    @Override // com.amap.api.interfaces.ICircle
    public void setRadius(double d) {
        this.f23997b = d;
    }

    @Override // com.amap.api.interfaces.ICircle
    public void setStrokeColor(int i) {
        this.f23999d = i;
    }

    @Override // com.amap.api.interfaces.ICircle
    public void setStrokeWidth(float f) {
        this.f23998c = f;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setVisible(boolean z) {
        this.f24002g = z;
        this.f24004i.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IOverlay
    public void setZIndex(float f) {
        this.f24001f = f;
        this.f24004i.postInvalidate();
    }

    public C1767o(AbstractC1783y abstractC1783y) {
        this.f24004i = abstractC1783y;
        try {
            this.f24003h = getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "CircleDelegateImp", "CircleDelegateIme");
        }
    }

    @Override // com.amap.api.interfaces.ICircle
    public boolean contains(LatLng latLng) {
        if (this.f23997b >= AMapUtils.calculateLineDistance(this.f23996a, latLng)) {
            return true;
        }
        return false;
    }

    @Override // com.amap.api.interfaces.IOverlay
    public boolean equalsRemote(IOverlay iOverlay) {
        if (!equals(iOverlay) && !iOverlay.getId().equals(getId())) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1464ad
    /* renamed from: a */
    public void mo17154a(Canvas canvas) {
        if (getCenter() != null && this.f23997b > 0.0d && isVisible()) {
            try {
                float m18428a = this.f24004i.mo17149a().f22781b.m18428a((float) getRadius());
                C1781w c1781w = new C1781w((int) (this.f23996a.latitude * 1000000.0d), (int) (this.f23996a.longitude * 1000000.0d));
                Point point = new Point();
                this.f24004i.mo17142d().mo18286a(c1781w, point);
                Paint paint = new Paint();
                paint.setColor(getFillColor());
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(point.x, point.y, m18428a, paint);
                paint.setColor(getStrokeColor());
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(getStrokeWidth());
                canvas.drawCircle(point.x, point.y, m18428a, paint);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "CircleDelegateImp", "draw");
            }
        }
    }
}
