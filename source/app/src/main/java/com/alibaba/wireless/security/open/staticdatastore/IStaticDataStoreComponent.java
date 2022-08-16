package com.alibaba.wireless.security.open.staticdatastore;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IStaticDataStoreComponent extends IComponent {
    static {
        Covode.recordClassIndex(4596);
    }

    String getAppKeyByIndex(int i, String str);

    String getExtraData(String str, String str2);

    int getKeyType(String str, String str2);
}
