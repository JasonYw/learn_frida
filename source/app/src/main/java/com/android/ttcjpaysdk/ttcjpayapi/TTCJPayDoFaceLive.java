package com.android.ttcjpaysdk.ttcjpayapi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface TTCJPayDoFaceLive {

    /* loaded from: classes8.dex */
    public interface TTCJPayFaceLiveCallback {
        static {
            Covode.recordClassIndex(9300);
        }

        void onResult(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(9299);
    }

    void doFaceLive(Activity activity, Map<String, String> map, TTCJPayFaceLiveCallback tTCJPayFaceLiveCallback);
}
