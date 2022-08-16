package com.bytedance.android.live.broadcastgame.channel;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AAMManager {
    public static ChangeQuickRedirect LIZ;
    public final Handler LIZJ = new Handler(Looper.getMainLooper());
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new AAMManager$listeners$2(this));
    public Status LIZIZ = Status.NONE;

    /* loaded from: classes23.dex */
    public enum Status {
        NONE,
        ENTRANCE,
        START,
        STOP;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19313);
        }

        public static Status valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Status) (proxy.isSupported ? proxy.result : Enum.valueOf(Status.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Status[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Status[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.AAMManager$a */
    /* loaded from: classes23.dex */
    public interface AbstractC3405a {
        static {
            Covode.recordClassIndex(19314);
        }

        void LIZIZ();

        void LIZJ();

        void LIZLLL();
    }

    static {
        Covode.recordClassIndex(19312);
    }

    public final List<AbstractC3405a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (List) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        ILiveGameDebugService iLiveGameDebugService = (ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class);
        if (iLiveGameDebugService != null) {
            iLiveGameDebugService.dispatchLiveGameDebugMsg(new C3324a("成功，接收到START", false, 2));
        }
        LIZ(AAMManager$notifyGameStart$1.INSTANCE);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ILiveGameDebugService iLiveGameDebugService = (ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class);
        if (iLiveGameDebugService != null) {
            iLiveGameDebugService.dispatchLiveGameDebugMsg(new C3324a("成功，接收到ENTRANCE", false, 2));
        }
        LIZ(AAMManager$notifyRecvEntrance$1.INSTANCE);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        ILiveGameDebugService iLiveGameDebugService = (ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class);
        if (iLiveGameDebugService != null) {
            iLiveGameDebugService.dispatchLiveGameDebugMsg(new C3324a("成功，接收到STOP", false, 2));
        }
        LIZ(AAMManager$notifyGameStop$1.INSTANCE);
    }

    private final void LIZ(Function1<? super AbstractC3405a, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(new AAMManager$dispatch$1(this, function1));
    }

    private final void LIZ(final Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            function0.mo30099invoke();
        } else {
            this.LIZJ.post(new Runnable() { // from class: X.6G8
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(19384);
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(Function0.this.mo30099invoke(), "");
                }
            });
        }
    }

    public final void LIZ(AbstractC3405a abstractC3405a) {
        if (PatchProxy.proxy(new Object[]{abstractC3405a}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3405a);
        LIZ(new AAMManager$addWatcher$1(this, abstractC3405a));
    }
}
