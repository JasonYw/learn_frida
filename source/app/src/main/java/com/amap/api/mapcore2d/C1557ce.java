package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ce */
/* loaded from: classes19.dex */
public class C1557ce extends LinearLayout {

    /* renamed from: a */
    public Bitmap f23129a;

    /* renamed from: b */
    public Bitmap f23130b;

    /* renamed from: c */
    public Bitmap f23131c;

    /* renamed from: d */
    public Bitmap f23132d;

    /* renamed from: e */
    public Bitmap f23133e;

    /* renamed from: f */
    public Bitmap f23134f;

    /* renamed from: g */
    public ImageView f23135g;

    /* renamed from: h */
    public ImageView f23136h;

    /* renamed from: i */
    public View$OnKeyListenerC1480aq f23137i;

    /* renamed from: j */
    public AbstractC1783y f23138j;

    /* renamed from: k */
    public int f23139k;

    static {
        Covode.recordClassIndex(5105);
    }

    /* renamed from: b */
    public int m18189b() {
        return this.f23139k;
    }

    /* renamed from: a */
    public void m18193a() {
        try {
            if (this.f23129a != null) {
                this.f23129a.recycle();
            }
            if (this.f23130b != null) {
                this.f23130b.recycle();
            }
            if (this.f23131c != null) {
                this.f23131c.recycle();
            }
            if (this.f23132d != null) {
                this.f23132d.recycle();
            }
            if (this.f23133e != null) {
                this.f23133e.recycle();
            }
            if (this.f23134f != null) {
                this.f23134f.recycle();
            }
            this.f23129a = null;
            this.f23130b = null;
            this.f23131c = null;
            this.f23132d = null;
            this.f23133e = null;
            this.f23134f = null;
        } catch (Exception e) {
            C1569cm.m18147a(e, "ZoomControllerView", "destory");
        }
    }

    /* renamed from: a */
    public void m18191a(int i) {
        this.f23139k = i;
        removeView(this.f23135g);
        removeView(this.f23136h);
        addView(this.f23135g);
        addView(this.f23136h);
    }

    /* renamed from: a */
    public void m18192a(float f) {
        try {
            if (f < this.f23138j.getMaxZoomLevel() && f > this.f23138j.getMinZoomLevel()) {
                this.f23135g.setImageBitmap(this.f23129a);
                this.f23136h.setImageBitmap(this.f23131c);
            } else if (f <= this.f23138j.getMinZoomLevel()) {
                this.f23136h.setImageBitmap(this.f23132d);
                this.f23135g.setImageBitmap(this.f23129a);
            } else if (f >= this.f23138j.getMaxZoomLevel()) {
                this.f23135g.setImageBitmap(this.f23130b);
                this.f23136h.setImageBitmap(this.f23131c);
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "ZoomControllerView", "setZoomBitmap");
        }
    }

