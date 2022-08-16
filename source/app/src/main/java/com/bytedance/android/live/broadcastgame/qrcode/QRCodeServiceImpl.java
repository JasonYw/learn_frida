package com.bytedance.android.live.broadcastgame.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.broadcastgame.api.p284c.p285a.a$a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C134529bwK;
import p003X.C144451eWj;
import p003X.E78;
import p003X.KMW;
import p003X.KTA;
import p003X.KTB;
import p003X.KTD;

/* loaded from: classes5.dex */
public class QRCodeServiceImpl implements KMW {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a$a scanResultListener;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(21814);
        } else {
            Covode.recordClassIndex(21814);
        }
    }

    public final a$a getScanResultListener() {
        return this.scanResultListener;
    }

    public QRCodeServiceImpl() {
        ServiceManager.registerService(KMW.class, this);
    }

    public final void setScanResultListener(a$a a_a) {
        this.scanResultListener = a_a;
    }

    public final void scanActivity(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C116971W2r.LIZ(context, new Intent(context, ((IHostApp) ServiceManager.getService(IHostApp.class)).getHostActivity(33)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.E78] */
    @Override // p003X.KMW
    public E78 createQRCodeFragment(Bundle bundle) {
        KTA kta;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (E78) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        KTD ktd = KTA.LIZJ;
        a$a a_a = this.scanResultListener;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bundle, a_a}, ktd, KTD.LIZ, false, 1);
        if (proxy2.isSupported) {
            kta = (E78) proxy2.result;
        } else {
            Bundle bundle2 = new Bundle();
            KTA kta2 = new KTA();
            bundle2.putBundle("extra", bundle);
            kta2.setArguments(bundle2);
            kta = kta2;
            if (a_a != null) {
                kta2.LIZIZ = a_a;
                kta = kta2;
            }
        }
        this.scanResultListener = null;
        return kta;
    }

    @Override // p003X.KMW
    public void startScanQRCode(Context context, a$a a_a) {
        if (PatchProxy.proxy(new Object[]{context, a_a}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        if (C144451eWj.LIZ(context, "android.permission.CAMERA")) {
            this.scanResultListener = a_a;
            scanActivity(context);
            return;
        }
        C134529bwK.LIZ((Activity) context).LIZ(new KTB(this, context, a_a), TokenCert.Companion.with("bpea-openplatform_lynx_debug_scan_qrcode"), "android.permission.CAMERA");
    }
}
