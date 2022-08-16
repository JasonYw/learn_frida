package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.g */
/* loaded from: classes5.dex */
public final class C3762g {
    public static ChangeQuickRedirect LIZ;
    public List<C3380j> LIZIZ = new ArrayList();

    static {
        Covode.recordClassIndex(21343);
    }

    public final void LIZ(List<C3380j> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZIZ.addAll(list);
    }
}
