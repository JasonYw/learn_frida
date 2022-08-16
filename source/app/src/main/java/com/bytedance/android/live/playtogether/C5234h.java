package com.bytedance.android.live.playtogether;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC88815Kz3;
import p003X.AbstractC89645LTr;
import p003X.LUY;

/* renamed from: com.bytedance.android.live.playtogether.h */
/* loaded from: classes5.dex */
public final class C5234h implements AbstractC89645LTr {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(32997);
    }

    @Override // p003X.AbstractC89645LTr
    public final AbstractC88815Kz3 LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC88815Kz3) proxy.result;
        }
        return new LUY();
    }
}
