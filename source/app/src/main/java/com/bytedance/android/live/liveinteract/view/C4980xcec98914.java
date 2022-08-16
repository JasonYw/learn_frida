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

/* renamed from: com.bytedance.android.live.liveinteract.view.PositionNameCountDownController$hidePositionNameAndShowCountDownTimer$1 */
/* loaded from: classes3.dex */
public final class C4980xcec98914 extends Lambda implements Function1<Animator, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ObjectAnimator $countDownViewFadeInAnimator;
    public final /* synthetic */ C81130HyO this$0;

    static {
        Covode.recordClassIndex(30769);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4980xcec98914(C81130HyO c81130HyO, ObjectAnimator objectAnimator) {
        super(1);
        this.this$0 = c81130HyO;
        this.$countDownViewFadeInAnimator = objectAnimator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Animator animator) {
        if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(animator);
            this.this$0.LIZLLL.LIZIZ(this.this$0.LIZ());
            this.this$0.LIZLLL.postDelayed(new Runnable() { // from class: com.bytedance.android.live.liveinteract.view.PositionNameCountDownController$hidePositionNameAndShowCountDownTimer$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(30770);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C4980xcec98914.this.$countDownViewFadeInAnimator.start();
                }
            }, 50L);
        }
        return Unit.INSTANCE;
    }
}
