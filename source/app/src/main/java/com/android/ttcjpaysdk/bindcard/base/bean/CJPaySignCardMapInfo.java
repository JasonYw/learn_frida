package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPaySignCardMapInfo implements CJPayObject, Serializable {
    public String allow_trans_card_type = "";
    public String id_name_mask = "";
    public String is_authed = "";
    public String is_set_pwd = "";
    public String mobile_mask = "";
    public String smch_id = "";
    public String uid_mobile_mask = "";
    public String member_biz_order_no = "";
    public String skip_pwd = "";
    public String id_type = "";
    public String protocol_description = "";
    public String button_description = "";
    public String jump_one_key_sign = "";
    public CJPayBankInfoBean one_key_bank_info = new CJPayBankInfoBean();

    static {
        Covode.recordClassIndex(7033);
    }
}
