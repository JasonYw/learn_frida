package com.android.ttcjpaysdk.base.serverevent;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C136659cUg;
import p003X.C136671cUs;
import p003X.C136992ca3;

/* renamed from: com.android.ttcjpaysdk.base.serverevent.a */
/* loaded from: classes17.dex */
public final class C2166a {
    public static ChangeQuickRedirect LIZ;
    public static final C136659cUg LIZJ = new C136659cUg((byte) 0);
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) ServerEventManager$Companion$instance$2.INSTANCE);

    public C2166a() {
    }

    static {
        Covode.recordClassIndex(6379);
    }

    public /* synthetic */ C2166a(byte b) {
        this();
    }

    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        new StringBuilder();
        String m25086C = C0002O.m25086C(CJPayParamsUtils.LIZ(), "/gateway-cashier2/tp/cashier/event_upload");
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (!TextUtils.isEmpty(LIZ2.LIZJ())) {
            C136992ca3 LIZ3 = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            m25086C = C0002O.m25085C("https://", LIZ3.LIZJ(), "/gateway-cashier2/tp/cashier/event_upload");
        }
        CJPayNetworkManager.postForm(m25086C, CJPayParamsUtils.LIZ("", jSONObject.toString(), "", ""), CJPayParamsUtils.LIZ(m25086C, "", MapsKt__MapsKt.emptyMap()), new C136671cUs());
    }
}
