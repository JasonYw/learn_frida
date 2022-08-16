package com.android.ttcjpaysdk.thirdparty.front.cardlist.p171d;

import android.text.TextUtils;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p169b.C2364a;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p170c.C2365a;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p172f.AbstractC2367a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p002O.C0002O;
import p003X.C135543cCg;
import p003X.C136320cPD;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.cardlist.d.a */
/* loaded from: classes17.dex */
public final class C2366a extends C135543cCg<C2365a, AbstractC2367a> {
    public static ChangeQuickRedirect LIZ;
    public static C2342n LJFF;
    public int LIZIZ;
    public String LIZJ;
    public ArrayList<String> LIZLLL;

    /* renamed from: LJ */
    public C2364a f25528LJ;

    static {
        Covode.recordClassIndex(8503);
    }

    public final boolean LIZ() {
        int i = this.LIZIZ;
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.android.ttcjpaysdk.thirdparty.front.cardlist.f.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.android.ttcjpaysdk.thirdparty.front.cardlist.b.a] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    public final void LIZIZ() {
        C2342n c2342n;
        int size;
        C2364a c2364a;
        ?? c2364a2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported || (c2342n = LJFF) == null) {
            return;
        }
        CJPayPayTypeInfo cJPayPayTypeInfo = c2342n.paytype_info;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (cJPayPayTypeInfo.quick_pay.cards.size() > 0) {
            for (int i = 0; i < cJPayPayTypeInfo.quick_pay.cards.size(); i++) {
                C2364a LIZ2 = LIZ(cJPayPayTypeInfo, cJPayPayTypeInfo.quick_pay.cards.get(i), false, true);
                if (LIZ2.LIZIZ()) {
                    arrayList.add(LIZ2);
                } else {
                    arrayList2.add(LIZ2);
                }
            }
        }
        if (cJPayPayTypeInfo.quick_pay.discount_banks.size() > 0) {
            for (int i2 = 0; i2 < cJPayPayTypeInfo.quick_pay.discount_banks.size(); i2++) {
                CJPayCard cJPayCard = cJPayPayTypeInfo.quick_pay.discount_banks.get(i2);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCard}, this, LIZ, false, 5);
                if (proxy.isSupported) {
                    c2364a2 = proxy.result;
                } else {
                    c2364a2 = new C2364a();
                    c2364a2.LIZIZ = cJPayCard.icon_url;
                    c2364a2.LIZJ = cJPayCard.status;
                    c2364a2.LIZLLL = "";
                    if (!TextUtils.isEmpty(cJPayCard.bank_name)) {
                        new StringBuilder();
                        c2364a2.LIZLLL = C0002O.m25086C(c2364a2.LIZLLL, cJPayCard.bank_name);
                    }
                    if (!TextUtils.isEmpty(cJPayCard.card_type_name)) {
                        new StringBuilder();
                        c2364a2.LIZLLL = C0002O.m25086C(c2364a2.LIZLLL, cJPayCard.card_type_name);
                    }
                    c2364a2.f25527LJ = cJPayCard.msg;
                    c2364a2.LJIJJLI = C136320cPD.LIZ(cJPayCard, 4);
                    if (c2364a2.LJIJJLI != null && !TextUtils.isEmpty(c2364a2.LJIJJLI.label)) {
                        c2364a2.LJFF = c2364a2.LJIJJLI.label;
                    }
                    c2364a2.LJIIJ = false;
                    c2364a2.LJIIJJI = "addspecificcard";
                }
                arrayList.add(c2364a2);
            }
        }
        C2342n c2342n2 = LJFF;
        if (c2342n2 != null && "1".equals(c2342n2.paytype_info.quick_pay.enable_bind_card)) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            if (proxy2.isSupported) {
                c2364a = proxy2.result;
            } else {
                C2364a c2364a3 = new C2364a();
                int i3 = this.LIZIZ;
                if (i3 != 4 && i3 != 5) {
                    if (getContext() != null) {
                        c2364a3.LIZLLL = getContext().getResources().getString(2131561457);
                    }
                } else if (getContext() != null) {
                    c2364a3.LIZLLL = getContext().getResources().getString(2131561458);
                }
                c2364a3.LIZJ = "1";
                C2342n c2342n3 = LJFF;
                if (c2342n3 != null) {
                    c2364a3.f25527LJ = c2342n3.paytype_info.quick_pay.discount_bind_card_msg;
                }
                c2364a3.LJIJJLI = C136320cPD.LIZ(null, 3);
                if (c2364a3.LJIJJLI != null && !TextUtils.isEmpty(c2364a3.LJIJJLI.label)) {
                    c2364a3.LJFF = c2364a3.LJIJJLI.label;
                }
                c2364a3.LJIIJ = false;
                c2364a3.LJIIJJI = "addnormalcard";
                c2364a = c2364a3;
            }
            arrayList.add(c2364a);
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy3.isSupported) {
            size = ((Integer) proxy3.result).intValue();
        } else {
            ArrayList<String> arrayList3 = this.LIZLLL;
            if (arrayList3 == null) {
                size = 0;
            } else {
                size = arrayList3.size();
            }
        }
        Object[] objArr = new C2364a[size + 1];
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if (LIZIZ(((C2364a) arrayList.get(i4)).LJII) >= 0) {
                objArr[LIZIZ(((C2364a) arrayList.get(i4)).LJII) + 1] = arrayList.get(i4);
                arrayList.remove(i4);
            } else if ("balance".equals(((C2364a) arrayList.get(i4)).LJIIJJI) && !((C2364a) arrayList.get(i4)).LIZIZ()) {
                objArr[0] = arrayList.get(i4);
                arrayList.remove(i4);
            } else {
                i4++;
            }
        }
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                arrayList.add(objArr[i5]);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.addAll(arrayList2);
        }
        if (this.mView != null) {
            ((AbstractC2367a) this.mView).LIZ(arrayList);
        }
    }

    public final int LIZIZ(String str) {
        ArrayList<String> arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || (arrayList = this.LIZLLL) == null || arrayList.size() == 0 || !this.LIZLLL.contains(str)) {
            return -1;
        }
        return this.LIZLLL.indexOf(str);
    }

    public final C2364a LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2364a) proxy.result;
        }
        C2364a c2364a = null;
        if (LJFF == null) {
            return null;
        }
        this.LIZJ = "quickpay";
        if ("quickpay".equals(this.LIZJ) && LJFF.paytype_info.quick_pay.cards.size() > 0) {
            CJPayCard cJPayCard = LJFF.paytype_info.quick_pay.cards.get(0);
            for (int i = 0; i < LJFF.paytype_info.quick_pay.cards.size(); i++) {
                CJPayCard cJPayCard2 = LJFF.paytype_info.quick_pay.cards.get(i);
                if (cJPayCard2.bank_card_id.equals(str)) {
                    cJPayCard = cJPayCard2;
                }
            }
            c2364a = LIZ(LJFF.paytype_info, cJPayCard, true, false);
        }
        this.f25528LJ = c2364a;
        if (c2364a != null) {
            this.LIZJ = c2364a.LJIIJJI;
        }
        return c2364a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        if (r4.LIZ() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0171, code lost:
        if ("balance".equals(r11.LIZJ) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.android.ttcjpaysdk.thirdparty.front.cardlist.p169b.C2364a LIZ(com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo r12, com.android.ttcjpaysdk.thirdparty.data.CJPayCard r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.cardlist.p171d.C2366a.LIZ(com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo, com.android.ttcjpaysdk.thirdparty.data.CJPayCard, boolean, boolean):com.android.ttcjpaysdk.thirdparty.front.cardlist.b.a");
    }
}
