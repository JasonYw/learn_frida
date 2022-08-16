package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ap */
/* loaded from: classes19.dex */
public class C1477ap extends LinearLayout {

    /* renamed from: a */
    public Bitmap f22683a;

    /* renamed from: b */
    public Bitmap f22684b;

    /* renamed from: c */
    public Bitmap f22685c;

    /* renamed from: d */
    public ImageView f22686d;

    /* renamed from: e */
    public AbstractC1783y f22687e;

    /* renamed from: f */
    public boolean f22688f;

    static {
        Covode.recordClassIndex(5025);
    }

    /* renamed from: a */
    public void m18613a() {
        try {
            if (this.f22683a != null) {
                this.f22683a.recycle();
            }
            if (this.f22684b != null) {
                this.f22684b.recycle();
            }
            if (this.f22685c != null) {
                this.f22685c.recycle();
            }
            this.f22683a = null;
            this.f22684b = null;
            this.f22685c = null;
        } catch (Exception e) {
            C1569cm.m18147a(e, "LocationView", "destory");
        }
    }

    /* renamed from: a */
    public void m18611a(boolean z) {
        this.f22688f = z;
        if (z) {
            this.f22686d.setImageBitmap(this.f22683a);
        } else {
            this.f22686d.setImageBitmap(this.f22685c);
        }
        this.f22686d.postInvalidate();
    }

    public C1477ap(Context context, C1485as c1485as, AbstractC1783y abstractC1783y) {
        super(context);
        this.f22687e = abstractC1783y;
        try {
            this.f22683a = C1569cm.m18149a("location_selected2d.png");
            this.f22684b = C1569cm.m18149a("location_pressed2d.png");
            this.f22683a = C1569cm.m18154a(this.f22683a, C1771q.f24012a);
            this.f22684b = C1569cm.m18154a(this.f22684b, C1771q.f24012a);
            this.f22685c = C1569cm.m18149a("location_unselected2d.png");
            this.f22685c = C1569cm.m18154a(this.f22685c, C1771q.f24012a);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "LocationView", "LocationView");
        }
        this.f22686d = new ImageView(context);
        this.f22686d.setImageBitmap(this.f22683a);
        this.f22686d.setPadding(0, 20, 20, 0);
        this.f22686d.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore2d.ap.1
            static {
                Covode.recordClassIndex(5026);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.f22686d.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore2d.ap.2
            static {
                Covode.recordClassIndex(5027);
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C1477ap.this.f22688f) {
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    C1477ap.this.f22686d.setImageBitmap(C1477ap.this.f22684b);
                } else if (motionEvent.getAction() == 1) {
                    try {
                        C1477ap.this.f22686d.setImageBitmap(C1477ap.this.f22683a);
                        C1477ap.this.f22687e.setMyLocationEnabled(true);
                        Location myLocation = C1477ap.this.f22687e.getMyLocation();
                        if (myLocation == null) {
                            return false;
                        }
                        LatLng latLng = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                        C1477ap.this.f22687e.showMyLocationOverlay(myLocation);
                        C1477ap.this.f22687e.moveCamera(new CameraUpdate(C1764m.m17221a(latLng, C1477ap.this.f22687e.getZoomLevel())));
                        return false;
                    } catch (Exception e) {
                        C1569cm.m18147a(e, "LocationView", "onTouch");
                        return false;
                    }
                }
                return false;
            }
        });
        addView(this.f22686d);
    }
}
