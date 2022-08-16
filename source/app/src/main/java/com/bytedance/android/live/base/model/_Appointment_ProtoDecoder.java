package com.bytedance.android.live.base.model;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.Appointment;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _Appointment_ProtoDecoder implements AbstractC10531b<Appointment> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13967);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final Appointment mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Appointment) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static Appointment decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Appointment) proxy.result;
        }
        Appointment appointment = new Appointment();
        appointment.liveExtractsMap = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        appointment.appointmentId = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        appointment.appointmentType = (int) QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        appointment.anchorId = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        appointment.roomId = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        appointment.startTime = QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        appointment.endTime = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        appointment.insidePushText = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        appointment.insidePushTitle = QV1.LJFF(c10532g);
                        break;
                    case 9:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 10:
                        appointment.subscriberCount = (int) QV1.LIZJ(c10532g);
                        break;
                    case 11:
                        appointment.operator = QV1.LJFF(c10532g);
                        break;
                    case 12:
                        appointment.dueStartTime = String.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 13:
                        appointment.appointmentIdStr = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        appointment.anchorIdStr = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        appointment.roomIdStr = QV1.LJFF(c10532g);
                        break;
                    case 16:
                        appointment.groupId = String.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        appointment.title = QV1.LJFF(c10532g);
                        break;
                    case 18:
                        appointment.subTitle = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        appointment.coverImgUrl = QV1.LJFF(c10532g);
                        break;
                    case 20:
                        appointment.programJumpUrl = QV1.LJFF(c10532g);
                        break;
                    case 21:
                        appointment.secAnchorId = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        long LIZ2 = c10532g.LIZ();
                        Long l = null;
                        Appointment.LiveFragments liveFragments = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 != -1) {
                                if (LIZIZ2 != 1) {
                                    if (LIZIZ2 == 2) {
                                        liveFragments = _Appointment_LiveFragments_ProtoDecoder.decodeStatic(c10532g);
                                    }
                                } else {
                                    l = Long.valueOf(QV1.LIZJ(c10532g));
                                }
                            } else {
                                c10532g.LIZ(LIZ2);
                                if (l != null) {
                                    if (liveFragments != null) {
                                        appointment.liveExtractsMap.put(l, liveFragments);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        appointment.isLiving = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        appointment.isReserved = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        appointment.showStatus = (int) QV1.LIZJ(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return appointment;
            }
        }
    }
}
