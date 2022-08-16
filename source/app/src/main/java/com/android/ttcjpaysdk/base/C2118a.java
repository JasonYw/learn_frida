package com.android.ttcjpaysdk.base;

import android.app.Activity;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.ttcjpayapi.CJOuterPayCallback;
import com.android.ttcjpaysdk.ttcjpayapi.IBlockDialog;
import com.android.ttcjpaysdk.ttcjpayapi.ICJPayReleaseAll;
import com.android.ttcjpaysdk.ttcjpayapi.ICustomActionListener;
import com.android.ttcjpaysdk.ttcjpayapi.ICustomerServiceCallback;
import com.android.ttcjpaysdk.ttcjpayapi.IGeneralPay;
import com.android.ttcjpaysdk.ttcjpayapi.IH5NotificationCallback;
import com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback;
import com.android.ttcjpaysdk.ttcjpayapi.ITTCJPayPhoneCarrierService;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayDoFaceLive;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayMonitor;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayOpenSchemeInterface;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayOpenSchemeWithContextInterface;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.analytics.pro.C33753n;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135508cC7;
import p003X.AbstractC135665cEe;
import p003X.AbstractC137059cb9;

/* renamed from: com.android.ttcjpaysdk.base.a */
/* loaded from: classes17.dex */
public class C2118a {
    public static ChangeQuickRedirect LIZ;
    public static volatile C2118a LJJIFFI;
    public ICJPayReleaseAll LIZIZ;
    public volatile TTCJPayResult LIZJ;
    public TTCJPayOpenSchemeInterface LIZLLL;

    /* renamed from: LJ */
    public TTCJPayOpenSchemeWithContextInterface f25443LJ;
    public AbstractC137059cb9 LJFF;
    public AbstractC135508cC7 LJI;
    public AbstractC135665cEe LJII;
    public TTCJPayObserver LJIIIIZZ;
    public TTCJPayMonitor LJIIIZ;
    public CJOuterPayCallback LJIIJ;
    public TTCJPayDoFaceLive LJIIJJI;
    public ITTCJPayPhoneCarrierService LJIIL;
    public IH5PayCallback LJIILIIL;
    public IGeneralPay LJIILJJIL;
    public IBlockDialog LJIILL;
    public IH5NotificationCallback LJIILLIIL;
    public ICustomActionListener LJIIZILJ;
    public ICustomerServiceCallback LJIJ;
    public JSONObject LJIJI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public HashMap<Integer, IH5PayCallback> LJJII = new HashMap<>();
    public int LJJIII = 0;
    public String LJIJJ = "";
    public String LJIJJLI = "";

    static {
        Covode.recordClassIndex(5901);
    }

