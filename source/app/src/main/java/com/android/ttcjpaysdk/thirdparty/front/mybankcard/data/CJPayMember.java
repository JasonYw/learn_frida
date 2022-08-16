package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayMember implements CJPayObject, Serializable {
    public ArrayList<CJPayCard> card_list = new ArrayList<>();
    public boolean is_authed = false;
    public boolean is_open_account = false;
    public boolean is_set_pwd = false;
    public int member_level = 0;
    public int member_type = 0;
    public String merchant_id = "";
    public String mobile_mask = "";
    public String pay_uid = "";
    public String smch_id = "";

    static {
        Covode.recordClassIndex(8744);
    }
}
