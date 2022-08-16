package com.bytedance.android.live.effect.beauty;

import com.bytedance.android.live.effect.C4204i;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.android.live.effect.template.C4225b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C467014dL;
import p003X.KEB;

/* loaded from: classes5.dex */
public final class PreViewFilterFragment$fragment$2 extends Lambda implements Function0<C4204i> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4184d this$0;

    static {
        Covode.recordClassIndex(24361);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreViewFilterFragment$fragment$2(C4184d c4184d) {
        super(0);
        this.this$0 = c4184d;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.effect.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4204i mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4225b c4225b = new C4225b(2131699103, new C467014dL());
        a$a a_a = this.this$0.f26216LJ;
        KEB LJI = C4173o.LJIIJ.LIZ(this.this$0.LIZIZ).LJIIIIZZ().LJI();
        Intrinsics.checkNotNullExpressionValue(LJI, "");
        return C4204i.LIZ(a_a, LJI.LIZIZ, c4225b, this.this$0.LIZIZ);
    }
}
