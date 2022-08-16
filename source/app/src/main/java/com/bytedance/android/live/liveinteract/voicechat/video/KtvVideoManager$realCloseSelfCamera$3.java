package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80486Ho0;
import p003X.C106862S5w;
import p003X.C80478Hns;

/* loaded from: classes3.dex */
public final class KtvVideoManager$realCloseSelfCamera$3 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC80486Ho0 $closeType;
    public final /* synthetic */ C80478Hns this$0;

    static {
        Covode.recordClassIndex(31736);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoManager$realCloseSelfCamera$3(C80478Hns c80478Hns, AbstractC80486Ho0 abstractC80486Ho0) {
        super(1);
        this.this$0 = c80478Hns;
        this.$closeType = abstractC80486Ho0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        String str;
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
            ALogger.m15800e("ttlive_link_camera", "update audio linkType failed " + th);
            if (this.this$0.LJIJJ) {
                str = "";
            } else {
                str = this.this$0.LJIL.LJIIIIZZ;
            }
            if (this.$closeType.LIZJ) {
                this.this$0.LIZ("", str);
            }
        }
        return Unit.INSTANCE;
    }
}
