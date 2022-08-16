package com.bytedance.android.live.broadcast.category.viewmodel;

import android.content.Context;
import com.bytedance.android.live.broadcast.category.C2961d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveEndTagSelectWidget$mLiveTagDataHandler$2 extends Lambda implements Function0<C2961d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveEndTagSelectWidget this$0;

    static {
        Covode.recordClassIndex(15140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEndTagSelectWidget$mLiveTagDataHandler$2(LiveEndTagSelectWidget liveEndTagSelectWidget) {
        super(0);
        this.this$0 = liveEndTagSelectWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.category.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2961d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LiveEndTagSelectWidget liveEndTagSelectWidget = this.this$0;
        return new C2961d(context, liveEndTagSelectWidget, liveEndTagSelectWidget.LIZIZ);
    }
}
