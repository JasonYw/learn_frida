package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3088n;
import com.bytedance.android.live.broadcast.gamedetail.order.C3102g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$orderStateToBottomBtnProps$1 extends Lambda implements Function2<C3102g, C3088n, C3088n> {
    public static final TransformFunctionKt$orderStateToBottomBtnProps$1 INSTANCE = new TransformFunctionKt$orderStateToBottomBtnProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16268);
    }

    public TransformFunctionKt$orderStateToBottomBtnProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.n, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3088n invoke(C3102g c3102g, C3088n c3088n) {
        C3102g c3102g2 = c3102g;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3102g2, c3088n}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3102g2);
        return new C3088n(c3102g2.LIZJ, c3102g2.LIZIZ.LIZIZ);
    }
}
