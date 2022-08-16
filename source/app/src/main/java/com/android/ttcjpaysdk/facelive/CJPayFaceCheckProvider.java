package com.android.ttcjpaysdk.facelive;

import android.app.Activity;
import android.content.Context;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.ICJPayFaceCheckCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils;
import com.android.ttcjpaysdk.facelive.data.GetTicketResponse;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135465cBQ;
import p003X.C135520cCJ;
import p003X.C135522cCL;
import p003X.C135525cCO;
import p003X.C137038can;
import p003X.C9H6;
import p003X.DialogC135372c9v;
import p003X.DialogC137460chc;
import p003X.View$OnClickListenerC135523cCM;
import p003X.View$OnClickListenerC135524cCN;

/* loaded from: classes17.dex */
public final class CJPayFaceCheckProvider implements ICJPayFaceCheckService {
    public static ChangeQuickRedirect LIZ;
    public static CJPayHostInfo LIZIZ;

    static {
        Covode.recordClassIndex(7399);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.facelive";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final int getClientSource() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return C135520cCJ.LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final boolean getIsSigned() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C135520cCJ.LIZJ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final void dismissDialog() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], C135520cCJ.LJIIIZ, C135520cCJ.LIZ, false, 5).isSupported) {
            DialogC135372c9v dialogC135372c9v = C135520cCJ.LJII;
            if (dialogC135372c9v != null) {
                C116971W2r.LIZ(dialogC135372c9v);
            }
            DialogC137460chc dialogC137460chc = C135520cCJ.LJIIIIZZ;
            if (dialogC137460chc != null) {
                C116971W2r.LIZ(dialogC137460chc);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        setLogParams(null);
        setCounterCommonParams(null);
        C135520cCJ.LIZIZ = -1;
        C135520cCJ.LIZJ = "";
        C135520cCJ.LJFF = null;
        C135520cCJ.LJI = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final void setCounterCommonParams(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C135522cCL.LIZIZ = jSONObject;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final void setLogParams(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C135520cCJ.f17931LJ = hashMap;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    @CJPayModuleEntryReport
    public final void gotoCheckFace(Activity activity, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{activity, jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        gotoCheckFace(activity, jSONObject, null);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    @CJPayModuleEntryReport
    public final void gotoCheckFaceAgain(Activity activity, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{activity, jSONObject}, this, LIZ, false, 3).isSupported) {
            return;
        }
        gotoCheckFaceAgain(activity, jSONObject, null);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    @CJPayModuleEntryReport
    public final void gotoCheckFace(Activity activity, JSONObject jSONObject, ICJPayFaceCheckCallback iCJPayFaceCheckCallback) {
        JSONObject jSONObject2;
        if (PatchProxy.proxy(new Object[]{activity, jSONObject, iCJPayFaceCheckCallback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C135525cCO c135525cCO = (C135525cCO) CJPayJsonParser.fromJson(jSONObject, C135525cCO.class);
        C137038can c137038can = CJPayHostInfo.Companion;
        if (c135525cCO != null) {
            jSONObject2 = c135525cCO.hostInfo;
        } else {
            jSONObject2 = null;
        }
        LIZIZ = c137038can.LIZ(jSONObject2);
        C135520cCJ.LJIIIZ.LIZ(activity, c135525cCO, iCJPayFaceCheckCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    public final void gotoCheckFaceAgain(Activity activity, JSONObject jSONObject, ICJPayFaceCheckCallback iCJPayFaceCheckCallback) {
        JSONObject jSONObject2;
        String str;
        DialogC137460chc dialogC137460chc;
        if (PatchProxy.proxy(new Object[]{activity, jSONObject, iCJPayFaceCheckCallback}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C135525cCO c135525cCO = (C135525cCO) CJPayJsonParser.fromJson(jSONObject, C135525cCO.class);
        C137038can c137038can = CJPayHostInfo.Companion;
        String str2 = null;
        if (c135525cCO != null) {
            jSONObject2 = c135525cCO.hostInfo;
        } else {
            jSONObject2 = null;
        }
        LIZIZ = c137038can.LIZ(jSONObject2);
        if (!PatchProxy.proxy(new Object[]{activity, c135525cCO, iCJPayFaceCheckCallback}, C135520cCJ.LJIIIZ, C135520cCJ.LIZ, false, 4).isSupported && activity != null && c135525cCO != null) {
            C135520cCJ.LIZIZ = c135525cCO.clientSource;
            C135520cCJ.LIZJ = c135525cCO.logSource;
            DialogC137460chc dialogC137460chc2 = C135520cCJ.LJIIIIZZ;
            if (dialogC137460chc2 != null && !activity.isFinishing()) {
                C9H6.LIZ(dialogC137460chc2);
            }
            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(activity);
            defaultBuilder.setTitle(activity.getString(2131561615));
            Object[] objArr = new Object[1];
            GetTicketResponse getTicketResponse = C135520cCJ.LJFF;
            if (getTicketResponse != null) {
                str2 = getTicketResponse.name_mask;
            }
            objArr[0] = str2;
            defaultBuilder.setSubTitle(activity.getString(2131561614, objArr));
            defaultBuilder.setLeftBtnStr(activity.getString(2131558453));
            defaultBuilder.setRightBtnStr(activity.getString(2131561622));
            defaultBuilder.setLeftBtnListener(new View$OnClickListenerC135523cCM(activity, c135525cCO, activity, iCJPayFaceCheckCallback));
            defaultBuilder.setRightBtnListener(new View$OnClickListenerC135524cCN(activity, c135525cCO, activity, iCJPayFaceCheckCallback));
            C135520cCJ.LJIIIIZZ = defaultBuilder.build();
            if (!activity.isFinishing() && (dialogC137460chc = C135520cCJ.LJIIIIZZ) != null) {
                C116971W2r.LIZJ(dialogC137460chc);
            }
            C135522cCL c135522cCL = C135522cCL.LIZLLL;
            Pair[] pairArr = new Pair[3];
            GetTicketResponse getTicketResponse2 = C135520cCJ.LJFF;
            String str3 = "1";
            if (getTicketResponse2 == null || !getTicketResponse2.hasSrc()) {
                str = "0";
            } else {
                str = str3;
            }
            pairArr[0] = TuplesKt.m137to("alivecheck_type", str);
            if (!C135520cCJ.LIZLLL) {
                str3 = "2";
            }
            pairArr[1] = TuplesKt.m137to("enter_from", str3);
            String LIZIZ2 = CJPaySharedPrefUtils.LIZIZ("ttcjpay_sp_key_face_check_failed", "0");
            Intrinsics.checkNotNull(LIZIZ2);
            pairArr[2] = TuplesKt.m137to("fail_before", LIZIZ2);
            c135522cCL.LIZ(activity, "wallet_alivecheck_fail_pop", MapsKt__MapsKt.hashMapOf(pairArr));
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    @CJPayModuleEntryReport
    public final void logFaceResultEvent(Context context, String str, JSONObject jSONObject) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str);
        if (jSONObject != null) {
            try {
                String str4 = "";
                String str5 = "1";
                if (jSONObject.has("response")) {
                    str4 = jSONObject.optJSONObject("response").optString(C2521l.LJIIJ);
                    if (!Intrinsics.areEqual(str4, "CD000000") && !Intrinsics.areEqual(str4, "MP000000")) {
                        str3 = "0";
                    } else {
                        str3 = str5;
                    }
                    str2 = jSONObject.optJSONObject("response").optString("msg");
                } else {
                    str2 = "server error";
                    str3 = "0";
                }
                C135522cCL c135522cCL = C135522cCL.LIZLLL;
                Intrinsics.checkNotNull(str4);
                Intrinsics.checkNotNull(str2);
                if (!PatchProxy.proxy(new Object[]{context, str, str3, str4, str2}, c135522cCL, C135522cCL.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(context, str, str3, str4, str2);
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = TuplesKt.m137to("alivecheck_type", str);
                    if (!C135520cCJ.LIZJ()) {
                        str5 = "2";
                    }
                    pairArr[1] = TuplesKt.m137to("enter_from", str5);
                    String LIZIZ2 = CJPaySharedPrefUtils.LIZIZ("ttcjpay_sp_key_face_check_failed", "0");
                    Intrinsics.checkNotNull(LIZIZ2);
                    pairArr[2] = TuplesKt.m137to("fail_before", LIZIZ2);
                    pairArr[3] = TuplesKt.m137to(PushConstants.WEB_URL, "tp.cashdesk.trade_confirm");
                    pairArr[4] = TuplesKt.m137to("fail_code", str4);
                    pairArr[5] = TuplesKt.m137to("fail_reason", str2);
                    pairArr[6] = TuplesKt.m137to("result", str3);
                    c135522cCL.LIZ(context, "wallet_alivecheck_result", MapsKt__MapsKt.hashMapOf(pairArr));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService
    @CJPayModuleEntryReport
    public final JSONObject getFaceVerifyParams(String str, Integer num, String str2, String str3, JSONObject jSONObject, Boolean bool, String str4, String str5, String str6, String str7, String str8) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, num, str2, str3, jSONObject, bool, str4, str5, str6, str7, str8}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject2 = new JSONObject();
        C135465cBQ.LIZ(jSONObject2, "orderId", str);
        C135465cBQ.LIZ(jSONObject2, "liveRoute", str3);
        C135465cBQ.LIZ(jSONObject2, "hostInfo", jSONObject);
        C135465cBQ.LIZ(jSONObject2, "isShowDialog", bool);
        C135465cBQ.LIZ(jSONObject2, "serverSource", str2);
        C135465cBQ.LIZ(jSONObject2, "clientSource", num);
        C135465cBQ.LIZ(jSONObject2, "showStyle", str4);
        C135465cBQ.LIZ(jSONObject2, "buttonDesc", str5);
        C135465cBQ.LIZ(jSONObject2, "uid", str6);
        C135465cBQ.LIZ(jSONObject2, "faceScene", str7);
        C135465cBQ.LIZ(jSONObject2, "logSource", str8);
        return jSONObject2;
    }
}
