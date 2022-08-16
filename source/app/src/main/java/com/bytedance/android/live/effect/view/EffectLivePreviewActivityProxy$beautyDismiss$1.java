package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86668KDe;
import p003X.C87307Kaj;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$beautyDismiss$1 extends Lambda implements Function2<Boolean, Boolean, Unit> {
    public static final EffectLivePreviewActivityProxy$beautyDismiss$1 INSTANCE = new EffectLivePreviewActivityProxy$beautyDismiss$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24822);
    }

    public EffectLivePreviewActivityProxy$beautyDismiss$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Byte.valueOf(booleanValue2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C87307Kaj<Boolean> c87307Kaj = AbstractC86668KDe.LJIILLIIL;
            if (!c87307Kaj.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
                c87307Kaj.LIZ(LiveEffectContextFactory.Type.DEFAULT, Boolean.valueOf(booleanValue));
            }
            C87307Kaj<Boolean> c87307Kaj2 = AbstractC86668KDe.LJIIZILJ;
            if (!c87307Kaj2.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
                c87307Kaj2.LIZ(LiveEffectContextFactory.Type.DEFAULT, Boolean.valueOf(booleanValue2));
            }
        }
        return Unit.INSTANCE;
    }
}
