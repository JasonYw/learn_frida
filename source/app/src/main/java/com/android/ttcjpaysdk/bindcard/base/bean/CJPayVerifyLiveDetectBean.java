package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayVerifyLiveDetectBean extends CJPayBindCardBaseBean implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String ret_status = "";
    public String face_content = "";
    public String face_recognition_type = "";
    public String name_mask = "";

    static {
        Covode.recordClassIndex(7039);
    }

    public boolean isNeedRetry() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "MP060005".equals(this.code);
    }

    public boolean isVerifySuccess() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "MP000000".equals(this.code);
    }

    public JSONObject toJSON() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("face_content", this.face_content);
            jSONObject.put("face_recognition_type", this.face_recognition_type);
            jSONObject.put("name_mask", this.name_mask);
            jSONObject.put("status", this.status);
            jSONObject.put(C2521l.LJIIJ, this.code);
            jSONObject.put("msg", this.msg);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
