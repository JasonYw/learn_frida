package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.view.View;
import android.widget.TextView;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135737cFo;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuthActivity$onTwoElementVerifySuccess$$inlined$apply$lambda$1 */
/* loaded from: classes17.dex */
public final class C2247xef1c0f61 extends Lambda implements Function2<Integer, View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayTwoAuthVerifyBean $this_apply;
    public final /* synthetic */ TwoElementAuthActivity this$0;

    static {
        Covode.recordClassIndex(7303);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247xef1c0f61(CJPayTwoAuthVerifyBean cJPayTwoAuthVerifyBean, TwoElementAuthActivity twoElementAuthActivity) {
        super(2);
        this.$this_apply = cJPayTwoAuthVerifyBean;
        this.this$0 = twoElementAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, View view) {
        String str;
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue()), view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            if (this.$this_apply.button_info.isGoCustomerServiceDialog()) {
                String str2 = "";
                if (view2 instanceof TextView) {
                    str = ((TextView) view2).getText().toString();
                } else {
                    str = str2;
                }
                String str3 = this.$this_apply.code;
                if (str3 == null) {
                    str3 = str2;
                }
                String str4 = this.$this_apply.button_info.page_desc;
                Intrinsics.checkNotNullExpressionValue(str4, str2);
                String str5 = this.this$0.LJFF.merchantId;
                if (str5 == null) {
                    str5 = str2;
                }
                String str6 = this.this$0.LJFF.appId;
                if (str6 != null) {
                    str2 = str6;
                }
                C135737cFo.LIZ("3.1", str3, str4, str, str5, str2);
            }
        }
        return Unit.INSTANCE;
    }
}
