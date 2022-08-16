package com.bytedance.android.latch.internal;

import com.bytedance.android.latch.internal.C2763c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes28.dex */
public final class LatchStateHolder$handleStructResult$2 extends Lambda implements Function2<C2763c.C2764a, JSONObject, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2763c this$0;

    static {
        Covode.recordClassIndex(13712);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchStateHolder$handleStructResult$2(C2763c c2763c) {
        super(2);
        this.this$0 = c2763c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Boolean invoke(C2763c.C2764a c2764a, JSONObject jSONObject) {
        boolean LIZ;
        C2763c.C2764a c2764a2 = c2764a;
        JSONObject jSONObject2 = jSONObject;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2764a2, jSONObject2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c2764a2, jSONObject2);
            LIZ = this.this$0.LIZ(c2764a2, jSONObject2);
        }
        return Boolean.valueOf(LIZ);
    }
}
