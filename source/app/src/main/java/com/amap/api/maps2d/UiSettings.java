package com.amap.api.maps2d;

import android.os.RemoteException;
import com.amap.api.interfaces.IUiSettings;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class UiSettings {

    /* renamed from: a */
    public final IUiSettings f24102a;

    static {
        Covode.recordClassIndex(5364);
    }

    public final int getLogoPosition() {
        try {
            return this.f24102a.getLogoPosition();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "getLogoPosition");
            e.printStackTrace();
            return 0;
        }
    }

    public final int getZoomPosition() {
        try {
            return this.f24102a.getZoomPosition();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "UiSettings", "getZoomPosition");
            return 0;
        }
    }

    public final boolean isCompassEnabled() {
        try {
            return this.f24102a.isCompassEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isCompassEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.f24102a.isMyLocationButtonEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isMyLocationButtonEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isScaleControlsEnabled() {
        try {
            return this.f24102a.isScaleControlsEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isScaleControlsEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.f24102a.isScrollGesturesEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isScrollGestureEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.f24102a.isZoomControlsEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isZoomControlsEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.f24102a.isZoomGesturesEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "isZoomGesturesEnabled");
            e.printStackTrace();
            return false;
        }
    }

    public UiSettings(IUiSettings iUiSettings) {
        this.f24102a = iUiSettings;
    }

    public final void setZoomInByScreenCenter(boolean z) {
        try {
            this.f24102a.setZoomInByScreenCenter(z);
        } catch (Throwable unused) {
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.f24102a.setAllGesturesEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setAllGesturesEnabled");
            e.printStackTrace();
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.f24102a.setCompassEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setCompassEnabled");
            e.printStackTrace();
        }
    }

    public final void setLogoPosition(int i) {
        try {
            this.f24102a.setLogoPosition(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setLogoPosition");
            e.printStackTrace();
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.f24102a.setMyLocationButtonEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setMyLocationButtonEnabled");
            e.printStackTrace();
        }
    }

    public final void setScaleControlsEnabled(boolean z) {
        try {
            this.f24102a.setScaleControlsEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setScaleControlsEnabled");
            e.printStackTrace();
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.f24102a.setScrollGesturesEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setScrollGesturesEnabled");
            e.printStackTrace();
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.f24102a.setZoomControlsEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setZoomControlsEnabled");
            e.printStackTrace();
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.f24102a.setZoomGesturesEnabled(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setZoomGesturesEnabled");
            e.printStackTrace();
        }
    }

    public final void setZoomPosition(int i) {
        try {
            this.f24102a.setZoomPosition(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "UiSettings", "setZoomPosition");
            e.printStackTrace();
        }
    }

    public final void setLogoCenter(int i, int i2) {
        try {
            this.f24102a.setLogoCenter(i, i2);
        } catch (Throwable unused) {
        }
    }
}
