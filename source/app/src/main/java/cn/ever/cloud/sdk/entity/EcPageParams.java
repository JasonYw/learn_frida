package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcPageParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int count;
    public final String cursor;

    static {
        Covode.recordClassIndex(3396);
    }

    public static /* synthetic */ EcPageParams copy$default(EcPageParams ecPageParams, String str, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecPageParams, str, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcPageParams) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = ecPageParams.cursor;
        }
        if ((i2 & 2) != 0) {
            i = ecPageParams.count;
        }
        return ecPageParams.copy(str, i);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.cursor, Integer.valueOf(this.count)};
    }

    public final String component1() {
        return this.cursor;
    }

    public final int component2() {
        return this.count;
    }

    public final EcPageParams copy(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (EcPageParams) proxy.result : new EcPageParams(str, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcPageParams) {
            return C106862S5w.LIZ(((EcPageParams) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcPageParams:%s,%s", getObjects());
    }

    public final int getCount() {
        return this.count;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public EcPageParams(String str, int i) {
        this.cursor = str;
        this.count = i;
    }
}
