package com.bytedance.android.live.broadcastgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.KYQ;
import p003X.KYR;
import p003X.KYS;

/* renamed from: com.bytedance.android.live.broadcastgame.r */
/* loaded from: classes5.dex */
public final class C3867r implements KYS {
    public static ChangeQuickRedirect LIZ;
    public final Map<Class<? extends AbstractC3404c>, KYQ<? extends AbstractC3404c>> LIZIZ = new LinkedHashMap();
    public final Map<Class<? extends AbstractC3404c>, List<KYR<? extends AbstractC3404c>>> LIZJ = new LinkedHashMap();
    public final List<AbstractC3474i> LIZLLL = new ArrayList();

    /* renamed from: LJ */
    public final PublishSubject<AbstractC3404c> f26115LJ;

    static {
        Covode.recordClassIndex(21819);
    }

    public C3867r() {
        PublishSubject<AbstractC3404c> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.f26115LJ = create;
        Intrinsics.checkNotNullExpressionValue(PublishSubject.create(), "");
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        for (Map.Entry<Class<? extends AbstractC3404c>, List<KYR<? extends AbstractC3404c>>> entry : this.LIZJ.entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                ((KYR) it.next()).LIZ();
            }
        }
        this.LIZJ.clear();
    }

    @Override // p003X.KYS
    public final <T extends AbstractC3404c> void LIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(t);
        LIZJ(t);
    }

    public final synchronized C3867r LIZ(AbstractC3474i abstractC3474i) {
        MethodCollector.m14708i(1518);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3474i}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            C3867r c3867r = (C3867r) proxy.result;
            MethodCollector.m14707o(1518);
            return c3867r;
        }
        C106862S5w.LIZ(abstractC3474i);
        this.LIZLLL.add(abstractC3474i);
        MethodCollector.m14707o(1518);
        return this;
    }

    private final synchronized <T extends AbstractC3404c> void LIZJ(T t) {
        MethodCollector.m14708i(1519);
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(1519);
            return;
        }
        Iterator<T> it = this.LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AbstractC3474i) it.next()).LIZ(t)) {
                    break;
                }
            } else {
                this.f26115LJ.onNext(t);
                break;
            }
        }
        MethodCollector.m14707o(1519);
    }

    public final <T extends AbstractC3404c> Observable<C3868s> LIZIZ(T t) {
        Observable<C3868s> LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(t);
        KYQ<? extends AbstractC3404c> kyq = this.LIZIZ.get(t.getClass());
        if (kyq != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{t}, kyq, KYQ.LIZ, false, 1);
            if (proxy2.isSupported) {
                LIZ2 = (Observable) proxy2.result;
            } else {
                C106862S5w.LIZ(t);
                LIZ2 = kyq.LIZ(t);
            }
            if (LIZ2 != null) {
                return LIZ2;
            }
        }
        return Observable.error(new Throwable("can't send message type: " + t.getClass()));
    }

    public final <T extends AbstractC3404c> Observable<T> LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(cls);
        if (!this.LIZJ.containsKey(cls)) {
            return null;
        }
        return this.f26115LJ.ofType(cls).observeOn(AndroidSchedulers.mainThread());
    }

    public final synchronized <T extends AbstractC3404c> C3867r LIZ(Class<T> cls, KYQ<T> kyq) {
        MethodCollector.m14708i(1516);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, kyq}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            C3867r c3867r = (C3867r) proxy.result;
            MethodCollector.m14707o(1516);
            return c3867r;
        }
        C106862S5w.LIZ(cls, kyq);
        this.LIZIZ.put(cls, kyq);
        MethodCollector.m14707o(1516);
        return this;
    }

    public final synchronized <T extends AbstractC3404c> C3867r LIZ(Class<T> cls, KYR<T> kyr) {
        MethodCollector.m14708i(1517);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, kyr}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            C3867r c3867r = (C3867r) proxy.result;
            MethodCollector.m14707o(1517);
            return c3867r;
        }
        C106862S5w.LIZ(cls, kyr);
        if (this.LIZJ.get(cls) == null) {
            this.LIZJ.put(cls, new ArrayList());
        }
        List<KYR<? extends AbstractC3404c>> list = this.LIZJ.get(cls);
        if (list != null) {
            list.add(kyr);
        }
        kyr.LIZ(this);
        MethodCollector.m14707o(1517);
        return this;
    }
}
