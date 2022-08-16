package com.android.ttcjpaysdk.thirdparty.balance.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class CJPayBalanceUrlResourceInfo implements CJPayObject, Serializable {
    public int show_time;
    public String resource_no = "";
    public String pic_url = "";
    public String jump_url = "";
    public String goto_type = "";

    static {
        Covode.recordClassIndex(7982);
    }
}
