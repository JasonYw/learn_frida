package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class RecommendVerifyInfo implements CJPayObject, Serializable {
    public String verify_type = "";
    public String icon_url = "";
    public String recommend_desc = "";
    public String button_desc = "";
    public String cancel_desc = "";

    static {
        Covode.recordClassIndex(8379);
    }
}
