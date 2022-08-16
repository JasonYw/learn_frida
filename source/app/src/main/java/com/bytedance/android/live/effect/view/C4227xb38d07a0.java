package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.effect.view.EffectLiveBroadcastActivityProxy$initEffect$1$onSuccess$1$onSyncStickersSuccess$1 */
/* loaded from: classes5.dex */
public final class C4227xb38d07a0 extends Lambda implements Function1<Effect, Boolean> {
    public static final C4227xb38d07a0 INSTANCE = new C4227xb38d07a0();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24807);
    }

    public C4227xb38d07a0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Effect effect) {
        boolean LIZ;
        Effect effect2 = effect;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{effect2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(effect2);
            LIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LIZ(effect2);
        }
        return Boolean.valueOf(LIZ);
    }
}
