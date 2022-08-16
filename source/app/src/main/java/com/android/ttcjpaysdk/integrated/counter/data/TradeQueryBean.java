package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import p003X.C137130ccI;
import p003X.C137391cgV;

/* loaded from: classes17.dex */
public final class TradeQueryBean implements CJPayObject {
    public String code = "";
    public String err_type = "";
    public String err_msg = "";
    public String err_type_cnt = "";
    public String process = "";
    public CJPayTradeQueryData data = new CJPayTradeQueryData();

    /* loaded from: classes17.dex */
    public static class BytePayResultInfo implements CJPayObject, Serializable {
        public C137391cgV bio_open_guide = new C137391cgV();

        static {
            Covode.recordClassIndex(7569);
        }
    }

    /* loaded from: classes17.dex */
    public static class CJPayTradeQueryData implements CJPayObject, Serializable {
        public C137130ccI trade_info = new C137130ccI();
        public ArrayList<PayInfo> payment_desc_infos = new ArrayList<>();
        public BytePayResultInfo byte_pay_result_info = new BytePayResultInfo();

        static {
            Covode.recordClassIndex(7570);
        }
    }

    /* loaded from: classes17.dex */
    public static class PayInfo implements CJPayObject, Serializable {
        public String color_type;
        public String desc;
        public String name;
        public String type_mark;

        static {
            Covode.recordClassIndex(7571);
        }
    }

    static {
        Covode.recordClassIndex(7568);
    }
}
