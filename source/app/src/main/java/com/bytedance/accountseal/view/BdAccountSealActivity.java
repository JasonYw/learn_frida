package com.bytedance.accountseal.view;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.WebSettings;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.accountseal.AbstractC2520a;
import com.bytedance.accountseal.BdAccountSeal;
import com.bytedance.accountseal.domain.RegionType;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.accountseal.sdk.IProcessor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137557cjB;
import p003X.AbstractC81993ITj;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C137536ciq;
import p003X.C137544ciy;
import p003X.C137545ciz;
import p003X.C137546cj0;
import p003X.C137547cj1;
import p003X.C137562cjG;
import p003X.C137563cjH;
import p003X.C137564cjI;
import p003X.DialogC89838LaS;
import p003X.GOY;
import p003X.PIK;
import p003X.RunnableC137538cis;
import p003X.RunnableC137540ciu;
import p003X.RunnableC137541civ;
import p003X.RunnableC137548cj2;

/* loaded from: classes17.dex */
public final class BdAccountSealActivity extends AppCompatActivity implements AbstractC137557cjB {
    public static ChangeQuickRedirect LIZ;
    public C137536ciq LIZIZ;
    public SealWebView LIZJ;
    public Handler LIZLLL;

    /* renamed from: LJ */
    public boolean f25587LJ;
    public AbstractC2520a LJFF;
    public DialogC89838LaS LJI;
    public boolean LJII;
    public HashMap LJIIIIZZ;

