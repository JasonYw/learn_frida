package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.bean.ReuseHostDomain;
import com.android.ttcjpaysdk.base.service.bean.WebViewCommonConfig;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPaySettingService extends ICJPayService {
    static {
        Covode.recordClassIndex(6491);
    }

    ReuseHostDomain getHostDomain(String str);

    WebViewCommonConfig getWebViewCommonConfig();
}
