package com.alibaba.wireless.security.open;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IComponent {
    static {
        Covode.recordClassIndex(4563);
    }

    int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr);
}
