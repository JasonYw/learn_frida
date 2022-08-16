package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class FrontVerifyPageInfo implements CJPayObject, Serializable {
    public String code = "";
    public String msg = "";
    public VerifyPageInfo verify_page_info = new VerifyPageInfo();

    static {
        Covode.recordClassIndex(8377);
    }
}
