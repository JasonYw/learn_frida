package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBusiAuthorizeInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean;
import com.android.ttcjpaysdk.bindcard.unionpay.C2248a;
import com.android.ttcjpaysdk.bindcard.unionpay.applog.C2251e;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p146c.C2253a;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$a;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractActivityC135714cFR;
import p003X.AbstractC135629cE4;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135401cAO;
import p003X.C135544cCh;
import p003X.C135668cEh;
import p003X.C135694cF7;
import p003X.C135704cFH;
import p003X.C135708cFL;
import p003X.C135709cFM;
import p003X.C135710cFN;
import p003X.C135711cFO;
import p003X.C135712cFP;
import p003X.C135713cFQ;
import p003X.C135726cFd;
import p003X.C135737cFo;
import p003X.C135754cG5;
import p003X.C135812cH1;
import p003X.C135876cI3;
import p003X.C135912cId;
import p003X.C136058cKz;
import p003X.C9H6;
import p003X.GOY;
import p003X.RunnableC135546cCj;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayTwoElementsActivity */
/* loaded from: classes17.dex */
public final class UnionPayTwoElementsActivity extends AbstractActivityC135714cFR<C2253a, C2251e> implements a$a {
    public static ChangeQuickRedirect LIZ;
    public C135812cH1 LIZIZ;
    public UnionPaySignInfo LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(7371);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (hashMap = this.LIZLLL) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690567;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC136021cKO
    public final Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135754cG5.class, C135694cF7.class};
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2252a();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        C135812cH1 c135812cH1;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (c135812cH1 = this.LIZIZ) != null) {
            c135812cH1.LJIILJJIL = new C135711cFO(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onBackPressed();
        C135812cH1 c135812cH1 = this.LIZIZ;
        if (c135812cH1 != null && !c135812cH1.onBackPressed()) {
            C136058cKz.LIZ(this);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        C135726cFd.LIZLLL.LIZ("云闪付二要素绑卡");
        CJPayPageLoadTrace.LIZ().LIZIZ(CJPayPageLoadTrace.Page.NEW_CARD_PAY, CJPayPageLoadTrace.Section.END, "云闪付二要素绑卡");
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        View findViewById = findViewById(2131170212);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = new C135812cH1(findViewById, this.mvpLogger);
        C2251e c2251e = this.mvpLogger;
        if (c2251e != null && !PatchProxy.proxy(new Object[0], c2251e, C2251e.LIZIZ, false, 1).isSupported) {
            c2251e.LIZ(c2251e.LIZJ, MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("twoelements_verify_status", 0), TuplesKt.m137to("is_onestep", 1), TuplesKt.m137to("needidentify", 1), TuplesKt.m137to("haspass", 0), TuplesKt.m137to("show_onestep", 0)));
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 26).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 25).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
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
    public final void initData() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZJ = C135704cFH.LIZIZ();
        UnionPaySignInfo unionPaySignInfo = this.LIZJ;
        if (unionPaySignInfo == null || (str = unionPaySignInfo.signOrderNo) == null) {
            str = "";
        }
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("biz_order_type", "verify_identity_info");
            hashMap.put("member_biz_order_no", str);
            C2253a c2253a = (C2253a) this.mBasePresenter;
            if (c2253a != null && !PatchProxy.proxy(new Object[]{hashMap}, c2253a, C2253a.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(hashMap);
                C2208b c2208b = (C2208b) c2253a.mModel;
                if (c2208b != null) {
                    C135708cFL c135708cFL = new C135708cFL(c2253a);
                    if (!PatchProxy.proxy(new Object[]{hashMap, c135708cFL}, c2208b, C2252a.LIZIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(hashMap, c135708cFL);
                        c2208b.LIZ(new JSONObject(hashMap), "bytepay.member_product.query_protocol_list", (String) null, (String) null, true, (AbstractC137673cl3) c135708cFL);
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        CJPayCardAddBean LIZ2;
        CJPayBusiAuthorizeInfo cJPayBusiAuthorizeInfo;
        String str;
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        View layoutRootView = getLayoutRootView();
        if (layoutRootView != null) {
            layoutRootView.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131624861));
        }
        C135812cH1 c135812cH1 = this.LIZIZ;
        if (c135812cH1 != null) {
            UnionPaySignInfo unionPaySignInfo = this.LIZJ;
            Object obj = null;
            if (unionPaySignInfo != null) {
                str = unionPaySignInfo.voucher_label;
            } else {
                str = null;
            }
            UnionPaySignInfo unionPaySignInfo2 = this.LIZJ;
            if (unionPaySignInfo2 != null) {
                str2 = unionPaySignInfo2.display_desc;
            } else {
                str2 = null;
            }
            UnionPaySignInfo unionPaySignInfo3 = this.LIZJ;
            if (unionPaySignInfo3 != null) {
                str3 = unionPaySignInfo3.display_icon;
            } else {
                str3 = null;
            }
            if (!PatchProxy.proxy(new Object[]{str, str2, str3}, c135812cH1, C135812cH1.LIZ, false, 7).isSupported) {
                if (!TextUtils.isEmpty(str)) {
                    c135812cH1.LIZLLL.setText(str);
                    TextView textView = c135812cH1.LIZLLL;
                    Context context = c135812cH1.mContext;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setTextColor(C116971W2r.LIZ(context.getResources(), 2131624890));
                    c135812cH1.LIZLLL.setTypeface(Typeface.defaultFromStyle(1));
                    c135812cH1.f17964LJ.setVisibility(8);
                    c135812cH1.LJI.setVisibility(0);
                } else if (!TextUtils.isEmpty(str2)) {
                    c135812cH1.LIZLLL.setText(str2);
                    TextView textView2 = c135812cH1.LIZLLL;
                    Context context2 = c135812cH1.mContext;
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    textView2.setTextColor(C116971W2r.LIZ(context2.getResources(), 2131624854));
                    c135812cH1.LIZLLL.setTypeface(Typeface.defaultFromStyle(0));
                    c135812cH1.f17964LJ.setVisibility(0);
                    C2153b LIZ3 = C2153b.LJI.LIZ();
                    Object obj2 = c135812cH1.mContext;
                    if (obj2 instanceof Activity) {
                        obj = obj2;
                    }
                    LIZ3.LIZ((Activity) obj, str3, c135812cH1.f17964LJ);
                    c135812cH1.LJI.setVisibility(8);
                } else {
                    c135812cH1.LIZJ.setVisibility(8);
                    c135812cH1.LJI.setVisibility(0);
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (LIZ2 = C135876cI3.LIZ()) != null && (cJPayBusiAuthorizeInfo = LIZ2.busi_authorize_info) != null && cJPayBusiAuthorizeInfo.is_need_authorize && C2248a.f25489LJ) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC135546cCj(this), 300L);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$a
    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean) {
        C135812cH1 c135812cH1;
        if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean}, this, LIZ, false, 9).isSupported && cJPayProtocolGroupContentsBean != null && cJPayProtocolGroupContentsBean.isResponseOK() && (c135812cH1 = this.LIZIZ) != null && !PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean}, c135812cH1, C135812cH1.LIZ, false, 18).isSupported) {
            C106862S5w.LIZ(cJPayProtocolGroupContentsBean);
            c135812cH1.LJIILIIL = cJPayProtocolGroupContentsBean.isNeedCheckBox();
            c135812cH1.LJIIJ = new C135401cAO(c135812cH1.LJII, cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, c135812cH1.LJIILIIL);
            C135401cAO c135401cAO = c135812cH1.LJIIJ;
            if (c135401cAO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c135401cAO.LIZJ = new C135668cEh(c135812cH1, cJPayProtocolGroupContentsBean);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 22).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 21).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        super.onEvent(baseEvent);
        if (baseEvent instanceof C135754cG5) {
            C135754cG5 c135754cG5 = (C135754cG5) baseEvent;
            if (!PatchProxy.proxy(new Object[]{c135754cG5}, this, LIZ, false, 17).isSupported && c135754cG5.source == 1007) {
                C135812cH1 c135812cH1 = this.LIZIZ;
                if (c135812cH1 != null) {
                    c135812cH1.LIZ(true);
                }
                C2248a.LJFF.LIZ().LIZ(this, c135754cG5, new C135710cFN(this));
            }
        }
        if (baseEvent instanceof C135694cF7) {
            C9H6.LIZ((Activity) this);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$a
    public final void LIZ(CJPayTwoAuthVerifyBean cJPayTwoAuthVerifyBean) {
        if (!PatchProxy.proxy(new Object[]{cJPayTwoAuthVerifyBean}, this, LIZ, false, 10).isSupported && cJPayTwoAuthVerifyBean != null) {
            if (cJPayTwoAuthVerifyBean.isResponseOK()) {
                if (cJPayTwoAuthVerifyBean.needFaceCheck()) {
                    C2251e c2251e = this.mvpLogger;
                    if (c2251e != null) {
                        c2251e.LIZ(true);
                    }
                    UnionPaySignInfo unionPaySignInfo = this.LIZJ;
                    if (unionPaySignInfo != null) {
                        C135912cId.LIZ(this, unionPaySignInfo.signOrderNo, unionPaySignInfo.face_verify_info.verify_channel, 1007, "one_key_sign", unionPaySignInfo.face_verify_info.face_scene, new C135712cFP(this));
                    }
                } else {
                    C2251e c2251e2 = this.mvpLogger;
                    if (c2251e2 != null) {
                        c2251e2.LIZ(false);
                    }
                    C2248a.LJFF.LIZ().LIZ(this, this.LIZJ, new C135713cFQ(this));
                }
                C2251e c2251e3 = this.mvpLogger;
                if (c2251e3 != null && !PatchProxy.proxy(new Object[]{c2251e3, 1, null, null, 6, null}, null, C2251e.LIZIZ, true, 6).isSupported) {
                    c2251e3.LIZ(1, null, null);
                }
            } else if (Intrinsics.areEqual("MP010033", cJPayTwoAuthVerifyBean.code) && Intrinsics.areEqual("1", cJPayTwoAuthVerifyBean.button_info.button_status)) {
                C135812cH1 c135812cH1 = this.LIZIZ;
                if (c135812cH1 != null) {
                    c135812cH1.LIZ(false);
                }
                CJPayButtonInfo cJPayButtonInfo = cJPayTwoAuthVerifyBean.button_info;
                String str = cJPayTwoAuthVerifyBean.button_info.find_pwd_url;
                String str2 = cJPayTwoAuthVerifyBean.code;
                String str3 = cJPayTwoAuthVerifyBean.msg;
                if (!PatchProxy.proxy(new Object[]{cJPayButtonInfo, str, str2, str3}, this, LIZ, false, 16).isSupported && cJPayButtonInfo != null) {
                    AbstractC135629cE4 LIZ2 = C135737cFo.LIZ().LIZ(cJPayButtonInfo);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    LIZ2.LIZ(str2, str3).LIZ(C135876cI3.f17973LJ.LJIIIIZZ()).LIZ(this).LIZ().LIZ(new UnionPayTwoElementsActivity$showConflictDialog$1(this)).LIZIZ();
                }
                C135544cCh c135544cCh = this.mvpLogger;
                if (c135544cCh == null || PatchProxy.proxy(new Object[0], c135544cCh, C2251e.LIZIZ, false, 7).isSupported) {
                    return;
                }
                c135544cCh.LIZ("wallet_businesstopay_auth_fail_imp", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("needidentify", 1), TuplesKt.m137to("haspass", 0), TuplesKt.m137to("is_onestep", 1), TuplesKt.m137to("show_onestep", 0), TuplesKt.m137to("auth_type", "two_elements")));
            } else {
                C135812cH1 c135812cH12 = this.LIZIZ;
                if (c135812cH12 != null) {
                    c135812cH12.LIZ(false);
                }
                C2251e c2251e4 = this.mvpLogger;
                if (c2251e4 != null) {
                    c2251e4.LIZ(0, cJPayTwoAuthVerifyBean.code, cJPayTwoAuthVerifyBean.msg);
                }
                CJPayBasicUtils.displayToast(this, cJPayTwoAuthVerifyBean.msg);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$a
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C135812cH1 c135812cH1 = this.LIZIZ;
        if (c135812cH1 != null) {
            c135812cH1.LIZ(false);
        }
        C2251e c2251e = this.mvpLogger;
        if (c2251e != null) {
            c2251e.LIZ(0, str, str2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        C135812cH1 c135812cH1;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2) && i2 == -1 && (c135812cH1 = this.LIZIZ) != null) {
            c135812cH1.LIZ(false);
        }
    }

    public final void LIZ(String str, String str2, String str3) {
        UnionPaySignInfo unionPaySignInfo;
        if (!PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 15).isSupported && (unionPaySignInfo = this.LIZJ) != null) {
            C135812cH1 c135812cH1 = this.LIZIZ;
            if (c135812cH1 != null) {
                c135812cH1.LIZ(true);
            }
            C2253a c2253a = (C2253a) this.mBasePresenter;
            if (c2253a != null) {
                String str4 = unionPaySignInfo.identity_verify_order_no;
                if (!PatchProxy.proxy(new Object[]{str4, str, str3, str2}, c2253a, C2253a.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(str4, str, str3, str2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("member_biz_order_no", str4);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", CJPayEncryptUtil.getEncryptDataSM(str));
                        jSONObject2.put("identity_type", str3);
                        jSONObject2.put("identity_code", CJPayEncryptUtil.getEncryptDataSM(StringsKt__StringsJVMKt.replace$default(str2, " ", "", false, 4, (Object) null)));
                        jSONObject.put("enc_params", jSONObject2);
                        CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
                        cJPaySecureRequestParams.version = 3;
                        cJPaySecureRequestParams.type1 = 2;
                        cJPaySecureRequestParams.type2 = 1;
                        cJPaySecureRequestParams.check = 0;
                        cJPaySecureRequestParams.fields.add("enc_params.name");
                        cJPaySecureRequestParams.fields.add("enc_params.identity_code");
                        jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
                    } catch (JSONException unused) {
                    }
                    C2208b c2208b = (C2208b) c2253a.mModel;
                    if (c2208b != null) {
                        C135709cFM c135709cFM = new C135709cFM(c2253a);
                        if (!PatchProxy.proxy(new Object[]{jSONObject, c135709cFM}, c2208b, C2252a.LIZIZ, false, 3).isSupported) {
                            C106862S5w.LIZ(jSONObject, c135709cFM);
                            c2208b.LIZ(jSONObject, "bytepay.member_product.verify_identity_info", (String) null, (String) null, true, (AbstractC137673cl3) c135709cFM);
                        }
                    }
                }
            }
        }
    }
}
