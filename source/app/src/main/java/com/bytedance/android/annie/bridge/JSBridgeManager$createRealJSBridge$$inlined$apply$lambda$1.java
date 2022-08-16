package com.bytedance.android.annie.bridge;

import com.bytedance.android.annie.service.p216g.AbstractC2629b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C99782PRo;
import p003X.C99783PRp;
import p003X.PRG;

/* loaded from: classes7.dex */
public final class JSBridgeManager$createRealJSBridge$$inlined$apply$lambda$1 extends Lambda implements Function2<String, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $url$inlined;
    public final /* synthetic */ C2584j this$0;

    static {
        Covode.recordClassIndex(10491);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBridgeManager$createRealJSBridge$$inlined$apply$lambda$1(C2584j c2584j, String str) {
        super(2);
        this.this$0 = c2584j;
        this.$url$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, String str2) {
        String str3 = str;
        if (!PatchProxy.proxy(new Object[]{str3, str2}, this, changeQuickRedirect, false, 1).isSupported && str3 != null && str3.length() != 0) {
            AbstractC2629b LIZJ = ((PRG) C99782PRo.LIZIZ.LIZ(PRG.class)).LIZJ();
            String str4 = this.$url$inlined;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PushConstants.WEB_URL, this.$url$inlined);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str2);
            jSONObject2.put("namespace", str3);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("virtual_aid", C99783PRp.LJFF().LIZ);
            LIZJ.LIZ(null, "host_method_call", str4, jSONObject, null, jSONObject2, jSONObject3, 0);
        }
        return Unit.INSTANCE;
    }
}
