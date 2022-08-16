package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class LastRoomInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_room_id")
    public Integer roomId;
    @SerializedName("last_room_id_str")
    public String roomIdStr;

    static {
        Covode.recordClassIndex(14495);
    }

    public LastRoomInfo() {
        this(null, null, 3);
    }

    private Object[] LIZ() {
        return new Object[]{this.roomId, this.roomIdStr};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof LastRoomInfo) {
            return C106862S5w.LIZ(((LastRoomInfo) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LastRoomInfo:%s,%s", LIZ());
    }

    public LastRoomInfo(Integer num, String str) {
        this.roomId = num;
        this.roomIdStr = str;
    }

    public /* synthetic */ LastRoomInfo(Integer num, String str, int i) {
        this(null, null);
    }
}
