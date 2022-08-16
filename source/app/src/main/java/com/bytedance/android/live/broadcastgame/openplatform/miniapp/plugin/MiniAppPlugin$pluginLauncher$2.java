package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin;

import com.bytedance.bdp.live.livecontainer.base.AbstractC11513e;
import com.bytedance.bdp.live.livecontainer.miniapp.AbstractC11517a;
import com.bytedance.bdp.live.livecontainer.miniapp.C11518g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87959KlF;
import p003X.C106862S5w;
import p003X.C150119g0N;
import p003X.C87823Kj3;

/* loaded from: classes5.dex */
public final class MiniAppPlugin$pluginLauncher$2 extends Lambda implements Function0<AbstractC87959KlF<C11518g, AbstractC11513e>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87823Kj3 this$0;

    static {
        Covode.recordClassIndex(21708);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppPlugin$pluginLauncher$2(C87823Kj3 c87823Kj3) {
        super(0);
        this.this$0 = c87823Kj3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.KlF<com.bytedance.bdp.live.livecontainer.miniapp.g, com.bytedance.bdp.live.livecontainer.base.e>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.KlF<com.bytedance.bdp.live.livecontainer.miniapp.g, com.bytedance.bdp.live.livecontainer.base.e>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC87959KlF<C11518g, AbstractC11513e> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C150119g0N c150119g0N = C150119g0N.LIZLLL;
        String str = this.this$0.LJIIJJI.LJIIIIZZ.LJII;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c150119g0N, C150119g0N.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(str);
        AbstractC11517a abstractC11517a = C150119g0N.LIZIZ;
        if (abstractC11517a != null) {
            return abstractC11517a.LIZ(str);
        }
        return null;
    }
}
