package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.base.view.LabelEditText;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e;
import com.android.ttcjpaysdk.bindcard.quickbind.b$e;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2233e;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C123320YgE;
import p003X.C135100c5X;
import p003X.C135401cAO;
import p003X.C135565cD2;
import p003X.C135849cHc;
import p003X.C135864cHr;
import p003X.C135876cI3;
import p003X.C135894cIL;
import p003X.C135896cIN;
import p003X.C135898cIP;
import p003X.C135996cJz;
import p003X.C136011cKE;
import p003X.C136215cNW;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC135887cIE;
import p003X.RunnableC135902cIT;
import p003X.View$OnClickListenerC135900cIR;
import p003X.View$OnFocusChangeListenerC135890cIH;
import p003X.View$OnFocusChangeListenerC135892cIJ;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuthActivity */
/* loaded from: classes17.dex */
public final class TwoElementAuthActivity extends AbstractActivityC135987cJq<C2233e, C2237e> implements b$e {
    public static ChangeQuickRedirect LIZ;
    public LabelEditText LIZIZ;
    public LabelEditText LIZJ;
    public LinearLayout LIZLLL;

    /* renamed from: LJ */
    public C135401cAO f25488LJ;
    public DialogC137460chc LJI;
    public ICJPayRealNameAuthService LJII;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public CJPayProtocolGroupContentsBean LJIILIIL;
    public TextView LJIILJJIL;
    public LoadingButton LJIILL;
    public TextView LJIILLIIL;
    public String LJIIZILJ;
    public HashMap LJIJ;
    public CJPayHostInfo LJFF = new CJPayHostInfo();
    public QuickBindCardAdapterBean LJIIIIZZ = new QuickBindCardAdapterBean();
    public CJPayNameAndIdentifyCodeBillBean LJIIIZ = new CJPayNameAndIdentifyCodeBillBean();

