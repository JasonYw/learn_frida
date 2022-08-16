package com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a;

import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.a.d */
/* loaded from: classes17.dex */
public final class C2188d implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public QuickBindCardAdapterBean LIZIZ;

    static {
        Covode.recordClassIndex(6756);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
        JSONObject LIZLLL = C135734cFl.LIZLLL();
        Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
        LIZ(LIZLLL);
        try {
            LIZLLL.put("type", 2);
            LIZLLL.put("twoelements_verify_status", 0);
            C135734cFl.LIZ("wallet_identified_guide_page_aggrement_choose", LIZ2, LIZLLL);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        HashMap<String, CJPayVoucherInfo> hashMap;
        String str;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 5).isSupported) {
            return;
        }
        try {
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            QuickBindCardAdapterBean quickBindCardAdapterBean = this.LIZIZ;
            if (quickBindCardAdapterBean == null || (hashMap = quickBindCardAdapterBean.voucher_info_map) == null) {
                hashMap = new HashMap<>();
            }
            QuickBindCardAdapterBean quickBindCardAdapterBean2 = this.LIZIZ;
            if (quickBindCardAdapterBean2 == null || (str = quickBindCardAdapterBean2.cardType) == null) {
                str = "";
            }
            jSONObject.put("activity_info", c136000cK3.LIZ(hashMap, str));
        } catch (Exception unused) {
        }
    }
}
