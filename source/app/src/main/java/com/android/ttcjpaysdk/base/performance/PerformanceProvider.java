package com.android.ttcjpaysdk.base.performance;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.performance.p134b.C2165c;
import com.android.ttcjpaysdk.base.service.ICJPayPerformanceService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import org.json.JSONObject;
import p003X.C103995QxJ;
import p003X.C116120VnO;
import p003X.VQD;
import p003X.VQE;
import p003X.VQG;
import p003X.VQH;

/* loaded from: classes13.dex */
public class PerformanceProvider implements ICJPayPerformanceService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6364);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public boolean isInstallApmMonitor() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return VQE.LIZJ().LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public boolean isInstallAppLog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return VQG.LIZJ().LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void stopFpsTrace(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        VQD.LIZJ().LIZ(str);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void startKeepPage(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported && !PatchProxy.proxy(new Object[]{str}, null, C103995QxJ.LIZ, true, 1).isSupported) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C103995QxJ.LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void endKeepPage(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported && !PatchProxy.proxy(new Object[]{str}, null, C103995QxJ.LIZ, true, 2).isSupported) {
            try {
                if (!TextUtils.isEmpty(str) && C103995QxJ.LIZIZ.containsKey(str)) {
                    Long remove = C103995QxJ.LIZIZ.remove(str);
                    if (remove == null) {
                        throw new NullPointerException("longValue");
                    }
                    C103995QxJ.LIZ(str, System.currentTimeMillis() - remove.longValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void initModule(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{str}, C116120VnO.LIZ(), C116120VnO.LIZ, false, 6).isSupported) {
            try {
                C2165c c2165c = C116120VnO.LIZJ.get(str);
                if (c2165c != null && !c2165c.LIZ) {
                    JSONObject LIZ2 = CJPayParamsUtils.LIZ("", "");
                    LIZ2.put(C2521l.LJIIJ, "0");
                    LIZ2.put("name", c2165c.LIZIZ);
                    C2118a.LIZ().LIZ("wallet_rd_crash_module_rate", LIZ2);
                    c2165c.LIZ = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void init(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            return;
        }
        try {
            if (!PatchProxy.proxy(new Object[0], C116120VnO.LIZ(), C116120VnO.LIZ, false, 2).isSupported) {
                HashMap hashMap = new HashMap();
                C116120VnO.LIZJ = hashMap;
                hashMap.put("com.android.ttcjpaysdk.base.auth", new C2165c(CJPayPerformance.Module.AUTH.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.h5", new C2165c(CJPayPerformance.Module.H5.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.login", new C2165c(CJPayPerformance.Module.LOGIN.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.ocr", new C2165c(CJPayPerformance.Module.OCR.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.balancerecharge", new C2165c(CJPayPerformance.Module.RECHARGE.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.balancewithdraw", new C2165c(CJPayPerformance.Module.WITHDRAW.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.bindcard", new C2165c(CJPayPerformance.Module.BIND_CARD.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.front.bindcard", new C2165c(CJPayPerformance.Module.FRONT_BIND_CARD.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.counter", new C2165c(CJPayPerformance.Module.BD_COUNTER.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.facelive", new C2165c(CJPayPerformance.Module.FACE_LIVE.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.fingerprint", new C2165c(CJPayPerformance.Module.FINGER_PRINT.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.front.cardlist", new C2165c(CJPayPerformance.Module.CARD_LIST.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.front.mybankcard", new C2165c(CJPayPerformance.Module.MY_BANK_CARD.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.integrated.counter", new C2165c(CJPayPerformance.Module.INTEGRATED_COUNTER.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.restricted", new C2165c(CJPayPerformance.Module.RESTRICTED.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.supplementarysign", new C2165c(CJPayPerformance.Module.SUPPLEMENTARY_SIGN.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.thirdparty.verify", new C2165c(CJPayPerformance.Module.VERIFY.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.paymentbasis", new C2165c(CJPayPerformance.Module.BASE_PAY.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.alipay", new C2165c(CJPayPerformance.Module.ALI_PAY.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.wxpay", new C2165c(CJPayPerformance.Module.WX_PAY.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.cmbpay", new C2165c(CJPayPerformance.Module.CMB_PAY.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.base.imageloader", new C2165c(CJPayPerformance.Module.IMAGE_LOADER.name));
                C116120VnO.LIZJ.put("com.android.ttcjpaysdk.fastpay", new C2165c(CJPayPerformance.Module.FAST_PAY.name));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void onAppLogEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 6).isSupported) {
            return;
        }
        VQG LIZJ = VQG.LIZJ();
        if (!PatchProxy.proxy(new Object[]{str, jSONObject}, LIZJ, VQG.LIZIZ, false, 2).isSupported && LIZJ.LIZ()) {
            try {
                AppLogNewUtils.onEventV3(str, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void startFpsTrace(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        VQD.LIZJ().LIZ(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void startFpsTraceForDelayStop(String str, boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        VQD LIZJ = VQD.LIZJ();
        if (!PatchProxy.proxy(new Object[]{str, Byte.valueOf((byte) z), new Long(j)}, LIZJ, VQD.LIZIZ, false, 3).isSupported && LIZJ.LIZ()) {
            LIZJ.LIZ(str, z);
            new Handler(Looper.getMainLooper()).postDelayed(new VQH(LIZJ, str), j);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayPerformanceService
    public void onApmMonitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, this, LIZ, false, 8).isSupported) {
            return;
        }
        VQE LIZJ = VQE.LIZJ();
        if (!PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, LIZJ, VQE.LIZIZ, false, 2).isSupported && LIZJ.LIZ()) {
            try {
                MonitorUtils.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
            } catch (Throwable unused) {
            }
        }
    }
}
