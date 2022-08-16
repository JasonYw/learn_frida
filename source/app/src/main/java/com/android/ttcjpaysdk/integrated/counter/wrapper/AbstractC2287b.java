package com.android.ttcjpaysdk.integrated.counter.wrapper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.p135ui.data.C2176e;
import com.android.ttcjpaysdk.base.p135ui.data.VoucherInfo;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.integrated.counter.data.C2276ae;
import com.android.ttcjpaysdk.integrated.counter.data.C2277d;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135820cH9;
import p003X.C137155cch;
import p003X.C137356cfw;
import p003X.C137370cgA;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.wrapper.b */
/* loaded from: classes17.dex */
public abstract class AbstractC2287b extends C135820cH9 {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public boolean f25505LJ;
    public boolean LJFF;
    public int LIZLLL = -1;
    public String LJI = "";

    static {
        Covode.recordClassIndex(7844);
    }

    public abstract void LIZ();

    public abstract void LIZ(C2278i c2278i);

    public abstract ExtendRecyclerView LIZIZ();

    private final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        C2278i c2278i = C2272a.LIZIZ;
        if (c2278i != null) {
            ArrayList<C2276ae> arrayList = c2278i.data.paytype_items;
            Intrinsics.checkNotNullExpressionValue(arrayList, "");
            for (C2276ae c2276ae : arrayList) {
                String str = c2276ae.ptcode;
                if (str != null && str.hashCode() == 355422880 && str.equals("bytepay")) {
                    ArrayList<C2277d> arrayList2 = c2276ae.paytype_item.paytype_info.quick_pay.cards;
                    Intrinsics.checkNotNullExpressionValue(arrayList2, "");
                    for (C2277d c2277d : arrayList2) {
                        sb.append(c2277d.bank_name);
                        sb.append(c2277d.card_type_name);
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        String substring = sb.substring(0, sb.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public String LIZ(PaymentMethodInfo paymentMethodInfo) {
        C2277d c2277d;
        String str;
        if (paymentMethodInfo == null || (c2277d = paymentMethodInfo.card) == null || (str = c2277d.front_bank_code) == null) {
            return "";
        }
        return str;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2287b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        MethodCollector.m14708i(479);
        LayoutInflater.from(this.mContext).inflate(2131690621, (ViewGroup) view);
        MethodCollector.m14707o(479);
    }

    private final JSONArray LIZ(ArrayList<PaymentMethodInfo> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (PaymentMethodInfo paymentMethodInfo : arrayList) {
            ArrayList<VoucherInfo.Voucher> arrayList2 = paymentMethodInfo.voucher_info.vouchers;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "");
            for (VoucherInfo.Voucher voucher : arrayList2) {
                try {
                    C137155cch c137155cch = C137370cgA.LIZ;
                    Intrinsics.checkNotNullExpressionValue(voucher, "");
                    jSONArray.put(c137155cch.LIZ(voucher, paymentMethodInfo.card.front_bank_code));
                } catch (Exception unused) {
                }
            }
        }
        return jSONArray;
    }

    public void LIZ(ArrayList<PaymentMethodInfo> arrayList, C2176e c2176e) {
        if (PatchProxy.proxy(new Object[]{arrayList, c2176e}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bank_list", LIZJ());
            jSONObject.put("campaign_info", LIZ(arrayList));
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_method_page_imp", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo> LIZ(com.android.ttcjpaysdk.integrated.counter.data.C2278i r17, com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.wrapper.AbstractC2287b.LIZ(com.android.ttcjpaysdk.integrated.counter.data.i, com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo):java.util.ArrayList");
    }
}
