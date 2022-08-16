package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsTokenBean;
import com.android.ttcjpaysdk.bindcard.unionpay.applog.C2250c;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayBankBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayGetBankListResponseBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p146c.C2255c;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$c;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.wrapper.UnionPayBindCardWrapper$initActions$4;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.AbstractActivityC135714cFR;
import p003X.C116971W2r;
import p003X.C123320YgE;
import p003X.C135268c8F;
import p003X.C135401cAO;
import p003X.C135551cCo;
import p003X.C135616cDr;
import p003X.C135672cEl;
import p003X.C135682cEv;
import p003X.C135683cEw;
import p003X.C135698cFB;
import p003X.C135704cFH;
import p003X.C135916cIh;
import p003X.C135996cJz;
import p003X.C136058cKz;
import p003X.C6H;
import p003X.C9H6;
import p003X.DialogC137460chc;
import p003X.FWT;
import p003X.GOY;
import p003X.RunnableC135681cEu;
import p003X.View$OnClickListenerC135659cEY;
import p003X.View$OnClickListenerC135673cEm;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayBindCardActivity */
/* loaded from: classes17.dex */
public final class UnionPayBindCardActivity extends AbstractActivityC135714cFR<C2255c, C2250c> implements a$c {
    public static ChangeQuickRedirect LIZ;
    public C135682cEv LIZIZ;
    public C135551cCo LIZJ;
    public ArrayList<UnionPayBankBean> LIZLLL = new ArrayList<>();

    /* renamed from: LJ */
    public UnionPayBankBean f25492LJ = new UnionPayBankBean();
    public CJPaySmsTokenBean LJFF = new CJPaySmsTokenBean();
    public CJPayRealNameBean LJI = new CJPayRealNameBean();
    public UnionPaySignInfo LJII;
    public String LJIIIIZZ;
    public UnionPayGetBankListResponseBean LJIIIZ;
    public ExtendRecyclerView LJIIJ;
    public HashMap LJIIJJI;

