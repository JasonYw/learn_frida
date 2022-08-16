package com.android.ttcjpaysdk.integrated.counter.wrapper;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.integrated.counter.data.C2276ae;
import com.android.ttcjpaysdk.integrated.counter.data.C2277d;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.p153a.C2269a;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC137353cft;
import p003X.AbstractC137374cgE;
import p003X.C106862S5w;
import p003X.C135820cH9;
import p003X.C137147ccZ;
import p003X.C137156cci;
import p003X.C137372cgC;

/* loaded from: classes17.dex */
public abstract class BaseConfirmWrapper extends C135820cH9 {
    public static ChangeQuickRedirect LIZJ;
    public AbstractC137353cft LIZLLL;

    /* renamed from: LJ */
    public AbstractC137374cgE f25504LJ;
    public C2278i LJFF;
    public PaymentMethodInfo LJI;
    public boolean LJII;

    static {
        Covode.recordClassIndex(7837);
    }

    public abstract int LIZ();

    public abstract void LIZ(Configuration configuration);

    public abstract void LIZ(C2278i c2278i);

    public abstract void LIZ(String str);

    public abstract void LIZ(boolean z);

    public PaymentMethodInfo LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 1);
        if (proxy.isSupported) {
            return (PaymentMethodInfo) proxy.result;
        }
        C106862S5w.LIZ(str);
        return null;
    }

    public abstract void LIZIZ();

    public void LIZIZ(PaymentMethodInfo paymentMethodInfo) {
    }

    public abstract void LIZIZ(boolean z);

    public abstract void LIZJ();

    public void LIZJ(String str) {
    }

    public abstract void LIZJ(boolean z);

    public abstract RecyclerView LIZLLL();

    public abstract void LIZLLL(boolean z);

    /* renamed from: LJ */
    public abstract void mo16047LJ();

    /* renamed from: LJ */
    public void mo16046LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    /* renamed from: LJ */
    public abstract void mo16045LJ(boolean z);

    public void LJFF() {
    }

    public boolean LJI() {
        return false;
    }

    /* loaded from: classes17.dex */
    public enum SelectPayTypeEnum {
        BankcardPay(1, "普通银行正常支付"),
        NeedSign(2, "补签约"),
        AddNewBankcardAndPay(3, "添加新卡支付"),
        BalanceOrBankcardNotAvailable(4, "余额或者普通银行卡不可用"),
        Weixin(5, "微信"),
        Alipay(6, "支付宝"),
        BalancePay(7, "余额支付"),
        SelectNone(9, "什么都没选"),
        QrCodePay(10, "扫码支付"),
        BankcardOnestepPay(11, "银行卡免密支付"),
        BalanceOnestepPay(12, "余额免密支付"),
        INCOMEPay(13, "钱包收入支付"),
        CREDITPay(14, "信用支付"),
        DyPay(15, "端外支付");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String desc;
        public int value;

        public static SelectPayTypeEnum valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (SelectPayTypeEnum) (proxy.isSupported ? proxy.result : Enum.valueOf(SelectPayTypeEnum.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SelectPayTypeEnum[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (SelectPayTypeEnum[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(7838);
        }

        SelectPayTypeEnum(int i, String str) {
            this.value = i;
            this.desc = str;
        }
    }

    public final int LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.mContext != null && C2272a.LIZIZ != null) {
            PaymentMethodInfo paymentMethodInfo = this.LJI;
            if (paymentMethodInfo != null && !TextUtils.isEmpty(paymentMethodInfo.paymentType)) {
                String str = paymentMethodInfo.paymentType;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1414960566:
                            if (str.equals("alipay")) {
                                return SelectPayTypeEnum.Alipay.value;
                            }
                            break;
                        case -1184259671:
                            if (str.equals("income")) {
                                return SelectPayTypeEnum.INCOMEPay.value;
                            }
                            break;
                        case -1148142799:
                            if (str.equals("addcard")) {
                                return SelectPayTypeEnum.AddNewBankcardAndPay.value;
                            }
                            break;
                        case -1066391653:
                            if (str.equals("quickpay")) {
                                if (paymentMethodInfo.isCardInactive()) {
                                    return SelectPayTypeEnum.NeedSign.value;
                                }
                                if (paymentMethodInfo.isCardAvailable() && (!Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, paymentMethodInfo.identity_verify_way))) {
                                    return SelectPayTypeEnum.BankcardPay.value;
                                }
                                if (paymentMethodInfo.isCardAvailable() && Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, paymentMethodInfo.identity_verify_way)) {
                                    return SelectPayTypeEnum.BankcardOnestepPay.value;
                                }
                                if (C137372cgC.LIZ.LIZ(this.LJFF) == 0 || (!paymentMethodInfo.isCardAvailable() && !paymentMethodInfo.isCardInactive())) {
                                    return SelectPayTypeEnum.AddNewBankcardAndPay.value;
                                }
                                return SelectPayTypeEnum.BalanceOrBankcardNotAvailable.value;
                            }
                            break;
                        case -951532658:
                            if (str.equals("qrcode")) {
                                return SelectPayTypeEnum.QrCodePay.value;
                            }
                            break;
                        case -339185956:
                            if (str.equals("balance")) {
                                if (paymentMethodInfo.isCardAvailable() && (!Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, paymentMethodInfo.identity_verify_way))) {
                                    return SelectPayTypeEnum.BalancePay.value;
                                }
                                if (paymentMethodInfo.isCardAvailable() && Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, paymentMethodInfo.identity_verify_way)) {
                                    return SelectPayTypeEnum.BalanceOnestepPay.value;
                                }
                                return SelectPayTypeEnum.BalanceOrBankcardNotAvailable.value;
                            }
                            break;
                        case 3809:
                            if (str.equals("wx")) {
                                return SelectPayTypeEnum.Weixin.value;
                            }
                            break;
                        case 96067571:
                            if (str.equals("dypay")) {
                                return SelectPayTypeEnum.DyPay.value;
                            }
                            break;
                        case 674559759:
                            if (str.equals("creditpay")) {
                                return SelectPayTypeEnum.CREDITPay.value;
                            }
                            break;
                    }
                }
                return SelectPayTypeEnum.AddNewBankcardAndPay.value;
            }
            return SelectPayTypeEnum.AddNewBankcardAndPay.value;
        }
        return SelectPayTypeEnum.AddNewBankcardAndPay.value;
    }

    public String LIZ(PaymentMethodInfo paymentMethodInfo) {
        C2277d c2277d;
        String str;
        if (paymentMethodInfo == null || (c2277d = paymentMethodInfo.card) == null || (str = c2277d.front_bank_code) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConfirmWrapper(View view) {
        super(view);
        C106862S5w.LIZ(view);
        MethodCollector.m14708i(477);
        LayoutInflater.from(this.mContext).inflate(LIZ(), (ViewGroup) view);
        MethodCollector.m14707o(477);
    }

    public ArrayList<PaymentMethodInfo> LIZIZ(C2278i c2278i) {
        String str;
        Object obj;
        Object obj2;
        C137147ccZ LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2278i}, this, LIZJ, false, 7);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<PaymentMethodInfo> arrayList = new ArrayList<>();
        if (c2278i != null && c2278i.data.paytype_items.size() != 0) {
            if (Intrinsics.areEqual(c2278i.data.default_ptcode, "bytepay")) {
                ArrayList<C2276ae> arrayList2 = c2278i.data.paytype_items;
                Intrinsics.checkNotNullExpressionValue(arrayList2, "");
                Iterator<T> it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((C2276ae) obj2).ptcode, "bytepay")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 == null || (LIZ = C2272a.LIZ()) == null) {
                    str = "";
                } else {
                    str = LIZ.paytype_info.default_pay_channel;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
            } else {
                str = c2278i.data.default_ptcode;
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            if (Intrinsics.areEqual(str, "")) {
                ArrayList<C2276ae> arrayList3 = c2278i.data.paytype_items;
                Intrinsics.checkNotNullExpressionValue(arrayList3, "");
                Iterator<T> it2 = arrayList3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((C2276ae) obj).status == 1) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C2276ae c2276ae = (C2276ae) obj;
                if (c2276ae == null) {
                    str = "";
                } else {
                    str = c2276ae.ptcode;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
            }
            C137156cci c137156cci = C137372cgC.LIZ;
            Context context = this.mContext;
            ArrayList<C2276ae> arrayList4 = c2278i.data.paytype_items;
            Intrinsics.checkNotNullExpressionValue(arrayList4, "");
            ArrayList<String> arrayList5 = c2278i.data.sorted_ptcodes;
            Intrinsics.checkNotNullExpressionValue(arrayList5, "");
            ArrayList<PaymentMethodInfo> LIZ2 = c137156cci.LIZ(context, arrayList4, arrayList5, str);
            if (C137372cgC.LIZ.LIZ()) {
                C2278i c2278i2 = C2272a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(c2278i2, "");
                if (c2278i2.getPayItemsShowNum() < LIZ2.size()) {
                    PaymentMethodInfo LIZ3 = C137372cgC.LIZ.LIZ(this.mContext);
                    C2278i c2278i3 = C2272a.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(c2278i3, "");
                    LIZ2.add(c2278i3.getPayItemsShowNum(), LIZ3);
                }
            }
            return LIZ2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r0 = r10.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r0.isCardAvailable() != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (p003X.C137372cgC.LIZ.LIZ(com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ) <= 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) p003X.C137372cgC.LIZ.LJI(com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ), (java.lang.CharSequence) "quickpay", false, 2, (java.lang.Object) null) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        r6 = p003X.C137372cgC.LIZ;
        r5 = com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ;
        r1 = com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r5}, r6, p003X.C137156cci.LIZ, false, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (r1.isSupported == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r0 = ((java.lang.Boolean) r1.result).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
        if (r0 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r5 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r0 = r5.data.paytype_items;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r9 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r9.hasNext() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
        r5 = (com.android.ttcjpaysdk.integrated.counter.data.C2276ae) r9.next();
        r2 = r5.ptcode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
        if (r2 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r2.hashCode() != 355422880) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (r2.equals("bytepay") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
        r0 = r5.paytype_item.paytype_info.pay_channels;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
        if (r2.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f3, code lost:
        r1 = (java.lang.String) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
        if (r1 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        if (r1.hashCode() != (-1066391653)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
        if (r1.equals("quickpay") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0107, code lost:
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5.paytype_item.paytype_info.quick_pay.enable_bind_card, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0116, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean LIZ(java.util.List<? extends com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo> r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.wrapper.BaseConfirmWrapper.LIZ(java.util.List):boolean");
    }

    public void LIZ(ArrayList<PaymentMethodInfo> arrayList, C2272a c2272a) {
        if (!PatchProxy.proxy(new Object[]{arrayList, c2272a}, this, LIZJ, false, 6).isSupported && arrayList != null) {
            for (PaymentMethodInfo paymentMethodInfo : arrayList) {
                if (paymentMethodInfo.isChecked) {
                    if (c2272a != null) {
                        c2272a.LJII = paymentMethodInfo;
                        c2272a.LJIIIIZZ = paymentMethodInfo;
                    }
                    C2272a.LIZ(paymentMethodInfo);
                }
            }
        }
    }

    public void LIZ(ArrayList<PaymentMethodInfo> arrayList, PaymentMethodInfo paymentMethodInfo, C2269a c2269a) {
        if (PatchProxy.proxy(new Object[]{arrayList, paymentMethodInfo, c2269a}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList, paymentMethodInfo);
        for (PaymentMethodInfo paymentMethodInfo2 : arrayList) {
            paymentMethodInfo2.isChecked = false;
            if (Intrinsics.areEqual(paymentMethodInfo2, paymentMethodInfo)) {
                paymentMethodInfo2.isChecked = true;
            }
        }
        if (c2269a != null) {
            c2269a.LIZ(arrayList);
        }
    }

    public ArrayList<PaymentMethodInfo> LIZ(Context context, C2278i c2278i, C2272a c2272a, ArrayList<PaymentMethodInfo> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, c2278i, c2272a, arrayList}, this, LIZJ, false, 8);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<PaymentMethodInfo> arrayList2 = new ArrayList<>();
        if (c2272a != null && c2278i != null && c2278i.data.paytype_items.size() != 0) {
            String str = c2272a.LJIIIIZZ.paymentType;
            C137156cci c137156cci = C137372cgC.LIZ;
            ArrayList<C2276ae> arrayList3 = c2278i.data.paytype_items;
            Intrinsics.checkNotNullExpressionValue(arrayList3, "");
            ArrayList<String> arrayList4 = c2278i.data.sorted_ptcodes;
            Intrinsics.checkNotNullExpressionValue(arrayList4, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            return c137156cci.LIZ(context, arrayList3, c2272a, arrayList4, str);
        }
        return arrayList2;
    }
}
