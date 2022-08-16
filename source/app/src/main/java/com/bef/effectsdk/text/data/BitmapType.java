package com.bef.effectsdk.text.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public enum BitmapType {
    TEXT_BITMAP_NONE(-1),
    TEXT_BITMAP_TYPE_ALPHA(0),
    TEXT_BITMAP_TYPE_RGBA8888(1),
    TEXT_BITMAP_NEON_ALPHA(2),
    TEXT_BITMAP_SINGLE_CHAR_ALPHA(3),
    TEXT_BITMAP_SHAKE_ALPHA(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int value;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static BitmapType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (BitmapType[]) proxy.result;
        }
        return (BitmapType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(9583);
    }

    public static BitmapType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (BitmapType) proxy.result;
        }
        return (BitmapType) Enum.valueOf(BitmapType.class, str);
    }

    public static BitmapType valueOf(int i) {
        BitmapType[] valuesCustom;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (BitmapType) proxy.result;
        }
        for (BitmapType bitmapType : valuesCustom()) {
            if (bitmapType.value == i) {
                return bitmapType;
            }
        }
        return TEXT_BITMAP_NONE;
    }

    BitmapType(int i) {
        this.value = i;
    }
}
