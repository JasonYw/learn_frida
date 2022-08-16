package com.bytedance.android.live.liveinteract.doublepk.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80896Huc;

/* loaded from: classes3.dex */
public final class DoublePkViewWidgetKt$showAnimationOnce$1$onFinalImageSet$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80896Huc this$0;

    static {
        Covode.recordClassIndex(26873);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoublePkViewWidgetKt$showAnimationOnce$1$onFinalImageSet$1(C80896Huc c80896Huc) {
        super(0);
        this.this$0 = c80896Huc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.setVisibility(this.this$0.LIZJ);
        }
        return Unit.INSTANCE;
    }
}
