package com.android.ttcjpaysdk.thirdparty.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayResultGuideInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p003X.C136818cXF;
import p003X.C136878cYD;
import p003X.C136941cZE;

/* loaded from: classes17.dex */
public class CJPayCounterTradeQueryResponseBean extends CJPayTradeQueryResponseBean implements CJPayObject, Serializable {
    public CJPayTradeInfo trade_info = new CJPayTradeInfo();
    public C136818cXF bio_open_guide = new C136818cXF();
    public CJPayProtocolGroupContentsBean nopwd_guide_info = new CJPayProtocolGroupContentsBean();
    public CJPayResultGuideInfo result_guide_info = new CJPayResultGuideInfo();
    public boolean nopwd_open_status = false;
    public String nopwd_open_msg = "";
    public FastPayGuideInfo onekeypay_guide_info = new FastPayGuideInfo();
    public C136878cYD processing_guide_popup = new C136878cYD();
    public C136941cZE fe_guide_info = new C136941cZE();
    public String user_check_way = "";

    static {
        Covode.recordClassIndex(8221);
    }
}
