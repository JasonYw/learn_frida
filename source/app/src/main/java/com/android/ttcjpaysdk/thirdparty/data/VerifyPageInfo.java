package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p003X.C136328cPL;
import p003X.C136425cQu;
import p003X.C136646cUT;

/* loaded from: classes17.dex */
public final class VerifyPageInfo implements CJPayObject, Serializable {
    public boolean need_resign_card;
    public boolean skip_no_pwd_confirm;
    public C136425cQu used_paytype_info;
    public CJPayMerchantInfo merchant_info = new CJPayMerchantInfo();
    public CJPayTradeInfo trade_info = new CJPayTradeInfo();
    public CJPayUserInfo user_info = new CJPayUserInfo();
    public C136328cPL cashdesk_show_conf = new C136328cPL();
    public CJPayResultPageShowConf result_page_show_conf = new CJPayResultPageShowConf();
    public CJPayProcessInfo process_info = new CJPayProcessInfo();
    public CJPayProtocolGroupContentsBean nopwd_guide_info = new CJPayProtocolGroupContentsBean();
    public CJPayPayInfo pay_info = new CJPayPayInfo();
    public C136646cUT pre_bio_guide = new C136646cUT();

    static {
        Covode.recordClassIndex(8380);
    }
}
