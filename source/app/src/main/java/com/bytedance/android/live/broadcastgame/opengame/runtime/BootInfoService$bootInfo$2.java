package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class BootInfoService$bootInfo$2 extends Lambda implements Function0<C3657d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BootInfoService this$0;

    static {
        Covode.recordClassIndex(20836);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootInfoService$bootInfo$2(BootInfoService bootInfoService) {
        super(0);
        this.this$0 = bootInfoService;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcastgame.opengame.runtime.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3657d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.this$0.LJFF();
        return this.this$0.LJFF().LJIIIIZZ.LJIIJ;
    }
}
