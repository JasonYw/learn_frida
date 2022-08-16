package com.bytedance.android.live.broadcast.download.p262ai;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.download.ai.AiIntroStatus */
/* loaded from: classes5.dex */
public final class AiIntroStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("game")
    public final int gameStatus;
    @SerializedName("prop")
    public final int propStatus;
    @SerializedName("reserve")
    public final int reserveStatus;

    static {
        Covode.recordClassIndex(15538);
    }

    public AiIntroStatus() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ AiIntroStatus copy$default(AiIntroStatus aiIntroStatus, int i, int i2, int i3, int i4, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{aiIntroStatus, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AiIntroStatus) proxy.result;
        }
        if ((i4 & 1) != 0) {
            i = aiIntroStatus.gameStatus;
        }
        if ((i4 & 2) != 0) {
            i2 = aiIntroStatus.propStatus;
        }
        if ((i4 & 4) != 0) {
            i3 = aiIntroStatus.reserveStatus;
        }
        return aiIntroStatus.copy(i, i2, i3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.gameStatus), Integer.valueOf(this.propStatus), Integer.valueOf(this.reserveStatus)};
    }

    public final int component1() {
        return this.gameStatus;
    }

    public final int component2() {
        return this.propStatus;
    }

    public final int component3() {
        return this.reserveStatus;
    }

    public final AiIntroStatus copy(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (AiIntroStatus) proxy.result : new AiIntroStatus(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AiIntroStatus) {
            return C106862S5w.LIZ(((AiIntroStatus) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AiIntroStatus:%s,%s,%s", getObjects());
    }

    public final int getGameStatus() {
        return this.gameStatus;
    }

    public final int getPropStatus() {
        return this.propStatus;
    }

    public final int getReserveStatus() {
        return this.reserveStatus;
    }

    public AiIntroStatus(int i, int i2, int i3) {
        this.gameStatus = i;
        this.propStatus = i2;
        this.reserveStatus = i3;
    }

    public /* synthetic */ AiIntroStatus(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
