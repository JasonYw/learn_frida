package com.alibaba.wireless.security.open.pkgvaliditycheck;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "misc")
/* loaded from: classes2.dex */
public interface IPkgValidityCheckComponent extends IComponent {
    static {
        Covode.recordClassIndex(4588);
    }

    int checkEnvAndFiles(String... strArr);
}
