package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class AuditBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("md5")
    public final String md5;
    @SerializedName("oid")
    public final String oid;
    @SerializedName("repeat")
    public final int repeat;

    static {
        Covode.recordClassIndex(20253);
    }

    public static /* synthetic */ AuditBean copy$default(AuditBean auditBean, String str, String str2, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{auditBean, str, str2, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AuditBean) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = auditBean.md5;
        }
        if ((i2 & 2) != 0) {
            str2 = auditBean.oid;
        }
        if ((i2 & 4) != 0) {
            i = auditBean.repeat;
        }
        return auditBean.copy(str, str2, i);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.md5, this.oid, Integer.valueOf(this.repeat)};
    }

    public final String component1() {
        return this.md5;
    }

    public final String component2() {
        return this.oid;
    }

    public final int component3() {
        return this.repeat;
    }

    public final AuditBean copy(String str, String str2, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AuditBean) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new AuditBean(str, str2, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuditBean) {
            return C106862S5w.LIZ(((AuditBean) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AuditBean:%s,%s,%s", getObjects());
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getOid() {
        return this.oid;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public AuditBean(String str, String str2, int i) {
        C106862S5w.LIZ(str, str2);
        this.md5 = str;
        this.oid = str2;
        this.repeat = i;
    }
}
