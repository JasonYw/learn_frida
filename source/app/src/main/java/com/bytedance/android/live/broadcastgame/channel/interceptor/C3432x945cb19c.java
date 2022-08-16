package com.bytedance.android.live.broadcastgame.channel.interceptor;

import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87177KWt;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.interceptor.SeiMonitorInterceptor$tryInitTicker$1$$special$$inlined$apply$lambda$1 */
/* loaded from: classes5.dex */
public final class C3432x945cb19c extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SeiMonitorInterceptor$tryInitTicker$1 this$0;

    static {
        Covode.recordClassIndex(19502);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3432x945cb19c(SeiMonitorInterceptor$tryInitTicker$1 seiMonitorInterceptor$tryInitTicker$1) {
        super(1);
        this.this$0 = seiMonitorInterceptor$tryInitTicker$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            C87177KWt c87177KWt = this.this$0.this$0;
            if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, c87177KWt, C87177KWt.LIZ, false, 3).isSupported && !c87177KWt.LJFF.mo30099invoke().booleanValue() && longValue != 0) {
                ALogger.m15797i("AAM.SeiMonitorInterceptor", "count sei " + c87177KWt.LIZJ.get() + LoggerUtil.BLANK_TAG + longValue);
                if (System.currentTimeMillis() - c87177KWt.f8519LJ >= 10000) {
                    C3383p mo30099invoke = c87177KWt.LJI.mo30099invoke();
                    if (mo30099invoke != null) {
                        ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceHeartSei(mo30099invoke, false, "");
                    }
                    ((ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class)).dispatchLiveGameDebugMsg(new C3324a("10s没有收到心跳", true));
                }
                if (longValue % 6 == 0) {
                    long j = c87177KWt.LIZJ.get();
                    C3383p mo30099invoke2 = c87177KWt.LJI.mo30099invoke();
                    if (mo30099invoke2 != null) {
                        ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceSeiRecvByGop(mo30099invoke2, j, 10000L);
                        ALogger.m15797i("AAM.SeiMonitorInterceptor", "recv sei " + j + " per 60s");
                    }
                    c87177KWt.LIZJ.set(0L);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
