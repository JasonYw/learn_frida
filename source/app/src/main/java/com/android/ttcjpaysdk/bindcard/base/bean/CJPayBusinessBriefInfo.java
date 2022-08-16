package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayBusinessBriefInfo implements CJPayObject, Serializable {
    public String display_desc = "";
    public String display_url = "";
    public String brief_title = "";
    public String input_display_desc = "";
    public String input_display_icon = "";

    static {
        Covode.recordClassIndex(7022);
    }
}
