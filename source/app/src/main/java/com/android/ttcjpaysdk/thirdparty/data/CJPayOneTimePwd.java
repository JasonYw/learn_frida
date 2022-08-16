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
public class CJPayOneTimePwd implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String key;
    public String pwd_type;
    public String serial_num;
    public String token_code;

    static {
        Covode.recordClassIndex(8339);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pwd_type", this.pwd_type);
            jSONObject.put("token_code", this.token_code);
            jSONObject.put("serial_num", this.serial_num);
            jSONObject.put("key", this.key);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
