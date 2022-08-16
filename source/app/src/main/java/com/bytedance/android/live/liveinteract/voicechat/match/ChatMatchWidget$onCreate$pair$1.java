package com.bytedance.android.live.liveinteract.voicechat.match;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ChatMatchWidget$onCreate$pair$1 extends Lambda implements Function0<C5074d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ChatMatchWidget this$0;

    static {
        Covode.recordClassIndex(31469);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMatchWidget$onCreate$pair$1(ChatMatchWidget chatMatchWidget) {
        super(0);
        this.this$0 = chatMatchWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.liveinteract.voicechat.match.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5074d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DataCenter dataCenter = this.this$0.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new C5074d(dataCenter);
    }
}
