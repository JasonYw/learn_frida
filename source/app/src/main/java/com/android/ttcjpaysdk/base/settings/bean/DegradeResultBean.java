package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class DegradeResultBean implements CJPayObject, Serializable {
    public String appId;
    public boolean isNeedDegrade;
    public String merchantId;

    static {
        Covode.recordClassIndex(6570);
    }
}
