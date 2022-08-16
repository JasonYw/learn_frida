package com.alibaba.wireless.security.open.staticdataencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IStaticDataEncryptComponent extends IComponent {
    static {
        Covode.recordClassIndex(4595);
    }

    byte[] staticBinarySafeDecrypt(int i, String str, byte[] bArr, String str2);

    byte[] staticBinarySafeDecryptNoB64(int i, String str, byte[] bArr, String str2);

    byte[] staticBinarySafeEncrypt(int i, String str, byte[] bArr, String str2);

    byte[] staticBinarySafeEncryptNoB64(int i, String str, byte[] bArr, String str2);

    String staticSafeDecrypt(int i, String str, String str2, String str3);

    String staticSafeEncrypt(int i, String str, String str2, String str3);
}
