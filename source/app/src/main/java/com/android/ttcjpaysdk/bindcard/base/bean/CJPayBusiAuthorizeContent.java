package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayBusiAuthorizeContent implements CJPayObject, Serializable {
    public String propose_desc = "";
    public String not_agreement_url = "";
    public String not_agreement_content = "";
    public String tips_content = "";
    public ArrayList<String> propose_contents = new ArrayList<>();
    public CJPayBusinessBriefInfo business_brief_info = new CJPayBusinessBriefInfo();

    static {
        Covode.recordClassIndex(7020);
    }
}
