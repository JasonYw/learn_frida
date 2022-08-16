package com.bytedance.android.live.effect.beauty;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KF6;
import p003X.KFH;

/* loaded from: classes5.dex */
public final class LiveBeautifyFragment$filterFragment$2 extends Lambda implements Function0<C4184d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KFH this$0;

    static {
        Covode.recordClassIndex(24358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBeautifyFragment$filterFragment$2(KFH kfh) {
        super(0);
        this.this$0 = kfh;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.effect.beauty.d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.effect.beauty.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4184d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KF6 kf6 = C4184d.LJFF;
        a$a a_a = new a$a() { // from class: com.bytedance.android.live.effect.beauty.LiveBeautifyFragment$filterFragment$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24359);
            }

            @Override // com.bytedance.android.live.effect.p329a.a$a
            public final void LIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LiveBeautifyFragment$filterFragment$2.this.this$0.LIZIZ();
                a$a a_a2 = LiveBeautifyFragment$filterFragment$2.this.this$0.LJFF;
                if (a_a2 != null) {
                    a_a2.LIZ(i);
                }
            }
        };
        LiveEffectContextFactory.Type type = this.this$0.LIZLLL;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{a_a, type}, kf6, KF6.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(a_a, type);
        C4184d c4184d = new C4184d();
        c4184d.LIZJ = a_a;
        c4184d.LIZIZ = type;
        return c4184d;
    }
}
