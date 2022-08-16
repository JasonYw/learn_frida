package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6938du;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p003X.C82051IVp;

/* loaded from: classes3.dex */
public enum AudioInteractMode {
    Radio(1, 0),
    Chat(2, 5),
    KTV(3, 9);
    
    public static final C82051IVp Companion = new C82051IVp((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: id */
    public final int f25910id;
    public final int linkMicScene;

    public static AudioInteractMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        return (AudioInteractMode) (proxy.isSupported ? proxy.result : Enum.valueOf(AudioInteractMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AudioInteractMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        return (AudioInteractMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(16979);
    }

    public final Challenge LIZ() {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Challenge) proxy.result;
        }
        SettingKey<C6938du> settingKey = LiveSettingKeys.LIVE_PREVIEW_AUDIO_INTERACT_SHORTCUT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Iterator<T> it = settingKey.getValue().LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C6938du.C6939a) obj).LIZ == this.f25910id) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6938du.C6939a c6939a = (C6938du.C6939a) obj;
        if (c6939a == null || c6939a.LIZIZ <= 0) {
            return null;
        }
        String valueOf = String.valueOf(c6939a.LIZIZ);
        String str = c6939a.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c6939a.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        return new Challenge(valueOf, str, str2);
    }

    AudioInteractMode(int i, int i2) {
        this.f25910id = i;
        this.linkMicScene = i2;
    }
}
