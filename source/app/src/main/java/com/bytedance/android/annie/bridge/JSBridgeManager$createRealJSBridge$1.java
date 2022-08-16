package com.bytedance.android.annie.bridge;

import com.bytedance.android.annie.service.p216g.AbstractC2629b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C99782PRo;
import p003X.C99783PRp;
import p003X.PRG;

/* loaded from: classes7.dex */
public final class JSBridgeManager$createRealJSBridge$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $url;
    public final /* synthetic */ C2584j this$0;

    static {
        Covode.recordClassIndex(10492);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBridgeManager$createRealJSBridge$1(C2584j c2584j, String str) {
        super(0);
        this.this$0 = c2584j;
        this.$url = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (!this.this$0.LJII) {
                this.this$0.LIZJ();
            }
            C2584j c2584j = this.this$0;
            boolean z = !c2584j.LJII ? 1 : 0;
            String str = this.$url;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, c2584j, C2584j.LIZ, false, 11).isSupported) {
                AbstractC2629b LIZJ = ((PRG) C99782PRo.LIZIZ.LIZ(PRG.class)).LIZJ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total", z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("virtual_aid", C99783PRp.LJFF().LIZ);
                LIZJ.LIZ(null, "async_register_jsb_method", str, jSONObject, null, null, jSONObject2, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
