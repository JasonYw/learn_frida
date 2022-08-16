package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.interfaces.IMarker;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class Marker {

    /* renamed from: a */
    public IMarker f24139a;

    static {
        Covode.recordClassIndex(5376);
    }

    public final void hideInfoWindow() {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.hideInfoWindow();
        }
    }

    public final void showInfoWindow() {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.showInfoWindow();
        }
    }

    public final String getId() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return null;
        }
        return iMarker.getId();
    }

    public final Object getObject() {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            return iMarker.getObject();
        }
        return null;
    }

    public final LatLng getPosition() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return null;
        }
        return iMarker.getPosition();
    }

    public final String getSnippet() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return null;
        }
        return iMarker.getSnippet();
    }

    public final String getTitle() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return null;
        }
        return iMarker.getTitle();
    }

    public final float getZIndex() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return 0.0f;
        }
        return iMarker.getZIndex();
    }

    public final int hashCode() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return super.hashCode();
        }
        return iMarker.hashCodeRemote();
    }

    public final boolean isDraggable() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return false;
        }
        return iMarker.isDraggable();
    }

    public final boolean isInfoWindowShown() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return false;
        }
        return iMarker.isInfoWindowShown();
    }

    public final boolean isVisible() {
        IMarker iMarker = this.f24139a;
        if (iMarker == null) {
            return false;
        }
        return iMarker.isVisible();
    }

    public final void destroy() {
        try {
            if (this.f24139a != null) {
                this.f24139a.destroy();
            }
        } catch (Exception e) {
            C1569cm.m18147a(e, "Marker", "destroy");
        }
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        try {
            return this.f24139a.getIcons();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "getIcons");
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getPeriod() {
        try {
            return this.f24139a.getPeriod();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "getPeriod");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            if (this.f24139a != null) {
                this.f24139a.remove();
            }
        } catch (Exception e) {
            C1569cm.m18147a(e, "Marker", "remove");
        }
    }

    public Marker(MarkerOptions markerOptions) {
    }

    public Marker(IMarker iMarker) {
        this.f24139a = iMarker;
    }

    public final void setDraggable(boolean z) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setDraggable(z);
        }
    }

    public final void setObject(Object obj) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setObject(obj);
        }
    }

    public final void setPosition(LatLng latLng) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setPosition(latLng);
        }
    }

    public final void setSnippet(String str) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setSnippet(str);
        }
    }

    public final void setTitle(String str) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setTitle(str);
        }
    }

    public final void setVisible(boolean z) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setVisible(z);
        }
    }

    public final void setZIndex(float f) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setZIndex(f);
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null && bitmapDescriptor != null) {
            iMarker.setIcon(bitmapDescriptor);
        }
    }

    public final boolean equals(Object obj) {
        IMarker iMarker;
        if (!(obj instanceof Marker) || (iMarker = this.f24139a) == null) {
            return false;
        }
        return iMarker.equalsRemote(((Marker) obj).f24139a);
    }

    public final void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        try {
            this.f24139a.setIcons(arrayList);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "setIcons");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPeriod(int i) {
        try {
            if (this.f24139a != null) {
                this.f24139a.setPeriod(i);
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "setPeriod");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setRotateAngle(float f) {
        try {
            this.f24139a.setRotateAngle(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "setRotateAngle");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setAnchor(float f, float f2) {
        IMarker iMarker = this.f24139a;
        if (iMarker != null) {
            iMarker.setAnchor(f, f2);
        }
    }

    public final void setPositionByPixels(int i, int i2) {
        try {
            if (this.f24139a != null) {
                this.f24139a.setPositionByPixels(i, i2);
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Marker", "setPositionByPixels");
            e.printStackTrace();
        }
    }
}
