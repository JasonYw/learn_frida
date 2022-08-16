package com.alibaba.wireless.security.open.nocaptcha;

import android.os.Handler;
import android.view.MotionEvent;
import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

@InterfacePluginInfo(pluginName = "nocaptcha")
/* loaded from: classes2.dex */
public interface INoCaptchaComponent extends IComponent {
    public static final String token = "token";

    static {
        Covode.recordClassIndex(4586);
    }

    void initNoCaptcha(String str, String str2, int i, int i2, int i3, Handler handler, String str3);

    String noCaptchaForwardAuth(String str, HashMap<String, String> hashMap, String str2, int i);

    void noCaptchaVerification(String str);

    boolean putNoCaptchaTraceRecord(MotionEvent motionEvent);
}
