package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum CategoryScene {
    VIDEO(1),
    GAME(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static CategoryScene valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (CategoryScene) (proxy.isSupported ? proxy.result : Enum.valueOf(CategoryScene.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CategoryScene[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (CategoryScene[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(14492);
    }

    CategoryScene(int i) {
        this.value = i;
    }
}
