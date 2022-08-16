package com.bytedance.android.live.base.model.user;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p1594ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p1594ss.android.ugc.aweme.setting.model.p2560ab.ABOppoRedPointAppearAgainTimeInterval;
import com.umeng.commonsdk.config.C33817d;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _User_ProtoDecoder implements AbstractC10531b<User> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14261);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final User mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static User decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        User user = new User();
        user.topFans = new ArrayList();
        user.userBadges = new ArrayList();
        user.commerceConfigIds = new ArrayList();
        user.badgeImageList = new ArrayList();
        user.badgeImageListV2 = new ArrayList();
        user.mediaBadgeImageList = new ArrayList();
        user.newUserBadges = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 66) {
                    if (LIZIZ != 68) {
                        if (LIZIZ != 71) {
                            if (LIZIZ != 1013) {
                                if (LIZIZ != 1028) {
                                    switch (LIZIZ) {
                                        case 1:
                                            user.f25761id = QV1.LIZJ(c10532g);
                                            continue;
                                        case 2:
                                            user.shortId = QV1.LIZJ(c10532g);
                                            continue;
                                        case 3:
                                            user.nickName = QV1.LJFF(c10532g);
                                            continue;
                                        case 4:
                                            user.gender = QV1.LIZIZ(c10532g);
                                            continue;
                                        case 5:
                                            user.signature = QV1.LJFF(c10532g);
                                            continue;
                                        case 6:
                                            user.level = QV1.LIZIZ(c10532g);
                                            continue;
                                        case 7:
                                            user.birthday = QV1.LIZJ(c10532g);
                                            continue;
                                        case 8:
                                            user.telephone = QV1.LJFF(c10532g);
                                            continue;
                                        case 9:
                                            user.avatarThumb = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 10:
                                            user.avatarMedium = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 11:
                                            user.avatarLarge = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 12:
                                            user.isVerified = QV1.LIZ(c10532g);
                                            continue;
                                        case 13:
                                            user.experience = QV1.LIZIZ(c10532g);
                                            continue;
                                        case 14:
                                            user.city = QV1.LJFF(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_HAT_X /* 15 */:
                                            user.status = QV1.LIZIZ(c10532g);
                                            continue;
                                        case 16:
                                            user.createTime = QV1.LIZJ(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                                            user.modifyTime = QV1.LIZJ(c10532g);
                                            continue;
                                        case 18:
                                            user.secret = QV1.LIZIZ(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                                            user.shareQrcodeUri = QV1.LJFF(c10532g);
                                            continue;
                                        case 20:
                                            user.incomeSharePercent = QV1.LIZIZ(c10532g);
                                            continue;
                                        case 21:
                                            user.badgeImageList.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                                            continue;
                                        case MotionEventCompat.AXIS_GAS /* 22 */:
                                            user.followInfo = _FollowInfo_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_BRAKE /* 23 */:
                                            user.userHonor = _UserHonor_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                                            user.fansClub = _FansClubMember_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_TILT /* 25 */:
                                            user.border = _BorderInfo_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 26:
                                            user.specialId = QV1.LJFF(c10532g);
                                            continue;
                                        case 27:
                                            user.avatarBorder = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 28:
                                            user.medal = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case 29:
                                            user.userBadges.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                                            continue;
                                        case 30:
                                            user.newUserBadges.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                                            continue;
                                        case 31:
                                            user.topVipNo = (int) QV1.LIZJ(c10532g);
                                            continue;
                                        case 32:
                                            user.userAttr = _UserAttr_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                                            user.ownRoom = _User_OwnRoom_ProtoDecoder.decodeStatic(c10532g);
                                            continue;
                                        default:
                                            switch (LIZIZ) {
                                                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                                                    user.fanTicketCount = QV1.LIZJ(c10532g);
                                                    continue;
                                                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                                                    user.anchorInfo = _AnchorInfo_ProtoDecoder.decodeStatic(c10532g);
                                                    continue;
                                                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                                                    user.linkMicStats = QV1.LIZIZ(c10532g);
                                                    continue;
                                                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                                                    user.displayId = QV1.LJFF(c10532g);
                                                    continue;
                                                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                                                    user.enableShowCommerceSale = QV1.LIZ(c10532g);
                                                    continue;
                                                    continue;
                                                default:
                                                    switch (LIZIZ) {
                                                        case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                                                            user.payScores = QV1.LIZJ(c10532g);
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                                            user.anchorLevel = _AnchorLevel_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                                            user.verifiedContent = QV1.LJFF(c10532g);
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                                            user.authorInfo = _Author_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                                            user.topFans.add(decodeStatic(c10532g));
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                                            user.secUid = QV1.LJFF(c10532g);
                                                            continue;
                                                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                                            user.userRole = QV1.LIZIZ(c10532g);
                                                            continue;
                                                        case 48:
                                                            user.xiguaUserParams = _XiguaUserParams_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 49:
                                                            user.rewardInfo = _ActivityRewardInfo_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 50:
                                                            user.nobleLevelInfo = _NobleLevelInfo_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20:
                                                            user.fraternityInfo = _FraternityInfo_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 52:
                                                            user.personalCard = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 53:
                                                            user.mAuthenticationInfo = _AuthenticationInfo_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 54:
                                                            user.authorizationInfo = QV1.LIZIZ(c10532g);
                                                            continue;
                                                        case 55:
                                                            user.adversaryAuthorizationInfo = QV1.LIZIZ(c10532g);
                                                            continue;
                                                        case 56:
                                                            user.poiInfo = _PoiInfo_ProtoDecoder.decodeStatic(c10532g);
                                                            continue;
                                                        case 57:
                                                            user.mediaBadgeImageList.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                                                            continue;
                                                        case 58:
                                                            user.adversaryUserStatus = QV1.LIZIZ(c10532g);
                                                            continue;
                                                            continue;
                                                        default:
                                                            switch (LIZIZ) {
                                                                case ABOppoRedPointAppearAgainTimeInterval.VALUE_60 /* 60 */:
                                                                    user.commerceConfigIds.add(Long.valueOf(QV1.LIZJ(c10532g)));
                                                                    continue;
                                                                case 61:
                                                                    user.badgeImageListV2.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                                                                    continue;
                                                                case BaseNotice.CREATOR /* 62 */:
                                                                    user.industryCertification = _IndustryCertification_ProtoDecoder.decodeStatic(c10532g);
                                                                    continue;
                                                                case LegoCommitOptExperiment.ALL /* 63 */:
                                                                    user.locationCity = QV1.LJFF(c10532g);
                                                                    continue;
                                                                case C33817d.f42505g /* 64 */:
                                                                    user.fansGroupInfo = _FansGroupInfo_ProtoDecoder.decodeStatic(c10532g);
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    switch (LIZIZ) {
                                                                        case 1043:
                                                                            user.verifiedReason = QV1.LJFF(c10532g);
                                                                            continue;
                                                                        case 1044:
                                                                            user.enableCarManagementPermission = QV1.LIZ(c10532g);
                                                                            continue;
                                                                        case 1045:
                                                                            user.ageRange = QV1.LIZIZ(c10532g);
                                                                            continue;
                                                                        case 1046:
                                                                            user.userWatchMonth = (int) QV1.LIZJ(c10532g);
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            QV1.LJII(c10532g);
                                                                            continue;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    user.idStr = QV1.LJFF(c10532g);
                                }
                            } else {
                                user.backgroundImgUrl = QV1.LJFF(c10532g);
                            }
                        } else {
                            user.isAnonymous = QV1.LIZ(c10532g);
                        }
                    } else {
                        user.safeNicName = QV1.LJFF(c10532g);
                    }
                } else {
                    user.mysteryMan = QV1.LIZIZ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return user;
            }
        }
    }
}
