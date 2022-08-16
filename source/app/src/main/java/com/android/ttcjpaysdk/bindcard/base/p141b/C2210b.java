package com.android.ttcjpaysdk.bindcard.base.p141b;

import com.android.ttcjpaysdk.base.service.ICJPayNewCardCallback;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135465cBQ;
import p003X.C135543cCg;
import p003X.C135752cG3;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.b.b */
/* loaded from: classes17.dex */
public final class C2210b extends C135543cCg<C2208b, a$c> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7006);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            c2208b.LIZ(LIZIZ(jSONObject), new C135752cG3(this));
        }
    }

    private JSONObject LIZIZ(JSONObject jSONObject) {
        JSONObject payNewCardConfigs;
        Boolean valueOf;
        JSONObject payNewCardConfigs2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("merchant_id", C135876cI3.LJI());
            jSONObject2.put(Constants.APP_ID, C135876cI3.LJII());
            jSONObject2.put("service", "pay_new_card");
            jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "cashdesk.wap.pay.pay_new_card");
            if (jSONObject != null) {
                String optString = jSONObject.optString("process_info");
                Intrinsics.checkNotNullExpressionValue(optString, "");
                jSONObject2.put("process_info", C135465cBQ.LIZ(optString));
                jSONObject2.put("sign_no", jSONObject.optString("sign_no"));
                jSONObject2.put("token", jSONObject.optString("pwd_token"));
            }
            Boolean bool = null;
            if (jSONObject != null) {
                if (!jSONObject.has("faceParams")) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2.put("face_verify_params", jSONObject.optJSONObject("faceParams"));
                    jSONObject2.put("req_type", "5");
                }
            }
            ICJPayNewCardCallback LIZIZ = C135876cI3.LIZIZ();
            if (LIZIZ == null || (payNewCardConfigs = LIZIZ.getPayNewCardConfigs()) == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(payNewCardConfigs.optBoolean("is_pay_after_use", false));
            }
            ICJPayNewCardCallback LIZIZ2 = C135876cI3.LIZIZ();
            if (LIZIZ2 != null && (payNewCardConfigs2 = LIZIZ2.getPayNewCardConfigs()) != null) {
                bool = Boolean.valueOf(payNewCardConfigs2.optBoolean("pay_after_use_active", false));
            }
            if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_pay_after_use", valueOf.booleanValue());
                jSONObject3.put("pay_after_use_active", bool);
                jSONObject2.put("pay_after_use_info", jSONObject3);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }
}
