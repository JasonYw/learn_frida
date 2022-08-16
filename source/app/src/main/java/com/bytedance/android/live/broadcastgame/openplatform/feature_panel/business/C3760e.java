package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.model.C3377g;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.C3776b;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bdp.live.livecontainer.miniapp.C11518g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p002O.C0002O;
import p003X.AbstractC88150KoK;
import p003X.AbstractC88158KoS;
import p003X.AbstractC88161KoV;
import p003X.C106862S5w;
import p003X.C150119g0N;
import p003X.C2VQ;
import p003X.C87549Ked;
import p003X.C87911KkT;
import p003X.C88160KoU;
import p003X.C88162KoW;
import p003X.C88164KoY;
import p003X.C88165KoZ;
import p003X.C88335KrJ;
import p003X.KVZ;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.e */
/* loaded from: classes5.dex */
public final class C3760e implements AbstractC88158KoS {
    public static ChangeQuickRedirect LIZ;
    public C3382n LIZIZ;
    public C3380j LIZLLL;
    public AbstractC3775a LJI;
    public AbstractC88161KoV LJII;
    public final /* synthetic */ C87549Ked LJIIIIZZ = new C87549Ked();

    /* renamed from: LJ */
    public AtomicBoolean f26102LJ = new AtomicBoolean(false);
    public AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final Map<String, C3380j> LJFF = new LinkedHashMap();

    static {
        Covode.recordClassIndex(21335);
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIIIZZ.LIZ(disposable);
    }

    @Override // p003X.AbstractC88158KoS
    public final void LJI() {
        this.LIZLLL = null;
    }

    @Override // p003X.AbstractC88207KpF
    public final AbstractC3775a LIZ() {
        return this.LJI;
    }

    public final AbstractC88161KoV LJIIIIZZ() {
        return this.LJII;
    }

    public final void LIZ(List<C3380j> list, Map<Long, C3377g> map, List<Long> list2, List<Long> list3, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{list, map, list2, list3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (list.isEmpty()) {
            LIZ().LJIIIZ();
            return;
        }
        List<C3380j> LIZ2 = LIZ().LJIJ().LIZ(list);
        if (z2) {
            LIZ().LIZ(LIZ2);
        } else {
            LIZ(LIZ2, map, list2, list3, z);
        }
    }

    private long LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return C88160KoU.LIZJ(this);
    }

