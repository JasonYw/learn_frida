package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.EffectManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86692KEc;

/* loaded from: classes5.dex */
public final class LiveAreaFilterHelper$mEffectManager$2 extends Lambda implements Function0<EffectManager> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86692KEc this$0;

    static {
        Covode.recordClassIndex(24280);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAreaFilterHelper$mEffectManager$2(C86692KEc c86692KEc) {
        super(0);
        this.this$0 = c86692KEc;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.effectmanager.EffectManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ EffectManager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C4173o.LJIIJ.LIZ(this.this$0.f8389LJ).LIZ();
    }
}
