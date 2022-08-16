package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C103385QnT;
import p003X.C103397Qnf;
import p003X.C106862S5w;
import p003X.C449933qt;

/* renamed from: com.bytedance.android.live.profit.lottery.h */
/* loaded from: classes12.dex */
public final class C5330h implements AbstractC5309a {
    public static ChangeQuickRedirect LIZ;
    public final PublishSubject<C5324ae> LIZIZ;
    public final String LIZJ = C0002O.m25086C("Lottery@", C449933qt.LIZIZ(this));
    public final Observable<C5324ae> LIZLLL;

    /* renamed from: LJ */
    public final C103397Qnf<AbstractC5315aa, AbstractC5331i, Unit> f26568LJ;

    static {
        Covode.recordClassIndex(33479);
    }

    public final Observable<C5324ae> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.profit.lottery.AbstractC5309a
    public final AbstractC5315aa LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC5315aa) proxy.result;
        }
        return this.f26568LJ.LIZ();
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LIZJ + LoggerUtil.S_LEFT_TAG + LIZ() + LoggerUtil.S_RIGHT_TAG;
    }

    public C5330h(AbstractC5315aa abstractC5315aa) {
        C106862S5w.LIZ(abstractC5315aa);
        PublishSubject<C5324ae> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.LIZIZ = create;
        this.LIZLLL = this.LIZIZ;
        this.f26568LJ = C103397Qnf.LIZJ.LIZ(new Lottery$stateMachine$1(this, abstractC5315aa));
    }

    public final boolean LIZ(AbstractC5331i abstractC5331i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5331i}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC5331i);
        return C103397Qnf.LIZ(this.f26568LJ, abstractC5331i, null, 2, null) instanceof C103385QnT;
    }
}
