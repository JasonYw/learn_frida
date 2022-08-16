package com.bytedance.android.live.broadcastgame.effectgame;

import com.bef.effectsdk.game.BEFGameView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KVC;

/* loaded from: classes5.dex */
public final class EffectGameEngine$startGame$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectGameEngine this$0;

    static {
        Covode.recordClassIndex(19739);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectGameEngine$startGame$1(EffectGameEngine effectGameEngine) {
        super(0);
        this.this$0 = effectGameEngine;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        MethodCollector.m14708i(1415);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            KVC kvc = this.this$0.LJIIJ;
            String str = EffectGameEngine.LIZ(this.this$0).getGameInfo().LJI;
            if (!PatchProxy.proxy(new Object[]{str}, kvc, KVC.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(str);
                if (!PatchProxy.proxy(new Object[]{str}, kvc, KVC.LIZ, false, 4).isSupported) {
                    BEFGameView bEFGameView = new BEFGameView(kvc.LJFF);
                    bEFGameView.setZOrderOnTop(true);
                    bEFGameView.setSwallowTouches(true);
                    bEFGameView.addMessageListener(kvc.f8504LJ);
                    bEFGameView.setGameBundlePath(str);
                    SettingKey<Integer> settingKey = LiveConfigSettingKeys.LIVE_WEBCAST_EFFECT_GAME_GUIDE_FPS;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    bEFGameView.setFps(settingKey.getValue().intValue());
                    kvc.LIZIZ = bEFGameView;
                    kvc.LJI.addView(kvc.LIZIZ);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1415);
        return unit;
    }
}
