package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.amap.api.interfaces.ITileOverlay;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.amap.api.mapcore2d.bu */
/* loaded from: classes19.dex */
public class C1543bu extends View {

    /* renamed from: b */
    public AbstractC1783y f23069b;

    /* renamed from: c */
    public CopyOnWriteArrayList<AbstractC1472ak> f23070c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public C1545a f23071d = new C1545a(this, null);

    /* renamed from: a */
    public CopyOnWriteArrayList<Integer> f23068a = new CopyOnWriteArrayList<>();

    /* renamed from: com.amap.api.mapcore2d.bu$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C15441 {
        static {
            Covode.recordClassIndex(5092);
        }
    }

    static {
        Covode.recordClassIndex(5091);
    }

    /* renamed from: b */
    public void m18246b() {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next != null) {
                next.remove();
            }
        }
        this.f23070c.clear();
    }

    /* renamed from: d */
    public void m18243d() {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next != null) {
                next.mo18256a();
            }
        }
    }

    /* renamed from: e */
    public void m18242e() {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next != null) {
                next.mo18252b();
            }
        }
    }

    /* renamed from: f */
    public void m18241f() {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next != null) {
                next.mo18251c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public void m18244c() {
        Object[] array = this.f23070c.toArray();
        Arrays.sort(array, this.f23071d);
        this.f23070c.clear();
        for (Object obj : array) {
            if (obj != null) {
                this.f23070c.add(obj);
            }
        }
    }

    /* renamed from: a */
    public boolean m18250a() {
        if (this.f23070c.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.amap.api.mapcore2d.bu$a */
    /* loaded from: classes19.dex */
    public class C1545a implements Comparator<Object> {
        static {
            Covode.recordClassIndex(5093);
        }

        public C1545a() {
        }

        public /* synthetic */ C1545a(C1543bu c1543bu, C15441 c15441) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            ITileOverlay iTileOverlay = (ITileOverlay) obj;
            ITileOverlay iTileOverlay2 = (ITileOverlay) obj2;
            if (iTileOverlay != null && iTileOverlay2 != null) {
                try {
                    if (iTileOverlay.getZIndex() > iTileOverlay2.getZIndex()) {
                        return 1;
                    }
                    if (iTileOverlay.getZIndex() < iTileOverlay2.getZIndex()) {
                        return -1;
                    }
                    return 0;
                } catch (Exception e) {
                    C1569cm.m18147a(e, "TileOverlayView", "compare");
                    return 0;
                }
            }
            return 0;
        }
    }

    /* renamed from: b */
    public boolean m18245b(AbstractC1472ak abstractC1472ak) {
        return this.f23070c.remove(abstractC1472ak);
    }

    /* renamed from: a */
    public void m18248a(AbstractC1472ak abstractC1472ak) {
        if (abstractC1472ak != null) {
            m18245b(abstractC1472ak);
            this.f23070c.add(abstractC1472ak);
            m18244c();
        }
    }

    /* renamed from: a */
    public void m18249a(Canvas canvas) {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next.isVisible()) {
                next.mo18255a(canvas);
            }
        }
    }

    /* renamed from: a */
    public void m18247a(boolean z) {
        Iterator<AbstractC1472ak> it = this.f23070c.iterator();
        while (it.hasNext()) {
            AbstractC1472ak next = it.next();
            if (next != null && next.isVisible()) {
                next.mo18253a(z);
            }
        }
    }

    public C1543bu(Context context, AbstractC1783y abstractC1783y) {
        super(context);
        this.f23069b = abstractC1783y;
    }
}
