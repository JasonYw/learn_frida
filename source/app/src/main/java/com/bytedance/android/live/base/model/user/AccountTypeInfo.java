package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class AccountTypeInfo implements Parcelable {
    public static final Parcelable.Creator<AccountTypeInfo> CREATOR = new C65773BxH(AccountTypeInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("account_type_map")
    public Map<Long, Boolean> typeMap;

    static {
        Covode.recordClassIndex(14126);
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
        parcel.writeMap(this.typeMap);
    }

    public AccountTypeInfo() {
    }

    public AccountTypeInfo(Parcel parcel) {
        this.typeMap = parcel.readHashMap(AccountTypeInfo.class.getClassLoader());
    }
}