    public final void LIZ(Activity activity, Map<String, String> map, TTCJPayDoFaceLive.TTCJPayFaceLiveCallback tTCJPayFaceLiveCallback) {
        if (PatchProxy.proxy(new Object[]{activity, map, tTCJPayFaceLiveCallback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        TTCJPayDoFaceLive tTCJPayDoFaceLive = this.LJIIJJI;
        if (tTCJPayDoFaceLive != null) {
            tTCJPayDoFaceLive.doFaceLive(activity, map, tTCJPayFaceLiveCallback);
            return;
        }
        try {
            String string = activity.getString(2131561934);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", false);
            jSONObject.put("errorMsg", string);
            jSONObject.put("errorCode", "-9999");
            tTCJPayFaceLiveCallback.onResult(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", string);
            jSONObject2.put("errorCode", "-9999");
            LIZ("wallet_rd_call_cert_sdk_failed", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void LIZ(String str, JSONObject... jSONObjectArr) {
        if (PatchProxy.proxy(new Object[]{str, jSONObjectArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            LIZ(jSONObject2, jSONObject);
        }
        JSONObject jSONObject3 = this.LJIJI;
        if (jSONObject3 != null) {
            LIZ(jSONObject3, jSONObject);
        }
        LIZ(LJFF(), jSONObject);
        if (this.LJIIIIZZ != null) {
            this.LJIIIIZZ.onEvent(str, CJPayBasicUtils.Json2Map(jSONObject));
        } else if (CJPayPerformance.LIZ().LIZIZ()) {
            CJPayPerformance.LIZ().LIZ(str, jSONObject);
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 5).isSupported) {
            return;
        }
        TTCJPayMonitor tTCJPayMonitor = this.LJIIIZ;
        if (tTCJPayMonitor != null) {
            tTCJPayMonitor.monitorEvent(str, jSONObject, jSONObject, null);
        } else if (!CJPayPerformance.LIZ().LIZJ()) {
        } else {
            CJPayPerformance.LIZ().LIZ(str, jSONObject, jSONObject, null);
        }
    }

    public final C2118a LIZ(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (C2118a) proxy.result;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TTCJPayResult();
        }
        this.LIZJ.setCallBackInfo(map);
        return this;
    }

    /* renamed from: LJ */
    private void m16070LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LIZJ = new TTCJPayResult();
        this.LIZJ.setCode(104);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        m16070LJ();
        this.LJIJI = null;
        this.LJIJJ = "";
        this.LJIJJLI = "";
    }

    public final void LIZLLL() {
        ICJPayReleaseAll iCJPayReleaseAll;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (iCJPayReleaseAll = this.LIZIZ) != null) {
            iCJPayReleaseAll.onReleaseAll();
        }
    }

    public static C2118a LIZ() {
        MethodCollector.m14708i(346);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            C2118a c2118a = (C2118a) proxy.result;
            MethodCollector.m14707o(346);
            return c2118a;
        }
        if (LJJIFFI == null) {
            synchronized (C2118a.class) {
                try {
                    if (LJJIFFI == null) {
                        LJJIFFI = new C2118a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(346);
                    throw th;
                }
            }
        }
        C2118a c2118a2 = LJJIFFI;
        MethodCollector.m14707o(346);
        return c2118a2;
    }

    private JSONObject LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.LJIJJ)) {
                jSONObject.put("trace_id", this.LJIJJ);
            }
            if (!TextUtils.isEmpty(this.LJIJJLI)) {
                jSONObject.put("outer_aid", this.LJIJJLI);
            }
            jSONObject.put("font_size", LIZ(Float.valueOf(CJPayHostInfo.fontScale)));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void LIZIZ() {
        String str;
        String str2;
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TTCJPayResult();
            this.LIZJ.setCode(104);
        }
        if (this.LJIILIIL != null) {
            if (this.LIZJ != null && this.LIZJ.getCode() != 110) {
                TTCJPayResult tTCJPayResult = this.LIZJ;
                if (!PatchProxy.proxy(new Object[]{tTCJPayResult}, this, LIZ, false, 10).isSupported && this.LJIILIIL != null && tTCJPayResult != null) {
                    String str3 = "参数非法";
                    if (tTCJPayResult.getCode() == 0) {
                        str3 = "支付成功";
                    } else if (tTCJPayResult.getCode() == 103) {
                        str3 = "支付超时";
                        if (tTCJPayResult.getCallBackInfo() != null && (str2 = tTCJPayResult.getCallBackInfo().get("fail_desc")) != null && !str2.isEmpty()) {
                            str3 = str2;
                        }
                        i = 1;
                    } else if (tTCJPayResult.getCode() == 102) {
                        i = 2;
                        str3 = "支付失败";
                        if (tTCJPayResult.getCallBackInfo() != null && (str = tTCJPayResult.getCallBackInfo().get("fail_desc")) != null && !str.isEmpty()) {
                            str3 = str;
                        }
                    } else if (tTCJPayResult.getCode() == 104) {
                        i = 4;
                        str3 = "支付取消";
                    } else if (tTCJPayResult.getCode() == 101) {
                        i = 9;
                        str3 = "支付处理中";
                    } else if (tTCJPayResult.getCode() == 109) {
                        str3 = "网络错误";
                        i = 109;
                    } else if (tTCJPayResult.getCode() == 112) {
                        i = 112;
                    } else if (tTCJPayResult.getCode() == 113) {
                        str3 = "余额不足";
                        i = 113;
                    } else if (tTCJPayResult.getCode() == 116) {
                        str3 = "刷单风控弹窗取消支付";
                        i = 116;
                    } else if (tTCJPayResult.getCode() == 4100) {
                        str3 = "绑卡成功";
                        i = 4100;
                    } else if (tTCJPayResult.getCode() == 4101) {
                        i = 4101;
                        str3 = "绑卡失败";
                    } else if (tTCJPayResult.getCode() == 4102) {
                        i = C33753n.C33755a.f42379f;
                        str3 = "绑卡取消";
                    } else if (tTCJPayResult.getCode() == 4103) {
                        i = C33753n.C33755a.f42380g;
                        str3 = "调起绑卡失败";
                    } else if (tTCJPayResult.getCode() == 4110) {
                        i = 4110;
                        str3 = "登录失败";
                    } else {
                        if (tTCJPayResult.getCode() != 4111) {
                            if (tTCJPayResult.getCode() == 4199) {
                                str3 = "网络错误";
                            } else {
                                str3 = "";
                                i = 104;
                            }
                        }
                        i = 4111;
                    }
                    if (tTCJPayResult.getCallBackInfo() != null && tTCJPayResult.getCallBackInfo().containsKey("front_standard_data")) {
                        try {
                            JSONObject jSONObject = new JSONObject(tTCJPayResult.getCallBackInfo().get("front_standard_data"));
                            jSONObject.put("result_msg", str3);
                            str3 = jSONObject.toString();
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            tTCJPayResult.getCallBackInfo().remove("front_standard_data");
                            throw th;
                        }
                        tTCJPayResult.getCallBackInfo().remove("front_standard_data");
                    }
                    LIZ(tTCJPayResult.getCode(), str3);
                    try {
                        this.LJIILIIL.onResult(i, str3);
                    } catch (Exception unused2) {
                    }
                }
                m16070LJ();
                this.LJIILIIL = null;
                this.LJIJI = null;
            }
        } else if (this.LJIIIIZZ != null && this.LIZJ != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", this.LIZJ.getCode());
                jSONObject2.put("params_for_special", "tppp");
                LIZ().LIZ("wallet_rd_pay_result_callback", jSONObject2);
            } catch (Exception unused3) {
            }
            if (this.LIZJ.getCode() != 110) {
                this.LJIJI = null;
            }
            this.LJIIIIZZ.onPayCallback(this.LIZJ);
            m16070LJ();
        }
    }

    public final IH5PayCallback LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (IH5PayCallback) proxy.result;
        }
        return this.LJJII.get(Integer.valueOf(i));
    }

    private Float LIZ(Float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{f}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (Float) proxy.result;
        }
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            return Float.valueOf(decimalFormat.format(f));
        } catch (Exception unused) {
            return Float.valueOf(1.0f);
        }
    }

    public final int LIZ(IH5PayCallback iH5PayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iH5PayCallback}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (iH5PayCallback != null) {
            HashMap<Integer, IH5PayCallback> hashMap = this.LJJII;
            int i = this.LJJIII + 1;
            this.LJJIII = i;
            hashMap.put(Integer.valueOf(i), iH5PayCallback);
            return this.LJJIII;
        }
        return -1;
    }

    public final C2118a LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C2118a) proxy.result;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TTCJPayResult();
        }
        this.LIZJ.setCode(i);
        return this;
    }

    private void LIZ(int i, String str) {
        int i2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LJJ, this.LJIL);
        try {
            LIZ2.put("error_code", i);
            LIZ2.put("service", this.LJJI);
            LIZ2.put(PushMessageHelper.ERROR_MESSAGE, str);
            if (i == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            LIZ2.put("result", i2);
        } catch (Exception unused) {
        }
        JSONObject[] jSONObjectArr = new JSONObject[2];
        jSONObjectArr[0] = LIZ2;
        JSONObject jSONObject = this.LJIJI;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObjectArr[1] = jSONObject;
        LIZ("wallet_cashier_callback_sdk", jSONObjectArr);
        this.LJJ = "";
        this.LJIL = "";
        this.LJJI = "";
    }

    private void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, jSONObject2}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