    public C1557ce(Context context, View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq, AbstractC1783y abstractC1783y) {
        super(context);
        setWillNotDraw(false);
        this.f23137i = view$OnKeyListenerC1480aq;
        this.f23138j = abstractC1783y;
        try {
            this.f23129a = C1569cm.m18149a("zoomin_selected2d.png");
            this.f23129a = C1569cm.m18154a(this.f23129a, C1771q.f24012a);
            this.f23130b = C1569cm.m18149a("zoomin_unselected2d.png");
            this.f23130b = C1569cm.m18154a(this.f23130b, C1771q.f24012a);
            this.f23131c = C1569cm.m18149a("zoomout_selected2d.png");
            this.f23131c = C1569cm.m18154a(this.f23131c, C1771q.f24012a);
            this.f23132d = C1569cm.m18149a("zoomout_unselected2d.png");
            this.f23132d = C1569cm.m18154a(this.f23132d, C1771q.f24012a);
            this.f23133e = C1569cm.m18149a("zoomin_pressed2d.png");
            this.f23134f = C1569cm.m18149a("zoomout_pressed2d.png");
            this.f23133e = C1569cm.m18154a(this.f23133e, C1771q.f24012a);
            this.f23134f = C1569cm.m18154a(this.f23134f, C1771q.f24012a);
            this.f23135g = new ImageView(context);
            this.f23135g.setImageBitmap(this.f23129a);
            this.f23135g.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore2d.ce.1
                static {
                    Covode.recordClassIndex(5106);
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1557ce.this.f23136h.setImageBitmap(C1557ce.this.f23131c);
                    if (C1557ce.this.f23138j.getZoomLevel() > ((int) C1557ce.this.f23138j.getMaxZoomLevel()) - 2) {
                        C1557ce.this.f23135g.setImageBitmap(C1557ce.this.f23130b);
                    } else {
                        C1557ce.this.f23135g.setImageBitmap(C1557ce.this.f23129a);
                    }
                    C1557ce c1557ce = C1557ce.this;
                    c1557ce.m18192a(c1557ce.f23138j.getZoomLevel() + 1.0f);
                    C1557ce.this.f23137i.m18580c();
                }
            });
            this.f23136h = new ImageView(context);
            this.f23136h.setImageBitmap(this.f23131c);
            this.f23136h.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore2d.ce.2
                static {
                    Covode.recordClassIndex(5107);
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1557ce.this.f23135g.setImageBitmap(C1557ce.this.f23129a);
                    C1557ce c1557ce = C1557ce.this;
                    c1557ce.m18192a(c1557ce.f23138j.getZoomLevel() - 1.0f);
                    if (C1557ce.this.f23138j.getZoomLevel() < ((int) C1557ce.this.f23138j.getMinZoomLevel()) + 2) {
                        C1557ce.this.f23136h.setImageBitmap(C1557ce.this.f23132d);
                    } else {
                        C1557ce.this.f23136h.setImageBitmap(C1557ce.this.f23131c);
                    }
                    C1557ce.this.f23137i.m18576d();
                }
            });
            this.f23135g.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore2d.ce.3
                static {
                    Covode.recordClassIndex(5108);
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C1557ce.this.f23138j.getZoomLevel() >= C1557ce.this.f23138j.getMaxZoomLevel()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        C1557ce.this.f23135g.setImageBitmap(C1557ce.this.f23133e);
                    } else if (motionEvent.getAction() == 1) {
                        C1557ce.this.f23135g.setImageBitmap(C1557ce.this.f23129a);
                        try {
                            C1557ce.this.f23138j.animateCamera(new CameraUpdate(C1764m.m17216b()));
                            return false;
                        } catch (RemoteException e) {
                            C1569cm.m18147a(e, "ZoomControllerView", "ontouch");
                            return false;
                        }
                    }
                    return false;
                }
            });
            this.f23136h.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore2d.ce.4
                static {
                    Covode.recordClassIndex(5109);
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C1557ce.this.f23138j.getZoomLevel() <= C1557ce.this.f23138j.getMinZoomLevel()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        C1557ce.this.f23136h.setImageBitmap(C1557ce.this.f23134f);
                    } else if (motionEvent.getAction() == 1) {
                        C1557ce.this.f23136h.setImageBitmap(C1557ce.this.f23131c);
                        try {
                            C1557ce.this.f23138j.animateCamera(new CameraUpdate(C1764m.m17213c()));
                            return false;
                        } catch (RemoteException e) {
                            C1569cm.m18147a(e, "ZoomControllerView", "onTouch");
                            return false;
                        }
                    }
                    return false;
                }
            });
            this.f23135g.setPadding(0, 0, 20, -2);
            this.f23136h.setPadding(0, 0, 20, 20);
            setOrientation(1);
            addView(this.f23135g);
            addView(this.f23136h);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "ZoomControllerView", "ZoomControllerView");
        }
    }
}
