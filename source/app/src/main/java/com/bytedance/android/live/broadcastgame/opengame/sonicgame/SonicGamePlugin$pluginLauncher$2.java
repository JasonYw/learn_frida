package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11523c;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11524d;
import com.bytedance.bdp.live.livecontainer.sonicgame.C11526j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87959KlF;
import p003X.C106862S5w;
import p003X.C150119g0N;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$pluginLauncher$2 extends Lambda implements Function0<AbstractC87959KlF<C11526j, AbstractC11524d>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SonicGamePlugin this$0;

    static {
        Covode.recordClassIndex(21114);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$pluginLauncher$2(SonicGamePlugin sonicGamePlugin) {
        super(0);
        this.this$0 = sonicGamePlugin;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.KlF<com.bytedance.bdp.live.livecontainer.sonicgame.j, com.bytedance.bdp.live.livecontainer.sonicgame.d>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.KlF<com.bytedance.bdp.live.livecontainer.sonicgame.j, com.bytedance.bdp.live.livecontainer.sonicgame.d>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC87959KlF<C11526j, AbstractC11524d> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C150119g0N c150119g0N = C150119g0N.LIZLLL;
        String str = this.this$0.LJIIIZ.LJIIIIZZ.LJII;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c150119g0N, C150119g0N.LIZ, false, 3);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C106862S5w.LIZ(str);
        AbstractC11523c abstractC11523c = C150119g0N.LIZJ;
        if (abstractC11523c != null) {
            return abstractC11523c.LIZ(str);
        }
        return null;
    }
}
