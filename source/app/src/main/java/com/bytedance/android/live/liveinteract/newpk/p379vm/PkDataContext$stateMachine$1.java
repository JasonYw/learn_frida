package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.gift.IGiftCoreService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC103391QnZ;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C79503HVp;
import p003X.C82053IVr;
import p003X.C82054IVs;
import p003X.C82055IVt;
import p003X.QKF;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext$stateMachine$1 */
/* loaded from: classes3.dex */
public final class PkDataContext$stateMachine$1 extends Lambda implements Function1<AbstractC103391QnZ<? extends AbstractC4256d, ? extends AbstractC4690e, ? extends AbstractC4720s>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PkDataContext this$0;

    static {
        Covode.recordClassIndex(28523);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkDataContext$stateMachine$1(PkDataContext pkDataContext) {
        super(1);
        this.this$0 = pkDataContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends AbstractC4256d, ? extends AbstractC4690e, ? extends AbstractC4720s> abstractC103391QnZ) {
        AbstractC103391QnZ<? extends AbstractC4256d, ? extends AbstractC4690e, ? extends AbstractC4720s> abstractC103391QnZ2;
        long j;
        long LIZJ;
        AbstractC103391QnZ<? extends AbstractC4256d, ? extends AbstractC4690e, ? extends AbstractC4720s> abstractC103391QnZ3 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ3);
            if (!(abstractC103391QnZ3 instanceof C103385QnT)) {
                abstractC103391QnZ2 = null;
            } else {
                abstractC103391QnZ2 = abstractC103391QnZ3;
            }
            C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
            if (c103385QnT != null) {
                SIDE_EFFECT side_effect = c103385QnT.LIZJ;
                if (Intrinsics.areEqual(side_effect, C82055IVt.LIZ)) {
                    C79503HVp c79503HVp = this.this$0.LJJIIZI;
                    if (c79503HVp != null) {
                        int i = c79503HVp.LIZJ;
                        long j2 = c79503HVp.LIZLLL;
                        if (i > 0 && j2 > 0) {
                            long LIZ = (j2 - QKF.LIZ()) + (i * 1000);
                            ALogger.m15801d("PkDataContext", "pk start count down " + LIZ);
                            this.this$0.LJJLI.LIZ(LIZ);
                            this.this$0.LJJJJ = (long) (((int) (LIZ / 1000)) + 1);
                        }
                    }
                    this.this$0.LJJIZ = System.currentTimeMillis();
                } else if (Intrinsics.areEqual(side_effect, C82054IVs.LIZ)) {
                    C79503HVp c79503HVp2 = this.this$0.LJJIIZI;
                    if (c79503HVp2 != null) {
                        if (c79503HVp2.LJIILL != 0) {
                            j = c79503HVp2.LJIILL - QKF.LIZ();
                        } else if (c79503HVp2.LIZLLL != 0) {
                            j = (c79503HVp2.LIZLLL - QKF.LIZ()) + (c79503HVp2.LIZJ * 1000);
                        } else {
                            j = 0;
                        }
                        if (c79503HVp2.LJIILJJIL != 0) {
                            LIZJ = c79503HVp2.LJIILJJIL;
                        } else {
                            LIZJ = c79503HVp2.LIZJ();
                        }
                        StringBuilder sb = new StringBuilder("penal start count down ");
                        long j3 = (LIZJ * 1000) + j;
                        sb.append(String.valueOf(j3));
                        ALogger.m15801d("PkDataContext", sb.toString());
                        this.this$0.LJJLI.LIZ(j3);
                        this.this$0.LJJJJ = ((int) (j3 / 1000)) + 1;
                    }
                    this.this$0.LJJJ = System.currentTimeMillis();
                    SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Integer value = settingKey.getValue();
                    if (value != null && value.intValue() == 2 && !this.this$0.LJJLIIIJLLLLLLLZ) {
                        IService service = ServiceManager.getService(IGiftCoreService.class);
                        Intrinsics.checkNotNullExpressionValue(service, "");
                        ((IGiftCoreService) service).setNeedShowGiftEffectSwitch(true);
                    }
                } else if (Intrinsics.areEqual(side_effect, C82053IVr.LIZ)) {
                    SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    Integer value2 = settingKey2.getValue();
                    if (value2 != null && value2.intValue() == 2 && !this.this$0.LJJLIIIJLLLLLLLZ) {
                        IService service2 = ServiceManager.getService(IGiftCoreService.class);
                        Intrinsics.checkNotNullExpressionValue(service2, "");
                        ((IGiftCoreService) service2).setNeedShowGiftEffectSwitch(true);
                    }
                }
                StringBuilder sb2 = new StringBuilder("pk state from ");
                sb2.append(abstractC103391QnZ3.LIZ().LIZ);
                sb2.append(" to ");
                C103385QnT c103385QnT2 = (C103385QnT) abstractC103391QnZ3;
                sb2.append(((AbstractC4256d) c103385QnT2.LIZIZ).LIZ);
                ALogger.m15801d("PkDataContext", sb2.toString());
                this.this$0.LJIIIIZZ.setValue(c103385QnT2.LIZIZ);
                PkDataContext pkDataContext = this.this$0;
                pkDataContext.LIZ("pk_state", "pk state from " + abstractC103391QnZ3.LIZ().LIZ + " to " + ((AbstractC4256d) c103385QnT2.LIZIZ).LIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
