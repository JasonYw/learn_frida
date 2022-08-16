package com.bytedance.android.annie.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StorageValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("type")
    public final String type;
    @SerializedName("value")
    public final String value;

    static {
        Covode.recordClassIndex(10534);
    }

    public static /* synthetic */ StorageValue copy$default(StorageValue storageValue, String str, String str2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{storageValue, str, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (StorageValue) proxy.result;
        }
        if ((i & 1) != 0) {
            str = storageValue.type;
        }
        if ((i & 2) != 0) {
            str2 = storageValue.value;
        }
        return storageValue.copy(str, str2);
    }

    private Object[] getObjects() {
        return new Object[]{this.type, this.value};
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final StorageValue copy(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (StorageValue) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new StorageValue(str, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof StorageValue) {
            return C106862S5w.LIZ(((StorageValue) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StorageValue:%s,%s", getObjects());
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public StorageValue(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.type = str;
        this.value = str2;
    }
}
