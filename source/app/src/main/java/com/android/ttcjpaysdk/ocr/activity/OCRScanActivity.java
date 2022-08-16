package com.android.ttcjpaysdk.ocr.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.ICJPayServiceRetCallBack;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.ocr.OCRService;
import com.android.ttcjpaysdk.ocr.view.OCRCodeView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.Iterator;
import org.json.JSONObject;
import p003X.AbstractC137020caV;
import p003X.C108442Smq;
import p003X.C116971W2r;
import p003X.C137017caS;
import p003X.C137021caW;
import p003X.C137022caX;
import p003X.C137023caY;
import p003X.C137024caZ;
import p003X.C137026cab;
import p003X.C137029cae;
import p003X.C137036cal;
import p003X.C138962d5y;
import p003X.C74670FcO;
import p003X.C76765GOh;
import p003X.CountDownTimerC137025caa;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC108768Ss6;
import p003X.View$OnClickListenerC137028cad;
import p003X.View$OnClickListenerC137032cah;
import p003X.View$OnClickListenerC137033cai;
import p003X.View$OnClickListenerC137037cam;

/* loaded from: classes17.dex */
public class OCRScanActivity extends BaseActivity {
    public static ChangeQuickRedirect LIZ;
    public static long LJIIIIZZ;
    public C137017caS LIZIZ;
    public ImageView LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public CountDownTimer f25506LJ;
    public DialogC137460chc LJFF;
    public int LJI = 1;
    public Handler LJII = new Handler();
    public ImageView LJIIIZ;
    public ImageView LJIIJ;
    public CJPayTextLoadingView LJIIJJI;
    public boolean LJIIL;
    public HandlerThread LJIILIIL;
    public Handler LJIILJJIL;

    static {
        Covode.recordClassIndex(7878);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690557;
    }

    public final boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(C137023caY.LIZ().LIZJ);
            int optInt = jSONObject.optInt("min_length");
            int optInt2 = jSONObject.optInt("max_length");
            if (str.length() >= optInt) {
                if (str.length() <= optInt2) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, 0);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        this.LJIIL = true;
        LIZ(15L);
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        try {
            this.LIZIZ.LIZIZ();
        } catch (Throwable unused) {
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        super.onBackPressed();
        LJFF();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && !C138962d5y.LIZ(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
            C138962d5y.LIZ().LIZ(this, 1, strArr, new String[]{""}, new C137026cab(this, strArr));
            return;
        }
        LIZJ();
    }

