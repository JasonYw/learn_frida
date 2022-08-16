package com.android.ttcjpaysdk.thirdparty.balance.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class CJPayBalanceTradeInfo implements CJPayObject, Serializable {
    public long create_time;
    public long finish_time;
    public long trade_amount;
    public long trade_time;
    public String trade_no = "";
    public String trade_status = "";
    public String bank_code_mask = "";
    public String bank_name = "";
    public String icon_url = "";
    public String remark = "";
    public String trade_status_desc_msg = "";
    public String fail_msg = "";

    static {
        Covode.recordClassIndex(7980);
    }
}
