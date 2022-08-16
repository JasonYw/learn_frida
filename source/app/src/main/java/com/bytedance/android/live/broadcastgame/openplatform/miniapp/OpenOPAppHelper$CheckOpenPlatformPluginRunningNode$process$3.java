package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87717KhL;
import p003X.C87739Khh;
import p003X.C87781KiN;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$CheckOpenPlatformPluginRunningNode$process$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Room $room;
    public final /* synthetic */ C87781KiN this$0;

    static {
        Covode.recordClassIndex(21492);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$CheckOpenPlatformPluginRunningNode$process$3(C87781KiN c87781KiN, Room room) {
        super(0);
        this.this$0 = c87781KiN;
        this.$room = room;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87739Khh.LIZIZ.LIZ(this.this$0.LIZIZ, new C87717KhL(this.$room, "anchor", false, false, 12), 1, Integer.valueOf((int) BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS), "已有小程序/小游戏在运行中，用户不切换");
        }
        return Unit.INSTANCE;
    }
}
