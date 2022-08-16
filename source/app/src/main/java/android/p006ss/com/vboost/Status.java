package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.Status */
/* loaded from: classes4.dex */
public enum Status {
    BEGIN(1),
    END(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int status;

    public final int getStatus() {
        return this.status;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Status[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Status[]) proxy.result;
        }
        return (Status[]) values().clone();
    }

    static {
        Covode.recordClassIndex(39);
    }

    public static Status valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Status) proxy.result;
        }
        return (Status) Enum.valueOf(Status.class, str);
    }

    Status(int i) {
        this.status = i;
    }
}
