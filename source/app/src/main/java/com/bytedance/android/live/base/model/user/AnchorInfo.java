package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class AnchorInfo implements Parcelable {
    public static final Parcelable.Creator<AnchorInfo> CREATOR = new C65773BxH(AnchorInfo.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("level")
    public long LIZIZ;
    @SerializedName("type")
    public long LIZJ;

    static {
        Covode.recordClassIndex(14134);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        parcel.writeLong(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
    }

    public AnchorInfo() {
    }

    public int hashCode() {
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public AnchorInfo(Parcel parcel) {
        this.LIZIZ = parcel.readLong();
        this.LIZJ = parcel.readLong();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            if (this.LIZIZ == anchorInfo.LIZIZ && this.LIZJ == anchorInfo.LIZJ) {
                return true;
            }
        }
        return false;
    }
}
