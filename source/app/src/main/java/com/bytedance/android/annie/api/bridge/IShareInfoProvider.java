package com.bytedance.android.annie.api.bridge;

import com.bytedance.covode.number.Covode;

/* loaded from: classes12.dex */
public interface IShareInfoProvider {
    static {
        Covode.recordClassIndex(10454);
    }

    ShareInfo getShareInfo();

    void injectShareInfo(ShareInfo shareInfo);

    void refreshFromShare();
}
