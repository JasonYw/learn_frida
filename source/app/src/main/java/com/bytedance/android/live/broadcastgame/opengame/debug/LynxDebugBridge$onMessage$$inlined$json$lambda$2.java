package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C87909KkR;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class LynxDebugBridge$onMessage$$inlined$json$lambda$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $audience;
    public final /* synthetic */ C87909KkR this$0;

    static {
        Covode.recordClassIndex(20070);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxDebugBridge$onMessage$$inlined$json$lambda$2(JSONObject jSONObject, C87909KkR c87909KkR) {
        super(0);
        this.$audience = jSONObject;
        this.this$0 = c87909KkR;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87911KkT c87911KkT = C87911KkT.LIZIZ;
            String optString = this.$audience.optString(PushConstants.WEB_URL);
            String str = "";
            Intrinsics.checkNotNullExpressionValue(optString, str);
            c87911KkT.LIZIZ("audience", optString);
            Function3<? super String, ? super String, ? super String, Unit> function3 = this.this$0.LIZJ;
            if (function3 != null) {
                String optString2 = this.$audience.optString("prefix");
                if (optString2 == null) {
                    optString2 = str;
                }
                String optString3 = this.$audience.optString(PushConstants.WEB_URL);
                if (optString3 == null) {
                    optString3 = str;
                }
                String optString4 = this.$audience.optString("configPath");
                if (optString4 != null) {
                    str = optString4;
                }
                function3.invoke(optString2, optString3, str);
            }
        }
        return Unit.INSTANCE;
    }
}
