package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes25.dex */
public interface TTCJPayAlipayAuthCallback {
    static {
        Covode.recordClassIndex(9298);
    }

    void onAuthResult(Map<String, String> map);
}
