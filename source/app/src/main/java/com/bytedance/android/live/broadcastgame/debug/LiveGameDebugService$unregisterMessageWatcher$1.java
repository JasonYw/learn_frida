package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$unregisterMessageWatcher$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ Function1 $watcher;
    public final /* synthetic */ LiveGameDebugService this$0;

    static {
        Covode.recordClassIndex(19700);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugService$unregisterMessageWatcher$1(LiveGameDebugService liveGameDebugService, Class cls, Function1 function1) {
        super(0);
        this.this$0 = liveGameDebugService;
        this.$clazz = cls;
        this.$watcher = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3465b debugMsgChannel = this.this$0.getDebugMsgChannel();
            Class cls = this.$clazz;
            Function1 function1 = this.$watcher;
            if (!PatchProxy.proxy(new Object[]{cls, function1}, debugMsgChannel, C3465b.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(cls, function1);
                List<Function1<?, Unit>> list = debugMsgChannel.LIZ().get(cls);
                if (list != null) {
                    list.remove(function1);
                }
            }
        }
        return Unit.INSTANCE;
    }
}