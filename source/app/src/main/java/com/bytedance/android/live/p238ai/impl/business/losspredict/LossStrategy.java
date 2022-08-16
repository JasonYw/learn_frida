package com.bytedance.android.live.p238ai.impl.business.losspredict;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.losspredict.LossStrategy */
/* loaded from: classes8.dex */
public final class LossStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("quit_room")
    public final int quitRoom;
    @SerializedName("range_sec")
    public final int rangeSecond;
    public final int type;

    static {
        Covode.recordClassIndex(13885);
    }

    public LossStrategy() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ LossStrategy copy$default(LossStrategy lossStrategy, int i, int i2, int i3, int i4, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lossStrategy, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (LossStrategy) proxy.result;
        }
        if ((i4 & 1) != 0) {
            i = lossStrategy.type;
        }
        if ((i4 & 2) != 0) {
            i2 = lossStrategy.quitRoom;
        }
        if ((i4 & 4) != 0) {
            i3 = lossStrategy.rangeSecond;
        }
        return lossStrategy.copy(i, i2, i3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.type), Integer.valueOf(this.quitRoom), Integer.valueOf(this.rangeSecond)};
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.quitRoom;
    }

    public final int component3() {
        return this.rangeSecond;
    }

    public final LossStrategy copy(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (LossStrategy) proxy.result : new LossStrategy(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof LossStrategy) {
            return C106862S5w.LIZ(((LossStrategy) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LossStrategy:%s,%s,%s", getObjects());
    }

    public final int getQuitRoom() {
        return this.quitRoom;
    }

    public final int getRangeSecond() {
        return this.rangeSecond;
    }

    public final int getType() {
        return this.type;
    }

    public LossStrategy(int i, int i2, int i3) {
        this.type = i;
        this.quitRoom = i2;
        this.rangeSecond = i3;
    }

    public /* synthetic */ LossStrategy(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
