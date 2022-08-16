package com.bytedance.android.live.broadcastgame.opengame.service;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3718b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C387291Vj;
import p003X.C77347GeT;
import p003X.C87549Ked;

/* loaded from: classes5.dex */
public final class SimplePanelStateDispatchService implements AbstractC3717a, AbstractC3718b {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public C3682x f26089LJ;
    public final /* synthetic */ C87549Ked LJFF = new C87549Ked();
    public final List<AbstractC3712a> LIZIZ = new ArrayList();
    public final Lazy LIZJ = C77347GeT.LIZ(new SimplePanelStateDispatchService$panelState$2(this));
    public SimplePanelStateDispatchService$lifecycleObserver$1 LIZLLL = new AbstractC4569445g() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$lifecycleObserver$1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(21067);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event != Lifecycle.Event.ON_RESUME) {
            } else {
                onResume();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                return;
            }
            SimplePanelStateDispatchService.C3713b LIZ2 = SimplePanelStateDispatchService.this.LIZ();
            if (!PatchProxy.proxy(new Object[0], LIZ2, SimplePanelStateDispatchService.C3713b.LIZ, false, 5).isSupported) {
                SimplePanelStateDispatchService.C3714c LIZ3 = SimplePanelStateDispatchService.C3714c.LIZ(LIZ2.LIZIZ, false, true, 1, null);
                SimplePanelStateDispatchService simplePanelStateDispatchService = LIZ2.LIZJ;
                if (!PatchProxy.proxy(new Object[0], simplePanelStateDispatchService, SimplePanelStateDispatchService.LIZ, false, 12).isSupported) {
                    for (SimplePanelStateDispatchService.AbstractC3712a abstractC3712a : simplePanelStateDispatchService.LIZIZ) {
                        abstractC3712a.onEnterForeground();
                    }
                }
                LIZ2.LIZ(LIZ3);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                return;
            }
            SimplePanelStateDispatchService.C3713b LIZ2 = SimplePanelStateDispatchService.this.LIZ();
            if (!PatchProxy.proxy(new Object[0], LIZ2, SimplePanelStateDispatchService.C3713b.LIZ, false, 4).isSupported) {
                SimplePanelStateDispatchService.C3714c LIZ3 = SimplePanelStateDispatchService.C3714c.LIZ(LIZ2.LIZIZ, false, false, 1, null);
                SimplePanelStateDispatchService simplePanelStateDispatchService = LIZ2.LIZJ;
                if (!PatchProxy.proxy(new Object[0], simplePanelStateDispatchService, SimplePanelStateDispatchService.LIZ, false, 13).isSupported) {
                    for (SimplePanelStateDispatchService.AbstractC3712a abstractC3712a : simplePanelStateDispatchService.LIZIZ) {
                        abstractC3712a.onEnterBackground();
                    }
                }
                LIZ2.LIZ(LIZ3);
            }
        }
    };

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3712a {
        static {
            Covode.recordClassIndex(21064);
        }

        void onEnterBackground();

        void onEnterForeground();

        void onPanelRealHide();

        void onPanelRealShow();
    }

    static {
        Covode.recordClassIndex(21063);
    }

    public final C3713b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3713b) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
    }

    private C3682x LJIILIIL() {
        return this.f26089LJ;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$b */
    /* loaded from: classes5.dex */
    public final class C3713b {
        public static ChangeQuickRedirect LIZ;
        public C3714c LIZIZ;
        public final /* synthetic */ SimplePanelStateDispatchService LIZJ;
        public final Sequence<Pair<C3714c, C3714c>> LIZLLL = SequencesKt__SequencesKt.sequenceOf(new Pair(new C3714c(false, true), new C3714c(true, true)), new Pair(new C3714c(true, false), new C3714c(true, true)));

        /* renamed from: LJ */
        public final Sequence<Pair<C3714c, C3714c>> f26090LJ = SequencesKt__SequencesKt.sequenceOf(new Pair(new C3714c(true, true), new C3714c(false, true)), new Pair(new C3714c(true, true), new C3714c(true, false)));

        static {
            Covode.recordClassIndex(21065);
        }

        public final void LIZ() {
            C3714c c3714c = this.LIZIZ;
            c3714c.LIZIZ = false;
            c3714c.LIZJ = true;
        }

        public final void LIZ(C3714c c3714c) {
            Pair<C3714c, C3714c> pair;
            Pair<C3714c, C3714c> pair2;
            if (PatchProxy.proxy(new Object[]{c3714c}, this, LIZ, false, 1).isSupported) {
                return;
            }
            Iterator<Pair<C3714c, C3714c>> it = this.LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    pair = it.next();
                    Pair<C3714c, C3714c> pair3 = pair;
                    if (Intrinsics.areEqual(pair3.getFirst(), this.LIZIZ) && Intrinsics.areEqual(pair3.getSecond(), c3714c)) {
                        break;
                    }
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                this.LIZJ.LIZJ();
            }
            Iterator<Pair<C3714c, C3714c>> it2 = this.f26090LJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    pair2 = it2.next();
                    Pair<C3714c, C3714c> pair4 = pair2;
                    if (Intrinsics.areEqual(pair4.getFirst(), this.LIZIZ) && Intrinsics.areEqual(pair4.getSecond(), c3714c)) {
                        break;
                    }
                } else {
                    pair2 = null;
                    break;
                }
            }
            if (pair2 != null) {
                this.LIZJ.LJIIIIZZ();
            }
            this.LIZIZ = c3714c;
        }

        public C3713b(SimplePanelStateDispatchService simplePanelStateDispatchService, C3714c c3714c) {
            C106862S5w.LIZ(c3714c);
            this.LIZJ = simplePanelStateDispatchService;
            this.LIZIZ = c3714c;
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        C387291Vj.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C387291Vj.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C387291Vj.LIZJ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        C387291Vj.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        C387291Vj.m25034LJ(this);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        for (AbstractC3712a abstractC3712a : this.LIZIZ) {
            abstractC3712a.onPanelRealShow();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        Context context = LJIILIIL().LIZLLL;
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2).isSupported && (context instanceof AppCompatActivity) && context != null) {
            ((ComponentActivity) context).mo29786getLifecycle().addObserver(this.LIZLLL);
        }
        LIZ().LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        C3713b LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, C3713b.LIZ, false, 2).isSupported) {
            LIZ2.LIZ(C3714c.LIZ(LIZ2.LIZIZ, false, false, 2, null));
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        for (AbstractC3712a abstractC3712a : this.LIZIZ) {
            abstractC3712a.onPanelRealHide();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LJIIIIZZ();
        Context context = LJIILIIL().LIZLLL;
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported && (context instanceof AppCompatActivity) && context != null) {
            ((ComponentActivity) context).mo29786getLifecycle().removeObserver(this.LIZLLL);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            this.LJFF.LIZ();
        }
        this.LIZIZ.clear();
        LIZ().LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$lifecycleObserver$1] */
    public SimplePanelStateDispatchService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.f26089LJ = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C3713b LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[0], LIZ2, C3713b.LIZ, false, 3).isSupported) {
            LIZ2.LIZ(C3714c.LIZ(LIZ2.LIZIZ, true, false, 2, null));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$c */
    /* loaded from: classes5.dex */
    public static final class C3714c {
        public static ChangeQuickRedirect LIZ;
        public boolean LIZIZ;
        public boolean LIZJ;

        static {
            Covode.recordClassIndex(21066);
        }

        public C3714c() {
            this(false, false, 3);
        }

        public static /* synthetic */ C3714c LIZ(C3714c c3714c, boolean z, boolean z2, int i, Object obj) {
            byte b = z ? (byte) 1 : (byte) 0;
            byte b2 = z ? (byte) 1 : (byte) 0;
            byte b3 = z2 ? (byte) 1 : (byte) 0;
            byte b4 = z2 ? (byte) 1 : (byte) 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3714c, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), null}, null, LIZ, true, 2);
            if (proxy.isSupported) {
                return (C3714c) proxy.result;
            }
            if ((i & 1) != 0) {
                z = c3714c.LIZIZ;
            }
            if ((i & 2) != 0) {
                z2 = c3714c.LIZJ;
            }
            return c3714c.LIZ(z, z2);
        }

        private C3714c LIZ(boolean z, boolean z2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1);
            return proxy.isSupported ? (C3714c) proxy.result : new C3714c(z, z2);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3714c) {
                return C106862S5w.LIZ(((C3714c) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SimplePanelStateDispatchService$PanelStateType:%s,%s", LIZ());
        }

        public C3714c(boolean z, boolean z2) {
            this.LIZIZ = z;
            this.LIZJ = z2;
        }

        public /* synthetic */ C3714c(boolean z, boolean z2, int i) {
            this(false, true);
        }
    }
}
