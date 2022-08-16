package com.alibaba.alibclinkpartner.simple.data;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.alibclinkpartner.simple.AbstractC1008a;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public class ALPCallbackInfo {
    public AbstractC1008a callback;
    public String packageName;
    public String pluginRule;
    public long timeStamp;

    static {
        Covode.recordClassIndex(4323);
    }

    public boolean isDataMatch(String str, String str2) {
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.packageName) && !TextUtils.isEmpty(str2) && this.packageName.equals(str) && this.pluginRule.equals(str2);
    }

    public void onError(int i) {
        AbstractC1008a abstractC1008a = this.callback;
        if (abstractC1008a != null) {
            abstractC1008a.m20013a(i);
        }
    }

    public void onSuccess(int i, Bundle bundle) {
        AbstractC1008a abstractC1008a = this.callback;
        if (abstractC1008a != null) {
            abstractC1008a.m20012a(i, bundle);
        }
    }
}
