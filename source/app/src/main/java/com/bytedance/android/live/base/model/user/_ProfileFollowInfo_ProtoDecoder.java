package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _ProfileFollowInfo_ProtoDecoder implements AbstractC10531b<ProfileFollowInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14244);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileFollowInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileFollowInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileFollowInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileFollowInfo) proxy.result;
        }
        ProfileFollowInfo profileFollowInfo = new ProfileFollowInfo();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        profileFollowInfo.followingCount = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 3:
                        profileFollowInfo.followerCount = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        profileFollowInfo.followerCountEnable = QV1.LIZ(c10532g);
                        break;
                    case 5:
                        profileFollowInfo.jumpFollowerListEnable = QV1.LIZ(c10532g);
                        break;
                    case 6:
                        profileFollowInfo.followStatus = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        profileFollowInfo.accounts.add(_MutualFollowUser_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 8:
                        profileFollowInfo.mutualFollowCount = QV1.LIZJ(c10532g);
                        break;
                    case 9:
                        profileFollowInfo.remarkName = QV1.LJFF(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return profileFollowInfo;
            }
        }
    }
}
