package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3089o;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3109e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TransformFunctionKt$anchorStateToGameDetailProps$1 extends Lambda implements Function2<C3098a, C3089o, C3089o> {
    public static final TransformFunctionKt$anchorStateToGameDetailProps$1 INSTANCE = new TransformFunctionKt$anchorStateToGameDetailProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16263);
    }

    public TransformFunctionKt$anchorStateToGameDetailProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.o, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3089o invoke(C3098a c3098a, C3089o c3089o) {
        String str;
        String str2;
        String str3;
        C3243u c3243u;
        C3109e c3109e;
        C3243u c3243u2;
        String str4;
        C3243u c3243u3;
        C3098a c3098a2 = c3098a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a2, c3089o}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3098a2);
        C3036d c3036d = c3098a2.LIZLLL;
        String str5 = "";
        if (c3036d == null || (c3243u3 = c3036d.LIZIZ) == null || (str = c3243u3.LIZLLL) == null) {
            str = str5;
        }
        C3036d c3036d2 = c3098a2.LIZLLL;
        if (c3036d2 != null && (c3243u2 = c3036d2.LIZIZ) != null && (str4 = c3243u2.LJFF) != null) {
            str5 = str4;
        }
        C3036d c3036d3 = c3098a2.LIZLLL;
        List<String> list = null;
        if (c3036d3 != null) {
            str2 = c3036d3.LJIIIIZZ;
        } else {
            str2 = null;
        }
        C3036d c3036d4 = c3098a2.LIZLLL;
        if (c3036d4 == null || (c3109e = c3036d4.LJJIIJZLJL) == null || (str3 = c3109e.LIZ) == null) {
            str3 = "0";
        }
        C3036d c3036d5 = c3098a2.LIZLLL;
        if (c3036d5 != null && (c3243u = c3036d5.LIZIZ) != null) {
            list = c3243u.LJIIIIZZ;
        }
        return new C3089o(str, str5, str2, str3, list);
    }
}
