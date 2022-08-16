package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCircleCheckBox;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
import com.android.ttcjpaysdk.bindcard.quickbind.b$c;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2231c;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C123320YgE;
import p003X.C135401cAO;
import p003X.C135876cI3;
import p003X.C135903cIU;
import p003X.C135904cIV;
import p003X.C135905cIW;
import p003X.GOY;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardType2Activity */
/* loaded from: classes17.dex */
public final class SelectBankCardType2Activity extends BaseQuickBindView<C2231c, C2235c> implements b$c {
    public static ChangeQuickRedirect LIZ;
    public RelativeLayout LIZIZ;
    public RelativeLayout LIZJ;
    public CJPayCircleCheckBox LIZLLL;

    /* renamed from: LJ */
    public CJPayCircleCheckBox f25484LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public TextView LJIIIIZZ;
    public TextView LJIIIZ;
    public TextView LJIIJ;
    public ImageView LJIIJJI;
    public TextView LJIIL;
    public ImageView LJIILIIL;
    public TextView LJIILJJIL;
    public LoadingButton LJIILL;
    public LinearLayout LJIILLIIL;
    public C135401cAO LJIIZILJ;
    public boolean LJIJJ;
    public CJPayProtocolGroupContentsBean LJIJJLI;
    public CJPayProtocolGroupContentsBean LJIL;
    public HashMap LJJIFFI;
    public CJPayNameAndIdentifyCodeBillBean LJIJ = new CJPayNameAndIdentifyCodeBillBean();
    public String LJIJI = "DEBIT";
    public String LJJ = "";
    public String LJJI = "";

