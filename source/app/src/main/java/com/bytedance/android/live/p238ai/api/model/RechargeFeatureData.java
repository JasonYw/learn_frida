package com.bytedance.android.live.p238ai.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.api.model.RechargeFeatureData */
/* loaded from: classes.dex */
public final class RechargeFeatureData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long balance;
    public ArrayList<Long> dealList;

    static {
        Covode.recordClassIndex(13836);
    }

    public static /* synthetic */ RechargeFeatureData copy$default(RechargeFeatureData rechargeFeatureData, long j, ArrayList arrayList, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{rechargeFeatureData, new Long(j), arrayList, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (RechargeFeatureData) proxy.result;
        }
        if ((i & 1) != 0) {
            j = rechargeFeatureData.balance;
        }
        if ((i & 2) != 0) {
            arrayList = rechargeFeatureData.dealList;
        }
        return rechargeFeatureData.copy(j, arrayList);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.balance), this.dealList};
    }

    public final long component1() {
        return this.balance;
    }

    public final ArrayList<Long> component2() {
        return this.dealList;
    }

    public final RechargeFeatureData copy(long j, ArrayList<Long> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), arrayList}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (RechargeFeatureData) proxy.result;
        }
        C106862S5w.LIZ(arrayList);
        return new RechargeFeatureData(j, arrayList);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof RechargeFeatureData) {
            return C106862S5w.LIZ(((RechargeFeatureData) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RechargeFeatureData:%s,%s", getObjects());
    }

    public final long getBalance() {
        return this.balance;
    }

    public final ArrayList<Long> getDealList() {
        return this.dealList;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setDealList(ArrayList<Long> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        this.dealList = arrayList;
    }

    public RechargeFeatureData(long j, ArrayList<Long> arrayList) {
        C106862S5w.LIZ(arrayList);
        this.balance = j;
        this.dealList = arrayList;
    }
}
