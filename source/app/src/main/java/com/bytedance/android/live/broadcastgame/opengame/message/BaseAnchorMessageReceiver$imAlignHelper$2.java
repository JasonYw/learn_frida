package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.api.model.AbstractC3378h;
import com.bytedance.android.live.broadcastgame.channel.receiver.helper.C3438a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87536KeQ;
import p003X.C106862S5w;
import p003X.KYK;
import p003X.KYS;

/* loaded from: classes5.dex */
public final class BaseAnchorMessageReceiver$imAlignHelper$2 extends Lambda implements Function0<C3438a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC87536KeQ this$0;

    static {
        Covode.recordClassIndex(20254);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAnchorMessageReceiver$imAlignHelper$2(AbstractC87536KeQ abstractC87536KeQ) {
        super(0);
        this.this$0 = abstractC87536KeQ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.channel.receiver.helper.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3438a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3438a(new C35061());
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.BaseAnchorMessageReceiver$imAlignHelper$2$1 */
    /* loaded from: classes5.dex */
    public static final class C35061 extends Lambda implements Function1<AbstractC3378h, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20255);
        }

        public C35061() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC3378h abstractC3378h) {
            C3523i LIZ;
            KYS kys;
            AbstractC3378h abstractC3378h2 = abstractC3378h;
            if (!PatchProxy.proxy(new Object[]{abstractC3378h2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC3378h2);
                if ((abstractC3378h2 instanceof KYK) && (LIZ = BaseAnchorMessageReceiver$imAlignHelper$2.this.this$0.LIZ(((KYK) abstractC3378h2).LIZ)) != null && (kys = BaseAnchorMessageReceiver$imAlignHelper$2.this.this$0.LIZJ) != null) {
                    kys.LIZ(LIZ);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
