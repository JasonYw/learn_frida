package com.bytedance.android.live.broadcastgame.opengame;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AnonymousClass322;
import p003X.AnonymousClass325;
import p003X.C409882Kg;
import p003X.C4305831w;
import p003X.C87733Khb;
import p003X.C87766Ki8;
import p003X.C87904KkM;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$onReceiveSei$$inlined$json$lambda$1 extends Lambda implements Function1<C3516am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $id$inlined;
    public final /* synthetic */ JSONObject $this_json$inlined;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19892);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$onReceiveSei$$inlined$json$lambda$1(String str, JSONObject jSONObject, C87733Khb c87733Khb) {
        super(1);
        this.$id$inlined = str;
        this.$this_json$inlined = jSONObject;
        this.this$0 = c87733Khb;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.AudiencePluginManager$onReceiveSei$$inlined$json$lambda$1$1 */
    /* loaded from: classes5.dex */
    public static final class C34811 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ C3516am $msg;

        static {
            Covode.recordClassIndex(19893);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34811(C3516am c3516am) {
            super(0);
            this.$msg = c3516am;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            C5923dp LIZ;
            AbstractC413392Xt<ViewModel> LJJJZ;
            ViewModel LIZIZ;
            String str;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, AudiencePluginManager$onReceiveSei$$inlined$json$lambda$1.this.this$0.LJIILIIL, 0L, 2, null)) != null && (LJJJZ = LIZ.LJJJZ()) != null && (LIZIZ = LJJJZ.LIZIZ()) != null && (LIZIZ instanceof AnonymousClass322)) {
                C87904KkM c87904KkM = PluginType.Companion;
                C3516am c3516am = this.$msg;
                if (c3516am == null || (str = c3516am.LJIIJ) == null) {
                    str = "";
                }
                PluginType LIZ2 = c87904KkM.LIZ(str);
                if (LIZ2 != null && C87766Ki8.LIZ[LIZ2.ordinal()] == 1) {
                    ((AnonymousClass322) LIZIZ).LIZ(C4305831w.LJI);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3516am c3516am) {
        C3516am c3516am2 = c3516am;
        if (!PatchProxy.proxy(new Object[]{c3516am2}, this, changeQuickRedirect, false, 1).isSupported && AnonymousClass325.LIZ()) {
            this.this$0.LIZ(c3516am2, 2, new C34811(c3516am2));
        }
        return Unit.INSTANCE;
    }
}
