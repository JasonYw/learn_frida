package com.bytedance.android.live.broadcast.category.p261ui;

import android.content.Context;
import com.bytedance.android.live.broadcast.category.p260a.C2960c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySelectFragment$mInstalledAppsManager$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySelectFragment$mInstalledAppsManager$2 extends Lambda implements Function0<C2960c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2968h this$0;

    static {
        Covode.recordClassIndex(15091);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySelectFragment$mInstalledAppsManager$2(C2968h c2968h) {
        super(0);
        this.this$0 = c2968h;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.category.a.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2960c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.getContext();
        if (context != null) {
            return new C2960c(context);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
    }
}
