package com.android.ttcjpaysdk.ttcjpayactivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C137142ccU;
import p003X.C137346cfm;
import p003X.GOY;

/* loaded from: classes17.dex */
public class TTCJPayTransActivity extends BaseActivity {
    public static ChangeQuickRedirect LIZ;
    public TTCJPayResult LIZIZ;
    public Map<String, String> LIZJ;
    public Map<String, String> LIZLLL;
    public boolean LJFF;
    public Map<String, String> LJI;
    public int LJIIIIZZ;
    public boolean LJIIJ;
    public HashMap<String, String> LJIIJJI;

    /* renamed from: LJ */
    public String f25552LJ = AdvanceSetting.CLEAR_NOTIFICATION;
    public String LJII = "";
    public int LJIIIZ = 1;
    public TTCJPayObserver LJIIL = new TTCJPayObserver() { // from class: com.android.ttcjpaysdk.ttcjpayactivity.TTCJPayTransActivity.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9281);
        }

        @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
        public final void onEvent(String str, Map<String, String> map) {
        }

        @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
        public final void onMonitor(String str, int i, JSONObject jSONObject) {
        }

        @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
        public final void onWebViewInit(WeakReference<WebView> weakReference) {
        }

        @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
        public final void onPayCallback(TTCJPayResult tTCJPayResult) {
            if (PatchProxy.proxy(new Object[]{tTCJPayResult}, this, LIZ, false, 1).isSupported) {
                return;
            }
            TTCJPayTransActivity tTCJPayTransActivity = TTCJPayTransActivity.this;
            tTCJPayTransActivity.LIZIZ = tTCJPayResult;
            int code = tTCJPayTransActivity.LIZIZ.getCode();
            if (code != 0) {
                if (code != 108) {
                    if (code != 109 && code != 112 && code != 113) {
                        switch (code) {
                            case BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                                break;
                            default:
                                return;
                        }
                    }
                } else {
                    TTCJPayUtils.getInstance().updateLoginStatus(2);
                    Intent intent = new Intent(TTCJPayTransActivity.this, TTCJPayTransActivity.class);
                    intent.setFlags(603979776);
                    C116971W2r.LIZIZ(TTCJPayTransActivity.this, intent);
                    return;
                }
            }
            Intent intent2 = new Intent(TTCJPayTransActivity.this, TTCJPayTransActivity.class);
            intent2.setFlags(603979776);
            C116971W2r.LIZIZ(TTCJPayTransActivity.this, intent2);
        }
    };

    static {
        Covode.recordClassIndex(9280);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690555;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public boolean isActivityPortrait() {
        return false;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        if (this.LIZIZ != null) {
            Intent intent = new Intent();
            intent.putExtra("TTCJPayKeyPayResultParams", this.LIZIZ);
            setResult(-1, intent);
            TTCJPayUtils.getInstance().releaseAll();
            finish();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        C137142ccU LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
        if (CJPayHostInfo.screenOrientationType.intValue() == 2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C137142ccU.LIZ, true, 5);
            if (proxy.isSupported) {
                LIZ2 = (C137142ccU) proxy.result;
            } else {
                LIZ2 = C137346cfm.LIZ();
            }
            LIZ2.LIZ(this);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 10).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 9).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
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

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            Window window = getWindow();
            window.setGravity(51);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && getIntent() != null) {
            Intent intent = getIntent();
            if (intent.hasExtra("TTCJPayKeyServerTypeParams")) {
                this.LJIIIZ = intent.getIntExtra("TTCJPayKeyServerTypeParams", 1);
            }
            if (intent.hasExtra("TTCJPayKeyPayRequestParams")) {
                this.LIZJ = (HashMap) intent.getSerializableExtra("TTCJPayKeyPayRequestParams");
            }
            if (intent.hasExtra("TTCJPayKeyLoginTokenParams")) {
                this.LIZLLL = (HashMap) intent.getSerializableExtra("TTCJPayKeyLoginTokenParams");
            }
        }
        if (this.LIZJ != null) {
            TTCJPayUtils context = TTCJPayUtils.getInstance().setContext(this);
            context.setServerType(this.LJIIIZ);
            TTCJPayUtils requestParams = context.setRequestParams(this.LIZJ);
            requestParams.setLanguageTypeStr(this.f25552LJ);
            requestParams.setIsTransCheckoutCounterActivityWhenLoading(this.LJFF);
            TTCJPayUtils riskInfoParams = requestParams.setRiskInfoParams(this.LJI);
            riskInfoParams.setServerType(this.LJIIIZ);
            TTCJPayUtils loginToken = riskInfoParams.setTitleStr(this.LJII).setObserver(this.LJIIL).setScreenOrientationType(this.LJIIIIZZ).setLoginToken(this.LIZLLL);
            loginToken.setExtraHeaderMap(this.LJIIJJI);
            loginToken.setIsHideStatusBar(this.LJIIJ);
            loginToken.setIsAggregatePayment(false);
            loginToken.execute();
        }
    }
}
