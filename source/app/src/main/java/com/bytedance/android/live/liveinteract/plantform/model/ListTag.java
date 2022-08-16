package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class ListTag implements Parcelable {
    public static final Parcelable.Creator<ListTag> CREATOR = new C65773BxH(ListTag.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("list_tag_type")
    public int LIZIZ;
    @SerializedName("fans_club_tag")
    public ListTagFansClubContent LIZJ;
    @SerializedName("honor_level_tag")
    public ListTagHonorLevelContent LIZLLL;
    @SerializedName("friend_tag")

    /* renamed from: LJ */
    public ListTagFriendContent f26416LJ;
    @SerializedName("fans_tag")
    public ListTagFansContent LJFF;

    static {
        Covode.recordClassIndex(29401);
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
        parcel.writeInt(this.LIZIZ);
        parcel.writeParcelable(this.LIZJ, i);
        parcel.writeParcelable(this.LIZLLL, i);
        parcel.writeParcelable(this.f26416LJ, i);
        parcel.writeParcelable(this.LJFF, i);
    }

    /* loaded from: classes3.dex */
    public static class ListTagFansClubContent implements Parcelable {
        public static final Parcelable.Creator<ListTagFansClubContent> CREATOR = new C65773BxH(ListTagFansClubContent.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("icons")
        public Map<Integer, ImageModel> LIZIZ;
        @SerializedName("club_name")
        public String LIZJ;

        static {
            Covode.recordClassIndex(29402);
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
            parcel.writeMap(this.LIZIZ);
            parcel.writeString(this.LIZJ);
        }

        public ListTagFansClubContent() {
        }

        public ListTagFansClubContent(Parcel parcel) {
            this.LIZIZ = parcel.readHashMap(ListTagFansClubContent.class.getClassLoader());
            this.LIZJ = parcel.readString();
        }
    }

    /* loaded from: classes11.dex */
    public static class ListTagFansContent implements Parcelable {
        public static final Parcelable.Creator<ListTagFansContent> CREATOR = new C65773BxH(ListTagFansContent.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("fans_tag")
        public ImageModel LIZIZ;

        static {
            Covode.recordClassIndex(29403);
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
        }

        public ListTagFansContent() {
        }

        public ListTagFansContent(Parcel parcel) {
            this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        }
    }

    /* loaded from: classes11.dex */
    public static class ListTagFriendContent implements Parcelable {
        public static final Parcelable.Creator<ListTagFriendContent> CREATOR = new C65773BxH(ListTagFriendContent.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("friend_tag")
        public ImageModel LIZIZ;

        static {
            Covode.recordClassIndex(29404);
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
        }

        public ListTagFriendContent() {
        }

        public ListTagFriendContent(Parcel parcel) {
            this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        }
    }

    /* loaded from: classes11.dex */
    public static class ListTagHonorLevelContent implements Parcelable {
        public static final Parcelable.Creator<ListTagHonorLevelContent> CREATOR = new C65773BxH(ListTagHonorLevelContent.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("new_im_icon_with_level")
        public ImageModel LIZIZ;

        static {
            Covode.recordClassIndex(29405);
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
        }

        public ListTagHonorLevelContent() {
        }

        public ListTagHonorLevelContent(Parcel parcel) {
            this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        }
    }

    public ListTag() {
    }

    public ListTag(Parcel parcel) {
        this.LIZIZ = parcel.readInt();
        this.LIZJ = (ListTagFansClubContent) parcel.readParcelable(ListTagFansClubContent.class.getClassLoader());
        this.LIZLLL = (ListTagHonorLevelContent) parcel.readParcelable(ListTagHonorLevelContent.class.getClassLoader());
        this.f26416LJ = (ListTagFriendContent) parcel.readParcelable(ListTagFriendContent.class.getClassLoader());
        this.LJFF = (ListTagFansContent) parcel.readParcelable(ListTagFansContent.class.getClassLoader());
    }
}
