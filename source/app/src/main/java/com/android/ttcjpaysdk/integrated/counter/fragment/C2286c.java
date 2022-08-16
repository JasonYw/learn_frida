package com.android.ttcjpaysdk.integrated.counter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.C2176e;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.theme.widget.CJPayLightTextView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.integrated.counter.b$a;
import com.android.ttcjpaysdk.integrated.counter.data.C2279k;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.data.TradeQueryBean;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.android.ttcjpaysdk.integrated.counter.p158e.C2282b;
import com.android.ttcjpaysdk.integrated.counter.wrapper.AbstractC2287b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC136089cLU;
import p003X.AbstractC137223cdn;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C137132ccK;
import p003X.C137155cch;
import p003X.C137160ccm;
import p003X.C137195cdL;
import p003X.C137356cfw;
import p003X.C137370cgA;
import p003X.C137372cgC;
import p003X.C137390cgU;
import p003X.RunnableC137196cdM;
import p003X.RunnableC137215cdf;
import p003X.View$OnClickListenerC137341cfh;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.fragment.c */
/* loaded from: classes17.dex */
public final class C2286c extends AbstractC136089cLU<C2282b> implements b$a {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2287b LIZIZ;

    /* renamed from: LJ */
    public ExtendRecyclerView f25503LJ;
    public C137195cdL LJFF;
    public ArrayList<PaymentMethodInfo> LJIIJ = new ArrayList<>();
    public AbstractC137223cdn LJIIJJI;
    public int LJIIL;
    public View LJIILIIL;
    public CJPayLightTextView LJIILJJIL;
    public ImageView LJIILL;
    public TextView LJIILLIIL;
    public HashMap LJIIZILJ;

    static {
        Covode.recordClassIndex(7760);
    }

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported && (hashMap = this.LJIIZILJ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZ(TradeQueryBean tradeQueryBean) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690620;
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZIZ(String str) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    @Override // p003X.AbstractC136089cLU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LJFF() {
        AbstractC2287b abstractC2287b = this.LIZIZ;
        if (abstractC2287b != null) {
            return abstractC2287b.LIZLLL;
        }
        return 0;
    }

