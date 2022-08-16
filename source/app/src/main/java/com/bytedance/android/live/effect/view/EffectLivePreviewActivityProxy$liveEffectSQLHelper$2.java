package com.bytedance.android.live.effect.view;

import android.content.Context;
import com.bytedance.android.live.effect.C4202f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$liveEffectSQLHelper$2 extends Lambda implements Function0<C4202f> {
    public static final EffectLivePreviewActivityProxy$liveEffectSQLHelper$2 INSTANCE = new EffectLivePreviewActivityProxy$liveEffectSQLHelper$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24834);
    }

    public EffectLivePreviewActivityProxy$liveEffectSQLHelper$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.effect.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4202f mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context LJIIJ = LK5.LJIIJ();
        Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
        return new C4202f(LJIIJ);
    }
}
