package com.android.ttcjpaysdk.thirdparty.verify;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public final class CJPayVerifyConstant {
    static {
        Covode.recordClassIndex(8886);
    }

    /* loaded from: classes17.dex */
    public enum OneStepPayMethods {
        DEFAULT(0),
        DIRECT_PAY(0),
        OLD_DIALOG(1),
        NEW_DIALOG(2),
        OLD_HALF_PAGE(3),
        NEW_HALF_PAGE(4),
        FRONT_INSUFFICIENT_SKIP_CONFIRM(5);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int type;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static OneStepPayMethods[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (OneStepPayMethods[]) proxy.result;
            }
            return (OneStepPayMethods[]) values().clone();
        }

        static {
            Covode.recordClassIndex(8887);
        }

        public static OneStepPayMethods valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (OneStepPayMethods) proxy.result;
            }
            return (OneStepPayMethods) Enum.valueOf(OneStepPayMethods.class, str);
        }

        OneStepPayMethods(int i) {
            this.type = i;
        }
    }
}
