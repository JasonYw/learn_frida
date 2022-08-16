package cn.ever.cloud.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.clientreport.data.Config;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C103539Qpx;

/* loaded from: classes2.dex */
public final class MemUtil {
    public static final MemUtil INSTANCE = new MemUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes23.dex */
    public static final class AllMemInfo {
        public final float jMaxMem;
        public final float jUsedMem;
        public final float jUsedRatio;
        public final float nativeMaxMem;
        public final float nativeUsedMem;
        public final float nativeUsedRatio;
        public final float sysMaxMem;
        public final float sysUsedMem;
        public final float sysUsedRatio;

        static {
            Covode.recordClassIndex(3437);
        }

        public final float getJMaxMem() {
            return this.jMaxMem;
        }

        public final float getJUsedMem() {
            return this.jUsedMem;
        }

        public final float getJUsedRatio() {
            return this.jUsedRatio;
        }

        public final float getNativeMaxMem() {
            return this.nativeMaxMem;
        }

        public final float getNativeUsedMem() {
            return this.nativeUsedMem;
        }

        public final float getNativeUsedRatio() {
            return this.nativeUsedRatio;
        }

        public final float getSysMaxMem() {
            return this.sysMaxMem;
        }

        public final float getSysUsedMem() {
            return this.sysUsedMem;
        }

        public final float getSysUsedRatio() {
            return this.sysUsedRatio;
        }

        public AllMemInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.jUsedMem = f;
            this.jMaxMem = f2;
            this.jUsedRatio = f3;
            this.sysUsedMem = f4;
            this.sysMaxMem = f5;
            this.sysUsedRatio = f6;
            this.nativeUsedMem = f7;
            this.nativeMaxMem = f8;
            this.nativeUsedRatio = f9;
        }
    }

    static {
        Covode.recordClassIndex(3436);
    }

    private final long getSystemAvailMem() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return getSystemMemoryInfo().availMem;
    }

    private final ActivityManager.MemoryInfo getSystemMemoryInfo() {
        Object systemService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ActivityManager.MemoryInfo) proxy.result;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context appContext = CtxUtil.INSTANCE.appContext();
        if (appContext != null && (systemService = appContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) != null) {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    private final boolean isSystemLowMemory() {
        Object systemService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context appContext = CtxUtil.INSTANCE.appContext();
        if (appContext != null && (systemService = appContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) != null) {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    public final boolean isSystemLowMemoryOrNotEnough() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!isSystemLowMemory() && getSystemAvailMem() / Config.DEFAULT_MAX_FILE_LENGTH >= 150) {
            return false;
        }
        return true;
    }

    public final void logHeap() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        LogHelper.INSTANCE.m20555d("MemUtil", C0002O.m25086C("memory:", getHeapInfo()));
    }

    public final String nativeHeapInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String format = String.format("native: free:%sMB total:%sMB max:%sMB", Arrays.copyOf(new Object[]{Long.valueOf((Debug.getNativeHeapFreeSize() / 1024) / 1024), Long.valueOf((Debug.getNativeHeapAllocatedSize() / 1024) / 1024), Long.valueOf((Debug.getNativeHeapSize() / 1024) / 1024)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final AllMemInfo pickAllMemInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (AllMemInfo) proxy.result;
        }
        Runtime runtime = Runtime.getRuntime();
        float f = (((float) runtime.totalMemory()) / 1024.0f) / 1024.0f;
        float maxMemory = (((float) runtime.maxMemory()) / 1024.0f) / 1024.0f;
        ActivityManager.MemoryInfo systemMemoryInfo = getSystemMemoryInfo();
        float f2 = (((float) (systemMemoryInfo.totalMem - systemMemoryInfo.availMem)) / 1024.0f) / 1024.0f;
        float f3 = (((float) systemMemoryInfo.totalMem) / 1024.0f) / 1024.0f;
        float nativeHeapAllocatedSize = (((float) Debug.getNativeHeapAllocatedSize()) / 1024.0f) / 1024.0f;
        float nativeHeapSize = (((float) Debug.getNativeHeapSize()) / 1024.0f) / 1024.0f;
        return new AllMemInfo(f, maxMemory, f / maxMemory, f2, f3, f2 / f3, nativeHeapAllocatedSize, nativeHeapSize, nativeHeapAllocatedSize / nativeHeapSize);
    }

    private final String getHeapInfo() {
        Object systemService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        LogHelper.INSTANCE.m20555d("MemUtil", "memory.checking...");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context appContext = CtxUtil.INSTANCE.appContext();
        if (appContext != null && (systemService = appContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) != null) {
            ActivityManager activityManager = (ActivityManager) systemService;
            activityManager.getMemoryInfo(memoryInfo);
            Runtime runtime = Runtime.getRuntime();
            String format = String.format("free:%s%% %sMB total:%sMB max:%sMB ", Arrays.copyOf(new Object[]{Float.valueOf((((float) runtime.freeMemory()) * 100.0f) / ((float) runtime.totalMemory())), Long.valueOf((runtime.freeMemory() / 1024) / 1024), Long.valueOf((runtime.totalMemory() / 1024) / 1024), Long.valueOf((runtime.maxMemory() / 1024) / 1024)}, 4));
            Intrinsics.checkNotNullExpressionValue(format, "");
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            String format2 = String.format("\nnative heap: free:%sMB total:%sMB max:%sMB", Arrays.copyOf(new Object[]{Long.valueOf((Debug.getNativeHeapFreeSize() / 1024) / 1024), Long.valueOf((Debug.getNativeHeapAllocatedSize() / 1024) / 1024), Long.valueOf((Debug.getNativeHeapSize() / 1024) / 1024)}, 3));
            Intrinsics.checkNotNullExpressionValue(format2, "");
            sb.append(format2);
            String sb2 = sb.toString();
            Debug.MemoryInfo memoryInfo2 = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
            Intrinsics.checkNotNullExpressionValue(memoryInfo2, "");
            int totalPss = memoryInfo2.getTotalPss();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String format3 = String.format("\ntotalPss:%sMB, availMem:%sMB", Arrays.copyOf(new Object[]{Integer.valueOf(totalPss / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END), Long.valueOf((memoryInfo.availMem / 1024) / 1024)}, 2));
            Intrinsics.checkNotNullExpressionValue(format3, "");
            sb3.append(format3);
            String sb4 = sb3.toString();
            return sb4 + C103539Qpx.trimIndent("\n        \n        lowMemory:" + memoryInfo.lowMemory + "\n        ");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
