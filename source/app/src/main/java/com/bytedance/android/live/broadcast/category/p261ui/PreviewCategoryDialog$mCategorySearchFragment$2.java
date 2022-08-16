package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategoryDialog$mCategorySearchFragment$2 */
/* loaded from: classes5.dex */
public final class PreviewCategoryDialog$mCategorySearchFragment$2 extends Lambda implements Function0<C2967g> {
    public static final PreviewCategoryDialog$mCategorySearchFragment$2 INSTANCE = new PreviewCategoryDialog$mCategorySearchFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15078);
    }

    public PreviewCategoryDialog$mCategorySearchFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.category.ui.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2967g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2967g();
    }
}
