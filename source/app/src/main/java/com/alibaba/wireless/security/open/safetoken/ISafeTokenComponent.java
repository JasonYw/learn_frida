package com.alibaba.wireless.security.open.safetoken;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface ISafeTokenComponent extends IComponent {
    static {
        Covode.recordClassIndex(4589);
    }

    byte[] decryptWithToken(String str, byte[] bArr, int i);

    byte[] encryptWithToken(String str, byte[] bArr, int i);

    byte[] getOtp(String str, int i, String[] strArr, byte[][] bArr);

    byte[] getOtp(String str, int i, String[] strArr, byte[][] bArr, String str2);

    boolean isTokenExisted(String str);

    void removeToken(String str);

    boolean saveToken(String str, String str2, String str3, int i);

    String signWithToken(String str, byte[] bArr, int i);
}
