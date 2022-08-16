package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3091q;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToGameIntroProps$1 extends Lambda implements Function2<C3098a, C3091q, C3091q> {
    public static final TransformFunctionKt$anchorStateToGameIntroProps$1 INSTANCE = new TransformFunctionKt$anchorStateToGameIntroProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16264);
    }

    public TransformFunctionKt$anchorStateToGameIntroProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.q] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3091q invoke(C3098a c3098a, C3091q c3091q) {
        C3243u c3243u;
        C3098a c3098a2 = c3098a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3091q}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d != null) {
            c3243u = c3036d.LIZIZ;
        } else {
            c3243u = null;
        }
        return new C3091q(c3243u, true, true, true);
    }
}
