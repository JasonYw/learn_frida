package com.benchmark.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;

/* loaded from: classes8.dex */
public class ByteBenchResponse {
    public int mHttpCode = SDKMonitor.SDK_VERSION;
    public String mData = "";
    public int mErrorCode = -1;
    public String mMessage = "";

    static {
        Covode.recordClassIndex(9702);
    }
}
