package com.amap.api.mapcore2d;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.location.Location;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.MyLocationStyle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bc */
/* loaded from: classes19.dex */
public class C1521bc {

    /* renamed from: a */
    public C1524a f22961a;

    /* renamed from: b */
    public ValueAnimator f22962b;

    /* renamed from: e */
    public AbstractC1783y f22965e;

    /* renamed from: f */
    public Marker f22966f;

    /* renamed from: g */
    public Circle f22967g;

    /* renamed from: h */
    public MyLocationStyle f22968h;

    /* renamed from: i */
    public LatLng f22969i;

    /* renamed from: j */
    public double f22970j;

    /* renamed from: k */
    public Context f22971k;

    /* renamed from: l */
    public C1533bl f22972l;

    /* renamed from: n */
    public boolean f22974n;

    /* renamed from: q */
    public BitmapDescriptor f22977q;

    /* renamed from: r */
    public boolean f22978r;

    /* renamed from: s */
    public boolean f22979s;

    /* renamed from: t */
    public boolean f22980t;

    /* renamed from: u */
    public boolean f22981u;

    /* renamed from: v */
    public boolean f22982v;

    /* renamed from: m */
    public int f22973m = 1;

    /* renamed from: o */
    public final String f22975o = "location_map_gps_locked.png";

    /* renamed from: p */
    public final String f22976p = "location_map_gps_3d.png";

    /* renamed from: c */
    public Animator.AnimatorListener f22963c = new Animator.AnimatorListener() { // from class: com.amap.api.mapcore2d.bc.1
        static {
            Covode.recordClassIndex(5070);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1521bc.this.m18317c();
        }
    };

