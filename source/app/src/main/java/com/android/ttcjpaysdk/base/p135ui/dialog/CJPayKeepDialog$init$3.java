package com.android.ttcjpaysdk.base.p135ui.dialog;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135399cAM;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.dialog.CJPayKeepDialog$init$3 */
/* loaded from: classes17.dex */
public final class CJPayKeepDialog$init$3 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC2180b this$0;

    static {
        Covode.recordClassIndex(6663);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayKeepDialog$init$3(DialogC2180b dialogC2180b) {
        super(1);
        this.this$0 = dialogC2180b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            AbstractC135399cAM abstractC135399cAM = this.this$0.LIZLLL;
            if (abstractC135399cAM != null) {
                abstractC135399cAM.LIZJ();
            }
        }
        return Unit.INSTANCE;
    }
}
