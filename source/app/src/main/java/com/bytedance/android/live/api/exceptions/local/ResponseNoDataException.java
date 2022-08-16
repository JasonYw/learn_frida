package com.bytedance.android.live.api.exceptions.local;

import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes5.dex */
public class ResponseNoDataException extends ApiLocalException {
    public static ChangeQuickRedirect changeQuickRedirect;
    public C5171b mResponse;

    static {
        Covode.recordClassIndex(13930);
    }

    public ResponseNoDataException() {
        super(-2);
    }

    @Override // com.bytedance.android.live.api.exceptions.local.ApiLocalException, com.bytedance.android.live.base.exception.ApiException, java.lang.Throwable
    public String getMessage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25086C(" TYPE = ResponseNoDataException ", super.getMessage());
    }

    public ResponseNoDataException(C5171b c5171b) {
        super(-2);
        this.mResponse = c5171b;
    }
}
