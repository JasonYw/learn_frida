package com.android.ttcjpaysdk.bindcard.quickbind;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayQuickbindService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C135876cI3;

/* loaded from: classes17.dex */
public final class CJPayQuickbindProvider implements ICJPayQuickbindService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7209);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.bindcard.quickbind";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayQuickbindService
    public final void doQuickBindCard(ICJPayQuickbindService.IQuickbindContextDepend iQuickbindContextDepend) {
        if (PatchProxy.proxy(new Object[]{iQuickbindContextDepend}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(iQuickbindContextDepend);
        C135876cI3.f17973LJ.LIZ(CJPayHostInfo.Companion.LIZ(iQuickbindContextDepend.getCJPayHostInfo()));
        if (!PatchProxy.proxy(new Object[]{iQuickbindContextDepend}, C135876cI3.f17973LJ, C135876cI3.LIZ, false, 8).isSupported) {
            C106862S5w.LIZ(iQuickbindContextDepend);
            C135876cI3.LIZIZ = iQuickbindContextDepend;
        }
    }
}
