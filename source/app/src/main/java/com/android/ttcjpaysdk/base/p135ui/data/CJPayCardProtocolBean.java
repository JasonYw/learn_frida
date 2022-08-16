package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayCardProtocolBean */
/* loaded from: classes17.dex */
public class CJPayCardProtocolBean implements CJPayObject, Serializable {
    public boolean default_choose;
    public String name = "";
    public String template_url = "";
    public String protocol_no = "";
    public String group = "";

    static {
        Covode.recordClassIndex(6637);
    }
}
