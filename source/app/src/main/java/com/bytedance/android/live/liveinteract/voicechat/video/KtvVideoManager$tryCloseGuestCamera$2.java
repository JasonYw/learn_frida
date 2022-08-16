package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88440Kt0;

/* loaded from: classes12.dex */
public final class KtvVideoManager$tryCloseGuestCamera$2 extends Lambda implements Function1<Throwable, Unit> {
    public static final KtvVideoManager$tryCloseGuestCamera$2 INSTANCE = new KtvVideoManager$tryCloseGuestCamera$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31740);
    }

    public KtvVideoManager$tryCloseGuestCamera$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            if (th2 instanceof ApiServerException) {
                C88440Kt0.LIZ(((ApiServerException) th2).mPrompt);
            }
            ALogger.m15800e("ttlive_link_camera", "close guest camera failed " + th2);
        }
        return Unit.INSTANCE;
    }
}
