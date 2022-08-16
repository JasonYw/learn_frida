package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class CJPaySingleBankActivityInfo implements CJPayObject, Serializable {
    public String activity_page_url;
    public String bank_card_name;
    public String bank_code;
    public String benefit_amount;
    public String benefit_desc;
    public String button_desc;
    public String icon_url;
    public boolean isTips;
    public String jump_url;

    static {
        Covode.recordClassIndex(8747);
    }

    public CJPaySingleBankActivityInfo() {
        this(false, 1, null);
    }

    public CJPaySingleBankActivityInfo(boolean z) {
        this.isTips = z;
        this.icon_url = "";
        this.bank_card_name = "";
        this.benefit_amount = "";
        this.benefit_desc = "";
        this.activity_page_url = "";
        this.button_desc = "";
        this.jump_url = "";
        this.bank_code = "";
    }

    public /* synthetic */ CJPaySingleBankActivityInfo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
