package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AlbumChange {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<Long> deleted;
    public final List<Album> upsert;

    static {
        Covode.recordClassIndex(2849);
    }

    public static /* synthetic */ AlbumChange copy$default(AlbumChange albumChange, List list, List list2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumChange, list, list2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AlbumChange) proxy.result;
        }
        if ((i & 1) != 0) {
            list = albumChange.upsert;
        }
        if ((i & 2) != 0) {
            list2 = albumChange.deleted;
        }
        return albumChange.copy(list, list2);
    }

    private Object[] getObjects() {
        return new Object[]{this.upsert, this.deleted};
    }

    public final List<Album> component1() {
        return this.upsert;
    }

    public final List<Long> component2() {
        return this.deleted;
    }

    public final AlbumChange copy(List<Album> list, List<Long> list2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AlbumChange) proxy.result;
        }
        C106862S5w.LIZ(list, list2);
        return new AlbumChange(list, list2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumChange) {
            return C106862S5w.LIZ(((AlbumChange) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AlbumChange:%s,%s", getObjects());
    }

    public final List<Long> getDeleted() {
        return this.deleted;
    }

    public final List<Album> getUpsert() {
        return this.upsert;
    }

    public AlbumChange(List<Album> list, List<Long> list2) {
        C106862S5w.LIZ(list, list2);
        this.upsert = list;
        this.deleted = list2;
    }
}
