package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayQuickPay implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<CJPayCard> cards = new ArrayList<>();
    public ArrayList<CJPayCard> discount_banks = new ArrayList<>();
    public String msg = "";
    public String status = "";
    public String mark = "";
    public String enable_bind_card = "";
    public String enable_bind_card_msg = "";
    public String discount_bind_card_msg = "";
    public String tt_mark = "";
    public String tt_title = "";
    public String tt_sub_title = "";
    public String tt_icon_url = "";

    static {
        Covode.recordClassIndex(8342);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cards", toJsonArray(this.cards));
            jSONObject.put("discount_banks", toJsonArray(this.discount_banks));
            jSONObject.put("msg", this.msg);
            jSONObject.put("status", this.status);
            jSONObject.put("mark", this.mark);
            jSONObject.put("enable_bind_card", this.enable_bind_card);
            jSONObject.put("enable_bind_card_msg", this.enable_bind_card_msg);
            jSONObject.put("discount_bind_card_msg", this.discount_bind_card_msg);
            jSONObject.put("tt_mark", this.tt_mark);
            jSONObject.put("tt_title", this.tt_title);
            jSONObject.put("tt_sub_title", this.tt_sub_title);
            jSONObject.put("tt_icon_url", this.tt_icon_url);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private JSONArray toJsonArray(ArrayList<CJPayCard> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i).toJson());
        }
        return jSONArray;
    }

    public String getDiscountBankInfo(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Iterator<CJPayCard> it = this.discount_banks.iterator();
        while (it.hasNext()) {
            CJPayCard next = it.next();
            if (TextUtils.equals(str, next.bank_code)) {
                return next.bank_name.concat(next.card_type_name);
            }
        }
        return "";
    }
}
