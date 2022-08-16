package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUnionPassParams;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserInfo;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayCardAddBean extends CJPayBindCardBaseBean {
    public CJPayBindCardParamsBean url_params = new CJPayBindCardParamsBean();
    public CJPayUserInfo user_info = new CJPayUserInfo();
    public VerifyPwdTxtInfo verify_pwd_copywriting_info = new VerifyPwdTxtInfo();
    public CJPayUnionPassParams pass_params = new CJPayUnionPassParams();
    public boolean goSetPwd = false;
    public boolean isNeedCardInfo = false;
    public String processInfo = "";
    public String busi_authorize_info_str = "";
    public CJPayBusiAuthorizeInfo busi_authorize_info = new CJPayBusiAuthorizeInfo();
    public boolean authorizeClicked = false;
    public String union_pay_sign_info = "";
    public ICJPayNormalBindCardService.SourceType sourceType = ICJPayNormalBindCardService.SourceType.Null;
    public boolean cardBinAutoFocus = false;
    public String end_page_url = "";

    /* loaded from: classes17.dex */
    public static class VerifyPwdTxtInfo implements CJPayObject, Serializable {
        public String title = "";
        public String sub_title = "";
        public String display_desc = "";

        static {
            Covode.recordClassIndex(7025);
        }
    }

    static {
        Covode.recordClassIndex(7024);
    }
}
