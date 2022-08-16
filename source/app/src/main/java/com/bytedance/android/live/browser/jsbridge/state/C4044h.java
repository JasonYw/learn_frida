package com.bytedance.android.live.browser.jsbridge.state;

import com.bytedance.android.annie.service.data.C2628b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC101016PqM;
import p003X.AbstractC101020PqQ;
import p003X.AbstractC101023PqT;
import p003X.AbstractC101027PqX;
import p003X.AbstractC101032Pqc;
import p003X.AbstractC101040Pqk;
import p003X.AbstractC101043Pqn;
import p003X.AbstractC101047Pqr;
import p003X.AbstractC81920IQo;
import p003X.C101031Pqb;
import p003X.C101033Pqd;
import p003X.C101045Pqp;
import p003X.C101046Pqq;
import p003X.C101053Pqx;
import p003X.C101055Pqz;
import p003X.C103184QkE;
import p003X.C106862S5w;
import p003X.C80166Hiq;
import p003X.C80168His;
import p003X.C81919IQn;
import p003X.ITR;
import p003X.ITU;

/* renamed from: com.bytedance.android.live.browser.jsbridge.state.h */
/* loaded from: classes8.dex */
public final class C4044h implements AbstractC3973g {
    public static ChangeQuickRedirect LIZ;
    public final Map<String, AbstractC101020PqQ<?>> LIZIZ = new ConcurrentHashMap();
    public final Set<Function1<DataCenter, AbstractC101016PqM<?>>> LIZJ = new C103184QkE();

    static {
        Covode.recordClassIndex(23028);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3973g
    public final Map<String, AbstractC3973g.AbstractC3975c> LIZ() {
        return this.LIZIZ;
    }

    public C4044h() {
        LIZ(new C101031Pqb(null, 1)).subscribe();
        LIZ((AbstractC81920IQo) new C80166Hiq());
        LIZ((AbstractC81920IQo) new C80168His());
        LIZ((AbstractC81920IQo) new ITR());
        LIZ((AbstractC81920IQo) new ITU());
        LIZ((AbstractC81920IQo) new C81919IQn());
        LIZ((AbstractC81920IQo) new C101045Pqp());
    }

    private <T> void LIZ(AbstractC81920IQo<T> abstractC81920IQo) {
        if (PatchProxy.proxy(new Object[]{abstractC81920IQo}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC81920IQo);
        this.LIZIZ.put(abstractC81920IQo.LIZJ(), abstractC81920IQo);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3973g
    public final <T> void LIZ(Function1<? super DataCenter, ? extends AbstractC101016PqM<? extends T>> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        this.LIZJ.add(function1);
    }

    public final synchronized <T> Observable<Unit> LIZ(AbstractC101020PqQ<T> abstractC101020PqQ) {
        MethodCollector.m14708i(1543);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC101020PqQ}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            Observable<Unit> observable = (Observable) proxy.result;
            MethodCollector.m14707o(1543);
            return observable;
        }
        C106862S5w.LIZ(abstractC101020PqQ);
        Observable observable2 = (Observable<T>) Observable.empty().doOnSubscribe(new C101046Pqq(this, abstractC101020PqQ)).doOnDispose(new C101053Pqx(this, abstractC101020PqQ));
        Intrinsics.checkNotNullExpressionValue(observable2, "");
        MethodCollector.m14707o(1543);
        return observable2;
    }

    public final synchronized <T> void LIZIZ(AbstractC101020PqQ<T> abstractC101020PqQ) {
        MethodCollector.m14708i(1544);
        if (PatchProxy.proxy(new Object[]{abstractC101020PqQ}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1544);
            return;
        }
        C106862S5w.LIZ(abstractC101020PqQ);
        if (Intrinsics.areEqual(this.LIZIZ.get(abstractC101020PqQ.LIZJ()), abstractC101020PqQ)) {
            this.LIZIZ.remove(abstractC101020PqQ.LIZJ());
        }
        MethodCollector.m14707o(1544);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3973g
    public final <T> void LIZ(AbstractC101027PqX<T> abstractC101027PqX, T t) {
        AbstractC101043Pqn<?> abstractC101043Pqn;
        AbstractC101020PqQ<?> abstractC101020PqQ;
        if (PatchProxy.proxy(new Object[]{abstractC101027PqX, t}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC101027PqX);
        AbstractC101020PqQ<?> abstractC101020PqQ2 = this.LIZIZ.get(abstractC101027PqX.LIZ());
        if (abstractC101020PqQ2 != null) {
            if (!(abstractC101020PqQ2 instanceof AbstractC101032Pqc)) {
                abstractC101020PqQ = null;
            } else {
                abstractC101020PqQ = abstractC101020PqQ2;
            }
            AbstractC101032Pqc abstractC101032Pqc = (AbstractC101032Pqc) abstractC101020PqQ;
            if (abstractC101032Pqc != null) {
                abstractC101032Pqc.f10809LJ = t;
            }
            if (!(abstractC101020PqQ2 instanceof AbstractC101023PqT)) {
                abstractC101020PqQ2 = null;
            }
            AbstractC101023PqT abstractC101023PqT = (AbstractC101023PqT) abstractC101020PqQ2;
            if (abstractC101023PqT != null) {
                abstractC101023PqT.LIZ((AbstractC101023PqT) t);
            }
        } else {
            this.LIZIZ.put(abstractC101027PqX.LIZ(), new C101033Pqd(abstractC101027PqX, t, t));
        }
        AbstractC101043Pqn<?> LIZ2 = C2628b.LIZLLL.LIZ(abstractC101027PqX.LIZ());
        if (LIZ2 != null) {
            if (!(LIZ2 instanceof AbstractC101047Pqr)) {
                abstractC101043Pqn = null;
            } else {
                abstractC101043Pqn = LIZ2;
            }
            AbstractC101047Pqr abstractC101047Pqr = (AbstractC101047Pqr) abstractC101043Pqn;
            if (abstractC101047Pqr != null) {
                abstractC101047Pqr.LIZIZ = t;
            }
            if (!(LIZ2 instanceof AbstractC101040Pqk)) {
                LIZ2 = null;
            }
            AbstractC101040Pqk abstractC101040Pqk = (AbstractC101040Pqk) LIZ2;
            if (abstractC101040Pqk != null) {
                abstractC101040Pqk.LIZIZ((AbstractC101040Pqk) t);
                if (Unit.INSTANCE != null) {
                    return;
                }
            }
        }
        C2628b.LIZLLL.LIZ((AbstractC101043Pqn) new C101055Pqz(abstractC101027PqX, t, t));
    }
}
