package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86668KDe;
import p003X.C87307Kaj;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$beautyDismiss$2 extends Lambda implements Function0<Unit> {
    public static final EffectLivePreviewActivityProxy$beautyDismiss$2 INSTANCE = new EffectLivePreviewActivityProxy$beautyDismiss$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24823);
    }

    public EffectLivePreviewActivityProxy$beautyDismiss$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87307Kaj<Boolean> c87307Kaj = AbstractC86668KDe.LJIJ;
            if (!c87307Kaj.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
                c87307Kaj.LIZ(LiveEffectContextFactory.Type.DEFAULT, Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
