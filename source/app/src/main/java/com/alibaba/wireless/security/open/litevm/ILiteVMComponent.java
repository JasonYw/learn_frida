package com.alibaba.wireless.security.open.litevm;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface ILiteVMComponent extends IComponent {
    static {
        Covode.recordClassIndex(4579);
    }

    byte[] callLiteVMByteMethod(LiteVMInstance liteVMInstance, int i, LiteVMParameterWrapper[] liteVMParameterWrapperArr);

    long callLiteVMLongMethod(LiteVMInstance liteVMInstance, int i, LiteVMParameterWrapper[] liteVMParameterWrapperArr);

    String callLiteVMStringMethod(LiteVMInstance liteVMInstance, int i, LiteVMParameterWrapper[] liteVMParameterWrapperArr);

    void callLiteVMVoidMethod(LiteVMInstance liteVMInstance, int i, LiteVMParameterWrapper[] liteVMParameterWrapperArr);

    LiteVMInstance createLiteVMInstance(String str, String str2, byte[] bArr, Object[] objArr);

    void destroyLiteVMInstance(LiteVMInstance liteVMInstance);

    void reloadLiteVMInstance(LiteVMInstance liteVMInstance, byte[] bArr);
}
