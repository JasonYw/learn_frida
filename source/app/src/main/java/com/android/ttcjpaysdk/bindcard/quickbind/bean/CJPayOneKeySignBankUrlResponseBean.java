package com.android.ttcjpaysdk.bindcard.quickbind.bean;

import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class CJPayOneKeySignBankUrlResponseBean extends CJPayBindCardBaseBean {
    public String bank_url = "";
    public String post_data = "";
    public String sign = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();

    static {
        Covode.recordClassIndex(7244);
    }
}
