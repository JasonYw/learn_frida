package com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum Orientation {
    LANDSCAPE(1.0f),
    PORTRAIT(0.0f);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final float value;

    public static Orientation valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Orientation) (proxy.isSupported ? proxy.result : Enum.valueOf(Orientation.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Orientation[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Orientation[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(14850);
    }

    Orientation(float f) {
        this.value = f;
    }
}
