package com.android.ttcjpaysdk.thirdparty.fingerprint;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayFingerprintEnableBean implements CJPayObject, Serializable {
    public String code = "";
    public String msg = "";
    public String token_file_str = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();

    static {
        Covode.recordClassIndex(8404);
    }
}
