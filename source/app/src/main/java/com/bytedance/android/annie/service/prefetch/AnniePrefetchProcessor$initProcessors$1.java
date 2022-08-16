package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.tools.prefetch.IConfigProvider;
import com.bytedance.ies.tools.prefetch.INetworkExecutor;
import com.bytedance.ies.tools.prefetch.p1139a.C12650a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C98236Omc;
import p003X.PKO;

/* loaded from: classes7.dex */
public final class AnniePrefetchProcessor$initProcessors$1 extends Lambda implements Function1<List<? extends String>, C12650a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PKO this$0;

    static {
        Covode.recordClassIndex(11153);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnniePrefetchProcessor$initProcessors$1(PKO pko) {
        super(1);
        this.this$0 = pko;
    }

    /* renamed from: com.bytedance.android.annie.service.prefetch.AnniePrefetchProcessor$initProcessors$1$1 */
    /* loaded from: classes.dex */
    public static final class ExecutorC26371 implements Executor {
        public static ChangeQuickRedirect LIZ;
        public static final ExecutorC26371 LIZIZ = new ExecutorC26371();

        /* renamed from: com.bytedance.android.annie.service.prefetch.AnniePrefetchProcessor$initProcessors$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C26392<T> implements Consumer<Throwable> {
            public static final C26392 LIZ = new C26392();

            static {
                Covode.recordClassIndex(11156);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* bridge */ /* synthetic */ void accept(Throwable th) {
            }
        }

        static {
            Covode.recordClassIndex(11154);
        }

        /* renamed from: com.bytedance.android.annie.service.prefetch.AnniePrefetchProcessor$initProcessors$1$1$1 */
        /* loaded from: classes.dex */
        public static final class C26381<T> implements Consumer<Runnable> {
            public static ChangeQuickRedirect LIZ;
            public static final C26381 LIZIZ = new C26381();

            static {
                Covode.recordClassIndex(11155);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Runnable runnable) {
                Runnable runnable2 = runnable;
                if (!PatchProxy.proxy(new Object[]{runnable2}, this, LIZ, false, 1).isSupported) {
                    runnable2.run();
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (PatchProxy.proxy(new Object[]{runnable}, this, LIZ, false, 1).isSupported) {
                return;
            }
            Observable.just(runnable).subscribeOn(Schedulers.m138io()).subscribe(C26381.LIZIZ, C26392.LIZ);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final C12650a invoke(final List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C12650a) proxy.result;
        }
        C106862S5w.LIZ(list);
        C98236Omc LIZ = C12650a.LIZJ.LIZ(PKO.LIZ(this.this$0).LIZIZ);
        LIZ.setDebug(false);
        return LIZ.setWorkerExecutor((Executor) ExecutorC26371.LIZIZ).setConfigProvider(new IConfigProvider() { // from class: com.bytedance.android.annie.service.prefetch.AnniePrefetchProcessor$initProcessors$1.2
            static {
                Covode.recordClassIndex(11157);
            }

            @Override // com.bytedance.ies.tools.prefetch.IConfigProvider
            public final List<String> getConfigString() {
                return list;
            }
        }).setNetworkExecutor((INetworkExecutor) new PrefetchNetworkExecutorImpl()).apply();
    }
}
