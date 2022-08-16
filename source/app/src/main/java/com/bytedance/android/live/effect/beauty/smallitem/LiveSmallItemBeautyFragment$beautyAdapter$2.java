package com.bytedance.android.live.effect.beauty.smallitem;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86668KDe;
import p003X.C106862S5w;
import p003X.C86713KEx;
import p003X.KB0;

/* loaded from: classes5.dex */
public final class LiveSmallItemBeautyFragment$beautyAdapter$2 extends Lambda implements Function0<C4190a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86713KEx this$0;

    static {
        Covode.recordClassIndex(24416);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallItemBeautyFragment$beautyAdapter$2(C86713KEx c86713KEx) {
        super(0);
        this.this$0 = c86713KEx;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.effect.beauty.smallitem.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.effect.beauty.smallitem.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4190a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C86713KEx c86713KEx = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c86713KEx, C86713KEx.LIZ, false, 10);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        Boolean LIZ = AbstractC86668KDe.LIZ.LIZ(c86713KEx.LJII);
        int i = c86713KEx.f8393LJ;
        int i2 = c86713KEx.LJFF;
        LiveEffectContextFactory.Type type = c86713KEx.LJII;
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        C4190a c4190a = new C4190a(i, i2, type, LIZ.booleanValue());
        KB0 kb0 = new KB0(c86713KEx);
        if (!PatchProxy.proxy(new Object[]{kb0}, c4190a, C4190a.LIZ, false, 10).isSupported) {
            C106862S5w.LIZ(kb0);
            c4190a.LIZLLL = kb0;
        }
        return c4190a;
    }
}
