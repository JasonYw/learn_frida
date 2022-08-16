package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayPayTypeInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CJPayBalance balance = new CJPayBalance();
    public CJPayQuickPay quick_pay = new CJPayQuickPay();
    public CJPayCreditPay credit_pay = new CJPayCreditPay();
    public String default_pay_channel = "";
    public ArrayList<String> pay_channels = new ArrayList<>();
    public int show_channel_num = 0;
    public FrontSubPayTypeSumInfo sub_pay_type_sum_info = new FrontSubPayTypeSumInfo();
    public String pay_brand = "";
    public String home_page_picture_url = "";

    static {
        Covode.recordClassIndex(8340);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        return CJPayJsonParser.toJsonObject(this);
    }

    private JSONArray toJsonArray(ArrayList<String> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i));
        }
        return jSONArray;
    }
}
