package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C147277fGR;

/* loaded from: classes20.dex */
public class OutsideScopeException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23998);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        MethodCollector.m14708i(1626);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            Throwable th = (Throwable) proxy.result;
            MethodCollector.m14707o(1626);
            return th;
        } else if (C147277fGR.LIZ) {
            Throwable fillInStackTrace = super.fillInStackTrace();
            MethodCollector.m14707o(1626);
            return fillInStackTrace;
        } else {
            MethodCollector.m14707o(1626);
            return this;
        }
    }

    public OutsideScopeException(String str) {
        super(str);
    }
}
