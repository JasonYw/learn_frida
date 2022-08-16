package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class PageParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int count;
    public final String cursor;

    static {
        Covode.recordClassIndex(2862);
    }

    public static /* synthetic */ PageParams copy$default(PageParams pageParams, String str, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageParams, str, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PageParams) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = pageParams.cursor;
        }
        if ((i2 & 2) != 0) {
            i = pageParams.count;
        }
        return pageParams.copy(str, i);
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

    public final PageParams copy(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (PageParams) proxy.result : new PageParams(str, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PageParams) {
            return C106862S5w.LIZ(((PageParams) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PageParams:%s,%s", getObjects());
    }

    public final int getCount() {
        return this.count;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public PageParams(String str, int i) {
        this.cursor = str;
        this.count = i;
    }
}
