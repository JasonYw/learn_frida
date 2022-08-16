package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3093v;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToLoadingProps$1 extends Lambda implements Function2<C3098a, C3093v, C3093v> {
    public static final TransformFunctionKt$anchorStateToLoadingProps$1 INSTANCE = new TransformFunctionKt$anchorStateToLoadingProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16265);
    }

    public TransformFunctionKt$anchorStateToLoadingProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.v, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3093v invoke(C3098a c3098a, C3093v c3093v) {
        C3098a c3098a2 = c3098a;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3093v}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        if (!c3098a2.LIZIZ && c3098a2.LIZJ == 0) {
            z = false;
        }
        return new C3093v(z, false, 2);
    }
}
