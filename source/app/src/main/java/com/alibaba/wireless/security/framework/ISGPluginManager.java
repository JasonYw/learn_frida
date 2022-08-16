package com.alibaba.wireless.security.framework;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface ISGPluginManager {
    static {
        Covode.recordClassIndex(4540);
    }

    <T> T getInterface(Class<T> cls);

    String getMainPluginName();

    ISGPluginInfo getPluginInfo(String str);

    IRouterComponent getRouter();
}
