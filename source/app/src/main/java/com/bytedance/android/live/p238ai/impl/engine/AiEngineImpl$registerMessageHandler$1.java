package com.bytedance.android.live.p238ai.impl.engine;

import com.bytedance.android.live.p238ai.api.p239a.AbstractC2784j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.pitaya.api.PTYMessageHandler;
import kotlin.Pair;
import org.json.JSONObject;
import p003X.C100005Pa3;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.impl.engine.AiEngineImpl$registerMessageHandler$1 */
/* loaded from: classes8.dex */
public final class AiEngineImpl$registerMessageHandler$1 implements PTYMessageHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC2784j $handler;
    public final /* synthetic */ C100005Pa3 this$0;

    static {
        Covode.recordClassIndex(13917);
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public final JSONObject onMessage(JSONObject jSONObject) {
        Pair pair;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(jSONObject);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{jSONObject}, this.this$0, C100005Pa3.LIZ, false, 12);
        if (proxy2.isSupported) {
            pair = (Pair) proxy2.result;
        } else {
            pair = new Pair(jSONObject.optString("method_name", ""), jSONObject.optJSONObject("message_info"));
        }
        pair.component1();
        pair.component2();
        return this.$handler.LIZ();
    }

    public AiEngineImpl$registerMessageHandler$1(C100005Pa3 c100005Pa3, AbstractC2784j abstractC2784j) {
        this.this$0 = c100005Pa3;
        this.$handler = abstractC2784j;
    }
}
