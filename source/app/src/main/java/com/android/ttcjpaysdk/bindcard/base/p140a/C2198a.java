package com.android.ttcjpaysdk.bindcard.base.p140a;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.constants.CJPayBindCardType;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.a.a */
/* loaded from: classes17.dex */
public final class C2198a implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public CJPayHostInfo LIZIZ;
    public ArrayList<QuickBindCardAdapterBean> LIZJ;
    public String LIZLLL = "";

    /* renamed from: LJ */
    public String f25467LJ = "";

    static {
        Covode.recordClassIndex(6987);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    public final void LIZ() {
        Object jSONArray;
        ArrayList<CJPayVoucherInfo.Voucher> arrayList;
        ArrayList<CJPayVoucherInfo.Voucher> arrayList2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LIZLLL, this.f25467LJ);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ(LIZ2);
        try {
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            ArrayList<QuickBindCardAdapterBean> arrayList3 = this.LIZJ;
            if (arrayList3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList3}, c136000cK3, C136000cK3.LIZ, false, 3);
            if (proxy.isSupported) {
                jSONArray = proxy.result;
            } else {
                C106862S5w.LIZ(arrayList3);
                jSONArray = new JSONArray();
                for (QuickBindCardAdapterBean quickBindCardAdapterBean : arrayList3) {
                    if (Intrinsics.areEqual(quickBindCardAdapterBean.cardType, CJPayBindCardType.ALL.mType)) {
                        Set<String> keySet = quickBindCardAdapterBean.voucher_info_map.keySet();
                        Intrinsics.checkNotNullExpressionValue(keySet, "");
                        for (Object obj : keySet) {
                            CJPayVoucherInfo cJPayVoucherInfo = quickBindCardAdapterBean.voucher_info_map.get(obj);
                            if (cJPayVoucherInfo != null && (arrayList = cJPayVoucherInfo.vouchers) != null) {
                                for (CJPayVoucherInfo.Voucher voucher : arrayList) {
                                    C136000cK3 c136000cK32 = C136000cK3.LIZIZ;
                                    Intrinsics.checkNotNullExpressionValue(voucher, "");
                                    jSONArray.put(c136000cK32.LIZ(voucher));
                                }
                            }
                        }
                    } else {
                        CJPayVoucherInfo cJPayVoucherInfo2 = quickBindCardAdapterBean.voucher_info_map.get(quickBindCardAdapterBean.cardType);
                        if (cJPayVoucherInfo2 != null && (arrayList2 = cJPayVoucherInfo2.vouchers) != null) {
                            for (CJPayVoucherInfo.Voucher voucher2 : arrayList2) {
                                C136000cK3 c136000cK33 = C136000cK3.LIZIZ;
                                Intrinsics.checkNotNullExpressionValue(voucher2, "");
                                jSONArray.put(c136000cK33.LIZ(voucher2));
                            }
                        }
                    }
                }
            }
            LIZ2.put("campaign_info", jSONArray);
            LIZ2.put("more_type", "一键绑卡");
            C135734cFl.LIZ("wallet_addbcard_first_page_moreactivity_click", LIZ2);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LIZLLL, this.f25467LJ);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ(LIZ2);
        try {
            LIZ2.put("result", i);
            C135734cFl.LIZ("wallet_addbcard_ispswd_result", LIZ2);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(ArrayList<QuickBindCardAdapterBean> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LIZLLL, this.f25467LJ);
        String str = "";
        Intrinsics.checkNotNullExpressionValue(LIZ2, str);
        LIZ(LIZ2);
        try {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                new StringBuilder();
                str = C0002O.m25086C(str, arrayList.get(i).bankName);
                if (i != arrayList.size() - 1) {
                    new StringBuilder();
                    str = C0002O.m25086C(str, "，");
                }
            }
            LIZ2.put("show_onestep_bank_list", str);
            C135734cFl.LIZ("wallet_addbcard_onestep_bank_page_imp", LIZ2);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        int i;
        int i2 = 0;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 11).isSupported) {
            return;
        }
        try {
            if (C135876cI3.f17973LJ.LIZJ()) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("needidentify", i);
            if (C135876cI3.f17973LJ.LIZLLL()) {
                i2 = 1;
            }
            jSONObject.put("haspass", i2);
            jSONObject.put("is_onestep", 1);
            jSONObject.put("show_onestep", 1);
            jSONObject.put("is_auth", C135734cFl.LIZIZ());
            jSONObject.put("is_showphone", C135734cFl.LIZJ());
            jSONObject.put("addbcard_type", "");
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, HashMap<String, Object> hashMap) {
        if (PatchProxy.proxy(new Object[]{str, hashMap}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(this.LIZLLL, this.f25467LJ);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            LIZ2.put(entry.getKey(), entry.getValue());
        }
        if (!TextUtils.isEmpty(C135734cFl.LIZ())) {
            LIZ2.put("source", C135734cFl.LIZ());
        }
        C135734cFl.LIZ(str, LIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: JSONException -> 0x00f4, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:7:0x002c, B:9:0x0030, B:12:0x0037, B:14:0x003b, B:15:0x003e, B:17:0x0044, B:19:0x004d, B:20:0x0050, B:22:0x0057, B:24:0x005b, B:26:0x005e, B:29:0x0071, B:31:0x007e, B:32:0x0095, B:34:0x00a6, B:35:0x00af, B:37:0x00dc, B:39:0x00e1, B:41:0x00eb, B:43:0x008e, B:44:0x0092), top: B:6:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[Catch: JSONException -> 0x00f4, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:7:0x002c, B:9:0x0030, B:12:0x0037, B:14:0x003b, B:15:0x003e, B:17:0x0044, B:19:0x004d, B:20:0x0050, B:22:0x0057, B:24:0x005b, B:26:0x005e, B:29:0x0071, B:31:0x007e, B:32:0x0095, B:34:0x00a6, B:35:0x00af, B:37:0x00dc, B:39:0x00e1, B:41:0x00eb, B:43:0x008e, B:44:0x0092), top: B:6:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[Catch: JSONException -> 0x00f4, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:7:0x002c, B:9:0x0030, B:12:0x0037, B:14:0x003b, B:15:0x003e, B:17:0x0044, B:19:0x004d, B:20:0x0050, B:22:0x0057, B:24:0x005b, B:26:0x005e, B:29:0x0071, B:31:0x007e, B:32:0x0095, B:34:0x00a6, B:35:0x00af, B:37:0x00dc, B:39:0x00e1, B:41:0x00eb, B:43:0x008e, B:44:0x0092), top: B:6:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[Catch: JSONException -> 0x00f4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:7:0x002c, B:9:0x0030, B:12:0x0037, B:14:0x003b, B:15:0x003e, B:17:0x0044, B:19:0x004d, B:20:0x0050, B:22:0x0057, B:24:0x005b, B:26:0x005e, B:29:0x0071, B:31:0x007e, B:32:0x0095, B:34:0x00a6, B:35:0x00af, B:37:0x00dc, B:39:0x00e1, B:41:0x00eb, B:43:0x008e, B:44:0x0092), top: B:6:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.base.p140a.C2198a.LIZ(com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean, boolean):void");
    }
}
