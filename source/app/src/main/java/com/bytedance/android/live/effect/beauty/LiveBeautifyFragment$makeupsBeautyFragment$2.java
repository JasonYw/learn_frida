package com.bytedance.android.live.effect.beauty;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KFG;
import p003X.KFH;

/* loaded from: classes5.dex */
public final class LiveBeautifyFragment$makeupsBeautyFragment$2 extends Lambda implements Function0<C4185e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KFH this$0;

    static {
        Covode.recordClassIndex(24360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBeautifyFragment$makeupsBeautyFragment$2(KFH kfh) {
        super(0);
        this.this$0 = kfh;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, com.bytedance.android.live.effect.beauty.e] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.bytedance.android.live.effect.beauty.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4185e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KFG kfg = C4185e.f26217LJ;
        String str = this.this$0.LIZIZ;
        C4181a c4181a = this.this$0.LJI.LIZIZ;
        LiveEffectContextFactory.Type type = this.this$0.LIZLLL;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, c4181a, type}, kfg, KFG.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(str, type);
        C4185e c4185e = new C4185e();
        c4185e.LIZJ = str;
        c4185e.LIZLLL = c4181a;
        c4185e.LIZIZ = type;
        return c4185e;
    }
}
