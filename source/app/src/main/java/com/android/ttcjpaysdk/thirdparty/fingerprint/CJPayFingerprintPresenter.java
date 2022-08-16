package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C64859BiX;

/* loaded from: classes17.dex */
public final class CJPayFingerprintPresenter {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(8416);
    }

    public static String LIZIZ(String str) {
        return str;
    }

    public static void LIZ(String str, String str2, String str3, ICJPayCallback iCJPayCallback) {
        HashMap<String, String> hashMap = null;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, iCJPayCallback}, null, LIZ, true, 6).isSupported) {
            return;
        }
        String LIZ2 = CJPayParamsUtils.LIZ("bytepay.member_product.verify_password", CJPayParamsUtils.HostAPI.BDPAY);
        if (CJPayFingerprintService.LIZIZ != null) {
            hashMap = CJPayFingerprintService.LIZIZ.extraHeaderMap;
        }
        String str4 = "";
        String str5 = CJPayFingerprintService.LIZIZ != null ? CJPayFingerprintService.LIZIZ.appId : str4;
        if (CJPayFingerprintService.LIZIZ != null) {
            str4 = CJPayFingerprintService.LIZIZ.merchantId;
        }
        CJPayNetworkManager.postForm(LIZ2, CJPayParamsUtils.LIZ("bytepay.member_product.verify_password", LIZ(str, str2, str3), str5, str4), CJPayParamsUtils.LIZ(LIZ2, "bytepay.member_product.verify_password", hashMap), iCJPayCallback);
    }

    public static void LIZ(JSONObject jSONObject, List<String> list) {
        if (PatchProxy.proxy(new Object[]{jSONObject, list}, null, LIZ, true, 8).isSupported) {
            return;
        }
        try {
            CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
            cJPaySecureRequestParams.type1 = 2;
            cJPaySecureRequestParams.type2 = 1;
            cJPaySecureRequestParams.version = 3;
            if (list.size() > 0) {
                cJPaySecureRequestParams.fields.addAll(list);
            }
            jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
        } catch (JSONException unused) {
        }
    }

    /* loaded from: classes2.dex */
    public enum PwdType {
        FINGERPRINT("1"),
        FACE("2");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String type;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PwdType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PwdType[]) proxy.result;
            }
            return (PwdType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(8417);
        }

        public static PwdType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PwdType) proxy.result;
            }
            return (PwdType) Enum.valueOf(PwdType.class, str);
        }

        PwdType(String str) {
            this.type = str;
        }
    }

    public static JSONObject LIZ(String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            String str3 = "";
            if (CJPayFingerprintService.LIZIZ == null) {
                str2 = str3;
            } else {
                str2 = CJPayFingerprintService.LIZIZ.merchantId;
            }
            jSONObject.put("merchant_id", str2);
            if (CJPayFingerprintService.LIZIZ != null) {
                str3 = CJPayFingerprintService.LIZIZ.appId;
            }
            jSONObject.put(Constants.APP_ID, str3);
            jSONObject.put("did", CJPayHostInfo.did);
            jSONObject.put("pwd_type", PwdType.FINGERPRINT.type);
            jSONObject.put(C64859BiX.LIZIZ, CJPayHostInfo.aid);
            JSONObject jSONObject2 = new JSONObject();
            if (CJPayFingerprintService.LIZIZ != null && CJPayFingerprintService.LIZIZ.LIZIZ() != null) {
                jSONObject2.put("risk_str", new JSONObject(CJPayFingerprintService.LIZIZ.LIZIZ()));
            }
            jSONObject.put("risk_info", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject LIZ(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, null, LIZ, true, 15);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject LIZ2 = LIZ(str2);
        try {
            LIZ2.put("serial_num", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add("serial_num");
            LIZ(LIZ2, arrayList);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject = LIZ2.toString();
        LIZIZ(jSONObject);
        return jSONObject;
    }

    public static String LIZ(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, LIZ, true, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject LIZ2 = LIZ(str2);
        try {
            LIZ2.put("member_biz_order_no", str3);
            LIZ2.put("password", str);
            CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
            cJPaySecureRequestParams.version = 3;
            cJPaySecureRequestParams.type1 = 2;
            cJPaySecureRequestParams.type2 = 1;
            cJPaySecureRequestParams.check = 0;
            cJPaySecureRequestParams.fields.add("password");
            LIZ2.put("secure_request_params", cJPaySecureRequestParams.toJson());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject = LIZ2.toString();
        LIZIZ(jSONObject);
        return jSONObject;
    }

    public static String LIZ(JSONObject jSONObject, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, str, str2}, null, LIZ, true, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject LIZ2 = LIZ(str);
        try {
            LIZ2.put("process_info", jSONObject);
            LIZ2.put("is_jail_broken", CJPayBasicUtils.isJailBroken());
            LIZ2.put("trade_no", str2);
            if (!TextUtils.isEmpty(str2)) {
                LIZ2.put("exts", LIZ(new HashMap()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("trade_no");
            if (!PatchProxy.proxy(new Object[]{LIZ2, arrayList}, null, LIZ, true, 9).isSupported) {
                try {
                    CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
                    cJPaySecureRequestParams.type1 = 2;
                    cJPaySecureRequestParams.type2 = 1;
                    cJPaySecureRequestParams.version = 3;
                    cJPaySecureRequestParams.check = 1;
                    if (arrayList.size() > 0) {
                        cJPaySecureRequestParams.fields.addAll(arrayList);
                    }
                    LIZ2.put("secure_request_params", cJPaySecureRequestParams.toJson());
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject2 = LIZ2.toString();
        LIZIZ(jSONObject2);
        return jSONObject2;
    }

    public static String LIZ(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject LIZ2 = LIZ(str3);
        try {
            LIZ2.put("mobile_pwd", str);
            LIZ2.put("key", str2);
            LIZ2.put("member_biz_order_no", str5);
            LIZ2.put("is_jail_broken", CJPayBasicUtils.isJailBroken());
            if (!TextUtils.isEmpty(str4)) {
                HashMap hashMap = new HashMap();
                hashMap.put("trade_no", str4);
                LIZ2.put("exts", LIZ(hashMap));
            }
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str5)) {
                arrayList.add("mobile_pwd");
            } else {
                arrayList.add("key");
            }
            LIZ(LIZ2, arrayList);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject = LIZ2.toString();
        LIZIZ(jSONObject);
        return jSONObject;
    }
}
