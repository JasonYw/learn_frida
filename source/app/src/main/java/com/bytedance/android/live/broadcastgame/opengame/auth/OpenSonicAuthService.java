package com.bytedance.android.live.broadcastgame.opengame.auth;

import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11521a;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11525e;
import com.bytedance.bdp.live.livecontainer.sonicgame.C11522b;
import com.bytedance.bdp.live.livecontainer.sonicgame.SonicMethodManager$getAuthSetting$1;
import com.bytedance.bdp.live.livecontainer.sonicgame.SonicMethodManager$openAuthSetting$1;
import com.bytedance.bdp.serviceapi.hostimpl.hostmethod.BdpInteractHostMethodService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.json.JSONObject;
import p003X.BLF;
import p003X.BLH;
import p003X.C106862S5w;
import p003X.C65629Bux;
import p003X.KW0;

/* loaded from: classes26.dex */
public final class OpenSonicAuthService extends OpenBaseAuthService {
    public static ChangeQuickRedirect LIZIZ;
    public C3682x LIZJ;

    static {
        Covode.recordClassIndex(19910);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.auth.OpenBaseAuthService
    public final C3682x LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSonicAuthService(C3682x c3682x) {
        super(c3682x);
        C106862S5w.LIZ(c3682x);
        this.LIZJ = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.auth.OpenBaseAuthService
    public final void LIZ(String str, AbstractC11525e abstractC11525e) {
        if (PatchProxy.proxy(new Object[]{str, abstractC11525e}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC11525e);
        BLF blf = BLF.LIZJ;
        C65629Bux c65629Bux = new C65629Bux(this, abstractC11525e);
        if (!PatchProxy.proxy(new Object[]{str, c65629Bux}, blf, BLF.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(str, c65629Bux);
            BdpInteractHostMethodService bdpInteractHostMethodService = BLF.LIZIZ;
            if (bdpInteractHostMethodService != null) {
                bdpInteractHostMethodService.openSetting(str, new SonicMethodManager$openAuthSetting$1(c65629Bux));
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.auth.OpenBaseAuthService
    public final void LIZIZ(String str, AbstractC11525e abstractC11525e) {
        if (PatchProxy.proxy(new Object[]{str, abstractC11525e}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC11525e);
        if (!PatchProxy.proxy(new Object[]{str, abstractC11525e}, BLF.LIZJ, BLF.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(str, abstractC11525e);
            BdpInteractHostMethodService bdpInteractHostMethodService = BLF.LIZIZ;
            if (bdpInteractHostMethodService != null) {
                bdpInteractHostMethodService.getSetting(str, new SonicMethodManager$getAuthSetting$1(abstractC11525e));
            }
        }
    }

    public final void LIZ(JSONObject jSONObject, List<C11522b> list) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{jSONObject, list}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, list);
        for (C11522b c11522b : list) {
            boolean optBoolean = jSONObject.optBoolean(c11522b.LIZLLL);
            KW0 kw0 = KW0.LIZIZ;
            long j = LIZ().LJIIIIZZ.LJI;
            String LIZ = LIZ().LJIIIIZZ.LIZ(LIZ().LJIIJ);
            String LIZLLL = ((BootInfoService) LIZ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL();
            if (!c11522b.LIZIZ && !optBoolean) {
                z = false;
            } else {
                z = true;
            }
            kw0.LIZ(j, LIZ, LIZLLL, z, c11522b.LIZJ, c11522b.LIZLLL);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.auth.OpenBaseAuthService
    public final void LIZ(String str, String str2, List<String> list, JSONObject jSONObject, AbstractC11521a abstractC11521a) {
        if (PatchProxy.proxy(new Object[]{str, str2, list, jSONObject, abstractC11521a}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2, list, jSONObject, abstractC11521a);
        JSONObject jSONObject2 = new JSONObject();
        List<String> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        if (str != null) {
            for (String str3 : list) {
                long LIZ = ((BootInfoService) LIZ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZ(str3, str);
                if (LIZ == 2) {
                    jSONObject2.put(str3, true);
                } else if (LIZ == 0) {
                    mutableList.remove(str3);
                }
            }
            jSONObject.put("strictPermission", jSONObject2);
        }
        if (mutableList.isEmpty()) {
            for (String str4 : list) {
                KW0.LIZIZ.LIZ(LIZ().LJIIIIZZ.LJI, LIZ().LJIIIIZZ.LIZ(LIZ().LJIIJ), ((BootInfoService) LIZ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL(), false, "not_authorized", str4);
            }
            abstractC11521a.LIZIZ(new ArrayList());
            return;
        }
        BLF.LIZJ.LIZ(str2, mutableList, jSONObject, new BLH(this, abstractC11521a, jSONObject2));
    }
}
