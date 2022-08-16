package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayAuthInfo implements CJPayObject, Serializable {
    public String id_type = "";
    public String id_code_mask = "";
    public String id_name_mask = "";

    static {
        Covode.recordClassIndex(7015);
    }
}
