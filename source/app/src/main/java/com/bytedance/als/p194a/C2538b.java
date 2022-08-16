package com.bytedance.als.p194a;

import androidx.lifecycle.Lifecycle;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.AttachOption;
import com.bytedance.als.C2544e;
import com.bytedance.als.p196ui.Visibility;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.objectcontainer.C13805g;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC104332R6o;
import p003X.C106862S5w;
import p003X.NY6;
import p003X.RO5;
import p003X.RO6;
import p003X.RO7;

/* renamed from: com.bytedance.als.a.b */
/* loaded from: classes9.dex */
public final class C2538b {
    public static ChangeQuickRedirect LIZ;
    public final AlsLogicContainer LIZIZ;

    static {
        Covode.recordClassIndex(10035);
    }

    public final void LIZ() {
        NY6<?> ny6;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        AlsLogicContainer alsLogicContainer = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], alsLogicContainer, AlsLogicContainer.LIZ, false, 7).isSupported) {
            if (alsLogicContainer.LIZIZ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                alsLogicContainer.f25598LJ = true;
            }
            alsLogicContainer.LJII = alsLogicContainer.LJI.LIZ();
            List<C2544e> list = alsLogicContainer.LIZJ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C2544e) obj).LIZJ == AttachOption.IMMEDIATE) {
                    arrayList.add(obj);
                }
            }
            ArrayList<C2544e> arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                for (C2544e c2544e : arrayList2) {
                    C13805g c13805g = alsLogicContainer.LJII;
                    if (c13805g != null && (ny6 = (NY6) c13805g.LIZ(c2544e.LIZIZ)) != null) {
                        if (ny6 instanceof RO7) {
                            RO7 ro7 = (RO7) ny6;
                            Class<?> cls = c2544e.LIZLLL;
                            if (cls != null) {
                                ro7.LIZ(cls);
                                Visibility visibility = c2544e.LJFF;
                                if (visibility == null) {
                                    Intrinsics.throwNpe();
                                }
                                ro7.LIZ(visibility);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                            }
                        } else if (ny6 instanceof RO6) {
                            RO6 ro6 = (RO6) ny6;
                            Class<?> cls2 = c2544e.LIZLLL;
                            if (cls2 != null) {
                                ro6.LIZ(cls2);
                                Visibility visibility2 = c2544e.LJFF;
                                if (visibility2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                ro6.LIZ(visibility2);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                            }
                        } else if (ny6 instanceof AbstractC104332R6o) {
                            AbstractC104332R6o abstractC104332R6o = (AbstractC104332R6o) ny6;
                            Visibility visibility3 = c2544e.LJFF;
                            if (visibility3 == null) {
                                Intrinsics.throwNpe();
                            }
                            abstractC104332R6o.LIZ(visibility3);
                        }
                        alsLogicContainer.LIZ(ny6);
                    }
                }
            }
            List<C2544e> list2 = alsLogicContainer.LIZJ;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                C2544e c2544e2 = (C2544e) obj2;
                if (c2544e2.LIZJ == AttachOption.LAZY || c2544e2.LIZJ == AttachOption.FORCE_LAZY) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList<C2544e> arrayList4 = arrayList3;
            if (!arrayList4.isEmpty()) {
                for (C2544e c2544e3 : arrayList4) {
                    Class<NY6<?>> cls3 = c2544e3.LIZIZ;
                    RO5 ro5 = new RO5(cls3, c2544e3, alsLogicContainer);
                    C13805g c13805g2 = alsLogicContainer.LJII;
                    if (c13805g2 != null) {
                        c13805g2.LIZ(cls3, null, ro5);
                    }
                }
            }
        }
    }

    public C2538b(AlsLogicContainer alsLogicContainer) {
        C106862S5w.LIZ(alsLogicContainer);
        this.LIZIZ = alsLogicContainer;
    }
}
