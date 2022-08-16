package android.p006ss.com.vboost;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.p006ss.com.vboost.IImageThumbFetch;
import android.p006ss.com.vboost.VboostListener;
import android.p006ss.com.vboost.request.C0119c;
import android.p006ss.com.vboost.request.NotifyStrategy;
import android.p006ss.com.vboost.request.TimeoutStrategy;
import android.p006ss.com.vboost.utils.RomUtils;
import android.p006ss.com.vboost.utils.a$a;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p002O.C0002O;
import p003X.C144230eTA;
import p003X.C144234eTE;
import p003X.C144239eTJ;
import p003X.C144241eTL;
import p003X.C144243eTN;
import p003X.C144246eTQ;
import p003X.CallableC144242eTM;

/* renamed from: android.ss.com.vboost.CapabilityScheduler */
/* loaded from: classes19.dex */
public class CapabilityScheduler {
    public static final FrequencyLevel DEFAULT_CORE_BOOST_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_CORE_BOOST_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_CORE_LIMIT_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_CORE_LIMIT_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_CPU_BOOST_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_CPU_BOOST_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_CPU_LIMIT_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_CPU_LIMIT_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_DDR_BOOST_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_DDR_BOOST_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_DDR_LIMIT_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_DDR_LIMIT_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_GPU_BOOST_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_GPU_BOOST_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_GPU_LIMIT_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_GPU_LIMIT_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_UFS_BOOST_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_UFS_BOOST_SHORT_LEVEL;
    public static final FrequencyLevel DEFAULT_UFS_LIMIT_LONG_LEVEL;
    public static final FrequencyLevel DEFAULT_UFS_LIMIT_SHORT_LEVEL;
    public static final String TAG;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static SparseArray<CustomRequest> curRequest;
    public static ISchedulerInitialConfigProvider mIInitialConfigProvider;
    public static volatile long start;

    public static int networkEnhance() {
        return 1;
    }

    public static int preloadIo() {
        return 1;
    }

    public static int resetPowerState() {
        return 1;
    }

    public static int setPowerState() {
        return 1;
    }

    public static ISchedulerInitialConfigProvider getInitialConfigProvider() {
        return mIInitialConfigProvider;
    }

