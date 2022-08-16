package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.interfaces.IPolyline;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class Polyline {

    /* renamed from: a */
    public final IPolyline f24177a;

    static {
        Covode.recordClassIndex(5385);
    }

    public boolean isDottedLine() {
        IPolyline iPolyline = this.f24177a;
        if (iPolyline == null) {
            return false;
        }
        return iPolyline.isDottedLine();
    }

    public boolean isGeodesic() {
        IPolyline iPolyline = this.f24177a;
        if (iPolyline == null) {
            return false;
        }
        return iPolyline.isGeodesic();
    }

    public int getColor() {
        try {
            if (this.f24177a == null) {
                return 0;
            }
            return this.f24177a.getColor();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "getColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            if (this.f24177a == null) {
                return "";
            }
            return this.f24177a.getId();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "getId");
            throw new RuntimeRemoteException(e);
        }
    }

    public List<LatLng> getPoints() {
        try {
            if (this.f24177a == null) {
                return null;
            }
            return this.f24177a.getPoints();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "getPoints");
            throw new RuntimeRemoteException(e);
        }
    }

    public float getWidth() {
        try {
            if (this.f24177a == null) {
                return 0.0f;
            }
            return this.f24177a.getWidth();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "getWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            if (this.f24177a == null) {
                return 0.0f;
            }
            return this.f24177a.getZIndex();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "getZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            if (this.f24177a == null) {
                return 0;
            }
            return this.f24177a.hashCodeRemote();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "hashCode");
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            if (this.f24177a == null) {
                return false;
            }
            return this.f24177a.isVisible();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "isVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.remove();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "remove");
            throw new RuntimeRemoteException(e);
        }
    }

    public Polyline(IPolyline iPolyline) {
        this.f24177a = iPolyline;
    }

    public void setDottedLine(boolean z) {
        IPolyline iPolyline = this.f24177a;
        if (iPolyline == null) {
            return;
        }
        iPolyline.setDottedLine(z);
    }

    public void setColor(int i) {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.setColor(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setColor");
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPoints(List<LatLng> list) {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.setPoints(list);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setPoints");
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.setVisible(z);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setVisible");
            throw new RuntimeRemoteException(e);
        }
    }

    public void setWidth(float f) {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.setWidth(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setWidth");
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float f) {
        try {
            if (this.f24177a == null) {
                return;
            }
            this.f24177a.setZIndex(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setZIndex");
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            if (this.f24177a == null) {
                return false;
            }
            return this.f24177a.equalsRemote(((Polyline) obj).f24177a);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "equals");
            throw new RuntimeRemoteException(e);
        }
    }

    public void setGeodesic(boolean z) {
        try {
            if (this.f24177a != null && this.f24177a.isGeodesic() != z) {
                List<LatLng> points = getPoints();
                this.f24177a.setGeodesic(z);
                setPoints(points);
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Polyline", "setGeodesic");
            throw new RuntimeRemoteException(e);
        }
    }
}
