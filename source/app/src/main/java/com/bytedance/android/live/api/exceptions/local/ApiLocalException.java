package com.bytedance.android.live.api.exceptions.local;

import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes5.dex */
public class ApiLocalException extends ApiException {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13928);
    }

    @Override // com.bytedance.android.live.base.exception.ApiException, java.lang.Throwable
    public String getMessage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25086C(" TYPE = ApiLocalException ", super.getMessage());
    }

    public ApiLocalException(int i) {
        super(i);
    }

    public ApiLocalException(int i, Throwable th) {
        super(i, th);
    }
}
