package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class ActivityRewardInfo implements Parcelable {
    public static final Parcelable.Creator<ActivityRewardInfo> CREATOR = new C65773BxH(ActivityRewardInfo.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("Badge")
    public ImageModel LIZIZ;
    @SerializedName("StoryTag")
    public ImageModel LIZJ;

    static {
        Covode.recordClassIndex(14132);
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
    }

    public ActivityRewardInfo() {
    }

    public ActivityRewardInfo(Parcel parcel) {
        this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LIZJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
    }
}
