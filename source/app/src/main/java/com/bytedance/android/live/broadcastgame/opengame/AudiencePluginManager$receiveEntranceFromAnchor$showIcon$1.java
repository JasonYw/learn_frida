package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameService;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4317536j;
import p003X.C4574547f;
import p003X.C87717KhL;
import p003X.C87733Khb;
import p003X.C87739Khh;
import p003X.C87742Khk;
import p003X.C87759Ki1;
import p003X.C87764Ki6;
import p003X.C87765Ki7;
import p003X.C87771KiD;
import p003X.C87789KiV;
import p003X.C87805Kil;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$receiveEntranceFromAnchor$showIcon$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3516am $entrance;
    public final /* synthetic */ Function0 $loadButton;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19895);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$receiveEntranceFromAnchor$showIcon$1(C87733Khb c87733Khb, C3516am c3516am, Function0 function0) {
        super(0);
        this.this$0 = c87733Khb;
        this.$entrance = c3516am;
        this.$loadButton = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PluginType LIZ = PluginType.Companion.LIZ(this.$entrance.LJIIJ);
            if (this.this$0.m23466LJ()) {
                if (this.this$0.LIZIZ == null) {
                    this.this$0.LIZIZ(this.$entrance);
                }
                if (LIZ != null) {
                    C87765Ki7 c87765Ki7 = C87771KiD.LIZ;
                    Map<String, ? extends Object> LIZLLL = this.this$0.LIZLLL();
                    if (!PatchProxy.proxy(new Object[]{LIZ, LIZLLL}, c87765Ki7, C87765Ki7.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(LIZ, LIZLLL);
                        int i = C87764Ki6.LIZ[LIZ.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                c87765Ki7.LIZ(ToolbarButton.OPEN_PLATFORM_MINI_GAME, new C4317536j());
                                if (!PatchProxy.proxy(new Object[]{"bottom_toolbar", LIZLLL}, TrackMiniGameService.f26093LJ, C87789KiV.LIZ, false, 1).isSupported) {
                                    C106862S5w.LIZ("bottom_toolbar", LIZLLL);
                                    C4574547f LIZ2 = C4574547f.LIZ();
                                    Map<String, String> LIZ3 = TrackCommonService.LIZJ.LIZ(LIZLLL);
                                    LIZ3.put("source", "bottom_toolbar");
                                    LIZ2.LIZ("livesdk_small_program_audience_icon_show", LIZ3, Room.class, C8668v.class);
                                }
                            }
                        } else {
                            c87765Ki7.LIZ(ToolbarButton.OPEN_PLATFORM_MINI_GAME, new C4317536j());
                        }
                    }
                    Function0 function0 = this.$loadButton;
                    if (function0 != null) {
                        function0.mo30099invoke();
                    }
                    C87739Khh c87739Khh = C87739Khh.LIZIZ;
                    C87742Khk c87742Khk = this.this$0.LIZIZ;
                    String str3 = null;
                    if (c87742Khk != null) {
                        str = c87742Khk.LIZIZ;
                    } else {
                        str = null;
                    }
                    C87742Khk c87742Khk2 = this.this$0.LIZIZ;
                    if (c87742Khk2 != null) {
                        str2 = c87742Khk2.LJFF;
                    } else {
                        str2 = null;
                    }
                    C87742Khk c87742Khk3 = this.this$0.LIZIZ;
                    if (c87742Khk3 != null) {
                        str3 = c87742Khk3.LJII;
                    }
                    c87739Khh.LIZIZ(new C87759Ki1(str, str2, str3), new C87717KhL(this.this$0.LJI(), "audience", false, false, 12));
                    C87805Kil.LIZIZ.LIZ(Long.valueOf(this.$entrance.LIZIZ), this.$entrance.LJIIJJI);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
