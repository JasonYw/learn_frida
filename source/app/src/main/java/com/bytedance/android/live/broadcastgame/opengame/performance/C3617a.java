package com.bytedance.android.live.broadcastgame.opengame.performance;

import android.os.Build;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.IHostPerformanceMonitor;
import com.bytedance.android.livesdk.config.C6967ew;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88128Kny;
import p003X.C13B;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.performance.a */
/* loaded from: classes5.dex */
public final class C3617a implements AbstractC88128Kny {
    public static ChangeQuickRedirect LIZ;
    public static int LJFF;
    public static volatile boolean LJI;
    public static volatile float LJII;
    public static volatile float LJIIIIZZ;
    public static volatile float LJIIIZ;
    public static volatile int LJIIJ;
    public static volatile float LJIIJJI;
    public static volatile float LJIIL;
    public static volatile float LJIILIIL;
    public static volatile long LJIILJJIL;
    public static C13B LJIILL;
    public static Disposable LJIILLIIL;
    public static final C3617a LJIIZILJ = new C3617a();
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(OpenPlatformPerfDog$ENCODE_FPS_THRESHOLD$2.INSTANCE);
    public static final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(OpenPlatformPerfDog$STUTTER_RATE_THRESHOLD$2.INSTANCE);
    public static final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(OpenPlatformPerfDog$BATTERY_TEMPERATURE_THRESHOLD$2.INSTANCE);

    /* renamed from: LJ */
    public static final int f26079LJ = 2;
    public static final Lazy LJIJ = LazyKt__LazyJVMKt.lazy(OpenPlatformPerfDog$mPerformanceMonitor$2.INSTANCE);

    public final IHostPerformanceMonitor LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (IHostPerformanceMonitor) (proxy.isSupported ? proxy.result : LJIJ.mo27335getValue());
    }

    @Override // p003X.AbstractC88128Kny
    public final float LIZIZ() {
        Map<String, Long> memory;
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        IHostPerformanceMonitor LJFF2 = LJFF();
        if (LJFF2 != null && (memory = LJFF2.getMemory()) != null && (l = memory.get("mem_pss_total")) != null) {
            return ((float) l.longValue()) / 1048576.0f;
        }
        return -1.0f;
    }

    @Override // p003X.AbstractC88128Kny
    public final int LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        IService service = ServiceManager.getService(IPerformanceManager.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        return (int) ((IPerformanceManager) service).getStreamRenderFps();
    }

    @Override // p003X.AbstractC88128Kny
    public final float LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        IService service = ServiceManager.getService(IPerformanceManager.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        return ((IPerformanceManager) service).getTemperature();
    }

    @Override // p003X.AbstractC88128Kny
    /* renamed from: LJ */
    public final float mo15843LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        IService service = ServiceManager.getService(IPerformanceManager.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        float uIStallRate = ((IPerformanceManager) service).getUIStallRate();
        if (uIStallRate < 0.0f) {
            return 0.0f;
        }
        return uIStallRate;
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        Disposable disposable = LJIILLIIL;
        if (disposable != null) {
            disposable.dispose();
        }
        C13B c13b = LJIILL;
        if (!PatchProxy.proxy(new Object[0], c13b, C13B.LIZ, false, 3).isSupported) {
            c13b.LIZIZ.clear();
        }
        LJFF = 0;
        LJIILJJIL = 0L;
    }

    static {
        Covode.recordClassIndex(20815);
        SettingKey<C6967ew> settingKey = LiveConfigSettingKeys.LIVE_OPEN_PLATFORM_PERF_TEST_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C6967ew value = settingKey.getValue();
        if (value.LIZJ <= 0) {
            value.LIZJ = 60;
        }
        LJIILL = new C13B(value.LIZJ, 1);
    }

    @Override // p003X.AbstractC88128Kny
    public final float LIZ() {
        Map<String, Double> cpuRate;
        Double d;
        Map<String, Double> cpuRate2;
        Double d2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            IHostPerformanceMonitor LJFF2 = LJFF();
            if (LJFF2 == null || (cpuRate2 = LJFF2.getCpuRate()) == null || (d2 = cpuRate2.get("cpu_speed")) == null) {
                return -1.0f;
            }
            return (float) d2.doubleValue();
        }
        IHostPerformanceMonitor LJFF3 = LJFF();
        if (LJFF3 == null || (cpuRate = LJFF3.getCpuRate()) == null || (d = cpuRate.get("cpu_rate")) == null) {
            return -1.0f;
        }
        return (float) d.doubleValue();
    }

    public static void LIZ(boolean z) {
        LJI = z;
    }
}
