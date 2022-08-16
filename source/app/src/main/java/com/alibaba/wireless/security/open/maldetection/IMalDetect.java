package com.alibaba.wireless.security.open.maldetection;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "securitybody")
/* loaded from: classes2.dex */
public interface IMalDetect extends IComponent {

    /* loaded from: classes2.dex */
    public interface ICallBack {
        static {
            Covode.recordClassIndex(4585);
        }

        void onDetection(int i, String str, String str2);
    }

    static {
        Covode.recordClassIndex(4584);
    }

    void registerCallBack(ICallBack iCallBack);

    void unregisterCallBack(ICallBack iCallBack);
}
