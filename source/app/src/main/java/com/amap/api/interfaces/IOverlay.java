package com.amap.api.interfaces;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IOverlay {
    static {
        Covode.recordClassIndex(4977);
    }

    void destroy();

    boolean equalsRemote(IOverlay iOverlay);

    String getId();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setVisible(boolean z);

    void setZIndex(float f);
}
