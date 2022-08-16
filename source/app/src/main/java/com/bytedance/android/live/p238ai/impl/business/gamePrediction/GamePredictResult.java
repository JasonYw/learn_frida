package com.bytedance.android.live.p238ai.impl.business.gamePrediction;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.gamePrediction.GamePredictResult */
/* loaded from: classes8.dex */
public final class GamePredictResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String message;
    public final GamePredictResultStrategy strategy;

    static {
        Covode.recordClassIndex(13871);
    }

    public GamePredictResult() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ GamePredictResult copy$default(GamePredictResult gamePredictResult, int i, String str, GamePredictResultStrategy gamePredictResultStrategy, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gamePredictResult, Integer.valueOf(i), str, gamePredictResultStrategy, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (GamePredictResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = gamePredictResult.code;
        }
        if ((i2 & 2) != 0) {
            str = gamePredictResult.message;
        }
        if ((i2 & 4) != 0) {
            gamePredictResultStrategy = gamePredictResult.strategy;
        }
        return gamePredictResult.copy(i, str, gamePredictResultStrategy);
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

    public final GamePredictResultStrategy component3() {
        return this.strategy;
    }

    public final GamePredictResult copy(int i, String str, GamePredictResultStrategy gamePredictResultStrategy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, gamePredictResultStrategy}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (GamePredictResult) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new GamePredictResult(i, str, gamePredictResultStrategy);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof GamePredictResult) {
            return C106862S5w.LIZ(((GamePredictResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GamePredictResult:%s,%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final GamePredictResultStrategy getStrategy() {
        return this.strategy;
    }

    public GamePredictResult(int i, String str, GamePredictResultStrategy gamePredictResultStrategy) {
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
        this.strategy = gamePredictResultStrategy;
    }

    public /* synthetic */ GamePredictResult(int i, String str, GamePredictResultStrategy gamePredictResultStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : gamePredictResultStrategy);
    }
}
