package com.android.ttcjpaysdk.bdpay.bindcard.normal;

import android.app.Activity;
import com.android.ttcjpaysdk.base.service.ICJPayNewCardCallback;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.ICJPayTimeTrackCallback;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135720cFX;
import p003X.C106862S5w;
import p003X.C135716cFT;
import p003X.C135721cFY;
import p003X.C135723cFa;
import p003X.C135724cFb;
import p003X.C135726cFd;
import p003X.C135728cFf;
import p003X.C135729cFg;
import p003X.C135733cFk;
import p003X.C135734cFl;
import p003X.C135876cI3;

/* loaded from: classes17.dex */
public final class CJPayNormalBindCardProvider implements ICJPayNormalBindCardService {
    public static ChangeQuickRedirect LIZ;
    public static INormalBindCardCallback LIZIZ;
    public static final C135729cFg LIZJ = new C135729cFg((byte) 0);

    static {
        Covode.recordClassIndex(6750);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.bdpay.bindcard.normal";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService
    public final INormalBindCardCallback getNormalBindCardCallback() {
        return LIZIZ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService
    public final void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZIZ = null;
        setPayNewCardCallback(null);
        setPayTimeTrackCallback(null);
        C135734cFl.LIZ("");
        C135734cFl.LIZ(0);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService
    public final void setPayNewCardCallback(ICJPayNewCardCallback iCJPayNewCardCallback) {
        if (PatchProxy.proxy(new Object[]{iCJPayNewCardCallback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C135876cI3.LIZLLL = iCJPayNewCardCallback;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService
    public final void setPayTimeTrackCallback(ICJPayTimeTrackCallback iCJPayTimeTrackCallback) {
        if (PatchProxy.proxy(new Object[]{iCJPayTimeTrackCallback}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C135726cFd.LIZJ = iCJPayTimeTrackCallback;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService
    public final void startBindCardProcess(Activity activity, ICJPayNormalBindCardService.BindCardType bindCardType, NormalBindCardBean normalBindCardBean, INormalBindCardCallback iNormalBindCardCallback) {
        AbstractC135720cFX c135723cFa;
        if (PatchProxy.proxy(new Object[]{activity, bindCardType, normalBindCardBean, iNormalBindCardCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, bindCardType, normalBindCardBean);
        LIZIZ = iNormalBindCardCallback;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bindCardType}, C135733cFk.LIZIZ, C135733cFk.LIZ, false, 1);
        if (proxy.isSupported) {
            c135723cFa = (AbstractC135720cFX) proxy.result;
        } else {
            C106862S5w.LIZ(bindCardType);
            int i = C135728cFf.LIZ[bindCardType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        c135723cFa = new C135721cFY();
                    } else {
                        c135723cFa = new C135716cFT();
                    }
                } else {
                    c135723cFa = new C135724cFb();
                }
            } else {
                c135723cFa = new C135723cFa();
            }
        }
        if (c135723cFa != null) {
            c135723cFa.LIZ(activity, bindCardType, normalBindCardBean);
        }
    }
}
