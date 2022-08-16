package com.alipay.tscenter.biz.rpc.deviceFp;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface BugTrackMessageService {
    static {
        Covode.recordClassIndex(4954);
    }

    @OperationType("alipay.security.errorLog.collect")
    String logCollect(String str);
}
