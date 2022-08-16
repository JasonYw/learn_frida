package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C1KL;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$reviewStatus$2 extends Lambda implements Function0<C1KL<PageDataV2.ReviewStatus>> {
    public static final CardSettingViewModel$reviewStatus$2 INSTANCE = new CardSettingViewModel$reviewStatus$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21534);
    }

    public CardSettingViewModel$reviewStatus$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1KL<com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C1KL<PageDataV2.ReviewStatus> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C1KL<>();
    }
}
