package com.android.ttcjpaysdk.integrated.counter.p154b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.integrated.counter.data.C2276ae;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.data.C2279k;
import com.android.ttcjpaysdk.integrated.counter.data.C2280y;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.outerpay.CJOuterPayManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p003X.C137147ccZ;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.b.a */
/* loaded from: classes17.dex */
public final class C2272a {
    public static ChangeQuickRedirect LIZ;
    public static C2278i LIZIZ;
    public static CJPayHostInfo LIZJ;
    public static C137147ccZ LJIL;
    public static String LJJIFFI;
    public static PaymentMethodInfo LJJII;
    public static PaymentMethodInfo LJJIII;
    public PaymentMethodInfo LJFF = new PaymentMethodInfo();
    public PaymentMethodInfo LJII = new PaymentMethodInfo();
    public PaymentMethodInfo LJIIIIZZ = new PaymentMethodInfo();
    public boolean LJIIL = false;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = false;
    public JSONObject LJIIZILJ = null;
    public static List<Activity> LIZLLL = new ArrayList();

    /* renamed from: LJ */
    public static C2279k f25499LJ = null;
    public static boolean LJI = true;
    public static ArrayList<String> LJIIIZ = null;
    public static ArrayList<String> LJIIJ = null;
    public static String LJIIJJI = "";
    public static int LJJ = -1;
    public static boolean LJIJ = false;
    public static CJOuterPayManager.OuterType LJIJI = null;
    public static String LJIJJ = "";
    public static String LJIJJLI = "";
    public static boolean LJJI = false;

    public static void LJIIIIZZ() {
        LJJIII = null;
    }

    public static boolean LIZLLL() {
        return LJJI;
    }

    /* renamed from: LJ */
    public static String m16051LJ() {
        return LJJIFFI;
    }

    public static PaymentMethodInfo LJIIIZ() {
        return LJJII;
    }

    public static void LJIIJ() {
        LJIIJJI = "";
        LJI = true;
    }

    public static String LJII() {
        PaymentMethodInfo paymentMethodInfo = LJJII;
        if (paymentMethodInfo != null) {
            return paymentMethodInfo.card.bank_name;
        }
        return null;
    }

    public static String LJFF() {
        PaymentMethodInfo paymentMethodInfo = LJJIII;
        if (paymentMethodInfo != null && paymentMethodInfo.paymentType != null) {
            return LJJIII.paymentType;
        }
        PaymentMethodInfo paymentMethodInfo2 = LJJII;
        if (paymentMethodInfo2 != null && paymentMethodInfo2.paymentType != null) {
            return LJJII.paymentType;
        }
        return null;
    }

    public static String LJI() {
        PaymentMethodInfo paymentMethodInfo = LJJIII;
        if (paymentMethodInfo != null) {
            return paymentMethodInfo.card.card_type;
        }
        PaymentMethodInfo paymentMethodInfo2 = LJJII;
        if (paymentMethodInfo2 != null) {
            return paymentMethodInfo2.card.card_type;
        }
        return null;
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = this.LJIIZILJ;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "";
    }

    static {
        Covode.recordClassIndex(7549);
    }

    public static boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("0", LJIIJJI);
    }

    public static C137147ccZ LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (C137147ccZ) proxy.result;
        }
        C137147ccZ c137147ccZ = LJIL;
        if (c137147ccZ != null) {
            return c137147ccZ;
        }
        C2278i c2278i = LIZIZ;
        if (c2278i != null) {
            Iterator<C2276ae> it = c2278i.data.paytype_items.iterator();
            while (it.hasNext()) {
                C2276ae next = it.next();
                if ("bytepay".equals(next.ptcode)) {
                    C137147ccZ c137147ccZ2 = (C137147ccZ) CJPayJsonParser.fromJson(next.paytype_item_info, C137147ccZ.class);
                    LJIL = c137147ccZ2;
                    return c137147ccZ2;
                }
            }
        }
        return new C137147ccZ();
    }

    public static void LIZ(int i) {
        LJJ = i;
    }

    public static void LIZ(C137147ccZ c137147ccZ) {
        LJIL = null;
    }

    public static void LIZ(String str) {
        LJJIFFI = str;
    }

    public static void LIZ(boolean z) {
        LJJI = z;
    }

    public static void LIZ(PaymentMethodInfo paymentMethodInfo) {
        if (PatchProxy.proxy(new Object[]{paymentMethodInfo}, null, LIZ, true, 8).isSupported) {
            return;
        }
        LJJII = (PaymentMethodInfo) CJPayJsonParser.fromJson(CJPayJsonParser.toJsonObject(paymentMethodInfo), PaymentMethodInfo.class);
    }

    public static void LIZIZ(PaymentMethodInfo paymentMethodInfo) {
        if (PatchProxy.proxy(new Object[]{paymentMethodInfo}, null, LIZ, true, 9).isSupported) {
            return;
        }
        LJJIII = (PaymentMethodInfo) CJPayJsonParser.fromJson(CJPayJsonParser.toJsonObject(paymentMethodInfo), PaymentMethodInfo.class);
    }

    public static int LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJJ == -1 && context != null) {
            C137147ccZ LIZ2 = LIZ();
            int i = 0;
            while (true) {
                if (i >= LIZ2.paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list.size()) {
                    break;
                }
                C2280y c2280y = LIZ2.paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list.get(i);
                if ("credit_pay".equals(c2280y.sub_pay_type)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c2280y.pay_type_data.credit_pay_methods.size()) {
                            break;
                        } else if (c2280y.pay_type_data.credit_pay_methods.get(i2).choose) {
                            LJJ = LIZ(context, i2, c2280y.pay_type_data.credit_pay_methods.size());
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 == c2280y.pay_type_data.credit_pay_methods.size() || c2280y.pay_type_data.credit_pay_methods.size() == 0) {
                        LJJ = 0;
                    }
                } else {
                    i++;
                }
            }
            if (i == LIZ2.paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list.size() || LIZ2.paytype_info.sub_pay_type_sum_info.sub_pay_type_info_list.size() == 0) {
                LJJ = 0;
            }
            return LJJ;
        }
        return LJJ;
    }

    public static int LIZ(Context context, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int screenWidth = CJPayBasicUtils.getScreenWidth(context) - CJPayBasicUtils.dipToPX(context, 52.0f);
        if (i == 0) {
            return 0;
        }
        if (i == i2 - 1) {
            int dipToPX = ((i + 1) * CJPayBasicUtils.dipToPX(context, 120.0f)) + (i * CJPayBasicUtils.dipToPX(context, 8.0f)) + CJPayBasicUtils.dipToPX(context, 16.0f);
            if (dipToPX <= screenWidth) {
                return 0;
            }
            return dipToPX - screenWidth;
        }
        int dipToPX2 = (i * (CJPayBasicUtils.dipToPX(context, 120.0f) + CJPayBasicUtils.dipToPX(context, 8.0f))) + (CJPayBasicUtils.dipToPX(context, 120.0f) / 2);
        int i3 = screenWidth / 2;
        if (dipToPX2 <= i3) {
            return 0;
        }
        return dipToPX2 - i3;
    }

    public final void LIZ(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 6).isSupported) {
            return;
        }
        try {
            this.LJIIZILJ = new JSONObject();
            this.LJIIZILJ.put("card_add_ext", str);
            this.LJIIZILJ.put("bank_code", str2);
            this.LJIIZILJ.put("card_type", str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
