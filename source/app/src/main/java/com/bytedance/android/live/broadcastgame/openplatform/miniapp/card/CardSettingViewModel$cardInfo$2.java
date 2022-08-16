package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C1KL;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$cardInfo$2 extends Lambda implements Function0<C1KL<Pair<? extends C8733af, ? extends C3561g>>> {
    public static final CardSettingViewModel$cardInfo$2 INSTANCE = new CardSettingViewModel$cardInfo$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21525);
    }

    public CardSettingViewModel$cardInfo$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1KL<kotlin.Pair<? extends com.bytedance.android.livesdk.message.model.af, ? extends com.bytedance.android.live.broadcastgame.opengame.network.g>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C1KL<Pair<? extends C8733af, ? extends C3561g>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C1KL<>();
    }
}
