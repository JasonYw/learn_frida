package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class FansClubMember implements Parcelable {
    public static final Parcelable.Creator<FansClubMember> CREATOR = new C65773BxH(FansClubMember.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(C2521l.LJIIL)
    public FansClubData data;
    @SerializedName("prefer_data")
    public Map<Integer, FansClubData> preferData;

    static {
        Covode.recordClassIndex(13956);
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
        parcel.writeParcelable(this.data, i);
        parcel.writeMap(this.preferData);
    }

    public FansClubMember() {
    }

    public FansClubData getData() {
        return this.data;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }

    public FansClubMember(Parcel parcel) {
        this.data = (FansClubData) parcel.readParcelable(FansClubData.class.getClassLoader());
        this.preferData = parcel.readHashMap(FansClubMember.class.getClassLoader());
    }
}
