package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C6D5;
import p003X.C6D6;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$dispatchLiveGameDebugMsg$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C6D6 $message;
    public final /* synthetic */ LiveGameDebugService this$0;

    static {
        Covode.recordClassIndex(19695);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugService$dispatchLiveGameDebugMsg$1(LiveGameDebugService liveGameDebugService, C6D6 c6d6) {
        super(0);
        this.this$0 = liveGameDebugService;
        this.$message = c6d6;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3465b debugMsgChannel = this.this$0.getDebugMsgChannel();
            C6D6 c6d6 = this.$message;
            if (!PatchProxy.proxy(new Object[]{c6d6}, debugMsgChannel, C3465b.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(c6d6);
                C6D5<?, ?> c6d5 = debugMsgChannel.LIZIZ.get(c6d6.getClass());
                if ((c6d5 instanceof C6D5) && c6d5 != null) {
                    c6d5.LIZ(c6d6);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
