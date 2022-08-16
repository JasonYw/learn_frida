package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class MiniGame implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("game_id")
    public String gameId;
    @SerializedName("name")
    public String name;

    static {
        Covode.recordClassIndex(14498);
    }

    public MiniGame() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MiniGame copy$default(MiniGame miniGame, String str, String str2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{miniGame, str, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (MiniGame) proxy.result;
        }
        if ((i & 1) != 0) {
            str = miniGame.gameId;
        }
        if ((i & 2) != 0) {
            str2 = miniGame.name;
        }
        return miniGame.copy(str, str2);
    }

    private Object[] getObjects() {
        return new Object[]{this.gameId, this.name};
    }

    public final String component1() {
        return this.gameId;
    }

    public final String component2() {
        return this.name;
    }

    public final MiniGame copy(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (MiniGame) proxy.result : new MiniGame(str, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof MiniGame) {
            return C106862S5w.LIZ(((MiniGame) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MiniGame:%s,%s", getObjects());
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getName() {
        return this.name;
    }

    public final void setGameId(String str) {
        this.gameId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public MiniGame(String str, String str2) {
        this.gameId = str;
        this.name = str2;
    }

    public /* synthetic */ MiniGame(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
