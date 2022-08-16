package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayResultGuideInfo */
/* loaded from: classes17.dex */
public class CJPayResultGuideInfo implements CJPayObject, Serializable {
    public transient JSONObject protocol_group_names;
    public int quota;
    public String guide_type = "";
    public String header_desc = "";
    public String title = "";
    public String sub_title = "";
    public String confirm_btn_desc = "";
    public String cancel_btn_desc = "";
    public String cancel_btn_location = "";
    public ArrayList<CJPayCardProtocolBean> protocol_list = new ArrayList<>();
    public String guide_message = "";
    public String pic_url = "";
    public String bio_type = "";
    public String after_open_desc = "";

    static {
        Covode.recordClassIndex(6643);
    }

    public int getPswdQuota() {
        int i = this.quota;
        if (i > 0) {
            return i / 100;
        }
        return 0;
    }
}
