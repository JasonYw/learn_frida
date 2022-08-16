package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.widget.RelativeLayout;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardType2Activity$initActions$2 */
/* loaded from: classes17.dex */
public final class SelectBankCardType2Activity$initActions$2 extends Lambda implements Function1<RelativeLayout, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SelectBankCardType2Activity this$0;

    static {
        Covode.recordClassIndex(7259);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBankCardType2Activity$initActions$2(SelectBankCardType2Activity selectBankCardType2Activity) {
        super(1);
        this.this$0 = selectBankCardType2Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RelativeLayout relativeLayout) {
        if (!PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(relativeLayout);
            this.this$0.LIZ("DEBIT");
            this.this$0.LIZ(true, false);
            this.this$0.LIZ();
            C2235c c2235c = this.this$0.mvpLogger;
            if (c2235c != null) {
                String str = this.this$0.quickBindData.bankName;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = this.this$0.LJIJI;
                String str3 = this.this$0.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                c2235c.LIZIZ(str, str2, str3, "activity_info", this.this$0.LJIJI);
            }
        }
        return Unit.INSTANCE;
    }
}