    static {
        Covode.recordClassIndex(9878);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new HashMap();
        }
        View view = (View) this.LJIIIIZZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIIZZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    private void LIZLLL() {
        DialogC89838LaS dialogC89838LaS;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (dialogC89838LaS = this.LJI) != null && dialogC89838LaS.isShowing()) {
            C116971W2r.LIZ(dialogC89838LaS);
        }
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.f25587LJ = true;
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.post(new RunnableC137540ciu(this));
        }
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", System.currentTimeMillis() - C137562cjG.LIZ());
        C137562cjG.LIZIZ.LIZ("self_unpunish_sdk_webView_success", jSONObject);
        this.LJII = true;
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        C137562cjG c137562cjG = C137562cjG.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], c137562cjG, C137562cjG.LIZ, false, 5).isSupported) {
            c137562cjG.LIZ(c137562cjG.LIZIZ());
        }
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.post(new RunnableC137538cis(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && this.LJII) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C2521l.LJIIJ, 2);
                C2521l.LJIIZILJ.LIZ(C2521l.LJIILLIIL, C137544ciy.LIZ(), C2521l.LJIILJJIL, jSONObject, C137544ciy.LIZ(), this.LIZIZ);
            } catch (JSONException e) {
                PIK.LIZ(e);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        LIZLLL();
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.postDelayed(new RunnableC137548cj2(this), 10000L);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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

    @Override // p003X.AbstractC137557cjB
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC2520a abstractC2520a = this.LJFF;
        if (abstractC2520a != null) {
            abstractC2520a.LIZ(str);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC2520a remove;
        byte b;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (BdAccountSeal.INSTANCE.getConfig() == null) {
            finish();
        }
        setContentView(2131689524);
        C137546cj0 c137546cj0 = C137546cj0.LIZLLL;
        int intExtra = getIntent().getIntExtra("request", -1);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intExtra)}, c137546cj0, C137546cj0.LIZ, false, 2);
        if (proxy.isSupported) {
            remove = (AbstractC2520a) proxy.result;
        } else {
            remove = C137546cj0.LIZIZ.remove(Integer.valueOf(intExtra));
        }
        this.LJFF = remove;
        this.LIZLLL = new Handler();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        ((ImageView) LIZ(2131168840)).startAnimation(rotateAnimation);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            this.LIZJ = (SealWebView) LIZ(2131166277);
            SealWebView sealWebView = this.LIZJ;
            if (sealWebView != null) {
                C137563cjH config = BdAccountSeal.INSTANCE.getConfig();
                if (config != null && config.LJFF == RegionType.REGION_BOE) {
                    b = 1;
                } else {
                    b = 0;
                }
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, sealWebView, SealWebView.LIZ, false, 1).isSupported) {
                    WebSettings settings = sealWebView.getSettings();
                    Intrinsics.checkExpressionValueIsNotNull(settings, "");
                    settings.setLoadWithOverviewMode(true);
                    settings.setDomStorageEnabled(true);
                    settings.setAppCacheEnabled(false);
                    settings.setUseWideViewPort(true);
                    settings.setSupportZoom(false);
                    settings.setAllowFileAccessFromFileURLs(false);
                    settings.setLoadsImagesAutomatically(true);
                    settings.setDefaultTextEncodingName("utf-8");
                    settings.setCacheMode(2);
                    settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                    if (b != 0) {
                        int i = Build.VERSION.SDK_INT;
                        settings.setMixedContentMode(0);
                    }
                    sealWebView.setOverScrollMode(2);
                    sealWebView.setScrollContainer(false);
                    sealWebView.setHorizontalScrollBarEnabled(false);
                    sealWebView.setVerticalScrollBarEnabled(false);
                    if (PIK.LIZ()) {
                        sealWebView.setWebChromeClient(sealWebView.LIZLLL);
                    }
                    C116971W2r.LIZ(sealWebView, sealWebView.f25588LJ);
                }
            }
            SealWebView sealWebView2 = this.LIZJ;
            if (sealWebView2 != null) {
                sealWebView2.setCallback(this);
            }
            C137564cjI settingsManager$seal_cnRelease = BdAccountSeal.INSTANCE.getSettingsManager$seal_cnRelease();
            if (settingsManager$seal_cnRelease != null) {
                settingsManager$seal_cnRelease.LIZ(new C137545ciz(this));
            }
        }
        this.LIZIZ = new C137536ciq(this, this.LIZJ);
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C2521l.LJIIJ, i);
        jSONObject.put("msg", str);
        jSONObject.put("duration", System.currentTimeMillis() - C137562cjG.LIZ());
        C137562cjG.LIZIZ.LIZ("self_unpunish_sdk_webView_fail", jSONObject);
        LIZ(4, (String) null);
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        AbstractC2520a abstractC2520a = this.LJFF;
        if (abstractC2520a != null) {
            abstractC2520a.LIZ(i, str);
        }
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.post(new RunnableC137541civ(this));
        }
        StringBuilder sb = new StringBuilder("收到了unblockResult:");
        sb.append(i);
        sb.append(", extra:");
        sb.append(str);
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZ(JSONObject jSONObject, C2521l c2521l) {
        AbstractC81993ITj abstractC81993ITj;
        if (PatchProxy.proxy(new Object[]{jSONObject, c2521l}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c2521l);
        LIZLLL();
        C137563cjH config = BdAccountSeal.INSTANCE.getConfig();
        if (config != null && (abstractC81993ITj = config.LJIIJJI) != null) {
            abstractC81993ITj.LIZ(this, jSONObject, new C137547cj1(c2521l));
            return;
        }
        this.LJI = new DialogC89838LaS(this, jSONObject, c2521l);
        DialogC89838LaS dialogC89838LaS = this.LJI;
        if (dialogC89838LaS != null) {
            C116971W2r.LIZJ(dialogC89838LaS);
        }
    }

    @Override // p003X.AbstractC137557cjB
    public final void LIZ(String str, String str2, String str3, String str4, C2521l c2521l) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, c2521l}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, c2521l);
        StringBuilder sb = new StringBuilder("收到了invokeVerify,verifyType:");
        sb.append(str);
        sb.append(", scene:");
        sb.append(str3);
        sb.append(", callbackId:");
        sb.append(c2521l.LIZLLL);
        sb.append(",params:");
        sb.append(str2);
        Iterator<IProcessor> it = BdAccountSeal.INSTANCE.getProcessors$seal_cnRelease().iterator();
        while (it.hasNext()) {
            IProcessor next = it.next();
            if (!next.process(this, str, str2, str3, str4, c2521l)) {
                Intrinsics.areEqual(next, BdAccountSeal.INSTANCE.getProcessors$seal_cnRelease().getLast());
            } else {
                return;
            }
        }
    }
}
