package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class CJPaySmsTokenBean extends CJPayBindCardBaseBean {
    public String sms_token = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public String verify_text_msg = "";
    public String mobile_mask = "";
    public CJPayFaceVerifyInfo face_verify_info = new CJPayFaceVerifyInfo();

    static {
        Covode.recordClassIndex(7035);
    }
}
