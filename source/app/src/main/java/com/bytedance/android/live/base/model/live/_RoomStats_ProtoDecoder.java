package com.bytedance.android.live.base.model.live;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _RoomStats_ProtoDecoder implements AbstractC10531b<RoomStats> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14076);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final RoomStats mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (RoomStats) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static RoomStats decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (RoomStats) proxy.result;
        }
        RoomStats roomStats = new RoomStats();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        roomStats.f25747id = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        roomStats.idStr = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        roomStats.ticket = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        roomStats.money = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        roomStats.totalUser = (int) QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        roomStats.giftUVCount = (int) QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        roomStats.followCount = (int) QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        roomStats.userComposition = _RoomStats_UserComposition_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                    case 10:
                    case 14:
                    case 18:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 11:
                        roomStats.enterCount = (int) QV1.LIZJ(c10532g);
                        break;
                    case 12:
                        roomStats.douPlusPromotion = QV1.LJFF(c10532g);
                        break;
                    case 13:
                        roomStats.totalUserDesp = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        roomStats.totalUserStr = QV1.LJFF(c10532g);
                        break;
                    case 16:
                        roomStats.userCountStr = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        roomStats.commentCount = (int) QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        roomStats.topRightStr = QV1.LJFF(c10532g);
                        break;
                    case 20:
                        roomStats.topRightStrComplete = QV1.LJFF(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return roomStats;
            }
        }
    }
}
