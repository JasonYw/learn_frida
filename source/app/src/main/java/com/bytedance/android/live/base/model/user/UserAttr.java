package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class UserAttr implements Parcelable {
    public static final Parcelable.Creator<UserAttr> CREATOR = new C65773BxH(UserAttr.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("is_muted")
    public boolean LIZIZ;
    @SerializedName("is_admin")
    public boolean LIZJ;
    @SerializedName("admin_privileges")
    public List<Integer> LIZLLL;

    static {
        Covode.recordClassIndex(14190);
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
        parcel.writeByte(this.LIZIZ ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LIZJ ? (byte) 1 : (byte) 0);
        parcel.writeList(this.LIZLLL);
    }

    public UserAttr() {
    }

    public int hashCode() {
        return ((this.LIZIZ ? 1 : 0) * 31) + (this.LIZJ ? 1 : 0);
    }

    public UserAttr(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        this.LIZJ = parcel.readByte() == 0 ? false : z2;
        this.LIZLLL = parcel.readArrayList(UserAttr.class.getClassLoader());
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
            UserAttr userAttr = (UserAttr) obj;
            if (this.LIZIZ == userAttr.LIZIZ && this.LIZJ == userAttr.LIZJ) {
                return true;
            }
        }
        return false;
    }
}
