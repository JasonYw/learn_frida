package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.CpuCoreLevel */
/* loaded from: classes25.dex */
public enum CpuCoreLevel {
    LEVEL_0("level_0", 0),
    LEVEL_1("level_1", 1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;
    public String name;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CpuCoreLevel[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CpuCoreLevel[]) proxy.result;
        }
        return (CpuCoreLevel[]) values().clone();
    }

    static {
        Covode.recordClassIndex(29);
    }

    public static CpuCoreLevel valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CpuCoreLevel) proxy.result;
        }
        return (CpuCoreLevel) Enum.valueOf(CpuCoreLevel.class, str);
    }

    CpuCoreLevel(String str, int i) {
        this.name = str;
        this.index = i;
    }
}
