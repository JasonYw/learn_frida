package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.m$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C64646Bf6;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$mRemoteFilterGetListener$2 extends Lambda implements Function0<m$b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectLivePreviewActivityProxy this$0;

    static {
        Covode.recordClassIndex(24835);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLivePreviewActivityProxy$mRemoteFilterGetListener$2(EffectLivePreviewActivityProxy effectLivePreviewActivityProxy) {
        super(0);
        this.this$0 = effectLivePreviewActivityProxy;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.effect.m$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.effect.m$b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ m$b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        EffectLivePreviewActivityProxy effectLivePreviewActivityProxy = this.this$0;
        if (effectLivePreviewActivityProxy != null) {
            return C64646Bf6.LIZ(effectLivePreviewActivityProxy);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.effect.LiveFilterManager.RemoteFilterGetListener");
    }
}
