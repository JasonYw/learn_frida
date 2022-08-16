package com.bytedance.android.annie.service.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class DefaultAnnieNetworkService$emptyCall$2 extends Lambda implements Function0<C26351> {
    public static final DefaultAnnieNetworkService$emptyCall$2 INSTANCE = new DefaultAnnieNetworkService$emptyCall$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11124);
    }

    public DefaultAnnieNetworkService$emptyCall$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.annie.service.network.DefaultAnnieNetworkService$emptyCall$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.annie.service.network.DefaultAnnieNetworkService$emptyCall$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C26351 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new AnnieCall<AnnieResponse>() { // from class: com.bytedance.android.annie.service.network.DefaultAnnieNetworkService$emptyCall$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(11125);
            }

            @Override // com.bytedance.android.annie.service.network.AnnieCall
            public final void cancel() {
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.annie.service.network.AnnieResponse, java.lang.Object] */
            @Override // com.bytedance.android.annie.service.network.AnnieCall
            public final /* synthetic */ AnnieResponse execute() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                return new AnnieResponse();
            }
        };
    }
}
