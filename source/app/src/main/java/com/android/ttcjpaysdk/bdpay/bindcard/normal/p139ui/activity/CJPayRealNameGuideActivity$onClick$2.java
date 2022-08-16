package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayRealNameGuideActivity$onClick$2 */
/* loaded from: classes17.dex */
public final class CJPayRealNameGuideActivity$onClick$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayRealNameGuideActivity this$0;

    static {
        Covode.recordClassIndex(6884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayRealNameGuideActivity$onClick$2(CJPayRealNameGuideActivity cJPayRealNameGuideActivity) {
        super(0);
        this.this$0 = cJPayRealNameGuideActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LinearLayout linearLayout = this.this$0.LJFF;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            this.this$0.LJI = true;
        }
        return Unit.INSTANCE;
    }
}
