package com.alibaba.wireless.security.open.securesignature;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface ISecureSignatureComponent extends IComponent {
    static {
        Covode.recordClassIndex(4590);
    }

    String getSafeCookie(String str, String str2, String str3);

    String signRequest(SecurityGuardParamContext securityGuardParamContext, String str);
}