    private String LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C88160KoU.LIZLLL(this);
    }

    private LiveMode LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (LiveMode) proxy.result;
        }
        return C88160KoU.m23456LJ(this);
    }

    @Override // p003X.AbstractC88207KpF
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C88160KoU.LIZ(this);
    }

    public final long LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return C88160KoU.LIZIZ(this);
    }

    @Override // p003X.AbstractC88207KpF
    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            this.LJIIIIZZ.LIZ();
        }
    }

    @Override // p003X.AbstractC88158KoS
    public final void LIZLLL() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        AbstractC88161KoV LJIIIIZZ = LJIIIIZZ();
        long LJIIIZ = LJIIIZ();
        long LJIIJ = LJIIJ();
        String LJIIJJI = LJIIJJI();
        C3382n c3382n = this.LIZIZ;
        if (c3382n == null || (str = c3382n.LJI) == null) {
            str = "0";
        }
        C88162KoW c88162KoW = new C88162KoW(LJIIIIZZ.LIZ(LJIIIZ, LJIIJ, LJIIJJI, str));
        c88162KoW.LIZ(new C3744x7e6e3ef7(this, booleanRef));
        c88162KoW.LIZ(new C3745x7e6e3ef8(this, booleanRef));
        c88162KoW.LIZIZ(new C3746x7e6e3ef9(this, booleanRef));
        LIZ(c88162KoW.LIZ());
    }

    @Override // p003X.AbstractC88158KoS
    /* renamed from: LJ */
    public final void mo15837LJ() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && LIZIZ()) {
            AbstractC88161KoV LJIIIIZZ = LJIIIIZZ();
            long LJIIIZ = LJIIIZ();
            long LJIIJ = LJIIJ();
            String LJIIJJI = LJIIJJI();
            C3382n c3382n = this.LIZIZ;
            if (c3382n == null || (str = c3382n.LJI) == null) {
                str = "0";
            }
            C88162KoW c88162KoW = new C88162KoW(LJIIIIZZ.LIZ(LJIIIZ, LJIIJ, LJIIJJI, str));
            c88162KoW.LIZ(new C3749x1446388(this));
            c88162KoW.LIZIZ(new C3750x1446389(this));
            LIZ(c88162KoW.LIZ());
        }
    }

    @Override // p003X.AbstractC88158KoS
    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C3382n c3382n = this.LIZIZ;
        if (c3382n != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c3382n, C3382n.LIZ, false, 1);
            if (!proxy2.isSupported ? !c3382n.LIZIZ.isEmpty() : ((Boolean) proxy2.result).booleanValue()) {
                LIZ(this, c3382n.LIZIZ, c3382n.LIZJ, c3382n.LIZLLL, c3382n.f26025LJ, true, false, 32, null);
                return true;
            }
        }
        return false;
    }

    public final String LJII() {
        AbstractC88150KoK abstractC88150KoK;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC3775a LIZ2 = LIZ();
        if (!(LIZ2 instanceof C3776b)) {
            LIZ2 = null;
        }
        C3776b c3776b = (C3776b) LIZ2;
        if (c3776b != null && (abstractC88150KoK = c3776b.LJIIZILJ) != null && abstractC88150KoK.LJIIIIZZ() != null && LJIIL() != null) {
            KVZ kvz = KVZ.LIZIZ;
            Context LJIIIIZZ = abstractC88150KoK.LJIIIIZZ();
            Intrinsics.checkNotNull(LJIIIIZZ);
            String LIZ3 = kvz.LIZ(LJIIIIZZ, "open_feature_data");
            String LIZ4 = C2VQ.LIZ(LJIIL());
            new StringBuilder();
            return C0002O.m25084C(LIZ3, File.separator, LIZ4, ".txt");
        }
        return "";
    }

    @Override // p003X.AbstractC88158KoS
    public final boolean LIZ(C3380j c3380j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(c3380j);
        if (!LIZIZ()) {
            return false;
        }
        this.LIZLLL = c3380j;
        return true;
    }

    private final List<List<C3355o>> LIZIZ(List<List<C3380j>> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            for (C3380j c3380j : (List) it.next()) {
                arrayList2.add(LIZ().LJIILJJIL().LIZ(c3380j, LIZIZ(), 1));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final void LIZ(List<C3380j> list) {
        AbstractC88150KoK abstractC88150KoK;
        DataCenter LJII;
        Object obj;
        C3383p LJFF;
        String str;
        Boolean bool;
        String str2;
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 17).isSupported && !this.f26102LJ.getAndSet(true)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C3383p LJFF2 = ((C3380j) obj).LJFF();
                    if (LJFF2 != null && (str2 = LJFF2.LJJLJLI) != null) {
                        if (PluginType.Companion.LIZ(str2) == PluginType.MINI_APP) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C3380j c3380j = (C3380j) obj;
            if (c3380j != null && (LJFF = c3380j.LJFF()) != null && (str = LJFF.LJJLJLI) != null) {
                C87911KkT.LIZ(C87911KkT.LIZIZ, C0002O.m25086C("预加载小程序, schema: ", str), null, 2, null);
                C150119g0N c150119g0N = C150119g0N.LIZLLL;
                List<String> listOf = CollectionsKt__CollectionsJVMKt.listOf(str);
                C11518g c11518g = new C11518g();
                c11518g.LIZ(C88335KrJ.LIZ());
                c150119g0N.LIZ(listOf, c11518g);
            }
        }
        AbstractC3775a LIZ2 = LIZ();
        if (!(LIZ2 instanceof C3776b)) {
            LIZ2 = null;
        }
        C3776b c3776b = (C3776b) LIZ2;
        if (c3776b != null && (abstractC88150KoK = c3776b.LJIIZILJ) != null && (LJII = abstractC88150KoK.LJII()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (C3380j c3380j2 : list) {
                arrayList.add(c3380j2.LJI());
            }
            LJII.put("data_broadcast_game_list", arrayList);
        }
    }

    public C3760e(AbstractC3775a abstractC3775a, AbstractC88161KoV abstractC88161KoV) {
        C106862S5w.LIZ(abstractC3775a, abstractC88161KoV);
        this.LJI = abstractC3775a;
        this.LJII = abstractC88161KoV;
    }

    private final List<C3380j> LIZ(List<C3380j> list, long j, long j2) {
        C3380j LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j), new Long(j2)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        LIZ().LJIILLIIL().LIZ(list);
        for (String str : LIZ().LJIILLIIL().LIZ()) {
            if (arrayList.size() < j && (LIZ2 = OpenFeatureListHandler$modifyRecentUsedList$1.INSTANCE.LIZ(str, j2, this.LJFF)) != null) {
                arrayList.add(LIZ2);
            }
        }
        return arrayList;
    }

    public final void LIZ(long j, Function1<? super C3382n, Unit> function1, Function0<Unit> function0) {
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[]{new Long(j), function1, function0}, this, LIZ, false, 7).isSupported && LIZIZ()) {
            Observable<C3382n> LIZ2 = LJIIIIZZ().LIZ(j, LJII());
            if (LIZ2 != null && (subscribe = LIZ2.subscribe(new C88164KoY(this, function1), new C88165KoZ(function0))) != null) {
                LIZ(subscribe);
            } else {
                function0.mo30099invoke();
            }
        }
    }

    private final void LIZ(List<C3380j> list, Map<Long, C3377g> map, List<Long> list2, List<Long> list3, boolean z) {
        long j;
        String str;
        String str2;
        C3377g c3377g;
        String str3;
        if (PatchProxy.proxy(new Object[]{list, map, list2, list3, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int indexOf = list2.indexOf(1L);
        int indexOf2 = list2.indexOf(2L);
        C3377g c3377g2 = map.get(2L);
        if (c3377g2 != null) {
            j = c3377g2.LIZIZ;
        } else {
            j = 5;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJFF.clear();
        for (Object obj : list) {
            C3380j c3380j = (C3380j) obj;
            this.LJFF.put(c3380j.LIZLLL(), c3380j);
            Long valueOf = Long.valueOf(c3380j.LJII);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        Iterator<T> it = list2.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            long longValue = ((Number) it.next()).longValue();
            List<C3380j> list4 = (List) linkedHashMap.get(Long.valueOf(longValue));
            if (list4 != null && (!list4.isEmpty())) {
                if (longValue != 1 && (c3377g = map.get(Long.valueOf(longValue))) != null && (str3 = c3377g.LIZ) != null) {
                    str = str3;
                }
                arrayList.add(str);
                arrayList3.add(list4);
            }
        }
        for (Number number : list3) {
            long longValue2 = number.longValue();
            List<C3380j> list5 = (List) linkedHashMap.get(Long.valueOf(longValue2));
            if (list5 != null && (!list5.isEmpty())) {
                C3377g c3377g3 = map.get(Long.valueOf(longValue2));
                if (c3377g3 == null || (str2 = c3377g3.LIZ) == null) {
                    str2 = str;
                }
                arrayList2.add(str2);
                arrayList4.add(list5);
            }
        }
        if (indexOf2 >= 0 && indexOf2 < arrayList3.size()) {
            if (!LIZ().LJIILLIIL().LIZ().isEmpty()) {
                arrayList3.set(indexOf2, LIZ(arrayList3.get(indexOf2), j, 2L));
            } else {
                for (C3380j c3380j2 : arrayList3.get(indexOf2)) {
                    LIZ().LJIILLIIL().LIZIZ(c3380j2.LIZLLL());
                }
            }
        } else if (indexOf2 == -1 && (!LIZ().LJIILLIIL().LIZ().isEmpty())) {
            List<C3380j> LIZ2 = LIZ(CollectionsKt__CollectionsKt.emptyList(), 5L, indexOf2);
            arrayList.add("最近使用");
            arrayList3.add(LIZ2);
        }
        if (arrayList.contains("最近使用")) {
            LIZ().LJIIIIZZ.postValue(Boolean.TRUE);
        }
        C3377g c3377g4 = map.get(5L);
        if (c3377g4 != null) {
            AbstractC3775a LIZ3 = LIZ();
            String str4 = c3377g4.LIZLLL;
            String str5 = c3377g4.LIZJ;
            if (!PatchProxy.proxy(new Object[]{str4, str5}, LIZ3, AbstractC3775a.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(str4, str5);
                LIZ3.LJII.postValue(new Pair<>(str4, str5));
            }
        }
        C3380j c3380j3 = this.LIZLLL;
        if (c3380j3 != null && indexOf >= 0) {
            arrayList3.get(indexOf).add(0, c3380j3);
        }
        List<List<C3355o>> LIZIZ = LIZIZ(arrayList3);
        List<List<C3355o>> LIZIZ2 = LIZIZ(arrayList4);
        LIZ().LIZ(LIZIZ, arrayList, LIZIZ2, arrayList2, z);
        AbstractC3775a LIZ4 = LIZ();
        LIZ4.LIZLLL.clear();
        LIZ4.LIZLLL.addAll(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__IterablesKt.flatten(LIZIZ), (Iterable) CollectionsKt__IterablesKt.flatten(LIZIZ2)));
        LIZ4.LIZ(list);
    }

    public static /* synthetic */ void LIZ(C3760e c3760e, List list, Map map, List list2, List list3, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3760e, list, map, list2, list3, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 32, null}, null, LIZ, true, 11).isSupported) {
            return;
        }
        c3760e.LIZ(list, map, list2, list3, z, false);
    }
}
