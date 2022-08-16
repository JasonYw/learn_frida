package com.bytedance.android.live.broadcast.gamedetail.block.func;

import com.bytedance.android.live.broadcast.C3243u;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88965L3n;
import p003X.C89037L6h;
import p003X.L8B;

/* loaded from: classes5.dex */
public final class GameDetailItemFunctionKt$stateToGameDetailListProps$1 extends Lambda implements Function3<C3101e, C3100d, L8B<AbstractC3125c>, L8B<AbstractC3125c>> {
    public static final GameDetailItemFunctionKt$stateToGameDetailListProps$1 INSTANCE = new GameDetailItemFunctionKt$stateToGameDetailListProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16257);
    }

    public GameDetailItemFunctionKt$stateToGameDetailListProps$1() {
        super(3);
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.L8B<com.bytedance.android.live.broadcast.gamedetailv2.pageview.c>] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ L8B<AbstractC3125c> invoke(C3101e c3101e, C3100d c3100d, L8B<AbstractC3125c> l8b) {
        String str;
        C3120d LIZ;
        List<C3120d> list;
        List<C3120d> list2;
        C3120d c3120d;
        List<C3120d> list3;
        C3243u c3243u;
        C3101e c3101e2 = c3101e;
        C3100d c3100d2 = c3100d;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3100d2, l8b}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2, c3100d2);
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
            for (Object obj : list) {
                if (Intrinsics.areEqual(((C3120d) obj).LIZJ, "tab_navi")) {
                    arrayList.add(obj);
                }
            }
            C3120d c3120d2 = (C3120d) arrayList.get(0);
            if (c3120d2 != null && (list2 = c3120d2.f25887LJ) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.areEqual(((C3120d) obj2).LIZJ, "tab_game_detail")) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3 != null && (c3120d = (C3120d) arrayList3.get(0)) != null && (list3 = c3120d.f25887LJ) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (C3120d c3120d3 : list3) {
                        AbstractC3125c LIZ3 = C89037L6h.LIZ(c3120d3, c3101e2, c3100d2);
                        if (LIZ3 != null) {
                            arrayList4.add(LIZ3);
                        }
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        return new L8B<>(arrayList5);
                    }
                }
            }
        }
        return null;
    }
}
