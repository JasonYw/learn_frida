package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class FansGroupInfo implements Parcelable {
    public static final Parcelable.Creator<FansGroupInfo> CREATOR = new C65773BxH(FansGroupInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("list_fans_group_url")
    public String fansGroupUrl;

    static {
        Covode.recordClassIndex(14146);
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
        parcel.writeString(this.fansGroupUrl);
    }

    public FansGroupInfo() {
    }

    public FansGroupInfo(Parcel parcel) {
        this.fansGroupUrl = parcel.readString();
    }
}
