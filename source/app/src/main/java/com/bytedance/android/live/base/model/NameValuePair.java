package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import p003X.QRX;

/* loaded from: classes8.dex */
public class NameValuePair implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = -6437800749411518984L;
    public final String name;
    public final String value;

    static {
        Covode.recordClassIndex(13965);
    }

    public Object clone() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return super.clone();
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return QRX.LIZ(QRX.LIZ(17, this.name), this.value);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean equals;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof NameValuePair) {
            NameValuePair nameValuePair = (NameValuePair) obj;
            if (this.name.equals(nameValuePair.name)) {
                String str = this.value;
                String str2 = nameValuePair.value;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, str2}, null, QRX.LIZ, true, 3);
                if (proxy2.isSupported) {
                    equals = ((Boolean) proxy2.result).booleanValue();
                } else if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else {
                    equals = str.equals(str2);
                }
                if (equals) {
                    return true;
                }
            }
        }
        return false;
    }

    public NameValuePair(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
