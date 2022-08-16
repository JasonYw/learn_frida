package com.bytedance.android.live.p238ai.impl.business.resolution;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.resolution.ResolutionResult */
/* loaded from: classes8.dex */
public final class ResolutionResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String message;
    public final PredictResolutionStrategy strategy;

    static {
        Covode.recordClassIndex(13891);
    }

    public ResolutionResult() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ResolutionResult copy$default(ResolutionResult resolutionResult, int i, String str, PredictResolutionStrategy predictResolutionStrategy, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resolutionResult, Integer.valueOf(i), str, predictResolutionStrategy, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ResolutionResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = resolutionResult.code;
        }
        if ((i2 & 2) != 0) {
            str = resolutionResult.message;
        }
        if ((i2 & 4) != 0) {
            predictResolutionStrategy = resolutionResult.strategy;
        }
        return resolutionResult.copy(i, str, predictResolutionStrategy);
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

    public final PredictResolutionStrategy component3() {
        return this.strategy;
    }

    public final ResolutionResult copy(int i, String str, PredictResolutionStrategy predictResolutionStrategy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, predictResolutionStrategy}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ResolutionResult) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new ResolutionResult(i, str, predictResolutionStrategy);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResolutionResult) {
            return C106862S5w.LIZ(((ResolutionResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ResolutionResult:%s,%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PredictResolutionStrategy getStrategy() {
        return this.strategy;
    }

    public ResolutionResult(int i, String str, PredictResolutionStrategy predictResolutionStrategy) {
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
        this.strategy = predictResolutionStrategy;
    }

    public /* synthetic */ ResolutionResult(int i, String str, PredictResolutionStrategy predictResolutionStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : predictResolutionStrategy);
    }
}
