package com.alibaba.wireless.security.open.statickeyencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IStaticKeyEncryptComponent extends IComponent {
    static {
        Covode.recordClassIndex(4597);
    }

    byte[] decrypt(int i, String str, byte[] bArr);

    byte[] encrypt(int i, String str, byte[] bArr);

    byte[] encryptSecretData(int i, String str, String str2);

    boolean isSecretExist(String str);

    int removeSecret(String str);

    int saveSecret(String str, byte[] bArr);
}
