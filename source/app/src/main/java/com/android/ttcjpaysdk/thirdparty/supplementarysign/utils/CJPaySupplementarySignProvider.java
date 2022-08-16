package com.android.ttcjpaysdk.thirdparty.supplementarysign.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.BaseFragment;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignCallBack;
import com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCardSignResponseBean;
import com.android.ttcjpaysdk.thirdparty.supplementarysign.activity.CJPaySSUpdateCardInfoActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C135652cER;
import p003X.C136058cKz;
import p003X.C137405cgj;

/* loaded from: classes17.dex */
public class CJPaySupplementarySignProvider implements ICJPaySupplementarySignService {
    public static ChangeQuickRedirect LIZ;
    public static CJPayHostInfo LIZIZ;
    public ICJPaySupplementarySignCallBack LIZJ;

    static {
        Covode.recordClassIndex(8846);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.supplementarysign";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    public void release() {
        this.LIZJ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    public ICJPaySupplementarySignCallBack getCallBack() {
        return this.LIZJ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    public boolean getIsQueryConnecting(Fragment fragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (fragment == null) {
            return false;
        }
        if (fragment instanceof C135652cER) {
            return ((BaseFragment) fragment).getIsQueryConnecting();
        }
        if (!(fragment instanceof C137405cgj)) {
            return false;
        }
        return ((BaseFragment) fragment).getIsQueryConnecting();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    public void inOrOutWithAnimation(Fragment fragment, boolean z, boolean z2) {
        if (!PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported && fragment != null) {
            if (fragment instanceof C135652cER) {
                ((BaseFragment) fragment).LIZIZ(z, z2);
            } else if (fragment instanceof C137405cgj) {
                ((BaseFragment) fragment).LIZIZ(z, z2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[Catch: JSONException -> 0x00b3, TRY_ENTER, TryCatch #0 {JSONException -> 0x00b3, blocks: (B:11:0x002a, B:14:0x003c, B:16:0x0042, B:19:0x0079, B:25:0x00af, B:30:0x008a), top: B:10:0x002a }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.cER] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    @com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment getFragment(int r10, android.os.Bundle r11, com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignCallBack r12) {
        /*
            r9 = this;
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4 = 0
            r1[r4] = r0
            r7 = 1
            r1[r7] = r11
            r0 = 2
            r1[r0] = r12
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.android.ttcjpaysdk.thirdparty.supplementarysign.utils.CJPaySupplementarySignProvider.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r9, r0, r4, r7)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
        L1f:
            r5 = 0
            if (r11 != 0) goto L23
            return r5
        L23:
            r9.LIZJ = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "ss_param_agreement_data"
            java.lang.String r0 = r11.getString(r0)     // Catch: org.json.JSONException -> Lb3
            r8.<init>(r0)     // Catch: org.json.JSONException -> Lb3
            int r0 = r8.length()     // Catch: org.json.JSONException -> Lb3
            if (r0 <= 0) goto Lb7
            r6 = 0
        L3c:
            int r0 = r8.length()     // Catch: org.json.JSONException -> Lb3
            if (r6 >= r0) goto L77
            com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement r2 = new com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement     // Catch: org.json.JSONException -> Lb3
            r2.<init>()     // Catch: org.json.JSONException -> Lb3
            java.lang.Object r1 = r8.get(r6)     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "title"
            java.lang.String r0 = r1.optString(r0)     // Catch: org.json.JSONException -> Lb3
            r2.title = r0     // Catch: org.json.JSONException -> Lb3
            java.lang.Object r1 = r8.get(r6)     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "content_url"
            java.lang.String r0 = r1.optString(r0)     // Catch: org.json.JSONException -> Lb3
            r2.content_url = r0     // Catch: org.json.JSONException -> Lb3
            java.lang.Object r1 = r8.get(r6)     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "default_choose"
            boolean r0 = r1.optBoolean(r0)     // Catch: org.json.JSONException -> Lb3
            r2.default_choose = r0     // Catch: org.json.JSONException -> Lb3
            r3.add(r2)     // Catch: org.json.JSONException -> Lb3
            int r6 = r6 + 1
            goto L3c
        L77:
            if (r10 != 0) goto L88
            X.cER r2 = new X.cER     // Catch: org.json.JSONException -> Lb3
            r2.<init>()     // Catch: org.json.JSONException -> Lb3
            int r0 = r3.size()     // Catch: org.json.JSONException -> La9
            if (r0 <= 0) goto Lac
            r2.LIZ(r3)     // Catch: org.json.JSONException -> La9
            goto Lac
        L88:
            if (r10 != r7) goto Lad
            X.cgj r2 = new X.cgj     // Catch: org.json.JSONException -> Lb3
            r2.<init>()     // Catch: org.json.JSONException -> Lb3
            int r0 = r3.size()     // Catch: org.json.JSONException -> La9
            if (r0 <= 0) goto Lac
            java.lang.Object r0 = r3.get(r4)     // Catch: org.json.JSONException -> La9
            com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement r0 = (com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement) r0     // Catch: org.json.JSONException -> La9
            java.lang.String r1 = r0.content_url     // Catch: org.json.JSONException -> La9
            java.lang.Object r0 = r3.get(r4)     // Catch: org.json.JSONException -> La9
            com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement r0 = (com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement) r0     // Catch: org.json.JSONException -> La9
            java.lang.String r0 = r0.title     // Catch: org.json.JSONException -> La9
            r2.LIZ(r1, r0)     // Catch: org.json.JSONException -> La9
            goto Lac
        La9:
            r0 = move-exception
            r5 = r2
            goto Lb4
        Lac:
            r5 = r2
        Lad:
            if (r5 == 0) goto Lb7
            r5.setArguments(r11)     // Catch: org.json.JSONException -> Lb3
            return r5
        Lb3:
            r0 = move-exception
        Lb4:
            r0.printStackTrace()
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.supplementarysign.utils.CJPaySupplementarySignProvider.getFragment(int, android.os.Bundle, com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignCallBack):androidx.fragment.app.Fragment");
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySupplementarySignService
    @CJPayModuleEntryReport
    public void startUpdateCardInfoActivity(Context context, JSONObject jSONObject, JSONObject jSONObject2, ICJPaySupplementarySignCallBack iCJPaySupplementarySignCallBack) {
        Intent intent;
        if (PatchProxy.proxy(new Object[]{context, jSONObject, jSONObject2, iCJPaySupplementarySignCallBack}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZIZ = CJPayHostInfo.LIZ(jSONObject2);
        if (jSONObject != null && context != null) {
            this.LIZJ = iCJPaySupplementarySignCallBack;
            CJPayCardSignResponseBean cJPayCardSignResponseBean = (CJPayCardSignResponseBean) CJPayJsonParser.fromJson(jSONObject.toString(), CJPayCardSignResponseBean.class);
            if (cJPayCardSignResponseBean != null) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cJPayCardSignResponseBean}, null, CJPaySSUpdateCardInfoActivity.LIZ, true, 9);
                if (proxy.isSupported) {
                    intent = (Intent) proxy.result;
                } else {
                    intent = new Intent(context, CJPaySSUpdateCardInfoActivity.class);
                    intent.putExtra("ss_param_card_sign_data", cJPayCardSignResponseBean);
                    intent.putExtra("token", context.toString());
                }
                C116971W2r.LIZ(context, intent);
                if (context instanceof Activity) {
                    C136058cKz.LIZ((Activity) context);
                }
            }
        }
    }
}
