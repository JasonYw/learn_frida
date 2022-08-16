package com.android.ttcjpaysdk.bindcard.base.p140a;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C135734cFl;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.a.e */
/* loaded from: classes17.dex */
public final class C2202e implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public CJPayHostInfo LIZIZ;
    public JSONObject LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25468LJ;
    public String LJFF;
    public boolean LJI;

    static {
        Covode.recordClassIndex(6991);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZ("wallet_modify_password_forget_click", null);
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        int i;
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 6).isSupported) {
            return;
        }
        JSONObject LIZLLL = C135734cFl.LIZLLL();
        Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
        try {
            if (this.LJI) {
                String str2 = this.LJFF;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZLLL.put("activity_info", new JSONArray(str2));
            }
            if (this.LJI) {
                i = 1;
            } else {
                i = 0;
            }
            LIZLLL.put("is_onestep", i);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    LIZLLL.put(next, jSONObject.getString(next));
                }
            }
            JSONObject[] jSONObjectArr = new JSONObject[2];
            JSONObject jSONObject2 = this.LIZJ;
            if (jSONObject2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            jSONObjectArr[0] = jSONObject2;
            jSONObjectArr[1] = LIZLLL;
            C135734cFl.LIZ(str, jSONObjectArr);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            if (str != null) {
                jSONObject.put("error_code", str);
            }
            if (str2 != null) {
                jSONObject.put(PushMessageHelper.ERROR_MESSAGE, str2);
            }
            LIZ("wallet_modify_password_result", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
