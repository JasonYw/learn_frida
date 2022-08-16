package com.bytedance.android.live.liveinteract.multianchor.model;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _ListUserLinkmicAudienceContent_ProtoDecoder implements AbstractC10531b<ListUserLinkmicAudienceContent> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28151);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ListUserLinkmicAudienceContent mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ListUserLinkmicAudienceContent) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ListUserLinkmicAudienceContent decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ListUserLinkmicAudienceContent) proxy.result;
        }
        ListUserLinkmicAudienceContent listUserLinkmicAudienceContent = new ListUserLinkmicAudienceContent();
        listUserLinkmicAudienceContent.f26350LJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        listUserLinkmicAudienceContent.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        listUserLinkmicAudienceContent.LJFF = QV1.LIZ(c10532g);
                        break;
                    case 3:
                        listUserLinkmicAudienceContent.LJII = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        listUserLinkmicAudienceContent.LJI = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        listUserLinkmicAudienceContent.LJIIIIZZ = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        listUserLinkmicAudienceContent.LJIIJJI = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        listUserLinkmicAudienceContent.LJIIL = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        listUserLinkmicAudienceContent.LJIIIZ = QV1.LIZ(c10532g);
                        break;
                    case 9:
                        listUserLinkmicAudienceContent.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    case 10:
                        listUserLinkmicAudienceContent.LJIILIIL = QV1.LIZJ(c10532g);
                        break;
                    case 11:
                        listUserLinkmicAudienceContent.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 12:
                        listUserLinkmicAudienceContent.LJIILL = QV1.LIZIZ(c10532g);
                        break;
                    case 13:
                        listUserLinkmicAudienceContent.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        listUserLinkmicAudienceContent.f26350LJ.add(Long.valueOf(QV1.LIZJ(c10532g)));
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        listUserLinkmicAudienceContent.LJIILLIIL = _MicDress_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 16:
                        listUserLinkmicAudienceContent.LJIIZILJ = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        listUserLinkmicAudienceContent.LJIILJJIL = QV1.LIZ(c10532g);
                        break;
                    case 18:
                        listUserLinkmicAudienceContent.LJIJI = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        listUserLinkmicAudienceContent.LJIJ = QV1.LIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return listUserLinkmicAudienceContent;
            }
        }
    }
}
