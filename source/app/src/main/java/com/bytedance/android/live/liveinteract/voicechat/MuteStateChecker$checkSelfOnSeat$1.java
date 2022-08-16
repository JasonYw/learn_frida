package com.bytedance.android.live.liveinteract.voicechat;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.HDJ;
import p003X.HH8;

/* loaded from: classes3.dex */
public final class MuteStateChecker$checkSelfOnSeat$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HDJ this$0;

    static {
        Covode.recordClassIndex(30809);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MuteStateChecker$checkSelfOnSeat$1(HDJ hdj) {
        super(0);
        this.this$0 = hdj;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZLLL.LIZ(C79242HLo.LIZ(), "") == null) {
            C79046HEa LIZ = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.LIZJ()) {
                long currentTimeMillis = System.currentTimeMillis() - this.this$0.LIZLLL.LJIIL();
                if (!PatchProxy.proxy(new Object[]{new Long(currentTimeMillis)}, HH8.LIZIZ, HH8.LIZ, false, 38).isSupported) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("elapse_time", Long.valueOf(currentTimeMillis));
                    HH8.LIZ("self_not_on_seat", (Map) linkedHashMap, false, 4, (Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
