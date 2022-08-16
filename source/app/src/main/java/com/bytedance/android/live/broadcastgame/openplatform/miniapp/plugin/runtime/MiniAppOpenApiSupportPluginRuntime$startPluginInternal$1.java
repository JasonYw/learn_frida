package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.AbstractC87669KgZ;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final /* synthetic */ class MiniAppOpenApiSupportPluginRuntime$startPluginInternal$1 extends FunctionReferenceImpl implements Function1<b$a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21770);
    }

    public MiniAppOpenApiSupportPluginRuntime$startPluginInternal$1(AbstractC87669KgZ abstractC87669KgZ) {
        super(1, abstractC87669KgZ, AbstractC87669KgZ.class, "onEventEnter", "onEventEnter(Lcom/bytedance/android/live/broadcastgame/openplatform/miniapp/plugin/MiniAppLivePluginState$Event;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(b$a b_a) {
        b$a b_a2 = b_a;
        if (!PatchProxy.proxy(new Object[]{b_a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(b_a2);
            ((AbstractC87669KgZ) this.receiver).onEventEnter(b_a2);
        }
        return Unit.INSTANCE;
    }
}
