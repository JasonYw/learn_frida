package com.bytedance.android.latch.internal;

import com.bytedance.android.latch.internal.C2763c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes28.dex */
public final class LatchStateHolder$handleStructResult$1 extends Lambda implements Function3<JSONObject, C2763c.C2764a, Function2<? super C2763c.C2764a, ? super JSONObject, ? extends Boolean>, Unit> {
    public static final LatchStateHolder$handleStructResult$1 INSTANCE = new LatchStateHolder$handleStructResult$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13711);
    }

    public LatchStateHolder$handleStructResult$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(JSONObject jSONObject, C2763c.C2764a c2764a, Function2<? super C2763c.C2764a, ? super JSONObject, ? extends Boolean> function2) {
        LIZ(jSONObject, c2764a, function2);
        return Unit.INSTANCE;
    }

    public final void LIZ(JSONObject jSONObject, C2763c.C2764a c2764a, Function2<? super C2763c.C2764a, ? super JSONObject, Boolean> function2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, c2764a, function2}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c2764a, function2);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(next, "");
                C2763c.C2764a c2764a2 = new C2763c.C2764a(next, c2764a);
                if (!function2.invoke(c2764a2, jSONObject2).booleanValue()) {
                    LIZ(jSONObject2, c2764a2, function2);
                }
            }
        }
    }
}
