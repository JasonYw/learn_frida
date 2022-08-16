package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.api.util.OpenPlatformTimeTracer;
import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3802l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87717KhL;
import p003X.C87734Khc;
import p003X.C87739Khh;
import p003X.C87743Khl;
import p003X.C87759Ki1;
import p003X.C87767Ki9;
import p003X.C87773KiF;
import p003X.C87774KiG;
import p003X.C87805Kil;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager.MiniAppAudiencePluginManager$receiveEntranceFromAnchor$showIcon$1 */
/* loaded from: classes5.dex */
public final class C3859xd7607607 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3516am $entrance;
    public final /* synthetic */ C3802l $event;
    public final /* synthetic */ int $from;
    public final /* synthetic */ Function0 $loadButton;
    public final /* synthetic */ C87734Khc this$0;

    static {
        Covode.recordClassIndex(21750);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3859xd7607607(C87734Khc c87734Khc, C3516am c3516am, C3802l c3802l, int i, Function0 function0) {
        super(0);
        this.this$0 = c87734Khc;
        this.$entrance = c3516am;
        this.$event = c3802l;
        this.$from = i;
        this.$loadButton = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PluginType LIZ = PluginType.Companion.LIZ(this.$entrance.LJIIJ);
            this.$event.LIZ("showIcon, plugin type: " + LIZ);
            if (this.this$0.LIZIZ == null) {
                this.this$0.LIZ(this.$entrance);
            }
            String str3 = null;
            if (LIZ != null) {
                if (this.$from == 1) {
                    C87767Ki9.LIZ().LIZ(OpenPlatformTimeTracer.EventName.show_icon_time);
                }
                C87774KiG c87774KiG = C87773KiF.LIZ;
                Map<String, Object> LIZLLL = this.this$0.LIZLLL();
                LIZLLL.put("log_extra", this.this$0.LJIIJ.get("data_mini_app_log_extra", (String) null));
                c87774KiG.LIZ(LIZ, LIZLLL, this.$event);
                Function0 function0 = this.$loadButton;
                if (function0 != null) {
                    function0.mo30099invoke();
                }
                C87739Khh c87739Khh = C87739Khh.LIZIZ;
                C87743Khl c87743Khl = this.this$0.LIZIZ;
                if (c87743Khl != null) {
                    str = c87743Khl.LIZIZ;
                } else {
                    str = null;
                }
                C87743Khl c87743Khl2 = this.this$0.LIZIZ;
                if (c87743Khl2 != null) {
                    str2 = c87743Khl2.LJFF;
                } else {
                    str2 = null;
                }
                C87743Khl c87743Khl3 = this.this$0.LIZIZ;
                if (c87743Khl3 != null) {
                    str3 = c87743Khl3.LJII;
                }
                c87739Khh.LIZIZ(new C87759Ki1(str, str2, str3), new C87717KhL(this.this$0.m23467LJ(), "audience", false, false, 12));
                C87805Kil.LIZIZ.LIZ(Long.valueOf(this.$entrance.LIZIZ), this.$entrance.LJIIJJI);
            } else {
                C3802l.LIZ(this.$event.LIZIZ("plugin type == null"), false, 1, null);
                C3802l.f26111LJ.LIZIZ(this.$event.LIZIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
