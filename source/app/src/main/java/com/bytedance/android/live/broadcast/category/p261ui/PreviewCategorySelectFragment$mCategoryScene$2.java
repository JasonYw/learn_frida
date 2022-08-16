package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySelectFragment$mCategoryScene$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySelectFragment$mCategoryScene$2 extends Lambda implements Function0<CategoryScene> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2968h this$0;

    static {
        Covode.recordClassIndex(15089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySelectFragment$mCategoryScene$2(C2968h c2968h) {
        super(0);
        this.this$0 = c2968h;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.api.model.CategoryScene, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CategoryScene mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.this$0.LIZIZ() == LiveMode.SCREEN_RECORD) {
            return CategoryScene.GAME;
        }
        return CategoryScene.VIDEO;
    }
}
