package com.alibaba.wireless.security.jaq;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class SecurityInit {
    static {
        Covode.recordClassIndex(4560);
    }

    public static int Initialize(Context context) {
        try {
            return SecurityGuardManager.getInitializer().initialize(context);
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public static boolean setGlobalUserData(String str, String str2) {
        try {
            return SecurityGuardManager.setGlobalUserData(str, str2);
        } catch (SecException e) {
            throw new JAQException(e.getErrorCode());
        }
    }
}
