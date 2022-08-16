package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C87607KfZ;

/* loaded from: classes5.dex */
public final class NetworkRequestMethod$onResponseSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $data;
    public final /* synthetic */ JSONObject $header;
    public final /* synthetic */ int $statusCode;
    public final /* synthetic */ C87607KfZ this$0;

    static {
        Covode.recordClassIndex(20519);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestMethod$onResponseSuccess$1(C87607KfZ c87607KfZ, int i, JSONObject jSONObject, String str) {
        super(0);
        this.this$0 = c87607KfZ;
        this.$statusCode = i;
        this.$header = jSONObject;
        this.$data = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", this.$statusCode);
            jSONObject.put("header", this.$header);
            C87607KfZ c87607KfZ = this.this$0;
            jSONObject.put(C2521l.LJIIL, this.$data);
            c87607KfZ.LIZ(jSONObject);
        }
        return Unit.INSTANCE;
    }
}
