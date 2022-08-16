package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.interfaces.DraweeController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$anchorMicController$2 extends Lambda implements Function0<DraweeController> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15857);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$anchorMicController$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.drawee.interfaces.DraweeController, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DraweeController mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZ("asset://com.ss.android.ies.live.sdk/live_audio_float_anchor_animation.webp");
    }
}
