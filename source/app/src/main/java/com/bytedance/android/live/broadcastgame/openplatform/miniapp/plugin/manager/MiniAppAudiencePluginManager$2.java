package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AnonymousClass325;
import p003X.C106862S5w;
import p003X.C87734Khc;

/* loaded from: classes5.dex */
public final class MiniAppAudiencePluginManager$2 extends Lambda implements Function1<C3516am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87734Khc this$0;

    static {
        Covode.recordClassIndex(21746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppAudiencePluginManager$2(C87734Khc c87734Khc) {
        super(1);
        this.this$0 = c87734Khc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3516am c3516am) {
        C3516am c3516am2 = c3516am;
        if (!PatchProxy.proxy(new Object[]{c3516am2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3516am2);
            if (AnonymousClass325.LIZIZ()) {
                C87734Khc.LIZ(this.this$0, c3516am2, c3516am2.LJIL, (Function0) null, 4, (Object) null);
            } else {
                this.this$0.LIZ(c3516am2, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
