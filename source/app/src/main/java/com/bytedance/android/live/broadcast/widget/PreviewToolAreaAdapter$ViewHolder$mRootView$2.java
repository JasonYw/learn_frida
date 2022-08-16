package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewToolAreaAdapter$ViewHolder$mRootView$2 extends Lambda implements Function0<ToolItemFrameLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ bf$a this$0;

    static {
        Covode.recordClassIndex(18726);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewToolAreaAdapter$ViewHolder$mRootView$2(bf$a bf_a) {
        super(0);
        this.this$0 = bf_a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.widget.ToolItemFrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ToolItemFrameLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ToolItemFrameLayout toolItemFrameLayout = (ToolItemFrameLayout) this.this$0.LIZIZ.findViewById(2131192428);
        Intrinsics.checkNotNullExpressionValue(toolItemFrameLayout, "");
        toolItemFrameLayout.setClipChildren(false);
        return toolItemFrameLayout;
    }
}
