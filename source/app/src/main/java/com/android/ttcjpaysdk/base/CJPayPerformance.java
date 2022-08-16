package com.android.ttcjpaysdk.base;

import android.content.Context;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayPerformanceService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayPerformance {
    public static ChangeQuickRedirect LIZ;
    public static volatile CJPayPerformance LIZIZ;
    public ICJPayPerformanceService LIZJ = (ICJPayPerformanceService) CJPayServiceManager.getInstance().getIService(ICJPayPerformanceService.class);

    static {
        Covode.recordClassIndex(5899);
    }

    /* loaded from: classes13.dex */
    public enum Module {
        AUTH("实名授权"),
        H5("h5"),
        LOGIN("无感登录"),
        OCR("银行卡OCR"),
        SETTINGS("settings"),
        OFFLINE("离线包"),
        RECHARGE("余额充值"),
        WITHDRAW("余额提现"),
        BIND_CARD("绑卡"),
        FRONT_BIND_CARD("前置绑卡"),
        BD_COUNTER("追光收银台"),
        FACE_LIVE("活体"),
        FINGER_PRINT("指纹"),
        CARD_LIST("前置卡列表"),
        MY_BANK_CARD("我的银行卡"),
        RESTRICTED("一键支付"),
        SUPPLEMENTARY_SIGN("补签约"),
        INTEGRATED_COUNTER("聚合收银台"),
        VERIFY("验证组件"),
        BASE_PAY("三方支付基础"),
        ALI_PAY("支付宝"),
        WX_PAY("微信支付"),
        CMB_PAY("招行一网通"),
        NETWORK("网络库"),
        SDK_API("SDK_API"),
        IMAGE_LOADER("图片加载"),
        FAST_PAY("极速支付"),
        GECKO("离线包—gecko");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Module[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Module[]) proxy.result;
            }
            return (Module[]) values().clone();
        }

        static {
            Covode.recordClassIndex(5900);
        }

        public static Module valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Module) proxy.result;
            }
            return (Module) Enum.valueOf(Module.class, str);
        }

        Module(String str) {
            this.name = str;
        }
    }

    public static CJPayPerformance LIZ() {
        MethodCollector.m14708i(345);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            CJPayPerformance cJPayPerformance = (CJPayPerformance) proxy.result;
            MethodCollector.m14707o(345);
            return cJPayPerformance;
        }
        if (LIZIZ == null) {
            synchronized (CJPayPerformance.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new CJPayPerformance();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(345);
                    throw th;
                }
            }
        }
        CJPayPerformance cJPayPerformance2 = LIZIZ;
        MethodCollector.m14707o(345);
        return cJPayPerformance2;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ICJPayPerformanceService iCJPayPerformanceService = this.LIZJ;
        if (iCJPayPerformanceService == null) {
            return false;
        }
        return iCJPayPerformanceService.isInstallAppLog();
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ICJPayPerformanceService iCJPayPerformanceService = this.LIZJ;
        if (iCJPayPerformanceService == null) {
            return false;
        }
        return iCJPayPerformanceService.isInstallApmMonitor();
    }

    public final void LIZ(Context context) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.init(context);
        }
    }

    public final void LIZIZ(String str) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.startKeepPage(str);
        }
    }

    public final void LIZJ(String str) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.endKeepPage(str);
        }
    }

    public final void LIZLLL(String str) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.stopFpsTrace(str);
        }
    }

    public final void LIZ(String str) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.initModule(str);
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 7).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.onAppLogEvent(str, jSONObject);
        }
    }

    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ICJPayPerformanceService iCJPayPerformanceService;
        if (!PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, this, LIZ, false, 9).isSupported && (iCJPayPerformanceService = this.LIZJ) != null) {
            iCJPayPerformanceService.onApmMonitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
