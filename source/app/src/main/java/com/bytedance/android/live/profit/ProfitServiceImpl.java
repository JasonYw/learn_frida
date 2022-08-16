package com.bytedance.android.live.profit;

import android.content.Context;
import com.bytedance.android.live.profit.api.AbstractC5247a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC91107Luv;
import p003X.C106862S5w;
import p003X.C91106Luu;
import p003X.IQX;
import p003X.QAI;
import p003X.QAJ;
import p003X.QAS;
import p003X.QAT;
import p003X.QAU;

/* loaded from: classes8.dex */
public class ProfitServiceImpl implements QAU {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33218);
    }

    @Override // p003X.AbstractC446293l1
    public AbstractC91107Luv getPrivilegeSlardarMonitor() {
        return C91106Luu.LIZIZ;
    }

    @Override // p003X.AbstractC446293l1
    public <RC extends C13491f> AbstractC5247a createProfitContext(Context context, RC rc, DataCenter dataCenter) {
        QAT qaj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, rc, dataCenter}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC5247a) proxy.result;
        }
        C106862S5w.LIZ(context, rc, dataCenter);
        C5280j c5280j = new C5280j();
        IQX.LIZ(c5280j, AbstractC5247a.class);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, QAI.LIZ, true, 1);
        if (proxy2.isSupported) {
            qaj = (QAT) proxy2.result;
        } else {
            qaj = new QAJ((byte) 0);
        }
        QAS LIZ = qaj.LIZ(context).LIZ((C5923dp) rc).LIZ(c5280j).LIZ(dataCenter).LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LIZ();
        return c5280j;
    }
}
