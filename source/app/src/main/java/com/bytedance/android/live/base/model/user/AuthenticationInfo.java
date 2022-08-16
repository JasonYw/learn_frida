package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class AuthenticationInfo implements Parcelable {
    public static final Parcelable.Creator<AuthenticationInfo> CREATOR = new C65773BxH(AuthenticationInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("account_type_info")
    public AccountTypeInfo accountTypeInfo;
    @SerializedName("authentication_badge")
    public ImageModel authenticationBadge;
    @SerializedName("custom_verify")
    public String customVerify;
    @SerializedName("enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @SerializedName("level_list")
    public List<Integer> levelList;

    static {
        Covode.recordClassIndex(14136);
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
        parcel.writeString(this.customVerify);
        parcel.writeString(this.enterpriseVerifyReason);
        parcel.writeParcelable(this.authenticationBadge, i);
        parcel.writeList(this.levelList);
        parcel.writeParcelable(this.accountTypeInfo, i);
    }

    public AuthenticationInfo() {
    }

    public AuthenticationInfo(Parcel parcel) {
        this.customVerify = parcel.readString();
        this.enterpriseVerifyReason = parcel.readString();
        this.authenticationBadge = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.levelList = parcel.readArrayList(AuthenticationInfo.class.getClassLoader());
        this.accountTypeInfo = (AccountTypeInfo) parcel.readParcelable(AccountTypeInfo.class.getClassLoader());
    }
}