    public static void restoreCpuBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 13).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.CPU_FREQ_MIN);
    }

    public static void restoreCpuCoreBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.CPU_CORE_MIN);
    }

    public static void restoreCpuCoreLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.CPU_CORE_MAX);
    }

    public static void restoreCpuLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 16).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.CPU_FREQ_MAX);
    }

    public static void restoreDdrBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.BUS_FREQ_MIN);
    }

    public static void restoreDdrLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.BUS_FREQ_MAX);
    }

    public static void restoreGpuBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 19).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.GPU_FREQ_MIN);
    }

    public static void restoreGpuLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.GPU_FREQ_MAX);
    }

    public static void restoreUfsBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.UFS_FREQ_MIN);
    }

    public static void restoreUfsLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZIZ(CapabilityType.UFS_FREQ_MAX);
    }

    public static void perfIn() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 51).isSupported) {
            return;
        }
        if ("1".equals(RomUtils.LIZ("debug.vboost.disable"))) {
            switchVboost(false);
        } else {
            switchVboost(true);
        }
        start = System.nanoTime();
    }

    public static void perfOut() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 52).isSupported) {
            return;
        }
        C144239eTJ.LIZ(TAG, C0002O.m25086C("cost:", String.valueOf(System.nanoTime() - start)));
    }

    public static void requestCpuBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 11).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_FREQ_MIN, DEFAULT_CPU_BOOST_SHORT_LEVEL, 1000L));
    }

    public static void requestCpuBoostLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_FREQ_MIN, DEFAULT_CPU_BOOST_LONG_LEVEL, 6000L));
    }

    public static void requestCpuCoreBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 35).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_CORE_MIN, DEFAULT_CORE_BOOST_SHORT_LEVEL, 1000L));
    }

    public static void requestCpuCoreBoostLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_CORE_MIN, DEFAULT_CORE_BOOST_LONG_LEVEL, 6000L));
    }

    public static void requestCpuCoreLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_CORE_MAX, DEFAULT_CORE_LIMIT_SHORT_LEVEL, JsBridgeDelegate.GET_URL_OUT_TIME));
    }

    public static void requestCpuCoreLimitLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 39).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_CORE_MAX, DEFAULT_CORE_LIMIT_LONG_LEVEL, 6000L));
    }

    public static void requestCpuLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 14).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_FREQ_MAX, DEFAULT_CPU_LIMIT_SHORT_LEVEL, JsBridgeDelegate.GET_URL_OUT_TIME));
    }

    public static void requestCpuLimitLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 15).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.CPU_FREQ_MAX, DEFAULT_CPU_LIMIT_LONG_LEVEL, 6000L));
    }

    public static void requestDdrBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 23).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.BUS_FREQ_MIN, DEFAULT_DDR_BOOST_SHORT_LEVEL, 1000L));
    }

    public static void requestDdrBoostLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.BUS_FREQ_MIN, DEFAULT_DDR_BOOST_LONG_LEVEL, 6000L));
    }

    public static void requestDdrLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.BUS_FREQ_MIN, DEFAULT_DDR_LIMIT_SHORT_LEVEL, JsBridgeDelegate.GET_URL_OUT_TIME));
    }

    public static void requestDdrLimitLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.BUS_FREQ_MIN, DEFAULT_DDR_LIMIT_LONG_LEVEL, 6000L));
    }

    public static void requestGpuBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 17).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.GPU_FREQ_MIN, DEFAULT_GPU_BOOST_SHORT_LEVEL, 1000L));
    }

    public static void requestGpuBoostLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 18).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.GPU_FREQ_MIN, DEFAULT_GPU_BOOST_LONG_LEVEL, 6000L));
    }

    public static void requestGpuLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 20).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.GPU_FREQ_MAX, DEFAULT_GPU_LIMIT_SHORT_LEVEL, JsBridgeDelegate.GET_URL_OUT_TIME));
    }

    public static void requestGpuLimitLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 21).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.GPU_FREQ_MAX, DEFAULT_GPU_LIMIT_LONG_LEVEL, 6000L));
    }

    public static IImageThumbFetch.Fetcher requestImageThumbFetcher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48);
        if (proxy.isSupported) {
            return (IImageThumbFetch.Fetcher) proxy.result;
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.type = CapabilityType.THUMB_FETCH.getIndex();
        Object LIZ = C144243eTN.LIZ().LIZ(customRequest);
        if (!(LIZ instanceof IImageThumbFetch.Fetcher)) {
            return null;
        }
        return (IImageThumbFetch.Fetcher) LIZ;
    }

    public static void requestUfsBoost() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 29).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.UFS_FREQ_MIN, DEFAULT_UFS_BOOST_SHORT_LEVEL, 1000L));
    }

    public static void requestUfsBoostLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.UFS_FREQ_MIN, DEFAULT_UFS_BOOST_LONG_LEVEL, 6000L));
    }

    public static void requestUfsLimit() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.UFS_FREQ_MIN, DEFAULT_UFS_LIMIT_SHORT_LEVEL, JsBridgeDelegate.GET_URL_OUT_TIME));
    }

    public static void requestUfsLimitLong() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33).isSupported) {
            return;
        }
        C144243eTN.LIZ().LIZ(new CustomRequest(CapabilityType.UFS_FREQ_MIN, DEFAULT_UFS_LIMIT_LONG_LEVEL, 6000L));
    }

    static {
        if (ReDexClinitStringAb.abTest >= 3) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(26);
        TAG = CapabilityScheduler.class.getSimpleName();
        DEFAULT_CPU_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CPU_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CPU_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CPU_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_GPU_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_GPU_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_GPU_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_GPU_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_DDR_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_DDR_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_DDR_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_DDR_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_UFS_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_UFS_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_UFS_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_UFS_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CORE_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CORE_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CORE_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CORE_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        start = 0L;
        curRequest = new SparseArray<>();
        mIInitialConfigProvider = null;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(26);
        TAG = CapabilityScheduler.class.getSimpleName();
        DEFAULT_CPU_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CPU_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CPU_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CPU_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_GPU_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_GPU_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_GPU_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_GPU_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_DDR_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_DDR_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_DDR_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_DDR_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_UFS_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_UFS_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_UFS_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_UFS_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CORE_BOOST_SHORT_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CORE_BOOST_LONG_LEVEL = FrequencyLevel.LEVEL_9;
        DEFAULT_CORE_LIMIT_SHORT_LEVEL = FrequencyLevel.LEVEL_3;
        DEFAULT_CORE_LIMIT_LONG_LEVEL = FrequencyLevel.LEVEL_3;
        start = 0L;
        curRequest = new SparseArray<>();
        mIInitialConfigProvider = null;
    }

    public static Set<CapabilityType> getSupportCapabilities() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], C144243eTN.LIZ(), C144243eTN.LIZ, false, 7);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        if (!C144243eTN.LJIIIIZZ.LIZIZ().booleanValue()) {
            C144239eTJ.LIZ(C144243eTN.LIZIZ, "registerApplication must be called before!!!");
            return null;
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], C144234eTE.LIZ(), C144234eTE.LIZ, false, 4);
        if (proxy3.isSupported) {
            return (Set) proxy3.result;
        }
        return C144230eTA.LIZIZ;
    }

    public static void setInitialConfigProvider(ISchedulerInitialConfigProvider iSchedulerInitialConfigProvider) {
        mIInitialConfigProvider = iSchedulerInitialConfigProvider;
    }

    public static void setAffinity(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 45).isSupported) {
            return;
        }
        setAffinity(Process.myTid(), i);
    }

    public static void setPriority(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 42).isSupported) {
            return;
        }
        setPriority(Process.myTid(), i);
    }

    public static boolean isSupportCapability(CapabilityType capabilityType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{capabilityType}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C144243eTN.LIZ().LIZ(capabilityType);
    }

    public static int resetAffinity(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 47);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.type = CapabilityType.CPU_AFFINITY.getIndex();
        customRequest.tid = i;
        C144243eTN.LIZ().LIZ(customRequest);
        return 1;
    }

    public static int resetPriority(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 44);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.type = CapabilityType.TASK_PRIORITY.getIndex();
        customRequest.tid = i;
        C144243eTN.LIZ().LIZ(customRequest);
        return 1;
    }

    public static void setLogLevel(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 3).isSupported && !PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, C144239eTJ.LIZ, true, 2).isSupported) {
            C144239eTJ.LIZIZ.LIZ(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void switchVboost(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 8).isSupported && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, null, C144243eTN.LIZ, true, 1).isSupported) {
            C144243eTN.LJIIIZ.LIZ(Boolean.valueOf(z));
        }
    }

    public static void registerApplication(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 1).isSupported && !PatchProxy.proxy(new Object[]{context}, C144243eTN.LIZ(), C144243eTN.LIZ, false, 3).isSupported) {
            if (C144243eTN.LJIIIZ.LIZIZ().booleanValue()) {
                if (!C144243eTN.LJIIIIZZ.LIZIZ().booleanValue()) {
                    C144239eTJ.LIZIZ(C144243eTN.LIZIZ, "register context.");
                    if (!PatchProxy.proxy(new Object[]{context}, null, C144234eTE.LIZ, true, 2).isSupported) {
                        C144234eTE.LIZJ.LIZ(context);
                        C144234eTE.LIZ();
                    }
                    C144243eTN.LJIIIIZZ.LIZ(Boolean.TRUE);
                    return;
                }
                return;
            }
            C144239eTJ.LIZIZ(C144243eTN.LIZIZ, "vboost not enable, do not register");
        }
    }

    public static void registerApplogListener(VboostListener.VboostApplogListener vboostApplogListener) {
        if (PatchProxy.proxy(new Object[]{vboostApplogListener}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        C144243eTN LIZ = C144243eTN.LIZ();
        if (!PatchProxy.proxy(new Object[]{vboostApplogListener}, LIZ, C144243eTN.LIZ, false, 4).isSupported) {
            LIZ.LJIIJ.LIZ(new WeakReference<>(vboostApplogListener));
            a$a a_a = LIZ.LJIIJJI;
            if (!PatchProxy.proxy(new Object[]{a_a}, null, C144246eTQ.LIZ, true, 1).isSupported) {
                C144246eTQ.LIZIZ.LIZ(a_a);
            }
        }
    }

    public static void registerSystemListener(VboostListener.SystemListener systemListener) {
        if (!PatchProxy.proxy(new Object[]{systemListener}, null, changeQuickRedirect, true, 49).isSupported && !PatchProxy.proxy(new Object[]{systemListener}, C144243eTN.LIZ(), C144243eTN.LIZ, false, 5).isSupported) {
            C144234eTE LIZ = C144234eTE.LIZ();
            if (!PatchProxy.proxy(new Object[]{systemListener}, LIZ, C144234eTE.LIZ, false, 7).isSupported) {
                LIZ.LIZLLL.LIZIZ().add(systemListener);
            }
        }
    }

    public static void setAllowedScenes(HashSet<Integer> hashSet) {
        if (PatchProxy.proxy(new Object[]{hashSet}, null, changeQuickRedirect, true, 9).isSupported) {
            return;
        }
        C144243eTN LIZ = C144243eTN.LIZ();
        if (!PatchProxy.proxy(new Object[]{hashSet}, LIZ, C144243eTN.LIZ, false, 2).isSupported) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                synchronized (LIZ.LJII) {
                    LIZ.LJII.LIZIZ().append(next.intValue(), true);
                }
            }
        }
    }

    public static void unregisterSystemListener(VboostListener.SystemListener systemListener) {
        if (!PatchProxy.proxy(new Object[]{systemListener}, null, changeQuickRedirect, true, 50).isSupported && !PatchProxy.proxy(new Object[]{systemListener}, C144243eTN.LIZ(), C144243eTN.LIZ, false, 6).isSupported) {
            C144234eTE LIZ = C144234eTE.LIZ();
            if (!PatchProxy.proxy(new Object[]{systemListener}, LIZ, C144234eTE.LIZ, false, 8).isSupported) {
                LIZ.LIZLLL.LIZIZ().remove(systemListener);
                Iterator<VboostListener.SystemListener> it = LIZ.LIZLLL.LIZIZ().iterator();
                while (it.hasNext()) {
                    if (systemListener == it.next()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static int requestCustomBoost(CustomRequest customRequest) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{customRequest}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!customRequest.restore) {
            C144243eTN.LIZ().LIZ(customRequest);
        } else {
            C144243eTN LIZ = C144243eTN.LIZ();
            if (!PatchProxy.proxy(new Object[]{customRequest}, LIZ, C144243eTN.LIZ, false, 17).isSupported && C144243eTN.LJIIIZ.LIZIZ().booleanValue()) {
                if (!C144243eTN.LJIIIIZZ.LIZIZ().booleanValue()) {
                    C144239eTJ.LIZ(C144243eTN.LIZIZ, "registerApplication must be called before!!!");
                    return 0;
                }
                String str = C144243eTN.LIZIZ;
                C144239eTJ.LIZ(str, "cancel custom request " + LIZ.LJI.size());
                for (Map.Entry<C0119c, CustomRequest> entry : LIZ.LJI.entrySet()) {
                    if (entry.getValue() == customRequest) {
                        C0119c key = entry.getKey();
                        key.LJIIJ = true;
                        LIZ.LIZIZ(key);
                        TimeoutStrategy timeoutStrategy = key.LJIIL;
                        if (timeoutStrategy == TimeoutStrategy.USE_PROVIDERS || timeoutStrategy == TimeoutStrategy.USER_CANCEL) {
                            if (key.LJIILIIL == NotifyStrategy.DIRECT) {
                                C144241eTL.LIZ(key);
                            } else {
                                LIZ.LJFF.submit(new CallableC144242eTM(key));
                            }
                        }
                        LIZ.LJI.remove(entry.getKey());
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    public static int requestOptimizedScene(CustomScene customScene, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{customScene, Integer.valueOf(i)}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CustomRequest customRequest = new CustomRequest(CapabilityType.PRESET_SCENE, customScene);
        customRequest.timeout = i;
        C144243eTN.LIZ().LIZ(customRequest);
        return 1;
    }

    public static int setAffinity(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 46);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.type = CapabilityType.CPU_AFFINITY.getIndex();
        customRequest.tid = i;
        customRequest.cluster = i2;
        C144243eTN.LIZ().LIZ(customRequest);
        return 1;
    }

    public static void setPriority(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 43).isSupported) {
            return;
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.type = CapabilityType.TASK_PRIORITY.getIndex();
        customRequest.tid = i;
        customRequest.priority = i2;
        C144243eTN.LIZ().LIZ(customRequest);
    }

    public static int requestOptimizedScene(CustomScene customScene, Status status) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{customScene, status}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (status == Status.END) {
            CustomRequest customRequest = curRequest.get(customScene.getId());
            if (customRequest == null) {
                C144239eTJ.LIZJ(TAG, C0002O.m25086C("restore a not start scene: ", customScene.getDesc()));
                return 0;
            }
            customRequest.restore = true;
            C144243eTN.LIZ().LIZ(customRequest);
            curRequest.remove(customScene.getId());
            return 1;
        }
        CustomRequest customRequest2 = new CustomRequest(CapabilityType.PRESET_SCENE, customScene);
        customRequest2.restore = false;
        if (C144243eTN.LIZ().LIZ(customRequest2) != null) {
            curRequest.put(customScene.getId(), customRequest2);
        }
        return 1;
    }

    public static void requestVibrateCapability(int i, float f, float f2, float f3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), str}, null, changeQuickRedirect, true, 41).isSupported) {
            return;
        }
        CustomRequest customRequest = new CustomRequest();
        customRequest.bundle = new Bundle();
        customRequest.bundle.putInt("scene_type", i);
        customRequest.bundle.putFloat("intensity", f);
        customRequest.bundle.putFloat("sharpness", f2);
        customRequest.bundle.putFloat("duration", f3);
        customRequest.bundle.putString("jsonFilePath", str);
        customRequest.type = CapabilityType.VIBRATE_ENHANCE.getIndex();
        C144243eTN.LIZ().LIZ(customRequest);
    }
}
