package com.android.ttcjpaysdk.base.auth;

import android.content.Context;
import androidx.core.util.Pair;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.auth.activity.CJPayRealNameAuthActivity;
import com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNameAuthCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135507cC6;

/* loaded from: classes17.dex */
public final class CJPayRealNameAuthService implements ICJPayRealNameAuthService {
    public static ChangeQuickRedirect LIZ;
    public static TTCJPayRealNameAuthCallback LIZIZ;
    public static CJPayHostInfo LIZJ;
    public static Pair<? extends String, Object>[] LIZLLL;

    /* renamed from: LJ */
    public static final C135507cC6 f25445LJ = new C135507cC6((byte) 0);

    static {
        Covode.recordClassIndex(5914);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.base.auth";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService
    public final void setEventExtParams(Pair<? extends String, Object>[] pairArr) {
        LIZLLL = pairArr;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService
    @CJPayModuleEntryReport
    public final void startCJPayRealNameAuthActivity(Context context, String str, String str2, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, tTCJPayRealNameAuthCallback, jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, tTCJPayRealNameAuthCallback);
        if (context != null) {
            LIZJ = CJPayHostInfo.Companion.LIZ(jSONObject);
            LIZIZ = tTCJPayRealNameAuthCallback;
            C116971W2r.LIZ(context, CJPayRealNameAuthActivity.LIZIZ.LIZ(context, str, str2));
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService
    @CJPayModuleEntryReport
    public final void startCJPayRealNameByInfo(Context context, String str, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback, JSONObject jSONObject, JSONArray jSONArray) {
        if (PatchProxy.proxy(new Object[]{context, str, tTCJPayRealNameAuthCallback, jSONObject, jSONArray}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, tTCJPayRealNameAuthCallback);
        if (context != null) {
            LIZJ = CJPayHostInfo.Companion.LIZ(jSONObject);
            LIZIZ = tTCJPayRealNameAuthCallback;
            C116971W2r.LIZ(context, CJPayRealNameAuthActivity.LIZIZ.LIZ(context, str, jSONArray));
        }
    }
}
