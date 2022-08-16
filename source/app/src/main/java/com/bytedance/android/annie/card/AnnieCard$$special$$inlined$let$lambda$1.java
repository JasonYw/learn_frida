package com.bytedance.android.annie.card;

import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnnieCard$$special$$inlined$let$lambda$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ IJSBridgeManager $jsbManager$inlined;

    static {
        Covode.recordClassIndex(10663);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieCard$$special$$inlined$let$lambda$1(IJSBridgeManager iJSBridgeManager) {
        super(1);
        this.$jsbManager$inlined = iJSBridgeManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject);
            this.$jsbManager$inlined.sendJSEvent("latchUpdateState", jSONObject);
        }
        return Unit.INSTANCE;
    }
}
