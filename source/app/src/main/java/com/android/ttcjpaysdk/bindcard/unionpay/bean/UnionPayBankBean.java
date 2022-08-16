package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class UnionPayBankBean implements CJPayObject, Serializable {
    public boolean isChecked;
    public String bank_code = "";
    public String card_type = "";
    public String bank_name = "";
    public String card_no_mask = "";
    public String icon_url = "";
    public String status = "";
    public String display_desc = "";
    public CJPayProtocolGroupContentsBean protocol_group_contents = new CJPayProtocolGroupContentsBean();

    static {
        Covode.recordClassIndex(7331);
    }
}
