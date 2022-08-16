package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.AbstractC109983TRx;
import p003X.AbstractC109984TRy;

/* loaded from: classes11.dex */
public interface IUser {
    static {
        Covode.recordClassIndex(14154);
    }

    boolean childrenManagerForbidCreateLiveRoom();

    boolean childrenManagerForbidWalletFunctions();

    int getAgeRange();

    AnchorInfo getAnchorInfo();

    /* renamed from: getAnchorLevel */
    AbstractC109984TRy mo25552getAnchorLevel();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getAvatarUrl();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getBirthday();

    String getCity();

    long getCreateTime();

    String getDisplayId();

    int getEnterprise();

    int getExperience();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    int getGender();

    long getId();

    int getIncomeSharePercent();

    int getLevel();

    int getLinkMicStats();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    User.OwnRoom getOwnRoom();

    PoiInfo getPoiInfo();

    String getRealNickName();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    long getShortId();

    String getSignature();

    int getStatus();

    String getTelephone();

    List<User> getTopFans();

    int getTopVipNo();

    UserAttr getUserAttr();

    List<ImageModel> getUserBadges();

    /* renamed from: getUserHonor */
    AbstractC109983TRx mo25553getUserHonor();

    int getUserWatchMonth();

    boolean getUserWatchMonthValid();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isVcdAdversaryContentAuthorized();

    boolean isVcdAdversaryRelationAuthorized();

    boolean isVcdContentAuthorized();

    boolean isVerified();

    boolean isWithCommercePermission();

    void setFollowStatus(int i);

    void setUserAttr(UserAttr userAttr);

    void setUserWatchMonthValid(boolean z);

    void setVcdAdversaryAuthorizeState(boolean z, boolean z2);

    /* loaded from: classes12.dex */
    public enum Status {
        Login,
        Logout,
        Update;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Status[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Status[]) proxy.result;
            }
            return (Status[]) values().clone();
        }

        static {
            Covode.recordClassIndex(14155);
        }

        public static Status valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Status) proxy.result;
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }
}
