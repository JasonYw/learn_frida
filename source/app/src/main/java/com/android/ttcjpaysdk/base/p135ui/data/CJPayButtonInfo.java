package com.android.ttcjpaysdk.base.p135ui.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayButtonInfo */
/* loaded from: classes17.dex */
public class CJPayButtonInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public int left_button_action;
    public int right_button_action;
    public String page_desc = "";
    public String button_desc = "";
    public String button_type = "";
    public String left_button_desc = "";
    public String right_button_desc = "";
    public String button_status = "";
    public String find_pwd_url = "";
    public String error_code = "";
    public String jump_url = "";
    public String main_title = "";

    static {
        Covode.recordClassIndex(6636);
    }

    public boolean isGoCustomerServiceDialog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return hasAction(13);
    }

    public boolean isShow() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.button_status);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_desc", this.page_desc);
            jSONObject.put("button_desc", this.button_desc);
            jSONObject.put("button_type", this.button_type);
            jSONObject.put("action", this.action);
            jSONObject.put("left_button_desc", this.left_button_desc);
            jSONObject.put("left_button_action", this.left_button_action);
            jSONObject.put("right_button_desc", this.right_button_desc);
            jSONObject.put("right_button_action", this.right_button_action);
            jSONObject.put("button_status", this.button_status);
            jSONObject.put("find_pwd_url", this.find_pwd_url);
            jSONObject.put("error_code", this.error_code);
            jSONObject.put("jump_url", this.jump_url);
            jSONObject.put("main_title", this.main_title);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean hasAction(int i) {
        if (this.action != i && this.left_button_action != i && this.right_button_action != i) {
            return false;
        }
        return true;
    }
}
