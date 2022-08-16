package com.bytedance.android.live.broadcastgame.api.dummy;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.broadcastgame.api.p284c.p285a.a$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.E78;
import p003X.KMW;

/* loaded from: classes5.dex */
public final class QRCodeServiceDummy implements KMW {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19088);
    }

    @Override // p003X.KMW
    public final E78 createQRCodeFragment(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (E78) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        return null;
    }

    @Override // p003X.KMW
    public final void startScanQRCode(Context context, a$a a_a) {
        if (PatchProxy.proxy(new Object[]{context, a_a}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
    }
}
