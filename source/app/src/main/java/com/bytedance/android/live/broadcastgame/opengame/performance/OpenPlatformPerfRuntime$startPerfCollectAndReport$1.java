package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6967ew;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C2WC;
import p003X.C442103eG;
import p003X.C87421KcZ;
import p003X.C88440Kt0;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfRuntime$startPerfCollectAndReport$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87421KcZ this$0;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.performance.OpenPlatformPerfRuntime$startPerfCollectAndReport$1$3 */
    /* loaded from: classes5.dex */
    public static final class C36143<T> implements Consumer<Throwable> {
        public static final C36143 LIZ = new C36143();

        static {
            Covode.recordClassIndex(20807);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    static {
        Covode.recordClassIndex(20804);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformPerfRuntime$startPerfCollectAndReport$1(C87421KcZ c87421KcZ) {
        super(0);
        this.this$0 = c87421KcZ;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.performance.OpenPlatformPerfRuntime$startPerfCollectAndReport$1$1 */
    /* loaded from: classes5.dex */
    public static final class C36121 extends Lambda implements Function0<Unit> {
        public static final C36121 INSTANCE = new C36121();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20805);
        }

        public C36121() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                C88440Kt0.LIZ("已开启性能测试！");
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C2WC<Boolean> LJIILL;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJFF = true;
            LK1.LIZ(0L, false, false, C36121.INSTANCE, 7, null);
            C87421KcZ c87421KcZ = this.this$0;
            SettingKey<C6967ew> settingKey = LiveConfigSettingKeys.LIVE_OPEN_PLATFORM_PERF_TEST_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            c87421KcZ.LIZIZ = Observable.interval(settingKey.getValue().LIZ(), TimeUnit.SECONDS).observeOn(Schedulers.m138io()).subscribe(new Consumer<Long>() { // from class: com.bytedance.android.live.broadcastgame.opengame.performance.OpenPlatformPerfRuntime$startPerfCollectAndReport$1.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(20806);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Long l) {
                    JSONObject jSONObject;
                    if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                        C3618b LIZIZ = OpenPlatformPerfRuntime$startPerfCollectAndReport$1.this.this$0.LIZIZ();
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], OpenPlatformPerfRuntime$startPerfCollectAndReport$1.this.this$0.LIZJ(), C3617a.LIZ, false, 9);
                        if (proxy.isSupported) {
                            jSONObject = (JSONObject) proxy.result;
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("time_interval", C3617a.LJIILJJIL);
                            jSONObject.put("cpu_usage", Float.valueOf(C3617a.LJII * 100.0f));
                            jSONObject.put("memory_used", Float.valueOf(C3617a.LJIIIIZZ));
                            jSONObject.put("encode_fps", C3617a.LJIIJ);
                            jSONObject.put("temperature", String.valueOf(C3617a.LJIIJJI));
                            jSONObject.put("stutter", Float.valueOf(C3617a.LJIILIIL * 100.0f));
                        }
                        LIZIZ.LIZ(jSONObject);
                    }
                }
            }, C36143.LIZ);
            Disposable disposable = this.this$0.LIZIZ;
            if (disposable != null) {
                this.this$0.LIZ(disposable);
            }
            C442103eG LIZ = C442103eG.LIZJ.LIZ();
            if (LIZ != null && (LJIILL = LIZ.LJIILL()) != null) {
                LJIILL.LIZ(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
