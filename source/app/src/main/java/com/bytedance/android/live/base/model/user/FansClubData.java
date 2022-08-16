package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class FansClubData implements Parcelable {
    public static final int BADGE_ICON_NORMAL = 1;
    public static final int BADGE_ICON_SMALL = 2;
    public static final int BADGE_SUBSCRIBE_ICON = 3;
    public static final Parcelable.Creator<FansClubData> CREATOR = new C65773BxH(FansClubData.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("anchor_id")
    public long anchorId;
    @SerializedName("available_gift_ids")
    public List<Long> availableGiftIds;
    @SerializedName("badge")
    public UserBadge badge;
    @SerializedName("club_name")
    public String clubName;
    @SerializedName("level")
    public int level;
    @SerializedName("user_fans_club_status")
    public int userFansClubStatus;

    static {
        Covode.recordClassIndex(14144);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        parcel.writeLong(this.anchorId);
        parcel.writeString(this.clubName);
        parcel.writeInt(this.level);
        parcel.writeInt(this.userFansClubStatus);
        parcel.writeParcelable(this.badge, i);
        parcel.writeList(this.availableGiftIds);
    }

    /* loaded from: classes12.dex */
    public static class UserBadge implements Parcelable {
        public static final Parcelable.Creator<UserBadge> CREATOR = new C65773BxH(UserBadge.class);
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("icons")
        public Map<Integer, ImageModel> icons;
        @SerializedName("title")
        public String title;

        static {
            Covode.recordClassIndex(14145);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            parcel.writeMap(this.icons);
            parcel.writeString(this.title);
        }

        public UserBadge() {
        }

        public ImageModel getToShowIcon() {
            int i;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (ImageModel) proxy.result;
            }
            Map<Integer, ImageModel> map = this.icons;
            ImageModel imageModel = null;
            if (map == null) {
                return null;
            }
            if (map.get(6) != null) {
                imageModel = this.icons.get(6);
                i = 53;
            } else if (this.icons.get(5) != null) {
                imageModel = this.icons.get(5);
                i = 52;
            } else {
                if (this.icons.get(4) != null) {
                    imageModel = this.icons.get(4);
                    i = 51;
                }
                return imageModel;
            }
            if (imageModel != null) {
                imageModel.setImageType(i);
            }
            return imageModel;
        }

        public UserBadge(Parcel parcel) {
            this.icons = parcel.readHashMap(UserBadge.class.getClassLoader());
            this.title = parcel.readString();
        }
    }

    public FansClubData() {
    }

    public FansClubData(Parcel parcel) {
        this.anchorId = parcel.readLong();
        this.clubName = parcel.readString();
        this.level = parcel.readInt();
        this.userFansClubStatus = parcel.readInt();
        this.badge = (UserBadge) parcel.readParcelable(UserBadge.class.getClassLoader());
        this.availableGiftIds = parcel.readArrayList(FansClubData.class.getClassLoader());
    }

    public static boolean isValid(FansClubData fansClubData) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fansClubData}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (fansClubData != null && !TextUtils.isEmpty(fansClubData.clubName)) {
            return true;
        }
        return false;
    }
}
