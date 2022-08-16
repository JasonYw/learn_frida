package com.alibaba.alibclinkpartner.simple.data;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class ALSLSimpleUri implements Serializable {
    public String action;
    public String backUrl;
    public String bcFlSrc;
    public String degradeH5Url;
    public ALSLdegradeType degradeType = ALSLdegradeType.H5;
    public Map<String, Object> extraParam = new HashMap();
    public String module;
    public String packageName;
    public String url;

    /* loaded from: classes13.dex */
    public enum ALSLdegradeType {
        NONE,
        H5,
        Download;

        static {
            Covode.recordClassIndex(4325);
        }
    }

    static {
        Covode.recordClassIndex(4324);
    }
}
