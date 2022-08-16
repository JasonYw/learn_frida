package com.android.ttcjpaysdk.thirdparty.front.mybankcard.marketing;

import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPaySingleBankActivityInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135623cDy;
import p003X.C135621cDw;

/* loaded from: classes17.dex */
public final class CJPayMarketingViewHolder$initAction$$inlined$let$lambda$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPaySingleBankActivityInfo $info$inlined;
    public final /* synthetic */ AbstractC135623cDy $it;
    public final /* synthetic */ C135621cDw this$0;

    static {
        Covode.recordClassIndex(8750);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayMarketingViewHolder$initAction$$inlined$let$lambda$2(AbstractC135623cDy abstractC135623cDy, C135621cDw c135621cDw, CJPaySingleBankActivityInfo cJPaySingleBankActivityInfo) {
        super(0);
        this.$it = abstractC135623cDy;
        this.this$0 = c135621cDw;
        this.$info$inlined = cJPaySingleBankActivityInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$it.LIZIZ(this.$info$inlined);
        }
        return Unit.INSTANCE;
    }
}
