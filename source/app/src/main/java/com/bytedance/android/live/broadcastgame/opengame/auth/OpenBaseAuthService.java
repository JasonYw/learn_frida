package com.bytedance.android.live.broadcastgame.opengame.auth;

import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11521a;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11525e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes26.dex */
public class OpenBaseAuthService implements AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public C3682x LIZIZ;

    static {
        Covode.recordClassIndex(19909);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported;
    }

    public C3682x LIZ() {
        return this.LIZIZ;
    }

    public OpenBaseAuthService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZIZ = c3682x;
    }

    public void LIZ(String str, AbstractC11525e abstractC11525e) {
        if (PatchProxy.proxy(new Object[]{str, abstractC11525e}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC11525e);
        abstractC11525e.LIZ("feature not support");
    }

    public void LIZIZ(String str, AbstractC11525e abstractC11525e) {
        if (PatchProxy.proxy(new Object[]{str, abstractC11525e}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC11525e);
        abstractC11525e.LIZ("feature not support");
    }

    public void LIZ(String str, String str2, List<String> list, JSONObject jSONObject, AbstractC11521a abstractC11521a) {
        if (PatchProxy.proxy(new Object[]{str, str2, list, jSONObject, abstractC11521a}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2, list, jSONObject, abstractC11521a);
        abstractC11521a.LIZ("feature not support");
    }
}
