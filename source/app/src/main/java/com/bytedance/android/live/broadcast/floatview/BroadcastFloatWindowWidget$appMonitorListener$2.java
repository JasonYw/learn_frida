package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQT;

/* loaded from: classes3.dex */
public final class BroadcastFloatWindowWidget$appMonitorListener$2 extends Lambda implements Function0<AbstractC5826c.C5827a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15858);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$appMonitorListener$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.livehostapi.foundation.depend.c$a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.livehostapi.foundation.depend.c$a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5826c.C5827a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        BroadcastFloatWindowWidget broadcastFloatWindowWidget = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], broadcastFloatWindowWidget, BroadcastFloatWindowWidget.LIZ, false, 22);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new IQT(broadcastFloatWindowWidget);
    }
}