    /* renamed from: LJ */
    public final void m16044LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        ICJPayServiceRetCallBack iCJPayServiceRetCallBack = C137023caY.LIZ().LIZIZ;
        if (iCJPayServiceRetCallBack != null) {
            iCJPayServiceRetCallBack.onResult(C108442Smq.LIZ("2", "", "", 0), null);
        }
        LIZ("0", System.currentTimeMillis() - LJIIIIZZ);
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        ICJPayServiceRetCallBack iCJPayServiceRetCallBack = C137023caY.LIZ().LIZIZ;
        if (iCJPayServiceRetCallBack != null) {
            iCJPayServiceRetCallBack.onResult(C108442Smq.LIZ("1", "", "", 0), null);
        }
        LIZ("0", System.currentTimeMillis() - LJIIIIZZ);
    }

    public final void LJI() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        String str2 = "";
        if (OCRService.LIZIZ != null) {
            str = OCRService.LIZIZ.merchantId;
        } else {
            str = str2;
        }
        if (OCRService.LIZIZ != null) {
            str2 = OCRService.LIZIZ.appId;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str, str2);
        try {
            LIZ2.put("card_input_type", this.LJI);
            LIZ(LIZ2);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_addbcard_orc_scanning_fail_pop_imp", LIZ2);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        try {
            if (this.f25506LJ != null) {
                this.f25506LJ.cancel();
            }
            C137017caS c137017caS = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c137017caS, C137017caS.LIZ, false, 11).isSupported && c137017caS.LIZJ != null) {
                OCRCodeView oCRCodeView = c137017caS.LIZJ;
                if (!PatchProxy.proxy(new Object[0], oCRCodeView, OCRCodeView.LIZ, false, 16).isSupported) {
                    oCRCodeView.LIZJ();
                    if (!PatchProxy.proxy(new Object[0], oCRCodeView, OCRCodeView.LIZ, false, 12).isSupported) {
                        oCRCodeView.m16043LJ();
                        oCRCodeView.LIZIZ();
                    }
                    if (oCRCodeView.LJIIIIZZ != null) {
                        oCRCodeView.LJIIIIZZ.quit();
                    }
                }
            }
            if (this.LJFF != null) {
                C116971W2r.LIZ(this.LJFF);
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
        try {
            C137017caS c137017caS = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c137017caS, C137017caS.LIZ, false, 9).isSupported && c137017caS.f18120LJ) {
                if (c137017caS.LIZJ != null) {
                    c137017caS.LIZJ.m16043LJ();
                    if (c137017caS.LIZ() != null) {
                        c137017caS.LIZ().stopPreview();
                    }
                }
                c137017caS.LJFF = true;
            }
            C137017caS c137017caS2 = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c137017caS2, C137017caS.LIZ, false, 8).isSupported && c137017caS2.LIZJ != null) {
                c137017caS2.LIZJ.LIZJ();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 23).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 22).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
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

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        if (this.LJIIL) {
            try {
                C137017caS c137017caS = this.LIZIZ;
                if (!PatchProxy.proxy(new Object[0], c137017caS, C137017caS.LIZ, false, 6).isSupported) {
                    c137017caS.f18120LJ = true;
                    if (c137017caS.LIZJ != null) {
                        OCRCodeView oCRCodeView = c137017caS.LIZJ;
                        if (!PatchProxy.proxy(new Object[0], oCRCodeView, OCRCodeView.LIZ, false, 13).isSupported) {
                            oCRCodeView.LIZLLL();
                            oCRCodeView.LIZ();
                        }
                        c137017caS.LIZJ.getCameraPreview().setVisibility(0);
                    }
                }
                C137017caS c137017caS2 = this.LIZIZ;
                if (!PatchProxy.proxy(new Object[0], c137017caS2, C137017caS.LIZ, false, 10).isSupported && c137017caS2.f18120LJ && c137017caS2.LJFF && c137017caS2.LIZJ != null && c137017caS2.LIZJ.getCamera() != null) {
                    c137017caS2.LIZJ.getCamera().startPreview();
                    c137017caS2.LIZJ.LIZLLL();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        View$OnClickListenerC137033cai view$OnClickListenerC137033cai = new View$OnClickListenerC137033cai(this);
        View$OnClickListenerC137032cah view$OnClickListenerC137032cah = new View$OnClickListenerC137032cah(this);
        CJPayDialogBuilder activity = CJPayDialogUtils.getDefaultBuilder(this).setActivity(this);
        activity.setTitle(getString(2131561802));
        activity.setSubTitle(getString(2131561605));
        activity.setLeftBtnStr(getString(2131561799));
        activity.setRightBtnStr(getString(2131561800));
        activity.setLeftBtnListener(view$OnClickListenerC137033cai);
        activity.setRightBtnListener(view$OnClickListenerC137032cah);
        activity.setThemeResId(2131493160);
        this.LJFF = CJPayDialogUtils.initDialog(activity);
        if (!isFinishing()) {
            try {
                C116971W2r.LIZJ(this.LJFF);
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    private void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{15L}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.f25506LJ = new CountDownTimerC137025caa(this, 15000L, 1000L);
        this.f25506LJ.start();
    }

    public final void LIZIZ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 33).isSupported) {
            return;
        }
        String str3 = "";
        if (OCRService.LIZIZ != null) {
            str2 = OCRService.LIZIZ.merchantId;
        } else {
            str2 = str3;
        }
        if (OCRService.LIZIZ != null) {
            str3 = OCRService.LIZIZ.appId;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
        try {
            LIZ2.put("button_name", str);
            LIZ(LIZ2);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_addbcard_orcauth_page_click", LIZ2);
    }

    public final void LIZJ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 36).isSupported) {
            return;
        }
        String str3 = "";
        if (OCRService.LIZIZ != null) {
            str2 = OCRService.LIZIZ.merchantId;
        } else {
            str2 = str3;
        }
        if (OCRService.LIZIZ != null) {
            str3 = OCRService.LIZIZ.appId;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
        LIZ(LIZ2);
        try {
            LIZ2.put("button_name", str);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_addbcard_orc_scanning_page_click", LIZ2);
    }

    public final void LIZLLL(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 38).isSupported) {
            return;
        }
        String str3 = "";
        if (OCRService.LIZIZ != null) {
            str2 = OCRService.LIZIZ.merchantId;
        } else {
            str2 = str3;
        }
        if (OCRService.LIZIZ != null) {
            str3 = OCRService.LIZIZ.appId;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
        try {
            LIZ2.put("card_input_type", this.LJI);
            LIZ2.put("button_name", str);
            LIZ(LIZ2);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_addbcard_orc_scanning_fail_pop_click", LIZ2);
    }

    private void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 39).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(C137023caY.LIZ().LIZLLL);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.getString(next));
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean LIZ2;
        String str;
        String str2;
        String str3;
        String str4;
        MethodCollector.m14708i(482);
        OCRScanActivity oCRScanActivity = this;
        if (PatchProxy.proxy(new Object[]{bundle}, oCRScanActivity, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(482);
            return;
        }
        GOY.LIZ(oCRScanActivity, bundle);
        if (!PatchProxy.proxy(new Object[]{oCRScanActivity, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{oCRScanActivity, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                oCRScanActivity = oCRScanActivity;
                PadCommonServiceImpl.LIZ(false).LIZ(oCRScanActivity, oCRScanActivity.getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (!PatchProxy.proxy(new Object[0], oCRScanActivity, LIZ, false, 11).isSupported) {
            int i = Build.VERSION.SDK_INT;
            Window window = oCRScanActivity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#80000000"));
            window.getDecorView().setSystemUiVisibility(9216);
            C76765GOh.LIZ((Activity) oCRScanActivity, false);
        }
        oCRScanActivity.LIZIZ = new C137017caS();
        oCRScanActivity.LIZIZ.LIZIZ(false);
        LJIIIIZZ = System.currentTimeMillis();
        C137017caS c137017caS = oCRScanActivity.LIZIZ;
        AbstractC137020caV abstractC137020caV = new AbstractC137020caV() { // from class: com.android.ttcjpaysdk.ocr.activity.OCRScanActivity.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7879);
            }

            @Override // p003X.AbstractC137020caV
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                OCRScanActivity.this.LIZ(false);
                OCRScanActivity.this.LIZIZ.LIZJ();
                OCRScanActivity.this.LIZ();
                OCRScanActivity oCRScanActivity2 = OCRScanActivity.this;
                oCRScanActivity2.LJI = 2;
                oCRScanActivity2.LJI();
            }

            @Override // p003X.AbstractC137020caV
            public final void LIZIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                    return;
                }
                OCRScanActivity.this.LIZ(false);
                OCRScanActivity.this.finish();
                C116971W2r.LIZIZ(Toast.makeText(OCRScanActivity.this, 2131561604, 0));
            }

            @Override // p003X.AbstractC137020caV
            public final void LIZ(C137036cal c137036cal, boolean z) {
                if (PatchProxy.proxy(new Object[]{c137036cal, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                OCRScanActivity.this.LIZ(false);
                OCRScanActivity.this.LJI = c137036cal.LIZLLL;
                String str5 = "";
                if (!TextUtils.isEmpty(c137036cal.LIZ)) {
                    str5 = c137036cal.LIZ.replaceAll(" ", str5);
                }
                if (OCRScanActivity.this.LIZ(str5)) {
                    ICJPayServiceRetCallBack iCJPayServiceRetCallBack = C137023caY.LIZ().LIZIZ;
                    if (iCJPayServiceRetCallBack != null) {
                        iCJPayServiceRetCallBack.onResult(C108442Smq.LIZ("0", c137036cal.LIZ, c137036cal.LIZIZ, OCRScanActivity.this.LJI), c137036cal.LIZJ);
                    }
                    OCRScanActivity.this.finish();
                    OCRScanActivity.this.LIZ("1", System.currentTimeMillis() - OCRScanActivity.LJIIIIZZ);
                } else if (z) {
                    LIZ();
                }
            }
        };
        if (!PatchProxy.proxy(new Object[]{oCRScanActivity, 2131192765, abstractC137020caV}, c137017caS, C137017caS.LIZ, false, 1).isSupported) {
            c137017caS.LIZIZ = oCRScanActivity;
            c137017caS.LIZJ = (OCRCodeView) oCRScanActivity.findViewById(2131192765);
            c137017caS.LIZLLL = abstractC137020caV;
            c137017caS.LIZJ.setImageCollectionListener(new C137021caW(c137017caS));
            c137017caS.LJI = new C137022caX();
        }
        oCRScanActivity.LJIIIZ = (ImageView) oCRScanActivity.findViewById(2131167550);
        oCRScanActivity.LJIIIZ.setOnClickListener(new View$OnClickListenerC137037cam(oCRScanActivity));
        oCRScanActivity.LJIIJ = (ImageView) oCRScanActivity.findViewById(2131166314);
        oCRScanActivity.LJIIJ.setOnClickListener(new C137029cae(oCRScanActivity));
        oCRScanActivity.LIZJ = (ImageView) oCRScanActivity.findViewById(2131180767);
        oCRScanActivity.LIZJ.setOnClickListener(new View$OnClickListenerC137028cad(oCRScanActivity));
        int i2 = Build.VERSION.SDK_INT;
        int statusBarHeight = CJPayBasicUtils.getStatusBarHeight(oCRScanActivity);
        OCRScanActivity oCRScanActivity2 = oCRScanActivity;
        oCRScanActivity2.LIZ(oCRScanActivity.LJIIIZ, C108442Smq.LIZ(oCRScanActivity, 9.0f), statusBarHeight, 0, 0);
        oCRScanActivity2.LIZ(oCRScanActivity.LIZJ, 0, statusBarHeight, C108442Smq.LIZ(oCRScanActivity, 12.0f), 0);
        if (!PatchProxy.proxy(new Object[0], oCRScanActivity, LIZ, false, 34).isSupported) {
            if (OCRService.LIZIZ == null) {
                str3 = "";
            } else {
                str3 = OCRService.LIZIZ.merchantId;
            }
            if (OCRService.LIZIZ == null) {
                str4 = "";
            } else {
                str4 = OCRService.LIZIZ.appId;
            }
            JSONObject LIZ3 = CJPayParamsUtils.LIZ(str3, str4);
            oCRScanActivity.LIZ(LIZ3);
            C2118a.LIZ().LIZ("wallet_addbcard_orc_scanning_page_jmp", LIZ3);
        }
        oCRScanActivity.LJIIJJI = (CJPayTextLoadingView) oCRScanActivity.findViewById(2131184410);
        oCRScanActivity.LJIIJJI.setPayMessage(oCRScanActivity.getString(2131561797));
        if (!PatchProxy.proxy(new Object[0], oCRScanActivity, LIZ, false, 4).isSupported) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (!PatchProxy.proxy(new Object[0], oCRScanActivity, LIZ, false, 18).isSupported) {
                    if (C138962d5y.LIZ(oCRScanActivity, "android.permission.CAMERA")) {
                        oCRScanActivity.LIZIZ.LIZIZ(true);
                        oCRScanActivity.LIZLLL();
                    } else {
                        if (!PatchProxy.proxy(new Object[0], oCRScanActivity, LIZ, false, 32).isSupported) {
                            if (OCRService.LIZIZ == null) {
                                str = "";
                            } else {
                                str = OCRService.LIZIZ.merchantId;
                            }
                            if (OCRService.LIZIZ == null) {
                                str2 = "";
                            } else {
                                str2 = OCRService.LIZIZ.appId;
                            }
                            JSONObject LIZ4 = CJPayParamsUtils.LIZ(str, str2);
                            oCRScanActivity.LIZ(LIZ4);
                            C2118a.LIZ().LIZ("wallet_addbcard_orcauth_page_imp", LIZ4);
                        }
                        C138962d5y LIZ5 = C138962d5y.LIZ();
                        C137024caZ c137024caZ = new C137024caZ(oCRScanActivity);
                        oCRScanActivity = oCRScanActivity;
                        LIZ5.LIZ(oCRScanActivity, 1, new String[]{"android.permission.CAMERA"}, new String[]{""}, c137024caZ);
                    }
                }
            } else {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C74670FcO.LIZ, true, 1);
                if (proxy.isSupported) {
                    LIZ2 = ((Boolean) proxy.result).booleanValue();
                } else {
                    LIZ2 = C74670FcO.LIZ("VIVO");
                }
                if (LIZ2 && Build.VERSION.SDK_INT == 21 && !C108442Smq.LIZ()) {
                    oCRScanActivity.finish();
                    C116971W2r.LIZIZ(Toast.makeText(oCRScanActivity, 2131561604, 0));
                } else {
                    oCRScanActivity.LIZIZ.LIZIZ(true);
                    oCRScanActivity.LIZLLL();
                }
            }
        }
        oCRScanActivity.LJIILIIL = new HandlerThread("OCR Image Thread");
        oCRScanActivity.LJIILIIL.start();
        oCRScanActivity.LJIILJJIL = new Handler(oCRScanActivity.LJIILIIL.getLooper());
        MethodCollector.m14707o(482);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        if (z) {
            this.LJIIJJI.show();
        } else {
            this.LJIIJJI.hide();
        }
    }

    public final void LIZ(String str, long j) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZ, false, 35).isSupported) {
            return;
        }
        String str3 = "";
        if (OCRService.LIZIZ != null) {
            str2 = OCRService.LIZIZ.merchantId;
        } else {
            str2 = str3;
        }
        if (OCRService.LIZIZ != null) {
            str3 = OCRService.LIZIZ.appId;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
        try {
            LIZ2.put("result", str);
            LIZ2.put("card_input_type", this.LJI);
            LIZ2.put("stay_time", j);
            LIZ(LIZ2);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_addbcard_orc_scanning_result", LIZ2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0 && !PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 15).isSupported) {
                LIZ(true);
                this.LJIILJJIL.post(new RunnableC108768Ss6(this, intent));
            }
        } else if (i2 == 0) {
            CountDownTimer countDownTimer = this.f25506LJ;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
            this.LIZIZ.LIZLLL();
            this.LIZIZ.LIZ(true);
        }
    }

    private void LIZ(View view, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0}, this, LIZ, false, 10).isSupported) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, 0);
        view.setLayoutParams(layoutParams);
    }
}
