package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes25.dex */
public interface ICJPayXBridgeCallback {
    static {
        Covode.recordClassIndex(9287);
    }

    void fail(Map<String, Object> map);

    void success(Map<String, Object> map);
}
