package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.C2176e;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import p003X.C136470cRd;

/* loaded from: classes17.dex */
public class CJPayTradeConfirmResponseBean implements CJPayObject {
    public int pwd_left_lock_time;
    public int pwd_left_retry_time;
    public String code = "";
    public String msg = "";
    public String out_trade_no = "";
    public String pwd_left_lock_time_desc = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public CJPayProcessInfo process_info = new CJPayProcessInfo();
    public CJPayPayTypeInfo paytype_info = new CJPayPayTypeInfo();
    public String jump_url = "";
    public String mobile = "";
    public CJPayFaceVerifyInfo face_verify_info = new CJPayFaceVerifyInfo();
    public CombineLimitInfo combine_limit_button = new CombineLimitInfo();
    public ForgetPwdInfo forget_pwd_info = new ForgetPwdInfo();
    public RecommendVerifyInfo recommend_verify_info = new RecommendVerifyInfo();
    public String pay_type = "";
    public String combine_type = "";
    public String bank_card_id = "";
    public C136470cRd exts = new C136470cRd();
    public CJPayInsufficientBalanceHintInfo hint_info = new CJPayInsufficientBalanceHintInfo();
    public String change_pay_type_desc = "";
    public String unavailable_pay_type_sub_title = "";
    public C2176e icon_tips = new C2176e();
    public String biz_fail_reason = "";

    static {
        Covode.recordClassIndex(8352);
    }
}
