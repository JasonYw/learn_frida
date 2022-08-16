package com.bytedance.android.live.base.model.user;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _NewProfileUser_ProtoDecoder implements AbstractC10531b<NewProfileUser> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14232);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final NewProfileUser mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (NewProfileUser) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static NewProfileUser decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (NewProfileUser) proxy.result;
        }
        NewProfileUser newProfileUser = new NewProfileUser();
        newProfileUser.actionConfig = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        newProfileUser.baseProfileInfo = _BaseProfileInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 2:
                        newProfileUser.followInfo = _ProfileFollowInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 3:
                        newProfileUser.accountStats = _AccountStats_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 4:
                        newProfileUser.fansClub = _ProfileFansClub_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        newProfileUser.ownRoom = _ProfileOwnRoom_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        newProfileUser.actionConfig.add(_ActionConfig_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 7:
                        newProfileUser.anchorLiveConfig = _BroadcastConfig_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 8:
                        newProfileUser.grade = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                        newProfileUser.adminInfo = _AdminInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 10:
                        newProfileUser.contributor = _Contributor_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 11:
                        newProfileUser.activityBadges = _ActivityBadges_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 12:
                        newProfileUser.mProfileSkin = _ProfileSkin_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 13:
                        newProfileUser.newAuthInfo = _NewAuthenticationInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 14:
                        newProfileUser.isMuted = QV1.LIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        newProfileUser.authorizationInfo = QV1.LIZIZ(c10532g);
                        break;
                    case 16:
                        newProfileUser.adversaryAuthorizationInfo = QV1.LIZIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        newProfileUser.industryCertification = _IndustryCertification_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 18:
                        newProfileUser.fansGroupInfo = _FansGroupInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        newProfileUser.mAuthenticationInfo = _AuthenticationInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 20:
                        newProfileUser.giftExhibitionInfo = _GiftExhibitionHomeStats_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 21:
                        newProfileUser.honorWallUi = _HonorWallUi_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        newProfileUser.actionConfigs = _ActionConfigs_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                    case 27:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        newProfileUser.shopEntrance = _ShopEntrance_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 26:
                        newProfileUser.subscribeInfo = _SubscribeInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 28:
                        newProfileUser.ecomInfo = _EcomInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 29:
                        newProfileUser.profileSetting = _ProfileSetting_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 30:
                        newProfileUser.profileStyleParams = _ProfileStyleParams_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 31:
                        newProfileUser.industryCertificationProfile = _IndustryCertificationProfile_ProtoDecoder.decodeStatic(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return newProfileUser;
            }
        }
    }
}
