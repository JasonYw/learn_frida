package com.bytedance.android.live.effect.sticker.p331ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C147526fKS;
import p003X.C147528fKU;
import p003X.View$OnClickListenerC147530fKW;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteView$bindClickListener$listener$1$1 */
/* loaded from: classes20.dex */
public final class StickerFavoriteView$bindClickListener$listener$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC147530fKW this$0;

    static {
        Covode.recordClassIndex(24646);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteView$bindClickListener$listener$1$1(View$OnClickListenerC147530fKW view$OnClickListenerC147530fKW) {
        super(0);
        this.this$0 = view$OnClickListenerC147530fKW;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String mTipTextNormal;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            TextView mTipTV = this.this$0.LIZIZ.getMTipTV();
            Intrinsics.checkNotNullExpressionValue(mTipTV, "");
            if (this.this$0.LIZIZ.LIZIZ) {
                mTipTextNormal = this.this$0.LIZIZ.getMTipTextSelected();
            } else {
                mTipTextNormal = this.this$0.LIZIZ.getMTipTextNormal();
            }
            mTipTV.setText(mTipTextNormal);
            StickerFavoriteImageView mIconIV = this.this$0.LIZIZ.getMIconIV();
            if (!PatchProxy.proxy(new Object[0], mIconIV, StickerFavoriteImageView.LIZ, false, 1).isSupported && !PatchProxy.proxy(new Object[]{Float.valueOf(1.0f)}, mIconIV, StickerFavoriteImageView.LIZ, false, 2).isSupported) {
                mIconIV.clearAnimation();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mIconIV, "scaleX", 1.0f, mIconIV.LIZIZ);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mIconIV, "scaleY", 1.0f, mIconIV.LIZIZ);
                Intrinsics.checkNotNullExpressionValue(ofFloat, "");
                ofFloat.setDuration(mIconIV.LIZJ);
                Intrinsics.checkNotNullExpressionValue(ofFloat2, "");
                ofFloat2.setDuration(mIconIV.LIZJ);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mIconIV, "scaleX", mIconIV.LIZIZ, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mIconIV, "scaleY", mIconIV.LIZIZ, 0.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat3, "");
                ofFloat3.setDuration(mIconIV.LIZJ);
                Intrinsics.checkNotNullExpressionValue(ofFloat4, "");
                ofFloat4.setDuration(mIconIV.LIZJ);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mIconIV, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(mIconIV, "alpha", 1.0f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat6, "");
                ofFloat6.setDuration(mIconIV.LIZJ);
                Intrinsics.checkNotNullExpressionValue(ofFloat5, "");
                ofFloat5.setDuration(mIconIV.LIZJ);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(mIconIV, "scaleX", 0.0f, mIconIV.LIZIZ);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(mIconIV, "scaleY", 0.0f, mIconIV.LIZIZ);
                Intrinsics.checkNotNullExpressionValue(ofFloat7, "");
                ofFloat7.setDuration(mIconIV.LIZJ);
                Intrinsics.checkNotNullExpressionValue(ofFloat8, "");
                ofFloat8.setDuration(mIconIV.LIZJ);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(mIconIV, "scaleX", mIconIV.LIZIZ, 1.0f);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(mIconIV, "scaleY", mIconIV.LIZIZ, 1.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat9, "");
                ofFloat9.setDuration(mIconIV.LIZJ);
                ofFloat9.setDuration(mIconIV.LIZJ);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
                animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
                animatorSet.addListener(new C147528fKU(mIconIV, animatorSet2));
                animatorSet2.addListener(new C147526fKS(mIconIV));
                animatorSet.start();
            }
        }
        return Unit.INSTANCE;
    }
}
