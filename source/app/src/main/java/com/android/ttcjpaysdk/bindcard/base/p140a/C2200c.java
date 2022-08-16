package com.android.ttcjpaysdk.bindcard.base.p140a;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.a.c */
/* loaded from: classes17.dex */
public final class C2200c implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public CJPayHostInfo LIZIZ;
    public CJPaySmsSignBean LIZJ;
    public JSONObject LIZLLL;

    static {
        Covode.recordClassIndex(6989);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 14).isSupported) {
            return;
        }
        try {
            if (this.LIZJ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                CJPaySmsSignBean cJPaySmsSignBean = this.LIZJ;
                if (cJPaySmsSignBean == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!TextUtils.isEmpty(cJPaySmsSignBean.activity_info)) {
                    CJPaySmsSignBean cJPaySmsSignBean2 = this.LIZJ;
                    if (cJPaySmsSignBean2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    jSONObject.put("activity_info", new JSONArray(cJPaySmsSignBean2.activity_info));
                }
            }
            if (this.LIZJ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return;
            }
            CJPaySmsSignBean cJPaySmsSignBean3 = this.LIZJ;
            if (cJPaySmsSignBean3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (cJPaySmsSignBean3.isUnionPay) {
                C135734cFl.LIZ(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PushConstants.WEB_URL, "bytepay.member_product.set_password");
        jSONObject.put("fail_code", str);
        jSONObject.put("fail_reason", str2);
        LIZ("wallet_second_password_error_info", jSONObject);
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 11).isSupported) {
            return;
        }
        try {
            if (jSONObject == null) {
                JSONObject[] jSONObjectArr = new JSONObject[1];
                JSONObject jSONObject2 = this.LIZLLL;
                if (jSONObject2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                jSONObjectArr[0] = jSONObject2;
                C135734cFl.LIZ(str, jSONObjectArr);
                return;
            }
            JSONObject[] jSONObjectArr2 = new JSONObject[2];
            JSONObject jSONObject3 = this.LIZLLL;
            if (jSONObject3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            jSONObjectArr2[0] = jSONObject3;
            jSONObjectArr2[1] = jSONObject;
            C135734cFl.LIZ(str, jSONObjectArr2);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void LIZ(C2200c c2200c, String str, JSONObject jSONObject, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2200c, str, null, 2, null}, null, LIZ, true, 12).isSupported) {
            return;
        }
        c2200c.LIZ(str, (JSONObject) null);
    }
}
