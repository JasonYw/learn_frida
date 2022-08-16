package com.benchmark.network;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ByteBenchRequest {
    public HashMap<String, String> mHeaders;
    public long mResponseLength;
    public String mUrl = "";
    public int mHttpMethod = HTTP_METHOD.GET.ordinal();
    public String mRequestBody = "";
    public String mContentType = "application/json";
    public String mMessage = "";
    public boolean mUseCommonParams = true;
    public int mCode = 0;

    static {
        Covode.recordClassIndex(9701);
    }
}
