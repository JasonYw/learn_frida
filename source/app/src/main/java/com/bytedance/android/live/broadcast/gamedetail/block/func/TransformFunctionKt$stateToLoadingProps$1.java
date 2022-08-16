package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3093v;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$stateToLoadingProps$1 extends Lambda implements Function2<C3101e, C3093v, C3093v> {
    public static final TransformFunctionKt$stateToLoadingProps$1 INSTANCE = new TransformFunctionKt$stateToLoadingProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16271);
    }

    public TransformFunctionKt$stateToLoadingProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.v, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3093v invoke(C3101e c3101e, C3093v c3093v) {
        C3101e c3101e2 = c3101e;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3093v}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        boolean z2 = c3101e2.LIZIZ;
        if (c3101e2.LIZJ != 200) {
            z = true;
        }
        return new C3093v(z2, z);
    }
}
