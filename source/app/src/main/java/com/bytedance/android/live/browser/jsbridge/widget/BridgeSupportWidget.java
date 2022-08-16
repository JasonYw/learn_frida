package com.bytedance.android.live.browser.jsbridge.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.annie.service.data.C2628b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.android.live.browser.jsbridge.C3990j;
import com.bytedance.android.live.browser.jsbridge.state.C4044h;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC101016PqM;
import p003X.AbstractC101020PqQ;
import p003X.AbstractC101032Pqc;
import p003X.AbstractC101040Pqk;
import p003X.AbstractC101043Pqn;
import p003X.AbstractC101047Pqr;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C100942PpA;
import p003X.C101017PqN;
import p003X.C101025PqV;
import p003X.C101029PqZ;
import p003X.C101031Pqb;
import p003X.C101034Pqe;
import p003X.C101035Pqf;
import p003X.C101049Pqt;
import p003X.C101050Pqu;
import p003X.C101051Pqv;
import p003X.C101056Pr0;
import p003X.C101057Pr1;
import p003X.C101058Pr2;
import p003X.C101059Pr3;
import p003X.C101068PrC;
import p003X.C101069PrD;
import p003X.C106862S5w;
import p003X.C80162Him;
import p003X.C80163Hin;
import p003X.ITW;
import p003X.ITX;
import p003X.PTL;

/* loaded from: classes8.dex */
public final class BridgeSupportWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C3990j LIZIZ;
    public C4044h LIZJ;
    public Gson LIZLLL;

    static {
        Covode.recordClassIndex(23041);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a136";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        List<AbstractC101047Pqr> filterIsInstance;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        C4044h c4044h = this.LIZJ;
        if (c4044h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC3973g.AbstractC3975c abstractC3975c = c4044h.LIZ().get(C101029PqZ.LIZ.LIZ());
        if (!(abstractC3975c instanceof C101031Pqb)) {
            abstractC3975c = null;
        }
        C101031Pqb c101031Pqb = (C101031Pqb) abstractC3975c;
        if (c101031Pqb != null) {
            c101031Pqb.LJFF = null;
        }
        AbstractC101043Pqn<?> LIZ2 = C2628b.LIZLLL.LIZ(C101029PqZ.LIZ.LIZ());
        if (!(LIZ2 instanceof C101035Pqf)) {
            LIZ2 = null;
        }
        C101035Pqf c101035Pqf = (C101035Pqf) LIZ2;
        if (c101035Pqf != null) {
            c101035Pqf.LIZJ = null;
        }
        C4044h c4044h2 = this.LIZJ;
        if (c4044h2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        for (AbstractC101032Pqc abstractC101032Pqc : CollectionsKt___CollectionsJvmKt.filterIsInstance(c4044h2.LIZ().values(), AbstractC101032Pqc.class)) {
            C4044h c4044h3 = this.LIZJ;
            if (c4044h3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4044h3.LIZIZ(abstractC101032Pqc);
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{AbstractC101047Pqr.class}, C2628b.LIZLLL, C2628b.LIZ, false, 5);
        if (proxy.isSupported) {
            filterIsInstance = (List) proxy.result;
        } else {
            C106862S5w.LIZ(AbstractC101047Pqr.class);
            filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(C2628b.LIZIZ.values(), AbstractC101047Pqr.class);
        }
        for (AbstractC101047Pqr abstractC101047Pqr : filterIsInstance) {
            C2628b.LIZLLL.LIZIZ(abstractC101047Pqr);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C100942PpA.LIZ().LIZIZ().LIZ(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataCenter dataCenter;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 8).isSupported || (dataCenter = this.dataCenter) == null) {
            return;
        }
        C3990j c3990j = this.LIZIZ;
        if (c3990j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j.LIZ(new C101049Pqt(this)).m151as(autoDispose())).LIZ();
        C3990j c3990j2 = this.LIZIZ;
        if (c3990j2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j2.LIZ(new C101050Pqu(this)).m151as(autoDispose())).LIZ();
        C3990j c3990j3 = this.LIZIZ;
        if (c3990j3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j3.LIZ(new C101056Pr0(this)).m151as(autoDispose())).LIZ();
        C3990j c3990j4 = this.LIZIZ;
        if (c3990j4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j4.LIZ(new C101057Pr1(this)).m151as(autoDispose())).LIZ();
        C3990j c3990j5 = this.LIZIZ;
        if (c3990j5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j5.LIZ(new C101058Pr2(this)).m151as(autoDispose())).LIZ();
        C3990j c3990j6 = this.LIZIZ;
        if (c3990j6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c3990j6.LIZ(new C101059Pr3(this)).m151as(autoDispose())).LIZ();
        C4044h c4044h = this.LIZJ;
        if (c4044h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ(c4044h, new C101025PqV(dataCenter));
        LIZ(c4044h, new ITX(dataCenter));
        LIZ(c4044h, new C80162Him(dataCenter));
        Gson gson = this.LIZLLL;
        if (gson == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ(c4044h, new C101068PrC(gson, dataCenter));
        AbstractC3973g.AbstractC3975c abstractC3975c = c4044h.LIZ().get(C101029PqZ.LIZ.LIZ());
        if (!(abstractC3975c instanceof C101031Pqb)) {
            abstractC3975c = null;
        }
        C101031Pqb c101031Pqb = (C101031Pqb) abstractC3975c;
        if (c101031Pqb != null) {
            c101031Pqb.LJFF = dataCenter;
        }
        Iterator<T> it = c4044h.LIZJ.iterator();
        while (it.hasNext()) {
            LIZ(c4044h, new C101017PqN((AbstractC101016PqM) ((Function1) it.next()).invoke(dataCenter)));
        }
        LIZ(C2628b.LIZLLL, new C101034Pqe(dataCenter));
        C2628b c2628b = C2628b.LIZLLL;
        Gson gson2 = this.LIZLLL;
        if (gson2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ(c2628b, new C101069PrD(gson2, dataCenter));
        C2628b c2628b2 = C2628b.LIZLLL;
        Gson gson3 = this.LIZLLL;
        if (gson3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c2628b2.LIZ(new ITW(gson3, dataCenter));
        C2628b.LIZLLL.LIZ(new C80163Hin(dataCenter));
        LIZ(C2628b.LIZLLL, new C101051Pqv(dataCenter));
        AbstractC101043Pqn<?> LIZ2 = C2628b.LIZLLL.LIZ(C101029PqZ.LIZ.LIZ());
        if (!(LIZ2 instanceof C101035Pqf)) {
            LIZ2 = null;
        }
        C101035Pqf c101035Pqf = (C101035Pqf) LIZ2;
        if (c101035Pqf != null) {
            c101035Pqf.LIZJ = dataCenter;
        }
    }

    private final void LIZ(C2628b c2628b, AbstractC101040Pqk<?> abstractC101040Pqk) {
        if (PatchProxy.proxy(new Object[]{c2628b, abstractC101040Pqk}, this, LIZ, false, 10).isSupported) {
            return;
        }
        ((AbstractC81278I1w) c2628b.LIZ((PTL) abstractC101040Pqk).m151as(autoDispose())).LIZ();
    }

    private final void LIZ(C4044h c4044h, AbstractC101020PqQ<?> abstractC101020PqQ) {
        if (PatchProxy.proxy(new Object[]{c4044h, abstractC101020PqQ}, this, LIZ, false, 11).isSupported) {
            return;
        }
        ((AbstractC81278I1w) c4044h.LIZ(abstractC101020PqQ).m151as(autoDispose())).LIZ();
    }
}
