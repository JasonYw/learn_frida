package com.android.ttcjpaysdk.bindcard.base.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C136992ca3;
import p003X.C64859BiX;

/* loaded from: classes17.dex */
public final class CJPayQuickBindCardUtils {
    public static ChangeQuickRedirect LIZ;
    public static String LIZJ = "";

    /* renamed from: LJ */
    public static String f25475LJ = "";
    public static JSONObject LIZLLL = new JSONObject();
    public static boolean LJFF = false;
    public static ArrayList<C2218a> LIZIZ = new ArrayList<>();

    /* renamed from: com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils$a */
    /* loaded from: classes17.dex */
    public static class C2218a {
        public String LIZ;
        public String LIZIZ;
        public String LIZJ;

        static {
            Covode.recordClassIndex(7155);
        }
    }

    public static JSONObject LIZIZ() {
        return LIZLLL;
    }

    public static String LIZJ() {
        return f25475LJ;
    }

    public static boolean LIZ() {
        return LJFF;
    }

    /* loaded from: classes17.dex */
    public enum AppParam {
        Toutiao("13", "toutiao"),
        Douyin("1128", "douyin"),
        Huoshan("1112", "huoshan"),
        Xigua("32", "xigua"),
        Ppxia("1319", "ppxia"),
        Lite("35", "lite"),
        Lark("1378", "lark"),
        Duoshan("1349", "duoshan"),
        Jumanji("6340", "douyin");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String aid;
        public String appParam;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AppParam[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (AppParam[]) proxy.result;
            }
            return (AppParam[]) values().clone();
        }

        static {
            Covode.recordClassIndex(7154);
        }

        public static AppParam valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (AppParam) proxy.result;
            }
            return (AppParam) Enum.valueOf(AppParam.class, str);
        }

        AppParam(String str, String str2) {
            this.aid = str;
            this.appParam = str2;
        }
    }

    static {
        Covode.recordClassIndex(7153);
        C2218a c2218a = new C2218a();
        c2218a.LIZ = "CMB";
        c2218a.LIZIZ = "cmbmobilebank://";
        c2218a.LIZJ = "cmbmobilebank://cmbls/functionjump?action=gofuncid&funcid=0026014&requesttype=post&cmb_app_trans_parms_start=here&epccGwMsg=";
        LIZIZ.add(c2218a);
    }

    public static void LIZ(String str) {
        f25475LJ = str;
    }

    public static void LIZ(boolean z) {
        LJFF = z;
    }

    public static void LIZIZ(String str) {
        LIZJ = str;
    }

    public static C2218a LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (C2218a) proxy.result;
        }
        for (int i = 0; i < LIZIZ.size(); i++) {
            if (LIZIZ.get(i).LIZ.equals(str)) {
                return LIZIZ.get(i);
            }
        }
        return null;
    }

    /* renamed from: LJ */
    public static boolean m16059LJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !"0".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && ("4".equalsIgnoreCase(str) || "5".equalsIgnoreCase(str))) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(String str) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String LJI = LJI(str);
        boolean isEmpty = TextUtils.isEmpty(LJI);
        Object obj = LJI;
        if (isEmpty) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 6);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                AppParam[] valuesCustom = AppParam.valuesCustom();
                while (true) {
                    if (i < valuesCustom.length) {
                        if (valuesCustom[i].aid.equals(str)) {
                            obj = valuesCustom[i].appParam;
                            break;
                        }
                        i++;
                    } else {
                        obj = "";
                        break;
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appParam", obj);
        } catch (JSONException unused) {
        }
        return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
    }

    public static String LJI(String str) {
        String str2 = "";
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            JSONArray jSONArray = new JSONArray(C136992ca3.LIZ().LIZ("cjpay_bank_appparam"));
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.equals(jSONArray.getJSONObject(i).optString(C64859BiX.LIZIZ))) {
                    str2 = jSONArray.getJSONObject(i).optString("appParam", str2);
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static boolean LIZ(Activity activity, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, str}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(activity.getPackageManager()) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LIZIZ(Activity activity, String str) {
        if (PatchProxy.proxy(new Object[]{activity, str}, null, LIZ, true, 2).isSupported) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setAction("android.intent.action.VIEW");
            C116971W2r.LIZIZ(activity, intent);
        } catch (Exception unused) {
        }
    }
}
