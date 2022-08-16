package com.android.ttcjpaysdk.bindcard.quickbind.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class CJPayOneKeySignOrderResponseBean extends CJPayBindCardBaseBean implements CJPayObject {
    public String bank_url = "";
    public String member_biz_order_no = "";
    public String post_data = "";
    public String sign = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public CJPayFaceVerifyInfo face_verify_info = new CJPayFaceVerifyInfo();
    public String additional_verify_type = "";

    static {
        Covode.recordClassIndex(7245);
    }
}
