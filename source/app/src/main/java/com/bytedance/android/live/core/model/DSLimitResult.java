package com.bytedance.android.live.core.model;

import com.bytedance.android.live.core.model.profit.DSLimitCalmPeriod;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class DSLimitResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("calm_period")
    public DSLimitCalmPeriod calmPeriod;

    static {
        Covode.recordClassIndex(23481);
    }

    public DSLimitCalmPeriod getCalmPeriod() {
        return this.calmPeriod;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "DSLimitResult{calmPeriod=" + this.calmPeriod + '}';
    }

    public void setCalmPeriod(DSLimitCalmPeriod dSLimitCalmPeriod) {
        this.calmPeriod = dSLimitCalmPeriod;
    }
}
