package com.bytedance.android.live.effect.gift;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KQ7;
import p003X.KQC;

/* loaded from: classes5.dex */
public final class GiftEffectResourceServiceHolder$Companion$instance$2 extends Lambda implements Function0<AbstractC4203d> {
    public static final GiftEffectResourceServiceHolder$Companion$instance$2 INSTANCE = new GiftEffectResourceServiceHolder$Companion$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24523);
    }

    public GiftEffectResourceServiceHolder$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.effect.gift.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.effect.gift.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC4203d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], KQC.LIZIZ, KQC.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new KQ7();
    }
}
