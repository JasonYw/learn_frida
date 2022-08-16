package cn.ever.cloud.utils.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: cn.ever.cloud.utils.monitor.a */
/* loaded from: classes23.dex */
public interface AbstractC0764a {
    static {
        Covode.recordClassIndex(3511);
    }

    void ensureNotNull(Object obj);

    void ensureNotReachHere(String str);

    void onEvent(String str, JSONObject jSONObject);

    void onSendMonitor(String str, JSONObject jSONObject, JSONObject jSONObject2);
}
