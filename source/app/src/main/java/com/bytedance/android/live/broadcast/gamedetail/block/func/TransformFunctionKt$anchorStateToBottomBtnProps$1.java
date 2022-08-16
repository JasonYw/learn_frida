package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3088n;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToBottomBtnProps$1 extends Lambda implements Function2<C3098a, C3088n, C3088n> {
    public static final TransformFunctionKt$anchorStateToBottomBtnProps$1 INSTANCE = new TransformFunctionKt$anchorStateToBottomBtnProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16260);
    }

    public TransformFunctionKt$anchorStateToBottomBtnProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.n, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3088n invoke(C3098a c3098a, C3088n c3088n) {
        C3098a c3098a2 = c3098a;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3088n}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d == null || !c3036d.LIZJ()) {
            z = false;
        }
        return new C3088n(z, false, 2);
    }
}
