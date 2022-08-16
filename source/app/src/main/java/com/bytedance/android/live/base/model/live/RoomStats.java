package com.bytedance.android.live.base.model.live;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.AbstractC109981TRv;
import p003X.C65773BxH;
import p003X.KM9;

/* loaded from: classes11.dex */
public class RoomStats implements Parcelable, AbstractC109981TRv {
    public static final Parcelable.Creator<RoomStats> CREATOR = new C65773BxH(RoomStats.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int INT_31;
    public final int INT_32;
    @SerializedName("comment_count")
    public int commentCount;
    @SerializedName("dou_plus_promotion")
    public String douPlusPromotion;
    @SerializedName("enter_count")
    public int enterCount;
    @SerializedName("follow_count")
    public int followCount;
    @SerializedName("gift_uv_count")
    public int giftUVCount;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f25747id;
    @SerializedName("id_str")
    public String idStr;
    @SerializedName("money")
    public long money;
    @SerializedName("fan_ticket")
    public long ticket;
    @SerializedName("up_right_stats_str")
    public String topRightStr;
    @SerializedName("up_right_stats_str_complete")
    public String topRightStrComplete;
    @SerializedName("total_user")
    public int totalUser;
    @SerializedName("total_user_desp")
    public String totalUserDesp;
    @SerializedName("total_user_str")
    public String totalUserStr;
    @SerializedName("user_count_composition")
    public UserComposition userComposition;
    @SerializedName("user_count_str")
    public String userCountStr;

    static {
        Covode.recordClassIndex(14072);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        parcel.writeLong(this.f25747id);
        parcel.writeLong(this.ticket);
        parcel.writeLong(this.money);
        parcel.writeInt(this.totalUser);
        parcel.writeInt(this.followCount);
        parcel.writeInt(this.giftUVCount);
        parcel.writeParcelable(this.userComposition, i);
        parcel.writeString(this.idStr);
        parcel.writeInt(this.enterCount);
        parcel.writeString(this.totalUserDesp);
        parcel.writeString(this.douPlusPromotion);
        parcel.writeString(this.totalUserStr);
        parcel.writeString(this.userCountStr);
        parcel.writeInt(this.commentCount);
        parcel.writeString(this.topRightStr);
        parcel.writeString(this.topRightStrComplete);
        parcel.writeInt(this.INT_32);
        parcel.writeInt(this.INT_31);
    }

    /* loaded from: classes11.dex */
    public static class UserComposition implements Parcelable {
        public static final Parcelable.Creator<UserComposition> CREATOR = new C65773BxH(UserComposition.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("city")
        public double LIZIZ;
        @SerializedName("video_detail")
        public double LIZJ;
        @SerializedName("my_follow")
        public double LIZLLL;
        @SerializedName("other")

        /* renamed from: LJ */
        public double f25748LJ;

        static {
            Covode.recordClassIndex(14073);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            parcel.writeDouble(this.LIZIZ);
            parcel.writeDouble(this.LIZJ);
            parcel.writeDouble(this.LIZLLL);
            parcel.writeDouble(this.f25748LJ);
        }

        public UserComposition() {
        }

        public UserComposition(Parcel parcel) {
            this.LIZIZ = parcel.readDouble();
            this.LIZJ = parcel.readDouble();
            this.LIZLLL = parcel.readDouble();
            this.f25748LJ = parcel.readDouble();
        }
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public String getDouPlusPromotion() {
        return this.douPlusPromotion;
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    @Override // p003X.AbstractC109981TRv
    public int getFollowCount() {
        return this.followCount;
    }

    @Override // p003X.AbstractC109981TRv
    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    @Override // p003X.AbstractC109981TRv
    public long getId() {
        return this.f25747id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    @Override // p003X.AbstractC109981TRv
    public long getMoney() {
        return this.money;
    }

    @Override // p003X.AbstractC109981TRv
    public long getTicket() {
        return this.ticket;
    }

    public String getTopRightStr() {
        return this.topRightStr;
    }

    public String getTopRightStrComplete() {
        return this.topRightStrComplete;
    }

    @Override // p003X.AbstractC109981TRv
    public int getTotalUser() {
        return this.totalUser;
    }

    public String getTotalUserStr() {
        return this.totalUserStr;
    }

    public String getUserCountStr() {
        return this.userCountStr;
    }

    public RoomStats() {
        this.INT_32 = 32;
        this.INT_31 = 31;
    }

    public int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        long j = this.f25747id;
        long j2 = this.ticket;
        long j3 = this.money;
        int i2 = ((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        String str = this.idStr;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDouPlusPromotion(String str) {
        this.douPlusPromotion = str;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.f25747id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setMoney(long j) {
        this.money = j;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTopRightStr(String str) {
        this.topRightStr = str;
    }

    public void setTopRightStrComplete(String str) {
        this.topRightStrComplete = str;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setTotalUserStr(String str) {
        this.totalUserStr = str;
    }

    public void setUserCountStr(String str) {
        this.userCountStr = str;
    }

    public static RoomStats from(AbstractC109981TRv abstractC109981TRv) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC109981TRv}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (RoomStats) proxy.result;
        }
        if (abstractC109981TRv == null) {
            return null;
        }
        if (abstractC109981TRv instanceof RoomStats) {
            Gson LIZ = KM9.LIZ();
            return (RoomStats) GsonProtectorUtils.fromJson(LIZ, GsonProtectorUtils.toJson(LIZ, abstractC109981TRv), (Class<Object>) RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(abstractC109981TRv);
        return roomStats;
    }

    private void initWith(AbstractC109981TRv abstractC109981TRv) {
        if (PatchProxy.proxy(new Object[]{abstractC109981TRv}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.f25747id = abstractC109981TRv.getId();
        this.ticket = abstractC109981TRv.getTicket();
        this.money = abstractC109981TRv.getMoney();
        this.totalUser = abstractC109981TRv.getTotalUser();
        this.followCount = abstractC109981TRv.getFollowCount();
        this.giftUVCount = abstractC109981TRv.getGiftUVCount();
    }

    public RoomStats(Parcel parcel) {
        this.INT_32 = 32;
        this.INT_31 = 31;
        this.f25747id = parcel.readLong();
        this.ticket = parcel.readLong();
        this.money = parcel.readLong();
        this.totalUser = parcel.readInt();
        this.followCount = parcel.readInt();
        this.giftUVCount = parcel.readInt();
        this.userComposition = (UserComposition) parcel.readParcelable(UserComposition.class.getClassLoader());
        this.idStr = parcel.readString();
        this.enterCount = parcel.readInt();
        this.totalUserDesp = parcel.readString();
        this.douPlusPromotion = parcel.readString();
        this.totalUserStr = parcel.readString();
        this.userCountStr = parcel.readString();
        this.commentCount = parcel.readInt();
        this.topRightStr = parcel.readString();
        this.topRightStrComplete = parcel.readString();
        this.INT_32 = parcel.readInt();
        this.INT_31 = parcel.readInt();
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
            RoomStats roomStats = (RoomStats) obj;
            if (this.f25747id != roomStats.f25747id || this.ticket != roomStats.ticket || this.money != roomStats.money || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
                return false;
            }
            String str = this.idStr;
            if (str != null) {
                if (!str.equals(roomStats.idStr)) {
                    return false;
                }
            } else if (roomStats.idStr != null) {
                return false;
            }
            if (this.totalUser == roomStats.totalUser) {
                return true;
            }
        }
        return false;
    }
}
