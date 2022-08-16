package com.alibaba.wireless.security.framework;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IRouterComponent {
    static {
        Covode.recordClassIndex(4538);
    }

    Object doCommand(int i, Object... objArr);
}
