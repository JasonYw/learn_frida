package com.bytedance.android.live.p238ai.impl.business.gamePrediction;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.gamePrediction.GamePredictResultStrategy */
/* loaded from: classes.dex */
public final class GamePredictResultStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("type")
    public final int type;
    @SerializedName("value")
    public final Map<String, Float> value;

    static {
        Covode.recordClassIndex(13872);
    }

    public GamePredictResultStrategy() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ GamePredictResultStrategy copy$default(GamePredictResultStrategy gamePredictResultStrategy, int i, Map map, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gamePredictResultStrategy, Integer.valueOf(i), map, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (GamePredictResultStrategy) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = gamePredictResultStrategy.type;
        }
        if ((i2 & 2) != 0) {
            map = gamePredictResultStrategy.value;
        }
        return gamePredictResultStrategy.copy(i, map);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.type), this.value};
    }

    public final int component1() {
        return this.type;
    }

    public final Map<String, Float> component2() {
        return this.value;
    }

    public final GamePredictResultStrategy copy(int i, Map<String, Float> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), map}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (GamePredictResultStrategy) proxy.result : new GamePredictResultStrategy(i, map);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof GamePredictResultStrategy) {
            return C106862S5w.LIZ(((GamePredictResultStrategy) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GamePredictResultStrategy:%s,%s", getObjects());
    }

    public final int getType() {
        return this.type;
    }

    public final Map<String, Float> getValue() {
        return this.value;
    }

    public GamePredictResultStrategy(int i, Map<String, Float> map) {
        this.type = i;
        this.value = map;
    }

    public /* synthetic */ GamePredictResultStrategy(int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new LinkedHashMap() : map);
    }
}
