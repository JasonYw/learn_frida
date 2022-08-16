package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$cancelPromoteDialog$2 extends Lambda implements Function0<C3033a> {
    public static final AnchorGamePromoteDetailDialog$cancelPromoteDialog$2 INSTANCE = new AnchorGamePromoteDetailDialog$cancelPromoteDialog$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16022);
    }

    public AnchorGamePromoteDetailDialog$cancelPromoteDialog$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.anchor.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3033a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3033a();
    }
}