    private final void LJIIJJI() {
        ExtendRecyclerView extendRecyclerView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (extendRecyclerView = this.f25503LJ) != null) {
            extendRecyclerView.post(new RunnableC137196cdM(this));
        }
    }

    @Override // p003X.AbstractC136022cKP
    public final C2124b LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2274a();
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC137215cdf(this), 500L);
    }

    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (PaymentMethodInfo paymentMethodInfo : this.LJIIJ) {
            if (C137372cgC.LIZ.LIZ(paymentMethodInfo) && !TextUtils.isEmpty(paymentMethodInfo.voucher_info.vouchers_label)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r0 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LJIIL() {
        /*
            r4 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.integrated.counter.fragment.C2286c.LIZ
            r0 = 13
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            java.util.ArrayList<com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo> r0 = r4.LJIIJ
            r0.clear()
            com.android.ttcjpaysdk.integrated.counter.wrapper.b r1 = r4.LIZIZ
            if (r1 == 0) goto L23
            X.cdn r0 = r4.LJIIJJI
            if (r0 == 0) goto L68
            boolean r0 = r0.LJFF()
        L21:
            r1.f25505LJ = r0
        L23:
            com.android.ttcjpaysdk.integrated.counter.wrapper.b r1 = r4.LIZIZ
            if (r1 == 0) goto L31
            X.cdn r0 = r4.LJIIJJI
            if (r0 == 0) goto L2f
            boolean r3 = r0.LIZLLL()
        L2f:
            r1.LJFF = r3
        L31:
            com.android.ttcjpaysdk.integrated.counter.wrapper.b r1 = r4.LIZIZ
            if (r1 == 0) goto L44
            X.cdn r0 = r4.LJIIJJI
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.mo21703LJ()
            if (r0 != 0) goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            r1.LIZ(r0)
        L44:
            java.util.ArrayList<com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo> r3 = r4.LJIIJ
            com.android.ttcjpaysdk.integrated.counter.wrapper.b r2 = r4.LIZIZ
            if (r2 == 0) goto L5f
            com.android.ttcjpaysdk.integrated.counter.data.i r1 = com.android.ttcjpaysdk.integrated.counter.p154b.C2272a.LIZIZ
            com.android.ttcjpaysdk.integrated.counter.b.a r0 = r4.LJJIIZI
            if (r0 == 0) goto L54
            com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r0 = r0.LJII
            if (r0 != 0) goto L59
        L54:
            com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r0 = new com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo
            r0.<init>()
        L59:
            java.util.ArrayList r0 = r2.LIZ(r1, r0)
            if (r0 != 0) goto L64
        L5f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L64:
            r3.addAll(r0)
            return
        L68:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2286c.LJIIL():void");
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        AbstractC2287b abstractC2287b;
        C2176e c2176e;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        AbstractC2287b abstractC2287b2 = this.LIZIZ;
        if (abstractC2287b2 != null) {
            abstractC2287b2.LIZ(C2272a.LIZIZ);
        }
        LJIIL();
        C137195cdL c137195cdL = this.LJFF;
        if (c137195cdL != null) {
            c137195cdL.LIZ(this.LJIIJ);
        }
        LJIIJJI();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (abstractC2287b = this.LIZIZ) != null) {
            ArrayList<PaymentMethodInfo> arrayList = this.LJIIJ;
            AbstractC137223cdn abstractC137223cdn = this.LJIIJJI;
            if (abstractC137223cdn != null) {
                c2176e = abstractC137223cdn.LJIIIIZZ();
            } else {
                c2176e = null;
            }
            abstractC2287b.LIZ(arrayList, c2176e);
        }
    }

    public final void LJIIIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        int i = -1;
        int i2 = 0;
        for (Object obj : this.LJIIJ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) obj;
            if (paymentMethodInfo.isUnionPay()) {
                Context context = getContext();
                if (context != null) {
                    str = context.getString(2131561787);
                } else {
                    str = null;
                }
                paymentMethodInfo.disableUnionPayBindCard(str);
                i = i2;
            }
            i2 = i3;
        }
        if (i != -1) {
            ArrayList<PaymentMethodInfo> arrayList = this.LJIIJ;
            arrayList.add(arrayList.remove(i));
            C137195cdL c137195cdL = this.LJFF;
            if (c137195cdL != null) {
                c137195cdL.LIZ(this.LJIIJ);
            }
        }
    }

    public final void LIZ(int i) {
        AbstractC2287b abstractC2287b = this.LIZIZ;
        if (abstractC2287b != null) {
            abstractC2287b.LIZLLL = i;
        }
    }

    public final void LIZ(PaymentMethodInfo paymentMethodInfo) {
        if (PatchProxy.proxy(new Object[]{paymentMethodInfo}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(paymentMethodInfo);
        for (PaymentMethodInfo paymentMethodInfo2 : this.LJIIJ) {
            paymentMethodInfo2.isShowLoading = false;
            if (Intrinsics.areEqual(paymentMethodInfo2, paymentMethodInfo)) {
                paymentMethodInfo2.isShowLoading = true;
            }
        }
        C137195cdL c137195cdL = this.LJFF;
        if (c137195cdL != null) {
            c137195cdL.LIZ(this.LJIIJ);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 6).isSupported) {
            return;
        }
        AbstractC2287b abstractC2287b = this.LIZIZ;
        if (abstractC2287b != null) {
            abstractC2287b.LIZ();
        }
        C137195cdL c137195cdL = this.LJFF;
        if (c137195cdL != null) {
            c137195cdL.LIZIZ = new C137160ccm(this);
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    /* renamed from: b_ */
    public final void mo16048b_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 24).isSupported) {
            return;
        }
        LJIIIIZZ();
        if (getContext() != null) {
            CJPayBasicUtils.displayToastInternal(getActivity(), getResources().getString(2131558456), 0);
        }
    }

    public final void LIZIZ(PaymentMethodInfo paymentMethodInfo) {
        if (PatchProxy.proxy(new Object[]{paymentMethodInfo}, this, LIZ, false, 9).isSupported) {
            return;
        }
        for (PaymentMethodInfo paymentMethodInfo2 : this.LJIIJ) {
            paymentMethodInfo2.isChecked = false;
            if (Intrinsics.areEqual(paymentMethodInfo2, paymentMethodInfo)) {
                paymentMethodInfo2.isChecked = true;
            }
        }
        C137195cdL c137195cdL = this.LJFF;
        if (c137195cdL != null) {
            c137195cdL.LIZ(this.LJIIJ);
        }
    }

    @Override // com.android.ttcjpaysdk.integrated.counter.b$a
    public final void LIZ(C2279k c2279k) {
        JSONObject jSONObject;
        if (!PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 21).isSupported && c2279k != null) {
            if (c2279k.isResponseOk()) {
                if (!PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 22).isSupported) {
                    C2272a.f25499LJ = c2279k;
                    c2279k.data.pay_params.channel_data = (C137132ccK) CJPayJsonParser.fromJson(new JSONObject(C2272a.f25499LJ.data.pay_params.data), C137132ccK.class);
                    AbstractC137223cdn abstractC137223cdn = this.LJIIJJI;
                    if (abstractC137223cdn != null) {
                        abstractC137223cdn.LIZIZ();
                    }
                    try {
                        jSONObject = new JSONObject(C2272a.f25499LJ.data.pay_params.data);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                    AbstractC137223cdn abstractC137223cdn2 = this.LJIIJJI;
                    if (abstractC137223cdn2 != null) {
                        abstractC137223cdn2.LIZ(jSONObject);
                    }
                }
            } else if (!PatchProxy.proxy(new Object[]{c2279k}, this, LIZ, false, 23).isSupported) {
                LJIIIIZZ();
                String str = c2279k.error.type;
                if (str != null && str.hashCode() == -1483538319 && str.equals("single_btn_box")) {
                    String str2 = c2279k.error.type_cnt;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    if (str2.length() != 0) {
                        C137390cgU c137390cgU = (C137390cgU) CJPayJsonParser.fromJson(c2279k.error.type_cnt, C137390cgU.class);
                        if (c137390cgU != null) {
                            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(getActivity());
                            defaultBuilder.setTitle(c137390cgU.body_text);
                            defaultBuilder.setSingleBtnStr(c137390cgU.btn_text);
                            defaultBuilder.setSingleBtnListener(new View$OnClickListenerC137341cfh(this));
                            defaultBuilder.setWidth(270);
                            C116971W2r.LIZJ(CJPayDialogUtils.initDialog(defaultBuilder));
                            return;
                        }
                        return;
                    }
                }
                CJPayBasicUtils.displayToast(getContext(), c2279k.error.msg);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        View view;
        ExtendRecyclerView extendRecyclerView;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (z) {
            C2272a c2272a = this.LJJIIZI;
            if (c2272a != null) {
                c2272a.LJIILL = true;
            }
            ExtendRecyclerView extendRecyclerView2 = this.f25503LJ;
            if (extendRecyclerView2 != null && extendRecyclerView2.getHeaderViewsCount() > 0 && (view = this.LJIILIIL) != null && (extendRecyclerView = this.f25503LJ) != null) {
                Intrinsics.checkNotNull(view);
                extendRecyclerView.LIZIZ(view);
            }
        }
        AbstractC2287b abstractC2287b = this.LIZIZ;
        if (abstractC2287b != null) {
            abstractC2287b.LIZ(C2272a.LIZIZ);
        }
        LJIIL();
        C137195cdL c137195cdL = this.LJFF;
        if (c137195cdL != null) {
            c137195cdL.LIZ(this.LJIIJ);
        }
        LJIIJJI();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(11:7|8|12|13|(7:15|(2:17|(2:19|20))(2:31|(2:33|22))|23|(1:25)(1:30)|26|27|28)|34|23|(0)(0)|26|27|28)|47|12|13|(0)|34|23|(0)(0)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (r2.equals("addnormalcard") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
        if (r1.equals("addspecificcard") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0058, code lost:
        r1 = "添加银行卡";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
        if (r1.equals("addnormalcard") != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:13:0x005a, B:15:0x0063, B:20:0x007c, B:23:0x0084, B:25:0x0091, B:26:0x0095, B:31:0x0072, B:34:0x0079), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:13:0x005a, B:15:0x0063, B:20:0x007c, B:23:0x0084, B:25:0x0091, B:26:0x0095, B:31:0x0072, B:34:0x0079), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ(com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.integrated.counter.fragment.C2286c.LIZ
            r0 = 18
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r1 = r7.paymentType
            java.lang.String r4 = "addnormalcard"
            java.lang.String r5 = "addspecificcard"
            if (r1 == 0) goto L27
            int r0 = r1.hashCode()
            switch(r0) {
                case -1066391653: goto L2a;
                case -339185956: goto L35;
                case 674559759: goto L40;
                case 707136099: goto L4b;
                case 1066291160: goto L52;
                default: goto L27;
            }
        L27:
            java.lang.String r1 = ""
            goto L5a
        L2a:
            java.lang.String r0 = "quickpay"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = "银行卡"
            goto L5a
        L35:
            java.lang.String r0 = "balance"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = "余额"
            goto L5a
        L40:
            java.lang.String r0 = "creditpay"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = "信用支付"
            goto L5a
        L4b:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L27
            goto L58
        L52:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L27
        L58:
            java.lang.String r1 = "添加银行卡"
        L5a:
            java.lang.String r0 = "icon_name"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r7.paymentType     // Catch: java.lang.Exception -> L9f
            if (r2 == 0) goto L79
            int r1 = r2.hashCode()     // Catch: java.lang.Exception -> L9f
            r0 = 707136099(0x2a260a63, float:1.4747365E-13)
            if (r1 == r0) goto L72
            r0 = 1066291160(0x3f8e4fd8, float:1.1118116)
            if (r1 != r0) goto L79
            goto L7c
        L72:
            boolean r0 = r2.equals(r5)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L79
            goto L82
        L79:
            java.lang.String r1 = r7.paymentType     // Catch: java.lang.Exception -> L9f
            goto L84
        L7c:
            boolean r0 = r2.equals(r4)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L79
        L82:
            java.lang.String r1 = "addcard"
        L84:
            java.lang.String r0 = "method"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = "activity_info"
            X.cch r1 = p003X.C137370cgA.LIZ     // Catch: java.lang.Exception -> L9f
            com.android.ttcjpaysdk.integrated.counter.wrapper.b r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.LIZ(r7)     // Catch: java.lang.Exception -> L9f
        L95:
            org.json.JSONArray r0 = r1.LIZ(r7, r0)     // Catch: java.lang.Exception -> L9f
            r3.put(r2, r0)     // Catch: java.lang.Exception -> L9f
            goto L9f
        L9d:
            r0 = 0
            goto L95
        L9f:
            X.cc9 r1 = p003X.C137356cfw.LIZIZ
            java.lang.String r0 = "wallet_cashier_method_page_click"
            r1.LIZ(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2286c.LIZJ(com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0225, code lost:
        if (r0 == null) goto L175;
     */
    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.fragment.C2286c.LIZ(android.view.View):void");
    }

    public final void LIZ(String str, PaymentMethodInfo paymentMethodInfo) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str, paymentMethodInfo}, this, LIZ, false, 16).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", str);
            jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "addcard");
            C137155cch c137155cch = C137370cgA.LIZ;
            AbstractC2287b abstractC2287b = this.LIZIZ;
            if (abstractC2287b != null) {
                str2 = abstractC2287b.LIZ(paymentMethodInfo);
            } else {
                str2 = null;
            }
            jSONObject.put("activity_info", c137155cch.LIZ(paymentMethodInfo, str2));
            jSONObject.put("addcard_info", paymentMethodInfo.title);
        } catch (Exception unused) {
        }
        C137356cfw.LIZIZ.LIZ("wallet_cashier_add_newcard_click", jSONObject);
    }
}
