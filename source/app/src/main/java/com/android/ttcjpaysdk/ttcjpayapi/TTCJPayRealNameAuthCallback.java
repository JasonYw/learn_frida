package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public interface TTCJPayRealNameAuthCallback {
    static {
        Covode.recordClassIndex(9306);
    }

    void onAuthResult(AuthResult authResult);

    /* loaded from: classes17.dex */
    public enum AuthResult {
        AUTH_SUCCESS,
        AUTH_ERROR,
        AUTH_CANCEL,
        LOGOUT_ACCOUNT,
        AUTHORIZED,
        WITHOUT_REAL_NAME,
        QUERY_AUTH_INFO_ERROR;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AuthResult[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (AuthResult[]) proxy.result;
            }
            return (AuthResult[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9307);
        }

        public static AuthResult valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (AuthResult) proxy.result;
            }
            return (AuthResult) Enum.valueOf(AuthResult.class, str);
        }
    }
}
