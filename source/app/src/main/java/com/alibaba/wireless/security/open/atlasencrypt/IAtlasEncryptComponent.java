package com.alibaba.wireless.security.open.atlasencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IAtlasEncryptComponent extends IComponent {
    static {
        Covode.recordClassIndex(4568);
    }

    String atlasSafeEncrypt(String str, String str2);
}
