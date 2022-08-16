package com.bytedance.android.annie.depend;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IHostNetworkDepend {
    static {
        Covode.recordClassIndex(10795);
    }

    IRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();
}
