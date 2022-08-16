package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3092r;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
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
public final class TransformFunctionKt$anchorStateToOfficialProps$1 extends Lambda implements Function2<C3098a, C3092r, C3092r> {
    public static final TransformFunctionKt$anchorStateToOfficialProps$1 INSTANCE = new TransformFunctionKt$anchorStateToOfficialProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16266);
    }

    public TransformFunctionKt$anchorStateToOfficialProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.r] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3092r invoke(C3098a c3098a, C3092r c3092r) {
        List<C3108d> list;
        C3108d c3108d;
        C3098a c3098a2 = c3098a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3092r}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d == null || (list = c3036d.LJIJ) == null || (c3108d = (C3108d) CollectionsKt___CollectionsKt.getOrNull(list, 0)) == null) {
            return null;
        }
        return new C3092r(c3108d.LIZJ, c3108d.LIZ(), c3108d.LIZIZ(), false, c3108d.LIZJ(), c3108d.LJII);
    }
}
