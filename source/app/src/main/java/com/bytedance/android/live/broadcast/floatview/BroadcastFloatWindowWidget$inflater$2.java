package com.bytedance.android.live.broadcast.floatview;

import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$inflater$2 extends Lambda implements Function0<LayoutInflater> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15869);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$inflater$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.LayoutInflater, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LayoutInflater mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LayoutInflater.from(this.this$0.context);
    }
}
