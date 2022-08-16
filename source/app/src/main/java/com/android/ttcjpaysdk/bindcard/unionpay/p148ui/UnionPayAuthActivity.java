package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.C2248a;
import com.android.ttcjpaysdk.bindcard.unionpay.applog.C2249b;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayAuthBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayAuthResponseBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p146c.C2254b;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.AbstractActivityC135987cJq;
import p003X.AbstractC137454chW;
import p003X.C106862S5w;
import p003X.C123323YgH;
import p003X.C135401cAO;
import p003X.C135465cBQ;
import p003X.C135544cCh;
import p003X.C135565cD2;
import p003X.C135667cEg;
import p003X.C135685cEy;
import p003X.C135686cEz;
import p003X.C135688cF1;
import p003X.C135694cF7;
import p003X.C135704cFH;
import p003X.C135876cI3;
import p003X.C9H6;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.View$OnClickListenerC135687cF0;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayAuthActivity */
/* loaded from: classes17.dex */
public final class UnionPayAuthActivity extends AbstractActivityC135987cJq<C2254b, C2249b> implements a$b {
    public static ChangeQuickRedirect LIZ;
    public ImageView LIZIZ;
    public ProgressBar LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25491LJ;
    public UnionPaySignInfo LJFF;
    public UnionPayAuthResponseBean LJI;
    public RelativeLayout LJII;
    public ImageView LJIIIIZZ;
    public TextView LJIIIZ;
    public TextView LJIIJ;
    public TextView LJIIJJI;
    public CJPayCustomButton LJIIL;
    public LinearLayout LJIILIIL;
    public C135401cAO LJIILJJIL;
    public UnionPayAuthBean LJIILL;
    public HashMap LJIILLIIL;

