package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.os.Handler;
import android.os.RemoteException;
import com.amap.api.interfaces.IOverlay;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.PolylineOptions;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.amap.api.mapcore2d.v */
/* loaded from: classes19.dex */
public class C1778v {

    /* renamed from: b */
    public static int f24044b;

    /* renamed from: a */
    public AbstractC1783y f24045a;

    /* renamed from: c */
    public CopyOnWriteArrayList<AbstractC1464ad> f24046c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public C1780a f24047d = new C1780a();

    /* renamed from: e */
    public Handler f24048e = new Handler();

    /* renamed from: f */
    public Runnable f24049f = new Runnable() { // from class: com.amap.api.mapcore2d.v.1
        static {
            Covode.recordClassIndex(5327);
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Object[] array = C1778v.this.f24046c.toArray();
                Arrays.sort(array, C1778v.this.f24047d);
                C1778v.this.f24046c.clear();
                for (Object obj : array) {
                    C1778v.this.f24046c.add((AbstractC1464ad) obj);
                }
            } catch (Throwable th) {
                C1616do.m17866c(th, "MapOverlayImageView", "changeOverlayIndex");
            }
        }
    };

    static {
        Covode.recordClassIndex(5326);
    }

    /* renamed from: a */
    public void m17176a(AbstractC1464ad abstractC1464ad) {
        try {
            m17167b(abstractC1464ad.getId());
            this.f24046c.add(abstractC1464ad);
            m17166c();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "GLOverlayLayer", "addOverlay");
        }
    }

    /* renamed from: c */
    private void m17166c() {
        this.f24048e.removeCallbacks(this.f24049f);
        this.f24048e.postDelayed(this.f24049f, 10L);
    }

    /* renamed from: b */
    public void m17169b() {
        try {
            Iterator<AbstractC1464ad> it = this.f24046c.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            m17178a();
        } catch (Exception e) {
            C1569cm.m18147a(e, "GLOverlayLayer", "destory");
        }
    }

    /* renamed from: a */
    public void m17178a() {
        Iterator<AbstractC1464ad> it = this.f24046c.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        try {
            Iterator<AbstractC1464ad> it2 = this.f24046c.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            this.f24046c.clear();
        } catch (Exception e) {
            C1569cm.m18147a(e, "GLOverlayLayer", "clear");
        }
    }

    /* renamed from: com.amap.api.mapcore2d.v$a */
    /* loaded from: classes19.dex */
    public class C1780a implements Comparator<Object> {
        static {
            Covode.recordClassIndex(5328);
        }

        public C1780a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IOverlay iOverlay = (IOverlay) obj;
            IOverlay iOverlay2 = (IOverlay) obj2;
            if (iOverlay != null && iOverlay2 != null) {
                try {
                    if (iOverlay.getZIndex() > iOverlay2.getZIndex()) {
                        return 1;
                    }
                    if (iOverlay.getZIndex() < iOverlay2.getZIndex()) {
                        return -1;
                    }
                    return 0;
                } catch (Exception e) {
                    C1569cm.m18147a(e, "GLOverlayLayer", "compare");
                    return 0;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized String m17170a(String str) {
        String str2;
        synchronized (C1778v.class) {
            f24044b++;
            str2 = str + f24044b;
        }
        return str2;
    }

    /* renamed from: b */
    public boolean m17167b(String str) {
        try {
            AbstractC1464ad m17165c = m17165c(str);
            if (m17165c != null) {
                return this.f24046c.remove(m17165c);
            }
            return false;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "GLOverlayLayer", "removeOverlay");
            return false;
        }
    }

    public C1778v(AbstractC1783y abstractC1783y) {
        this.f24045a = abstractC1783y;
    }

    /* renamed from: c */
    private AbstractC1464ad m17165c(String str) {
        Iterator<AbstractC1464ad> it = this.f24046c.iterator();
        while (it.hasNext()) {
            AbstractC1464ad next = it.next();
            if (next != null && next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized AbstractC1466af m17172a(PolygonOptions polygonOptions) {
        if (polygonOptions == null) {
            return null;
        }
        C1526be c1526be = new C1526be(this.f24045a);
        c1526be.setFillColor(polygonOptions.getFillColor());
        c1526be.setPoints(polygonOptions.getPoints());
        c1526be.setVisible(polygonOptions.isVisible());
        c1526be.setStrokeWidth(polygonOptions.getStrokeWidth());
        c1526be.setZIndex(polygonOptions.getZIndex());
        c1526be.setStrokeColor(polygonOptions.getStrokeColor());
        m17176a(c1526be);
        return c1526be;
    }

    /* renamed from: a */
    public synchronized AbstractC1461aa m17173a(GroundOverlayOptions groundOverlayOptions) {
        if (groundOverlayOptions == null) {
            return null;
        }
        C1782x c1782x = new C1782x(this.f24045a);
        c1782x.setAnchor(groundOverlayOptions.getAnchorU(), groundOverlayOptions.getAnchorV());
        c1782x.setDimensions(groundOverlayOptions.getWidth(), groundOverlayOptions.getHeight());
        c1782x.setImage(groundOverlayOptions.getImage());
        c1782x.setPosition(groundOverlayOptions.getLocation());
        c1782x.setPositionFromBounds(groundOverlayOptions.getBounds());
        c1782x.setBearing(groundOverlayOptions.getBearing());
        c1782x.setTransparency(groundOverlayOptions.getTransparency());
        c1782x.setVisible(groundOverlayOptions.isVisible());
        c1782x.setZIndex(groundOverlayOptions.getZIndex());
        m17176a(c1782x);
        return c1782x;
    }

    /* renamed from: a */
    public synchronized AbstractC1467ag m17171a(PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            return null;
        }
        C1527bf c1527bf = new C1527bf(this.f24045a);
        c1527bf.setColor(polylineOptions.getColor());
        c1527bf.setDottedLine(polylineOptions.isDottedLine());
        c1527bf.setGeodesic(polylineOptions.isGeodesic());
        c1527bf.setPoints(polylineOptions.getPoints());
        c1527bf.setVisible(polylineOptions.isVisible());
        c1527bf.setWidth(polylineOptions.getWidth());
        c1527bf.setZIndex(polylineOptions.getZIndex());
        m17176a(c1527bf);
        return c1527bf;
    }

    /* renamed from: a */
    public synchronized AbstractC1784z m17174a(CircleOptions circleOptions) {
        if (circleOptions == null) {
            return null;
        }
        C1767o c1767o = new C1767o(this.f24045a);
        c1767o.setFillColor(circleOptions.getFillColor());
        c1767o.setCenter(circleOptions.getCenter());
        c1767o.setVisible(circleOptions.isVisible());
        c1767o.setStrokeWidth(circleOptions.getStrokeWidth());
        c1767o.setZIndex(circleOptions.getZIndex());
        c1767o.setStrokeColor(circleOptions.getStrokeColor());
        c1767o.setRadius(circleOptions.getRadius());
        m17176a(c1767o);
        return c1767o;
    }

    /* renamed from: a */
    public void m17177a(Canvas canvas) {
        Object[] array = this.f24046c.toArray();
        Arrays.sort(array, this.f24047d);
        this.f24046c.clear();
        for (Object obj : array) {
            try {
                this.f24046c.add((AbstractC1464ad) obj);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "GLOverlayLayer", "draw");
            }
        }
        int size = this.f24046c.size();
        Iterator<AbstractC1464ad> it = this.f24046c.iterator();
        while (it.hasNext()) {
            AbstractC1464ad next = it.next();
            try {
                if (next.isVisible()) {
                    if (size > 20) {
                        if (next.mo17155a()) {
                            next.mo17154a(canvas);
                        }
                    } else {
                        next.mo17154a(canvas);
                    }
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "GLOverlayLayer", "draw");
            }
        }
    }
}
