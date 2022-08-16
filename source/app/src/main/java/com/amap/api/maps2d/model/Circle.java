package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.interfaces.ICircle;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class Circle {

    /* renamed from: a */
    public final ICircle f24111a;

    static {
        Covode.recordClassIndex(5369);
    }

    public final LatLng getCenter() {
        try {
            if (this.f24111a == null) {
                return null;
            }
            return this.f24111a.getCenter();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getCenter");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getFillColor() {
        try {
            if (this.f24111a == null) {
                return 0;
            }
            return this.f24111a.getFillColor();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getFillColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            if (this.f24111a == null) {
                return "";
            }
            return this.f24111a.getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getId");
            throw new RuntimeRemoteException(e);
        }
    }

    public final double getRadius() {
        try {
            if (this.f24111a == null) {
                return 0.0d;
            }
            return this.f24111a.getRadius();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getRadius");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getStrokeColor() {
        try {
            if (this.f24111a == null) {
                return 0;
            }
            return this.f24111a.getStrokeColor();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getStrokeColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getStrokeWidth() {
        try {
            if (this.f24111a == null) {
                return 0.0f;
            }
            return this.f24111a.getStrokeWidth();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getStrokeWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f24111a == null) {
                return 0.0f;
            }
            return this.f24111a.getZIndex();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "getZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            if (this.f24111a == null) {
                return 0;
            }
            return this.f24111a.hashCodeRemote();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "hashCode");
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f24111a == null) {
                return false;
            }
            return this.f24111a.isVisible();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "isVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.remove();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "remove");
            throw new RuntimeRemoteException(e);
        }
    }

    public Circle(ICircle iCircle) {
        this.f24111a = iCircle;
    }

    public final boolean contains(LatLng latLng) {
        try {
            if (this.f24111a != null && latLng != null) {
                return this.f24111a.contains(latLng);
            }
            return false;
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "contains");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setCenter(LatLng latLng) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setCenter(latLng);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setCenter");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setFillColor(int i) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setFillColor(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setFillColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setRadius(double d) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setRadius(d);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setRadius");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setStrokeColor(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setStrokeColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setStrokeWidth(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setStrokeWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setVisible(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            if (this.f24111a == null) {
                return;
            }
            this.f24111a.setZIndex(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "setZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            if (this.f24111a == null) {
                return false;
            }
            return this.f24111a.equalsRemote(((Circle) obj).f24111a);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Circle", "equals");
            throw new RuntimeRemoteException(e);
        }
    }
}
