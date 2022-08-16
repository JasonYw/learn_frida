package com.bytedance.android.live.broadcastgame.effectgame.base;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87078KSy;
import p003X.DialogC87128KUw;

/* renamed from: com.bytedance.android.live.broadcastgame.effectgame.base.k */
/* loaded from: classes5.dex */
public final class C3469k {
    public static ChangeQuickRedirect LIZ;
    public DialogC87128KUw LIZIZ;
    public C3384q LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    /* renamed from: LJ */
    public final Context f26047LJ;

    static {
        Covode.recordClassIndex(19791);
    }

    public C3469k(Context context) {
        C106862S5w.LIZ(context);
        this.f26047LJ = context;
    }

    public final void LIZ(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        DialogC87128KUw dialogC87128KUw = this.LIZIZ;
        if (dialogC87128KUw == null) {
            function0.mo30099invoke();
        } else if (dialogC87128KUw.isShowing()) {
            DialogC87128KUw dialogC87128KUw2 = this.LIZIZ;
            if (dialogC87128KUw2 != null) {
                C116971W2r.LIZ(dialogC87128KUw2);
            }
            function0.mo30099invoke();
        } else {
            C87078KSy c87078KSy = C87078KSy.LIZIZ;
            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStartupResult(1, this.LIZJ, c87078KSy.LIZ(c87078KSy.LIZ(this.LIZLLL), new JSONObject().put("status_code", "402")));
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
