package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.widget.TextView;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135876cI3;
import p003X.C135996cJz;
import p003X.C136011cKE;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuth2Activity$initActions$2 */
/* loaded from: classes17.dex */
public final class TwoElementAuth2Activity$initActions$2 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TwoElementAuth2Activity this$0;

    static {
        Covode.recordClassIndex(7289);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoElementAuth2Activity$initActions$2(TwoElementAuth2Activity twoElementAuth2Activity) {
        super(1);
        this.this$0 = twoElementAuth2Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            TwoElementAuth2Activity twoElementAuth2Activity = this.this$0;
            if (!PatchProxy.proxy(new Object[0], twoElementAuth2Activity, TwoElementAuth2Activity.LIZ, false, 20).isSupported) {
                C136011cKE LIZ = C135996cJz.LIZ().LIZ("/normalbind/CJPayCardBinActivity").LIZ("param_bind_card_info", C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo()).LIZ("hide_card_list", true).LIZ("force_not_show_real_name_auth", true).LIZ("is_first_bind_card_page", false).LIZ(AnimationType.SlideLeftAndRigth);
                if (C135876cI3.f17973LJ.LJIILIIL().isIndependentBindCard()) {
                    LIZ.LIZ("param_is_independent_bind_card", true);
                }
                LIZ.LIZ(twoElementAuth2Activity);
            }
            C2237e c2237e = this.this$0.mvpLogger;
            if (c2237e != null) {
                c2237e.LIZ(1);
            }
        }
        return Unit.INSTANCE;
    }
}
