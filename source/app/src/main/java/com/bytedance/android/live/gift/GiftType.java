package com.bytedance.android.live.gift;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum GiftType {
    UNKNOWN,
    NORMAL_GIFT,
    TASK_GIFT,
    STICKER_GIFT,
    MIDDLE_GIFT,
    SPECIAL_GIFT,
    FREE_CELL,
    GOLDEN_BEAN_CELL,
    GAME,
    BLIND_BOX,
    INTERACT_GIFT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GiftType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (GiftType[]) proxy.result;
        }
        return (GiftType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(24955);
    }

    public static GiftType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (GiftType) proxy.result;
        }
        return (GiftType) Enum.valueOf(GiftType.class, str);
    }
}
