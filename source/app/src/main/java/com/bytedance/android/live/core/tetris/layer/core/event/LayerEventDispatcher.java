package com.bytedance.android.live.core.tetris.layer.core.event;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2MA;
import p003X.C411622Qy;

/* loaded from: classes12.dex */
public final class LayerEventDispatcher implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final HashMap<Class<? extends C4108b>, HashSet<AbstractC4106a>> LIZIZ = new HashMap<>();

    static {
        Covode.recordClassIndex(23693);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported && event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{this}, null, C411622Qy.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(this);
            if (C411622Qy.LIZJ.containsKey(this)) {
                Integer num = C411622Qy.LIZJ.get(this);
                C411622Qy.LIZJ.remove(this);
                HashMap<Integer, LayerEventDispatcher> hashMap = C411622Qy.LIZIZ;
                Intrinsics.checkNotNull(num);
                hashMap.remove(num);
            }
        }
        this.LIZIZ.clear();
    }

    public final void LIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        AbstractC4106a LIZJ = element.LIZJ();
        if (LIZJ != null) {
            for (Object obj : LIZJ.LIZJ()) {
                HashSet<AbstractC4106a> hashSet = this.LIZIZ.get(obj);
                if (hashSet != null) {
                    hashSet.remove(LIZJ);
                }
            }
        }
    }

    public final void LIZ(AbstractC4106a abstractC4106a) {
        HashSet<AbstractC4106a> hashSet;
        if (PatchProxy.proxy(new Object[]{abstractC4106a}, this, LIZ, false, 1).isSupported) {
            return;
        }
        ArrayList<C2MA> arrayList = new ArrayList();
        if (abstractC4106a != null) {
            arrayList.add(new C2MA(abstractC4106a.LIZJ(), abstractC4106a));
        }
        for (C2MA c2ma : arrayList) {
            for (Object obj : c2ma.LIZIZ) {
                if (this.LIZIZ.containsKey(obj)) {
                    HashSet<AbstractC4106a> hashSet2 = this.LIZIZ.get(obj);
                    Intrinsics.checkNotNull(hashSet2);
                    hashSet = hashSet2;
                } else {
                    hashSet = new HashSet<>();
                    this.LIZIZ.put(obj, hashSet);
                }
                Intrinsics.checkNotNullExpressionValue(hashSet, "");
                hashSet.add(c2ma.LIZJ);
            }
        }
    }

    public final void LIZ(C4108b c4108b) {
        if (PatchProxy.proxy(new Object[]{c4108b}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4108b);
        HashSet<AbstractC4106a> hashSet = this.LIZIZ.get(c4108b.getClass());
        if (hashSet != null) {
            for (AbstractC4106a abstractC4106a : hashSet) {
                abstractC4106a.onEvent(c4108b);
            }
        }
    }
}
