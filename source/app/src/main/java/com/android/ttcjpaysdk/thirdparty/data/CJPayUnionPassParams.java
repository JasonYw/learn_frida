package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayUnionPassParams implements CJPayObject, Serializable {
    public boolean is_need_union_pass;
    public String url = "";
    public CJPayPassParamsExt ext = new CJPayPassParamsExt();

    /* loaded from: classes17.dex */
    public static class CJPayPassParamsExt implements CJPayObject, Serializable {
        public String redirectUrl = "";

        static {
            Covode.recordClassIndex(8363);
        }
    }

    static {
        Covode.recordClassIndex(8362);
    }
}
