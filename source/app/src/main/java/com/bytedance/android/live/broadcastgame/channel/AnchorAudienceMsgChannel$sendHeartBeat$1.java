package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.C3867r;
import com.bytedance.android.live.broadcastgame.C3868s;
import com.bytedance.android.live.broadcastgame.channel.p288a.C3426e;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C100839PnV;
import p003X.C443233g5;
import p003X.C87206KXw;
import p003X.KY0;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgChannel$sendHeartBeat$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KY0 this$0;

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.AnchorAudienceMsgChannel$sendHeartBeat$1$1 */
    /* loaded from: classes5.dex */
    public static final class C34121<T> implements Consumer<C3868s> {
        public static final C34121 LIZ = new C34121();

        static {
            Covode.recordClassIndex(19337);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(C3868s c3868s) {
        }
    }

    static {
        Covode.recordClassIndex(19336);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorAudienceMsgChannel$sendHeartBeat$1(KY0 ky0) {
        super(1);
        this.this$0 = ky0;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.AnchorAudienceMsgChannel$sendHeartBeat$1$2 */
    /* loaded from: classes3.dex */
    public static final class C34132<T> implements Consumer<Throwable> {
        public static ChangeQuickRedirect LIZ;
        public static final C34132 LIZIZ = new C34132();

        static {
            Covode.recordClassIndex(19338);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                ALogger.m15798e("AAM.AnchorAudienceMsgChannel", th2);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        C3867r c3867r;
        Observable<C3868s> LIZIZ;
        Observable<R> compose;
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported && (c3867r = this.this$0.LJFF) != null && (LIZIZ = c3867r.LIZIZ(new C3426e(new C87206KXw(this.this$0.f8529LJ.LIZ(), longValue, C443233g5.LIZIZ.LIZJ(this.this$0.LJI))))) != null && (compose = LIZIZ.compose(C100839PnV.LIZJ())) != 0) {
            compose.subscribe(C34121.LIZ, C34132.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
