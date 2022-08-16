package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.model.CameraPosition;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.p */
/* loaded from: classes19.dex */
public class C1768p extends LinearLayout {

    /* renamed from: a */
    public Bitmap f24005a;

    /* renamed from: b */
    public Bitmap f24006b;

    /* renamed from: c */
    public ImageView f24007c;

    /* renamed from: d */
    public C1485as f24008d;

    /* renamed from: e */
    public AbstractC1783y f24009e;

    static {
        Covode.recordClassIndex(5316);
    }

    /* renamed from: a */
    public void m17207a() {
        try {
            if (this.f24005a != null) {
                this.f24005a.recycle();
            }
            if (this.f24006b != null) {
                this.f24006b.recycle();
            }
            this.f24005a = null;
            this.f24006b = null;
        } catch (Exception e) {
            C1569cm.m18147a(e, "CompassView", "destory");
        }
    }

    public C1768p(Context context, C1485as c1485as, AbstractC1783y abstractC1783y) {
        super(context);
        this.f24008d = c1485as;
        this.f24009e = abstractC1783y;
        try {
            Bitmap m18149a = C1569cm.m18149a("maps_dav_compass_needle_large2d.png");
            this.f24006b = C1569cm.m18154a(m18149a, C1771q.f24012a * 0.8f);
            if (this.f24006b != null) {
                Bitmap m18154a = C1569cm.m18154a(m18149a, C1771q.f24012a * 0.7f);
                this.f24005a = C116971W2r.LIZ(this.f24006b.getWidth(), this.f24006b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f24005a);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(m18154a, (this.f24006b.getWidth() - m18154a.getWidth()) / 2, (this.f24006b.getHeight() - m18154a.getHeight()) / 2, paint);
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "CompassView", "CompassView");
        }
        this.f24007c = new ImageView(context);
        this.f24007c.setScaleType(ImageView.ScaleType.MATRIX);
        this.f24007c.setImageBitmap(this.f24005a);
        this.f24007c.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore2d.p.1
            static {
                Covode.recordClassIndex(5317);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.f24007c.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore2d.p.2
            static {
                Covode.recordClassIndex(5318);
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    C1768p.this.f24007c.setImageBitmap(C1768p.this.f24006b);
                    return false;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    try {
                        C1768p.this.f24007c.setImageBitmap(C1768p.this.f24005a);
                        CameraPosition cameraPosition = C1768p.this.f24009e.getCameraPosition();
                        C1768p.this.f24009e.animateCamera(new CameraUpdate(C1764m.m17223a(new CameraPosition(cameraPosition.target, cameraPosition.zoom, 0.0f, 0.0f))));
                        return false;
                    } catch (Exception e) {
                        C1569cm.m18147a(e, "CompassView", "onTouch");
                        return false;
                    }
                }
            }
        });
        addView(this.f24007c);
    }
}
