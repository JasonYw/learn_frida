package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategoryDialog$mCategoryEditFragment$2 */
/* loaded from: classes5.dex */
public final class PreviewCategoryDialog$mCategoryEditFragment$2 extends Lambda implements Function0<View$OnTouchListenerC2966f> {
    public static final PreviewCategoryDialog$mCategoryEditFragment$2 INSTANCE = new PreviewCategoryDialog$mCategoryEditFragment$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15077);
    }

    public PreviewCategoryDialog$mCategoryEditFragment$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.category.ui.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View$OnTouchListenerC2966f mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new View$OnTouchListenerC2966f();
    }
}
