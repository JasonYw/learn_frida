package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87696Kh0;

/* loaded from: classes5.dex */
public final class CloudExecutor$refreshSid$2$1 extends Lambda implements Function4<Integer, String, JSONObject, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87696Kh0 this$0;

    static {
        Covode.recordClassIndex(19967);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$refreshSid$2$1(C87696Kh0 c87696Kh0) {
        super(4);
        this.this$0 = c87696Kh0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ Unit invoke(Integer num, String str, JSONObject jSONObject, String str2) {
        int intValue = num.intValue();
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, jSONObject, str4}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str3, jSONObject, str4);
            C3484a.LIZ(this.this$0.LIZIZ, intValue, str3, str4, null, false, 24, null);
        }
        return Unit.INSTANCE;
    }
}
