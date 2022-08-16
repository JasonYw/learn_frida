package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.UserViewHolder$ivUserCheckBox$2 */
/* loaded from: classes3.dex */
public final class UserViewHolder$ivUserCheckBox$2 extends Lambda implements Function0<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $itemView;

    static {
        Covode.recordClassIndex(17411);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewHolder$ivUserCheckBox$2(View view) {
        super(0);
        this.$itemView = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$itemView.findViewById(2131179721);
    }
}
