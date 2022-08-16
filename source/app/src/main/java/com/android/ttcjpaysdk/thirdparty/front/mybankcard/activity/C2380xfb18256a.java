package com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayAllBankCardActivity$gotoBindCardByLynx$$inlined$apply$lambda$1 */
/* loaded from: classes17.dex */
public final class C2380xfb18256a extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayAllBankCardActivity this$0;

    static {
        Covode.recordClassIndex(8701);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380xfb18256a(CJPayAllBankCardActivity cJPayAllBankCardActivity) {
        super(0);
        this.this$0 = cJPayAllBankCardActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ();
        }
        return Unit.INSTANCE;
    }
}
