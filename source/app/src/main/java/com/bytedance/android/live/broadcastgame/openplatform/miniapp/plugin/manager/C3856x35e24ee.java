package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87666KgW;
import p003X.C87811Kir;
import p003X.C87911KkT;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager.MiniAppAnchorPluginManager$checkBeforeConfiguration$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3856x35e24ee extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3384q $item;
    public final /* synthetic */ C87666KgW this$0;

    static {
        Covode.recordClassIndex(21741);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3856x35e24ee(C3384q c3384q, C87666KgW c87666KgW) {
        super(0);
        this.$item = c3384q;
        this.this$0 = c87666KgW;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87911KkT c87911KkT = C87911KkT.LIZIZ;
            c87911KkT.LIZ("MiniAppCard", "checkBeforeConfiguration 预启动 " + this.$item);
            C3383p LJFF = this.$item.LJFF();
            if (LJFF != null) {
                this.this$0.LIZ(LJFF.LIZLLL, LJFF.LJLIIIL, LJFF.LJJLJLI, MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("game", this.$item), TuplesKt.m137to("is_preview_mount", Boolean.TRUE)), false, false);
            }
            C87811Kir.LIZ((C3384q) null);
        }
        return Unit.INSTANCE;
    }
}
