package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes28.dex */
public class InviteListUserInfo implements Parcelable {
    public static final Parcelable.Creator<InviteListUserInfo> CREATOR = new C65773BxH(InviteListUserInfo.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("last_7_days_gift_count_text")
    public String LIZIZ;

    static {
        Covode.recordClassIndex(29397);
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
        parcel.writeString(this.LIZIZ);
    }

    public InviteListUserInfo() {
    }

    public InviteListUserInfo(Parcel parcel) {
        this.LIZIZ = parcel.readString();
    }
}
