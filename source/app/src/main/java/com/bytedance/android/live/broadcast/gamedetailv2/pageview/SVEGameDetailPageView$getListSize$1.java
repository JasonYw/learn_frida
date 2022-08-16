package com.bytedance.android.live.broadcast.gamedetailv2.pageview;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3120d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C88965L3n;
import p003X.C89045L6p;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class SVEGameDetailPageView$getListSize$1 extends Lambda implements Function0<Integer> {
    public static final SVEGameDetailPageView$getListSize$1 INSTANCE = new SVEGameDetailPageView$getListSize$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16667);
    }

    public SVEGameDetailPageView$getListSize$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        C2WC<C3119b> LIZIZ;
        C3119b LIZ;
        C3120d LIZ2;
        List<C3120d> list;
        List<C3120d> list2;
        C3120d c3120d;
        List<C3120d> list3;
        C2WC<C3119b> LIZIZ2;
        C3119b LIZ3;
        C3243u c3243u;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            i = ((Integer) proxy.result).intValue();
        } else {
            C13491f LIZ4 = IQV.LIZ(C89045L6p.class);
            String str = null;
            if (!(LIZ4 instanceof C89045L6p)) {
                LIZ4 = null;
            }
            C89045L6p c89045L6p = (C89045L6p) LIZ4;
            if (c89045L6p != null && (LIZIZ2 = c89045L6p.LIZIZ()) != null && (LIZ3 = LIZIZ2.LIZ()) != null && (c3243u = LIZ3.LIZIZ) != null) {
                str = c3243u.LJIJJ;
            }
            boolean LIZ5 = C88965L3n.LIZ(str);
            if (c89045L6p != null && (LIZIZ = c89045L6p.LIZIZ()) != null && (LIZ = LIZIZ.LIZ()) != null && (LIZ2 = LIZ.LIZ(LIZ5)) != null && (list = LIZ2.f25887LJ) != null) {
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
                        i = list3.size();
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }
}
