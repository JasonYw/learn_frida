package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkIntegrationPlayMethodDialog$VideoTalkPlayMethodItemViewHolder$clItem$2 */
/* loaded from: classes3.dex */
public final class C4914xbe500188 extends Lambda implements Function0<ViewGroup> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $itemView;

    static {
        Covode.recordClassIndex(30031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4914xbe500188(View view) {
        super(0);
        this.$itemView = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewGroup mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$itemView.findViewById(2131170273);
    }
}
