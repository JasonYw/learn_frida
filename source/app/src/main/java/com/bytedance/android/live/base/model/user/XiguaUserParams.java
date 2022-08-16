package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.MiPushMessage;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class XiguaUserParams implements Parcelable {
    public static final Parcelable.Creator<XiguaUserParams> CREATOR = new C65773BxH(XiguaUserParams.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user_auth_info")
    public String LIZIZ;
    @SerializedName("ugc_publish_media_id")
    public long LIZJ;
    @SerializedName("media_id")
    public long LIZLLL;
    @SerializedName("author_desc")

    /* renamed from: LJ */
    public String f25763LJ;
    @SerializedName(MiPushMessage.KEY_DESC)
    public String LJFF;
    @SerializedName("user_verified")
    public boolean LJI;
    @SerializedName("user_extend_info")
    public UserExtendInfo LJII;

    static {
        Covode.recordClassIndex(14195);
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
        parcel.writeString(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeLong(this.LIZLLL);
        parcel.writeString(this.f25763LJ);
        parcel.writeString(this.LJFF);
        parcel.writeByte(this.LJI ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.LJII, i);
    }

    /* loaded from: classes11.dex */
    public static class RocketSchema implements Parcelable {
        public static final Parcelable.Creator<RocketSchema> CREATOR = new C65773BxH(RocketSchema.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("r_schema")
        public String LIZIZ;
        @SerializedName("r_token")
        public String LIZJ;
        @SerializedName("download_url")
        public String LIZLLL;

        static {
            Covode.recordClassIndex(14196);
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
            parcel.writeString(this.LIZIZ);
            parcel.writeString(this.LIZJ);
            parcel.writeString(this.LIZLLL);
        }

        public RocketSchema() {
        }

        public RocketSchema(Parcel parcel) {
            this.LIZIZ = parcel.readString();
            this.LIZJ = parcel.readString();
            this.LIZLLL = parcel.readString();
        }
    }

    /* loaded from: classes11.dex */
    public static class UserExtendInfo implements Parcelable {
        public static final Parcelable.Creator<UserExtendInfo> CREATOR = new C65773BxH(UserExtendInfo.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("share_url")
        public String LIZIZ;
        @SerializedName("r_schema_url")
        public String LIZJ;
        @SerializedName("rocket_schema_info")
        public RocketSchema LIZLLL;

        static {
            Covode.recordClassIndex(14197);
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
            parcel.writeString(this.LIZIZ);
            parcel.writeString(this.LIZJ);
            parcel.writeParcelable(this.LIZLLL, i);
        }

        public UserExtendInfo() {
        }

        public UserExtendInfo(Parcel parcel) {
            this.LIZIZ = parcel.readString();
            this.LIZJ = parcel.readString();
            this.LIZLLL = (RocketSchema) parcel.readParcelable(RocketSchema.class.getClassLoader());
        }
    }

    public XiguaUserParams() {
    }

    public XiguaUserParams(Parcel parcel) {
        boolean z;
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readLong();
        this.f25763LJ = parcel.readString();
        this.LJFF = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        this.LJII = (UserExtendInfo) parcel.readParcelable(UserExtendInfo.class.getClassLoader());
    }
}
