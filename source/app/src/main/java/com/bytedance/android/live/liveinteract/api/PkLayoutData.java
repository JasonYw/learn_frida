package com.bytedance.android.live.liveinteract.api;

import com.bytedance.android.livesdkapi.model.C9627at;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public final class PkLayoutData {
    public final int height;
    public final int marginTop;
    public C9627at region;
    public final int width;

    static {
        Covode.recordClassIndex(25109);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final C9627at getRegion() {
        return this.region;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setRegion(C9627at c9627at) {
        this.region = c9627at;
    }

    public PkLayoutData(int i, int i2, int i3) {
        this.marginTop = i;
        this.width = i2;
        this.height = i3;
    }
}
