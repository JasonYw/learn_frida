package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.CategoryViewHolder$selected$2 */
/* loaded from: classes5.dex */
public final class CategoryViewHolder$selected$2 extends Lambda implements Function0<CategoryNode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2964b this$0;

    static {
        Covode.recordClassIndex(15076);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryViewHolder$selected$2(C2964b c2964b) {
        super(0);
        this.this$0 = c2964b;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.broadcast.api.model.CategoryNode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CategoryNode mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.this$0.LIZLLL == CategoryScene.GAME) {
            return this.this$0.LIZJ.LJFF().getValue();
        }
        return this.this$0.LIZJ.LJIIIZ().getValue();
    }
}
