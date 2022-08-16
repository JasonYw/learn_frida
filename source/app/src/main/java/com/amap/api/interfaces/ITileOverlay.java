package com.amap.api.interfaces;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface ITileOverlay {
    static {
        Covode.recordClassIndex(4982);
    }

    void clearTileCache();

    boolean equalsRemote(ITileOverlay iTileOverlay);

    String getId();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setVisible(boolean z);

    void setZIndex(float f);
}
