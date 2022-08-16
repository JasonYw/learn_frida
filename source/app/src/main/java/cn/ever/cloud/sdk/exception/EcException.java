package cn.ever.cloud.sdk.exception;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class EcException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;

    static {
        Covode.recordClassIndex(3414);
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "code=" + this.code + ", message=" + getMessage();
    }

    public EcException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }
}
