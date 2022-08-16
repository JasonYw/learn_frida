package com.bytedance.android.live.broadcastgame.effectgame;

import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.LiveGameMusicControl;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EffectGameEngine$onChanged$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectGameEngine this$0;

    static {
        Covode.recordClassIndex(19737);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectGameEngine$onChanged$$inlined$let$lambda$1(EffectGameEngine effectGameEngine) {
        super(0);
        this.this$0 = effectGameEngine;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (dataCenter = this.this$0.LJIIL) != null) {
            dataCenter.put("cmd_broadcast_game_music_control", new LiveGameMusicControl(LiveGameMusicControl.Operation.PLAY_END));
        }
        return Unit.INSTANCE;
    }
}
