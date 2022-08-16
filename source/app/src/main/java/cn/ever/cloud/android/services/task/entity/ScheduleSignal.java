package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.channels.Channel;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ScheduleSignal {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Channel<Command> inner;

    static {
        Covode.recordClassIndex(3102);
    }

    public ScheduleSignal(Channel<Command> channel) {
        C106862S5w.LIZ(channel);
        this.inner = channel;
    }

    public final Object notify(Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object send = this.inner.send(new Command() { // from class: X.6ig
            static {
                Covode.recordClassIndex(3079);
            }
        }, continuation);
        if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return send;
        }
        return Unit.INSTANCE;
    }
}
