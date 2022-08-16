package com.android.ttcjpaysdk.bdpay.bindcard.normal.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayGetRealPhoneNumberResponseBean implements CJPayObject, Serializable {
    public String code = "";
    public String msg = "";
    public String mobile = "";

    static {
        Covode.recordClassIndex(6760);
    }
}
