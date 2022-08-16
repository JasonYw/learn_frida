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
public class CJPayBalance implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long balance_amount;
    public long freezed_amount;
    public String balance_quota = "";
    public String mark = "";
    public String msg = "";
    public String status = "";
    public String icon_url = "";
    public String title = "";
    public String need_pwd = "";
    public String mobile_mask = "";
    public String tt_mark = "";
    public String tt_title = "";
    public String tt_sub_title = "";
    public String tt_icon_url = "";

    static {
        Covode.recordClassIndex(8323);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("balance_amount", this.balance_amount);
            jSONObject.put("balance_quota", this.balance_quota);
            jSONObject.put("freezed_amount", this.freezed_amount);
            jSONObject.put("mark", this.mark);
            jSONObject.put("msg", this.msg);
            jSONObject.put("status", this.status);
            jSONObject.put("icon_url", this.icon_url);
            jSONObject.put("title", this.title);
            jSONObject.put("need_pwd", this.need_pwd);
            jSONObject.put("mobile_mask", this.mobile_mask);
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
}
