package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayCardItem implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bank_card_id = "";
    public String true_name = "";
    public String certificate_num = "";
    public String certificate_type = "";

    static {
        Covode.recordClassIndex(8325);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bank_card_id", this.bank_card_id);
            jSONObject.put("true_name", this.true_name);
            jSONObject.put("certificate_num", this.certificate_num);
            jSONObject.put("certificate_type", this.certificate_type);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
