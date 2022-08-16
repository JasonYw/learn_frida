package com.bytedance.android.live.p238ai.impl.business.dynamicsr;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.dynamicsr.SRStrategy */
/* loaded from: classes28.dex */
public final class SRStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cache_count")
    public final int cacheCount;
    @SerializedName("super_resolution")
    public final int superResolution;
    public final int type;

    static {
        Covode.recordClassIndex(13860);
    }

    public SRStrategy() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ SRStrategy copy$default(SRStrategy sRStrategy, int i, int i2, int i3, int i4, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sRStrategy, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (SRStrategy) proxy.result;
        }
        if ((i4 & 1) != 0) {
            i = sRStrategy.superResolution;
        }
        if ((i4 & 2) != 0) {
            i2 = sRStrategy.type;
        }
        if ((i4 & 4) != 0) {
            i3 = sRStrategy.cacheCount;
        }
        return sRStrategy.copy(i, i2, i3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.superResolution), Integer.valueOf(this.type), Integer.valueOf(this.cacheCount)};
    }

    public final int component1() {
        return this.superResolution;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.cacheCount;
    }

    public final SRStrategy copy(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (SRStrategy) proxy.result : new SRStrategy(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SRStrategy) {
            return C106862S5w.LIZ(((SRStrategy) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SRStrategy:%s,%s,%s", getObjects());
    }

    public final int getCacheCount() {
        return this.cacheCount;
    }

    public final int getSuperResolution() {
        return this.superResolution;
    }

    public final int getType() {
        return this.type;
    }

    public SRStrategy(int i, int i2, int i3) {
        this.superResolution = i;
        this.type = i2;
        this.cacheCount = i3;
    }

    public /* synthetic */ SRStrategy(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
