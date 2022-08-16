package com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.INormalBindCardCallback;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.activity.CJPayLimitErrorActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayLynxBindCardSchemeInfo;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPayMarketingBean;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPayMyBankCardResponseBean;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b.C2383a;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b.C2384b;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p174c.C2385a;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a;
import com.android.ttcjpaysdk.thirdparty.view.CJPayCustomRoundCornerImageView;
import com.android.ttcjpaysdk.thirdparty.view.CJPayNetworkErrorView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135272c8J;
import p003X.C135565cD2;
import p003X.C135581cDI;
import p003X.C135595cDW;
import p003X.C135596cDX;
import p003X.C135597cDY;
import p003X.C135598cDZ;
import p003X.C135604cDf;
import p003X.C135606cDh;
import p003X.C135607cDi;
import p003X.C135608cDj;
import p003X.C135609cDk;
import p003X.C135610cDl;
import p003X.C135611cDm;
import p003X.C135612cDn;
import p003X.C135614cDp;
import p003X.C135617cDs;
import p003X.C135734cFl;
import p003X.C135737cFo;
import p003X.C135876cI3;
import p003X.C135883cIA;
import p003X.C135983cJm;
import p003X.C136035cKc;
import p003X.C136182cMz;
import p003X.C136992ca3;
import p003X.C137459chb;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC135601cDc;
import p003X.RunnableC135602cDd;
import p003X.RunnableC135605cDg;
import p003X.View$OnClickListenerC135599cDa;
import p003X.View$OnClickListenerC135600cDb;
import p003X.View$OnClickListenerC135603cDe;

/* loaded from: classes17.dex */
public class CJPayBankCardActivity extends AbstractActivityC135987cJq<C2385a, C2383a> implements INormalBindCardCallback, AbstractC2386a {
    public static ChangeQuickRedirect LIZ;
    public static final String LJIIL;
    public static final String LJIILIIL;
    public TextView LIZIZ;
    public TextView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25536LJ;
    public CJPayTextLoadingView LJFF;
    public DialogC137460chc LJI;
    public RelativeLayout LJII;
    public FrameLayout LJIIIIZZ;
    public CJPayHostInfo LJIIIZ;
    public C2383a LJIIJ;
    public CJPayMyBankCardResponseBean LJIIJJI;
    public RelativeLayout LJIILJJIL;
    public NestedScrollView LJIILL;
    public LinearLayout LJIILLIIL;
    public TextView LJIIZILJ;
    public ExtendRecyclerView LJIJ;
    public LinearLayout LJIJI;
    public LinearLayout LJIJJ;
    public RelativeLayout LJIJJLI;
    public LinearLayout LJIL;
    public LinearLayout LJJ;
    public CJPayCustomRoundCornerImageView LJJI;
    public C135581cDI LJJIFFI;
    public LinearLayout LJJII;
    public TextView LJJIII;
    public View LJJIIJ;
    public CJPayNetworkErrorView LJJIIZI;
    public JSONObject LJJIJIIJI;
    public C2385a LJJIJLIJ;
    public ArrayList<CJPayCard> LJJIIJZLJL = new ArrayList<>();
    public boolean LJJIIZ = false;
    public int LJJIJ = 0;
    public boolean LJJIJIIJIL = false;
    public boolean LJJIJIL = false;
    public boolean LJJIJL = false;

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690612;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public String getSources() {
        return "绑卡";
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initViews() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void next() {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        this.LJJIIZ = true;
        this.LJFF.show();
        if (CJPayBasicUtils.isNetworkAvailable(this)) {
            m16031LJ(z2);
        } else {
            LIZLLL(false);
        }
    }

    public final void LIZ(JSONObject jSONObject, boolean z, boolean z2, String str, String str2, boolean z3) {
        Fragment LIZ2;
        if (!PatchProxy.proxy(new Object[]{jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, str2, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 26).isSupported && (LIZ2 = C135983cJm.LIZIZ.LIZ(this, jSONObject, ICJPayNormalBindCardService.SourceType.MyBindCardTwo, z, true, z2, str, str2, z3)) != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(2131187008, LIZ2);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void LIZ(boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 34).isSupported) {
            return;
        }
        if (TextUtils.equals(C136035cKc.LJI().LIZ(true), "lynx")) {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported || !CJPayBasicUtils.isClickValid() || isFinishing()) {
                return;
            }
            if (!CJPayBasicUtils.isNetworkAvailable(this)) {
                CJPayBasicUtils.displayToast(this, getStringRes(CJPayHostInfo.applicationContext, 2131558456));
                return;
            }
            CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean = this.LJIIJJI;
            if (cJPayMyBankCardResponseBean != null && !TextUtils.isEmpty(cJPayMyBankCardResponseBean.bind_top_page_url)) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 36);
                if (proxy.isSupported) {
                    str = (String) proxy.result;
                } else {
                    CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean2 = this.LJIIJJI;
                    if (cJPayMyBankCardResponseBean2 == null || TextUtils.isEmpty(cJPayMyBankCardResponseBean2.bind_top_page_url) || this.LJIIIZ == null) {
                        str = "";
                    } else {
                        CJPayLynxBindCardSchemeInfo cJPayLynxBindCardSchemeInfo = new CJPayLynxBindCardSchemeInfo();
                        cJPayLynxBindCardSchemeInfo.url = this.LJIIJJI.bind_top_page_url;
                        cJPayLynxBindCardSchemeInfo.source = LJIIL;
                        cJPayLynxBindCardSchemeInfo.tea_source = LJIILIIL;
                        str = cJPayLynxBindCardSchemeInfo.buildScheme();
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    LIZ(str);
                    return;
                }
            }
            LJI(false);
            return;
        }
        LJI(false);
    }

