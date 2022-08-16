package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public interface TTCJPayRealNamePasswordCallback {
    static {
        Covode.recordClassIndex(9308);
    }

    void onSetPasswordResult(PasswordResult passwordResult);

    /* loaded from: classes17.dex */
    public enum PasswordResult {
        SET_PASSWORD_SUCCESS,
        SET_PASSWORD_CANCEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PasswordResult[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PasswordResult[]) proxy.result;
            }
            return (PasswordResult[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9309);
        }

        public static PasswordResult valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PasswordResult) proxy.result;
            }
            return (PasswordResult) Enum.valueOf(PasswordResult.class, str);
        }
    }
}
