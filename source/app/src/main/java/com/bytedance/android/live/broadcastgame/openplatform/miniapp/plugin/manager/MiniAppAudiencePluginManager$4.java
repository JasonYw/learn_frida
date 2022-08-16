package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.opengame.message.C3515al;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87721KhP;
import p003X.C87734Khc;
import p003X.C87767Ki9;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class MiniAppAudiencePluginManager$4 extends Lambda implements Function1<C3515al, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87734Khc this$0;

    static {
        Covode.recordClassIndex(21747);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppAudiencePluginManager$4(C87734Khc c87734Khc) {
        super(1);
        this.this$0 = c87734Khc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3515al c3515al) {
        C8733af c8733af;
        Integer num;
        C8733af c8733af2;
        C3515al c3515al2 = c3515al;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{c3515al2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3515al2);
            C87911KkT c87911KkT = C87911KkT.LIZIZ;
            StringBuilder sb = new StringBuilder("保存im讲解卡信息 ");
            C8906gu c8906gu = c3515al2.LIZIZ;
            String str = null;
            if (c8906gu != null && (c8733af2 = c8906gu.LIZJ) != null) {
                str = c8733af2.LIZIZ;
            }
            sb.append(str);
            sb.append(" -> show: ");
            C8906gu c8906gu2 = c3515al2.LIZIZ;
            if (c8906gu2 == null || (c8733af = c8906gu2.LIZJ) == null || (num = c8733af.LIZ) == null || num.intValue() != 1) {
                z = false;
            }
            sb.append(z);
            c87911KkT.LIZ(sb.toString(), C87721KhP.LIZ());
            this.this$0.LIZ(c3515al2.LIZIZ);
            C87767Ki9.LIZ().LIZ("MiniAppAudiencePluginManager_MiniCardMessage");
            try {
                AbstractC3664m abstractC3664m = this.this$0.f8567LJ;
                if (abstractC3664m != null) {
                    abstractC3664m.LIZ(c3515al2);
                }
            } catch (Exception e) {
                C87911KkT c87911KkT2 = C87911KkT.LIZIZ;
                c87911KkT2.LIZ("保存im讲解卡" + c3515al2 + "信息失败 " + e.getMessage(), C87721KhP.LIZ());
            }
        }
        return Unit.INSTANCE;
    }
}
