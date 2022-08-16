package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.Appointment;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _Appointment_LiveFragments_ProtoDecoder implements AbstractC10531b<Appointment.LiveFragments> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13966);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final Appointment.LiveFragments mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Appointment.LiveFragments) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static Appointment.LiveFragments decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Appointment.LiveFragments) proxy.result;
        }
        Appointment.LiveFragments liveFragments = new Appointment.LiveFragments();
        liveFragments.extractItemIds = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    liveFragments.extractItemIds.add(Long.valueOf(QV1.LIZJ(c10532g)));
                }
            } else {
                c10532g.LIZ(LIZ);
                return liveFragments;
            }
        }
    }
}
