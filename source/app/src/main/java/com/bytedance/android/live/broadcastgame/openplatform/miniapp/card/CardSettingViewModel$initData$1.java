package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C1KL;

/* loaded from: classes5.dex */
public final class CardSettingViewModel$initData$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3796c this$0;

    static {
        Covode.recordClassIndex(21529);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingViewModel$initData$1(C3796c c3796c) {
        super(1);
        this.this$0 = c3796c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C3796c c3796c = this.this$0;
            c3796c.LIZ((C1KL<C1KL<Boolean>>) c3796c.LJFF(), (C1KL<Boolean>) Boolean.valueOf(booleanValue));
        }
        return Unit.INSTANCE;
    }
}
