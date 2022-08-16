package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87213KYd;
import p003X.KWU;

/* loaded from: classes5.dex */
public final class OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2 extends Lambda implements Function0<an$d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87213KYd this$0;

    static {
        Covode.recordClassIndex(19380);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2(C87213KYd c87213KYd) {
        super(0);
        this.this$0 = c87213KYd;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.channel.an$d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ an$d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new an$d(new C34221());
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2$1 */
    /* loaded from: classes5.dex */
    public static final class C34221 extends Lambda implements Function1<C3383p, AbstractC13049f<?, ?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19381);
        }

        public C34221() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.web.jsbridge2.f<?, ?>, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ AbstractC13049f<?, ?> invoke(C3383p c3383p) {
            C3383p c3383p2 = c3383p;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            KWU kwu = new KWU(OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2.this.this$0.LIZLLL.LIZIZ, OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2.this.this$0.LIZLLL.LIZJ, OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2.this.this$0.LIZJ, OpenFuncInjector$OpenFuncFactory$showPanelMethodProvider$2.this.this$0.LIZIZ);
            kwu.LIZ(c3383p2);
            return kwu;
        }
    }
}
