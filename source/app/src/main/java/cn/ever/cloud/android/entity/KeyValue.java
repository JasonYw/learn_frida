package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class KeyValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String key;
    public final String value;

    static {
        Covode.recordClassIndex(2858);
    }

    public static /* synthetic */ KeyValue copy$default(KeyValue keyValue, String str, String str2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyValue, str, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (KeyValue) proxy.result;
        }
        if ((i & 1) != 0) {
            str = keyValue.key;
        }
        if ((i & 2) != 0) {
            str2 = keyValue.value;
        }
        return keyValue.copy(str, str2);
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

    public final KeyValue copy(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (KeyValue) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new KeyValue(str, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyValue) {
            return C106862S5w.LIZ(((KeyValue) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("KeyValue:%s,%s", getObjects());
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public KeyValue(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.key = str;
        this.value = str2;
    }
}
