package cn.ever.cloud.android.persistence.table;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class DbKeyValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String key;
    public final String value;

    static {
        Covode.recordClassIndex(2941);
    }

    public static /* synthetic */ DbKeyValue copy$default(DbKeyValue dbKeyValue, String str, String str2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbKeyValue, str, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbKeyValue) proxy.result;
        }
        if ((i & 1) != 0) {
            str = dbKeyValue.key;
        }
        if ((i & 2) != 0) {
            str2 = dbKeyValue.value;
        }
        return dbKeyValue.copy(str, str2);
    }

    private Object[] getObjects() {
        return new Object[]{this.key, this.value};
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DbKeyValue copy(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DbKeyValue) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new DbKeyValue(str, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbKeyValue) {
            return C106862S5w.LIZ(((DbKeyValue) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbKeyValue:%s,%s", getObjects());
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public DbKeyValue(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.key = str;
        this.value = str2;
    }
}
