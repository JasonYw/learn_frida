package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$canChangeCover$2 extends Lambda implements Function0<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3796c this$0;

    static {
        Covode.recordClassIndex(21524);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingViewModel$canChangeCover$2(C3796c c3796c) {
        super(0);
        this.this$0 = c3796c;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PageDataV2 pageDataV2 = this.this$0.LIZJ;
        if (pageDataV2 != null) {
            return Boolean.valueOf(pageDataV2.LJI);
        }
        return null;
    }
}
