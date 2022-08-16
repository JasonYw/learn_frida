package com.bytedance.android.live.broadcast.bgbroadcast.game.window;

import com.bytedance.android.live.broadcast.bgbroadcast.game.C2942o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88823KzB;

/* loaded from: classes5.dex */
public final class LiveGamePlayTogetherFloatWindow$createFloatWindow$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2942o $stateMachine;

    static {
        Covode.recordClassIndex(14861);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGamePlayTogetherFloatWindow$createFloatWindow$1(C2942o c2942o) {
        super(0);
        this.$stateMachine = c2942o;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC2948d abstractC2948d;
        LinkedHashMap<String, AbstractC2948d> linkedHashMap;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2942o c2942o = this.$stateMachine;
        if (c2942o != null && (linkedHashMap = c2942o.LJII) != null) {
            abstractC2948d = linkedHashMap.get("control_view");
        } else {
            abstractC2948d = null;
        }
        if (!(abstractC2948d instanceof AbstractC88823KzB)) {
            abstractC2948d = null;
        }
        AbstractC88823KzB abstractC88823KzB = (AbstractC88823KzB) abstractC2948d;
        if (abstractC88823KzB == null) {
            return null;
        }
        abstractC88823KzB.LIZ(true);
        return Unit.INSTANCE;
    }
}
