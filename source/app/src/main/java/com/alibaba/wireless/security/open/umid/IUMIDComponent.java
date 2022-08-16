package com.alibaba.wireless.security.open.umid;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IUMIDComponent extends IComponent {
    static {
        Covode.recordClassIndex(4598);
    }

    String getSecurityToken();

    String getSecurityToken(int i);

    void initUMID();

    void initUMID(int i, IUMIDInitListenerEx iUMIDInitListenerEx);

    void initUMID(String str, int i, String str2, IUMIDInitListenerEx iUMIDInitListenerEx);

    int initUMIDSync(int i);

    void registerInitListener(IUMIDInitListener iUMIDInitListener);

    void setEnvironment(int i);

    void setOnlineHost(String str);
}
