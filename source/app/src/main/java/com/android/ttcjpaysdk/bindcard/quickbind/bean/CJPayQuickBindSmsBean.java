package com.android.ttcjpaysdk.bindcard.quickbind.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class CJPayQuickBindSmsBean extends CJPayBindCardBaseBean implements CJPayObject {
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public String ret_status;
    public String sms_token;

    static {
        Covode.recordClassIndex(7246);
    }
}
