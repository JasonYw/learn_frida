package com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum DataType {
    INVALID(-1),
    TYPE_LINEAR_ACCELERATION(0),
    TYPE_ORIENTATION_ANGLES(1),
    TYPE_DEVICE_ORIENTATION(2),
    TYPE_VOLUME(3),
    TYPE_TOUCH_EVENT(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int value;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DataType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DataType[]) proxy.result;
        }
        return (DataType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(14849);
    }

    public static DataType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DataType) proxy.result;
        }
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    DataType(int i) {
        this.value = i;
    }
}
