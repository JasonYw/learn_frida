package com.alibaba.wireless.security.open.opensdk;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IOpenSDKComponent extends IComponent {
    public static final byte[] OPEN_BIZ_UID = {0, 1};
    public static final byte[] OPEN_BIZ_IID = {0, 2};
    public static final byte[] OPEN_BIZ_TID = {0, 3};

    static {
        Covode.recordClassIndex(4587);
    }

    Long analyzeOpenId(String str, String str2, String str3, byte[] bArr, String str4);

    String getJumpEnv(String str, String str2, String str3, String str4, String str5);
}
