package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes11.dex */
public class CloudItemDetail extends CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItemDetail> CREATOR = new Parcelable.Creator<CloudItemDetail>() { // from class: com.amap.api.services.cloud.CloudItemDetail.1
        static {
            Covode.recordClassIndex(5667);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudItemDetail[] newArray(int i) {
            return new CloudItemDetail[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudItemDetail createFromParcel(Parcel parcel) {
            return new CloudItemDetail(parcel);
        }
    };

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(5666);
    }

    public CloudItemDetail(Parcel parcel) {
        super(parcel);
    }

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public CloudItemDetail(String str, LatLonPoint latLonPoint, String str2, String str3) {
        super(str, latLonPoint, str2, str3);
    }
}
