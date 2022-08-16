package com.benchmark.tools;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes20.dex */
public final class BXMonitor {

    /* loaded from: classes20.dex */
    public interface IMonitor {
        static {
            Covode.recordClassIndex(9739);
        }

        void monitorLog(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(9738);
    }
}
