package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.gamedetail.AbstractC3095d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89038L6i;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class GameViewModelCompatEffect$getDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ C89038L6i this$0;

    static {
        Covode.recordClassIndex(16194);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModelCompatEffect$getDataContext$1(C89038L6i c89038L6i, Class cls) {
        super(0);
        this.this$0 = c89038L6i;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C89038L6i c89038L6i = this.this$0;
        Class cls = this.$clazz;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, c89038L6i, C89038L6i.LIZ, false, 7);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        GameViewModelCompatEffect$getDataContextInternal$1 gameViewModelCompatEffect$getDataContextInternal$1 = new GameViewModelCompatEffect$getDataContextInternal$1(cls);
        if (!AbstractC3095d.class.isAssignableFrom(cls)) {
            ALogger.m15800e("GamePromoteBaseViewModel", "try to getDataContext which is not GamePromoteBaseViewModel");
            return gameViewModelCompatEffect$getDataContextInternal$1.mo30099invoke();
        }
        AbstractC3095d LIZIZ = AbstractC3095d.LJIILLIIL.LIZIZ(cls);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        AbstractC3095d abstractC3095d = (AbstractC3095d) IQV.LIZ(c89038L6i.LIZIZ, (Function1) null, 2, (Object) null).LIZ(cls);
        abstractC3095d.LIZLLL();
        return abstractC3095d;
    }
}
