package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.block.C3051b;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3120d;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88965L3n;
import p003X.C89037L6h;

/* loaded from: classes5.dex */
public final class GameDetailItemFunctionKt$stateToGameDetailPageProps$1 extends Lambda implements Function3<C3101e, C3100d, C3051b, C3051b> {
    public static final GameDetailItemFunctionKt$stateToGameDetailPageProps$1 INSTANCE = new GameDetailItemFunctionKt$stateToGameDetailPageProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16258);
    }

    public GameDetailItemFunctionKt$stateToGameDetailPageProps$1() {
        super(3);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.b] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ C3051b invoke(C3101e c3101e, C3100d c3100d, C3051b c3051b) {
        String str;
        C3120d LIZ;
        List<C3120d> list;
        C3243u c3243u;
        C3101e c3101e2 = c3101e;
        C3100d c3100d2 = c3100d;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3100d2, c3051b}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2, c3100d2);
        if (!c3101e2.LIZIZ && c3101e2.LIZJ == 200) {
            C3119b c3119b = c3101e2.LIZLLL;
            if (c3119b != null && (c3243u = c3119b.LIZIZ) != null) {
                str = c3243u.LJIJJ;
            } else {
                str = null;
            }
            boolean LIZ2 = C88965L3n.LIZ(str);
            C3119b c3119b2 = c3101e2.LIZLLL;
            if (c3119b2 != null && (LIZ = c3119b2.LIZ(LIZ2)) != null && (list = LIZ.f25887LJ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C3120d c3120d : list) {
                    AbstractC3125c LIZ3 = C89037L6h.LIZ(c3120d, c3101e2, c3100d2);
                    if (LIZ3 != null) {
                        arrayList.add(LIZ3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    return new C3051b(c3101e2.LIZIZ, c3101e2.LIZJ, 1, "", arrayList2);
                }
            }
            return null;
        }
        return new C3051b(c3101e2.LIZIZ, c3101e2.LIZJ, 1, "", new ArrayList());
    }
}
