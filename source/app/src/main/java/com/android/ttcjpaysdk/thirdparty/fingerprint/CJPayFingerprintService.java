package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintAuthCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintEnableCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintStateCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintSwitchCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintVerifyCallback;
import com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136719cVe;
import p003X.C136968cZf;
import p003X.C136969cZg;
import p003X.C136970cZh;
import p003X.C136977cZo;
import p003X.C136980cZr;
import p003X.C136985cZw;
import p003X.RunnableC136974cZl;
import p003X.RunnableC136975cZm;
import p003X.View$OnClickListenerC136972cZj;
import p003X.View$OnClickListenerC136973cZk;

/* loaded from: classes17.dex */
public class CJPayFingerprintService implements ICJPayFingerprintService {
    public static ChangeQuickRedirect LIZ;
    public static CJPayHostInfo LIZIZ;
    public ICJPayFingerprintSwitchCallback LIZJ;

    static {
        Covode.recordClassIndex(8418);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.fingerprint";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public ICJPayFingerprintSwitchCallback getSwitchCallback() {
        return this.LIZJ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    @CJPayModuleEntryReport
    public void cancelFingerprintVerify() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        C136977cZo.LIZ().LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LIZJ = null;
        C136977cZo.LIZ().LIZIZ = 0;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void releaseFingerprintGuide() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        C136968cZf LIZ2 = C136968cZf.LIZ();
        LIZ2.LIZIZ = false;
        LIZ2.LIZJ = false;
        LIZ2.f18110LJ = 0;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public boolean isSupportFingerprint(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C136977cZo.LIZ().LIZ(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    @CJPayModuleEntryReport
    public void auth(Activity activity, ICJPayFingerprintAuthCallback iCJPayFingerprintAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, iCJPayFingerprintAuthCallback}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C136977cZo.LIZ().LIZ(activity, iCJPayFingerprintAuthCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    @CJPayModuleEntryReport
    public void verifyFingerprint(String str, ICJPayFingerprintVerifyCallback iCJPayFingerprintVerifyCallback) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayFingerprintVerifyCallback}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C136977cZo.LIZ().LIZ(str, iCJPayFingerprintVerifyCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public boolean isLocalEnableFingerprint(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C136977cZo.LIZ().LIZ(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public boolean isLocalEnableFingerprint(Context context, String str, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C136977cZo.LIZ().LIZ(context, str, z);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void closeFingerprint(Context context, String str, ICJPayFingerprintSwitchCallback iCJPayFingerprintSwitchCallback) {
        String str2;
        if (PatchProxy.proxy(new Object[]{context, str, iCJPayFingerprintSwitchCallback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            CJPayHostInfo.uid = str;
        }
        this.LIZJ = iCJPayFingerprintSwitchCallback;
        if (Build.VERSION.SDK_INT >= 23) {
            C136977cZo LIZ2 = C136977cZo.LIZ();
            if (!PatchProxy.proxy(new Object[]{str}, LIZ2, C136977cZo.LIZ, false, 10).isSupported) {
                String encryptDataSM = CJPayEncryptUtil.getEncryptDataSM(new String(Base64.decode(C136985cZw.LIZ().LIZIZ(str, CJPayHostInfo.aid), 2)));
                String str3 = "";
                C136985cZw.LIZ().LIZIZ(str3, str, CJPayHostInfo.aid);
                C136985cZw.LIZ().LIZJ(str3, str, CJPayHostInfo.aid);
                C136985cZw.LIZ().LIZ(str3, str, CJPayHostInfo.aid);
                ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
                if (iCJPayFingerprintService != null && iCJPayFingerprintService.getSwitchCallback() != null) {
                    iCJPayFingerprintService.getSwitchCallback().onResult(true, false, str3, 0);
                }
                C136719cVe c136719cVe = new C136719cVe(LIZ2);
                HashMap<String, String> hashMap = null;
                if (!PatchProxy.proxy(new Object[]{encryptDataSM, str, c136719cVe}, null, CJPayFingerprintPresenter.LIZ, true, 5).isSupported) {
                    String LIZ3 = CJPayParamsUtils.LIZ("bytepay.member_product.disable_biometrics_pay", CJPayParamsUtils.HostAPI.BDPAY);
                    CJPayHostInfo cJPayHostInfo = LIZIZ;
                    if (cJPayHostInfo != null) {
                        hashMap = cJPayHostInfo.extraHeaderMap;
                    }
                    CJPayHostInfo cJPayHostInfo2 = LIZIZ;
                    if (cJPayHostInfo2 != null) {
                        str2 = cJPayHostInfo2.appId;
                    } else {
                        str2 = str3;
                    }
                    CJPayHostInfo cJPayHostInfo3 = LIZIZ;
                    if (cJPayHostInfo3 != null) {
                        str3 = cJPayHostInfo3.merchantId;
                    }
                    CJPayNetworkManager.postForm(LIZ3, CJPayParamsUtils.LIZ("bytepay.member_product.disable_biometrics_pay", CJPayFingerprintPresenter.LIZ(encryptDataSM, str), str2, str3), CJPayParamsUtils.LIZ(LIZ3, "bytepay.member_product.disable_biometrics_pay", hashMap), c136719cVe);
                }
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    @CJPayModuleEntryReport
    public void queryFingerprintState(final Context context, final String str, final ICJPayFingerprintStateCallback iCJPayFingerprintStateCallback, JSONObject jSONObject) {
        String str2;
        if (PatchProxy.proxy(new Object[]{context, str, iCJPayFingerprintStateCallback, jSONObject}, this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject);
        ICJPayCallback iCJPayCallback = new ICJPayCallback(this) { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8419);
            }

            @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
            public final void onFailure(JSONObject jSONObject2) {
                ICJPayFingerprintStateCallback iCJPayFingerprintStateCallback2;
                if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, LIZ, false, 2).isSupported && (iCJPayFingerprintStateCallback2 = iCJPayFingerprintStateCallback) != null) {
                    iCJPayFingerprintStateCallback2.onGetState(false);
                }
            }

            @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
            public final void onResponse(JSONObject jSONObject2) {
                boolean LIZ2;
                boolean z = false;
                if (PatchProxy.proxy(new Object[]{jSONObject2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (jSONObject2.has("response")) {
                    try {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("response");
                        if (jSONObject3.has("fingerprint_pay") && jSONObject3.getBoolean("fingerprint_pay")) {
                            C136977cZo LIZ3 = C136977cZo.LIZ();
                            Context context2 = context;
                            String str3 = str;
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context2, str3}, LIZ3, C136977cZo.LIZ, false, 3);
                            if (proxy.isSupported) {
                                LIZ2 = ((Boolean) proxy.result).booleanValue();
                            } else {
                                LIZ2 = LIZ3.LIZ(context2, str3, false);
                            }
                            if (LIZ2) {
                                z = true;
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                ICJPayFingerprintStateCallback iCJPayFingerprintStateCallback2 = iCJPayFingerprintStateCallback;
                if (iCJPayFingerprintStateCallback2 != null) {
                    iCJPayFingerprintStateCallback2.onGetState(z);
                }
            }
        };
        HashMap<String, String> hashMap = null;
        if (!PatchProxy.proxy(new Object[]{str, iCJPayCallback}, null, CJPayFingerprintPresenter.LIZ, true, 3).isSupported) {
            String LIZ2 = CJPayParamsUtils.LIZ("bytepay.member_product.query_biometrics_pay_status", CJPayParamsUtils.HostAPI.BDPAY);
            CJPayHostInfo cJPayHostInfo = LIZIZ;
            if (cJPayHostInfo != null) {
                hashMap = cJPayHostInfo.extraHeaderMap;
            }
            CJPayHostInfo cJPayHostInfo2 = LIZIZ;
            String str3 = "";
            if (cJPayHostInfo2 != null) {
                str2 = cJPayHostInfo2.appId;
            } else {
                str2 = str3;
            }
            CJPayHostInfo cJPayHostInfo3 = LIZIZ;
            if (cJPayHostInfo3 != null) {
                str3 = cJPayHostInfo3.merchantId;
            }
            CJPayNetworkManager.postForm(LIZ2, CJPayParamsUtils.LIZ("bytepay.member_product.query_biometrics_pay_status", CJPayFingerprintPresenter.LIZ(str).toString(), str2, str3), CJPayParamsUtils.LIZ(LIZ2, "bytepay.member_product.query_biometrics_pay_status", hashMap), iCJPayCallback);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void enableFingerprint(Cipher cipher, String str, String str2, JSONObject jSONObject, String str3, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback) {
        if (PatchProxy.proxy(new Object[]{cipher, str, str2, jSONObject, str3, iCJPayFingerprintEnableCallback}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject);
        C136977cZo.LIZ().LIZ(cipher, str, null, str2, CJPayHostInfo.LIZ(jSONObject), str3, null, iCJPayFingerprintEnableCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void enableFingerprintWithoutPwdInPaymentManager(Cipher cipher, String str, String str2, JSONObject jSONObject, String str3, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback) {
        if (PatchProxy.proxy(new Object[]{cipher, str, str2, jSONObject, str3, iCJPayFingerprintEnableCallback}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject);
        C136977cZo.LIZ().LIZ(cipher, null, str, str2, CJPayHostInfo.LIZ(jSONObject), null, str3, iCJPayFingerprintEnableCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void enableFingerprintWithoutPwd(Cipher cipher, JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback) {
        String str3;
        if (PatchProxy.proxy(new Object[]{cipher, jSONObject, str, jSONObject2, str2, iCJPayFingerprintEnableCallback}, this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject2);
        C136977cZo LIZ2 = C136977cZo.LIZ();
        CJPayHostInfo LIZ3 = CJPayHostInfo.LIZ(jSONObject2);
        if (!PatchProxy.proxy(new Object[]{cipher, jSONObject, str, LIZ3, str2, iCJPayFingerprintEnableCallback}, LIZ2, C136977cZo.LIZ, false, 8).isSupported) {
            LIZIZ = LIZ3;
            String str4 = "";
            String encryptDataWithoutMd5 = CJPayEncryptUtil.getEncryptDataWithoutMd5(str2, jSONObject.optString("process_id", str4));
            C136980cZr c136980cZr = new C136980cZr(LIZ2, cipher, str, iCJPayFingerprintEnableCallback);
            HashMap<String, String> hashMap = null;
            if (!PatchProxy.proxy(new Object[]{jSONObject, str, encryptDataWithoutMd5, c136980cZr}, null, CJPayFingerprintPresenter.LIZ, true, 2).isSupported) {
                String LIZ4 = CJPayParamsUtils.LIZ("bytepay.cashdesk.enable_biometrics_pay", CJPayParamsUtils.HostAPI.BDPAY);
                CJPayHostInfo cJPayHostInfo = LIZIZ;
                if (cJPayHostInfo != null) {
                    hashMap = cJPayHostInfo.extraHeaderMap;
                }
                CJPayHostInfo cJPayHostInfo2 = LIZIZ;
                if (cJPayHostInfo2 != null) {
                    str3 = cJPayHostInfo2.appId;
                } else {
                    str3 = str4;
                }
                CJPayHostInfo cJPayHostInfo3 = LIZIZ;
                if (cJPayHostInfo3 != null) {
                    str4 = cJPayHostInfo3.merchantId;
                }
                CJPayNetworkManager.postForm(LIZ4, CJPayParamsUtils.LIZ("bytepay.cashdesk.enable_biometrics_pay", CJPayFingerprintPresenter.LIZ(jSONObject, str, encryptDataWithoutMd5), str3, str4), CJPayParamsUtils.LIZ(LIZ4, "bytepay.cashdesk.enable_biometrics_pay", hashMap), c136980cZr);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    @CJPayModuleEntryReport
    public void openFingerprint(Context context, String str, ICJPayFingerprintSwitchCallback iCJPayFingerprintSwitchCallback, JSONObject jSONObject, String str2, String str3, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{context, str, iCJPayFingerprintSwitchCallback, jSONObject, str2, str3, jSONObject2}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (!CJPayBasicUtils.isSupportFingerPrint(context)) {
            iCJPayFingerprintSwitchCallback.onResult(false, false, context.getString(2131561660), 2);
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            CJPayHostInfo.uid = str;
        }
        this.LIZJ = iCJPayFingerprintSwitchCallback;
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo = new CJPayFaceVerifyInfo();
        if ("livepwd".equals(str3) && jSONObject2 != null) {
            try {
                cJPayFaceVerifyInfo = (CJPayFaceVerifyInfo) CJPayJsonParser.fromJson(jSONObject2, CJPayFaceVerifyInfo.class);
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent(context, CJPayInputPasswordActivity.class);
        intent.putExtra("member_biz_order_no", str2);
        intent.putExtra("verify_type", str3);
        if (cJPayFaceVerifyInfo.need_live_detection) {
            intent.putExtra("verify_info", cJPayFaceVerifyInfo);
        }
        C116971W2r.LIZ(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void showFingerprintDialogInPaymentManager(Context context, int i, boolean z, boolean z2, String str, String str2, JSONObject jSONObject, String str3, IFingerprintGuideCallback iFingerprintGuideCallback) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, str2, jSONObject, str3, iFingerprintGuideCallback}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C136968cZf LIZ2 = C136968cZf.LIZ();
        if (!PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Byte.valueOf((byte) z), Byte.valueOf((byte) z2), str, str2, jSONObject, str3, iFingerprintGuideCallback}, LIZ2, C136968cZf.LIZ, false, 11).isSupported) {
            C106862S5w.LIZ(context);
            DialogC2355b dialogC2355b = new DialogC2355b(context, i, z, z2);
            dialogC2355b.LIZIZ = new View$OnClickListenerC136972cZj(LIZ2, iFingerprintGuideCallback, context, dialogC2355b, str, str2, jSONObject, str3);
            if (!PatchProxy.proxy(new Object[]{context, dialogC2355b, str, str2, jSONObject, str3, iFingerprintGuideCallback}, LIZ2, C136968cZf.LIZ, false, 13).isSupported) {
                C106862S5w.LIZ(context, dialogC2355b);
                ICJPayFingerprintService iCJPayFingerprintService = LIZ2.LIZLLL;
                if (iCJPayFingerprintService != null) {
                    iCJPayFingerprintService.auth((Activity) context, new C136970cZh(LIZ2, context, dialogC2355b, str, str2, jSONObject, str3, iFingerprintGuideCallback));
                }
            }
            LIZ2.LJFF.postDelayed(new RunnableC136974cZl(LIZ2, iFingerprintGuideCallback, context, dialogC2355b, str, str2, jSONObject, str3), 200L);
            if (iFingerprintGuideCallback != null) {
                iFingerprintGuideCallback.onFingerprintDialogImpEvent();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintService
    public void showFingerprintGuide(Context context, int i, boolean z, boolean z2, JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, IFingerprintGuideCallback iFingerprintGuideCallback) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), jSONObject, str, jSONObject2, str2, iFingerprintGuideCallback}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C136968cZf LIZ2 = C136968cZf.LIZ();
        if (!PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Byte.valueOf((byte) z), Byte.valueOf((byte) z2), jSONObject, str, jSONObject2, str2, iFingerprintGuideCallback}, LIZ2, C136968cZf.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(context);
            DialogC2355b dialogC2355b = new DialogC2355b(context, i, z, z2);
            dialogC2355b.LIZIZ = new View$OnClickListenerC136973cZk(LIZ2, iFingerprintGuideCallback, context, dialogC2355b, jSONObject, str, jSONObject2, str2);
            if (!PatchProxy.proxy(new Object[]{context, dialogC2355b, jSONObject, str, jSONObject2, str2, iFingerprintGuideCallback}, LIZ2, C136968cZf.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(context, dialogC2355b);
                ICJPayFingerprintService iCJPayFingerprintService = LIZ2.LIZLLL;
                if (iCJPayFingerprintService != null) {
                    iCJPayFingerprintService.auth((Activity) context, new C136969cZg(LIZ2, context, dialogC2355b, jSONObject, str, jSONObject2, str2, iFingerprintGuideCallback));
                }
            }
            LIZ2.LJFF.postDelayed(new RunnableC136975cZm(LIZ2, iFingerprintGuideCallback, context, dialogC2355b, jSONObject, str, jSONObject2, str2), 200L);
            if (iFingerprintGuideCallback != null) {
                iFingerprintGuideCallback.onFingerprintDialogImpEvent();
            }
        }
    }
}
