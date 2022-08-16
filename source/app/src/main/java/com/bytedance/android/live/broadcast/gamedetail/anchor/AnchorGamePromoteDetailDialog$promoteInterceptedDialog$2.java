package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$promoteInterceptedDialog$2 extends Lambda implements Function0<C3039l> {
    public static final AnchorGamePromoteDetailDialog$promoteInterceptedDialog$2 INSTANCE = new AnchorGamePromoteDetailDialog$promoteInterceptedDialog$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16032);
    }

    public AnchorGamePromoteDetailDialog$promoteInterceptedDialog$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.gamedetail.anchor.l, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3039l mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3039l();
    }
}
