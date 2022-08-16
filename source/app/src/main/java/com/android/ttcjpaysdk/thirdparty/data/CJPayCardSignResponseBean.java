package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayCardSignResponseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public String msg = "";
    public CJPayUserInfo user_info = new CJPayUserInfo();
    public ArrayList<CJPayUserAgreement> agreement = new ArrayList<>();
    public CJPayCard card = new CJPayCard();
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public CJPaySignInfo sign_info = new CJPaySignInfo();
    public CJPayProcessInfo process_info = new CJPayProcessInfo();

    static {
        Covode.recordClassIndex(8326);
    }

    /* loaded from: classes17.dex */
    public static class CJPaySignInfo implements CJPayObject, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sign = "";
        public String sign_order_no = "";
        public String smch_id = "";

        static {
            Covode.recordClassIndex(8327);
        }

        public JSONObject toJson() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sign", this.sign);
                jSONObject.put("sign_order_no", this.sign_order_no);
                jSONObject.put("smch_id", this.smch_id);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2521l.LJIIJ, this.code);
            jSONObject.put("msg", this.msg);
            jSONObject.put("user_info", this.user_info.toJson());
            jSONObject.put("agreement", toJsonArray(this.agreement));
            jSONObject.put("card", this.card.toJson());
            jSONObject.put("button_info", this.button_info.toJson());
            jSONObject.put("sign_info", this.sign_info.toJson());
            jSONObject.put("process_info", this.process_info.toJson());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private JSONArray toJsonArray(ArrayList<CJPayUserAgreement> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i).toJson());
        }
        return jSONArray;
    }
}
