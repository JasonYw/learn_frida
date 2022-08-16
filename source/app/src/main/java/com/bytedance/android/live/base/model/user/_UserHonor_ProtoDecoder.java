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
public final class _UserHonor_ProtoDecoder implements AbstractC10531b<UserHonor> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14257);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final UserHonor mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (UserHonor) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static UserHonor decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (UserHonor) proxy.result;
        }
        UserHonor userHonor = new UserHonor();
        userHonor.LJIILL = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1001) {
                    switch (LIZIZ) {
                        case 1:
                            userHonor.LJI = QV1.LIZJ(c10532g);
                            continue;
                        case 2:
                            userHonor.LIZIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 3:
                            userHonor.LJFF = QV1.LJFF(c10532g);
                            continue;
                        case 4:
                            userHonor.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 5:
                            userHonor.f25762LJ = QV1.LJFF(c10532g);
                            continue;
                        case 6:
                            userHonor.LJIILJJIL = (int) QV1.LIZJ(c10532g);
                            continue;
                        case 7:
                            userHonor.LIZLLL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 8:
                            userHonor.LJIIIIZZ = QV1.LIZJ(c10532g);
                            continue;
                        case 9:
                            userHonor.LJII = QV1.LIZJ(c10532g);
                            continue;
                        case 10:
                            userHonor.LJIJ = QV1.LIZJ(c10532g);
                            continue;
                        case 11:
                            userHonor.LJIIZILJ = QV1.LIZJ(c10532g);
                            continue;
                        case 12:
                            userHonor.LJJ = QV1.LIZJ(c10532g);
                            continue;
                        case 13:
                            userHonor.LJIILLIIL = QV1.LJFF(c10532g);
                            continue;
                        case 14:
                            userHonor.LJIILL.add(_GradeIcon_ProtoDecoder.decodeStatic(c10532g));
                            continue;
                        case MotionEventCompat.AXIS_HAT_X /* 15 */:
                            userHonor.LJJII = QV1.LIZJ(c10532g);
                            continue;
                        case 16:
                            userHonor.LJIIIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                            userHonor.LJIIJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 18:
                            userHonor.LJIIL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                            userHonor.LJIIJJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 20:
                            userHonor.LJIILIIL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 21:
                            userHonor.LJIJJLI = QV1.LIZJ(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_GAS /* 22 */:
                            userHonor.LJJI = QV1.LJFF(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_BRAKE /* 23 */:
                            userHonor.LJIJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                            userHonor.LJIJJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_TILT /* 25 */:
                            userHonor.LJJIFFI = QV1.LIZJ(c10532g);
                            continue;
                        case 26:
                            userHonor.LJJIII = _GradeBuffInfo_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        default:
                            QV1.LJII(c10532g);
                            continue;
                    }
                } else {
                    userHonor.LJIL = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return userHonor;
            }
        }
    }
}
