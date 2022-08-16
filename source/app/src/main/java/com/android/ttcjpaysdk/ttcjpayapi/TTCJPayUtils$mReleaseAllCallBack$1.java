package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public final class TTCJPayUtils$mReleaseAllCallBack$1 implements ICJPayReleaseAll {
    public static final TTCJPayUtils$mReleaseAllCallBack$1 INSTANCE = new TTCJPayUtils$mReleaseAllCallBack$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9325);
    }

    @Override // com.android.ttcjpaysdk.ttcjpayapi.ICJPayReleaseAll
    public final void onReleaseAll() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        TTCJPayUtils.Companion.getInstance().releaseAll();
    }
}
