package com.amap.api.maps2d.model;

import com.amap.api.interfaces.ITileOverlay;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class TileOverlay {

    /* renamed from: a */
    public ITileOverlay f24208a;

    static {
        Covode.recordClassIndex(5393);
    }

    public final void clearTileCache() {
        this.f24208a.clearTileCache();
    }

    public final String getId() {
        return this.f24208a.getId();
    }

    public final float getZIndex() {
        return this.f24208a.getZIndex();
    }

    public final int hashCode() {
        return this.f24208a.hashCodeRemote();
    }

    public final boolean isVisible() {
        return this.f24208a.isVisible();
    }

    public final void remove() {
        this.f24208a.remove();
    }

    public TileOverlay(ITileOverlay iTileOverlay) {
        this.f24208a = iTileOverlay;
    }

    public final boolean equals(Object obj) {
        ITileOverlay iTileOverlay = this.f24208a;
        return iTileOverlay.equalsRemote(iTileOverlay);
    }

    public final void setVisible(boolean z) {
        this.f24208a.setVisible(z);
    }

    public final void setZIndex(float f) {
        this.f24208a.setZIndex(f);
    }
}
