package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayResultPageShowConf implements CJPayObject, Serializable {
    public int remain_time;
    public int third_remain_time;
    public String success_desc = "";
    public String success_url = "";
    public String success_btn_desc = "";
    public ArrayList<DiscountBanner> discount_banner = new ArrayList<>();
    public int query_result_times = 0;
    public int show_style = 0;
    public CJPayMiddleBanner middle_banner = new CJPayMiddleBanner();
    public String withdraw_result_page_desc = "";
    public String result_desc = "";

    /* loaded from: classes17.dex */
    public static class DiscountBanner implements CJPayObject, Serializable {
        public int stay_time;
        public String name = "";
        public String banner = "";
        public String url = "";
        public String goto_type = "";

        static {
            Covode.recordClassIndex(8345);
        }
    }

    static {
        Covode.recordClassIndex(8344);
    }
}
