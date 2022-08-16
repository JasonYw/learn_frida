package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.soundeffect.C4207a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KGD;

/* loaded from: classes5.dex */
public final class LiveSoundEffectDialogFragment$soundAdapter$2 extends Lambda implements Function0<C4207a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KGD this$0;

    static {
        Covode.recordClassIndex(24283);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSoundEffectDialogFragment$soundAdapter$2(KGD kgd) {
        super(0);
        this.this$0 = kgd;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.effect.soundeffect.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.effect.soundeffect.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4207a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KGD kgd = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], kgd, KGD.LIZ, false, 12);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new C4207a(kgd.LIZJ, kgd.LIZIZ);
    }
}
