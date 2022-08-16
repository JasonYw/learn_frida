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
import p003X.KF8;
import p003X.KFH;

/* loaded from: classes5.dex */
public final class LiveBeautifyFragment$beautyFragment$2 extends Lambda implements Function0<C4183c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KFH this$0;

    static {
        Covode.recordClassIndex(24357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBeautifyFragment$beautyFragment$2(KFH kfh) {
        super(0);
        this.this$0 = kfh;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.effect.beauty.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.effect.beauty.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4183c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KF8 kf8 = C4183c.LIZLLL;
        C4181a c4181a = this.this$0.LJI.LIZIZ;
        LiveEffectContextFactory.Type type = this.this$0.LIZLLL;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c4181a, type}, kf8, KF8.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(type);
        C4183c c4183c = new C4183c();
        c4183c.LIZIZ = c4181a;
        c4183c.LIZJ = type;
        return c4183c;
    }
}