    static {
        Covode.recordClassIndex(7290);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported && (hashMap = this.LJIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 33);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIJ == null) {
            this.LJIJ = new HashMap();
        }
        View view = (View) this.LJIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690566;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LabelEditText labelEditText = this.LIZJ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return CJPayIdUtils.isMainLandIdValid(labelEditText.getText().toString());
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135565cD2.class};
    }

    private final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        disablePageClickEvent(false);
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZIZ();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2229a();
    }

    /* renamed from: LJ */
    private final boolean m16054LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LabelEditText labelEditText = this.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Editable text = labelEditText.getText();
        if (text == null || text.length() <= 0) {
            return false;
        }
        return true;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        disablePageClickEvent(true);
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZ();
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        LabelEditText labelEditText = this.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        labelEditText.LIZLLL();
        LabelEditText labelEditText2 = this.LIZJ;
        if (labelEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        labelEditText2.LIZLLL();
        new Handler().post(new RunnableC135902cIT(this));
    }

    public final void LIZIZ() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (LIZ() && m16054LJ()) {
            z = true;
        }
        loadingButton.setEnabled(z);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(loadingButton, 0L, new TwoElementAuthActivity$initActions$1(this), 1, null);
        TextView textView = this.LJIILLIIL;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(textView, 0L, new TwoElementAuthActivity$initActions$2(this), 1, null);
        C135401cAO c135401cAO = this.f25488LJ;
        if (c135401cAO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135401cAO.LIZJ = new C135894cIL(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJFF = C135876cI3.f17973LJ.LJIIIIZZ();
        C2237e c2237e = this.mvpLogger;
        if (c2237e != null) {
            HashMap<String, CJPayVoucherInfo> hashMap = this.LJIIIIZZ.voucher_info_map;
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            String str = this.LJIIIIZZ.cardType;
            Intrinsics.checkNotNullExpressionValue(str, "");
            if (!PatchProxy.proxy(new Object[]{c2237e, hashMap, str, null, 4, null}, null, C2237e.f25483LJ, true, 2).isSupported) {
                c2237e.LIZ(hashMap, str, "");
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
        C2233e c2233e;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (c2233e = (C2233e) this.mBasePresenter) != null && !PatchProxy.proxy(new Object[0], c2233e, C2233e.LIZ, false, 1).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("biz_order_type", "verify_identity_info");
            hashMap.put("bank_code", "");
            hashMap.put("card_type", "");
            C2229a c2229a = (C2229a) c2233e.mModel;
            if (c2229a != null) {
                c2229a.LIZJ(hashMap, new C135898cIP(c2233e));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        TwoElementAuthActivity twoElementAuthActivity;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onBackPressed();
        if (this.LJIIJJI) {
            EventManager.INSTANCE.notifyNow(new C136215cNW(CJPayQuickBindCardUtils.LIZJ()));
            EventManager.INSTANCE.notify(new C135565cD2());
            if (C135876cI3.f17973LJ.LJIILIIL().isIndependentBindCard()) {
                twoElementAuthActivity = this;
            } else {
                twoElementAuthActivity = null;
            }
            if (twoElementAuthActivity != null) {
                C2118a.LIZ().LIZ(4100).LIZIZ();
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 42).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 41).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
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

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(findViewById(2131169647), "");
        View findViewById = findViewById(2131195213);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIILJJIL = (TextView) findViewById;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131180130), "");
        View findViewById2 = findViewById(2131196523);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIILL = (LoadingButton) findViewById2;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131175311), "");
        View findViewById3 = findViewById(2131169921);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJIILLIIL = (TextView) findViewById3;
        View findViewById4 = findViewById(2131183713);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZIZ = (LabelEditText) findViewById4;
        View findViewById5 = findViewById(2131177117);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LIZJ = (LabelEditText) findViewById5;
        View findViewById6 = findViewById(2131181492);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LIZLLL = (LinearLayout) findViewById6;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.f25488LJ = new C135401cAO(linearLayout);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        String str;
        boolean z;
        String string;
        int indexOf$default;
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        String str2 = null;
        AbstractActivityC135987cJq.setTitleText$default(this, "", 0, 2, null);
        String str3 = this.LJIIIIZZ.bankName;
        String str4 = this.LJIIIZ.sign_card_map.protocol_description;
        if (!PatchProxy.proxy(new Object[]{str3, str4}, this, LIZ, false, 16).isSupported && ((str3 != null && str3.length() != 0) || (str4 != null && str4.length() != 0))) {
            if (str4 != null && str4.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Intrinsics.checkNotNull(str4);
                StringBuilder sb = new StringBuilder();
                int length = str4.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str4.charAt(i2);
                    if ('$' != charAt) {
                        sb.append(charAt);
                    }
                }
                string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
            } else {
                string = getString(2131562000, new Object[]{str3});
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{string}, this, LIZ, false, 17);
            if (proxy.isSupported) {
                indexOf$default = ((Integer) proxy.result).intValue();
            } else {
                String str5 = CJPayHostInfo.languageTypeStr;
                if (!TextUtils.isEmpty(str5) && Intrinsics.areEqual(AdvanceSetting.CLEAR_NOTIFICATION, str5)) {
                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, "，", 0, false, 6, (Object) null);
                } else {
                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, Constants.ACCEPT_TIME_SEPARATOR_SP, 0, false, 6, (Object) null);
                }
            }
            if (str4 != null && str4.length() != 0 && 0 == 0) {
                Intrinsics.checkNotNull(str4);
                int length2 = str4.length();
                i = 0;
                while (true) {
                    if (i < length2) {
                        if ('$' == str4.charAt(i)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                int length3 = str4.length() - 1;
                while (true) {
                    if (length3 < 0) {
                        break;
                    } else if ('$' != str4.charAt(length3)) {
                        length3--;
                    } else if (i != -1 && length3 - i > 1) {
                        String substring = str4.substring(i + 1, length3);
                        Intrinsics.checkNotNullExpressionValue(substring, "");
                        if (!StringsKt__StringsKt.contains$default((CharSequence) substring, '$', false, 2, (Object) null)) {
                            indexOf$default = length3 - 1;
                        }
                    }
                }
                indexOf$default = -1;
                i = -1;
            } else {
                i = 0;
            }
            TextView textView = this.LJIILJJIL;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(C135100c5X.LIZ(string, i, indexOf$default));
        }
        String str6 = this.LJIIIZ.sign_card_map.button_description;
        if (str6 != null && str6.length() != 0) {
            str2 = this.LJIIIZ.sign_card_map.button_description;
        } else {
            Resources resources = getResources();
            if (resources != null) {
                str2 = resources.getString(2131561464);
            }
        }
        if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 18).isSupported && str2 != null) {
            if (Intrinsics.areEqual(str2, "")) {
                str = this.LJIIZILJ;
            } else {
                str = str2;
            }
            this.LJIIZILJ = str;
            LoadingButton loadingButton = this.LJIILL;
            if (loadingButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            loadingButton.setButtonText(str2);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            LabelEditText labelEditText = this.LIZIZ;
            if (labelEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText.LJIIIZ = new C135896cIN(this);
            LabelEditText labelEditText2 = this.LIZIZ;
            if (labelEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC135890cIH(this));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            LabelEditText labelEditText3 = this.LIZJ;
            if (labelEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText3.LJIIIZ = new C135864cHr(this, Arrays.asList(6, 14));
            LabelEditText labelEditText4 = this.LIZJ;
            if (labelEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText4.setOnFocusChangeListener(new View$OnFocusChangeListenerC135892cIJ(this));
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
                LabelEditText labelEditText5 = this.LIZJ;
                if (labelEditText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                labelEditText5.setOnPasteListener(new C135849cHc(this));
            }
        }
        if (this.LJIIIZ.busi_authorize_info.is_need_authorize && this.LJIIJ) {
            this.LJIIIZ.busi_authorize_info.needIdentify = 1;
            this.LJIIIZ.busi_authorize_info.hasPass = 0;
            this.LJIIIZ.busi_authorize_info.showOneStep = 0;
            this.LJIIIZ.busi_authorize_info.isOneStep = 1;
            this.LJIIIZ.busi_authorize_info.authType = "two_elements";
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC135887cIE(this), 300L);
        } else {
            LabelEditText labelEditText6 = this.LIZIZ;
            if (labelEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText6.LIZ();
        }
        LIZIZ();
        C2237e c2237e = this.mvpLogger;
        if (c2237e != null) {
            c2237e.LIZIZ();
        }
    }

    public static final /* synthetic */ LabelEditText LIZ(TwoElementAuthActivity twoElementAuthActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{twoElementAuthActivity}, null, LIZ, true, 31);
        if (proxy.isSupported) {
            return (LabelEditText) proxy.result;
        }
        LabelEditText labelEditText = twoElementAuthActivity.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return labelEditText;
    }

    public static final /* synthetic */ LabelEditText LIZIZ(TwoElementAuthActivity twoElementAuthActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{twoElementAuthActivity}, null, LIZ, true, 32);
        if (proxy.isSupported) {
            return (LabelEditText) proxy.result;
        }
        LabelEditText labelEditText = twoElementAuthActivity.LIZJ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return labelEditText;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        super.onEvent(baseEvent);
        if (baseEvent instanceof C135565cD2) {
            finishWithoutAnimation();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 35).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 37).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 36).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$e
    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean) {
        if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean}, this, LIZ, false, 12).isSupported && cJPayProtocolGroupContentsBean != null && cJPayProtocolGroupContentsBean.protocol_list.size() > 0) {
            this.LJIILIIL = cJPayProtocolGroupContentsBean;
            this.LJIIL = cJPayProtocolGroupContentsBean.isNeedCheckBox();
            C135401cAO c135401cAO = this.f25488LJ;
            if (c135401cAO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c135401cAO.LIZ(cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, this.LJIIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0106, code lost:
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
        if (r1 == null) goto L41;
     */
    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean r10) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.quickbind.p144ui.TwoElementAuthActivity.LIZ(com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean):void");
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C136011cKE LIZ2 = C135996cJz.LIZ().LIZ("/normalbind/CJPayCardBinActivity").LIZ("param_bind_card_info", C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo()).LIZ("hide_card_list", z).LIZ("force_not_show_real_name_auth", true).LIZ("is_first_bind_card_page", false).LIZ(AnimationType.SlideLeftAndRigth);
        if (C135876cI3.f17973LJ.LJIILIIL().isIndependentBindCard()) {
            LIZ2.LIZ("param_is_independent_bind_card", true);
        }
        LIZ2.LIZ(this);
    }

    private final void LIZ(Activity activity, String str) {
        if (PatchProxy.proxy(new Object[]{activity, str}, this, LIZ, false, 19).isSupported) {
            return;
        }
        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(activity);
        defaultBuilder.setTitle(str);
        defaultBuilder.setSingleBtnStr(getString(2131561707));
        defaultBuilder.setSingleBtnListener(new View$OnClickListenerC135900cIR(this));
        this.LJI = defaultBuilder.build();
        DialogC137460chc dialogC137460chc = this.LJI;
        if (dialogC137460chc != null) {
            C116971W2r.LIZJ(dialogC137460chc);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$e
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 14).isSupported) {
            return;
        }
        LJFF();
        String stringRes = getStringRes(this, 2131561934);
        Intrinsics.checkNotNullExpressionValue(stringRes, "");
        LIZ(this, stringRes);
        C2237e c2237e = this.mvpLogger;
        if (c2237e != null) {
            c2237e.LIZ(0, str, str2);
        }
    }
}
