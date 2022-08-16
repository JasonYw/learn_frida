package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C103184QkE;

/* loaded from: classes5.dex */
public final class LiveOpenGameClient$hasCheckOpenApiServiceSet$2 extends Lambda implements Function0<C103184QkE<Class<?>>> {
    public static final LiveOpenGameClient$hasCheckOpenApiServiceSet$2 INSTANCE = new LiveOpenGameClient$hasCheckOpenApiServiceSet$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20333);
    }

    public LiveOpenGameClient$hasCheckOpenApiServiceSet$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.QkE<java.lang.Class<?>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C103184QkE<Class<?>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C103184QkE<>();
    }
}
