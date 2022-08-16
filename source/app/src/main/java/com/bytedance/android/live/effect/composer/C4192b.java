package com.bytedance.android.live.effect.composer;

import com.bytedance.android.live.effect.composer.C4195h;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C86728KFm;
import p003X.C86732KFq;
import p003X.RunnableC86736KFu;

/* renamed from: com.bytedance.android.live.effect.composer.b */
/* loaded from: classes5.dex */
public final class C4192b {
    public static ChangeQuickRedirect LIZ;
    public final C86728KFm LIZIZ;
    public final Map<String, List<Sticker>> LIZJ = new HashMap();

    static {
        Covode.recordClassIndex(24462);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        C86728KFm c86728KFm = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], c86728KFm, C86728KFm.LIZ, false, 2).isSupported) {
            C4195h LIZ2 = c86728KFm.LIZ();
            C86732KFq c86732KFq = new C86732KFq(c86728KFm);
            if (!PatchProxy.proxy(new Object[]{c86732KFq}, LIZ2, C4195h.LIZ, false, 15).isSupported) {
                C106862S5w.LIZ(c86732KFq);
                LIZ2.LIZJ.post(new RunnableC86736KFu(LIZ2, c86732KFq));
            }
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C86728KFm c86728KFm = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], c86728KFm, C86728KFm.LIZ, false, 16).isSupported) {
            c86728KFm.LIZIZ();
            C4195h LIZ2 = c86728KFm.LIZ();
            if (!PatchProxy.proxy(new Object[0], LIZ2, C4195h.LIZ, false, 12).isSupported) {
                C4195h.LIZ(LIZ2, true, null, 2, null);
                LIZ2.LIZJ.post(LIZ2.f26223LJ);
                LIZ2.LIZ(false, "onSQLiteHelperClose");
            }
        }
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C86728KFm c86728KFm = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c86728KFm, C86728KFm.LIZ, false, 14);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        Iterator<T> it = c86728KFm.LIZIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!((C4193d) next).LJIIJ) {
                if (next != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public C4192b(String str) {
        C106862S5w.LIZ(str);
        this.LIZIZ = new C86728KFm(str);
    }

    public final void LIZ(C4193d c4193d) {
        if (PatchProxy.proxy(new Object[]{c4193d}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4193d);
        this.LIZIZ.LIZ(c4193d);
    }

    private final Sticker LIZJ(C4193d c4193d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4193d}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (Sticker) proxy.result;
        }
        List<Sticker> list = this.LIZJ.get(c4193d.LIZIZ);
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Sticker) next).getEffectId(), c4193d.LIZJ)) {
                obj = next;
                break;
            }
        }
        return (Sticker) obj;
    }

    public final C4193d LIZ(Sticker sticker) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C4193d) proxy.result;
        }
        C106862S5w.LIZ(sticker);
        C86728KFm c86728KFm = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{sticker}, c86728KFm, C86728KFm.LIZ, false, 9);
        if (proxy2.isSupported) {
            obj = proxy2.result;
        } else {
            C106862S5w.LIZ(sticker);
            Iterator<T> it = c86728KFm.LIZIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C4193d c4193d = (C4193d) obj;
                    if (c4193d.LJIIJ && Intrinsics.areEqual(c4193d.LIZJ, sticker.getEffectId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        }
        return (C4193d) obj;
    }

    public final C4193d LIZIZ(Sticker sticker) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (C4193d) proxy.result;
        }
        C106862S5w.LIZ(sticker);
        C86728KFm c86728KFm = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{sticker}, c86728KFm, C86728KFm.LIZ, false, 4);
        if (proxy2.isSupported) {
            obj = proxy2.result;
        } else {
            C106862S5w.LIZ(sticker);
            Iterator<T> it = c86728KFm.LIZIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C4193d c4193d = (C4193d) obj;
                    if (c4193d.LJIIJ && Intrinsics.areEqual(c4193d.LIZJ, sticker.getEffectId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        }
        return (C4193d) obj;
    }

    public final List<Sticker> LIZ(String str) {
        Iterable<C4193d> iterable;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(str);
        C86728KFm c86728KFm = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c86728KFm, C86728KFm.LIZ, false, 6);
        if (proxy2.isSupported) {
            iterable = (List) proxy2.result;
        } else {
            C106862S5w.LIZ(str);
            List<C4193d> list = c86728KFm.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C4193d c4193d = (C4193d) obj;
                if (Intrinsics.areEqual(c4193d.LIZIZ, str) && c4193d.LJIIJ) {
                    arrayList.add(obj);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (C4193d c4193d2 : iterable) {
            arrayList2.add(LIZJ(c4193d2));
        }
        return arrayList2;
    }

    public final List<C4193d> LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(str);
        C86728KFm c86728KFm = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c86728KFm, C86728KFm.LIZ, false, 7);
        if (proxy2.isSupported) {
            return (List) proxy2.result;
        }
        C106862S5w.LIZ(str);
        List<C4193d> list = c86728KFm.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4193d c4193d = (C4193d) obj;
            if (Intrinsics.areEqual(c4193d.LIZIZ, str) && c4193d.LJIIJ && c4193d.LJIIIZ) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LIZIZ(C4193d c4193d) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{c4193d}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4193d);
        C86728KFm c86728KFm = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{c4193d}, c86728KFm, C86728KFm.LIZ, false, 11).isSupported) {
            C106862S5w.LIZ(c4193d);
            Iterator<T> it = c86728KFm.LIZIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((C4193d) obj).LIZJ, c4193d.LIZJ)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C4193d c4193d2 = (C4193d) obj;
            if (c4193d2 == null) {
                c4193d.LJIIJ = true;
                c86728KFm.LIZIZ.add(c4193d);
                if (c86728KFm.LIZJ.contains(c4193d.LIZIZ)) {
                    C4195h LIZ2 = c86728KFm.LIZ();
                    if (!PatchProxy.proxy(new Object[]{c4193d}, LIZ2, C4195h.LIZ, false, 6).isSupported) {
                        C106862S5w.LIZ(c4193d);
                        LIZ2.LIZ();
                        LIZ2.LIZIZ.add(new C4195h.C4196a(c4193d, 10001));
                        return;
                    }
                    return;
                }
                return;
            }
            c4193d2.LJIIJ = true;
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C86728KFm c86728KFm = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{str}, c86728KFm, C86728KFm.LIZ, false, 15).isSupported) {
            C106862S5w.LIZ(str);
            List<C4193d> list = c86728KFm.LIZIZ;
            ArrayList<C4193d> arrayList = new ArrayList();
            for (Object obj : list) {
                C4193d c4193d = (C4193d) obj;
                if (!c4193d.LJIIJ && Intrinsics.areEqual(c4193d.LIZIZ, str)) {
                    arrayList.add(obj);
                }
            }
            for (C4193d c4193d2 : arrayList) {
                c86728KFm.LIZ(c4193d2);
            }
        }
    }

    public final void LIZ(Sticker sticker, String str) {
        if (PatchProxy.proxy(new Object[]{sticker, str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(sticker, str);
        if (!this.LIZJ.containsKey(str)) {
            this.LIZJ.put(str, new ArrayList());
        }
        List<Sticker> list = this.LIZJ.get(str);
        if (list != null && !list.contains(sticker)) {
            list.add(sticker);
        }
    }

    public final void LIZ(Sticker sticker, String str, float f, Long l) {
        if (PatchProxy.proxy(new Object[]{sticker, str, Float.valueOf(f), l}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(sticker, str);
        this.LIZIZ.LIZ(sticker, str, f, l);
    }
}
