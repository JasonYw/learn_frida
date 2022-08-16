package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class WaitingListUserInfo implements Parcelable {
    public static final Parcelable.Creator<WaitingListUserInfo> CREATOR = new C65773BxH(WaitingListUserInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("application_reason")
    public String applyReason;
    @SerializedName("application_has_expired")
    public boolean hasExpired;
    @SerializedName("is_mutual_following")
    public boolean isMutualFollow;
    @SerializedName("last_7_days_gift_count_text")
    public String last7DaysGiftCountTxt;

    static {
        Covode.recordClassIndex(29414);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeByte(this.hasExpired ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMutualFollow ? (byte) 1 : (byte) 0);
        parcel.writeString(this.applyReason);
        parcel.writeString(this.last7DaysGiftCountTxt);
    }

    public WaitingListUserInfo() {
    }

    public WaitingListUserInfo(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasExpired = z;
        this.isMutualFollow = parcel.readByte() == 0 ? false : z2;
        this.applyReason = parcel.readString();
        this.last7DaysGiftCountTxt = parcel.readString();
    }
}
