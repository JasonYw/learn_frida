package com.bytedance.android.live.liveinteract.digitavatar.videoavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum VideoShowMode {
    VIDEO(1),
    AUDIO(2),
    DIGIT_AVATAR(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int type;

    public static VideoShowMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (VideoShowMode) (proxy.isSupported ? proxy.result : Enum.valueOf(VideoShowMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static VideoShowMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (VideoShowMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(26727);
    }

    VideoShowMode(int i) {
        this.type = i;
    }
}
