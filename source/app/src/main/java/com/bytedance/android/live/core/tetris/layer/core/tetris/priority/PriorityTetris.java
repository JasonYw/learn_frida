package com.bytedance.android.live.core.tetris.layer.core.tetris.priority;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4099b;
import com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris;
import com.bytedance.android.live.core.tetris.layer.core.tetris.priority.PriorityTetris;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2R9;
import p003X.C2RC;
import p003X.C2RD;
import p003X.C2RF;
import p003X.C412502Ui;

/* loaded from: classes12.dex */
public abstract class PriorityTetris<T extends AbstractC4092b> extends Tetris<T> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIZ;
    public C2RF LIZ;
    public final C2RC LJIIL = new C2RD() { // from class: X.2RC
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(23722);
        }

        @Override // p003X.C2RD
        public final void LIZ(List<? extends View> list, List<? extends View> list2, List<? extends View> list3) {
            if (PatchProxy.proxy(new Object[]{list, list2, list3}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(list, list2, list3);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            for (Object obj : list2) {
                PriorityTetris.this.LJIIJ.get(obj);
            }
            for (Object obj2 : list3) {
                PriorityTetris.this.LJIIJ.get(obj2);
            }
        }
    };
    public Map<View, AbstractC4114b> LJIIJ = new LinkedHashMap();
    public Map<View, String> LJIIJJI = new LinkedHashMap();

    static {
        Covode.recordClassIndex(23721);
    }

    public abstract int LIZ();

    public abstract boolean LIZJ();

    public abstract int LJFF();

    @Override // com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(Set<C4113a> set) {
        if (PatchProxy.proxy(new Object[]{set}, this, LJIIIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(set);
        C2RF c2rf = this.LIZ;
        if (c2rf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf.setMutexList(set);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris
    public final View LIZ(C412502Ui c412502Ui) {
        Context context;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c412502Ui}, this, LJIIIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(c412502Ui);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c412502Ui, C412502Ui.LIZ, false, 3);
        if (proxy2.isSupported) {
            context = (Context) proxy2.result;
        } else {
            context = c412502Ui.LIZIZ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
        }
        this.LIZ = new C2RF(context, null, 0, 6);
        C2RF c2rf = this.LIZ;
        if (c2rf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf.setChangeListener(this.LJIIL);
        C2RF c2rf2 = this.LIZ;
        if (c2rf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf2.setOrientation(0);
        C2RF c2rf3 = this.LIZ;
        if (c2rf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf3.setSpaceMargin(LJFF());
        C2RF c2rf4 = this.LIZ;
        if (c2rf4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf4.setMaxVisibleCount(LIZ());
        C2RF c2rf5 = this.LIZ;
        if (c2rf5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2rf5.setAutoDismissChildViewWhenWidthLimit(LIZJ());
        C2RF c2rf6 = this.LIZ;
        if (c2rf6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c2rf6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Element<?> LIZ(AbstractC4099b abstractC4099b, C4115c c4115c) {
        C2R9 c2r9;
        AbstractC4104d abstractC4104d;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4099b, c4115c}, this, LJIIIZ, false, 2);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(abstractC4099b, c4115c);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, Tetris.LIZIZ, false, 2);
        if (proxy2.isSupported) {
            c2r9 = (C2R9) proxy2.result;
        } else {
            c2r9 = this.LIZLLL;
            if (c2r9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        Element<?> LIZ = c2r9.LIZ(abstractC4099b);
        this.LIZJ.add(LIZ);
        View LIZ2 = LIZ.LIZ(LIZIZ().LIZJ, null);
        if (LIZ2 != null) {
            LIZ.LIZJ = LIZ2;
            mo29786getLifecycle().addObserver(LIZ);
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, Tetris.LIZIZ, false, 6);
            if (proxy3.isSupported) {
                abstractC4104d = (AbstractC4104d) proxy3.result;
            } else {
                abstractC4104d = this.LJFF;
                if (abstractC4104d == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            abstractC4104d.LIZ(LIZ);
            C2RF c2rf = this.LIZ;
            if (c2rf == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c2rf.getPriorityMap().put(LIZ2, Integer.valueOf(c4115c.LIZIZ));
            C2RF c2rf2 = this.LIZ;
            if (c2rf2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c2rf2.getViewToIdentifyMap().put(LIZ2, c4115c.LIZJ);
            C2RF c2rf3 = this.LIZ;
            if (c2rf3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c2rf3.getIdentifyToViewMap().put(c4115c.LIZJ, LIZ2);
            C2RF c2rf4 = this.LIZ;
            if (c2rf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c2rf4.addView(LIZ2);
            Object LIZ3 = LIZ.LIZ(AbstractC4114b.class);
            if (LIZ3 != null) {
                this.LJIIJ.put(LIZ2, LIZ3);
            }
            this.LJIIJJI.put(LIZ2, c4115c.LIZJ);
            return LIZ;
        }
        throw new IllegalStateException("buildView 不能为空");
    }
}
