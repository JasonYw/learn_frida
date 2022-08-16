package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C6D5;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$registerMessageWatcher$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ boolean $notify;
    public final /* synthetic */ Function1 $watcher;
    public final /* synthetic */ LiveGameDebugService this$0;

    static {
        Covode.recordClassIndex(19696);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugService$registerMessageWatcher$1(LiveGameDebugService liveGameDebugService, Class cls, boolean z, Function1 function1) {
        super(0);
        this.this$0 = liveGameDebugService;
        this.$clazz = cls;
        this.$notify = z;
        this.$watcher = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C6D5<?, ?> c6d5;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3465b debugMsgChannel = this.this$0.getDebugMsgChannel();
            Class<?> cls = this.$clazz;
            boolean z = this.$notify;
            Function1<?, Unit> function1 = this.$watcher;
            if (!PatchProxy.proxy(new Object[]{cls, Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, debugMsgChannel, C3465b.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(cls, function1);
                if (debugMsgChannel.LIZ().get(cls) == null) {
                    debugMsgChannel.LIZ().put(cls, new ArrayList());
                }
                List<Function1<?, Unit>> list = debugMsgChannel.LIZ().get(cls);
                if (list != null) {
                    list.add(function1);
                }
                if (z && (c6d5 = debugMsgChannel.LIZIZ.get(cls)) != null) {
                    c6d5.LIZ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
