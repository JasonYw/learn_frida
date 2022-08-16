package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.amap.api.mapcore2d.as */
/* loaded from: classes19.dex */
public class C1485as {

    /* renamed from: a */
    public GestureDetector$OnDoubleTapListenerC1507b f22707a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C1764m> f22708b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public CopyOnWriteArrayList f22709c = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(5033);
    }

    /* renamed from: a */
    public void m18555a(C1764m c1764m) {
        this.f22708b.add(c1764m);
    }

    public C1485as(GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b) {
        this.f22707a = gestureDetector$OnDoubleTapListenerC1507b;
    }
}