    static {
        Covode.recordClassIndex(7255);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 55).isSupported && (hashMap = this.LJJIFFI) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 54);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJIFFI == null) {
            this.LJJIFFI = new HashMap();
        }
        View view = (View) this.LJJIFFI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJIFFI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690544;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 60).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 59).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final String getSelectedBankCardType() {
        return this.LJIJI;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 49);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2229a();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        hideStyleLoading();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported) {
            return;
        }
        showStyleLoading();
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 52);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo())) {
                jSONObject.put("bind_card_info", new JSONObject(C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo()));
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(loadingButton, 0L, new SelectBankCardType2Activity$initActions$1(this), 1, null);
        RelativeLayout relativeLayout = this.LIZIZ;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(relativeLayout, 0L, new SelectBankCardType2Activity$initActions$2(this), 1, null);
        RelativeLayout relativeLayout2 = this.LIZJ;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(relativeLayout2, 0L, new SelectBankCardType2Activity$initActions$3(this), 1, null);
        TextView textView = this.LJIIIZ;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (textView.getVisibility() == 0 && C135876cI3.LIZ() != null) {
            C123320YgE.LIZ(textView, 0L, new SelectBankCardType2Activity$initActions$$inlined$let$lambda$1(textView, this), 1, null);
        }
        C135401cAO c135401cAO = this.LJIIZILJ;
        if (c135401cAO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135401cAO.LIZJ = new C135905cIW(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        this.LJJ = C135904cIV.LIZIZ.LIZ(this.quickBindData);
        this.LJJI = C135904cIV.LIZIZ.LIZIZ(this.quickBindData);
        QuickBindCardAdapterBean quickBindCardAdapterBean = this.quickBindData;
        String str = this.quickBindData.bankName;
        if (str == null || str.length() == 0 || str == null) {
            str = getResources().getString(2131561506);
        }
        quickBindCardAdapterBean.bankName = str;
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            String str2 = this.quickBindData.bank_rank;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String str3 = this.quickBindData.rank_type;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            HashMap<String, CJPayVoucherInfo> hashMap = this.quickBindData.voucher_info_map;
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            c135903cIU.LIZ(str2, str3, hashMap);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 63).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 62).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 65).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_order_type", "one_key_sign");
        String str = this.quickBindData.bankCode;
        Intrinsics.checkNotNullExpressionValue(str, "");
        hashMap.put("bank_code", str);
        hashMap.put("card_type", this.LJIJI);
        C2231c c2231c = (C2231c) this.mBasePresenter;
        if (c2231c != null) {
            c2231c.LIZ(hashMap, Intrinsics.areEqual("DEBIT", this.LJIJI));
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(findViewById(2131165242), "");
        View findViewById = findViewById(2131188088);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(2131188087);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (RelativeLayout) findViewById2;
        View findViewById3 = findViewById(2131169790);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (CJPayCircleCheckBox) findViewById3;
        View findViewById4 = findViewById(2131169774);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f25484LJ = (CJPayCircleCheckBox) findViewById4;
        View findViewById5 = findViewById(2131193894);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = (TextView) findViewById5;
        View findViewById6 = findViewById(2131193895);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (TextView) findViewById6;
        View findViewById7 = findViewById(2131193871);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = (TextView) findViewById7;
        View findViewById8 = findViewById(2131193872);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIIIIZZ = (TextView) findViewById8;
        View findViewById9 = findViewById(2131169882);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIIZ = (TextView) findViewById9;
        View findViewById10 = findViewById(2131180130);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIJ = (TextView) findViewById10;
        View findViewById11 = findViewById(2131170054);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJIIJJI = (ImageView) findViewById11;
        View findViewById12 = findViewById(2131195213);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.LJIIL = (TextView) findViewById12;
        View findViewById13 = findViewById(2131178601);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.LJIILIIL = (ImageView) findViewById13;
        View findViewById14 = findViewById(2131193580);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJIILJJIL = (TextView) findViewById14;
        View findViewById15 = findViewById(2131189202);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "");
        this.LJIILL = (LoadingButton) findViewById15;
        View findViewById16 = findViewById(2131169639);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "");
        this.LJIILLIIL = (LinearLayout) findViewById16;
        LinearLayout linearLayout = this.LJIILLIIL;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIIZILJ = new C135401cAO(linearLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f5  */
    @Override // p003X.AbstractActivityC135987cJq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void initViews() {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SelectBankCardType2Activity.initViews():void");
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIJI = str;
    }

    private final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 50).isSupported) {
            return;
        }
        if (z) {
            CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean = this.LJIJJLI;
            if (cJPayProtocolGroupContentsBean != null) {
                C135401cAO c135401cAO = this.LJIIZILJ;
                if (c135401cAO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135401cAO.LIZ(cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, this.LJIJJ);
                return;
            }
            LIZ();
            return;
        }
        CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean2 = this.LJIL;
        if (cJPayProtocolGroupContentsBean2 != null) {
            C135401cAO c135401cAO2 = this.LJIIZILJ;
            if (c135401cAO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c135401cAO2.LIZ(cJPayProtocolGroupContentsBean2.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean2.guide_message, this.LJIJJ);
            return;
        }
        LIZ();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 56).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 58).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 57).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$c
    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean, boolean z) {
        if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 44).isSupported && cJPayProtocolGroupContentsBean != null && cJPayProtocolGroupContentsBean.protocol_list.size() > 0 && 1 != 0) {
            if (z) {
                this.LJIJJLI = cJPayProtocolGroupContentsBean;
            } else {
                this.LJIL = cJPayProtocolGroupContentsBean;
            }
            this.LJIJJ = cJPayProtocolGroupContentsBean.isNeedCheckBox();
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                if (Intrinsics.areEqual("DEBIT", this.LJIJI)) {
                    valueOf.booleanValue();
                    LIZ(true);
                    return;
                }
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            if (!valueOf2.booleanValue()) {
                valueOf2.booleanValue();
                if (Intrinsics.areEqual("CREDIT", this.LJIJI)) {
                    valueOf2.booleanValue();
                    LIZ(false);
                }
            }
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 53).isSupported) {
            return;
        }
        CJPayCircleCheckBox cJPayCircleCheckBox = this.LIZLLL;
        if (cJPayCircleCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox.setChecked(z);
        CJPayCircleCheckBox cJPayCircleCheckBox2 = this.f25484LJ;
        if (cJPayCircleCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox2.setChecked(z2);
        RelativeLayout relativeLayout = this.LIZIZ;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int i2 = 2130840461;
        if (z) {
            i = 2130840461;
        } else {
            i = 2130840462;
        }
        relativeLayout.setBackgroundResource(i);
        RelativeLayout relativeLayout2 = this.LIZJ;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!z2) {
            i2 = 2130840462;
        }
        relativeLayout2.setBackgroundResource(i2);
    }
}
