package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class FrontSubPayTypeSumInfo implements CJPayObject, Serializable {
    public int show_num;
    public ArrayList<String> voucher_msg_list = new ArrayList<>();
    public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();
    public ArrayList<FrontSubPayTypeInfo> sub_pay_type_info_list = new ArrayList<>();
    public String home_page_show_style = "";
    public String home_page_guide_text = "";
    public HomePageBanner home_page_banner = new HomePageBanner();

    /* loaded from: classes17.dex */
    public static class HomePageBanner implements CJPayObject, Serializable {
        public String banner_text = "";
        public String btn_text = "";
        public String btn_action = "";
        public String theme_color = "";

        static {
            Covode.recordClassIndex(8376);
        }
    }

    static {
        Covode.recordClassIndex(8375);
    }
}
