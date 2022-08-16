package com.bytedance.android.live.liveinteract.voicechat.view;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VoiceChatRecyclerView$redTeamRect$2 extends Lambda implements Function0<Rect> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VoiceChatRecyclerView this$0;

    static {
        Covode.recordClassIndex(31849);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatRecyclerView$redTeamRect$2(VoiceChatRecyclerView voiceChatRecyclerView) {
        super(0);
        this.this$0 = voiceChatRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Rect, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Rect mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Rect(0, 0, this.this$0.getWidth(), this.this$0.getHeight());
    }
}
