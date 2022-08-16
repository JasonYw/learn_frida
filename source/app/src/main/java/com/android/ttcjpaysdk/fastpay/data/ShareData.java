package com.android.ttcjpaysdk.fastpay.data;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.IFastPayFailureCallback;
import com.android.ttcjpaysdk.fastpay.data.p151a.C2262e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import p003X.C136991ca2;

/* loaded from: classes17.dex */
public final class ShareData {
    public static ChangeQuickRedirect LIZ;
    public static IFastPayFailureCallback LIZIZ;
    public static ISuperPayCallBack LIZJ;
    public static C2262e LIZLLL;

    /* renamed from: LJ */
    public static JSONObject f25495LJ;
    public static final ShareData LJFF = new ShareData();
    public static CJPayHostInfo LJI;
    public static Map<String, String> LJII;

    /* loaded from: classes17.dex */
    public interface ISuperPayCallBack extends Serializable {
        static {
            Covode.recordClassIndex(7465);
        }

        void LIZ();

        void LIZIZ();

        void LIZJ();

        void LIZLLL();
    }

    public static CJPayHostInfo LIZ() {
        return LJI;
    }

    public static Map<String, String> LIZIZ() {
        return LJII;
    }

    public static ISuperPayCallBack LIZJ() {
        return LIZJ;
    }

    public static C2262e LIZLLL() {
        return LIZLLL;
    }

    static {
        Covode.recordClassIndex(7464);
    }

    public static void LJFF() {
        LJI = null;
        LJII = null;
        LIZIZ = null;
        LIZLLL = null;
        f25495LJ = null;
    }

    /* renamed from: LJ */
    public final JSONObject m16053LJ() {
        C136991ca2 c136991ca2;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = f25495LJ;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            C2262e c2262e = LIZLLL;
            if (c2262e != null && (c136991ca2 = c2262e.error) != null && (str = c136991ca2.data) != null) {
                JSONObject jSONObject2 = new JSONObject(str);
                f25495LJ = jSONObject2;
                return jSONObject2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void LIZ(CJPayHostInfo cJPayHostInfo) {
        LJI = cJPayHostInfo;
    }

    public static void LIZ(IFastPayFailureCallback iFastPayFailureCallback) {
        LIZIZ = iFastPayFailureCallback;
    }

    public static void LIZ(Map<String, String> map) {
        LJII = map;
    }
}
