package com.bytedance.android.live.liveinteract.voicechat.emoji;

import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.AbstractC8821dt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C78698H0q;
import p003X.C88440Kt0;
import p003X.H0W;
import p003X.H1U;

/* loaded from: classes12.dex */
public final class VoiceChatInteractEmojiPanel$setMcStatus$1 extends Lambda implements Function1<AbstractC8821dt.C8822b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkApi.UpdateMcAction $action;
    public final /* synthetic */ long $userId;
    public final /* synthetic */ H0W this$0;

    static {
        Covode.recordClassIndex(31122);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatInteractEmojiPanel$setMcStatus$1(H0W h0w, long j, LinkApi.UpdateMcAction updateMcAction) {
        super(1);
        this.this$0 = h0w;
        this.$userId = j;
        this.$action = updateMcAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC8821dt.C8822b c8822b) {
        String str;
        if (!PatchProxy.proxy(new Object[]{c8822b}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c8822b);
            HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("live_type", "voice_live"), TuplesKt.m137to("anchor_id", String.valueOf(((H1U) this.this$0).LIZLLL.ownerUserId)), TuplesKt.m137to("room_id", String.valueOf(((H1U) this.this$0).LIZLLL.getId())), TuplesKt.m137to("function_type", "ktv"), TuplesKt.m137to("to_user_id", String.valueOf(this.$userId)));
            if (this.$action == LinkApi.UpdateMcAction.SET_KTV_HOST) {
                this.this$0.LJIILIIL.LJJIIJ = 1;
                C88440Kt0.LIZ(2131585497);
                str = "livesdk_audience_host_set_up";
            } else {
                this.this$0.LJIILIIL.LJJIIJ = 0;
                C88440Kt0.LIZ(2131585507);
                hashMapOf.put("user_type", "anchor");
                str = "livesdk_audience_host_cancel";
            }
            C4574547f.LIZ().LIZ(str, hashMapOf, Room.class, C8668v.class);
            C78698H0q c78698H0q = this.this$0.LJIIJ;
            if (c78698H0q != null) {
                c78698H0q.LIZ(this.this$0.LIZIZ());
            }
        }
        return Unit.INSTANCE;
    }
}
