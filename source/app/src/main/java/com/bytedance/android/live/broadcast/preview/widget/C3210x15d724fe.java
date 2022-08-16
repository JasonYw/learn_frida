package com.bytedance.android.live.broadcast.preview.widget;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.K9M;
import p003X.KE5;
import p003X.KE6;

/* renamed from: com.bytedance.android.live.broadcast.preview.widget.LiveCameraExtraFrameWidget$initLiveStream$$inlined$apply$lambda$1$1 */
/* loaded from: classes5.dex */
public final class C3210x15d724fe extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ K9M this$0;

    static {
        Covode.recordClassIndex(17508);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3210x15d724fe(K9M k9m) {
        super(1);
        this.this$0 = k9m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        ValueAnimator valueAnimator;
        if (!PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 1).isSupported) {
            LiveCameraExtraFrameWidget liveCameraExtraFrameWidget = this.this$0.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], liveCameraExtraFrameWidget, LiveCameraExtraFrameWidget.LIZ, false, 8).isSupported && liveCameraExtraFrameWidget.LJIIL) {
                liveCameraExtraFrameWidget.LJIIL = false;
                ValueAnimator valueAnimator2 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator2 != null && valueAnimator2.isStarted() && (valueAnimator = liveCameraExtraFrameWidget.LIZIZ) != null) {
                    valueAnimator.cancel();
                }
                HSImageView hSImageView = liveCameraExtraFrameWidget.LJIIJ;
                if (hSImageView != null) {
                    hSImageView.setAlpha(1.0f);
                }
                HSImageView hSImageView2 = liveCameraExtraFrameWidget.LJIIJ;
                if (hSImageView2 != null) {
                    hSImageView2.setVisibility(0);
                }
                liveCameraExtraFrameWidget.LIZIZ = ValueAnimator.ofFloat(1.0f, 0.0f);
                ValueAnimator valueAnimator3 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(300L);
                }
                ValueAnimator valueAnimator4 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator4 != null) {
                    valueAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
                }
                ValueAnimator valueAnimator5 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(new KE5(liveCameraExtraFrameWidget));
                }
                ValueAnimator valueAnimator6 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator6 != null) {
                    valueAnimator6.addListener(new KE6(liveCameraExtraFrameWidget));
                }
                ValueAnimator valueAnimator7 = liveCameraExtraFrameWidget.LIZIZ;
                if (valueAnimator7 != null) {
                    valueAnimator7.start();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
