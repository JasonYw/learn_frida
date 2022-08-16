package com.byted.mgl.base.api.internal;

import com.byted.mgl.base.api.internal.delegate.IDelegateIpc;
import com.byted.mgl.service.api.internal.AMglInvCallerService;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public interface IBaseInvCallerService extends AMglInvCallerService {
    static {
        Covode.recordClassIndex(9780);
    }

    IDelegateIpc getIpcDelegate();
}
