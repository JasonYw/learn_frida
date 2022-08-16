package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public class NewProfileUser {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("account_stats")
    public AccountStats accountStats;
    @SerializedName("action_config")
    public List<ActionConfig> actionConfig;
    @SerializedName("action_configs")
    public ActionConfigs actionConfigs;
    @SerializedName("activity_badges")
    public ActivityBadges activityBadges;
    @SerializedName("admin_info")
    public AdminInfo adminInfo;
    @SerializedName("adversary_authorization_info")
    public int adversaryAuthorizationInfo;
    @SerializedName("broadcast_config")
    public BroadcastConfig anchorLiveConfig;
    @SerializedName("authorization_info")
    public int authorizationInfo;
    @SerializedName("base_info")
    public BaseProfileInfo baseProfileInfo = new BaseProfileInfo();
    @SerializedName("contributor")
    public Contributor contributor;
    @SerializedName("ecom_info")
    public EcomInfo ecomInfo;
    @SerializedName("fans_club")
    public ProfileFansClub fansClub;
    @SerializedName("fans_group_info")
    public FansGroupInfo fansGroupInfo;
    @SerializedName("follow_info")
    public ProfileFollowInfo followInfo;
    public boolean fromOtherIntercomRoom;
    @SerializedName("gift_exhibition_home_stats")
    public GiftExhibitionHomeStats giftExhibitionInfo;
    @SerializedName("grade")
    public ImageModel grade;
    @SerializedName("honor_wall_ui")
    public HonorWallUi honorWallUi;
    @SerializedName("industry_certification")
    public IndustryCertification industryCertification;
    @SerializedName("industry_certification_profile")
    public IndustryCertificationProfile industryCertificationProfile;
    @SerializedName("is_muted")
    public boolean isMuted;
    @SerializedName("authentication_info")
    public AuthenticationInfo mAuthenticationInfo;
    @SerializedName("profile_skin")
    public ProfileSkin mProfileSkin;
    @SerializedName("auth_info")
    public NewAuthenticationInfo newAuthInfo;
    @SerializedName("own_room")
    public ProfileOwnRoom ownRoom;
    @SerializedName("profile_setting")
    public ProfileSetting profileSetting;
    @SerializedName("profile_style_params")
    public ProfileStyleParams profileStyleParams;
    @SerializedName("shop_entrance")
    public ShopEntrance shopEntrance;
    @SerializedName("subscribe_info")
    public SubscribeInfo subscribeInfo;

    static {
        Covode.recordClassIndex(14161);
    }

    public EcomInfo getEcomInfo() {
        return this.ecomInfo;
    }

    public IndustryCertification getIndustryCertification() {
        return this.industryCertification;
    }

    public ProfileSetting getProfileSetting() {
        return this.profileSetting;
    }

    public ProfileStyleParams getProfileStyleParams() {
        return this.profileStyleParams;
    }

    public boolean isFromOtherIntercomRoom() {
        return this.fromOtherIntercomRoom;
    }

    public boolean isVcdContentAuthorized() {
        if ((this.authorizationInfo & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean canJumpToLiveRoom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ProfileOwnRoom profileOwnRoom = this.ownRoom;
        if (profileOwnRoom != null && !profileOwnRoom.canJumpToLiveRoom()) {
            return false;
        }
        return true;
    }

    public long getLiveRoomId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        ProfileOwnRoom profileOwnRoom = this.ownRoom;
        if (profileOwnRoom == null) {
            return 0L;
        }
        return profileOwnRoom.getId();
    }

    public boolean isEnterpriseVerify() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AuthenticationInfo authenticationInfo = this.mAuthenticationInfo;
        if (authenticationInfo == null || TextUtils.isEmpty(authenticationInfo.enterpriseVerifyReason)) {
            return false;
        }
        return true;
    }

    public boolean isFollowed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ProfileFollowInfo profileFollowInfo = this.followInfo;
        if (profileFollowInfo == null) {
            return false;
        }
        if (profileFollowInfo.getFollowStatus() != 2 && this.followInfo.getFollowStatus() != 3) {
            return false;
        }
        return true;
    }

    public boolean isFollowing() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ProfileFollowInfo profileFollowInfo = this.followInfo;
        if (profileFollowInfo == null) {
            return false;
        }
        if (profileFollowInfo.getFollowStatus() != 2 && this.followInfo.getFollowStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isPersonVerify() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AuthenticationInfo authenticationInfo = this.mAuthenticationInfo;
        if (authenticationInfo == null || TextUtils.isEmpty(authenticationInfo.customVerify)) {
            return false;
        }
        return true;
    }

    public String getDisplayName() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        ProfileFollowInfo profileFollowInfo = this.followInfo;
        if (profileFollowInfo != null && !TextUtils.isEmpty(profileFollowInfo.getRemarkName())) {
            return this.followInfo.getRemarkName();
        }
        BaseProfileInfo baseProfileInfo = this.baseProfileInfo;
        if (baseProfileInfo != null) {
            if (!TextUtils.isEmpty(baseProfileInfo.remarkName)) {
                return this.baseProfileInfo.remarkName;
            }
            return this.baseProfileInfo.nickName;
        }
        return null;
    }

    public void setFromOtherIntercomRoom(boolean z) {
        this.fromOtherIntercomRoom = z;
    }

    public void setIndustryCertification(IndustryCertification industryCertification) {
        this.industryCertification = industryCertification;
    }

    public void setFollowStatus(int i) {
        ProfileFollowInfo profileFollowInfo;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported && (profileFollowInfo = this.followInfo) != null) {
            profileFollowInfo.setFollowStatus(i);
        }
    }
}