    /* renamed from: d */
    public ValueAnimator.AnimatorUpdateListener f22964d = new ValueAnimator.AnimatorUpdateListener() { // from class: com.amap.api.mapcore2d.bc.2
        static {
            Covode.recordClassIndex(5071);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (C1521bc.this.f22967g != null) {
                    LatLng latLng = (LatLng) valueAnimator.getAnimatedValue();
                    C1521bc.this.f22967g.setCenter(latLng);
                    C1521bc.this.f22966f.setPosition(latLng);
                }
            } catch (Throwable unused) {
            }
        }
    };

    static {
        Covode.recordClassIndex(5069);
    }

    /* renamed from: b */
    private void m18320b() {
        this.f22972l.m18274b();
    }

    /* renamed from: a */
    public void m18329a() {
        m18314e();
        if (this.f22972l != null) {
            m18320b();
            this.f22972l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m18317c() {
        if (!this.f22978r) {
            return;
        }
        if (this.f22979s && this.f22974n) {
            return;
        }
        this.f22974n = true;
        try {
            this.f22965e.animateCamera(CameraUpdateFactory.changeLatLng(this.f22969i));
        } catch (Throwable th) {
            C1616do.m17866c(th, "MyLocationOverlay", "moveMapToLocation");
        }
    }

    /* renamed from: d */
    private void m18315d() {
        MyLocationStyle myLocationStyle = this.f22968h;
        if (myLocationStyle == null) {
            this.f22968h = new MyLocationStyle();
            this.f22968h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        } else if (myLocationStyle.getMyLocationIcon() == null || this.f22968h.getMyLocationIcon().getBitmap() == null) {
            this.f22968h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        }
        m18313f();
    }

    /* renamed from: e */
    private void m18314e() {
        Circle circle = this.f22967g;
        if (circle != null) {
            try {
                this.f22965e.removeGLOverlay(circle.getId());
            } catch (Throwable th) {
                C1616do.m17866c(th, "MyLocationOverlay", "locationIconRemove");
            }
            this.f22967g = null;
        }
        Marker marker = this.f22966f;
        if (marker != null) {
            marker.remove();
            this.f22966f.destroy();
            this.f22966f = null;
            C1533bl c1533bl = this.f22972l;
            if (c1533bl != null) {
                c1533bl.m18276a((Marker) null);
            }
        }
    }

    /* renamed from: f */
    private void m18313f() {
        try {
            if (this.f22967g == null) {
                AbstractC1783y abstractC1783y = this.f22965e;
                CircleOptions circleOptions = new CircleOptions();
                circleOptions.zIndex(1.0f);
                this.f22967g = abstractC1783y.addCircle(circleOptions);
            }
            if (this.f22967g != null) {
                if (this.f22967g.getStrokeWidth() != this.f22968h.getStrokeWidth()) {
                    this.f22967g.setStrokeWidth(this.f22968h.getStrokeWidth());
                }
                if (this.f22967g.getFillColor() != this.f22968h.getRadiusFillColor()) {
                    this.f22967g.setFillColor(this.f22968h.getRadiusFillColor());
                }
                if (this.f22967g.getStrokeColor() != this.f22968h.getStrokeColor()) {
                    this.f22967g.setStrokeColor(this.f22968h.getStrokeColor());
                }
                if (this.f22969i != null) {
                    this.f22967g.setCenter(this.f22969i);
                }
                this.f22967g.setRadius(this.f22970j);
                this.f22967g.setVisible(true);
            }
            if (this.f22966f == null) {
                AbstractC1783y abstractC1783y2 = this.f22965e;
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.visible(false);
                this.f22966f = abstractC1783y2.addMarker(markerOptions);
            }
            if (this.f22966f != null) {
                this.f22966f.setAnchor(this.f22968h.getAnchorU(), this.f22968h.getAnchorV());
                if (this.f22966f.getIcons() != null && this.f22966f.getIcons().size() != 0) {
                    if (this.f22968h.getMyLocationIcon() != null && !this.f22966f.getIcons().get(0).equals(this.f22968h.getMyLocationIcon())) {
                        this.f22966f.setIcon(this.f22968h.getMyLocationIcon());
                    }
                } else {
                    this.f22966f.setIcon(this.f22968h.getMyLocationIcon());
                }
                if (this.f22969i != null) {
                    this.f22966f.setPosition(this.f22969i);
                    this.f22966f.setVisible(true);
                }
            }
            m18317c();
            if (this.f22972l != null) {
                this.f22972l.m18276a(this.f22966f);
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "MyLocationOverlay", "myLocStyle");
        }
    }

    /* renamed from: com.amap.api.mapcore2d.bc$a */
    /* loaded from: classes19.dex */
    public class C1524a implements TypeEvaluator {
        static {
            Covode.recordClassIndex(5072);
        }

        public C1524a() {
        }

        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f, Object obj, Object obj2) {
            LatLng latLng = (LatLng) obj;
            LatLng latLng2 = (LatLng) obj2;
            double d = f;
            return new LatLng(latLng.latitude + ((latLng2.latitude - latLng.latitude) * d), latLng.longitude + (d * (latLng2.longitude - latLng.longitude)));
        }
    }

    /* renamed from: a */
    public void m18328a(float f) {
        Marker marker = this.f22966f;
        if (marker != null) {
            marker.setRotateAngle(f);
        }
    }

    /* renamed from: b */
    private void m18319b(float f) {
        if (!this.f22980t) {
            return;
        }
        float f2 = f % 360.0f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        Marker marker = this.f22966f;
        if (marker != null) {
            marker.setRotateAngle(-f2);
        }
    }

    /* renamed from: a */
    public void m18327a(int i) {
        m18326a(i, false);
    }

    /* renamed from: a */
    public void m18321a(boolean z) {
        Circle circle = this.f22967g;
        if (circle != null && circle.isVisible() != z) {
            this.f22967g.setVisible(z);
        }
        Marker marker = this.f22966f;
        if (marker != null && marker.isVisible() != z) {
            this.f22966f.setVisible(z);
        }
    }

    /* renamed from: a */
    private void m18323a(LatLng latLng) {
        LatLng position = this.f22966f.getPosition();
        if (position == null) {
            position = new LatLng(0.0d, 0.0d);
        }
        if (this.f22961a == null) {
            this.f22961a = new C1524a();
        }
        ValueAnimator valueAnimator = this.f22962b;
        if (valueAnimator == null) {
            this.f22962b = ValueAnimator.ofObject(new C1524a(), position, latLng);
            this.f22962b.addListener(this.f22963c);
            this.f22962b.addUpdateListener(this.f22964d);
            this.f22962b.setDuration(1000L);
        } else {
            valueAnimator.setObjectValues(position, latLng);
            this.f22962b.setEvaluator(this.f22961a);
        }
        if (position.latitude == 0.0d && position.longitude == 0.0d) {
            this.f22962b.setDuration(1L);
        } else {
            this.f22962b.setDuration(1000L);
        }
        this.f22962b.start();
    }

    /* renamed from: a */
    public void m18325a(Location location) {
        if (location == null) {
            return;
        }
        MyLocationStyle myLocationStyle = this.f22968h;
        if (myLocationStyle != null) {
            m18321a(myLocationStyle.isMyLocationShowing());
            if (!this.f22968h.isMyLocationShowing()) {
                return;
            }
        }
        this.f22969i = new LatLng(location.getLatitude(), location.getLongitude());
        this.f22970j = location.getAccuracy();
        if (this.f22966f == null && this.f22967g == null) {
            m18315d();
        }
        Circle circle = this.f22967g;
        if (circle != null) {
            try {
                if (this.f22970j != -1.0d) {
                    circle.setRadius(this.f22970j);
                }
            } catch (Throwable th) {
                C1616do.m17866c(th, "MyLocationOverlay", "setCentAndRadius");
            }
        }
        m18319b(location.getBearing());
        if (!this.f22969i.equals(this.f22966f.getPosition())) {
            m18323a(this.f22969i);
        } else {
            m18317c();
        }
    }

    /* renamed from: a */
    public void m18322a(MyLocationStyle myLocationStyle) {
        try {
            this.f22968h = myLocationStyle;
            m18321a(this.f22968h.isMyLocationShowing());
            if (!this.f22968h.isMyLocationShowing()) {
                if (this.f22972l != null) {
                    this.f22972l.m18275a(false);
                }
                this.f22973m = this.f22968h.getMyLocationType();
            } else if (this.f22966f == null && this.f22967g == null) {
            } else {
                if (this.f22972l != null) {
                    this.f22972l.m18276a(this.f22966f);
                }
                m18315d();
                m18327a(this.f22968h.getMyLocationType());
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "MyLocationOverlay", "setMyLocationStyle");
        }
    }

    public C1521bc(AbstractC1783y abstractC1783y, Context context) {
        this.f22971k = context.getApplicationContext();
        this.f22965e = abstractC1783y;
        this.f22972l = new C1533bl(this.f22971k, abstractC1783y);
        m18326a(1, true);
    }

    /* renamed from: a */
    private void m18326a(int i, boolean z) {
        this.f22973m = i;
        this.f22974n = false;
        this.f22978r = false;
        this.f22981u = false;
        this.f22982v = false;
        int i2 = this.f22973m;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f22978r = true;
                    this.f22979s = false;
                    this.f22980t = true;
                }
            } else {
                this.f22978r = true;
                this.f22979s = true;
                this.f22980t = true;
            }
        }
        if (this.f22972l != null) {
            if (!this.f22981u && !this.f22982v) {
                m18320b();
                return;
            }
            if (this.f22982v) {
                this.f22972l.m18275a(true);
                if (!z) {
                    try {
                        this.f22965e.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                this.f22972l.m18275a(false);
            }
            this.f22972l.m18278a();
        }
    }
}
