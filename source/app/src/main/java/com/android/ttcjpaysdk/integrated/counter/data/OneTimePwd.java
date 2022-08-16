package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class OneTimePwd implements CJPayObject, Serializable {
    public String key;
    public String pwd_type;
    public String serial_num;
    public String token_code;

    static {
        Covode.recordClassIndex(7562);
    }
}
