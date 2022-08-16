package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC109983TRx;
import p003X.AbstractC109984TRy;
import p003X.C409202Hq;
import p003X.C65773BxH;
import p003X.KM9;

/* loaded from: classes11.dex */
public class User implements Parcelable, IUser {
    public static final Parcelable.Creator<User> CREATOR = new C65773BxH(User.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("adversary_authorization_info")
    public int adversaryAuthorizationInfo;
    @SerializedName("adversary_user_status")
    public int adversaryUserStatus;
    @SerializedName("age_range")
    public int ageRange;
    @SerializedName("anchor_info")
    public AnchorInfo anchorInfo;
    @SerializedName("webcast_anchor_level")
    public AnchorLevel anchorLevel;
    @SerializedName("author_stats")
    public Author authorInfo;
    @SerializedName("authorization_info")
    public int authorizationInfo;
    @SerializedName("avatar_border")
    public ImageModel avatarBorder;
    @SerializedName("avatar_large")
    public ImageModel avatarLarge;
    @SerializedName("avatar_medium")
    public ImageModel avatarMedium;
    @SerializedName("avatar_thumb")
    public ImageModel avatarThumb;
    @SerializedName("avatar_url")
    public String avatarUrl;
    @SerializedName("bg_img_url")
    public String backgroundImgUrl;
    @SerializedName("badge_image_list")
    public List<ImageModel> badgeImageList;
    @SerializedName("badge_image_list_v2")
    public List<ImageModel> badgeImageListV2;
    @SerializedName("birthday")
    public long birthday;
    @SerializedName("border")
    public BorderInfo border;
    @SerializedName("city")
    public String city;
    @SerializedName("commerce_webcast_config_ids")
    public List<Long> commerceConfigIds;
    public int commerceUserLevel;
    @SerializedName("create_time")
    public long createTime;
    @SerializedName("display_id")
    public String displayId;
    @SerializedName("with_car_management_permission")
    public boolean enableCarManagementPermission;
    @SerializedName("with_commerce_permission")
    public boolean enableShowCommerceSale;
    @SerializedName("encrypted_id")
    public String encryptedId;
    public int enterprise;
    @SerializedName("experience")
    public int experience;
    @SerializedName("ticket_count")
    public long fanTicketCount;
    @SerializedName("fans_club")
    public FansClubMember fansClub;
    @SerializedName("fans_group_info")
    public FansGroupInfo fansGroupInfo;
    @SerializedName("follow_info")
    public FollowInfo followInfo;
    @SerializedName("brotherhood_info")
    public FraternityInfo fraternityInfo;
    @SerializedName("gender")
    public int gender;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f25761id;
    @SerializedName("id_str")
    public String idStr;
    @SerializedName("income_share_percent")
    public int incomeSharePercent;
    @SerializedName("industry_certification")
    public IndustryCertification industryCertification;
    @SerializedName("is_anonymous")
    public boolean isAnonymous;
    @SerializedName("verified")
    public boolean isVerified;
    @SerializedName("level")
    public int level;
    @SerializedName("link_mic_stats")
    public int linkMicStats;
    @SerializedName("location_city")
    public String locationCity;
    public String logPb;
    @SerializedName("authentication_info")
    public AuthenticationInfo mAuthenticationInfo;
    public String mAvatarLargeStr;
    public String mAvatarMediumStr;
    public String mAvatarThumbStr;
    @SerializedName("medal")
    public ImageModel medal;
    @SerializedName("media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;
    @SerializedName("modify_time")
    public long modifyTime;
    @SerializedName("mystery_man")
    public int mysteryMan;
    public transient boolean neverRecharge;
    @SerializedName("new_real_time_icons")
    public List<ImageModel> newUserBadges;
    @SerializedName("nickname")
    public String nickName;
    @SerializedName("noble_info")
    public NobleLevelInfo nobleLevelInfo;
    @SerializedName("own_room")
    public OwnRoom ownRoom;
    @SerializedName("total_recharge_diamond_count")
    public long payScores;
    @SerializedName("personal_card")
    public ImageModel personalCard;
    @SerializedName("poi_info")
    public PoiInfo poiInfo;
    public String requestId;
    @SerializedName("activity_reward")
    public ActivityRewardInfo rewardInfo;
    @SerializedName("room_auto_gift_thanks")
    public boolean roomAutoGiftThanks;
    @SerializedName("desensitized_nickname")
    public String safeNicName;
    @SerializedName("sec_uid")
    public String secUid;
    @SerializedName("secret")
    public int secret;
    @SerializedName("share_qrcode_uri")
    public String shareQrcodeUri;
    @SerializedName("short_id")
    public long shortId;
    public boolean shouldUseRealName;
    @SerializedName("signature")
    public String signature;
    @SerializedName("special_id")
    public String specialId;
    @SerializedName("status")
    public int status;
    @SerializedName("telephone")
    public String telephone;
    @SerializedName("top_fans")
    public List<User> topFans;
    @SerializedName("top_vip_no")
    public int topVipNo;
    @SerializedName("user_attr")
    public UserAttr userAttr;
    @SerializedName("real_time_icons")
    public List<ImageModel> userBadges;
    @SerializedName("pay_grade")
    public UserHonor userHonor;
    @SerializedName("user_role")
    public int userRole;
    @SerializedName("watch_duration_month")
    public int userWatchMonth;
    public boolean userWatchMonthValid;
    @SerializedName("verified_content")
    public String verifiedContent;
    @SerializedName("verified_reason")
    public String verifiedReason;
    @SerializedName("xigua_info")
    public XiguaUserParams xiguaUserParams;

    /* renamed from: com.bytedance.android.live.base.model.user.User$a */
    /* loaded from: classes12.dex */
    public static class C2848a extends Extra {
        @SerializedName("anonymous_is_silence")
        public boolean LIZ;
        @SerializedName("mystery_detail_jump_schema")
        public String LIZIZ;

        static {
            Covode.recordClassIndex(14189);
        }
    }

    static {
        Covode.recordClassIndex(14187);
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 27).isSupported) {
            return;
        }
        parcel.writeString(this.nickName);
        parcel.writeString(this.safeNicName);
        parcel.writeParcelable(this.poiInfo, i);
        parcel.writeInt(this.gender);
        parcel.writeString(this.signature);
        parcel.writeInt(this.level);
        parcel.writeLong(this.f25761id);
        parcel.writeString(this.secUid);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.city);
        parcel.writeString(this.locationCity);
        parcel.writeLong(this.birthday);
        parcel.writeString(this.telephone);
        parcel.writeInt(this.experience);
        parcel.writeInt(this.status);
        parcel.writeLong(this.modifyTime);
        parcel.writeInt(this.secret);
        parcel.writeString(this.shareQrcodeUri);
        parcel.writeInt(this.incomeSharePercent);
        parcel.writeTypedList(this.badgeImageList);
        parcel.writeTypedList(this.mediaBadgeImageList);
        parcel.writeParcelable(this.followInfo, i);
        parcel.writeParcelable(this.userAttr, i);
        parcel.writeParcelable(this.anchorInfo, i);
        parcel.writeParcelable(this.fansGroupInfo, i);
        parcel.writeString(this.verifiedContent);
        parcel.writeParcelable(this.authorInfo, i);
        parcel.writeString(this.encryptedId);
        parcel.writeParcelable(this.xiguaUserParams, i);
        parcel.writeParcelable(this.rewardInfo, i);
        parcel.writeParcelable(this.nobleLevelInfo, i);
        parcel.writeParcelable(this.personalCard, i);
        parcel.writeInt(this.userWatchMonth);
        parcel.writeByte(this.userWatchMonthValid ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mysteryMan);
        parcel.writeParcelable(this.industryCertification, i);
        parcel.writeInt(this.authorizationInfo);
        parcel.writeInt(this.adversaryAuthorizationInfo);
        parcel.writeInt(this.adversaryUserStatus);
        parcel.writeParcelable(this.mAuthenticationInfo, i);
        parcel.writeList(this.commerceConfigIds);
        parcel.writeInt(this.ageRange);
        parcel.writeByte(this.isAnonymous ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.badgeImageListV2);
        parcel.writeInt(this.userRole);
        parcel.writeParcelable(this.avatarThumb, i);
        parcel.writeParcelable(this.avatarMedium, i);
        parcel.writeParcelable(this.avatarLarge, i);
        parcel.writeString(this.avatarUrl);
        parcel.writeTypedList(this.topFans);
        parcel.writeString(this.idStr);
        parcel.writeLong(this.shortId);
        parcel.writeLong(this.fanTicketCount);
        parcel.writeByte(this.isVerified ? (byte) 1 : (byte) 0);
        parcel.writeString(this.verifiedReason);
        parcel.writeInt(this.topVipNo);
        parcel.writeParcelable(this.userHonor, i);
        parcel.writeParcelable(this.anchorLevel, i);
        parcel.writeTypedList(this.userBadges);
        parcel.writeTypedList(this.newUserBadges);
        parcel.writeString(this.displayId);
        parcel.writeLong(this.payScores);
        parcel.writeParcelable(this.fansClub, i);
        parcel.writeParcelable(this.fraternityInfo, i);
        parcel.writeParcelable(this.border, i);
        parcel.writeString(this.specialId);
        parcel.writeParcelable(this.avatarBorder, i);
        parcel.writeParcelable(this.medal, i);
        parcel.writeInt(this.linkMicStats);
        parcel.writeString(this.backgroundImgUrl);
        parcel.writeByte(this.roomAutoGiftThanks ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.ownRoom, i);
        parcel.writeString(this.mAvatarThumbStr);
        parcel.writeString(this.mAvatarMediumStr);
        parcel.writeString(this.mAvatarLargeStr);
        parcel.writeByte(this.enableShowCommerceSale ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableCarManagementPermission ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldUseRealName ? (byte) 1 : (byte) 0);
        parcel.writeString(this.requestId);
        parcel.writeString(this.logPb);
        parcel.writeInt(this.commerceUserLevel);
        parcel.writeInt(this.enterprise);
    }

    /* loaded from: classes11.dex */
    public static class OwnRoom implements Parcelable {
        public static final Parcelable.Creator<OwnRoom> CREATOR = new C65773BxH(OwnRoom.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("room_ids")
        public List<Long> LIZIZ;
        @SerializedName("room_ids_str")
        public List<String> LIZJ;
        @SerializedName("room_ids_display")
        public List<Integer> LIZLLL;

        static {
            Covode.recordClassIndex(14188);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
                return;
            }
            parcel.writeList(this.LIZIZ);
            parcel.writeStringList(this.LIZJ);
            parcel.writeList(this.LIZLLL);
        }

        public OwnRoom() {
        }

        public OwnRoom(Parcel parcel) {
            this.LIZIZ = parcel.readArrayList(OwnRoom.class.getClassLoader());
            this.LIZJ = parcel.createStringArrayList();
            this.LIZLLL = parcel.readArrayList(OwnRoom.class.getClassLoader());
        }
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getAgeRange() {
        return this.ageRange;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    /* renamed from: getAnchorLevel  reason: collision with other method in class */
    public AnchorLevel mo25552getAnchorLevel() {
        return this.anchorLevel;
    }

    public Author getAuthorInfo() {
        return this.authorInfo;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public List<ImageModel> getBadgeImageList() {
        return this.badgeImageList;
    }

    public List<ImageModel> getBadgeImageListV2() {
        return this.badgeImageListV2;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getBirthday() {
        return this.birthday;
    }

    public BorderInfo getBorder() {
        return this.border;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getCity() {
        return this.city;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getCreateTime() {
        return this.createTime;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getDisplayId() {
        return this.displayId;
    }

    public String getEncryptedId() {
        return this.encryptedId;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getEnterprise() {
        return this.enterprise;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getExperience() {
        return this.experience;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getGender() {
        return this.gender;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getId() {
        return this.f25761id;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getIncomeSharePercent() {
        return this.incomeSharePercent;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getLevel() {
        return this.level;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getModifyTime() {
        return this.modifyTime;
    }

    public int getMysteryMan() {
        return this.mysteryMan;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public OwnRoom getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public PoiInfo getPoiInfo() {
        return this.poiInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getRealNickName() {
        return this.nickName;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public ActivityRewardInfo getRewardInfo() {
        return this.rewardInfo;
    }

    public boolean getRoomAutoGiftThanks() {
        return this.roomAutoGiftThanks;
    }

    public String getSafeNicName() {
        return this.safeNicName;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getSecUid() {
        return this.secUid;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getSecret() {
        return this.secret;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public long getShortId() {
        return this.shortId;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getSignature() {
        return this.signature;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getStatus() {
        return this.status;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getTelephone() {
        return this.telephone;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public List<User> getTopFans() {
        return this.topFans;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getTopVipNo() {
        return this.topVipNo;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public UserAttr getUserAttr() {
        return this.userAttr;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    /* renamed from: getUserHonor  reason: collision with other method in class */
    public UserHonor mo25553getUserHonor() {
        return this.userHonor;
    }

    public int getUserRole() {
        return this.userRole;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public int getUserWatchMonth() {
        return this.userWatchMonth;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean getUserWatchMonthValid() {
        return this.userWatchMonthValid;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public XiguaUserParams getXiguaUserParams() {
        return this.xiguaUserParams;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    public boolean isNeverRecharge() {
        return this.neverRecharge;
    }

    public boolean isShouldUseRealName() {
        return this.shouldUseRealName;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isVerified() {
        return this.isVerified;
    }

    public User() {
        this.encryptedId = "";
        this.payScores = -1L;
    }

    public int getPrivilegeLevel() {
        UserHonor userHonor = this.userHonor;
        if (userHonor != null) {
            return userHonor.LJIILJJIL;
        }
        return 0;
    }

    public boolean isMysteryMan() {
        if (this.mysteryMan == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isVcdAdversaryContentAuthorized() {
        if ((this.adversaryAuthorizationInfo & 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isVcdAdversaryRelationAuthorized() {
        if ((this.adversaryAuthorizationInfo & 2) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isVcdContentAuthorized() {
        if ((this.authorizationInfo & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean isVcdRelationAuthorized() {
        if ((this.authorizationInfo & 2) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public boolean isWithCommercePermission() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return isEnableShowCommerceSale();
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public ImageModel getAvatarLarge() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) KM9.LIZ().fromJson(this.mAvatarLargeStr, (Class<Object>) ImageModel.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.avatarLarge;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public ImageModel getAvatarMedium() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) KM9.LIZ().fromJson(this.mAvatarMediumStr, (Class<Object>) ImageModel.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.avatarMedium;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public ImageModel getAvatarThumb() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) KM9.LIZ().fromJson(this.mAvatarThumbStr, (Class<Object>) ImageModel.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.f25761id);
        }
        return this.idStr;
    }

    public String getLocationCity() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.locationCity;
        if (str != null && !str.isEmpty()) {
            return this.locationCity;
        }
        return this.city;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public List<ImageModel> getNewUserBadges() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<ImageModel> list = this.newUserBadges;
        if (list != null && !list.isEmpty()) {
            return this.newUserBadges;
        }
        return this.userBadges;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public String getNickName() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.shouldUseRealName) {
            return this.nickName;
        }
        if (C409202Hq.LIZIZ() != null && C409202Hq.LIZIZ().LIZ()) {
            return C409202Hq.LIZIZ().LIZ(this);
        }
        return this.nickName;
    }

    public String getRemarkName() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null && !TextUtils.isEmpty(followInfo.remarkName)) {
            return this.followInfo.remarkName;
        }
        return null;
    }

    public String getRemarkNameOrNickname() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null && !TextUtils.isEmpty(followInfo.remarkName)) {
            return this.followInfo.remarkName;
        }
        return getNickName();
    }

    public String getRemarkNameOrRealNickName() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null && !TextUtils.isEmpty(followInfo.remarkName)) {
            return this.followInfo.remarkName;
        }
        return getRealNickName();
    }

    public boolean isCustomVerify() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AuthenticationInfo authenticationInfo = this.mAuthenticationInfo;
        if (authenticationInfo == null || TextUtils.isEmpty(authenticationInfo.customVerify)) {
            return false;
        }
        return true;
    }

    public boolean isEnterpriseVerify() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AuthenticationInfo authenticationInfo = this.mAuthenticationInfo;
        if (authenticationInfo == null || TextUtils.isEmpty(authenticationInfo.enterpriseVerifyReason)) {
            return false;
        }
        return true;
    }

    public boolean isFollowing() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo == null) {
            return false;
        }
        if (followInfo.getFollowStatus() != 2 && this.followInfo.getFollowStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isSubscriber() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (ImageModel imageModel : this.badgeImageListV2) {
            if (imageModel.getImageType() == 50) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25080C("User@", Integer.toHexString(hashCode()), "{\"nickName\":\"", this.nickName, "\", \"id\":\"", Long.valueOf(this.f25761id), "\"}safe name :", getSafeNicName());
    }

    public boolean canJumpToLiveRoom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        OwnRoom ownRoom = this.ownRoom;
        if (ownRoom != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], ownRoom, OwnRoom.LIZ, false, 2);
            if (!proxy2.isSupported ? !(Lists.isEmpty(ownRoom.LIZLLL) || ownRoom.LIZLLL.get(0).intValue() != 0) : !((Boolean) proxy2.result).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public long getLiveRoomId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        OwnRoom ownRoom = this.ownRoom;
        if (ownRoom == null) {
            return 0L;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], ownRoom, OwnRoom.LIZ, false, 1);
        if (proxy2.isSupported) {
            return ((Long) proxy2.result).longValue();
        }
        if (Lists.isEmpty(ownRoom.LIZIZ)) {
            return 0L;
        }
        return ownRoom.LIZIZ.get(0).longValue();
    }

    public String getRelationship() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long j = 0;
        if (getFollowInfo() != null) {
            j = getFollowInfo().getFollowStatus();
            if (j == 2) {
                return "friends";
            }
        }
        if (this.fansGroupInfo != null) {
            return "fans_group";
        }
        if (j == 1) {
            return "my_follow";
        }
        if (j == 3) {
            return "fans";
        }
        return "null";
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String str = this.nickName;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i25 = ((i * 31) + this.gender) * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f25761id;
        long j2 = this.createTime;
        int i26 = (((((((i25 + i2) * 31) + this.level) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.city;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        long j3 = this.birthday;
        int i27 = (((i26 + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        ImageModel imageModel = this.avatarThumb;
        if (imageModel != null) {
            i4 = imageModel.hashCode();
        } else {
            i4 = 0;
        }
        int i28 = (i27 + i4) * 31;
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 != null) {
            i5 = imageModel2.hashCode();
        } else {
            i5 = 0;
        }
        int i29 = (i28 + i5) * 31;
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 != null) {
            i6 = imageModel3.hashCode();
        } else {
            i6 = 0;
        }
        int i30 = (i29 + i6) * 31;
        String str4 = this.avatarUrl;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i31 = (i30 + i7) * 31;
        List<User> list = this.topFans;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        int i32 = (i31 + i8) * 31;
        String str5 = this.idStr;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        long j4 = this.shortId;
        long j5 = this.fanTicketCount;
        int i33 = (((((((i32 + i9) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        String str6 = this.verifiedReason;
        if (str6 != null) {
            i10 = str6.hashCode();
        } else {
            i10 = 0;
        }
        int i34 = (((i33 + i10) * 31) + this.topVipNo) * 31;
        UserHonor userHonor = this.userHonor;
        if (userHonor != null) {
            i11 = userHonor.hashCode();
        } else {
            i11 = 0;
        }
        int i35 = (i34 + i11) * 31;
        AnchorLevel anchorLevel = this.anchorLevel;
        if (anchorLevel != null) {
            i12 = anchorLevel.hashCode();
        } else {
            i12 = 0;
        }
        int i36 = (i35 + i12) * 31;
        List<ImageModel> list2 = this.userBadges;
        if (list2 != null) {
            i13 = list2.hashCode();
        } else {
            i13 = 0;
        }
        int i37 = (i36 + i13) * 31;
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 != null) {
            i14 = list3.hashCode();
        } else {
            i14 = 0;
        }
        int i38 = (((i37 + i14) * 31) + this.linkMicStats) * 31;
        String str7 = this.mAvatarThumbStr;
        if (str7 != null) {
            i15 = str7.hashCode();
        } else {
            i15 = 0;
        }
        int i39 = (i38 + i15) * 31;
        String str8 = this.mAvatarMediumStr;
        if (str8 != null) {
            i16 = str8.hashCode();
        } else {
            i16 = 0;
        }
        int i40 = (i39 + i16) * 31;
        String str9 = this.mAvatarLargeStr;
        if (str9 != null) {
            i17 = str9.hashCode();
        } else {
            i17 = 0;
        }
        int i41 = (((i40 + i17) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        String str10 = this.backgroundImgUrl;
        if (str10 != null) {
            i18 = str10.hashCode();
        } else {
            i18 = 0;
        }
        int i42 = (i41 + i18) * 31;
        String str11 = this.telephone;
        if (str11 != null) {
            i19 = str11.hashCode();
        } else {
            i19 = 0;
        }
        long j6 = this.modifyTime;
        int i43 = (((((((((i42 + i19) * 31) + this.experience) * 31) + this.status) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.secret) * 31;
        String str12 = this.shareQrcodeUri;
        if (str12 != null) {
            i20 = str12.hashCode();
        } else {
            i20 = 0;
        }
        int i44 = (((i43 + i20) * 31) + this.incomeSharePercent) * 31;
        List<ImageModel> list4 = this.badgeImageList;
        if (list4 != null) {
            i21 = list4.hashCode();
        } else {
            i21 = 0;
        }
        int i45 = (i44 + i21) * 31;
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            i22 = followInfo.hashCode();
        } else {
            i22 = 0;
        }
        int i46 = (i45 + i22) * 31;
        UserAttr userAttr = this.userAttr;
        if (userAttr != null) {
            i23 = userAttr.hashCode();
        } else {
            i23 = 0;
        }
        int i47 = (i46 + i23) * 31;
        AnchorInfo anchorInfo = this.anchorInfo;
        if (anchorInfo != null) {
            i24 = anchorInfo.hashCode();
        }
        return i47 + i24;
    }

    public void setAVatarMediumStr(String str) {
        this.mAvatarMediumStr = str;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public void setAnchorLevel(AnchorLevel anchorLevel) {
        this.anchorLevel = anchorLevel;
    }

    public void setAuthorInfo(Author author) {
        this.authorInfo = author;
    }

    public void setAvatarBorder(ImageModel imageModel) {
        this.avatarBorder = imageModel;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarLargeStr(String str) {
        this.mAvatarLargeStr = str;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setAvatarThumbStr(String str) {
        this.mAvatarThumbStr = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setBackgroundImgUrl(String str) {
        this.backgroundImgUrl = str;
    }

    public void setBadgeImageList(List<ImageModel> list) {
        this.badgeImageList = list;
    }

    public void setBadgeImageListV2(List<ImageModel> list) {
        this.badgeImageListV2 = list;
    }

    public void setBirthday(long j) {
        this.birthday = j;
    }

    public void setBorder(BorderInfo borderInfo) {
        this.border = borderInfo;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDisplayId(String str) {
        this.displayId = str;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setEncryptedId(String str) {
        this.encryptedId = str;
    }

    public void setEnterprise(int i) {
        this.enterprise = i;
    }

    public void setExperience(int i) {
        this.experience = i;
    }

    public void setFanTicketCount(long j) {
        this.fanTicketCount = j;
    }

    public void setFansClub(FansClubMember fansClubMember) {
        this.fansClub = fansClubMember;
    }

    public void setFollowInfo(FollowInfo followInfo) {
        this.followInfo = followInfo;
    }

    public void setFraternityInfo(FraternityInfo fraternityInfo) {
        this.fraternityInfo = fraternityInfo;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setId(long j) {
        this.f25761id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setIncomeSharePercent(int i) {
        this.incomeSharePercent = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    @SerializedName("link_mic_stats")
    public void setLinkMicStats(int i) {
        this.linkMicStats = i;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setMedal(ImageModel imageModel) {
        this.medal = imageModel;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setMysteryMan(int i) {
        this.mysteryMan = i;
    }

    public void setNeverRecharge(boolean z) {
        this.neverRecharge = z;
    }

    public void setNewUserBadges(List<ImageModel> list) {
        this.newUserBadges = list;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNobleLevelInfo(NobleLevelInfo nobleLevelInfo) {
        this.nobleLevelInfo = nobleLevelInfo;
    }

    public void setPersonalCard(ImageModel imageModel) {
        this.personalCard = imageModel;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomAutoGiftThanks(boolean z) {
        this.roomAutoGiftThanks = z;
    }

    public void setSafeNicName(String str) {
        this.safeNicName = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setShortId(long j) {
        this.shortId = j;
    }

    public void setShouldUseRealName(boolean z) {
        this.shouldUseRealName = z;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSpecialId(String str) {
        this.specialId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }

    public void setTopFans(List<User> list) {
        this.topFans = list;
    }

    public void setTopVipNo(int i) {
        this.topVipNo = i;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public void setUserAttr(UserAttr userAttr) {
        this.userAttr = userAttr;
    }

    public void setUserBadges(List<ImageModel> list) {
        this.userBadges = list;
    }

    public void setUserHonor(UserHonor userHonor) {
        this.userHonor = userHonor;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public void setUserWatchMonthValid(boolean z) {
        this.userWatchMonthValid = z;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifiedContent(String str) {
        this.verifiedContent = str;
    }

    public void setVerifiedReason(String str) {
        this.verifiedReason = str;
    }

    public void setXiguaUserParams(XiguaUserParams xiguaUserParams) {
        this.xiguaUserParams = xiguaUserParams;
    }

    public void setPayScores(long j) {
        this.payScores = j;
        if (j > 0) {
            this.neverRecharge = false;
        }
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public void setFollowStatus(int i) {
        FollowInfo followInfo;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported && (followInfo = this.followInfo) != null) {
            followInfo.setFollowStatus(i);
        }
    }

    public void setWithCommercePermission(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        setEnableShowCommerceSale(z);
    }

    public static User from(IUser iUser) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iUser}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        if (iUser == null) {
            return null;
        }
        if (iUser instanceof User) {
            Gson LIZ = KM9.LIZ();
            return (User) GsonProtectorUtils.fromJson(LIZ, GsonProtectorUtils.toJson(LIZ, iUser), (Class<Object>) User.class);
        }
        User user = new User();
        user.initWith(iUser);
        return user;
    }

    public String getProperNickName(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (z && !TextUtils.isEmpty(getSafeNicName())) {
            return getSafeNicName();
        }
        return getNickName();
    }

    public User(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.encryptedId = "";
        this.payScores = -1L;
        this.nickName = parcel.readString();
        this.safeNicName = parcel.readString();
        this.poiInfo = (PoiInfo) parcel.readParcelable(PoiInfo.class.getClassLoader());
        this.gender = parcel.readInt();
        this.signature = parcel.readString();
        this.level = parcel.readInt();
        this.f25761id = parcel.readLong();
        this.secUid = parcel.readString();
        this.createTime = parcel.readLong();
        this.city = parcel.readString();
        this.locationCity = parcel.readString();
        this.birthday = parcel.readLong();
        this.telephone = parcel.readString();
        this.experience = parcel.readInt();
        this.status = parcel.readInt();
        this.modifyTime = parcel.readLong();
        this.secret = parcel.readInt();
        this.shareQrcodeUri = parcel.readString();
        this.incomeSharePercent = parcel.readInt();
        this.badgeImageList = parcel.createTypedArrayList(ImageModel.CREATOR);
        this.mediaBadgeImageList = parcel.createTypedArrayList(ImageModel.CREATOR);
        this.followInfo = (FollowInfo) parcel.readParcelable(FollowInfo.class.getClassLoader());
        this.userAttr = (UserAttr) parcel.readParcelable(UserAttr.class.getClassLoader());
        this.anchorInfo = (AnchorInfo) parcel.readParcelable(AnchorInfo.class.getClassLoader());
        this.fansGroupInfo = (FansGroupInfo) parcel.readParcelable(FansGroupInfo.class.getClassLoader());
        this.verifiedContent = parcel.readString();
        this.authorInfo = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.encryptedId = parcel.readString();
        this.xiguaUserParams = (XiguaUserParams) parcel.readParcelable(XiguaUserParams.class.getClassLoader());
        this.rewardInfo = (ActivityRewardInfo) parcel.readParcelable(ActivityRewardInfo.class.getClassLoader());
        this.nobleLevelInfo = (NobleLevelInfo) parcel.readParcelable(NobleLevelInfo.class.getClassLoader());
        this.personalCard = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.userWatchMonth = parcel.readInt();
        boolean z7 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.userWatchMonthValid = z;
        this.mysteryMan = parcel.readInt();
        this.industryCertification = (IndustryCertification) parcel.readParcelable(IndustryCertification.class.getClassLoader());
        this.authorizationInfo = parcel.readInt();
        this.adversaryAuthorizationInfo = parcel.readInt();
        this.adversaryUserStatus = parcel.readInt();
        this.mAuthenticationInfo = (AuthenticationInfo) parcel.readParcelable(AuthenticationInfo.class.getClassLoader());
        this.commerceConfigIds = parcel.readArrayList(User.class.getClassLoader());
        this.ageRange = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isAnonymous = z2;
        this.badgeImageListV2 = parcel.createTypedArrayList(ImageModel.CREATOR);
        this.userRole = parcel.readInt();
        this.avatarThumb = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.avatarMedium = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.avatarLarge = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.avatarUrl = parcel.readString();
        this.topFans = parcel.createTypedArrayList(CREATOR);
        this.idStr = parcel.readString();
        this.shortId = parcel.readLong();
        this.fanTicketCount = parcel.readLong();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isVerified = z3;
        this.verifiedReason = parcel.readString();
        this.topVipNo = parcel.readInt();
        this.userHonor = (UserHonor) parcel.readParcelable(UserHonor.class.getClassLoader());
        this.anchorLevel = (AnchorLevel) parcel.readParcelable(AnchorLevel.class.getClassLoader());
        this.userBadges = parcel.createTypedArrayList(ImageModel.CREATOR);
        this.newUserBadges = parcel.createTypedArrayList(ImageModel.CREATOR);
        this.displayId = parcel.readString();
        this.payScores = parcel.readLong();
        this.fansClub = (FansClubMember) parcel.readParcelable(FansClubMember.class.getClassLoader());
        this.fraternityInfo = (FraternityInfo) parcel.readParcelable(FraternityInfo.class.getClassLoader());
        this.border = (BorderInfo) parcel.readParcelable(BorderInfo.class.getClassLoader());
        this.specialId = parcel.readString();
        this.avatarBorder = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.medal = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.linkMicStats = parcel.readInt();
        this.backgroundImgUrl = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.roomAutoGiftThanks = z4;
        this.ownRoom = (OwnRoom) parcel.readParcelable(OwnRoom.class.getClassLoader());
        this.mAvatarThumbStr = parcel.readString();
        this.mAvatarMediumStr = parcel.readString();
        this.mAvatarLargeStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableShowCommerceSale = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableCarManagementPermission = z6;
        this.shouldUseRealName = parcel.readByte() == 0 ? false : z7;
        this.requestId = parcel.readString();
        this.logPb = parcel.readString();
        this.commerceUserLevel = parcel.readInt();
        this.enterprise = parcel.readInt();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            User user = (User) obj;
            if (this.gender != user.gender || this.level != user.level || this.f25761id != user.f25761id || this.createTime != user.createTime || this.birthday != user.birthday || this.shortId != user.shortId || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.linkMicStats != user.linkMicStats || this.enableShowCommerceSale != user.enableShowCommerceSale) {
                return false;
            }
            String str = this.nickName;
            if (str != null) {
                if (!str.equals(user.nickName)) {
                    return false;
                }
            } else if (user.nickName != null) {
                return false;
            }
            String str2 = this.signature;
            if (str2 != null) {
                if (!str2.equals(user.signature)) {
                    return false;
                }
            } else if (user.signature != null) {
                return false;
            }
            String str3 = this.city;
            if (str3 != null) {
                if (!str3.equals(user.city)) {
                    return false;
                }
            } else if (user.city != null) {
                return false;
            }
            ImageModel imageModel = this.avatarThumb;
            if (imageModel != null) {
                if (!imageModel.equals(user.avatarThumb)) {
                    return false;
                }
            } else if (user.avatarThumb != null) {
                return false;
            }
            ImageModel imageModel2 = this.avatarMedium;
            if (imageModel2 != null) {
                if (!imageModel2.equals(user.avatarMedium)) {
                    return false;
                }
            } else if (user.avatarMedium != null) {
                return false;
            }
            ImageModel imageModel3 = this.avatarLarge;
            if (imageModel3 != null) {
                if (!imageModel3.equals(user.avatarLarge)) {
                    return false;
                }
            } else if (user.avatarLarge != null) {
                return false;
            }
            String str4 = this.avatarUrl;
            if (str4 != null) {
                if (!str4.equals(user.avatarUrl)) {
                    return false;
                }
            } else if (user.avatarUrl != null) {
                return false;
            }
            List<User> list = this.topFans;
            if (list != null) {
                if (!list.equals(user.topFans)) {
                    return false;
                }
            } else if (user.topFans != null) {
                return false;
            }
            String str5 = this.idStr;
            if (str5 != null) {
                if (!str5.equals(user.idStr)) {
                    return false;
                }
            } else if (user.idStr != null) {
                return false;
            }
            String str6 = this.verifiedReason;
            if (str6 != null) {
                if (!str6.equals(user.verifiedReason)) {
                    return false;
                }
            } else if (user.verifiedReason != null) {
                return false;
            }
            UserHonor userHonor = this.userHonor;
            if (userHonor != null) {
                if (!userHonor.equals(user.userHonor)) {
                    return false;
                }
            } else if (user.userHonor != null) {
                return false;
            }
            AnchorLevel anchorLevel = this.anchorLevel;
            if (anchorLevel != null) {
                if (!anchorLevel.equals(user.anchorLevel)) {
                    return false;
                }
            } else if (user.anchorLevel != null) {
                return false;
            }
            List<ImageModel> list2 = this.userBadges;
            if (list2 != null) {
                if (!list2.equals(user.userBadges)) {
                    return false;
                }
            } else if (user.userBadges != null) {
                return false;
            }
            List<ImageModel> list3 = this.newUserBadges;
            if (list3 != null) {
                if (!list3.equals(user.newUserBadges)) {
                    return false;
                }
            } else if (user.newUserBadges != null) {
                return false;
            }
            String str7 = this.mAvatarThumbStr;
            if (str7 != null) {
                if (!str7.equals(user.mAvatarThumbStr)) {
                    return false;
                }
            } else if (user.mAvatarThumbStr != null) {
                return false;
            }
            String str8 = this.mAvatarMediumStr;
            if (str8 != null) {
                if (!str8.equals(user.mAvatarMediumStr)) {
                    return false;
                }
            } else if (user.mAvatarMediumStr != null) {
                return false;
            }
            String str9 = this.mAvatarLargeStr;
            if (str9 != null) {
                if (!str9.equals(user.mAvatarLargeStr)) {
                    return false;
                }
            } else if (user.mAvatarLargeStr != null) {
                return false;
            }
            String str10 = this.backgroundImgUrl;
            if (str10 != null) {
                if (!str10.equals(user.backgroundImgUrl)) {
                    return false;
                }
            } else if (user.backgroundImgUrl != null) {
                return false;
            }
            String str11 = this.telephone;
            if (str11 != null) {
                if (!str11.equals(user.telephone)) {
                    return false;
                }
            } else if (user.telephone != null) {
                return false;
            }
            if (this.experience != user.experience || this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
                return false;
            }
            String str12 = this.shareQrcodeUri;
            if (str12 != null) {
                if (!str12.equals(user.shareQrcodeUri)) {
                    return false;
                }
            } else if (user.shareQrcodeUri != null) {
                return false;
            }
            if (this.incomeSharePercent != user.incomeSharePercent) {
                return false;
            }
            List<ImageModel> list4 = this.badgeImageList;
            if (list4 != null) {
                if (!list4.equals(user.badgeImageList)) {
                    return false;
                }
            } else if (user.badgeImageList != null) {
                return false;
            }
            FollowInfo followInfo = this.followInfo;
            if (followInfo != null) {
                if (!followInfo.equals(user.followInfo)) {
                    return false;
                }
            } else if (user.followInfo != null) {
                return false;
            }
            UserAttr userAttr = this.userAttr;
            if (userAttr != null) {
                if (!userAttr.equals(user.userAttr)) {
                    return false;
                }
            } else if (user.userAttr != null) {
                return false;
            }
            AnchorInfo anchorInfo = this.anchorInfo;
            AnchorInfo anchorInfo2 = user.anchorInfo;
            if (anchorInfo != null) {
                return anchorInfo.equals(anchorInfo2);
            }
            if (anchorInfo2 == null) {
                return true;
            }
        }
        return false;
    }

    public void initWith(IUser iUser) {
        ArrayList arrayList;
        UserHonor userHonor;
        ArrayList arrayList2;
        AnchorLevel anchorLevel;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (PatchProxy.proxy(new Object[]{iUser}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        this.enableShowCommerceSale = iUser.isEnableShowCommerceSale();
        this.fanTicketCount = iUser.getFanTicketCount();
        this.shortId = iUser.getShortId();
        this.displayId = iUser.getDisplayId();
        this.avatarUrl = iUser.getAvatarUrl();
        this.avatarThumb = iUser.getAvatarThumb();
        this.avatarMedium = iUser.getAvatarMedium();
        this.avatarLarge = iUser.getAvatarLarge();
        this.city = iUser.getCity();
        this.birthday = iUser.getBirthday();
        this.nickName = iUser.getNickName();
        this.poiInfo = iUser.getPoiInfo();
        this.gender = iUser.getGender();
        this.signature = iUser.getSignature();
        this.level = iUser.getLevel();
        this.f25761id = iUser.getId();
        ArrayList arrayList5 = null;
        if (iUser.getTopFans() != null) {
            arrayList = new ArrayList(iUser.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = iUser.isVerified();
        this.verifiedReason = iUser.getVerifiedReason();
        this.topVipNo = iUser.getTopVipNo();
        AbstractC109983TRx mo25553getUserHonor = iUser.mo25553getUserHonor();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{mo25553getUserHonor}, null, UserHonor.LIZ, true, 2);
        if (proxy.isSupported) {
            userHonor = (UserHonor) proxy.result;
        } else if (mo25553getUserHonor == null) {
            userHonor = null;
        } else if (mo25553getUserHonor instanceof UserHonor) {
            Gson LIZ = KM9.LIZ();
            userHonor = (UserHonor) GsonProtectorUtils.fromJson(LIZ, GsonProtectorUtils.toJson(LIZ, mo25553getUserHonor), (Class<Object>) UserHonor.class);
        } else {
            userHonor = new UserHonor();
            if (!PatchProxy.proxy(new Object[]{mo25553getUserHonor}, userHonor, UserHonor.LIZ, false, 1).isSupported) {
                userHonor.LIZIZ = mo25553getUserHonor.LIZIZ();
                userHonor.LIZJ = mo25553getUserHonor.LIZJ();
                userHonor.LIZLLL = mo25553getUserHonor.LIZLLL();
                userHonor.f25762LJ = mo25553getUserHonor.mo15922LJ();
                userHonor.LJFF = mo25553getUserHonor.LJFF();
                userHonor.LJI = mo25553getUserHonor.LJI();
                userHonor.LJII = mo25553getUserHonor.LJII();
                userHonor.LJIIIIZZ = mo25553getUserHonor.LJIIIIZZ();
                userHonor.LJIIIZ = mo25553getUserHonor.LJIIIZ();
                userHonor.LJIIJ = mo25553getUserHonor.LJIILIIL();
                userHonor.LJIIJJI = mo25553getUserHonor.LJIIJ();
                userHonor.LJIILJJIL = mo25553getUserHonor.LJIILJJIL();
                userHonor.LJIIL = mo25553getUserHonor.LJIILL();
                userHonor.LJIILIIL = mo25553getUserHonor.LJIIL();
                if (mo25553getUserHonor.LJIILLIIL() != null) {
                    arrayList2 = new ArrayList(mo25553getUserHonor.LJIILLIIL());
                } else {
                    arrayList2 = null;
                }
                userHonor.LJIILL = arrayList2;
                userHonor.LJIILLIIL = mo25553getUserHonor.LJIIZILJ();
                userHonor.LJIIZILJ = mo25553getUserHonor.LJIJ();
                userHonor.LJIJ = mo25553getUserHonor.LJIJI();
                userHonor.LJIJI = mo25553getUserHonor.LJIJJ();
                userHonor.LJIJJ = mo25553getUserHonor.LJIJJLI();
            }
        }
        this.userHonor = userHonor;
        AbstractC109984TRy mo25552getAnchorLevel = iUser.mo25552getAnchorLevel();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{mo25552getAnchorLevel}, null, AnchorLevel.LIZ, true, 2);
        if (proxy2.isSupported) {
            anchorLevel = (AnchorLevel) proxy2.result;
        } else if (mo25552getAnchorLevel == null) {
            anchorLevel = null;
        } else if (mo25552getAnchorLevel instanceof AnchorLevel) {
            anchorLevel = (AnchorLevel) mo25552getAnchorLevel;
        } else {
            AnchorLevel anchorLevel2 = new AnchorLevel();
            if (!PatchProxy.proxy(new Object[]{mo25552getAnchorLevel}, anchorLevel2, AnchorLevel.LIZ, false, 1).isSupported) {
                anchorLevel2.LIZIZ = mo25552getAnchorLevel.LIZ();
                anchorLevel2.LIZJ = mo25552getAnchorLevel.LIZIZ();
                anchorLevel2.LIZLLL = mo25552getAnchorLevel.LIZJ();
                anchorLevel2.f25755LJ = mo25552getAnchorLevel.LIZLLL();
                anchorLevel2.LJFF = mo25552getAnchorLevel.mo15923LJ();
                anchorLevel2.LJI = mo25552getAnchorLevel.LJFF();
                anchorLevel2.LJII = mo25552getAnchorLevel.LJI();
                anchorLevel2.LJIIIIZZ = mo25552getAnchorLevel.LJII();
                anchorLevel2.LJIIIZ = mo25552getAnchorLevel.LJIIIIZZ();
                anchorLevel2.LJIIJ = mo25552getAnchorLevel.LJIIIZ();
                anchorLevel2.LJIIJJI = mo25552getAnchorLevel.LJIIJ();
                anchorLevel2.LJIIL = mo25552getAnchorLevel.LJIIJJI();
                anchorLevel2.LJIILIIL = mo25552getAnchorLevel.LJIIL();
            }
            anchorLevel = anchorLevel2;
        }
        this.anchorLevel = anchorLevel;
        this.createTime = iUser.getCreateTime();
        this.ownRoom = iUser.getOwnRoom();
        this.linkMicStats = iUser.getLinkMicStats();
        if (iUser.getUserBadges() != null) {
            arrayList3 = new ArrayList(iUser.getUserBadges());
        } else {
            arrayList3 = null;
        }
        this.userBadges = arrayList3;
        if (iUser.getNewUserBadges() != null) {
            arrayList4 = new ArrayList(iUser.getNewUserBadges());
        } else {
            arrayList4 = null;
        }
        this.newUserBadges = arrayList4;
        this.backgroundImgUrl = iUser.getBackgroundImgUrl();
        this.telephone = iUser.getTelephone();
        this.experience = iUser.getExperience();
        this.status = iUser.getStatus();
        this.modifyTime = iUser.getModifyTime();
        this.secret = iUser.getSecret();
        this.shareQrcodeUri = iUser.getShareQrcodeUri();
        this.incomeSharePercent = iUser.getIncomeSharePercent();
        if (iUser.getBadgeImageList() != null) {
            arrayList5 = new ArrayList(iUser.getBadgeImageList());
        }
        this.badgeImageList = arrayList5;
        this.followInfo = iUser.getFollowInfo();
        this.userAttr = iUser.getUserAttr();
        this.anchorInfo = iUser.getAnchorInfo();
        this.secUid = iUser.getSecUid();
        this.enterprise = iUser.getEnterprise();
    }

    @Override // com.bytedance.android.live.base.model.user.IUser
    public void setVcdAdversaryAuthorizeState(boolean z, boolean z2) {
        this.adversaryAuthorizationInfo = 0;
        if (z) {
            this.adversaryAuthorizationInfo |= 1;
        }
        if (z2) {
            this.adversaryAuthorizationInfo |= 2;
        }
    }
}
