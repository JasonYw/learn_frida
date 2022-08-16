package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.CapabilityType */
/* loaded from: classes19.dex */
public enum CapabilityType {
    CPU_FREQ_MIN("cpu_freq_min", 1),
    CPU_FREQ_MAX("cpu_freq_max", 2),
    CPU_CORE_MIN("cpu_core_min", 3),
    CPU_CORE_MAX("cpu_core_max", 4),
    GPU_FREQ_MIN("gpu_freq_min", 5),
    GPU_FREQ_MAX("gpu_freq_max", 6),
    BUS_FREQ_MIN("bus_freq_min", 7),
    BUS_FREQ_MAX("bus_freq_max", 8),
    UFS_FREQ_MIN("ufs_freq_min", 9),
    UFS_FREQ_MAX("ufs_freq_max", 10),
    TASK_PRIORITY("task_priority", 11),
    CPU_AFFINITY("cpu_affinity", 12),
    IDLE_STATE("idle_state", 13),
    IO_PRELOAD("io_preload", 14),
    NETWORK_ENHANCE("network_enhance", 15),
    PRESET_SCENE("preset_scene", 16),
    THUMB_FETCH("thumb_fetch", 17),
    VIBRATE_ENHANCE("vibrate_enhance", 18),
    TYPE_MIN(CPU_FREQ_MIN),
    TYPE_MAX(VIBRATE_ENHANCE);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;
    public String name;

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CapabilityType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CapabilityType[]) proxy.result;
        }
        return (CapabilityType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(27);
    }

    public static CapabilityType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CapabilityType) proxy.result;
        }
        return (CapabilityType) Enum.valueOf(CapabilityType.class, str);
    }

    public static CapabilityType valueOf(int i) {
        CapabilityType[] valuesCustom;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (CapabilityType) proxy.result;
        }
        for (CapabilityType capabilityType : valuesCustom()) {
            if (i == capabilityType.index) {
                return capabilityType;
            }
        }
        throw new RuntimeException("Can't find enum type for index: " + i);
    }

    CapabilityType(CapabilityType capabilityType) {
        this.name = capabilityType.name;
        this.index = capabilityType.index;
    }

    CapabilityType(String str, int i) {
        this.name = str;
        this.index = i;
    }
}
