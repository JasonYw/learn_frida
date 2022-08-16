package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.i */
/* loaded from: classes22.dex */
public class C1759i {

    /* renamed from: a */
    public Bitmap f23944a;

    /* renamed from: b */
    public Canvas f23945b;

    /* renamed from: c */
    public Bitmap.Config f23946c;

    static {
        Covode.recordClassIndex(5307);
    }

    public C1759i(Bitmap.Config config) {
        this.f23946c = config;
    }

    /* renamed from: a */
    public void m17247a(Bitmap bitmap) {
        this.f23944a = bitmap;
        this.f23945b = new Canvas(this.f23944a);
    }

    /* renamed from: a */
    public void m17246a(AbstractC1760j abstractC1760j) {
        this.f23945b.save(1);
        abstractC1760j.mo17245a(this.f23945b);
        this.f23945b.restore();
    }
}
