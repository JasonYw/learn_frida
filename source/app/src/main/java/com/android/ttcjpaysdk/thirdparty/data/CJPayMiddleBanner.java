package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes25.dex */
public class CJPayMiddleBanner implements CJPayObject, Serializable {
    public String banner_type = "";
    public ArrayList<Object> discount_banner = new ArrayList<>();
    public ArrayList<Object> discount_users = new ArrayList<>();

    static {
        Covode.recordClassIndex(8338);
    }
}
