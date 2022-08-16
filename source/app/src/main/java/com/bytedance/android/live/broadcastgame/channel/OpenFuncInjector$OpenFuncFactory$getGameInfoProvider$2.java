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
import p003X.KWT;

/* loaded from: classes5.dex */
public final class OpenFuncInjector$OpenFuncFactory$getGameInfoProvider$2 extends Lambda implements Function0<an$d> {
    public static final OpenFuncInjector$OpenFuncFactory$getGameInfoProvider$2 INSTANCE = new OpenFuncInjector$OpenFuncFactory$getGameInfoProvider$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19378);
    }

    public OpenFuncInjector$OpenFuncFactory$getGameInfoProvider$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.channel.an$d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ an$d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new an$d(C34211.INSTANCE);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.OpenFuncInjector$OpenFuncFactory$getGameInfoProvider$2$1 */
    /* loaded from: classes5.dex */
    public static final class C34211 extends Lambda implements Function1<C3383p, AbstractC13049f<?, ?>> {
        public static final C34211 INSTANCE = new C34211();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19379);
        }

        public C34211() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.web.jsbridge2.f<?, ?>, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ AbstractC13049f<?, ?> invoke(C3383p c3383p) {
            C3383p c3383p2 = c3383p;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new KWT(c3383p2);
        }
    }
}
