package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.fragment;

import android.widget.CheckBox;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCircleCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135347c9W;
import p003X.C135440cB1;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.fragment.CJPayBindCardKeepDialogFragment$initActions$3 */
/* loaded from: classes17.dex */
public final class CJPayBindCardKeepDialogFragment$initActions$3 extends Lambda implements Function1<CJPayCircleCheckBox, Unit> {
    public static final CJPayBindCardKeepDialogFragment$initActions$3 INSTANCE = new CJPayBindCardKeepDialogFragment$initActions$3();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6946);
    }

    public CJPayBindCardKeepDialogFragment$initActions$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCircleCheckBox cJPayCircleCheckBox) {
        String str;
        CJPayCircleCheckBox cJPayCircleCheckBox2 = cJPayCircleCheckBox;
        if (!PatchProxy.proxy(new Object[]{cJPayCircleCheckBox2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCircleCheckBox2);
            cJPayCircleCheckBox2.LIZ();
            CheckBox checkBox = cJPayCircleCheckBox2.getCheckBox();
            Intrinsics.checkNotNullExpressionValue(checkBox, "");
            if (checkBox.isChecked()) {
                str = "勾选";
            } else {
                str = "取消勾选";
            }
            C135440cB1.LIZ("", str, C135347c9W.LJIIIIZZ);
        }
        return Unit.INSTANCE;
    }
}
