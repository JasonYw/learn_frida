package com.bytedance.android.live.core.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes3.dex */
public class CustomApiServerException extends ApiServerException {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String url;
    public String xTtLogId;

    static {
        Covode.recordClassIndex(23521);
    }

    @Override // com.bytedance.android.live.base.exception.ApiServerException, com.bytedance.android.live.base.exception.ApiException, java.lang.Throwable
    public String getMessage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25082C(" TYPE = CustomApiServerException, url = ", this.url, ", xTtLogId = ", this.xTtLogId, "  ", super.getMessage());
    }

    public CustomApiServerException(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.url = "";
        } else {
            this.url = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.xTtLogId = "";
        } else {
            this.xTtLogId = str2;
        }
    }
}
