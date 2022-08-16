package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayPerformanceService extends ICJPayService {
    static {
        Covode.recordClassIndex(6479);
    }

    void endKeepPage(String str);

    void init(Context context);

    void initModule(String str);

    boolean isInstallApmMonitor();

    boolean isInstallAppLog();

    void onApmMonitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void onAppLogEvent(String str, JSONObject jSONObject);

    void startFpsTrace(String str, boolean z);

    void startFpsTraceForDelayStop(String str, boolean z, long j);

    void startKeepPage(String str);

    void stopFpsTrace(String str);
}
