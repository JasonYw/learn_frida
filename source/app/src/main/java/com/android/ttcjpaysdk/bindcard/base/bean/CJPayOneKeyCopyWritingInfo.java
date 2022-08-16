package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayOneKeyCopyWritingInfo implements CJPayObject, Serializable {
    public String sub_title = "";
    public String title = "";
    public String display_desc = "";
    public String display_icon = "";
    public String order_display_desc = "";
    public String order_display_icon = "";

    static {
        Covode.recordClassIndex(7031);
    }
}
