package com.bytedance.android.live.broadcastgame.channel.receiver;

import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
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
import p003X.C106862S5w;
import p003X.C87207KXx;

/* loaded from: classes5.dex */
public final class OpenAudienceReceiverAdapter$alignHelper$2 extends Lambda implements Function0<C3438a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87207KXx this$0;

    static {
        Covode.recordClassIndex(19528);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAudienceReceiverAdapter$alignHelper$2(C87207KXx c87207KXx) {
        super(0);
        this.this$0 = c87207KXx;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.channel.receiver.helper.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3438a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3438a(new C34351());
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.receiver.OpenAudienceReceiverAdapter$alignHelper$2$1 */
    /* loaded from: classes5.dex */
    public static final class C34351 extends Lambda implements Function1<AbstractC3378h, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19529);
        }

        public C34351() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC3378h abstractC3378h) {
            AbstractC3378h abstractC3378h2 = abstractC3378h;
            if (!PatchProxy.proxy(new Object[]{abstractC3378h2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC3378h2);
                C87207KXx c87207KXx = OpenAudienceReceiverAdapter$alignHelper$2.this.this$0;
                if (!(abstractC3378h2 instanceof C3331a)) {
                    abstractC3378h2 = null;
                }
                c87207KXx.LIZ((C3331a) abstractC3378h2);
            }
            return Unit.INSTANCE;
        }
    }
}
