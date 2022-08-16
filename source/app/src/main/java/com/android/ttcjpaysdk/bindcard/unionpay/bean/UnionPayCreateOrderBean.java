package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class UnionPayCreateOrderBean extends CJPayBindCardBaseBean {
    public CJPayButtonInfo button_info;
    public String member_biz_order_no;
    public UnionPaySignInfo union_pay_sign_info;

    static {
        Covode.recordClassIndex(7332);
    }

    public UnionPayCreateOrderBean() {
        this(null, null, null, 7, null);
    }

    public UnionPayCreateOrderBean(CJPayButtonInfo cJPayButtonInfo, String str, UnionPaySignInfo unionPaySignInfo) {
        C106862S5w.LIZ(cJPayButtonInfo, str, unionPaySignInfo);
        this.button_info = cJPayButtonInfo;
        this.member_biz_order_no = str;
        this.union_pay_sign_info = unionPaySignInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ UnionPayCreateOrderBean(com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo r14, java.lang.String r15, com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r13 = this;
            r1 = r16
            r0 = r17 & 1
            if (r0 == 0) goto Lb
            com.android.ttcjpaysdk.base.ui.data.CJPayButtonInfo r14 = new com.android.ttcjpaysdk.base.ui.data.CJPayButtonInfo
            r14.<init>()
        Lb:
            r0 = r17 & 2
            if (r0 == 0) goto L11
            java.lang.String r15 = ""
        L11:
            r0 = r17 & 4
            if (r0 == 0) goto L2b
            com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo r1 = new com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r12 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r13
        L27:
            r13.<init>(r14, r15, r1)
            return
        L2b:
            r0 = r13
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayCreateOrderBean.<init>(com.android.ttcjpaysdk.base.ui.data.CJPayButtonInfo, java.lang.String, com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
