package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.amap.api.interfaces.ITileOverlay;
import com.amap.api.maps2d.model.TileOverlayOptions;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bt */
/* loaded from: classes19.dex */
public class C1542bt implements AbstractC1472ak {

    /* renamed from: a */
    public static int f23062a;

    /* renamed from: b */
    public C1543bu f23063b;

    /* renamed from: c */
    public C1475an f23064c;

    /* renamed from: d */
    public boolean f23065d;

    /* renamed from: e */
    public String f23066e;

    /* renamed from: f */
    public float f23067f;

    static {
        Covode.recordClassIndex(5090);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1472ak
    /* renamed from: a */
    public void mo18253a(boolean z) {
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public float getZIndex() {
        return this.f23067f;
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public boolean isVisible() {
        return this.f23065d;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1472ak
    /* renamed from: a */
    public void mo18256a() {
        this.f23064c.f22682q.mo17554c();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1472ak
    /* renamed from: b */
    public void mo18252b() {
        this.f23064c.f22682q.mo17553d();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1472ak
    /* renamed from: c */
    public void mo18251c() {
        this.f23064c.f22682q.mo17557b();
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public void clearTileCache() {
        try {
            this.f23064c.m18614b();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "TileOverlayDelegateImp", "remove");
        }
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public String getId() {
        if (this.f23066e == null) {
            this.f23066e = m18254a("TileOverlay");
        }
        return this.f23066e;
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public void remove() {
        try {
            this.f23063b.m18245b(this);
            this.f23064c.m18614b();
            this.f23064c.f22682q.mo17557b();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "TileOverlayDelegateImp", "remove");
        }
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public void setZIndex(float f) {
        this.f23067f = f;
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public void setVisible(boolean z) {
        this.f23065d = z;
        this.f23064c.m18615a(z);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1472ak
    /* renamed from: a */
    public void mo18255a(Canvas canvas) {
        this.f23064c.m18616a(canvas);
    }

    /* renamed from: a */
    public static String m18254a(String str) {
        f23062a++;
        return str + f23062a;
    }

    @Override // com.amap.api.interfaces.ITileOverlay
    public boolean equalsRemote(ITileOverlay iTileOverlay) {
        if (!equals(iTileOverlay) && !iTileOverlay.getId().equals(getId())) {
            return false;
        }
        return true;
    }

    public C1542bt(TileOverlayOptions tileOverlayOptions, C1543bu c1543bu, C1492av c1492av, C1499az c1499az, Context context) {
        this.f23063b = c1543bu;
        this.f23064c = new C1475an(c1492av);
        C1475an c1475an = this.f23064c;
        c1475an.f22668e = false;
        c1475an.f22670g = false;
        c1475an.f22669f = tileOverlayOptions.getDiskCacheEnabled();
        this.f23064c.f22679p = new C1536bn<>();
        this.f23064c.f22674k = tileOverlayOptions.getTileProvider();
        this.f23064c.f22677n = new C1515ba(c1499az.f22784e.f22793e, c1499az.f22784e.f22794f, false, 0L, this.f23064c);
        String diskCacheDir = tileOverlayOptions.getDiskCacheDir();
        if (TextUtils.isEmpty(diskCacheDir)) {
            this.f23064c.f22669f = false;
        }
        C1475an c1475an2 = this.f23064c;
        c1475an2.f22676m = diskCacheDir;
        c1475an2.f22678o = new C1776u(c1543bu.getContext(), false, this.f23064c);
        C1546bv c1546bv = new C1546bv(c1499az, this.f23064c);
        C1475an c1475an3 = this.f23064c;
        c1475an3.f22682q = c1546bv;
        c1475an3.m18615a(true);
        this.f23065d = tileOverlayOptions.isVisible();
        this.f23066e = getId();
        this.f23067f = tileOverlayOptions.getZIndex();
    }
}
