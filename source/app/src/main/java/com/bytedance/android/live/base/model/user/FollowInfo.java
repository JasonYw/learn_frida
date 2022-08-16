package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class FollowInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FollowInfo> CREATOR = new C65773BxH(FollowInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("follow_status")
    public long followStatus;
    @SerializedName("follower_count")
    public long followerCount;
    @SerializedName("following_count")
    public long followingCount;
    @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS)
    public long pushStatus;
    @SerializedName("remark_name")
    public String remarkName;

    static {
        Covode.recordClassIndex(14147);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        parcel.writeLong(this.followingCount);
        parcel.writeLong(this.followerCount);
        parcel.writeLong(this.followStatus);
        parcel.writeString(this.remarkName);
        parcel.writeLong(this.pushStatus);
    }

    public FollowInfo() {
    }

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public int hashCode() {
        long j = this.followingCount;
        long j2 = this.followerCount;
        long j3 = this.followStatus;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public void setFollowStatus(long j) {
        this.followStatus = j;
    }

    public void setFollowerCount(long j) {
        this.followerCount = j;
    }

    public void setFollowingCount(long j) {
        this.followingCount = j;
    }

    public void setPushStatus(long j) {
        this.pushStatus = j;
    }

    public FollowInfo(Parcel parcel) {
        this.followingCount = parcel.readLong();
        this.followerCount = parcel.readLong();
        this.followStatus = parcel.readLong();
        this.remarkName = parcel.readString();
        this.pushStatus = parcel.readLong();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FollowInfo followInfo = (FollowInfo) obj;
            if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
                return true;
            }
        }
        return false;
    }
}
