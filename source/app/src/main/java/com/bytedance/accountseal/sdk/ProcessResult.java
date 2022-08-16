package com.bytedance.accountseal.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class ProcessResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(9875);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZ), this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public static /* synthetic */ ProcessResult copy$default(ProcessResult processResult, int i, String str, String str2, String str3, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{processResult, Integer.valueOf(i), str, str2, str3, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (ProcessResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = processResult.LIZ;
        }
        if ((i2 & 2) != 0) {
            str = processResult.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = processResult.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str3 = processResult.LIZLLL;
        }
        return processResult.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.LIZ;
    }

    public final String component2() {
        return this.LIZIZ;
    }

    public final String component3() {
        return this.LIZJ;
    }

    public final String component4() {
        return this.LIZLLL;
    }

    public final ProcessResult copy(int i, String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, str3}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProcessResult) proxy.result;
        }
        C106862S5w.LIZ(str3);
        return new ProcessResult(i, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessResult) {
            return C106862S5w.LIZ(((ProcessResult) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ProcessResult:%s,%s,%s,%s", LIZ());
    }

    public final int getCode() {
        return this.LIZ;
    }

    public final String getMobile() {
        return this.LIZJ;
    }

    public final String getToken() {
        return this.LIZIZ;
    }

    public final String getVType() {
        return this.LIZLLL;
    }

    public final JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status_code", this.LIZ);
        jSONObject.put("token", this.LIZIZ);
        jSONObject.put("mobile", this.LIZJ);
        jSONObject.put("verify_type", this.LIZLLL);
        return jSONObject;
    }

    public ProcessResult(int i, String str, String str2, String str3) {
        C106862S5w.LIZ(str3);
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
