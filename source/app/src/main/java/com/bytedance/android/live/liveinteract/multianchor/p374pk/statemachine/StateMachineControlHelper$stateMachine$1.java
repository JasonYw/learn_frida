package com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine.MultiPKStateMachine;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC103391QnZ;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C536537Hj;
import p003X.C79503HVp;
import p003X.C79511HVx;
import p003X.C81294I2m;
import p003X.HW6;
import p003X.HWA;
import p003X.HWB;
import p003X.HWN;
import p003X.HWO;
import p003X.HWP;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.StateMachineControlHelper$stateMachine$1 */
/* loaded from: classes3.dex */
public final class StateMachineControlHelper$stateMachine$1 extends Lambda implements Function1<AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HW6 this$0;

    static {
        Covode.recordClassIndex(28265);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineControlHelper$stateMachine$1(HW6 hw6) {
        super(1);
        this.this$0 = hw6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b> abstractC103391QnZ) {
        AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b> abstractC103391QnZ2;
        MultiPKStateMachine.AbstractC4544b abstractC4544b;
        C79503HVp c79503HVp;
        AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b> abstractC103391QnZ3 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ3);
            if (!(abstractC103391QnZ3 instanceof C103385QnT)) {
                abstractC103391QnZ2 = null;
            } else {
                abstractC103391QnZ2 = abstractC103391QnZ3;
            }
            C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
            if (c103385QnT != null && (abstractC4544b = (MultiPKStateMachine.AbstractC4544b) c103385QnT.LIZJ) != null) {
                MultiPKStateMachine.AbstractC4545c abstractC4545c = (MultiPKStateMachine.AbstractC4545c) ((C103385QnT) abstractC103391QnZ3).LIZIZ;
                MultiPKStateMachine.AbstractC4545c LIZ = abstractC103391QnZ3.LIZ();
                C79511HVx c79511HVx = abstractC4545c.LIZ;
                this.this$0.LIZJ = c79511HVx;
                ALogger.m15800e("ttlive_multi_pk", "multi pk transition fromState=" + LIZ + " toState=" + abstractC4545c + " sideEffect=" + abstractC4544b + " event=" + c103385QnT.LIZIZ() + ", source=" + abstractC4545c.LIZIZ + '}');
                if (abstractC4544b instanceof HWN) {
                    Disposable disposable = this.this$0.f6834LJ;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Disposable disposable2 = this.this$0.LIZLLL;
                    if (disposable2 != null) {
                        disposable2.dispose();
                    }
                    this.this$0.LJIIJ.LIZ(c79511HVx, abstractC4545c.LIZIZ, ((HWN) abstractC4544b).LIZIZ);
                    HW6 hw6 = this.this$0;
                    if (!PatchProxy.proxy(new Object[]{c79511HVx}, hw6, HW6.LIZ, false, 19).isSupported && (c79503HVp = c79511HVx.LIZIZ) != null && c79503HVp.LIZJ > 0 && c79503HVp.LIZLLL > 0) {
                        long LIZ2 = (c79503HVp.LIZLLL - C81294I2m.LIZ()) + (c79503HVp.LIZJ * 1000);
                        final long j = LIZ2 / 1000;
                        int i = ((int) LIZ2) % 1000;
                        if (LIZ2 > 0) {
                            hw6.LJI.setValue(Long.valueOf(j));
                            Disposable disposable3 = hw6.f6834LJ;
                            if (disposable3 != null) {
                                disposable3.dispose();
                            }
                            hw6.f6834LJ = QB4.LIZ(C536537Hj.LIZ(0L, 1L, TimeUnit.SECONDS).take(1 + j).delay(i, TimeUnit.MILLISECONDS).map(new Function<Long, Long>() { // from class: X.11U
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(28279);
                                }

                                /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Long, java.lang.Object] */
                                @Override // io.reactivex.functions.Function
                                public final /* synthetic */ Long apply(Long l) {
                                    long longValue = l.longValue();
                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, LIZ, false, 1);
                                    if (proxy.isSupported) {
                                        return proxy.result;
                                    }
                                    return Long.valueOf(j - longValue);
                                }
                            }).observeOn(AndroidSchedulers.mainThread()).subscribe(new HWB(hw6)), hw6.LIZIZ);
                        }
                    }
                } else if (abstractC4544b instanceof HWP) {
                    Disposable disposable4 = this.this$0.f6834LJ;
                    if (disposable4 != null) {
                        disposable4.dispose();
                    }
                    Disposable disposable5 = this.this$0.LIZLLL;
                    if (disposable5 != null) {
                        disposable5.dispose();
                    }
                    this.this$0.LJIIJ.LIZ(c79511HVx, abstractC4545c.LIZIZ);
                    HW6 hw62 = this.this$0;
                    if (!PatchProxy.proxy(new Object[]{c79511HVx}, hw62, HW6.LIZ, false, 21).isSupported) {
                        long LIZ3 = c79511HVx.LIZ();
                        final int i2 = (int) (LIZ3 / 1000);
                        int i3 = (int) (LIZ3 % 1000);
                        Disposable disposable6 = hw62.f6834LJ;
                        if (disposable6 != null) {
                            disposable6.dispose();
                        }
                        hw62.LJI.setValue(Long.valueOf(i2));
                        hw62.f6834LJ = QB4.LIZ(C536537Hj.LIZ(0L, 1L, TimeUnit.SECONDS).take(i2 + 1).delay(i3, TimeUnit.MILLISECONDS).map(new Function<Long, Long>() { // from class: X.11T
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(28277);
                            }

                            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Long, java.lang.Object] */
                            @Override // io.reactivex.functions.Function
                            public final /* synthetic */ Long apply(Long l) {
                                long longValue = l.longValue();
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, LIZ, false, 1);
                                if (proxy.isSupported) {
                                    return proxy.result;
                                }
                                return Long.valueOf(i2 - longValue);
                            }
                        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new HWA(hw62)), hw62.LIZIZ);
                    }
                } else if (abstractC4544b instanceof HWO) {
                    Disposable disposable7 = this.this$0.f6834LJ;
                    if (disposable7 != null) {
                        disposable7.dispose();
                    }
                    Disposable disposable8 = this.this$0.LIZLLL;
                    if (disposable8 != null) {
                        disposable8.dispose();
                    }
                    this.this$0.LJIIJ.LIZ(((HWO) abstractC4544b).LIZIZ, c79511HVx);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
