package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L01;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$messageListener$2 extends Lambda implements Function0<OnMessageListener> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15870);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$messageListener$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ OnMessageListener mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        BroadcastFloatWindowWidget broadcastFloatWindowWidget = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], broadcastFloatWindowWidget, BroadcastFloatWindowWidget.LIZ, false, 25);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new L01(broadcastFloatWindowWidget);
    }
}
