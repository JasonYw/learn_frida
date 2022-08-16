package com.android.ttcjpaysdk.thirdparty.front.cardlist.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p169b.C2364a;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p170c.C2365a;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p171d.C2366a;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p172f.AbstractC2367a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractActivityC136021cKO;
import p003X.AbstractC136318cPB;
import p003X.AbstractC137454chW;
import p003X.C116971W2r;
import p003X.C135100c5X;
import p003X.C135343c9S;
import p003X.C135876cI3;
import p003X.C135883cIA;
import p003X.C136058cKz;
import p003X.C136312cP5;
import p003X.C136319cPC;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayFrontCardListMethodActivity extends AbstractActivityC136021cKO<C2366a> implements INormalBindCardCallback, AbstractC2367a {
    public static ChangeQuickRedirect LIZ;
    public static int LJIIJJI;
    public int LIZIZ;
    public int LIZJ = 2;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25526LJ;
    public String LJFF;
    public String LJI;
    public ArrayList<String> LJII;
    public C136319cPC LJIIIIZZ;
    public RelativeLayout LJIIIZ;
    public C2366a LJIIJ;
    public RelativeLayout LJIIL;
    public ExtendRecyclerView LJIILIIL;
    public ImageView LJIILJJIL;
    public TextView LJIILL;
    public LinearLayout LJIILLIIL;
    public TextView LJIIZILJ;

    static {
        Covode.recordClassIndex(8492);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690551;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135883cIA.class};
    }

    @Override // p003X.AbstractActivityC136021cKO, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2365a();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        LIZ(true, false);
        int i = this.LIZIZ;
        if (i == 0) {
            C135100c5X.LIZIZ(this.LJIIL, 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
        } else if (i == 1) {
            C135100c5X.LIZIZ(this.LJIIL, ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8497);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || CJPayFrontCardListMethodActivity.this.isFinishing()) {
                    return;
                }
                CJPayFrontCardListMethodActivity.this.finish();
            }
        }, 300L);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public String getSources() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C2366a c2366a = this.LJIIJ;
        if (c2366a == null) {
            return "";
        }
        if (c2366a.LIZ()) {
            return "零钱提现收银台";
        }
        return "零钱充值收银台";
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        MethodCollector.m14708i(521);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(521);
            return;
        }
        this.LJIIL = (RelativeLayout) findViewById(2131170063);
        this.LJIIIZ = (RelativeLayout) findViewById(2131169984);
        this.LJIIIZ.setVisibility(8);
        this.LJIILJJIL = (ImageView) findViewById(2131165337);
        this.LJIILL = (TextView) findViewById(2131169910);
        this.LJIILIIL = (ExtendRecyclerView) findViewById(2131169993);
        View inflate = getLayoutInflater().inflate(2131690718, (ViewGroup) null);
        this.LJIILLIIL = (LinearLayout) inflate.findViewById(2131169741);
        this.LJIIZILJ = (TextView) inflate.findViewById(2131169740);
        MethodCollector.m14707o(521);
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 33).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 32).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported) {
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

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJIILIIL.setLayoutManager(new LinearLayoutManager(this));
        this.LJIILIIL.setNestedScrollingEnabled(false);
        this.LJIIIIZZ = new C136319cPC(this, this.LJIIJ, this.LIZJ);
        this.LJIILIIL.setAdapter(this.LJIIIIZZ);
        this.LJIIIIZZ.LIZLLL = new AbstractC136318cPB() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8494);
            }

            @Override // p003X.AbstractC136318cPB
            public final void LIZ(final C2364a c2364a) {
                if (PatchProxy.proxy(new Object[]{c2364a}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8495);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        ICJPayFrontCardListService iCJPayFrontCardListService;
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || CJPayFrontCardListMethodActivity.this.isFinishing()) {
                            return;
                        }
                        if (c2364a != null && (iCJPayFrontCardListService = (ICJPayFrontCardListService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCardListService.class)) != null && iCJPayFrontCardListService.getFrontCardCallBack() != null) {
                            iCJPayFrontCardListService.getFrontCardCallBack().onCardListResult(c2364a.LIZJ(), 0);
                        }
                        if (CJPayFrontCardListMethodActivity.this.LJIIJ != null) {
                            C2366a c2366a = CJPayFrontCardListMethodActivity.this.LJIIJ;
                            C2364a c2364a2 = c2364a;
                            if (!PatchProxy.proxy(new Object[]{c2364a2}, c2366a, C2366a.LIZ, false, 9).isSupported) {
                                if (c2366a.LIZ()) {
                                    if (C2366a.LJFF != null) {
                                        C136312cP5.LIZIZ(C2366a.LJFF.paytype_info.quick_pay.cards.size());
                                    }
                                } else {
                                    if (c2364a2 == null) {
                                        str = "";
                                    } else {
                                        str = c2364a2.LJIIIIZZ;
                                    }
                                    C136312cP5.LIZIZ(str);
                                }
                            }
                        }
                        if (!CJPayFrontCardListMethodActivity.this.isFinishing()) {
                            CJPayFrontCardListMethodActivity.this.LIZ();
                        }
                    }
                });
            }
        };
        try {
            String str = C135343c9S.LIZ().LIZJ().LIZLLL.LIZ;
            if (!TextUtils.isEmpty(str)) {
                this.LJIIZILJ.setTextColor(Color.parseColor(str));
            }
            if (!TextUtils.isEmpty(this.LJFF)) {
                this.LJIIZILJ.setText(this.LJFF);
            }
            if (this.LJIIJ != null && this.LJIIJ.f25528LJ != null && this.LJIIJ.LIZIZ(this.LJIIJ.f25528LJ.LJII) >= 0) {
                this.LJIILIIL.LIZ(this.LJIILLIIL);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.cardlist.p172f.AbstractC2367a
    public final void LIZIZ() {
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        C136319cPC c136319cPC;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) != null) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (c136319cPC = this.LJIIIIZZ) != null && !PatchProxy.proxy(new Object[0], c136319cPC, C136319cPC.LIZ, false, 18).isSupported) {
                c136319cPC.f18015LJ = true;
                c136319cPC.notifyDataSetChanged();
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(this.LJI);
            } catch (JSONException unused) {
            }
            NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
            normalBindCardBean.setProcessInfo(jSONObject);
            normalBindCardBean.setTotalAmount(this.LIZLLL);
            normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.CardList);
            normalBindCardBean.setBindSourceType(Integer.valueOf(LJIIJJI));
            normalBindCardBean.setHostInfoJSON(C135876cI3.f17973LJ.LJIIIZ());
            normalBindCardBean.setBindCardWithPay(Boolean.FALSE);
            normalBindCardBean.setFront(true);
            iCJPayNormalBindCardService.startBindCardProcess(this, ICJPayNormalBindCardService.BindCardType.TYPE_BALANCE, normalBindCardBean, this);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void adjustViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            int i = this.LIZJ;
            if (i != 2 && i != 3) {
                if (i == 4 || i == 5) {
                    this.LJIILL.setText(getResources().getString(2131561931));
                }
            } else {
                this.LJIILL.setText(getResources().getString(2131561930));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            if (this.LIZIZ == 0) {
                this.LJIILJJIL.setImageResource(2130840410);
            }
            this.LJIILJJIL.setContentDescription(getResources().getString(2131561548));
            this.LJIILJJIL.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8493);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayFrontCardListMethodActivity.this.onBackPressed();
                }
            });
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            int i2 = this.LIZIZ;
            if (i2 == 0) {
                C135100c5X.LIZIZ(this.LJIIL, ViewCompat.MEASURED_STATE_TOO_SMALL, 1291845632);
            } else if (i2 == 1) {
                C135100c5X.LIZIZ(this.LJIIL, ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && CJPayBasicUtils.isClickValid()) {
            C2366a c2366a = this.LJIIJ;
            if (c2366a != null && c2366a.LIZ()) {
                C136312cP5.LIZ("wallet_tixian_cardselect_close");
            }
            int i = this.LIZJ;
            if (i != 3 && i != 5) {
                LIZ();
            } else if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            } else {
                CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
                defaultBuilder.setTitle(getResources().getString(2131561558));
                defaultBuilder.setLeftBtnStr(getResources().getString(2131558453));
                defaultBuilder.setRightBtnStr(getResources().getString(2131561557));
                defaultBuilder.setLeftBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.6
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8499);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && CJPayFrontCardListMethodActivity.this.mCommonDialog != null) {
                            C116971W2r.LIZ(CJPayFrontCardListMethodActivity.this.mCommonDialog);
                        }
                    }
                });
                defaultBuilder.setRightBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.5
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8498);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        if (CJPayFrontCardListMethodActivity.this.mCommonDialog != null) {
                            C116971W2r.LIZ(CJPayFrontCardListMethodActivity.this.mCommonDialog);
                        }
                        CJPayFrontCardListMethodActivity.this.LIZ(true, false);
                        CJPayFrontCardListMethodActivity.this.finish();
                        ICJPayFrontCardListService iCJPayFrontCardListService = (ICJPayFrontCardListService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCardListService.class);
                        if (iCJPayFrontCardListService != null && iCJPayFrontCardListService.getFrontCardCallBack() != null) {
                            iCJPayFrontCardListService.getFrontCardCallBack().onClose();
                        }
                    }
                });
                showDialogIfNotNull(defaultBuilder);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 26).isSupported) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8500);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayFrontCardListMethodActivity cJPayFrontCardListMethodActivity = CJPayFrontCardListMethodActivity.this;
                if (!PatchProxy.proxy(new Object[0], cJPayFrontCardListMethodActivity, CJPayFrontCardListMethodActivity.LIZ, false, 11).isSupported && cJPayFrontCardListMethodActivity.LJIIIIZZ != null) {
                    C136319cPC c136319cPC = cJPayFrontCardListMethodActivity.LJIIIIZZ;
                    if (!PatchProxy.proxy(new Object[0], c136319cPC, C136319cPC.LIZ, false, 19).isSupported) {
                        c136319cPC.f18015LJ = false;
                        c136319cPC.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported || !(baseEvent instanceof C135883cIA) || isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onBindCardResult(JSONObject jSONObject) {
        ICJPayFrontCardListService iCJPayFrontCardListService;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 25).isSupported) {
            return;
        }
        if (jSONObject != null && (iCJPayFrontCardListService = (ICJPayFrontCardListService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCardListService.class)) != null && iCJPayFrontCardListService.getFrontCardCallBack() != null) {
            iCJPayFrontCardListService.getFrontCardCallBack().onCardListResult(jSONObject, 1);
        }
        if (!isFinishing()) {
            LIZ();
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.cardlist.p172f.AbstractC2367a
    public final void LIZ(ArrayList<C2364a> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C136319cPC c136319cPC = this.LJIIIIZZ;
        if (!PatchProxy.proxy(new Object[]{arrayList}, c136319cPC, C136319cPC.LIZ, false, 1).isSupported && arrayList != null && arrayList.size() != 0) {
            c136319cPC.LIZIZ.clear();
            c136319cPC.LIZIZ.addAll(arrayList);
            c136319cPC.notifyDataSetChanged();
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MethodCollector.m14708i(520);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(520);
            return;
        }
        GOY.LIZ(this, bundle);
        int i = this.LIZJ;
        if (i != 2 && i != 3) {
            if (i != 4 && i != 5) {
                LJIIJJI = 0;
            } else {
                LJIIJJI = 2;
            }
        } else {
            LJIIJJI = 1;
        }
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
        this.LJIIJ = (C2366a) this.mBasePresenter;
        getWindow().setSoftInputMode(3);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            int i2 = Build.VERSION.SDK_INT;
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            window.getDecorView().setSystemUiVisibility(9728);
        }
        setHalfTranslucent();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            LIZJ();
            if (!PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 16).isSupported && C2366a.LJFF != null) {
                C2366a c2366a = this.LJIIJ;
                if (c2366a != null) {
                    int i3 = this.LIZJ;
                    ArrayList<String> arrayList = this.LJII;
                    c2366a.LIZIZ = i3;
                    c2366a.LIZLLL = arrayList;
                    c2366a.LIZ(this.f25526LJ);
                    this.LJIIJ.LIZIZ();
                    C2366a c2366a2 = this.LJIIJ;
                    if (!PatchProxy.proxy(new Object[0], c2366a2, C2366a.LIZ, false, 10).isSupported) {
                        if (c2366a2.LIZ()) {
                            if (C2366a.LJFF != null) {
                                C136312cP5.LIZ(C2366a.LJFF.paytype_info.quick_pay.cards.size());
                            }
                        } else {
                            C136312cP5.LIZIZ();
                        }
                    }
                }
                LIZ(true, true);
            }
        }
        MethodCollector.m14707o(520);
    }

    public final void LIZ(boolean z, final boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        if (z) {
            this.LJIIIZ.post(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8496);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || CJPayFrontCardListMethodActivity.this.isFinishing()) {
                        return;
                    }
                    if (CJPayFrontCardListMethodActivity.this.LIZIZ == 0) {
                        CJPayBasicUtils.upAndDownAnimation(CJPayFrontCardListMethodActivity.this.LJIIIZ, z2, CJPayFrontCardListMethodActivity.this, (AbstractC137454chW) null);
                    } else if (CJPayFrontCardListMethodActivity.this.LIZIZ == 1) {
                        CJPayBasicUtils.rightInAndRightOutAnimation(CJPayFrontCardListMethodActivity.this.LJIIIZ, z2, CJPayFrontCardListMethodActivity.this, null);
                    }
                }
            });
        } else if (z2) {
            this.LJIIIZ.setVisibility(0);
        } else {
            this.LJIIIZ.setVisibility(8);
        }
    }
}
