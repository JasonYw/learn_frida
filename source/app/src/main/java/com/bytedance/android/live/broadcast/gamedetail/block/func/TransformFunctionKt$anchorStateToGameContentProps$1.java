package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.C3050a;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToGameContentProps$1 extends Lambda implements Function2<C3098a, C3050a, C3050a> {
    public static final TransformFunctionKt$anchorStateToGameContentProps$1 INSTANCE = new TransformFunctionKt$anchorStateToGameContentProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16262);
    }

    public TransformFunctionKt$anchorStateToGameContentProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.a] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3050a invoke(C3098a c3098a, C3050a c3050a) {
        List<C3108d> list;
        C3098a c3098a2 = c3098a;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3050a}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        boolean z2 = c3098a2.LIZIZ;
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d != null) {
            list = c3036d.LJIJ;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            z = true;
        }
        return new C3050a(z2, !z);
    }
}
