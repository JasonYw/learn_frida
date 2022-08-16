package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.livesdk.chatroom.C5927dv;
import com.bytedance.android.livesdkapi.depend.model.live.abs.AbstractC9489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p003X.C2WC;
import p003X.C423702pg;

/* renamed from: com.bytedance.android.live.profit.fansclub.h */
/* loaded from: classes12.dex */
public final class C5263h {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(33289);
    }

    public final AbstractC9489d LIZ(DataCenter dataCenter) {
        C2WC<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC9489d) proxy.result;
        }
        C5927dv LIZ2 = C5927dv.LJII.LIZ();
        if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && LJIILJJIL.LIZ().booleanValue()) {
            return C423702pg.m24965LJ(dataCenter);
        }
        return null;
    }
}
