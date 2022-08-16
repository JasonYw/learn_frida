package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L46;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailIntroItemWidget$onUpdate$2$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3136x7ca672d5 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3243u $gameInfo$inlined;
    public final /* synthetic */ GameDetailIntroItemWidget$onUpdate$2 this$0;

    static {
        Covode.recordClassIndex(16752);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3136x7ca672d5(GameDetailIntroItemWidget$onUpdate$2 gameDetailIntroItemWidget$onUpdate$2, C3243u c3243u) {
        super(0);
        this.this$0 = gameDetailIntroItemWidget$onUpdate$2;
        this.$gameInfo$inlined = c3243u;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.this$0.this$0.LJFF().getVisibility() == 8) {
                this.this$0.this$0.LJFF().setVisibility(0);
                this.this$0.this$0.LIZ(this.$gameInfo$inlined);
            }
            L46 l46 = L46.LIZIZ;
            Long l = this.$gameInfo$inlined.LIZIZ;
            if (l != null && ((int) l.longValue()) == 3) {
                str = "1";
            } else {
                str = "0";
            }
            l46.LIZ(str);
            L46 l462 = L46.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], l462, L46.LIZ, false, 25).isSupported) {
                l462.LIZ("livesdk_game_promote_user_promote_detail_introduce_more_click", new LinkedHashMap(), Room.class, C8668v.class);
            }
        }
        return Unit.INSTANCE;
    }
}
