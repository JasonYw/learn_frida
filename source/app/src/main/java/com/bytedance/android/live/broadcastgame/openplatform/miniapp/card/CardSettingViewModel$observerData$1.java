package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$observerData$1 extends Lambda implements Function1<C8906gu, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3796c this$0;

    static {
        Covode.recordClassIndex(21531);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingViewModel$observerData$1(C3796c c3796c) {
        super(1);
        this.this$0 = c3796c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C8906gu c8906gu) {
        C8906gu c8906gu2 = c8906gu;
        if (!PatchProxy.proxy(new Object[]{c8906gu2}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(c8906gu2.LIZJ);
        }
        return Unit.INSTANCE;
    }
}
