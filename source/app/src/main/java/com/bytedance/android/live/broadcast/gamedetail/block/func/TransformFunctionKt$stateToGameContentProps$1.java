package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.C3122g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$stateToGameContentProps$1 extends Lambda implements Function2<C3101e, C3122g, C3122g> {
    public static final TransformFunctionKt$stateToGameContentProps$1 INSTANCE = new TransformFunctionKt$stateToGameContentProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16270);
    }

    public TransformFunctionKt$stateToGameContentProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.gamedetailv2.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3122g invoke(C3101e c3101e, C3122g c3122g) {
        C3101e c3101e2 = c3101e;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3122g}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        return new C3122g(c3101e2.LIZIZ, c3101e2.LIZLLL, c3101e2.f25877LJ, Integer.valueOf(c3101e2.LIZJ));
    }
}
