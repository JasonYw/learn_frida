package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class ProcessView$loadingAnimator$2 extends Lambda implements Function0<ObjectAnimator> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ProcessView this$0;

    static {
        Covode.recordClassIndex(16542);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessView$loadingAnimator$2(ProcessView processView) {
        super(0);
        this.this$0 = processView;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.ObjectAnimator, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ObjectAnimator mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0, "rotation", 360.0f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }
}
