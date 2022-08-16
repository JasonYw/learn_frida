package com.android.ttcjpaysdk.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C137038can;

/* loaded from: classes17.dex */
public final class CJPayHostInfo implements Serializable {
    public static String aid;
    public static Map<String, Integer> animationResourceMap;
    public static Context applicationContext;
    public static String boeEnv;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String did;
    public static String inheritTheme;
    public static String integratedHostDomain;
    public static boolean isFollowSystemTheme;
    public static boolean isUsingGecko;
    public static Map<String, String> loginTokenMap;
    public static Bitmap titleBitmap;
    public static String uid;
    public transient WeakReference<Context> LIZ;
    public String appId;
    public HashMap<String, String> extraHeaderMap;
    public boolean isGameNewStyle;
    public boolean isTransCheckoutCounterActivityWhenLoading;
    public String merchantId;
    public Map<String, String> payRequestParams;
    public Map<String, String> riskInfoParams;
    public String titleStr;
    public static final C137038can Companion = new C137038can((byte) 0);
    public static int serverType = 1;
    public static boolean isUsingTTNet = true;
    public static String languageTypeStr = AdvanceSetting.CLEAR_NOTIFICATION;
    public static Integer screenOrientationType = 3;
    public static float fontScale = 1.0f;
    public static String appUpdateVersion = "";
    public static String channel = "";
    public String customUa = "";
    public boolean needLoading = true;
    public Integer mScreenOrientationType = 3;
    public Integer fromFastPayType = 0;
    public int isUnionPayBindEnable = 1;

    @JvmStatic
    public static final CJPayHostInfo LIZ(CJPayHostInfo cJPayHostInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayHostInfo}, null, changeQuickRedirect, true, 6);
        return proxy.isSupported ? (CJPayHostInfo) proxy.result : Companion.LIZ(cJPayHostInfo);
    }

    @JvmStatic
    public static final CJPayHostInfo LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, changeQuickRedirect, true, 7);
        return proxy.isSupported ? (CJPayHostInfo) proxy.result : Companion.LIZ(jSONObject);
    }

    @JvmStatic
    public static final JSONObject LIZIZ(CJPayHostInfo cJPayHostInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayHostInfo}, null, changeQuickRedirect, true, 8);
        return proxy.isSupported ? (JSONObject) proxy.result : Companion.LIZIZ(cJPayHostInfo);
    }

    static {
        Covode.recordClassIndex(5894);
    }

    public final Context LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<Context> weakReference2 = this.LIZ;
            if (weakReference2 == null) {
                return null;
            }
            return weakReference2.get();
        }
        return applicationContext;
    }

    public final Map<String, String> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        Map<String, String> basicRiskInfo = CJPayBasicUtils.getBasicRiskInfo(this.merchantId);
        Map<String, String> map = this.riskInfoParams;
        if (map != null) {
            Intrinsics.checkNotNullExpressionValue(basicRiskInfo, "");
            for (Map.Entry<String, String> entry : basicRiskInfo.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!map.containsKey(key)) {
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    map.put(key, value);
                } else if (map.containsKey(key) && TextUtils.isEmpty(map.get(key))) {
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    map.put(key, value);
                }
            }
        }
        if (this.riskInfoParams == null) {
            this.riskInfoParams = basicRiskInfo;
        }
        return this.riskInfoParams;
    }

    public final void LIZIZ(Map<String, String> map) {
        String str;
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.riskInfoParams = map;
        if (map != null && (str = map.get("channel")) != null && str.length() > 0) {
            channel = str;
        }
    }

    public final void LIZ(Context context) {
        Context context2;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.LIZ = new WeakReference<>(context);
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        applicationContext = context2;
    }

    public final void LIZ(Map<String, String> map) {
        if (!PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 3).isSupported && map != null) {
            this.payRequestParams = map;
            Map<String, String> map2 = this.payRequestParams;
            if (map2 != null) {
                if (TextUtils.isEmpty(this.merchantId) && !TextUtils.isEmpty(map2.get("merchant_id"))) {
                    this.merchantId = map2.get("merchant_id");
                }
                if (TextUtils.isEmpty(this.appId) && !TextUtils.isEmpty(map2.get(Constants.APP_ID))) {
                    this.appId = map2.get(Constants.APP_ID);
                }
            }
        }
    }
}
