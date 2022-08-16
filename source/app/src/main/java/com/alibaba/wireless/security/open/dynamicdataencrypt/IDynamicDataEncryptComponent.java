package com.alibaba.wireless.security.open.dynamicdataencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IDynamicDataEncryptComponent extends IComponent {
    static {
        Covode.recordClassIndex(4570);
    }

    String dynamicDecrypt(String str);

    byte[] dynamicDecryptByteArray(byte[] bArr);

    byte[] dynamicDecryptByteArrayDDp(byte[] bArr);

    String dynamicDecryptDDp(String str);

    String dynamicEncrypt(String str);

    byte[] dynamicEncryptByteArray(byte[] bArr);

    byte[] dynamicEncryptByteArrayDDp(byte[] bArr);

    String dynamicEncryptDDp(String str);
}
