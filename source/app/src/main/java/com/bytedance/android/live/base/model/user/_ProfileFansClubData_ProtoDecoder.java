package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _ProfileFansClubData_ProtoDecoder implements AbstractC10531b<ProfileFansClubData> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14242);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileFansClubData mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileFansClubData) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileFansClubData decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileFansClubData) proxy.result;
        }
        ProfileFansClubData profileFansClubData = new ProfileFansClubData();
        profileFansClubData.availableGiftIds = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        profileFansClubData.clubName = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        profileFansClubData.level = QV1.LIZIZ(c10532g);
                        break;
                    case 3:
                        profileFansClubData.userFansClubStatus = QV1.LIZIZ(c10532g);
                        break;
                    case 4:
                        profileFansClubData.badge = _ProfileFansClubData_ProfileUserBadge_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        profileFansClubData.availableGiftIds.add(Long.valueOf(QV1.LIZJ(c10532g)));
                        break;
                    case 6:
                        profileFansClubData.anchorId = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return profileFansClubData;
            }
        }
    }
}