    static {
        Covode.recordClassIndex(7357);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && (hashMap = this.LJIILLIIL) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = new HashMap();
        }
        View view = (View) this.LJIILLIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILLIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690568;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final boolean isNeedCloseAnimation() {
        return false;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public UnionPayAuthActivity() {
        new CJPayHostInfo();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135694cF7.class, C135565cD2.class};
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2252a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.LJII;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayBasicUtils.upAndDownAnimation((View) relativeLayout, false, (Activity) this, (AbstractC137454chW) new C135667cEg(this));
        C2249b c2249b = this.mvpLogger;
        if (c2249b != null) {
            C2249b.LIZ(c2249b, "0", "", null, 4, null);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        ImageView imageView = this.LJIIIIZZ;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123323YgH.LIZ(imageView, new UnionPayAuthActivity$initActions$1(this));
        CJPayCustomButton cJPayCustomButton = this.LJIIL;
        if (cJPayCustomButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123323YgH.LIZ(cJPayCustomButton, new UnionPayAuthActivity$initActions$2(this));
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        UnionPayAuthBean unionPayAuthBean;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C135876cI3.f17973LJ.LJIIIIZZ();
        this.LJFF = C135704cFH.LIZIZ();
        UnionPayAuthResponseBean unionPayAuthResponseBean = this.LJI;
        if (unionPayAuthResponseBean != null) {
            unionPayAuthBean = unionPayAuthResponseBean.union_pay_authorization;
        } else {
            unionPayAuthBean = null;
        }
        this.LJIILL = unionPayAuthBean;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 31).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 30).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        View findViewById = findViewById(2131170139);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJII = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(2131170130);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIIIIZZ = (ImageView) findViewById2;
        View findViewById3 = findViewById(2131170131);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZIZ = (ImageView) findViewById3;
        View findViewById4 = findViewById(2131170136);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJIIIZ = (TextView) findViewById4;
        View findViewById5 = findViewById(2131170133);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJIIJ = (TextView) findViewById5;
        View findViewById6 = findViewById(2131170138);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJIIJJI = (TextView) findViewById6;
        View findViewById7 = findViewById(2131170127);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJIIL = (CJPayCustomButton) findViewById7;
        View findViewById8 = findViewById(2131170129);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LIZJ = (ProgressBar) findViewById8;
        View findViewById9 = findViewById(2131181492);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIILIIL = (LinearLayout) findViewById9;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        UnionPayAuthBean unionPayAuthBean;
        String str;
        UnionPayAuthBean unionPayAuthBean2;
        View layoutRootView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && (layoutRootView = getLayoutRootView()) != null) {
            layoutRootView.setBackgroundColor(CastProtectorUtils.parseColor("#4D000000"));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (unionPayAuthBean2 = this.LJIILL) != null) {
            TextView textView = this.LJIIIZ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(unionPayAuthBean2.name_mask);
            TextView textView2 = this.LJIIJ;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setText(unionPayAuthBean2.id_code_mask);
            TextView textView3 = this.LJIIJJI;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView3.setText(unionPayAuthBean2.mobile_mask);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            C2153b LIZ2 = C2153b.LJI.LIZ();
            UnionPayAuthBean unionPayAuthBean3 = this.LJIILL;
            if (unionPayAuthBean3 != null) {
                str = unionPayAuthBean3.authorization_icon_url;
            } else {
                str = null;
            }
            LIZ2.LIZ(str, new C135686cEz(this));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && (unionPayAuthBean = this.LJIILL) != null) {
            unionPayAuthBean.protocol_bean.protocol_group_names = C135465cBQ.LIZ(unionPayAuthBean.protocol_group_names);
            unionPayAuthBean.protocol_bean.guide_message = unionPayAuthBean.guide_message;
            unionPayAuthBean.protocol_bean.protocol_list = unionPayAuthBean.protocol_list;
            CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean = unionPayAuthBean.protocol_bean;
            if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean}, this, LIZ, false, 16).isSupported) {
                this.f25491LJ = cJPayProtocolGroupContentsBean.isNeedCheckBox();
                LinearLayout linearLayout = this.LJIILIIL;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                this.LJIILJJIL = new C135401cAO(linearLayout, cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, this.f25491LJ);
                C135401cAO c135401cAO = this.LJIILJJIL;
                if (c135401cAO != null) {
                    c135401cAO.LIZJ = new C135685cEy(this, cJPayProtocolGroupContentsBean);
                }
            }
        }
        RelativeLayout relativeLayout = this.LJII;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayBasicUtils.upAndDownAnimation((View) relativeLayout, true, (Activity) this, (AbstractC137454chW) null);
        C135544cCh c135544cCh = this.mvpLogger;
        if (c135544cCh != null && !PatchProxy.proxy(new Object[0], c135544cCh, C2249b.LIZIZ, false, 1).isSupported) {
            C135544cCh.LIZ(c135544cCh, "wallet_ysf_auth_page_imp", null, 2, null);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        if ((baseEvent instanceof C135694cF7) || (baseEvent instanceof C135565cD2)) {
            C9H6.LIZ((Activity) this);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 26).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 25).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.chc] */
    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$b
    public final void LIZ(UnionPaySignBean unionPaySignBean) {
        boolean z;
        Resources resources;
        if (!PatchProxy.proxy(new Object[]{unionPaySignBean}, this, LIZ, false, 9).isSupported && unionPaySignBean != null) {
            if (unionPaySignBean.isResponseOK()) {
                C2248a.LJFF.LIZ().LIZIZ(this, this.LJFF, new C135688cF1(this));
                C2249b c2249b = this.mvpLogger;
                if (c2249b != null) {
                    C2249b.LIZ(c2249b, "1", "1", null, 4, null);
                    return;
                }
                return;
            }
            LIZ(false);
            if (!PatchProxy.proxy(new Object[]{unionPaySignBean}, this, LIZ, false, 20).isSupported) {
                String str = unionPaySignBean.button_info.page_desc;
                Intrinsics.checkNotNullExpressionValue(str, "");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    String str3 = unionPaySignBean.button_info.button_desc;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    if (str3.length() > 0) {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = null;
                        CJPayButtonInfo cJPayButtonInfo = unionPaySignBean.button_info;
                        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
                        defaultBuilder.setTitle(cJPayButtonInfo.page_desc);
                        defaultBuilder.setSingleBtnStr(cJPayButtonInfo.button_desc);
                        defaultBuilder.setSingleBtnBold(true);
                        defaultBuilder.setSingleBtnListener(new View$OnClickListenerC135687cF0(this, objectRef));
                        objectRef.element = defaultBuilder.build();
                        C9H6.LIZ((DialogC137460chc) objectRef.element, this);
                    }
                }
                Context context = CJPayHostInfo.applicationContext;
                if (!TextUtils.isEmpty(unionPaySignBean.msg)) {
                    str2 = unionPaySignBean.msg;
                } else {
                    Context context2 = CJPayHostInfo.applicationContext;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        str2 = resources.getString(2131558456);
                    }
                }
                CJPayBasicUtils.displayToast(context, str2);
            }
            C2249b c2249b2 = this.mvpLogger;
            if (c2249b2 == null) {
                return;
            }
            c2249b2.LIZ("1", "0", unionPaySignBean);
        }
    }

    public final void LIZ(boolean z) {
        String str;
        Resources resources;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        if (z) {
            ProgressBar progressBar = this.LIZJ;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            progressBar.setVisibility(0);
            CJPayCustomButton cJPayCustomButton = this.LJIIL;
            if (cJPayCustomButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCustomButton.setText("");
            CJPayCustomButton cJPayCustomButton2 = this.LJIIL;
            if (cJPayCustomButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCustomButton2.setClickable(false);
            return;
        }
        ProgressBar progressBar2 = this.LIZJ;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        progressBar2.setVisibility(8);
        CJPayCustomButton cJPayCustomButton3 = this.LJIIL;
        if (cJPayCustomButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Context context = CJPayHostInfo.applicationContext;
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(2131561464)) == null) {
            str = "";
        }
        cJPayCustomButton3.setText(str);
        CJPayCustomButton cJPayCustomButton4 = this.LJIIL;
        if (cJPayCustomButton4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCustomButton4.setClickable(true);
    }

    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$b
    public final void LIZ(String str, String str2) {
        String str3;
        Resources resources;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZ(false);
        Context context = CJPayHostInfo.applicationContext;
        if (context != null && (resources = context.getResources()) != null) {
            str3 = resources.getString(2131558456);
        } else {
            str3 = null;
        }
        CJPayBasicUtils.displayToast(context, str3);
    }
}
