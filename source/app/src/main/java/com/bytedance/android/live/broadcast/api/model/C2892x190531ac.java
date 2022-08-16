package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager$loadStartPreviewResolutionListByLiveMode$1$1$1 */
/* loaded from: classes5.dex */
public final class C2892x190531ac extends Lambda implements Function1<RoomCreateInfo.C2896g.C2897a, Boolean> {
    public static final C2892x190531ac INSTANCE = new C2892x190531ac();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14488);
    }

    public C2892x190531ac() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(RoomCreateInfo.C2896g.C2897a c2897a) {
        RoomCreateInfo.C2896g.C2897a c2897a2 = c2897a;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2897a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c2897a2);
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ANCHOR_CLARITY_1080_OPEN;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().booleanValue() || !Intrinsics.areEqual(c2897a2.LIZIZ, "uhd")) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
