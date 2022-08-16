package cn.ever.cloud.network.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ApiBean<REQ, RESP> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String methodName;
    public final Class<REQ> request;
    public final Class<RESP> response;
    public final String version;

    static {
        Covode.recordClassIndex(3168);
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final Class<REQ> getRequest() {
        return this.request;
    }

    public final Class<RESP> getResponse() {
        return this.response;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.version;
        if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
            return this.version + '/' + this.methodName;
        }
        return this.methodName;
    }

    public ApiBean(String str, String str2, Class<REQ> cls, Class<RESP> cls2) {
        C106862S5w.LIZ(str2, cls, cls2);
        this.version = str;
        this.methodName = str2;
        this.request = cls;
        this.response = cls2;
    }
}
