package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class RadioRoomApplyTitleViewHolder$currentOrder$2 extends Lambda implements Function0<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $itemView;

    static {
        Covode.recordClassIndex(26081);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioRoomApplyTitleViewHolder$currentOrder$2(View view) {
        super(0);
        this.$itemView = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ TextView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$itemView.findViewById(2131171902);
    }
}
