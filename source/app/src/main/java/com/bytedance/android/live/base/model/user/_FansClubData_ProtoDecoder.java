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
public final class _FansClubData_ProtoDecoder implements AbstractC10531b<FansClubData> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14217);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final FansClubData mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (FansClubData) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static FansClubData decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FansClubData) proxy.result;
        }
        FansClubData fansClubData = new FansClubData();
        fansClubData.availableGiftIds = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        fansClubData.clubName = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        fansClubData.level = QV1.LIZIZ(c10532g);
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = QV1.LIZIZ(c10532g);
                        break;
                    case 4:
                        fansClubData.badge = _FansClubData_UserBadge_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        fansClubData.availableGiftIds.add(Long.valueOf(QV1.LIZJ(c10532g)));
                        break;
                    case 6:
                        fansClubData.anchorId = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return fansClubData;
            }
        }
    }
}
