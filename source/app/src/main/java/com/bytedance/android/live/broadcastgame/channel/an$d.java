package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class an$d implements AbstractC13049f.AbstractC13051b {
    public static ChangeQuickRedirect LIZ;
    public C3383p LIZIZ;
    public final Function1<C3383p, AbstractC13049f<?, ?>> LIZJ;

    static {
        Covode.recordClassIndex(19438);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f.AbstractC13051b
    public final AbstractC13049f<?, ?> provideMethod() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC13049f) proxy.result;
        }
        return this.LIZJ.invoke(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public an$d(Function1<? super C3383p, ? extends AbstractC13049f<?, ?>> function1) {
        C106862S5w.LIZ(function1);
        this.LIZJ = function1;
    }
}
