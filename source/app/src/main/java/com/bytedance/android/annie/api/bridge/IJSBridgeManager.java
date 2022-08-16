package com.bytedance.android.annie.api.bridge;

import android.app.Activity;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13040ah;
import com.bytedance.ies.web.jsbridge2.C13042ai;
import p003X.PK0;

/* loaded from: classes7.dex */
public interface IJSBridgeManager {
    static {
        Covode.recordClassIndex(10453);
    }

    Activity getActivity();

    IHybridComponent getHybridComponent();

    C13040ah getJSBridge2();

    C13042ai getJSBridge2IESSupport();

    <P, R> void registerMethod(String str, PK0<P, R> pk0);

    void registerMethod(String str, IJavaMethod iJavaMethod);

    void registerMethod(String str, AbstractC13049f.AbstractC13051b abstractC13051b);

    void registerMethodFromFactory(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory);

    void release();

    <T> void sendJSEvent(String str, T t);

    void unregisterFromFactory(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory);
}
