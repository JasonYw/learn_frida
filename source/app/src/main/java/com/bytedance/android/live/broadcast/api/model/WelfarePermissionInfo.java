package com.bytedance.android.live.broadcast.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes12.dex */
public class WelfarePermissionInfo implements Parcelable {
    public static final Parcelable.Creator<WelfarePermissionInfo> CREATOR = new Parcelable.Creator<WelfarePermissionInfo>() { // from class: com.bytedance.android.live.broadcast.api.model.WelfarePermissionInfo.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(14525);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WelfarePermissionInfo[] newArray(int i) {
            return new WelfarePermissionInfo[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.api.model.WelfarePermissionInfo] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WelfarePermissionInfo createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new WelfarePermissionInfo(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("available")
    public boolean available;
    @SerializedName("setting_page_url")
    public String settingPageUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WelfarePermissionInfo() {
    }

    static {
        Covode.recordClassIndex(14524);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "WelfarePermissionInfo{available=" + this.available + ", settingPageUrl='" + this.settingPageUrl + "'}";
    }

    public WelfarePermissionInfo(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.available = z;
        this.settingPageUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeByte(this.available ? (byte) 1 : (byte) 0);
        parcel.writeString(this.settingPageUrl);
    }
}