    private void LIZLLL() {
        LinearLayout linearLayout;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (linearLayout = this.LJIJJ) != null && this.LJJIIJZLJL != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2384b();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135610cDl.class, C135612cDn.class, C135611cDm.class, C135883cIA.class, C135614cDp.class};
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
        this.LJJIJL = false;
    }

    public final String LIZ() {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = this.LJJIJIIJI;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("response")) != null && (optJSONObject2 = optJSONObject.optJSONObject("one_key_copywriting_info")) != null) {
            return optJSONObject2.optString("display_desc");
        }
        return "";
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported || isFinishing()) {
            return;
        }
        this.LJFF.hide();
        this.LJJIIJ.setVisibility(8);
        LIZJ(false);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZJ() {
        C2383a c2383a;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported && (c2383a = this.LJIIJ) != null) {
            c2383a.LIZJ();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIIIZ = C135876cI3.f17973LJ.LJIIIIZZ();
        this.LJJIJLIJ = (C2385a) this.mBasePresenter;
        this.LJIIJ = this.mvpLogger;
        setTitleText(getStringRes(CJPayHostInfo.applicationContext, 2131561778), C135272c8J.LIZIZ(this, 2130772622));
        LIZ(false, true);
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        this.LJJIJL = true;
        this.LJJIIJ.setVisibility(8);
        if (this.LJJIJIL) {
            CJPayBasicUtils.displayToast(this, getStringRes(CJPayHostInfo.applicationContext, 2131561503));
            this.LJJIJIL = false;
        }
    }

    static {
        String str;
        Covode.recordClassIndex(8702);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            str = (String) proxy.result;
        } else if (TextUtils.equals(C136035cKc.LJI().LIZ(true), "default")) {
            str = "wallet_bcard_manage";
        } else {
            str = C136992ca3.LIZ().LJIIL().source;
        }
        LJIIL = str;
        LJIILIIL = C136992ca3.LIZ().LJIIL().tea_sourch_lynx;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJJIIJ.setOnClickListener(new View.OnClickListener(this) { // from class: com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayBankCardActivity.1
            static {
                Covode.recordClassIndex(8703);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.LJIJI.setOnClickListener(new C135609cDk(this));
        this.LJJIII.setOnClickListener(new C135595cDW(this));
        this.LJJI.setOnClickListener(new C135606cDh(this));
        this.LJIJJLI.setOnClickListener(new C135607cDi(this));
        this.LJJIIZI.setOnRefreshBenClickListener(new C135604cDf(this));
        this.LJJIFFI.f17935LJ = new C135597cDY(this);
        this.LJIL.setOnClickListener(new View$OnClickListenerC135599cDa(this));
        this.LJJ.setOnClickListener(new View$OnClickListenerC135600cDb(this));
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        C2385a c2385a = this.LJJIJLIJ;
        if (c2385a != null && c2385a.mModel != 0) {
            this.LJJIJLIJ.mModel.LIZ();
        }
        C135581cDI c135581cDI = this.LJJIFFI;
        if (c135581cDI != null) {
            c135581cDI.f17935LJ = null;
            c135581cDI.LIZIZ = "";
        }
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null) {
            iCJPayNormalBindCardService.release();
        }
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_mycard_enter");
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 51).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 50).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 53).isSupported) {
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
    public void bindViews() {
        MethodCollector.m14708i(533);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(533);
            return;
        }
        this.LJJIIZI = (CJPayNetworkErrorView) findViewById(2131170160);
        this.LJIILJJIL = (RelativeLayout) findViewById(2131188077);
        this.LJIILLIIL = (LinearLayout) findViewById(2131169767);
        this.LJIIZILJ = (TextView) findViewById(2131169825);
        this.LIZIZ = (TextView) findViewById(2131169726);
        this.LJIJ = (ExtendRecyclerView) findViewById(2131169702);
        this.LJIJ.setLayoutManager(new LinearLayoutManager(this));
        this.LJIJ.setNestedScrollingEnabled(false);
        View inflate = getLayoutInflater().inflate(2131690717, (ViewGroup) null);
        getContext();
        int dipToPX = CJPayBasicUtils.dipToPX(this, 80.0f);
        getContext();
        this.LJJIFFI = new C135581cDI(this, dipToPX, CJPayBasicUtils.dipToPX(this, 20.0f));
        this.LJJIFFI.LIZIZ = "my_cards";
        this.LJIJJ = (LinearLayout) inflate.findViewById(2131169693);
        this.LIZJ = (TextView) inflate.findViewById(2131169726);
        this.LJIJJ.setVisibility(0);
        this.LJIJI = (LinearLayout) inflate.findViewById(2131169692);
        C135983cJm.LIZIZ.LIZ((Activity) this, (View) this.LJIJI);
        this.LJJIII = (TextView) findViewById(2131169686);
        this.LJJII = (LinearLayout) findViewById(2131165769);
        this.LJIJ.LIZJ(this.LJIJJ);
        this.LJFF = (CJPayTextLoadingView) findViewById(2131169916);
        this.LJJIIJ = findViewById(2131196914);
        this.LJJIIJ.setVisibility(8);
        this.LJIIIIZZ = (FrameLayout) findViewById(2131182685);
        this.LJII = (RelativeLayout) findViewById(2131187008);
        this.LJIJJLI = (RelativeLayout) findViewById(2131169823);
        this.LJIL = (LinearLayout) findViewById(2131169822);
        this.LJJ = (LinearLayout) findViewById(2131169697);
        this.LIZLLL = (TextView) findViewById(2131169698);
        this.f25536LJ = (TextView) findViewById(2131169870);
        this.f25536LJ.setText(2131561494);
        this.LJJI = (CJPayCustomRoundCornerImageView) findViewById(2131170053);
        this.LJIJ.setAdapter(this.LJJIFFI);
        this.LJIILL = (NestedScrollView) findViewById(2131169705);
        C135983cJm.LIZIZ.LIZ((Activity) this, (ViewGroup) this.LJIJJLI);
        MethodCollector.m14707o(533);
    }

    private void LIZIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported && this.mSwipeToFinishView != null) {
            this.mSwipeToFinishView.setEnableSwipe(z);
        }
    }

    private void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.blockNaviBack = z;
        LIZIZ(!z ? 1 : 0);
    }

    private void LIZLLL(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        LIZJ(false);
        this.LJJIIJ.setVisibility(8);
        this.LJFF.hide();
        CJPayNetworkErrorView cJPayNetworkErrorView = this.LJJIIZI;
        if (cJPayNetworkErrorView != null) {
            cJPayNetworkErrorView.setVisibility(0);
        }
    }

    /* renamed from: LJ */
    private void m16031LJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 24).isSupported) {
            return;
        }
        if (this.LJJIIZ) {
            this.LJJIIJ.setVisibility(0);
        }
        LJFF(z);
    }

    private void LJFF(boolean z) {
        C2385a c2385a;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 25).isSupported && (c2385a = this.LJJIJLIJ) != null) {
            c2385a.LIZ(z);
            LIZJ(true);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onBindCardResult(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJFF.hide();
        this.LJJIIJ.setVisibility(8);
        LIZJ(false);
    }

    @Override // com.android.ttcjpaysdk.base.service.INormalBindCardCallback
    public void onEntranceResult(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJFF.hide();
        this.LJJIIJ.setVisibility(8);
        LIZJ(false);
    }

    private void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 37).isSupported) {
            return;
        }
        try {
            String str2 = new String(str.getBytes(), "utf-8");
            if (C2118a.LIZ().f25443LJ != null) {
                C2118a.LIZ().f25443LJ.openScheme(this, str2);
            } else if (C2118a.LIZ().LIZLLL != null) {
                C2118a.LIZ().LIZLLL.openScheme(str2);
            }
        } catch (Exception unused) {
            this.LJFF.hide();
            this.LJJIIJ.setVisibility(8);
        }
    }

    private void LJI(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 33).isSupported && CJPayBasicUtils.isClickValid() && !isFinishing()) {
            if (!CJPayBasicUtils.isNetworkAvailable(this)) {
                CJPayBasicUtils.displayToast(this, getStringRes(CJPayHostInfo.applicationContext, 2131558456));
                return;
            }
            this.LJJIIZ = true;
            if (this.LJJIIZ) {
                this.LJJIIJ.setVisibility(0);
            }
            this.LJFF.show();
            LIZJ(true);
            LJII(z);
        }
    }

    private void LJII(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 38).isSupported) {
            return;
        }
        C2383a c2383a = this.LJIIJ;
        if (c2383a != null) {
            c2383a.LIZIZ();
        }
        ICJPayNormalBindCardService iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        if (iCJPayNormalBindCardService != null && this.LJIIJJI != null) {
            NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
            normalBindCardBean.setNeedAuthGuide(Boolean.valueOf(this.LJIIJJI.need_auth_guide));
            normalBindCardBean.setSource(LJIIL);
            normalBindCardBean.setBizOrderType("card_sign");
            normalBindCardBean.setBindSourceType(4);
            normalBindCardBean.setCardBinAutoFocus(Boolean.valueOf(z));
            normalBindCardBean.setHostInfoJSON(CJPayHostInfo.LIZIZ(this.LJIIIZ));
            normalBindCardBean.setFront(true);
            normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.MyBindCard);
            iCJPayNormalBindCardService.startBindCardProcess(this, ICJPayNormalBindCardService.BindCardType.TYPE_MY_BANK_CARD, normalBindCardBean, this);
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZIZ(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 45).isSupported) {
            return;
        }
        if (jSONObject != null) {
            if (!PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 31).isSupported && jSONObject.has("response")) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("response");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("one_key_banks")) != null) {
                        this.LJJIJ = optJSONArray.length();
                        if (this.LJIIJ != null) {
                            this.LJIIJ.LIZJ = optJSONArray;
                            this.LJIIJ.LJFF = this.LJJIJ;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.LJJIJIIJI = jSONObject;
        }
        runOnUiThread(new RunnableC135602cDd(this));
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        supportMultipleTheme();
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        LIZIZ(true);
        C135734cFl.LIZ("wallet_bcard_manage");
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZ(CJPayMarketingBean cJPayMarketingBean) {
        if (!PatchProxy.proxy(new Object[]{cJPayMarketingBean}, this, LIZ, false, 48).isSupported && cJPayMarketingBean != null) {
            if (!PatchProxy.proxy(new Object[]{cJPayMarketingBean}, this, LIZ, false, 27).isSupported) {
                C135617cDs c135617cDs = new C135617cDs();
                if (!isFinishing()) {
                    this.LJIIIIZZ.setVisibility(0);
                    this.LJII.setVisibility(8);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("marketing_bank_card_info", cJPayMarketingBean);
                    c135617cDs.setArguments(bundle);
                    FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                    beginTransaction.replace(2131182685, c135617cDs);
                    beginTransaction.commitAllowingStateLoss();
                    this.LJIILL.setOnScrollChangeListener(new C135608cDj(this, c135617cDs));
                }
            }
            C2383a c2383a = this.LJIIJ;
            if (c2383a != null) {
                c2383a.LIZJ();
            }
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (baseEvent instanceof C135610cDl) {
            C135610cDl c135610cDl = (C135610cDl) baseEvent;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c135610cDl, C135610cDl.LIZ, false, 1);
            if (!proxy.isSupported ? !(c135610cDl.LIZIZ != 1 || TextUtils.isEmpty(c135610cDl.LIZJ)) : ((Boolean) proxy.result).booleanValue()) {
                CJPayBasicUtils.displayToast(this, c135610cDl.LIZJ);
            }
            LIZ(false, false);
        } else if (baseEvent instanceof C135612cDn) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                if (this.LJJIJL) {
                    CJPayBasicUtils.displayToast(this, getStringRes(CJPayHostInfo.applicationContext, 2131561503));
                    this.LJJIJIL = false;
                } else {
                    this.LJJIJIL = true;
                }
                LIZ(false, false);
            }
        } else if (baseEvent instanceof C135611cDm) {
            if (((C135611cDm) baseEvent).LIZ == C135611cDm.LIZIZ) {
                LJI(false);
            }
        } else if (baseEvent instanceof C135614cDp) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
                EventManager.INSTANCE.notify(new C135565cD2());
                EventManager.INSTANCE.notify(new C135612cDn());
                LIZ(false, false);
                this.LJFF.hide();
                this.LJJIIJ.setVisibility(8);
                LIZJ(false);
            }
        } else if (!(baseEvent instanceof C135883cIA) || isFinishing()) {
        } else {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZ(JSONObject jSONObject) {
        String optString;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 43).isSupported) {
            return;
        }
        C2383a c2383a = this.LJIIJ;
        if (c2383a != null) {
            c2383a.LIZJ();
        }
        if (this.LJJIIZ) {
            LIZLLL(true);
        }
        C2383a c2383a2 = this.LJIIJ;
        if (c2383a2 != null) {
            String str = "";
            if (jSONObject == null) {
                optString = str;
            } else {
                optString = jSONObject.optString(PushMessageHelper.ERROR_MESSAGE);
                str = jSONObject.optString("error_code");
            }
            c2383a2.LIZ(optString, str);
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZ(CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean, boolean z) {
        String str;
        String str2;
        String str3;
        String[] strArr;
        JSONObject jSONObject;
        CJPayNetworkErrorView cJPayNetworkErrorView;
        if (PatchProxy.proxy(new Object[]{cJPayMyBankCardResponseBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 44).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (cJPayNetworkErrorView = this.LJJIIZI) != null) {
            cJPayNetworkErrorView.setVisibility(8);
        }
        this.LJIIJJI = cJPayMyBankCardResponseBean;
        if (cJPayMyBankCardResponseBean != null) {
            if (cJPayMyBankCardResponseBean.isResponseOK()) {
                this.LJJII.setVisibility(0);
                int i = !cJPayMyBankCardResponseBean.member.is_authed ? 1 : 0;
                boolean z2 = cJPayMyBankCardResponseBean.member.is_set_pwd;
                C135596cDX.LIZIZ = i;
                C135596cDX.LIZJ = z2 ? 1 : 0;
                CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.MY_CARD, CJPayPageLoadTrace.Section.RENDERING);
                if (cJPayMyBankCardResponseBean.member.card_list.size() > 0) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                C2383a c2383a = this.LJIIJ;
                if (c2383a != null) {
                    if (!PatchProxy.proxy(new Object[]{cJPayMyBankCardResponseBean}, c2383a, C2383a.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(cJPayMyBankCardResponseBean);
                        c2383a.LIZIZ = cJPayMyBankCardResponseBean;
                    }
                    C2383a c2383a2 = this.LJIIJ;
                    if (!PatchProxy.proxy(new Object[]{str3}, c2383a2, C2383a.LIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(str3);
                        c2383a2.f25538LJ = str3;
                    }
                }
                if (!z && !PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported && !isFinishing() && this.LJIIJJI != null && this.LJJIJIIJIL && (jSONObject = this.LJJIJIIJI) != null) {
                    LIZ(C136182cMz.LIZ(jSONObject), this.LJIIJJI.member.is_authed, this.LJIIJJI.member.is_set_pwd, this.LJIIJJI.member.mobile_mask, this.LJIIJJI.member.smch_id, this.LJIIJJI.need_auth_guide);
                }
                for (int i2 = 0; i2 < cJPayMyBankCardResponseBean.member.card_list.size(); i2++) {
                    C135983cJm c135983cJm = C135983cJm.LIZIZ;
                    String str4 = cJPayMyBankCardResponseBean.member.card_list.get(i2).background_color;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str4}, c135983cJm, C135983cJm.LIZ, false, 4);
                    if (proxy.isSupported) {
                        strArr = (String[]) proxy.result;
                    } else {
                        C106862S5w.LIZ(str4);
                        strArr = new String[]{"#dd4a51", "#e95259"};
                        if (!TextUtils.isEmpty(str4) && StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) Constants.ACCEPT_TIME_SEPARATOR_SP, false, 2, (Object) null)) {
                            Object[] array = new Regex(Constants.ACCEPT_TIME_SEPARATOR_SP).split(str4, 0).toArray(new String[0]);
                            if (array != null) {
                                String[] strArr2 = (String[]) array;
                                if (strArr2.length == 2 && strArr2[0].length() == 6 && strArr2[1].length() == 6) {
                                    strArr[0] = C0002O.m25086C("#", strArr2[0]);
                                    strArr[1] = C0002O.m25086C("#", strArr2[1]);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    cJPayMyBankCardResponseBean.member.card_list.get(i2).start_color = strArr[0];
                    cJPayMyBankCardResponseBean.member.card_list.get(i2).end_color = strArr[1];
                }
                if (!PatchProxy.proxy(new Object[]{cJPayMyBankCardResponseBean}, this, LIZ, false, 32).isSupported) {
                    if (cJPayMyBankCardResponseBean.member.card_list.size() > 0) {
                        if (!PatchProxy.proxy(new Object[]{cJPayMyBankCardResponseBean}, this, LIZ, false, 22).isSupported && !isFinishing()) {
                            C135983cJm.LIZIZ.LIZ((Activity) this, (ViewGroup) this.LJIILLIIL);
                            this.LJJIIJZLJL.clear();
                            if (cJPayMyBankCardResponseBean.member.card_list.size() > 3) {
                                this.LJIIZILJ.setVisibility(0);
                                if (CJPayHostInfo.applicationContext != null) {
                                    this.LJIIZILJ.setText(CJPayHostInfo.applicationContext.getResources().getString(2131561777, String.valueOf(cJPayMyBankCardResponseBean.member.card_list.size())));
                                }
                                this.LJIIZILJ.setOnClickListener(new C135598cDZ(this, cJPayMyBankCardResponseBean));
                                this.LJJIIJZLJL.addAll(cJPayMyBankCardResponseBean.member.card_list.subList(0, 3));
                            } else {
                                this.LJIIZILJ.setVisibility(8);
                                this.LJJIIJZLJL.addAll(cJPayMyBankCardResponseBean.member.card_list);
                            }
                            this.LJJIFFI.LIZ(this.LJJIIJZLJL);
                            this.LJJIFFI.LIZJ = cJPayMyBankCardResponseBean.need_show_unbind;
                            this.LJJIFFI.LIZLLL = cJPayMyBankCardResponseBean.unbind_url;
                            this.LJIILLIIL.setVisibility(0);
                            if (C135983cJm.LIZIZ.LIZ()) {
                                this.LJJ.setVisibility(0);
                                C2383a c2383a3 = this.LJIIJ;
                                if (c2383a3 != null) {
                                    c2383a3.LIZ(this.LIZLLL.getText().toString(), true, false);
                                }
                            }
                            this.LJIL.setVisibility(8);
                            this.LJIJJLI.setVisibility(8);
                            this.LJIILJJIL.setVisibility(8);
                            LIZLLL();
                            CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.MY_CARD, CJPayPageLoadTrace.Section.END);
                            return;
                        }
                        return;
                    } else if (!PatchProxy.proxy(new Object[]{cJPayMyBankCardResponseBean}, this, LIZ, false, 21).isSupported) {
                        C135983cJm.LIZIZ.LIZ((Activity) this, (ViewGroup) this.LJIJJLI);
                        this.LJJIIJZLJL.clear();
                        this.LJJIJ = 0;
                        C2383a c2383a4 = this.LJIIJ;
                        if (c2383a4 != null) {
                            c2383a4.LJFF = this.LJJIJ;
                        }
                        this.LJJIFFI.LIZ(this.LJJIIJZLJL);
                        this.LJJIFFI.LIZJ = false;
                        this.LJIILLIIL.setVisibility(8);
                        this.LJJ.setVisibility(8);
                        if (C135983cJm.LIZIZ.LIZ()) {
                            this.LJIL.setVisibility(0);
                            C2383a c2383a5 = this.LJIIJ;
                            if (c2383a5 != null) {
                                c2383a5.LIZ(this.f25536LJ.getText().toString(), false, false);
                            }
                        }
                        this.LJIJJLI.setVisibility(0);
                        if (cJPayMyBankCardResponseBean.member != null && !cJPayMyBankCardResponseBean.member.is_authed) {
                            this.LJIILJJIL.setVisibility(0);
                        }
                        LIZLLL();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } else if (cJPayMyBankCardResponseBean.button_info.isGoCustomerServiceDialog()) {
                C135737cFo.LIZ().LIZ(cJPayMyBankCardResponseBean.button_info).LIZ(cJPayMyBankCardResponseBean.code, cJPayMyBankCardResponseBean.msg).LIZ(this.LJIIIZ).LIZ(this).LIZ().LIZIZ();
                return;
            } else if ("GW400008".equals(cJPayMyBankCardResponseBean.code)) {
                String stringRes = getStringRes(CJPayHostInfo.applicationContext, 2131561791);
                if (!PatchProxy.proxy(new Object[]{stringRes}, this, LIZ, false, 41).isSupported && stringRes != null && !isFinishing()) {
                    C137459chb c137459chb = new C137459chb(this, 2131493160);
                    c137459chb.LIZ(stringRes);
                    c137459chb.LIZLLL(getStringRes(CJPayHostInfo.applicationContext, 2131561709));
                    c137459chb.LIZJ(new View$OnClickListenerC135603cDe(this));
                    this.LJI = c137459chb.LIZ();
                    C116971W2r.LIZJ(this.LJI);
                    return;
                }
                return;
            }
        }
        String str5 = "";
        if (cJPayMyBankCardResponseBean != null && cJPayMyBankCardResponseBean.code.length() >= 6 && "4009".equals(cJPayMyBankCardResponseBean.code.substring(2, 6))) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
                CJPayHostInfo cJPayHostInfo = this.LJIIIZ;
                if (cJPayHostInfo != null) {
                    str2 = cJPayHostInfo.appId;
                } else {
                    str2 = str5;
                }
                CJPayHostInfo cJPayHostInfo2 = this.LJIIIZ;
                if (cJPayHostInfo2 != null) {
                    str5 = cJPayHostInfo2.merchantId;
                }
                CJPayLimitErrorActivity.LIZIZ.LIZ(this, "查询卡列表", str5, str2);
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC135605cDg(this), 500L);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LJJIIZ) {
            if (cJPayMyBankCardResponseBean != null && !TextUtils.isEmpty(cJPayMyBankCardResponseBean.msg) && !isFinishing()) {
                CJPayBasicUtils.displayToastInternal(this, cJPayMyBankCardResponseBean.msg, 1);
            } else {
                LIZLLL(true);
            }
        }
        C2383a c2383a6 = this.LJIIJ;
        if (c2383a6 != null) {
            if (cJPayMyBankCardResponseBean == null) {
                str = str5;
            } else {
                str = cJPayMyBankCardResponseBean.msg;
                str5 = cJPayMyBankCardResponseBean.code;
            }
            c2383a6.LIZ(str, str5);
        }
    }

    @Override // com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a
    public final void LIZ(JSONObject jSONObject, boolean z) {
        if (PatchProxy.proxy(new Object[]{jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 47).isSupported) {
            return;
        }
        this.LJJIJIIJIL = z;
        C2383a c2383a = this.LJIIJ;
        if (c2383a != null) {
            c2383a.LIZLLL = this.LJJIJIIJIL;
        }
        runOnUiThread(new RunnableC135601cDc(this, jSONObject));
    }
}
