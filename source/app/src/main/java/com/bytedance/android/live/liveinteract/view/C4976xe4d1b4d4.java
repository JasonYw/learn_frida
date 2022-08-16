package com.bytedance.android.live.liveinteract.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C81130HyO;

/* renamed from: com.bytedance.android.live.liveinteract.view.PositionNameCountDownController$hideCountDownTimerAndShowPositionName$1 */
/* loaded from: classes3.dex */
public final class C4976xe4d1b4d4 extends Lambda implements Function1<Animator, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ObjectAnimator $positionNameTvFadeInAnimator;
    public final /* synthetic */ C81130HyO this$0;

    static {
        Covode.recordClassIndex(30761);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4976xe4d1b4d4(C81130HyO c81130HyO, ObjectAnimator objectAnimator) {
        super(1);
        this.this$0 = c81130HyO;
        this.$positionNameTvFadeInAnimator = objectAnimator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Animator animator) {
        if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(animator);
            this.this$0.LIZJ.postDelayed(new Runnable() { // from class: com.bytedance.android.live.liveinteract.view.PositionNameCountDownController$hideCountDownTimerAndShowPositionName$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(30762);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C4976xe4d1b4d4.this.this$0.LIZLLL.LIZ();
                    C4976xe4d1b4d4.this.$positionNameTvFadeInAnimator.start();
                }
            }, 50L);
        }
        return Unit.INSTANCE;
    }
}
