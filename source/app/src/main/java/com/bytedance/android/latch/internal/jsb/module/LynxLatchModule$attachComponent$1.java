package com.bytedance.android.latch.internal.jsb.module;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes10.dex */
public final class LynxLatchModule$attachComponent$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Callback $callback;
    public final /* synthetic */ LynxLatchModule this$0;

    static {
        Covode.recordClassIndex(13749);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxLatchModule$attachComponent$1(LynxLatchModule lynxLatchModule, Callback callback) {
        super(1);
        this.this$0 = lynxLatchModule;
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            this.$callback.invoke(this.this$0.toWritableMap(jSONObject2));
        }
        return Unit.INSTANCE;
    }
}
