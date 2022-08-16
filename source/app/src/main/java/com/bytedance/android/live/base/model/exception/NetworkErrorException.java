package com.bytedance.android.live.base.model.exception;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;

/* loaded from: classes8.dex */
public class NetworkErrorException extends IOException {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(14025);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String iOException = super.toString();
        if (iOException != null) {
            return iOException + "NetworkErrorException{statusCode=" + this.statusCode + ", message='" + this.message + "'}";
        }
        return iOException;
    }

    public NetworkErrorException(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
