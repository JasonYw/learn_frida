package com.alibaba.wireless.security.open.securitybody;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

@InterfacePluginInfo(pluginName = "securitybody")
/* loaded from: classes2.dex */
public interface ISecurityBodyComponent extends IComponent {
    static {
        Covode.recordClassIndex(4592);
    }

    String getSecurityBodyDataEx(String str, String str2, String str3, HashMap<String, String> hashMap, int i, int i2);
}
