package com.bytedance.android.live.p238ai.impl.business.resolution;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.resolution.PredictResolutionStrategy */
/* loaded from: classes8.dex */
public final class PredictResolutionStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_changed")
    public final int is_changed;
    @SerializedName("predict_resolution")
    public final String predict_resolution;
    @SerializedName("room_id")
    public final String room_id;
    @SerializedName("type")
    public final int type;

    static {
        Covode.recordClassIndex(13890);
    }

    public PredictResolutionStrategy() {
        this(0, null, null, 0, 15, null);
    }

    public static /* synthetic */ PredictResolutionStrategy copy$default(PredictResolutionStrategy predictResolutionStrategy, int i, String str, String str2, int i2, int i3, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{predictResolutionStrategy, Integer.valueOf(i), str, str2, Integer.valueOf(i2), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PredictResolutionStrategy) proxy.result;
        }
        if ((i3 & 1) != 0) {
            i = predictResolutionStrategy.type;
        }
        if ((i3 & 2) != 0) {
            str = predictResolutionStrategy.room_id;
        }
        if ((i3 & 4) != 0) {
            str2 = predictResolutionStrategy.predict_resolution;
        }
        if ((i3 & 8) != 0) {
            i2 = predictResolutionStrategy.is_changed;
        }
        return predictResolutionStrategy.copy(i, str, str2, i2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.type), this.room_id, this.predict_resolution, Integer.valueOf(this.is_changed)};
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.room_id;
    }

    public final String component3() {
        return this.predict_resolution;
    }

    public final int component4() {
        return this.is_changed;
    }

    public final PredictResolutionStrategy copy(int i, String str, String str2, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PredictResolutionStrategy) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new PredictResolutionStrategy(i, str, str2, i2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PredictResolutionStrategy) {
            return C106862S5w.LIZ(((PredictResolutionStrategy) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PredictResolutionStrategy:%s,%s,%s,%s", getObjects());
    }

    public final String getPredict_resolution() {
        return this.predict_resolution;
    }

    public final String getRoom_id() {
        return this.room_id;
    }

    public final int getType() {
        return this.type;
    }

    public final int is_changed() {
        return this.is_changed;
    }

    public PredictResolutionStrategy(int i, String str, String str2, int i2) {
        C106862S5w.LIZ(str, str2);
        this.type = i;
        this.room_id = str;
        this.predict_resolution = str2;
        this.is_changed = i2;
    }

    public /* synthetic */ PredictResolutionStrategy(int i, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i2);
    }
}
