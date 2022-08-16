package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WD;
import p003X.C442103eG;

/* loaded from: classes12.dex */
public final class InteractGameStartupWidget$onChanged$1$2 extends Lambda implements Function0<Unit> {
    public static final InteractGameStartupWidget$onChanged$1$2 INSTANCE = new InteractGameStartupWidget$onChanged$1$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21834);
    }

    public InteractGameStartupWidget$onChanged$1$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C2WD<String> m24900LJ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C442103eG LIZ = C442103eG.LIZJ.LIZ();
            if (LIZ != null && (m24900LJ = LIZ.m24900LJ()) != null) {
                m24900LJ.LIZ(null);
            }
            ALogger.m15801d("InteractGameStartupWidget", "用户取消切换功能");
        }
        return Unit.INSTANCE;
    }
}
