package com.bytedance.android.live.p238ai.impl.business.dynamicsr;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.dynamicsr.DynamicSRResult */
/* loaded from: classes28.dex */
public final class DynamicSRResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String message;
    public final SRStrategy strategy;

    static {
        Covode.recordClassIndex(13858);
    }

    public DynamicSRResult() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ DynamicSRResult copy$default(DynamicSRResult dynamicSRResult, int i, String str, SRStrategy sRStrategy, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dynamicSRResult, Integer.valueOf(i), str, sRStrategy, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DynamicSRResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = dynamicSRResult.code;
        }
        if ((i2 & 2) != 0) {
            str = dynamicSRResult.message;
        }
        if ((i2 & 4) != 0) {
            sRStrategy = dynamicSRResult.strategy;
        }
        return dynamicSRResult.copy(i, str, sRStrategy);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.code), this.message, this.strategy};
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final SRStrategy component3() {
        return this.strategy;
    }

    public final DynamicSRResult copy(int i, String str, SRStrategy sRStrategy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, sRStrategy}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DynamicSRResult) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new DynamicSRResult(i, str, sRStrategy);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DynamicSRResult) {
            return C106862S5w.LIZ(((DynamicSRResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DynamicSRResult:%s,%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final SRStrategy getStrategy() {
        return this.strategy;
    }

    public DynamicSRResult(int i, String str, SRStrategy sRStrategy) {
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
        this.strategy = sRStrategy;
    }

    public /* synthetic */ DynamicSRResult(int i, String str, SRStrategy sRStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : sRStrategy);
    }
}
