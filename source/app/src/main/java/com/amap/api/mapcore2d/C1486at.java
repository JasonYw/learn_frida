package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.amap.api.mapcore2d.at */
/* loaded from: classes19.dex */
public class C1486at extends View {

    /* renamed from: a */
    public GestureDetector$OnDoubleTapListenerC1507b f22710a;

    /* renamed from: h */
    public C1465ae f22717h;

    /* renamed from: i */
    public AbstractC1462ab f22718i;

    /* renamed from: c */
    public ArrayList<AbstractC1471aj> f22712c = new ArrayList<>(8);

    /* renamed from: d */
    public ArrayList<AbstractC1462ab> f22713d = new ArrayList<>(8);

    /* renamed from: e */
    public volatile int f22714e = 0;

    /* renamed from: b */
    public C1489a f22711b = new C1489a();

    /* renamed from: f */
    public Handler f22715f = new Handler();

    /* renamed from: g */
    public Runnable f22716g = new Runnable() { // from class: com.amap.api.mapcore2d.at.1
        static {
            Covode.recordClassIndex(5035);
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Collections.sort(C1486at.this.f22713d, C1486at.this.f22711b);
                Collections.sort(C1486at.this.f22712c, C1486at.this.f22711b);
                C1486at.this.postInvalidate();
            } catch (Throwable th) {
                try {
                    C1616do.m17866c(th, "MapOverlayImageView", "changeOverlayIndex");
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: j */
    public AbstractC1462ab f22719j = null;

    /* renamed from: k */
    public float f22720k = 0.0f;

    /* renamed from: l */
    public CopyOnWriteArrayList<Integer> f22721l = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(5034);
    }

    /* renamed from: e */
    public AbstractC1462ab m18535e() {
        return this.f22718i;
    }

    /* renamed from: h */
    private int m18530h() {
        int i = this.f22714e;
        this.f22714e = i + 1;
        return i;
    }

    /* renamed from: a */
    public GestureDetector$OnDoubleTapListenerC1507b m18554a() {
        return this.f22710a;
    }

    /* renamed from: b */
    public int m18545b() {
        return this.f22713d.size();
    }

    /* renamed from: d */
    public void m18537d() {
        this.f22715f.removeCallbacks(this.f22716g);
        this.f22715f.postDelayed(this.f22716g, 5L);
    }

    /* renamed from: f */
    public void m18533f() {
        try {
            if (this.f22715f != null) {
                this.f22715f.removeCallbacksAndMessages(null);
            }
            m18539c();
        } catch (Exception e) {
            C1569cm.m18147a(e, "MapOverlayImageView", "destory");
        }
    }

    /* renamed from: c */
    public synchronized void m18539c() {
        try {
            if (this.f22713d != null) {
                Iterator<AbstractC1462ab> it = this.f22713d.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f22713d.clear();
            }
            if (this.f22712c != null) {
                this.f22712c.clear();
            }
            this.f22710a.postInvalidate();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MapOverlayImageView", "clear");
        }
    }

    /* renamed from: i */
    private void m18529i() {
        AbstractC1462ab abstractC1462ab;
        Iterator<AbstractC1462ab> it = this.f22713d.iterator();
        while (it.hasNext()) {
            AbstractC1462ab next = it.next();
            if (next != null && (abstractC1462ab = this.f22718i) != null && abstractC1462ab.getId().equals(next.getId())) {
                try {
                    if (this.f22718i.isViewMode()) {
                        return;
                    }
                } catch (RemoteException e) {
                    C1569cm.m18147a(e, "MapOverlayImageView", "redrawInfoWindow");
                }
                Rect mo18499a = next.mo18499a();
                this.f22717h = new C1465ae(mo18499a.left + (next.getWidth() / 2), mo18499a.top);
                this.f22710a.redrawInfoWindow();
            }
        }
    }

    /* renamed from: g */
    public synchronized List<Marker> m18531g() {
        ArrayList arrayList;
        AbstractC1462ab next;
        LatLng realPosition;
        arrayList = new ArrayList();
        Rect rect = new Rect(0, 0, this.f22710a.getMapWidth(), this.f22710a.getMapHeight());
        C1465ae c1465ae = new C1465ae();
        Iterator<AbstractC1462ab> it = this.f22713d.iterator();
        while (it.hasNext() && (realPosition = (next = it.next()).getRealPosition()) != null) {
            this.f22710a.mo17144b(realPosition.latitude, realPosition.longitude, c1465ae);
            if (m18552a(rect, c1465ae.f22658a, c1465ae.f22659b)) {
                arrayList.add(new Marker(next));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public boolean m18532f(AbstractC1462ab abstractC1462ab) {
        return this.f22710a.m18394b(abstractC1462ab);
    }

    /* renamed from: b */
    public synchronized void m18542b(AbstractC1471aj abstractC1471aj) {
        this.f22712c.remove(abstractC1471aj);
        postInvalidate();
    }

    /* renamed from: e */
    public void m18534e(AbstractC1462ab abstractC1462ab) {
        if (m18532f(abstractC1462ab)) {
            this.f22710a.m18385e();
        }
    }

    /* renamed from: a */
    public synchronized void m18549a(AbstractC1471aj abstractC1471aj) {
        this.f22712c.remove(abstractC1471aj);
        abstractC1471aj.setAddIndex(m18530h());
        this.f22712c.add(abstractC1471aj);
        Collections.sort(this.f22712c, this.f22711b);
    }

    /* renamed from: b */
    public synchronized boolean m18543b(AbstractC1462ab abstractC1462ab) {
        boolean remove;
        m18534e(abstractC1462ab);
        remove = this.f22713d.remove(abstractC1462ab);
        postInvalidate();
        this.f22710a.postInvalidate();
        return remove;
    }

    /* renamed from: d */
    public void m18536d(AbstractC1462ab abstractC1462ab) {
        if (abstractC1462ab == null) {
            return;
        }
        if (this.f22717h == null) {
            this.f22717h = new C1465ae();
        }
        Rect mo18499a = abstractC1462ab.mo18499a();
        this.f22717h = new C1465ae(mo18499a.left + (abstractC1462ab.getWidth() / 2), mo18499a.top);
        this.f22718i = abstractC1462ab;
        try {
            this.f22710a.getMainHandler().post(new Runnable() { // from class: com.amap.api.mapcore2d.at.2
                static {
                    Covode.recordClassIndex(5036);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1486at.this.f22710a.m18409a(C1486at.this.m18535e());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MapOverlayImageView", "showInfoWindow");
        }
    }

    /* renamed from: a */
    public synchronized AbstractC1462ab m18551a(MotionEvent motionEvent) {
        for (int size = this.f22713d.size() - 1; size >= 0; size--) {
            AbstractC1462ab abstractC1462ab = this.f22713d.get(size);
            if (abstractC1462ab != null && m18552a(abstractC1462ab.mo18499a(), (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return abstractC1462ab;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        r7.f22717h = new com.amap.api.mapcore2d.C1465ae(r4.left + (r5.getWidth() / 2), r4.top);
        r7.f22718i = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        r6 = r3;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m18544b(android.view.MotionEvent r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r6 = 0
            java.util.ArrayList<com.amap.api.mapcore2d.ab> r0 = r7.f22713d     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            int r2 = r0 + (-1)
        La:
            if (r2 < 0) goto L43
            java.util.ArrayList<com.amap.api.mapcore2d.ab> r0 = r7.f22713d     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.Throwable -> L45
            com.amap.api.mapcore2d.ab r5 = (com.amap.api.mapcore2d.AbstractC1462ab) r5     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L3f
            android.graphics.Rect r4 = r5.mo18499a()     // Catch: java.lang.Throwable -> L45
            float r0 = r8.getX()     // Catch: java.lang.Throwable -> L45
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L45
            float r0 = r8.getY()     // Catch: java.lang.Throwable -> L45
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L45
            boolean r3 = r7.m18552a(r4, r1, r0)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3f
            com.amap.api.mapcore2d.ae r2 = new com.amap.api.mapcore2d.ae     // Catch: java.lang.Throwable -> L45
            int r1 = r4.left     // Catch: java.lang.Throwable -> L45
            int r0 = r5.getWidth()     // Catch: java.lang.Throwable -> L45
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r4.top     // Catch: java.lang.Throwable -> L45
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L45
            r7.f22717h = r2     // Catch: java.lang.Throwable -> L45
            r7.f22718i = r5     // Catch: java.lang.Throwable -> L45
            goto L42
        L3f:
            int r2 = r2 + (-1)
            goto La
        L42:
            r6 = r3
        L43:
            monitor-exit(r7)
            return r6
        L45:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1486at.m18544b(android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    public synchronized void m18538c(AbstractC1462ab abstractC1462ab) {
        if (abstractC1462ab != null) {
            if (this.f22719j != abstractC1462ab) {
                if (this.f22719j != null && this.f22719j.getZIndex() == 2.14748365E9f) {
                    this.f22719j.setZIndex(this.f22720k);
                }
                this.f22720k = abstractC1462ab.getZIndex();
                this.f22719j = abstractC1462ab;
                abstractC1462ab.setZIndex(2.14748365E9f);
                m18537d();
            }
        }
    }

    /* renamed from: a */
    public synchronized AbstractC1462ab m18547a(String str) {
        Iterator<AbstractC1462ab> it = this.f22713d.iterator();
        while (it.hasNext()) {
            AbstractC1462ab next = it.next();
            if (next != null && next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void m18553a(Canvas canvas) {
        m18529i();
        Rect rect = new Rect(0, 0, this.f22710a.getMapWidth(), this.f22710a.getMapHeight());
        C1465ae c1465ae = new C1465ae();
        Iterator<AbstractC1462ab> it = this.f22713d.iterator();
        Iterator<AbstractC1471aj> it2 = this.f22712c.iterator();
        AbstractC1462ab m18540b = m18540b(it, rect, c1465ae);
        AbstractC1471aj m18546a = m18546a(it2, rect, c1465ae);
        while (m18540b != null) {
            while (m18546a != null) {
                if (m18540b.getZIndex() < m18546a.getZIndex() || (m18540b.getZIndex() == m18546a.getZIndex() && m18540b.getAddIndex() < m18546a.getAddIndex())) {
                    m18540b.mo18497a(canvas, this.f22710a);
                    m18540b = m18540b(it, rect, c1465ae);
                    break;
                }
                m18546a.draw(canvas);
                m18546a = m18546a(it2, rect, c1465ae);
            }
            m18540b.mo18497a(canvas, this.f22710a);
            m18540b = m18540b(it, rect, c1465ae);
        }
        while (m18546a != null) {
            m18546a.draw(canvas);
            m18546a = m18546a(it2, rect, c1465ae);
        }
    }

    /* renamed from: a */
    public synchronized void m18550a(AbstractC1462ab abstractC1462ab) {
        try {
            m18534e(abstractC1462ab);
            abstractC1462ab.setAddIndex(m18530h());
            this.f22713d.remove(abstractC1462ab);
            this.f22713d.add(abstractC1462ab);
            Collections.sort(this.f22713d, this.f22711b);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MapOverlayImageView", "addMarker");
        }
    }

    /* renamed from: com.amap.api.mapcore2d.at$a */
    /* loaded from: classes19.dex */
    public static class C1489a implements Serializable, Comparator<AbstractC1463ac> {
        static {
            Covode.recordClassIndex(5037);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC1463ac abstractC1463ac, AbstractC1463ac abstractC1463ac2) {
            if (abstractC1463ac != null && abstractC1463ac2 != null) {
                try {
                    if (abstractC1463ac.getZIndex() > abstractC1463ac2.getZIndex()) {
                        return 1;
                    }
                    if (abstractC1463ac.getZIndex() < abstractC1463ac2.getZIndex()) {
                        return -1;
                    }
                    return 0;
                } catch (Throwable th) {
                    C1569cm.m18147a(th, "MapOverlayImageView", "compare");
                    return 0;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public boolean m18552a(Rect rect, int i, int i2) {
        return rect.contains(i, i2);
    }

    public C1486at(Context context, AttributeSet attributeSet, GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b) {
        super(context, attributeSet);
        this.f22710a = gestureDetector$OnDoubleTapListenerC1507b;
    }

    /* renamed from: a */
    private AbstractC1471aj m18546a(Iterator<AbstractC1471aj> it, Rect rect, C1465ae c1465ae) {
        while (it.hasNext()) {
            AbstractC1471aj next = it.next();
            LatLng position = next.getPosition();
            if (position != null) {
                this.f22710a.mo17144b(position.latitude, position.longitude, c1465ae);
                if (m18552a(rect, c1465ae.f22658a, c1465ae.f22659b)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private AbstractC1462ab m18540b(Iterator<AbstractC1462ab> it, Rect rect, C1465ae c1465ae) {
        while (it.hasNext()) {
            AbstractC1462ab next = it.next();
            LatLng realPosition = next.getRealPosition();
            if (realPosition != null) {
                this.f22710a.mo17144b(realPosition.latitude, realPosition.longitude, c1465ae);
                if (m18552a(rect, c1465ae.f22658a, c1465ae.f22659b)) {
                    return next;
                }
            }
        }
        return null;
    }
}
