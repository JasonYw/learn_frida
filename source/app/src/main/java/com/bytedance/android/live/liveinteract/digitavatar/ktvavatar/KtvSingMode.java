package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum KtvSingMode {
    AUDIO(2),
    VIDEO(1),
    DIGIT_AVATAR(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int type;

    public static KtvSingMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (KtvSingMode) (proxy.isSupported ? proxy.result : Enum.valueOf(KtvSingMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static KtvSingMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (KtvSingMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(26670);
    }

    KtvSingMode(int i) {
        this.type = i;
    }
}
