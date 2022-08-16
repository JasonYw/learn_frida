package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.AbstractC87670Kga;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final /* synthetic */ class OpenApiSupportPluginRuntime$startPluginInternal$1 extends FunctionReferenceImpl implements Function1<v$a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20889);
    }

    public OpenApiSupportPluginRuntime$startPluginInternal$1(AbstractC87670Kga abstractC87670Kga) {
        super(1, abstractC87670Kga, AbstractC87670Kga.class, "onEventEnter", "onEventEnter(Lcom/bytedance/android/live/broadcastgame/opengame/runtime/LivePluginState$Event;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(v$a v_a) {
        v$a v_a2 = v_a;
        if (!PatchProxy.proxy(new Object[]{v_a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(v_a2);
            ((AbstractC87670Kga) this.receiver).onEventEnter(v_a2);
        }
        return Unit.INSTANCE;
    }
}
