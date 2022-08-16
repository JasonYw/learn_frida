package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkIntegrationPlayMethodDialog$VideoTalkPlayMethodItemViewHolder$ivIcon$2 */
/* loaded from: classes3.dex */
public final class C4915x3daa5f32 extends Lambda implements Function0<HSImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $itemView;

    static {
        Covode.recordClassIndex(30032);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4915x3daa5f32(View view) {
        super(0);
        this.$itemView = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.core.widget.HSImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.core.widget.HSImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HSImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$itemView.findViewById(2131179157);
    }
}
