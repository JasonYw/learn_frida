package com.android.ttcjpaysdk.thirdparty.balance.p159d;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayQuickPay;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractC136214cNV;
import p003X.C106862S5w;
import p003X.C135465cBQ;
import p003X.C136246cO1;
import p003X.C136293cOm;
import p003X.C136294cOn;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balance.d.a */
/* loaded from: classes17.dex */
public class C2297a implements AbstractC136214cNV {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7977);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C2118a LIZ2 = C2118a.LIZ();
        JSONObject jSONObject = new JSONObject();
        C135465cBQ.LIZ(jSONObject, "type", "提现");
        LIZ2.LIZ("wallet_pv_limit_toast_imp", LIZ(jSONObject));
    }

    public final JSONObject LIZIZ() {
        String str;
        int i;
        CJPayPayTypeInfo cJPayPayTypeInfo;
        CJPayQuickPay cJPayQuickPay;
        String substring;
        CJPayPayTypeInfo cJPayPayTypeInfo2;
        CJPayQuickPay cJPayQuickPay2;
        ArrayList<CJPayCard> arrayList;
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        int i2 = 1;
        C135465cBQ.LIZ(jSONObject, "is_bankcard", 1);
        C135465cBQ.LIZ(jSONObject, "amount", Long.valueOf(C136294cOn.LIZIZ.LIZIZ(C136246cO1.LJFF)));
        String str3 = null;
        if (C136246cO1.f18003LJ == null) {
            str = "";
        } else {
            CJPayCard cJPayCard = C136246cO1.f18003LJ;
            if (cJPayCard != null) {
                str2 = cJPayCard.bank_name;
            } else {
                str2 = null;
            }
            CJPayCard cJPayCard2 = C136246cO1.f18003LJ;
            if (cJPayCard2 != null) {
                str3 = cJPayCard2.card_type_name;
            }
            str = Intrinsics.stringPlus(str2, str3);
        }
        C135465cBQ.LIZ(jSONObject, "bank_name", str);
        C2342n c2342n = C136246cO1.LIZJ;
        if (c2342n != null && (cJPayPayTypeInfo2 = c2342n.paytype_info) != null && (cJPayQuickPay2 = cJPayPayTypeInfo2.quick_pay) != null && (arrayList = cJPayQuickPay2.cards) != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        C135465cBQ.LIZ(jSONObject, "bank_num", Integer.valueOf(i));
        C2342n c2342n2 = C136246cO1.LIZJ;
        if (c2342n2 != null && (cJPayPayTypeInfo = c2342n2.paytype_info) != null && (cJPayQuickPay = cJPayPayTypeInfo.quick_pay) != null && cJPayQuickPay.cards.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<CJPayCard> arrayList2 = cJPayQuickPay.cards;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "");
            int i3 = 1;
            for (CJPayCard cJPayCard3 : arrayList2) {
                stringBuffer.append(cJPayCard3.bank_name);
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (Intrinsics.areEqual("1", cJPayCard3.status)) {
                    i3 = 0;
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "");
            if (StringsKt__StringsJVMKt.isBlank(stringBuffer2)) {
                substring = "";
            } else {
                substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "");
            }
            C135465cBQ.LIZ(jSONObject, "bank_list", substring);
            i2 = i3;
        } else {
            C135465cBQ.LIZ(jSONObject, "bank_list", "");
        }
        C135465cBQ.LIZ(jSONObject, "if_able", Integer.valueOf(i2));
        return LIZ(jSONObject);
    }

    public final JSONObject LIZIZ(String str) {
        long j;
        long j2;
        CJPayUserInfo cJPayUserInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            C136293cOm c136293cOm = C136294cOn.LIZIZ;
            C2342n c2342n = C136246cO1.LIZJ;
            if (c2342n != null && (cJPayUserInfo = c2342n.user_info) != null) {
                j2 = cJPayUserInfo.balance_amount;
            } else {
                j2 = Long.MAX_VALUE;
            }
            j = c136293cOm.LIZ(str, j2)[1];
        } else {
            j = 0;
        }
        return LIZ(j);
    }

    public final JSONObject LIZ(JSONObject jSONObject) {
        String str;
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = C136246cO1.LIZIZ;
        if (cJPayHostInfo == null || (str = cJPayHostInfo.merchantId) == null) {
            str = "";
        }
        CJPayHostInfo cJPayHostInfo2 = C136246cO1.LIZIZ;
        if (cJPayHostInfo2 == null || (str2 = cJPayHostInfo2.appId) == null) {
            str2 = "";
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str, str2);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                C135465cBQ.LIZ(LIZ2, next, jSONObject.opt(next));
            }
        }
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2;
    }

    public final JSONObject LIZ(long j) {
        long j2;
        int i;
        CJPayUserInfo cJPayUserInfo;
        String str;
        CJPayUserInfo cJPayUserInfo2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        C135465cBQ.LIZ(jSONObject, "type", "可变金额");
        C135465cBQ.LIZ(jSONObject, "account_type", "银行卡");
        C2342n c2342n = C136246cO1.LIZJ;
        if (c2342n != null && (cJPayUserInfo2 = c2342n.user_info) != null) {
            j2 = cJPayUserInfo2.balance_amount;
        } else {
            j2 = 0;
        }
        C135465cBQ.LIZ(jSONObject, "balance_amount", Long.valueOf(j2));
        C135465cBQ.LIZ(jSONObject, "version", "普通");
        CJPayCard cJPayCard = C136246cO1.f18003LJ;
        if (cJPayCard != null) {
            if (Intrinsics.areEqual("1", cJPayCard.card_type)) {
                str = "储蓄卡";
            } else {
                str = "信用卡";
            }
            C135465cBQ.LIZ(jSONObject, "bank_type", str);
        }
        C2342n c2342n2 = C136246cO1.LIZJ;
        if (c2342n2 == null || (cJPayUserInfo = c2342n2.user_info) == null || (i = cJPayUserInfo.auth_status) == null) {
            i = 0;
        }
        C135465cBQ.LIZ(jSONObject, "identity_type", i);
        C135465cBQ.LIZ(jSONObject, "tixian_amount", Long.valueOf(j));
        return jSONObject;
    }

    public final JSONObject LIZ(String str) {
        CJPayPayTypeInfo cJPayPayTypeInfo;
        CJPayQuickPay cJPayQuickPay;
        ArrayList<CJPayCard> arrayList;
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(str);
        int hashCode = str.hashCode();
        if (hashCode != -940242166) {
            if (hashCode == -806191449 && str.equals("recharge")) {
                JSONObject jSONObject = new JSONObject();
                C2342n c2342n = C136246cO1.LIZJ;
                if (c2342n == null || (cJPayPayTypeInfo = c2342n.paytype_info) == null || (cJPayQuickPay = cJPayPayTypeInfo.quick_pay) == null || (arrayList = cJPayQuickPay.cards) == null || !(!arrayList.isEmpty())) {
                    i = 0;
                }
                C135465cBQ.LIZ(jSONObject, "is_bankcard", Integer.valueOf(i));
                C135465cBQ.LIZ(jSONObject, "amount", Long.valueOf(C136294cOn.LIZIZ.LIZIZ(C136246cO1.LJFF)));
                return LIZ(jSONObject);
            }
        } else if (str.equals("withdraw")) {
            return LIZ(LIZIZ(C136246cO1.LJFF));
        }
        return LIZ((JSONObject) null);
    }
}
