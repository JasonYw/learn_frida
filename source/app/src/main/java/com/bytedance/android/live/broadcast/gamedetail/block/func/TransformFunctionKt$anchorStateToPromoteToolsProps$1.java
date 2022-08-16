package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3082b;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToPromoteToolsProps$1 extends Lambda implements Function2<C3098a, C3082b, C3082b> {
    public static final TransformFunctionKt$anchorStateToPromoteToolsProps$1 INSTANCE = new TransformFunctionKt$anchorStateToPromoteToolsProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16267);
    }

    public TransformFunctionKt$anchorStateToPromoteToolsProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.b] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3082b invoke(C3098a c3098a, C3082b c3082b) {
        String str;
        C3213g c3213g;
        List<String> m15900LJ;
        C3098a c3098a2 = c3098a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3082b}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d == null || (m15900LJ = c3036d.m15900LJ()) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(m15900LJ, 0)) == null) {
            str = "";
        }
        C3036d c3036d2 = c3098a2.LIZLLL;
        if (c3036d2 != null) {
            c3213g = c3036d2.LJIIJ;
        } else {
            c3213g = null;
        }
        return new C3082b(str, c3213g);
    }
}
