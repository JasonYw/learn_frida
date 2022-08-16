package com.byted.mgl.service.api.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.service.IBdpService;
import com.bytedance.minigame.serviceapi.hostimpl.hostmethod.BdpHostMethodCallback;
import com.bytedance.minigame.serviceapi.hostimpl.hostmethod.BdpHostMethodResult;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public interface AMglInvCallerService extends IBdpService {
    static {
        Covode.recordClassIndex(9790);
    }

    BdpHostMethodResult callHostMethodInMainProc(String str, JSONObject jSONObject);

    void callHostMethodInMainProc(String str, JSONObject jSONObject, BdpHostMethodCallback bdpHostMethodCallback);

    void dispatchHostEvent(String str, JSONObject jSONObject);

    String getDeviceId();

    String getInstallId();

    JSONObject getSettings(String str);
}
