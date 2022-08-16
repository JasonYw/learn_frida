package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class IntroduceCardWidget$hideCard$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnimatorSet $animationSet;
    public final /* synthetic */ Ref.ObjectRef $innerBlock;
    public final /* synthetic */ C88098KnU this$0;

    static {
        Covode.recordClassIndex(21538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroduceCardWidget$hideCard$2(C88098KnU c88098KnU, AnimatorSet animatorSet, Ref.ObjectRef objectRef) {
        super(0);
        this.this$0 = c88098KnU;
        this.$animationSet = animatorSet;
        this.$innerBlock = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Object obj = this.this$0.LIZLLL;
            if (obj != null) {
                ((View) obj).setPivotX(0.0f);
                Object obj2 = this.this$0.LIZLLL;
                if (obj2 != null) {
                    View view = (View) obj2;
                    Object obj3 = this.this$0.LIZLLL;
                    if (obj3 != null) {
                        view.setPivotY(((View) obj3).getHeight());
                        this.$animationSet.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.IntroduceCardWidget$hideCard$2.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(21539);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 2).isSupported) {
                                    return;
                                }
                                Function0 function0 = (Function0) IntroduceCardWidget$hideCard$2.this.$innerBlock.element;
                                if (function0 != null) {
                                    function0.mo30099invoke();
                                }
                                IntroduceCardWidget$hideCard$2.this.$innerBlock.element = null;
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                Function0 function0 = (Function0) IntroduceCardWidget$hideCard$2.this.$innerBlock.element;
                                if (function0 != null) {
                                    function0.mo30099invoke();
                                }
                                IntroduceCardWidget$hideCard$2.this.$innerBlock.element = null;
                            }
                        });
                        this.$animationSet.start();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        return Unit.INSTANCE;
    }
}
