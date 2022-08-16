package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.tools.prefetch.BaseEnvConfigurator;
import com.bytedance.ies.tools.prefetch.IConfigProvider;
import com.bytedance.ies.tools.prefetch.ILocalStorage;
import com.bytedance.ies.tools.prefetch.INetworkExecutor;
import com.bytedance.ies.tools.prefetch.p1139a.C12650a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C98235Omb;
import p003X.C98236Omc;
import p003X.QIJ;

/* loaded from: classes7.dex */
public final class LivePrefetchProcessor$initProcessors$1 extends Lambda implements Function2<List<? extends String>, String, C12650a> {
    public static final LivePrefetchProcessor$initProcessors$1 INSTANCE = new LivePrefetchProcessor$initProcessors$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22896);
    }

    public LivePrefetchProcessor$initProcessors$1() {
        super(2);
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.prefetch.LivePrefetchProcessor$initProcessors$1$1 */
    /* loaded from: classes.dex */
    public static final class ExecutorC40271 implements Executor {
        public static ChangeQuickRedirect LIZ;
        public static final ExecutorC40271 LIZIZ = new ExecutorC40271();

        /* renamed from: com.bytedance.android.live.browser.jsbridge.prefetch.LivePrefetchProcessor$initProcessors$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C40292<T> implements Consumer<Throwable> {
            public static final C40292 LIZ = new C40292();

            static {
                Covode.recordClassIndex(22899);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* bridge */ /* synthetic */ void accept(Throwable th) {
            }
        }

        static {
            Covode.recordClassIndex(22897);
        }

        /* renamed from: com.bytedance.android.live.browser.jsbridge.prefetch.LivePrefetchProcessor$initProcessors$1$1$1 */
        /* loaded from: classes.dex */
        public static final class C40281<T> implements Consumer<Runnable> {
            public static ChangeQuickRedirect LIZ;
            public static final C40281 LIZIZ = new C40281();

            static {
                Covode.recordClassIndex(22898);
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
            Observable.just(runnable).subscribeOn(Schedulers.m138io()).subscribe(C40281.LIZIZ, C40292.LIZ);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: LIZ */
    public final C12650a invoke(List<String> list, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C12650a) proxy.result;
        }
        C106862S5w.LIZ(list, str);
        C98236Omc LIZ = C12650a.LIZJ.LIZ("live");
        LIZ.setDebug(false);
        BaseEnvConfigurator<C12650a> workerExecutor = LIZ.setWorkerExecutor((Executor) ExecutorC40271.LIZIZ);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PREFETCH_DISABLE_LOCAL_STORAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            workerExecutor.setLocalStorage((ILocalStorage) new QIJ(str));
        }
        return workerExecutor.setConfigProvider((IConfigProvider) new C98235Omb(list)).setNetworkExecutor((INetworkExecutor) new PrefetchNetworkExecutorImpl()).apply();
    }
}
