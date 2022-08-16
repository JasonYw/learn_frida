package com.bytedance.alliance.core;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.bytedance.alliance.bean.C2528b;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.android.service.manager.alliance.IsSupportWakeUp;
import com.bytedance.common.support.PushCommonSupport;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C65755Bwz;
import p003X.G1U;
import p003X.G3W;
import p003X.GDN;
import p003X.GHF;
import p003X.GKU;
import p003X.GKW;
import p003X.GKZ;
import p003X.GM5;

/* loaded from: classes2.dex */
public class AllianceServiceImpl implements IAllianceService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static GM5 sAllianceService = GKW.LIZ();

    static {
        Covode.recordClassIndex(9936);
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void onWorkerApplicationStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        sAllianceService.LIZLLL();
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public boolean allowStartOthersProcessFromSmp() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return GKZ.LIZ().LJI().LJIIIIZZ();
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public boolean hasWaked() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return GKZ.LIZ().mo23834LJ().LIZ();
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void wakeUpTargetPartner(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C2528b c2528b = new C2528b();
        c2528b.LIZ(jSONObject);
        GKZ.LIZ().mo23834LJ().LIZ(c2528b, 4, true);
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public IsSupportWakeUp isSupportWakeUp(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (IsSupportWakeUp) proxy.result;
        }
        IsSupportWakeUp isSupportWakeUp = new IsSupportWakeUp();
        isSupportWakeUp.mHasInitEd = GKZ.LIZ().LIZIZ();
        isSupportWakeUp.mIsSupportWakeUp = GKZ.LIZ().LJII().LIZIZ(context).LJIIJJI();
        isSupportWakeUp.mIsEnableWakeUp = GKZ.LIZ().LJII().LIZ(context).LIZ();
        return isSupportWakeUp;
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public boolean verifySign(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return GDN.LIZ(str, str2);
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void updateSettings(Context context, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("sdk_list_strategy");
        if (optJSONObject != null) {
            G1U.LIZ("BDAlliance", "parse NEED_CONNECT_REAL_SDK_SET and NEED_REQUEST_IF_SDK_LIST_IS_EMPTY from SDK_LIST_STRATEGY");
            try {
                jSONObject.put("need_collect_real_sdk_set", optJSONObject.optBoolean("need_collect_real_sdk_set"));
                jSONObject.put("need_request_if_sdk_list_is_empty", optJSONObject.optBoolean("need_request_if_sdk_list_is_empty"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        GKZ.LIZ().LJII().LIZ(context).updateSettings(context, jSONObject);
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void onApplicationInit(String str, Context context) {
        if (PatchProxy.proxy(new Object[]{str, context}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        GHF.LIZ("BDAlliance", "onApplicationInit");
        GKZ.LIZ().LIZ(context);
        GKZ.LIZ().LJI().LIZ(str);
        if (!G3W.LJI(context)) {
            GKZ.LIZ().LJIIIZ().LIZ();
        } else if (!PatchProxy.proxy(new Object[0], null, GKU.LIZ, true, 2).isSupported) {
            try {
                if (PushCommonSupport.getInstance().getPushConfigurationService().getPushCommonConfiguration().mIsDebugMode) {
                    G1U.LIZ("BDAlliance", "not change smp process name because cur is debug mode");
                } else {
                    Method LIZIZ = C65755Bwz.LIZIZ(Process.class, "setArgV0", String.class);
                    LIZIZ.setAccessible(true);
                    Object[] objArr = {"van.gogh"};
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZIZ, null, objArr}, null, GKU.LIZ, true, 56);
                    if (proxy.isSupported) {
                        Object obj = proxy.result;
                    } else {
                        ActionInvokeEntrance.setEventUuid(110000);
                        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(LIZIZ, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_alliance_utils_Utils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                        if (((Boolean) actionIntercept.first).booleanValue()) {
                            Object obj2 = actionIntercept.second;
                        } else {
                            ActionInvokeEntrance.actionInvokeReflection(LIZIZ.invoke(null, objArr), LIZIZ, new Object[]{null, objArr}, "com_bytedance_alliance_utils_Utils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                        }
                    }
                    G1U.LIZ("BDAlliance", "success change smp process name to : van.gogh");
                }
            } catch (Throwable th) {
                G1U.LIZ("BDAlliance", "failed to  change smp process name to : van.gogh", th);
            }
        }
        sAllianceService.LIZJ();
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void onEventV3(boolean z, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, jSONObject}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        GKZ.LIZ().LIZLLL().LIZIZ(z, str, jSONObject);
    }

    @Override // com.bytedance.android.service.manager.alliance.IAllianceService
    public void onEventV3WithHttp(boolean z, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, jSONObject}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        GKZ.LIZ().LIZLLL().LIZ(z, str, jSONObject);
    }
}
