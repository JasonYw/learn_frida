package com.bytedance.android.live.base.exception;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes5.dex */
public class ApiServerException extends ApiException {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean blockNotice;
    public String mAlert;
    public String mErrorMsg;
    public String mExtra;
    public String mPrompt;

    static {
        Covode.recordClassIndex(13952);
    }

    @Override // com.bytedance.android.live.base.exception.ApiException, java.lang.Throwable
    public String getMessage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25082C(" TYPE = ApiServerException, errorMsg = ", this.mErrorMsg, " extra = ", this.mExtra, " ", super.getMessage());
    }

    public ApiServerException(int i) {
        super(i);
    }

    public final ApiServerException LIZ(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public final ApiServerException LIZIZ(String str) {
        this.mPrompt = str;
        return this;
    }

    public final ApiServerException LIZJ(String str) {
        this.mAlert = str;
        return this;
    }

    public final ApiServerException LIZLLL(String str) {
        this.mExtra = str;
        return this;
    }

    public final ApiServerException LIZ(boolean z) {
        this.blockNotice = z;
        return this;
    }
}
