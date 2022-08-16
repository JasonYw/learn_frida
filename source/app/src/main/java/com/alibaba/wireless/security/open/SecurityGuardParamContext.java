package com.alibaba.wireless.security.open;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SecurityGuardParamContext {
    public String appKey;
    public Map<String, String> paramMap = new HashMap();
    public int requestType;
    public String reserved1;
    public String reserved2;

    static {
        Covode.recordClassIndex(4567);
    }
}
