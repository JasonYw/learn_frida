package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategoryDialog$mCategorySelectFragment$2 */
/* loaded from: classes5.dex */
public final class PreviewCategoryDialog$mCategorySelectFragment$2 extends Lambda implements Function0<C2968h> {
    public static final PreviewCategoryDialog$mCategorySelectFragment$2 INSTANCE = new PreviewCategoryDialog$mCategorySelectFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15079);
    }

    public PreviewCategoryDialog$mCategorySelectFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.category.ui.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2968h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2968h();
    }
}
