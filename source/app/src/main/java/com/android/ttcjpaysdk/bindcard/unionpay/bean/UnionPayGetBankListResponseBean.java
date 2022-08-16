package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class UnionPayGetBankListResponseBean extends CJPayBindCardBaseBean {
    public ArrayList<UnionPayBankBean> union_pay_banks = new ArrayList<>();
    public String has_bindable_card = "";
    public CopywritingInfo unbindable_copywriting_info = new CopywritingInfo();

    static {
        Covode.recordClassIndex(7333);
    }
}
