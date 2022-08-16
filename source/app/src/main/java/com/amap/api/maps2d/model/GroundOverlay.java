package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.mapcore2d.AbstractC1461aa;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class GroundOverlay {

    /* renamed from: a */
    public AbstractC1461aa f24120a;

    static {
        Covode.recordClassIndex(5371);
    }

    public final int hashCode() {
        AbstractC1461aa abstractC1461aa = this.f24120a;
        if (abstractC1461aa == null) {
            return 0;
        }
        return abstractC1461aa.hashCode();
    }

    public final float getBearing() {
        try {
            if (this.f24120a == null) {
                return 0.0f;
            }
            return this.f24120a.getBearing();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getBearing");
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLngBounds getBounds() {
        try {
            if (this.f24120a == null) {
                return null;
            }
            return this.f24120a.getBounds();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getBounds");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getHeight() {
        try {
            if (this.f24120a == null) {
                return 0.0f;
            }
            return this.f24120a.getHeight();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getHeight");
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            if (this.f24120a == null) {
                return "";
            }
            return this.f24120a.getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getId");
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng getPosition() {
        try {
            if (this.f24120a == null) {
                return null;
            }
            return this.f24120a.getPosition();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getPosition");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getTransparency() {
        try {
            if (this.f24120a == null) {
                return 0.0f;
            }
            return this.f24120a.getTransparency();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getTransparency");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getWidth() {
        try {
            if (this.f24120a == null) {
                return 0.0f;
            }
            return this.f24120a.getWidth();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f24120a == null) {
                return 0.0f;
            }
            return this.f24120a.getZIndex();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "getZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f24120a == null) {
                return false;
            }
            return this.f24120a.isVisible();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "isVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.remove();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "remove");
            throw new RuntimeRemoteException(e);
        }
    }

    public GroundOverlay(AbstractC1461aa abstractC1461aa) {
        this.f24120a = abstractC1461aa;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            throw new RemoteException();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "equals");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setBearing(float f) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setBearing(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setBearing");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setDimensions(float f) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setDimensions(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setDimensions");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setImage(bitmapDescriptor);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setImage");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setPosition(latLng);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setPosition");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setPositionFromBounds(latLngBounds);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setPositionFromBounds");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTransparency(float f) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setTransparency(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setTransparency");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setVisible(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setZIndex(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setDimensions(float f, float f2) {
        try {
            if (this.f24120a == null) {
                return;
            }
            this.f24120a.setDimensions(f, f2);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "GroundOverlay", "setDimensions");
            throw new RuntimeRemoteException(e);
        }
    }
}
