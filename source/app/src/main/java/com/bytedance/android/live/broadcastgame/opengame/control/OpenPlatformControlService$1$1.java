package com.bytedance.android.live.broadcastgame.opengame.control;

import com.bytedance.android.livesdk.wrds.p758a.C9418b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class OpenPlatformControlService$1$1 extends Lambda implements Function0<C9418b> {
    public static final OpenPlatformControlService$1$1 INSTANCE = new OpenPlatformControlService$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20006);
    }

    public OpenPlatformControlService$1$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.wrds.a.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C9418b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C9418b();
    }
}
