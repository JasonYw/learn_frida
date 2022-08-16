package com.android.ttcjpaysdk.base.utils;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPaySettingService;
import com.android.ttcjpaysdk.base.service.bean.ReuseHostDomain;
import com.android.ttcjpaysdk.base.service.bean.WebViewCommonConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.umeng.message.common.C34000b;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C136458cRR;
import p003X.C137038can;
import p003X.C64859BiX;

/* loaded from: classes17.dex */
public final class CJPayParamsUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6722);
    }

    public static String LIZJ() {
        if (CJPayHostInfo.serverType == 2 && !CJPayHostInfo.isUsingTTNet) {
            return "http://cashier.ulpay.com.boe-gateway.byted.org";
        }
        return "https://cashier.ulpay.com";
    }

    public static String LJIIIZ() {
        if (CJPayHostInfo.serverType == 2 && !CJPayHostInfo.isUsingTTNet) {
            return "http://tp-pay.snssdk.com.boe-gateway.byted.org";
        }
        return "https://tp-pay.snssdk.com";
    }

    /* loaded from: classes17.dex */
    public enum HostAPI {
        INTEGRATED,
        BDPAY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HostAPI[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (HostAPI[]) proxy.result;
            }
            return (HostAPI[]) values().clone();
        }

        static {
            Covode.recordClassIndex(6723);
        }

        public static HostAPI valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (HostAPI) proxy.result;
            }
            return (HostAPI) Enum.valueOf(HostAPI.class, str);
        }
    }

    public static String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIIIIZZ()) {
            return CJPayHostInfo.integratedHostDomain;
        }
        return LJIIIZ();
    }

    public static String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIIIIZZ()) {
            new StringBuilder();
            return C0002O.m25086C(CJPayHostInfo.integratedHostDomain, "/gateway-u");
        } else if (CJPayHostInfo.serverType == 2 && !CJPayHostInfo.isUsingTTNet) {
            return "http://tp-pay.snssdk.com.boe-gateway.byted.org/gateway-u";
        } else {
            return "https://tp-pay.snssdk.com/gateway-u";
        }
    }

    public static String LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tppay", LIZ());
            jSONObject.put("ulpay", LIZJ());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(CJPayHostInfo.integratedHostDomain)) {
            return false;
        }
        return true;
    }

    public static String LIZLLL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (CJPayHostInfo.serverType == 2 && !CJPayHostInfo.isUsingTTNet) {
            str = "http://cashier.ulpay.com.boe-gateway.byted.org/gateway-bytepay";
        } else {
            str = "https://cashier.ulpay.com/gateway-bytepay";
        }
        HostAPI hostAPI = HostAPI.BDPAY;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{hostAPI, str}, null, LIZ, true, 14);
        if (proxy2.isSupported) {
            return (String) proxy2.result;
        }
        ICJPaySettingService iCJPaySettingService = (ICJPaySettingService) CJPayServiceManager.getInstance().getIService(ICJPaySettingService.class);
        if (iCJPaySettingService != null) {
            ReuseHostDomain hostDomain = iCJPaySettingService.getHostDomain("new_cjpay_host_domain");
            Uri parse = Uri.parse(str);
            if (hostAPI == HostAPI.BDPAY) {
                if (!TextUtils.isEmpty(hostDomain.bd_host_domain)) {
                    return str.replaceFirst(parse.getHost(), hostDomain.bd_host_domain);
                }
                return str;
            } else if (TextUtils.isEmpty(hostDomain.integrated_host_domain)) {
                return str;
            } else {
                return str.replaceFirst(parse.getHost(), hostDomain.integrated_host_domain);
            }
        }
        return str;
    }

    /* renamed from: LJ */
    public static String m16062LJ() {
        Map<String, String> LIZ2;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = "";
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, CJPayHostInfo.changeQuickRedirect, true, 10);
        if (proxy2.isSupported) {
            LIZ2 = (Map) proxy2.result;
        } else {
            LIZ2 = C137038can.LIZ();
        }
        if (LIZ2 != null) {
            for (Map.Entry<String, String> entry : LIZ2.entrySet()) {
                i++;
                if (i == LIZ2.size()) {
                    new StringBuilder();
                    str = C0002O.m25084C(str, entry.getKey(), "=", entry.getValue());
                } else {
                    new StringBuilder();
                    str = C0002O.m25083C(str, entry.getKey(), "=", entry.getValue(), ";");
                }
            }
        }
        return str;
    }

    public static String LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", CJPayBasicUtils.getRealVersion());
            jSONObject.put("features", new JSONObject().put("login_sdk", "1"));
            try {
                return URLEncoder.encode(jSONObject.toString(), C34037f.f43302f);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "";
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String LJFF() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", "android");
            jSONObject.put("is_h5", false);
            jSONObject.put("cj_sdk_version", CJPayBasicUtils.getRealVersion());
            jSONObject.put(C64859BiX.LIZIZ, CJPayHostInfo.aid);
            jSONObject.put("ua", CJPayBasicUtils.getUA(CJPayHostInfo.applicationContext));
            if (AdvanceSetting.CLEAR_NOTIFICATION.equals(CJPayHostInfo.languageTypeStr)) {
                str = "zh-Hans";
            } else {
                str = "en";
            }
            jSONObject.put("lang", str);
            jSONObject.put("device_id", CJPayHostInfo.did);
            if (CJPayBasicUtils.isSupportFingerPrint(CJPayHostInfo.applicationContext)) {
                jSONObject.put("bio_type", 1);
            }
            jSONObject.put("os_version", Build.VERSION.SDK_INT);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("net_type", CJPayBasicUtils.getNetworkState(CJPayHostInfo.applicationContext));
            jSONObject.put("app_version", CJPayBasicUtils.getAppVersionCode(CJPayHostInfo.applicationContext));
            jSONObject.put("app_name", CJPayBasicUtils.getAppName(CJPayHostInfo.applicationContext));
            jSONObject.put("app_update_version", CJPayHostInfo.appUpdateVersion);
            try {
                return URLEncoder.encode(jSONObject.toString(), C34037f.f43302f);
            } catch (Throwable unused) {
                return "";
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            if (LJIIIIZZ() && !TextUtils.isEmpty(str)) {
                if (str.startsWith("https://tp-pay.snssdk.com")) {
                    if (!LIZIZ(str)) {
                        return str.replaceFirst("https://tp-pay.snssdk.com", LIZ());
                    }
                    return str;
                } else if (str.startsWith(CJPayHostInfo.integratedHostDomain) && LIZIZ(str)) {
                    return str.replaceFirst(CJPayHostInfo.integratedHostDomain, LJIIIZ());
                } else {
                    return str;
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean LIZIZ(String str) {
        ICJPaySettingService iCJPaySettingService;
        WebViewCommonConfig webViewCommonConfig;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (iCJPaySettingService = (ICJPaySettingService) CJPayServiceManager.getInstance().getIService(ICJPaySettingService.class)) != null && (webViewCommonConfig = iCJPaySettingService.getWebViewCommonConfig()) != null) {
            Iterator<String> it = webViewCommonConfig.integrated_host_replace_block_list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String LIZIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            new StringBuilder();
            return C0002O.m25085C(str2, "/", str.replaceAll("\\.", "/"));
        }
        return str2;
    }

    public static String LIZ(String str, HostAPI hostAPI) {
        String LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, hostAPI}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (hostAPI == HostAPI.INTEGRATED) {
            LIZLLL = LIZIZ();
        } else {
            LIZLLL = LIZLLL();
        }
        return LIZIZ(str, LIZLLL);
    }

    public static JSONObject LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.APP_ID, str2);
            jSONObject.put("merchant_id", str);
            jSONObject.put(C64859BiX.LIZIZ, CJPayHostInfo.aid);
            jSONObject.put("os_name", C0002O.m25086C(C34000b.f43053g, Build.VERSION.RELEASE));
            jSONObject.put("app_platform", "native");
            jSONObject.put("params_for_special", "tppp");
            jSONObject.put("is_chaselight", 1);
            String LIZ2 = C136458cRR.LIZ();
            if (TextUtils.isEmpty(LIZ2)) {
                LIZ2 = "";
            }
            jSONObject.put("caijing_source", LIZ2);
            jSONObject.put("cjpay_sdk_version", CJPayBasicUtils.getRealVersion());
            jSONObject.put("cjpay_sdk_version_code", CJPayBasicUtils.getSDKVersionCode());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static Map<String, String> LIZ(String str, String str2, Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, map}, null, LIZ, true, 11);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("devinfo", LJFF());
        hashMap.put("Cookie", m16062LJ());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static Map<String, String> LIZ(String str, String str2, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("format", "JSON");
        hashMap.put("charset", "utf-8");
        hashMap.put("version", "1.0");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(Constants.APP_ID, str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("biz_content", str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("merchant_id", str4);
        }
        return hashMap;
    }
}
