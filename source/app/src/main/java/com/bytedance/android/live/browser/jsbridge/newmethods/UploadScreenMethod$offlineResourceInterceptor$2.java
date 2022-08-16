package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.live.browser.p302f.C3880c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes26.dex */
public final class UploadScreenMethod$offlineResourceInterceptor$2 extends Lambda implements Function0<C3880c> {
    public static final UploadScreenMethod$offlineResourceInterceptor$2 INSTANCE = new UploadScreenMethod$offlineResourceInterceptor$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22624);
    }

    public UploadScreenMethod$offlineResourceInterceptor$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.browser.f.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3880c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3880c();
    }
}
