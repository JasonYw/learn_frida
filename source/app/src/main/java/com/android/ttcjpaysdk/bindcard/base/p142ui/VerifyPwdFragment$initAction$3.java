package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.widget.TextView;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2202e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.VerifyPwdFragment$initAction$3 */
/* loaded from: classes17.dex */
public final class VerifyPwdFragment$initAction$3 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VerifyPwdFragment this$0;

    static {
        Covode.recordClassIndex(7110);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPwdFragment$initAction$3(VerifyPwdFragment verifyPwdFragment) {
        super(1);
        this.this$0 = verifyPwdFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            this.this$0.updateForgetPwdViewStatus(false);
            this.this$0.openForgotPassword();
            C2202e c2202e = this.this$0.mvpLogger;
            if (c2202e != null) {
                c2202e.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}