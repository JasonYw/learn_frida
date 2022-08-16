package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87889Kk7;

/* loaded from: classes5.dex */
public final class NormalCard$initData$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87889Kk7 this$0;

    static {
        Covode.recordClassIndex(21595);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCard$initData$2(C87889Kk7 c87889Kk7) {
        super(0);
        this.this$0 = c87889Kk7;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Function0<Unit> onClickBlock;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (onClickBlock = this.this$0.getOnClickBlock()) != null) {
            onClickBlock.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
