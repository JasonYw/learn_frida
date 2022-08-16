package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginInfo;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface ISecurityGuardPlugin {
    static {
        Covode.recordClassIndex(4574);
    }

    Context getContext();

    <T> T getInterface(Class<T> cls);

    IRouterComponent getRouter();

    ISGPluginInfo getSGPluginInfo();

    IRouterComponent onPluginLoaded(Context context, IRouterComponent iRouterComponent, ISGPluginInfo iSGPluginInfo, String str, Object... objArr);
}
