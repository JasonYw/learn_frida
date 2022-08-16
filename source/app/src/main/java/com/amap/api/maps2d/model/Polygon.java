package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.interfaces.IPolygon;
import com.amap.api.mapcore2d.AbstractC1466af;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public final class Polygon {

    /* renamed from: a */
    public IPolygon f24169a;

    static {
        Covode.recordClassIndex(5383);
    }

    public final int getFillColor() {
        try {
            if (this.f24169a == null) {
                return 0;
            }
            return this.f24169a.getFillColor();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getFillColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            if (this.f24169a == null) {
                return null;
            }
            return this.f24169a.getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getId");
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<LatLng> getPoints() {
        try {
            if (this.f24169a == null) {
                return null;
            }
            return this.f24169a.getPoints();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getPoints");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getStrokeColor() {
        try {
            if (this.f24169a == null) {
                return 0;
            }
            return this.f24169a.getStrokeColor();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getStrokeColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getStrokeWidth() {
        try {
            if (this.f24169a == null) {
                return 0.0f;
            }
            return this.f24169a.getStrokeWidth();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getStrokeWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f24169a == null) {
                return 0.0f;
            }
            return this.f24169a.getZIndex();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "getZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            if (this.f24169a == null) {
                return 0;
            }
            return this.f24169a.hashCodeRemote();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "hashCode");
            return super.hashCode();
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f24169a == null) {
                return true;
            }
            return this.f24169a.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.remove();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "remove");
            throw new RuntimeRemoteException(e);
        }
    }

    public Polygon(AbstractC1466af abstractC1466af) {
        this.f24169a = abstractC1466af;
    }

    public final boolean contains(LatLng latLng) {
        try {
            if (this.f24169a == null) {
                return false;
            }
            return this.f24169a.contains(latLng);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "contains");
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            if (this.f24169a == null) {
                return false;
            }
            return this.f24169a.equalsRemote(((Polygon) obj).f24169a);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "equeals");
            return false;
        }
    }

    public final void setFillColor(int i) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setFillColor(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setFillColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setPoints(list);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setPoints");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setStrokeColor(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setStrokeColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setStrokeWidth(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setStrokeWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setVisible(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            if (this.f24169a == null) {
                return;
            }
            this.f24169a.setZIndex(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polygon", "setZIndex");
            throw new RuntimeRemoteException(e);
        }
    }
}
