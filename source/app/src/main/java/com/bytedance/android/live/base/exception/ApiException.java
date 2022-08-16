package com.bytedance.android.live.base.exception;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public class ApiException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int mErrorCode;
    public int requestType;

    static {
        Covode.recordClassIndex(13951);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return " TYPE = ApiException, errorCode = " + this.mErrorCode + " " + super.getMessage();
    }

    public ApiException(int i) {
        this.mErrorCode = i;
    }

    public ApiException(int i, Throwable th) {
        super(th);
        this.mErrorCode = i;
    }
}
