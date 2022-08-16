package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.drakeet.multitype.C35036d;
import p003X.C86915KMr;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySearchFragment$mAdapter$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySearchFragment$mAdapter$2 extends Lambda implements Function0<C35036d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2967g this$0;

    static {
        Covode.recordClassIndex(15085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySearchFragment$mAdapter$2(C2967g c2967g) {
        super(0);
        this.this$0 = c2967g;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [me.drakeet.multitype.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C35036d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C35036d c35036d = new C35036d();
        C2970a LIZIZ = this.this$0.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        c35036d.LIZ(CategoryNode.class, new C86915KMr(LIZIZ, this.this$0.LIZ()));
        return c35036d;
    }
}
