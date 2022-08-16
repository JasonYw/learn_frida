package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class ListUserContent implements Parcelable {
    public static final Parcelable.Creator<ListUserContent> CREATOR = new C65773BxH(ListUserContent.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("pk_content")
    public ListUserPKContent LIZIZ;
    @SerializedName("linkmic_content")
    public ListUserLinkmicContent LIZJ;
    @SerializedName("linkmic_audience_content")
    public ListUserLinkmicAudienceContent LIZLLL;

    static {
        Covode.recordClassIndex(28141);
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
        parcel.writeParcelable(this.LIZIZ, i);
        parcel.writeParcelable(this.LIZJ, i);
        parcel.writeParcelable(this.LIZLLL, i);
    }

    public ListUserContent() {
    }

    public ListUserContent(Parcel parcel) {
        this.LIZIZ = (ListUserPKContent) parcel.readParcelable(ListUserPKContent.class.getClassLoader());
        this.LIZJ = (ListUserLinkmicContent) parcel.readParcelable(ListUserLinkmicContent.class.getClassLoader());
        this.LIZLLL = (ListUserLinkmicAudienceContent) parcel.readParcelable(ListUserLinkmicAudienceContent.class.getClassLoader());
    }
}
