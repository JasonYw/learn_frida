package com.bytedance.android.live.broadcastgame.api.openplatform;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C87904KkM;

/* loaded from: classes5.dex */
public enum PluginType {
    LYNX(13),
    MINI_APP(1),
    SONIC_GAME(16),
    UNKNOWN_TYPE(0);
    
    public static final C87904KkM Companion = new C87904KkM((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static PluginType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (PluginType) (proxy.isSupported ? proxy.result : Enum.valueOf(PluginType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PluginType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (PluginType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19234);
    }

    PluginType(int i) {
        this.value = i;
    }
}
