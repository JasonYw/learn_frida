package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C79242HLo;
import p003X.C80444HnK;

/* loaded from: classes3.dex */
public enum AvatarGender {
    Male { // from class: com.bytedance.android.live.liveinteract.digitavatar.AvatarGender.Male
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.bytedance.android.live.liveinteract.digitavatar.AvatarGender
        public final String LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            if (C79242HLo.LJIILLIIL()) {
                return C80444HnK.LIZJ;
            }
            return C80444HnK.LIZ;
        }
    },
    Female { // from class: com.bytedance.android.live.liveinteract.digitavatar.AvatarGender.Female
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.bytedance.android.live.liveinteract.digitavatar.AvatarGender
        public final String LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            if (C79242HLo.LJIILLIIL()) {
                return C80444HnK.LIZLLL;
            }
            return C80444HnK.LIZIZ;
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26581);
    }

    public static AvatarGender valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (AvatarGender) (proxy.isSupported ? proxy.result : Enum.valueOf(AvatarGender.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AvatarGender[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (AvatarGender[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public abstract String LIZ();

    /* synthetic */ AvatarGender(byte b) {
        this();
    }
}
