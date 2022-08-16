package com.aweme.account.wxauth;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppContextManager;
import com.tencent.p3013mm.opensdk.openapi.IWXAPI;
import com.tencent.p3013mm.opensdk.openapi.WXAPIFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class WXAuth$Companion$sWXAPI$2 extends Lambda implements Function0<IWXAPI> {
    public static final WXAuth$Companion$sWXAPI$2 INSTANCE = new WXAuth$Companion$sWXAPI$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9371);
    }

    public WXAuth$Companion$sWXAPI$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.opensdk.openapi.IWXAPI, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IWXAPI mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(AppContextManager.INSTANCE.getApplicationContext(), "wx76fdd06dde311af3", false);
        createWXAPI.registerApp("wx76fdd06dde311af3");
        return createWXAPI;
    }
}
