package com.alibaba.wireless.security.open.simulatordetect;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "securitybody")
/* loaded from: classes2.dex */
public interface ISimulatorDetectComponent extends IComponent {
    static {
        Covode.recordClassIndex(4594);
    }

    boolean isSimulator();
}
