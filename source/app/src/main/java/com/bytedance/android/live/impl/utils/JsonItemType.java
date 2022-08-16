package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public enum JsonItemType {
    STALL_ITEM,
    ENTER_ROOM_DURATION_ITEM,
    WATCH_ROOM_PV_ITEM,
    WATCH_HOTROOM_PV_ITEM,
    STALL_ROOM_SENSITIVITY,
    STALL_LIVE_SENSITIVITY,
    PREVIEW_SHOW_PV_ITEM,
    PREVIEW_CLICK_PV_ITEM,
    DEFINITION_ITEM;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25036);
    }

    public static JsonItemType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (JsonItemType) (proxy.isSupported ? proxy.result : Enum.valueOf(JsonItemType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static JsonItemType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (JsonItemType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
