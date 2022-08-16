package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.p277ui.common.LimitListLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.StatusViewHolder$loadingHint$2 */
/* loaded from: classes3.dex */
public final class StatusViewHolder$loadingHint$2 extends Lambda implements Function0<LimitListLoadingView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $itemView;

    static {
        Covode.recordClassIndex(17405);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusViewHolder$loadingHint$2(View view) {
        super(0);
        this.$itemView = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.bytedance.android.live.broadcast.preview.ui.common.LimitListLoadingView] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.preview.ui.common.LimitListLoadingView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LimitListLoadingView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$itemView.findViewById(2131182087);
    }
}
