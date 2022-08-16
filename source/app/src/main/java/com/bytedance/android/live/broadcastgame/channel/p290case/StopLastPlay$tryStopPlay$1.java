package com.bytedance.android.live.broadcastgame.channel.p290case;

import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.android.live.broadcastgame.api.channel.ChannelType;
import com.bytedance.android.live.broadcastgame.api.channel.MessageType;
import com.bytedance.android.live.broadcastgame.api.channel.SendType;
import com.bytedance.android.live.broadcastgame.channel.GameChannelApi;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88306Kqq;
import p003X.GZL;
import p003X.GZM;
import p003X.KM9;
import p003X.KXV;
import p003X.KYN;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.case.StopLastPlay$tryStopPlay$1 */
/* loaded from: classes5.dex */
public final class StopLastPlay$tryStopPlay$1 extends Lambda implements Function2<Long, Long, Unit> {
    public static final StopLastPlay$tryStopPlay$1 INSTANCE = new StopLastPlay$tryStopPlay$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19483);
    }

    public StopLastPlay$tryStopPlay$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue), new Long(longValue2)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (!PatchProxy.proxy(new Object[]{new Long(longValue), new Long(longValue2)}, KYN.LIZIZ, KYN.LIZ, false, 2).isSupported) {
                if (longValue != 0 && longValue2 != 0) {
                    C3331a c3331a = new C3331a(-1L, -102L, new C3336f("INNER_GAME_STOP", ChannelType.IM.value, null, 0, false, 28).LIZIZ(), longValue2, 0L, 0, false, 112);
                    long j = MessageType.GAME_MESSAGE.value;
                    long j2 = SendType.SEND_TYPE_1.value;
                    String json = GsonProtectorUtils.toJson(KM9.LIZ(), c3331a);
                    Intrinsics.checkNotNullExpressionValue(json, "");
                    KXV.LIZ((GameChannelApi) C88306Kqq.LIZ().LIZ(GameChannelApi.class), longValue, longValue2, j, j2, json, 0, 32, null).subscribe(GZL.LIZ, GZM.LIZIZ);
                } else {
                    ALogger.m15800e("AAM.StopLastPlay", "just skip(" + longValue + ", " + longValue2 + LoggerUtil.S_RIGHT_TAG);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
