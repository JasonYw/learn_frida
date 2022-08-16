package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ca */
/* loaded from: classes19.dex */
public class C1552ca implements AbstractC1473al {

    /* renamed from: a */
    public AbstractC1783y f23098a;

    /* renamed from: c */
    public boolean f23100c;

    /* renamed from: g */
    public boolean f23104g;

    /* renamed from: h */
    public int f23105h;

    /* renamed from: i */
    public int f23106i;

    /* renamed from: k */
    public boolean f23108k;

    /* renamed from: b */
    public boolean f23099b = true;

    /* renamed from: d */
    public boolean f23101d = true;

    /* renamed from: e */
    public boolean f23102e = true;

    /* renamed from: f */
    public boolean f23103f = true;

    /* renamed from: j */
    public final Handler f23107j = new Handler() { // from class: com.amap.api.mapcore2d.ca.1
        static {
            Covode.recordClassIndex(5101);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null && C1552ca.this.f23098a != null) {
                try {
                    int i = message.what;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    C1552ca.this.f23098a.showMyLocationButtonEnabled(C1552ca.this.f23100c);
                                    return;
                                }
                                return;
                            }
                            C1552ca.this.f23098a.showCompassEnabled(C1552ca.this.f23103f);
                            return;
                        }
                        C1552ca.this.f23098a.showScaleEnabled(C1552ca.this.f23104g);
                        return;
                    }
                    C1552ca.this.f23098a.showZoomControlsEnabled(C1552ca.this.f23102e);
                } catch (Throwable th) {
                    C1569cm.m18147a(th, "UiSettingsDelegateImp", "handle_handleMessage");
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(5100);
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public int getLogoPosition() {
        return this.f23105h;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public int getZoomPosition() {
        return this.f23106i;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isCompassEnabled() {
        return this.f23103f;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isMyLocationButtonEnabled() {
        return this.f23100c;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isScaleControlsEnabled() {
        return this.f23104g;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isScrollGesturesEnabled() {
        return this.f23099b;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isZoomControlsEnabled() {
        return this.f23102e;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isZoomGesturesEnabled() {
        return this.f23101d;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public boolean isZoomInByScreenCenter() {
        return this.f23108k;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setScrollGesturesEnabled(boolean z) {
        this.f23099b = z;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setZoomGesturesEnabled(boolean z) {
        this.f23101d = z;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setZoomInByScreenCenter(boolean z) {
        this.f23108k = z;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setAllGesturesEnabled(boolean z) {
        setZoomGesturesEnabled(z);
        setScrollGesturesEnabled(z);
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setLogoPosition(int i) {
        this.f23105h = i;
        this.f23098a.setLogoPosition(i);
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setZoomPosition(int i) {
        this.f23106i = i;
        this.f23098a.setZoomPosition(i);
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setCompassEnabled(boolean z) {
        this.f23103f = z;
        this.f23107j.obtainMessage(2).sendToTarget();
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setMyLocationButtonEnabled(boolean z) {
        this.f23100c = z;
        this.f23107j.obtainMessage(3).sendToTarget();
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setScaleControlsEnabled(boolean z) {
        this.f23104g = z;
        this.f23107j.obtainMessage(1).sendToTarget();
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setZoomControlsEnabled(boolean z) {
        this.f23102e = z;
        this.f23107j.obtainMessage(0).sendToTarget();
    }

    public C1552ca(AbstractC1783y abstractC1783y) {
        this.f23098a = abstractC1783y;
    }

    @Override // com.amap.api.interfaces.IUiSettings
    public void setLogoCenter(int i, int i2) {
        AbstractC1783y abstractC1783y = this.f23098a;
        if (abstractC1783y != null) {
            abstractC1783y.mo17146a(i, i2);
        }
    }
}
