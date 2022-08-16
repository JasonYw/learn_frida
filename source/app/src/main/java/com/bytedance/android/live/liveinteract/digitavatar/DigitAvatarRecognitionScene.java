package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum DigitAvatarRecognitionScene {
    VIDEO_TALK,
    VOICE_TALK_KTV;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26612);
    }

    public static DigitAvatarRecognitionScene valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DigitAvatarRecognitionScene) (proxy.isSupported ? proxy.result : Enum.valueOf(DigitAvatarRecognitionScene.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DigitAvatarRecognitionScene[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DigitAvatarRecognitionScene[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}