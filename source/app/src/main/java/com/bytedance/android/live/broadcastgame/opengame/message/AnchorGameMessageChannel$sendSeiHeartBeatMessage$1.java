package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AnchorGameMessageChannel$sendSeiHeartBeatMessage$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ Integer $interactId;
    public final /* synthetic */ C3520d this$0;

    static {
        Covode.recordClassIndex(20252);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameMessageChannel$sendSeiHeartBeatMessage$1(C3520d c3520d, JSONObject jSONObject, Integer num) {
        super(1);
        this.this$0 = c3520d;
        this.$data = jSONObject;
        this.$interactId = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long j;
        if (!PatchProxy.proxy(new Object[]{new Long(l.longValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            JSONObject jSONObject = this.$data;
            if (this.this$0.LIZLLL) {
                j = 2;
            } else {
                j = 1;
            }
            jSONObject.put("game_status", j);
            this.$data.put("seq", this.this$0.LIZJ.LIZ());
            this.$data.put("conn_id", this.this$0.LIZJ.LIZIZ);
            this.$data.put("time_stamp", System.currentTimeMillis());
            Integer num = this.$interactId;
            if (num != null) {
                num.intValue();
                this.$data.put("interact_id", this.$interactId.intValue());
            }
            this.this$0.f26064LJ.LIZ("open_game_heartbeat_sei", this.$data.toString(), 1, false, false);
        }
        return Unit.INSTANCE;
    }
}
