package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C87691Kgv;

/* loaded from: classes5.dex */
public final class CloudConstant {

    /* loaded from: classes5.dex */
    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS;
        
        public static final C87691Kgv Companion = new C87691Kgv((byte) 0);
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19960);
        }

        public static Method valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Method) (proxy.isSupported ? proxy.result : Enum.valueOf(Method.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Method[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Method[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19959);
    }
}
