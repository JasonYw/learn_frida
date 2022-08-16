package com.bytedance.android.live.p238ai.impl.business.losspredict;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.business.losspredict.RoomLossPredictResult */
/* loaded from: classes8.dex */
public final class RoomLossPredictResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    @SerializedName("is_exit")
    public final Boolean isExit;
    public final String message;
    @SerializedName("room_id")
    public final Long roomId;
    public final LossStrategy strategy;

    static {
        Covode.recordClassIndex(13886);
    }

    public RoomLossPredictResult() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RoomLossPredictResult copy$default(RoomLossPredictResult roomLossPredictResult, int i, String str, LossStrategy lossStrategy, Boolean bool, Long l, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{roomLossPredictResult, Integer.valueOf(i), str, lossStrategy, bool, l, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (RoomLossPredictResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = roomLossPredictResult.code;
        }
        if ((i2 & 2) != 0) {
            str = roomLossPredictResult.message;
        }
        if ((i2 & 4) != 0) {
            lossStrategy = roomLossPredictResult.strategy;
        }
        if ((i2 & 8) != 0) {
            bool = roomLossPredictResult.isExit;
        }
        if ((i2 & 16) != 0) {
            l = roomLossPredictResult.roomId;
        }
        return roomLossPredictResult.copy(i, str, lossStrategy, bool, l);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.code), this.message, this.strategy, this.isExit, this.roomId};
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final LossStrategy component3() {
        return this.strategy;
    }

    public final Boolean component4() {
        return this.isExit;
    }

    public final Long component5() {
        return this.roomId;
    }

    public final RoomLossPredictResult copy(int i, String str, LossStrategy lossStrategy, Boolean bool, Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, lossStrategy, bool, l}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (RoomLossPredictResult) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new RoomLossPredictResult(i, str, lossStrategy, bool, l);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoomLossPredictResult) {
            return C106862S5w.LIZ(((RoomLossPredictResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RoomLossPredictResult:%s,%s,%s,%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final LossStrategy getStrategy() {
        return this.strategy;
    }

    public final Boolean isExit() {
        return this.isExit;
    }

    public RoomLossPredictResult(int i, String str, LossStrategy lossStrategy, Boolean bool, Long l) {
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
        this.strategy = lossStrategy;
        this.isExit = bool;
        this.roomId = l;
    }

    public /* synthetic */ RoomLossPredictResult(int i, String str, LossStrategy lossStrategy, Boolean bool, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : lossStrategy, (i2 & 8) != 0 ? null : bool, (i2 & 16) == 0 ? l : null);
    }
}
