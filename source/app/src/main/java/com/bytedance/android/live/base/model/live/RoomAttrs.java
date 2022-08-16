package com.bytedance.android.live.base.model.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import p003X.AbstractC109982TRw;
import p003X.KM9;

/* loaded from: classes11.dex */
public class RoomAttrs implements AbstractC109982TRw {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_flag")
    public int adminFlag;
    @SerializedName("fanticket_this_room")
    public long currentRoomContribution;
    @SerializedName("rank_this_room")
    public int currentRoomRank;
    @SerializedName("rank")
    public int rank;
    @SerializedName("silence_flag")
    public int silenceFlag;

    static {
        Covode.recordClassIndex(14071);
    }

    @Override // p003X.AbstractC109982TRw
    public int getAdminFlag() {
        return this.adminFlag;
    }

    @Override // p003X.AbstractC109982TRw
    public int getRank() {
        return this.rank;
    }

    @Override // p003X.AbstractC109982TRw
    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i) {
        this.adminFlag = i;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setSilenceFlag(int i) {
        this.silenceFlag = i;
    }

    public static RoomAttrs from(AbstractC109982TRw abstractC109982TRw) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC109982TRw}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (RoomAttrs) proxy.result;
        }
        if (abstractC109982TRw == null) {
            return null;
        }
        if (abstractC109982TRw instanceof RoomAttrs) {
            Gson LIZ = KM9.LIZ();
            return (RoomAttrs) GsonProtectorUtils.fromJson(LIZ, GsonProtectorUtils.toJson(LIZ, abstractC109982TRw), (Class<Object>) RoomAttrs.class);
        }
        RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(abstractC109982TRw);
        return roomAttrs;
    }

    private void initWith(AbstractC109982TRw abstractC109982TRw) {
        if (PatchProxy.proxy(new Object[]{abstractC109982TRw}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.silenceFlag = abstractC109982TRw.getSilenceFlag();
        this.adminFlag = abstractC109982TRw.getAdminFlag();
        this.rank = abstractC109982TRw.getRank();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RoomAttrs roomAttrs = (RoomAttrs) obj;
            if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
                return true;
            }
        }
        return false;
    }
}
