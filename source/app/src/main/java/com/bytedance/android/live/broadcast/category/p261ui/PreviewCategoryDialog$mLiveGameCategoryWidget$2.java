package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.viewmodel.LiveGameCategoryWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86919KMv;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategoryDialog$mLiveGameCategoryWidget$2 */
/* loaded from: classes5.dex */
public final class PreviewCategoryDialog$mLiveGameCategoryWidget$2 extends Lambda implements Function0<LiveGameCategoryWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86919KMv this$0;

    static {
        Covode.recordClassIndex(15081);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategoryDialog$mLiveGameCategoryWidget$2(C86919KMv c86919KMv) {
        super(0);
        this.this$0 = c86919KMv;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.category.viewmodel.LiveGameCategoryWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LiveGameCategoryWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LiveGameCategoryWidget(CategoryScene.GAME, this.this$0);
    }
}