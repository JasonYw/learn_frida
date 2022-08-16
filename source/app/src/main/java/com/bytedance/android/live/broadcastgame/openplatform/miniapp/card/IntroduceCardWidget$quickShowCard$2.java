package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class IntroduceCardWidget$quickShowCard$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnimatorSet $animationSet;

    static {
        Covode.recordClassIndex(21541);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroduceCardWidget$quickShowCard$2(AnimatorSet animatorSet) {
        super(0);
        this.$animationSet = animatorSet;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$animationSet.start();
        }
        return Unit.INSTANCE;
    }
}
