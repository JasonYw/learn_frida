package com.alipay.tscenter.biz.rpc.vkeydfp.result;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes20.dex */
public class BaseResult implements Serializable {
    public String resultCode;
    public boolean success = false;

    static {
        Covode.recordClassIndex(4962);
    }
}
