package com.bytedance.android.live.effect.beauty;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.beauty.makeups.C4188c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KFN;

/* loaded from: classes5.dex */
public final class PreViewMakeupsBeautyFragment$fragment$2 extends Lambda implements Function0<C4188c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4185e this$0;

    static {
        Covode.recordClassIndex(24362);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreViewMakeupsBeautyFragment$fragment$2(C4185e c4185e) {
        super(0);
        this.this$0 = c4185e;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.effect.beauty.makeups.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.effect.beauty.makeups.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4188c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KFN kfn = C4188c.LJFF;
        String str = this.this$0.LIZJ;
        C4181a c4181a = this.this$0.LIZLLL;
        LiveEffectContextFactory.Type type = this.this$0.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, c4181a, type}, kfn, KFN.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(str, type);
        C4188c c4188c = new C4188c();
        c4188c.LIZJ = c4181a;
        c4188c.LIZLLL = type;
        return c4188c;
    }
}
