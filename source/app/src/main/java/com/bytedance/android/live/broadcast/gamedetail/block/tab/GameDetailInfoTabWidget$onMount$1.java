package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3120d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class GameDetailInfoTabWidget$onMount$1 extends Lambda implements Function2<C3101e, C3074b, C3074b> {
    public static final GameDetailInfoTabWidget$onMount$1 INSTANCE = new GameDetailInfoTabWidget$onMount$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16298);
    }

    public GameDetailInfoTabWidget$onMount$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.tab.b] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3074b invoke(C3101e c3101e, C3074b c3074b) {
        C3120d c3120d;
        List<C3120d> list;
        List<C3120d> list2;
        C3120d c3120d2;
        List<C3120d> list3;
        C3101e c3101e2 = c3101e;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3074b}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        C3119b c3119b = c3101e2.LIZLLL;
        if (c3119b != null && (c3120d = c3119b.LJIILL) != null && (list = c3120d.f25887LJ) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((C3120d) obj).LIZJ, "tab_navi")) {
                    arrayList.add(obj);
                }
            }
            C3120d c3120d3 = (C3120d) arrayList.get(0);
            if (c3120d3 != null && (list2 = c3120d3.f25887LJ) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.areEqual(((C3120d) obj2).LIZJ, "tab_game_detail")) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3 != null && (c3120d2 = (C3120d) arrayList3.get(0)) != null && (list3 = c3120d2.f25887LJ) != null) {
                    i = list3.size();
                }
            }
        }
        return new C3074b(Integer.valueOf(i));
    }
}
