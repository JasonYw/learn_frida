package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;

/* loaded from: classes17.dex */
public interface ICustomActionListener {

    /* loaded from: classes17.dex */
    public enum ActionType {
        CASHIER_IMP,
        CASHIER_CONFIRM_CLICK;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9289);
        }

        public static ActionType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ActionType) (proxy.isSupported ? proxy.result : Enum.valueOf(ActionType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ActionType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(9288);
    }

    void onAction(ActionType actionType, Map<String, String> map);
}
