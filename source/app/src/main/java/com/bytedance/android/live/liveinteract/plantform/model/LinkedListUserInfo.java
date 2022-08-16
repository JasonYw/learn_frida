package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class LinkedListUserInfo implements Parcelable {
    public static final Parcelable.Creator<LinkedListUserInfo> CREATOR = new C65773BxH(LinkedListUserInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("current_time")
    public long currentTime;
    @SerializedName("expected_leave_time")
    public long expectLeaveTime;
    @SerializedName("join_channel_time")
    public long joinChannelTime;

    static {
        Covode.recordClassIndex(29400);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        parcel.writeLong(this.joinChannelTime);
        parcel.writeLong(this.expectLeaveTime);
        parcel.writeLong(this.currentTime);
    }

    public LinkedListUserInfo() {
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LinkedListUserInfo{joinChannelTime=" + this.joinChannelTime + ", expectLeaveTime=" + this.expectLeaveTime + ", currentTime=" + this.currentTime + '}';
    }

    public LinkedListUserInfo(Parcel parcel) {
        this.joinChannelTime = parcel.readLong();
        this.expectLeaveTime = parcel.readLong();
        this.currentTime = parcel.readLong();
    }

    public boolean same(LinkedListUserInfo linkedListUserInfo) {
        if (linkedListUserInfo == null || this.joinChannelTime != linkedListUserInfo.joinChannelTime || this.expectLeaveTime != linkedListUserInfo.expectLeaveTime || this.currentTime != linkedListUserInfo.currentTime) {
            return false;
        }
        return true;
    }

    public static LinkedListUserInfo copy(long j, long j2, long j3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3)}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (LinkedListUserInfo) proxy.result;
        }
        LinkedListUserInfo linkedListUserInfo = new LinkedListUserInfo();
        linkedListUserInfo.joinChannelTime = j;
        linkedListUserInfo.expectLeaveTime = j2;
        linkedListUserInfo.currentTime = j3;
        return linkedListUserInfo;
    }
}
