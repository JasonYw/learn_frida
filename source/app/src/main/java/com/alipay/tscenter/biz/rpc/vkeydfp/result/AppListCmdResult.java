package com.alipay.tscenter.biz.rpc.vkeydfp.result;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes20.dex */
public class AppListCmdResult extends AppListResult implements Serializable {
    public boolean needRetry = false;

    static {
        Covode.recordClassIndex(4960);
    }
}
