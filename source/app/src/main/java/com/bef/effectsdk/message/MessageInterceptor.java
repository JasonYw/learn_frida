package com.bef.effectsdk.message;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public interface MessageInterceptor {
    static {
        Covode.recordClassIndex(9576);
    }

    void destroy();

    boolean intercept(Message message);
}
