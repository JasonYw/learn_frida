package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcPageData<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String cursor;
    public final List<T> data;
    public final boolean hasMore;

    static {
        Covode.recordClassIndex(3395);
    }

    public static /* synthetic */ EcPageData copy$default(EcPageData ecPageData, boolean z, String str, List list, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecPageData, Byte.valueOf(b), str, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcPageData) proxy.result;
        }
        if ((i & 1) != 0) {
            z = ecPageData.hasMore;
        }
        if ((i & 2) != 0) {
            str = ecPageData.cursor;
        }
        if ((i & 4) != 0) {
            list = ecPageData.data;
        }
        return ecPageData.copy(z, str, list);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.hasMore), this.cursor, this.data};
    }

    public final boolean component1() {
        return this.hasMore;
    }

    public final String component2() {
        return this.cursor;
    }

    public final List<T> component3() {
        return this.data;
    }

    public final EcPageData<T> copy(boolean z, String str, List<? extends T> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcPageData) proxy.result;
        }
        C106862S5w.LIZ(list);
        return new EcPageData<>(z, str, list);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcPageData) {
            return C106862S5w.LIZ(((EcPageData) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcPageData:%s,%s,%s", getObjects());
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<T> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcPageData(boolean z, String str, List<? extends T> list) {
        C106862S5w.LIZ(list);
        this.hasMore = z;
        this.cursor = str;
        this.data = list;
    }
}
