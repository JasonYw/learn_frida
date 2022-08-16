package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C1KL;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$loadingStatus$2 extends Lambda implements Function0<C1KL<Boolean>> {
    public static final CardSettingViewModel$loadingStatus$2 INSTANCE = new CardSettingViewModel$loadingStatus$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21530);
    }

    public CardSettingViewModel$loadingStatus$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1KL<java.lang.Boolean>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C1KL<Boolean> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C1KL<>();
    }
}