    static {
        Covode.recordClassIndex(7365);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (hashMap = this.LJIIJJI) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new HashMap();
        }
        View view = (View) this.LJIIJJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIJJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690569;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2252a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onBackPressed();
        C136058cKz.LIZ(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C135551cCo c135551cCo = this.LIZJ;
        if (c135551cCo != null) {
            c135551cCo.LIZIZ = new C135616cDr(this);
        }
        C135682cEv c135682cEv = this.LIZIZ;
        if (c135682cEv != null) {
            c135682cEv.LJIJ = new C135698cFB(this);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        ExtendRecyclerView extendRecyclerView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        View findViewById = findViewById(2131170213);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = new C135682cEv(findViewById, this.mvpLogger);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            C135682cEv c135682cEv = this.LIZIZ;
            if (c135682cEv != null) {
                extendRecyclerView = c135682cEv.LJIIIIZZ;
            } else {
                extendRecyclerView = null;
            }
            this.LJIIJ = extendRecyclerView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            ExtendRecyclerView extendRecyclerView2 = this.LJIIJ;
            if (extendRecyclerView2 != null) {
                extendRecyclerView2.setLayoutManager(linearLayoutManager);
            }
            this.LIZJ = new C135551cCo(this);
            C135551cCo c135551cCo = this.LIZJ;
            if (c135551cCo != null) {
                c135551cCo.setHasStableIds(true);
            }
            ExtendRecyclerView extendRecyclerView3 = this.LJIIJ;
            if (extendRecyclerView3 != null) {
                extendRecyclerView3.setAdapter(this.LIZJ);
            }
            ExtendRecyclerView extendRecyclerView4 = this.LJIIJ;
            if (extendRecyclerView4 != null) {
                extendRecyclerView4.post(new RunnableC135681cEu(this, linearLayoutManager));
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        ArrayList<UnionPayBankBean> arrayList;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJII = C135704cFH.LIZIZ();
        this.LJIIIZ = (UnionPayGetBankListResponseBean) CJPayJsonParser.fromJson(this.LJIIIIZZ, UnionPayGetBankListResponseBean.class);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            UnionPayGetBankListResponseBean unionPayGetBankListResponseBean = this.LJIIIZ;
            if (unionPayGetBankListResponseBean == null || (arrayList = unionPayGetBankListResponseBean.union_pay_banks) == null) {
                arrayList = new ArrayList<>();
            }
            Iterator<UnionPayBankBean> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UnionPayBankBean next = it.next();
                if (Intrinsics.areEqual("1", next.status)) {
                    next.isChecked = true;
                    C135682cEv c135682cEv = this.LIZIZ;
                    if (c135682cEv != null) {
                        c135682cEv.LIZ(next.protocol_group_contents);
                    }
                    this.f25492LJ = next;
                }
            }
            this.LIZLLL.addAll(arrayList);
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 24).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 23).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
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

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        String str;
        String str2;
        String str3;
        ArrayList<CJPayProtocolGroupBean> arrayList;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        View layoutRootView = getLayoutRootView();
        if (layoutRootView != null) {
            layoutRootView.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131624861));
        }
        C135682cEv c135682cEv = this.LIZIZ;
        if (c135682cEv != null) {
            UnionPaySignInfo unionPaySignInfo = this.LJII;
            if (!PatchProxy.proxy(new Object[]{unionPaySignInfo}, c135682cEv, C135682cEv.LIZ, false, 1).isSupported) {
                if (unionPaySignInfo == null || (str = unionPaySignInfo.display_icon) == null) {
                    str = "";
                }
                c135682cEv.LJIILIIL = str;
                if (unionPaySignInfo == null || (str2 = unionPaySignInfo.display_desc) == null) {
                    str2 = "";
                }
                c135682cEv.LJIILJJIL = str2;
                if (unionPaySignInfo == null || (str3 = unionPaySignInfo.voucher_label) == null) {
                    str3 = "";
                }
                c135682cEv.LJIILL = str3;
                if (!PatchProxy.proxy(new Object[0], c135682cEv, C135682cEv.LIZ, false, 2).isSupported) {
                    String str4 = null;
                    if (!TextUtils.isEmpty(c135682cEv.LJIILL)) {
                        c135682cEv.LJII.setText(c135682cEv.LJIILL);
                        TextView textView = c135682cEv.LJII;
                        Context context = c135682cEv.mContext;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        textView.setTextColor(C116971W2r.LIZ(context.getResources(), 2131624890));
                        C135268c8F.LIZ(c135682cEv.LJII);
                        c135682cEv.LJI.setVisibility(8);
                        c135682cEv.LJII.setVisibility(0);
                        c135682cEv.LJIIL.setVisibility(0);
                    } else if (!TextUtils.isEmpty(c135682cEv.LJIILJJIL)) {
                        Context context2 = c135682cEv.mContext;
                        if (!(context2 instanceof Activity)) {
                            context2 = null;
                        }
                        Activity activity = (Activity) context2;
                        if (activity != null && (true ^ TextUtils.isEmpty(c135682cEv.LJIILIIL))) {
                            C2153b.LJI.LIZ().LIZ(activity, c135682cEv.LJIILIIL, c135682cEv.LJI);
                        }
                        c135682cEv.LJII.setText(c135682cEv.LJIILJJIL);
                        c135682cEv.LJI.setVisibility(0);
                        c135682cEv.LJII.setVisibility(0);
                        c135682cEv.LJIIL.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = c135682cEv.LJIIJ.getLayoutParams();
                        if (layoutParams != null) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                            layoutParams2.bottomMargin = C6H.LIZ(16.0f, c135682cEv.mContext);
                            c135682cEv.LJIIJ.setLayoutParams(layoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                        }
                    } else {
                        c135682cEv.LJFF.setVisibility(8);
                        c135682cEv.LJIIL.setVisibility(0);
                    }
                    C135268c8F.LIZ(c135682cEv.f17943LJ);
                    LinearLayout linearLayout = c135682cEv.LJIIIZ;
                    CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean = c135682cEv.LJIIZILJ;
                    if (cJPayProtocolGroupContentsBean != null) {
                        arrayList = cJPayProtocolGroupContentsBean.getProtocolGroupBeanList();
                    } else {
                        arrayList = null;
                    }
                    CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean2 = c135682cEv.LJIIZILJ;
                    if (cJPayProtocolGroupContentsBean2 != null) {
                        str4 = cJPayProtocolGroupContentsBean2.guide_message;
                    }
                    c135682cEv.LJIILLIIL = new C135401cAO(linearLayout, arrayList, str4, false);
                }
                if (!PatchProxy.proxy(new Object[0], c135682cEv, C135682cEv.LIZ, false, 3).isSupported) {
                    c135682cEv.LIZJ.setOnClickListener(new View$OnClickListenerC135673cEm(c135682cEv));
                    C135401cAO c135401cAO = c135682cEv.LJIILLIIL;
                    if (c135401cAO != null) {
                        c135401cAO.LIZJ = new C135672cEl(c135682cEv);
                    }
                    c135682cEv.LIZLLL.setOnScrollChangeListener(new C135683cEw(c135682cEv));
                    C123320YgE.LIZ(c135682cEv.LJIIJJI, 0L, new UnionPayBindCardWrapper$initActions$4(c135682cEv), 1, null);
                }
            }
        }
        C135551cCo c135551cCo = this.LIZJ;
        if (c135551cCo != null) {
            c135551cCo.LIZ(this.LIZLLL);
        }
        C2250c c2250c = this.mvpLogger;
        if (c2250c != null) {
            c2250c.LIZ(this.LIZLLL);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        if (z) {
            C135682cEv c135682cEv = this.LIZIZ;
            if (c135682cEv != null) {
                c135682cEv.LIZ(true);
                return;
            }
            return;
        }
        ExtendRecyclerView extendRecyclerView = this.LJIIJ;
        if (extendRecyclerView != null) {
            C9H6.LIZ(extendRecyclerView, new UnionPayBindCardActivity$setLoadingView$1(this), 400L);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        FWT.LIZ("caijing_risk_unionpay_bind_card_request");
    }

    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$c
    public final void LIZ(String str, String str2) {
        String string;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZ(false);
        if (!TextUtils.isEmpty(str2)) {
            string = str2;
        } else {
            string = getResources().getString(2131558456);
        }
        CJPayBasicUtils.displayToast(this, string);
        C2250c c2250c = this.mvpLogger;
        if (c2250c != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            c2250c.LIZ("1", "0", str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [T, X.chc] */
    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$c
    public final void LIZ(CJPaySmsTokenBean cJPaySmsTokenBean, CJPayRealNameBean cJPayRealNameBean) {
        String stringRes;
        if (PatchProxy.proxy(new Object[]{cJPaySmsTokenBean, cJPayRealNameBean}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZ(false);
        if (cJPaySmsTokenBean != null) {
            if (cJPaySmsTokenBean.isResponseOK()) {
                C2250c c2250c = this.mvpLogger;
                if (c2250c != null) {
                    C2250c.LIZ(c2250c, "1", "1", null, null, 12, null);
                }
                this.LJI = cJPayRealNameBean;
                if (cJPayRealNameBean != null) {
                    cJPayRealNameBean.bank_mobile_no = cJPaySmsTokenBean.mobile_mask;
                }
                this.LJFF = cJPaySmsTokenBean;
                C135996cJz.LIZ().LIZ("/basebind/CJPaySmsCodeCheckActivity").LIZ(AnimationType.FadeInAndOut).LIZ("param_bind_card_real_name", cJPayRealNameBean).LIZ("param_bind_card_sms_token", (Serializable) this.LJFF.sms_token).LIZ("param_is_independent_bind_card", false).LIZ("param_title_content", this.LJFF.verify_text_msg).LIZ(this);
            } else if (cJPaySmsTokenBean.button_info != null && Intrinsics.areEqual("1", cJPaySmsTokenBean.button_info.button_status)) {
                C2250c c2250c2 = this.mvpLogger;
                if (c2250c2 != null) {
                    String str = cJPaySmsTokenBean.code;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    String str2 = cJPaySmsTokenBean.msg;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    c2250c2.LIZ("1", "0", str, str2);
                }
                CJPayButtonInfo standardCJPayButtonInfo = cJPaySmsTokenBean.button_info.toStandardCJPayButtonInfo();
                Intrinsics.checkNotNullExpressionValue(standardCJPayButtonInfo, "");
                if (PatchProxy.proxy(new Object[]{standardCJPayButtonInfo}, this, LIZ, false, 17).isSupported) {
                    return;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = null;
                View$OnClickListenerC135659cEY view$OnClickListenerC135659cEY = new View$OnClickListenerC135659cEY(objectRef);
                CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
                defaultBuilder.setLeftBtnListener(C135916cIh.LIZIZ.LIZ(standardCJPayButtonInfo.left_button_action, (DialogC137460chc) objectRef.element, this, view$OnClickListenerC135659cEY));
                defaultBuilder.setRightBtnListener(C135916cIh.LIZIZ.LIZ(standardCJPayButtonInfo.right_button_action, (DialogC137460chc) objectRef.element, this, view$OnClickListenerC135659cEY));
                defaultBuilder.setSingleBtnListener(C135916cIh.LIZIZ.LIZ(standardCJPayButtonInfo.action, (DialogC137460chc) objectRef.element, this, view$OnClickListenerC135659cEY));
                defaultBuilder.setButtonInfo(standardCJPayButtonInfo);
                objectRef.element = CJPayDialogUtils.initDialog(defaultBuilder);
                C9H6.LIZ((DialogC137460chc) objectRef.element, this);
            } else {
                C2250c c2250c3 = this.mvpLogger;
                if (c2250c3 != null) {
                    String str3 = cJPaySmsTokenBean.code;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    String str4 = cJPaySmsTokenBean.msg;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    c2250c3.LIZ("1", "0", str3, str4);
                }
                if (!TextUtils.isEmpty(cJPaySmsTokenBean.msg)) {
                    stringRes = cJPaySmsTokenBean.msg;
                } else {
                    stringRes = getStringRes(this, 2131558456);
                }
                CJPayBasicUtils.displayToast(this, stringRes);
            }
        }
    }
}
