package com.android.ttcjpaysdk.base.auth.p127a;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.auth.a.i */
/* loaded from: classes17.dex */
public final class C2122i implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String display_desc;
    public String display_url;

    static {
        Covode.recordClassIndex(5924);
    }

    public C2122i() {
        this(null, null, 3, null);
    }

    public final void parseJson(JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1).isSupported && jSONObject != null) {
            String optString = jSONObject.optString("display_desc");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            this.display_desc = optString;
            String optString2 = jSONObject.optString("display_url");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            this.display_url = optString2;
        }
    }

    public C2122i(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.display_desc = str;
        this.display_url = str2;
    }

    public /* synthetic */ C2122i(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
