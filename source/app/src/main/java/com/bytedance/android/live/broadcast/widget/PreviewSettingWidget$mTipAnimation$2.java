package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewSettingWidget$mTipAnimation$2 extends Lambda implements Function0<ValueAnimator> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSettingWidget this$0;

    static {
        Covode.recordClassIndex(18671);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSettingWidget$mTipAnimation$2(PreviewSettingWidget previewSettingWidget) {
        super(0);
        this.this$0 = previewSettingWidget;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, android.animation.ValueAnimator] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ValueAnimator mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PreviewSettingWidget previewSettingWidget = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], previewSettingWidget, PreviewSettingWidget.LIZ, false, 20);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(previewSettingWidget.LIZJ(), "translationX", 0.0f, LK5.LIZ(4.0f), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "");
        ofFloat.setDuration(1200L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        return ofFloat;
    }
}
