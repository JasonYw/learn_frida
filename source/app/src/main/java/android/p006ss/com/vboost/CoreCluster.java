package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.CoreCluster */
/* loaded from: classes19.dex */
public enum CoreCluster {
    SILVER(1),
    GOLD(2),
    SUPER(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CoreCluster[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CoreCluster[]) proxy.result;
        }
        return (CoreCluster[]) values().clone();
    }

    static {
        Covode.recordClassIndex(28);
    }

    public static CoreCluster valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return SUPER;
            }
            return GOLD;
        }
        return SILVER;
    }

    public static CoreCluster valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CoreCluster) proxy.result;
        }
        return (CoreCluster) Enum.valueOf(CoreCluster.class, str);
    }

    CoreCluster(int i) {
        this.index = i;
    }
}
