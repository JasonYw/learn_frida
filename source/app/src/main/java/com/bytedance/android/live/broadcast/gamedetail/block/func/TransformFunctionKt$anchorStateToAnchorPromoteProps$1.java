package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3081a;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToAnchorPromoteProps$1 extends Lambda implements Function2<C3098a, C3081a, C3081a> {
    public static final TransformFunctionKt$anchorStateToAnchorPromoteProps$1 INSTANCE = new TransformFunctionKt$anchorStateToAnchorPromoteProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16259);
    }

    public TransformFunctionKt$anchorStateToAnchorPromoteProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.a] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3081a invoke(C3098a c3098a, C3081a c3081a) {
        C3098a c3098a2 = c3098a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3081a}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        return new C3081a(c3098a2.LIZLLL, false);
    }
}
