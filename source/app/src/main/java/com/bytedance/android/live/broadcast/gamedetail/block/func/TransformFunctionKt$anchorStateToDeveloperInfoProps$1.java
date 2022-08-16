package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3090p;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToDeveloperInfoProps$1 extends Lambda implements Function2<C3098a, C3090p, C3090p> {
    public static final TransformFunctionKt$anchorStateToDeveloperInfoProps$1 INSTANCE = new TransformFunctionKt$anchorStateToDeveloperInfoProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16261);
    }

    public TransformFunctionKt$anchorStateToDeveloperInfoProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.p] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3090p invoke(C3098a c3098a, C3090p c3090p) {
        String str;
        String str2;
        List<C3108d> list;
        C3243u c3243u;
        C3243u c3243u2;
        C3098a c3098a2 = c3098a;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3090p}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        if (c3036d == null || (c3243u2 = c3036d.LIZIZ) == null || (str = c3243u2.LJI) == null) {
            str = "";
        }
        C3036d c3036d2 = c3098a2.LIZLLL;
        if (c3036d2 != null && (c3243u = c3036d2.LIZIZ) != null) {
            str2 = c3243u.LJJIFFI;
        } else {
            str2 = null;
        }
        String m25085C = C0002O.m25085C("预计", str2, "上线");
        C3036d c3036d3 = c3098a2.LIZLLL;
        if (c3036d3 != null && (list = c3036d3.LJIJ) != null && (list == null || list.isEmpty())) {
            z = true;
        }
        return new C3090p(str, m25085C, z);
    }
}
