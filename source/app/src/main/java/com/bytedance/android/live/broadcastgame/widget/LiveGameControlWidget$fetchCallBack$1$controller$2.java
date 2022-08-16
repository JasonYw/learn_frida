package com.bytedance.android.live.broadcastgame.widget;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.effectgame.base.C3469k;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87107KUb;

/* loaded from: classes5.dex */
public final class LiveGameControlWidget$fetchCallBack$1$controller$2 extends Lambda implements Function0<C3469k> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87107KUb this$0;

    static {
        Covode.recordClassIndex(21847);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameControlWidget$fetchCallBack$1$controller$2(C87107KUb c87107KUb) {
        super(0);
        this.this$0 = c87107KUb;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcastgame.effectgame.base.k, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3469k mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.LIZIZ.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C3469k(context);
    }
}
