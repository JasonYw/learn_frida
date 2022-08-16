package com.bytedance.android.live.broadcast.category.viewmodel;

import android.content.Context;
import com.bytedance.android.live.broadcast.category.C2959a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewCategoryWidget$mGameCategoryDataHandler$2 extends Lambda implements Function0<C2959a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCategoryWidget this$0;

    static {
        Covode.recordClassIndex(15176);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategoryWidget$mGameCategoryDataHandler$2(PreviewCategoryWidget previewCategoryWidget) {
        super(0);
        this.this$0 = previewCategoryWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.category.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2959a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        PreviewCategoryWidget previewCategoryWidget = this.this$0;
        return new C2959a(context, previewCategoryWidget, previewCategoryWidget.LIZLLL);
    }
}
