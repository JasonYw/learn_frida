package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.VerifyPwdFragment$initAction$2 */
/* loaded from: classes25.dex */
public final class VerifyPwdFragment$initAction$2 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VerifyPwdFragment this$0;

    static {
        Covode.recordClassIndex(7109);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPwdFragment$initAction$2(VerifyPwdFragment verifyPwdFragment) {
        super(1);
        this.this$0 = verifyPwdFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            this.this$0.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
