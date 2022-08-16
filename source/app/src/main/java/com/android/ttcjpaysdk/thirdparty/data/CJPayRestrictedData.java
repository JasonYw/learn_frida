package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC103994QxI;

/* loaded from: classes17.dex */
public class CJPayRestrictedData implements CJPayObject {
    @AbstractC103994QxI
    public static final int FROM_COUNTER = 1000;
    @AbstractC103994QxI
    public static final int FROM_RECHARGE = 1001;
    @AbstractC103994QxI
    public static final int FROM_WITHDRAW = 1002;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public String bankCardId;
    public String certificateType;
    public String errorTipsColor;
    public int from;
    public String merchantId;
    public String mobile;
    public String payType;
    public String paymentMethod;
    public String pwd;
    public String realName;
    public long rechargeAmount;
    public String showStyle;
    public CJPayProcessInfo processInfo = new CJPayProcessInfo();
    public CJPayTradeInfo tradeInfo = new CJPayTradeInfo();
    public ArrayList<CJPayDiscount> discounts = new ArrayList<>();

    static {
        Covode.recordClassIndex(8343);
    }

    public boolean isMainlandId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return CJPayIdType.MAINLAND.equals(CJPayIdType.getTypeFromIdCode(this.certificateType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CJPayRestrictedData parseJson(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CJPayRestrictedData) proxy.result;
        }
        CJPayRestrictedData cJPayRestrictedData = new CJPayRestrictedData();
        cJPayRestrictedData.errorTipsColor = jSONObject.optString("errorTipsColor");
        cJPayRestrictedData.realName = jSONObject.optString("realName");
        cJPayRestrictedData.mobile = jSONObject.optString("mobile");
        cJPayRestrictedData.pwd = jSONObject.optString("pwd");
        cJPayRestrictedData.payType = jSONObject.optString("payType");
        cJPayRestrictedData.paymentMethod = jSONObject.optString("paymentMethod");
        cJPayRestrictedData.bankCardId = jSONObject.optString("bankCardId");
        cJPayRestrictedData.certificateType = jSONObject.optString("certificateType");
        cJPayRestrictedData.appId = jSONObject.optString("appId");
        cJPayRestrictedData.merchantId = jSONObject.optString("merchantId");
        cJPayRestrictedData.showStyle = jSONObject.optString("showStyle");
        cJPayRestrictedData.rechargeAmount = jSONObject.optLong("rechargeAmount");
        cJPayRestrictedData.from = jSONObject.optInt("from");
        cJPayRestrictedData.processInfo.parseProcessInfo(jSONObject.optJSONObject("processInfo"));
        cJPayRestrictedData.tradeInfo.setDataForRestricted(jSONObject.optString("tradeInfo"));
        JSONArray optJSONArray = jSONObject.optJSONArray("discountInfo");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                cJPayRestrictedData.discounts.add(CJPayJsonParser.fromJson(optJSONArray.optJSONObject(i), CJPayDiscount.class));
            }
        }
        return cJPayRestrictedData;
    }
}
