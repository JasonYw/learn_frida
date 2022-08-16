package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ProviderKey {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Long[] inner;

    static {
        Covode.recordClassIndex(3096);
    }

    public final Long[] getInner() {
        return this.inner;
    }

    public ProviderKey(Long[] lArr) {
        C106862S5w.LIZ((Object) lArr);
        this.inner = lArr;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof ProviderKey)) {
            return false;
        }
        return Arrays.equals(this.inner, ((ProviderKey) obj).inner);
    }
}
