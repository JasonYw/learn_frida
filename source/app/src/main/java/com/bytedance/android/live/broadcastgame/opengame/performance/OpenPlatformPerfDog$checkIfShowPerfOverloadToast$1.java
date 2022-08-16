package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87653KgJ;
import p003X.C87911KkT;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfDog$checkIfShowPerfOverloadToast$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $encodeFps;
    public final /* synthetic */ boolean $isBatteryTemperatureOverload;
    public final /* synthetic */ boolean $isFpsOverload;
    public final /* synthetic */ boolean $isStutterRateOverload;
    public final /* synthetic */ float $stutterDuration;
    public final /* synthetic */ float $temperature;

    static {
        Covode.recordClassIndex(20799);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformPerfDog$checkIfShowPerfOverloadToast$1(float f, int i, float f2, boolean z, boolean z2, boolean z3) {
        super(0);
        this.$stutterDuration = f;
        this.$encodeFps = i;
        this.$temperature = f2;
        this.$isFpsOverload = z;
        this.$isStutterRateOverload = z2;
        this.$isBatteryTemperatureOverload = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(LK5.LIZ(2131586690));
            C87653KgJ.LIZLLL.LIZ(this.$stutterDuration, this.$encodeFps, this.$temperature);
            C87911KkT c87911KkT = C87911KkT.LIZIZ;
            c87911KkT.LIZ("PerfOverload! Show Toast. fps:" + this.$isFpsOverload + "  stutter:" + this.$isStutterRateOverload + "  temperature:" + this.$isBatteryTemperatureOverload, "OpenPlatformPerfDog");
        }
        return Unit.INSTANCE;
    }
}
