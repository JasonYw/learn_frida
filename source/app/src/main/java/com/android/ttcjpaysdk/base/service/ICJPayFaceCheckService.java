package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFaceCheckService extends ICJPayService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(6429);
    }

    void dismissDialog();

    int getClientSource();

    JSONObject getFaceVerifyParams(String str, Integer num, String str2, String str3, JSONObject jSONObject, Boolean bool, String str4, String str5, String str6, String str7, String str8);

    boolean getIsSigned();

    void gotoCheckFace(Activity activity, JSONObject jSONObject);

    void gotoCheckFace(Activity activity, JSONObject jSONObject, ICJPayFaceCheckCallback iCJPayFaceCheckCallback);

    void gotoCheckFaceAgain(Activity activity, JSONObject jSONObject);

    void gotoCheckFaceAgain(Activity activity, JSONObject jSONObject, ICJPayFaceCheckCallback iCJPayFaceCheckCallback);

    void logFaceResultEvent(Context context, String str, JSONObject jSONObject);

    void release();

    void setCounterCommonParams(JSONObject jSONObject);

    void setLogParams(HashMap<String, String> hashMap);

    /* loaded from: classes17.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        static {
            Covode.recordClassIndex(6431);
        }
    }

    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6432);
        }

        public static /* synthetic */ JSONObject getFaceVerifyParams$default(ICJPayFaceCheckService iCJPayFaceCheckService, String str, Integer num, String str2, String str3, JSONObject jSONObject, Boolean bool, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
            String str9 = str5;
            String str10 = str4;
            String str11 = str6;
            String str12 = str7;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iCJPayFaceCheckService, str, num, str2, str3, jSONObject, bool, str10, str9, str11, str12, str8, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            if (obj == null) {
                String str13 = "";
                if ((i & 64) != 0) {
                    str10 = str13;
                }
                if ((i & 128) != 0) {
                    str9 = str13;
                }
                if ((i & 256) != 0) {
                    str11 = str13;
                }
                if ((i & 512) != 0) {
                    str12 = str13;
                }
                if ((i & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) == 0) {
                    str13 = str8;
                }
                return iCJPayFaceCheckService.getFaceVerifyParams(str, num, str2, str3, jSONObject, bool, str10, str9, str11, str12, str13);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFaceVerifyParams");
        }
    }
}
