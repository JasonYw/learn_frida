package com.android.ttcjpaysdk.base.p132h5;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.framework.event.CJPayLoginEvent;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p132h5.bean.CJWebviewInfoBean;
import com.android.ttcjpaysdk.base.p132h5.jsb.AbstractC2142f;
import com.android.ttcjpaysdk.base.p132h5.widget.CJPayNetworkErrorView;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.base.p135ui.SwipeToFinishView;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.base.utils.CJPaySharedPrefUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import com.bytedance.sdk.bridge.p1355js.JsBridgeManager;
import com.bytedance.sdk.bridge.p1355js.spec.JsbridgeEventHelper;
import com.bytedance.sdk.bridge.p1355js.util.StringUtil;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC136021cKO;
import p003X.AbstractC137071cbL;
import p003X.AbstractC137109cbx;
import p003X.C114421V2p;
import p003X.C116112VnG;
import p003X.C116118VnM;
import p003X.C116971W2r;
import p003X.C135272c8J;
import p003X.C135343c9S;
import p003X.C135549cCm;
import p003X.C135754cG5;
import p003X.C135811cH0;
import p003X.C136058cKz;
import p003X.C136215cNW;
import p003X.C136429cQy;
import p003X.C136524cSV;
import p003X.C136527cSY;
import p003X.C136757cWG;
import p003X.C136992ca3;
import p003X.C137064cbE;
import p003X.C137065cbF;
import p003X.C137066cbG;
import p003X.C137074cbO;
import p003X.C137088cbc;
import p003X.C137094cbi;
import p003X.C137102cbq;
import p003X.C137103cbr;
import p003X.C137104cbs;
import p003X.C137113cc1;
import p003X.C137119cc7;
import p003X.C469794hp;
import p003X.C65689Bvv;
import p003X.C76765GOh;
import p003X.CountDownTimerC137099cbn;
import p003X.FWS;
import p003X.GOY;
import p003X.R0P;
import p003X.RunnableC137097cbl;
import p003X.RunnableC137098cbm;
import p003X.View$OnClickListenerC137105cbt;

/* renamed from: com.android.ttcjpaysdk.base.h5.CJPayH5Activity */
/* loaded from: classes17.dex */
public class CJPayH5Activity extends AbstractActivityC136021cKO implements AbstractC137071cbL, AbstractC137109cbx {
    public static ChangeQuickRedirect LIZ;
    public static long LJJII;
    public static boolean LJJIII = true;
    public static final Map<String, CJPayHostInfo> LJJIIJ = new HashMap();
    public static HashSet<String> LJLIIIL = new HashSet<>();
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25446LJ;
    public String LJFF;
    public String LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public ViewGroup LJIIL;
    public TextView LJIILIIL;
    public CJPayJsBridgeWebView LJIILJJIL;
    public CJPayTextLoadingView LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public CJPayNetworkErrorView LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIJJLI;
    public String LJJI;
    public C116118VnM LJJIJ;
    public long LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIZ;
    public String LJJJ;
    public String LJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZI;
    public boolean LJJJLIIL;
    public JSONObject LJJJLL;
    public RelativeLayout LJJJLZIJ;
    public ImageView LJJJZ;
    public View LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public int LJJLIIIJ;
    public C137104cbs LJJLIIIJILLIZJL;
    public C137104cbs LJJLIIIJJI;
    public boolean LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public C65689Bvv LJJLIIIJLLLLLLLZ;
    public SwipeToFinishView LJJLIIJ;
    public boolean LJJLIL;
    public C137064cbE LJJZZI;
    public CountDownTimer LJLIIL;
    public String LJJIJLIJ = "";
    public String LJJIL = "#01000000";
    public String LJJJIL = "";
    public boolean LJII = true;
    public boolean LJJJJ = true;
    public String LJJJJI = "0";
    public int LJJJJZ = -1;
    public boolean LJIIJJI = true;
    public String LJIJ = "";
    public String LJJLJ = "arrow";
    public boolean LJJLJLI = true;
    public IBridgeContext LJIL = null;
    public IBridgeContext LJJLL = null;
    public IBridgeContext LJJ = null;
    public int LJJZ = 0;
    public boolean LJJIFFI = false;
    public boolean LJJZZIII = false;
    public boolean LJL = false;
    public int LJLI = -1;
    public boolean LJJIIJZLJL = true;
    public boolean LJLIL = false;
    public boolean LJJIIZ = false;
    public boolean LJJIIZI = false;
    public SparseArray<AbstractC2142f> LJLILLLLZI = null;
    public int LJLJI = 1;

    @Override // p003X.AbstractC137071cbL
    /* renamed from: LJ */
    public final void mo16066LJ() {
        this.LJJLIIIJL = true;
    }

    @Override // p003X.AbstractC137071cbL
    /* renamed from: LJ */
    public final void mo16065LJ(String str) {
    }

    @Override // p003X.AbstractC137071cbL
    public final void LJI() {
        this.LJIIZILJ = true;
    }

    @Override // p003X.AbstractC137071cbL
    public final void LJIIJJI() {
        this.LJJZZIII = true;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void adjustViews() {
    }

    @Override // p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690554;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public boolean isActivityPortrait() {
        return false;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 80).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZ(Intent intent, int i, AbstractC2142f abstractC2142f) {
        if (PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), abstractC2142f}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new SparseArray<>();
        }
        this.LJLILLLLZI.put(i, abstractC2142f);
        startActivityForResult(intent, i);
    }

    public final void LIZ() {
        CJPayTextLoadingView cJPayTextLoadingView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        LJIIJ(this.LJJIJIIJIL);
        LIZIZ();
        if (this.LJJJJL) {
            this.LJJIIZ = false;
            Iterator<String> it = C136992ca3.LIZ().LJIIIIZZ().douyin_loading_url.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (this.LJJIJIIJIL.contains(it.next())) {
                    this.LJLIL = true;
                    this.LJJIIZ = true;
                    break;
                }
            }
            if (this.LJLIL) {
                if (!C136757cWG.f18084LJ.LIZ(this, "") && (cJPayTextLoadingView = this.LJIILL) != null) {
                    cJPayTextLoadingView.show();
                }
            } else {
                LJIIJ();
            }
        } else {
            LJFF();
        }
        LJIILJJIL();
        JsBridgeManager.INSTANCE.delegateWebView(this.LJIILJJIL.getWebView(), new C137065cbF(this));
        this.LJJLIIIJLLLLLLLZ = new C65689Bvv(this);
        this.LJIILJJIL.setWebChromeClient(this.LJJLIIIJLLLLLLLZ);
        this.LJIILJJIL.setHeaderParams(C135811cH0.LIZ(this, this.LJJI));
        if (UGCMonitor.TYPE_POST.equals(this.LIZJ)) {
            this.LJIILJJIL.LIZ(this.f25446LJ, this.LIZLLL);
            return;
        }
        if (this.LJJIJIIJIL.contains("wx.tenpay.com") && (("4.4.3".equals(Build.VERSION.RELEASE) || "4.4.4".equals(Build.VERSION.RELEASE)) && this.LJJLJLI)) {
            this.LJIILJJIL.getWebView().loadDataWithBaseURL(TextUtils.isEmpty(this.LJJI) ? "https://tp-pay.snssdk.com" : this.LJJI, C0002O.m25085C("<script>window.location.href=\"", this.LJJIJIIJIL, "\";</script>"), "text/html", "utf-8", null);
            this.LJJLJLI = false;
        } else {
            Uri parse = Uri.parse(this.LJJIJIIJIL);
            if (!"http".equals(parse.getScheme()) && !"https".equals(parse.getScheme())) {
                finish();
                return;
            }
            if ("http".equals(parse.getScheme()) && CJPayHostInfo.serverType == 1) {
                this.LJJIJIIJIL = this.LJJIJIIJIL.replaceFirst("http", "https");
            }
            this.LJJIJIIJIL = CJPayParamsUtils.LIZ(this.LJJIJIIJIL);
            this.LJJIJ.LIZ(this.LJJIJIIJIL, LJIIIIZZ(), LJIIIZ());
            this.LJIILJJIL.LIZ(this.LJJIJIIJIL);
        }
        this.LJLIIL = new CountDownTimerC137099cbn(this, 10000L, 1000L);
        if (TextUtils.isEmpty(this.LJJI) && !this.LJIIIIZZ) {
            return;
        }
        this.LJLIIL.start();
    }

    public final void LIZ(String str) {
        CJPayJsBridgeWebView cJPayJsBridgeWebView;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 24).isSupported || (cJPayJsBridgeWebView = this.LJIILJJIL) == null || cJPayJsBridgeWebView.getWebView() == null) {
            return;
        }
        if (FWS.LIZ(str)) {
            if (this.LJJJLIIL) {
                return;
            }
            JsBridgeManager.INSTANCE.registerJsBridgeWithWebView(this.LJJZZI, this.LJIILJJIL.getWebView());
            this.LJJJLIIL = true;
            return;
        }
        JsBridgeManager.INSTANCE.unregisterJsBridgeWithWebView(this.LJJZZI, this.LJIILJJIL.getWebView());
        this.LJJJLIIL = false;
    }

    public final void LIZ(int i, String str) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 40).isSupported && !this.LJJLIIIJLJLI) {
            LJFF();
            CJPayNetworkErrorView cJPayNetworkErrorView = this.LJIJI;
            if (cJPayNetworkErrorView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cJPayNetworkErrorView.getLayoutParams();
                layoutParams.topMargin = CJPayBasicUtils.dipToPX(this, 0.0f);
                this.LJIJI.setLayoutParams(layoutParams);
                this.LJIJI.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.LJJIJL) || !"1".equals(this.LJJJJI) || this.LJIIL == null) {
                return;
            }
            C135343c9S.LIZ().LIZ(this, this.LJIIL, this.LJJJJLI);
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final Map<String, String> LIZ(String str, String str2) {
        String str3;
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 52);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        RelativeLayout relativeLayout = this.LJJJLZIJ;
        if (relativeLayout == null) {
            str3 = "mTitleBar is null";
        } else if (str != null) {
            relativeLayout.setVisibility(0);
            this.LJIILIIL.setText(str);
            this.LJI = str;
            str3 = "";
            i = 0;
        } else {
            str3 = "title is null";
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put(C2521l.LJIIJ, sb.toString());
        hashMap.put("message", str3);
        return hashMap;
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZ(int i) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 54).isSupported) {
            return;
        }
        if (i == 1 || this.LJJJJLL != 0 || this.LJIIIIZZ) {
            z = false;
        }
        SwipeToFinishView swipeToFinishView = this.LJJLIIJ;
        if (swipeToFinishView == null) {
            return;
        }
        swipeToFinishView.setEnableSwipe(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p003X.AbstractC137071cbL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p132h5.CJPayH5Activity.LIZ(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZ(CJWebviewInfoBean cJWebviewInfoBean) {
        if (PatchProxy.proxy(new Object[]{cJWebviewInfoBean}, this, LIZ, false, 59).isSupported) {
            return;
        }
        C137074cbO c137074cbO = new C137074cbO();
        c137074cbO.LIZ(this);
        c137074cbO.LIZLLL = cJWebviewInfoBean;
        c137074cbO.LIZ(CJPayHostInfo.LIZIZ(LJII()));
        c137074cbO.LIZ(this.LJL);
        c137074cbO.LIZ().LIZ();
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZ(List<String> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 61).isSupported && !PatchProxy.proxy(new Object[]{list}, null, C114421V2p.LIZ, true, 3).isSupported) {
            for (String str : list) {
                if (!PatchProxy.proxy(new Object[]{str}, null, C114421V2p.LIZ, true, 2).isSupported) {
                    Iterator<WeakReference<CJPayH5Activity>> it = C114421V2p.LIZIZ.iterator();
                    while (it.hasNext()) {
                        CJPayH5Activity cJPayH5Activity = it.next().get();
                        if (cJPayH5Activity == null || cJPayH5Activity.isFinishing()) {
                            it.remove();
                        } else if (cJPayH5Activity.LJIJ.equals(str)) {
                            cJPayH5Activity.finish();
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZ(int i, String str, String str2) {
        String LIZ2;
        h$a h_a;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 72).isSupported) {
            return;
        }
        C116118VnM c116118VnM = this.LJJIJ;
        if (!PatchProxy.proxy(new Object[]{str}, c116118VnM, C116118VnM.LIZ, false, 3).isSupported && (h_a = c116118VnM.LIZJ.get((LIZ2 = c116118VnM.LIZ(str)))) != null) {
            c116118VnM.LIZIZ.removeCallbacks(h_a);
            c116118VnM.LIZJ.remove(LIZ2);
        }
        C116118VnM c116118VnM2 = this.LJJIJ;
        String LJIIIZ = LJIIIZ();
        String LJIIIIZZ = LJIIIIZZ();
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, LJIIIZ, LJIIIIZZ}, c116118VnM2, C116118VnM.LIZ, false, 5).isSupported) {
            return;
        }
        try {
            JSONObject LIZ3 = CJPayParamsUtils.LIZ(LJIIIZ, LJIIIIZZ);
            LIZ3.put(C2521l.LJIIJ, i);
            LIZ3.put(PushConstants.WEB_URL, str);
            LIZ3.put("path", c116118VnM2.LIZ(str));
            LIZ3.put("error_msg", str2);
            C2118a.LIZ().LIZ("wallet_rd_webview_page_status", LIZ3);
            C2118a.LIZ().LIZ("wallet_rd_webview_page_status", LIZ3);
        } catch (Exception unused) {
        }
    }

    private boolean LJIILIIL() {
        if (this.LJJJJIZL) {
            if (this.LJJJJJ || this.LJIIIIZZ) {
                return false;
            }
            return true;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(6098);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        LJFF();
        CJPayNetworkErrorView cJPayNetworkErrorView = this.LJIJI;
        if (cJPayNetworkErrorView != null) {
            cJPayNetworkErrorView.setVisibility(8);
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported) {
            return;
        }
        setRequestedOrientation(3);
    }

    @Override // p003X.AbstractC137071cbL
    public final String LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 63);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayHostInfo LJII = LJII();
        if (LJII != null) {
            return LJII.appId;
        }
        return "";
    }

    @Override // p003X.AbstractC137071cbL
    public final String LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 64);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayHostInfo LJII = LJII();
        if (LJII != null) {
            return LJII.merchantId;
        }
        return "";
    }

    @Override // p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{CJPayLoginEvent.class, C136524cSV.class, C137102cbq.class, C137103cbr.class};
    }

    private void LJIILJJIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported && this.LJIILJJIL != null) {
            JsBridgeManager.INSTANCE.registerJsEvent("ttcjpay.receiveSDKNotification", "public");
            JsBridgeManager.INSTANCE.registerJsEvent("ttcjpay.visible", "public");
            JsBridgeManager.INSTANCE.registerJsEvent("ttcjpay.invisible", "public");
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 57).isSupported) {
            return;
        }
        if (this.LJLIL) {
            C136757cWG.f18084LJ.LIZ();
        }
        CJPayTextLoadingView cJPayTextLoadingView = this.LJIILL;
        if (cJPayTextLoadingView != null) {
            cJPayTextLoadingView.hide();
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final CJPayHostInfo LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 62);
        if (proxy.isSupported) {
            return (CJPayHostInfo) proxy.result;
        }
        Map<String, CJPayHostInfo> map = LJJIIJ;
        return map.get(this.LJJIJIL + this.LJLI);
    }

    @Override // p003X.AbstractC137071cbL
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 65).isSupported) {
            return;
        }
        CJPayTextLoadingView cJPayTextLoadingView = this.LJIILL;
        if (cJPayTextLoadingView != null) {
            cJPayTextLoadingView.show();
        }
        CJPayNetworkErrorView cJPayNetworkErrorView = this.LJIJI;
        if (cJPayNetworkErrorView != null) {
            cJPayNetworkErrorView.setVisibility(8);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        super.finish();
        if (!this.LJJLIL) {
            if (this.LJJIJIIJIL.contains("wx.tenpay.com") || (this.LJJJJIZL && this.LJJZ != 1)) {
                C136058cKz.LIZIZ(this);
                return;
            } else {
                C136058cKz.LIZ(this);
                return;
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onVisible() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        super.onVisible();
        if (this.LJIILJJIL != null && this.LJIILLIIL && this.LJJLIIIJL) {
            JsbridgeEventHelper.INSTANCE.sendEvent("ttcjpay.visible", (JSONObject) null, this.LJIILJJIL.getWebView());
        }
    }

    public CJPayH5Activity() {
        CJPaySharedPrefUtils.LIZ("cj_pay_web_offline_data_status", 1);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        LJFF();
        CJPayNetworkErrorView cJPayNetworkErrorView = this.LJIJI;
        if (cJPayNetworkErrorView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cJPayNetworkErrorView.getLayoutParams();
            layoutParams.topMargin = CJPayBasicUtils.dipToPX(this, 0.0f);
            this.LJIJI.setLayoutParams(layoutParams);
            this.LJIJI.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.LJJIJL) && "1".equals(this.LJJJJI) && this.LJIIL != null) {
            C135343c9S.LIZ().LIZ(this, this.LJIIL, this.LJJJJLI);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        if (this.LJIILJJIL != null) {
            if (this.LJJLIIIJL) {
                JsbridgeEventHelper.INSTANCE.sendEvent("ttcjpay.invisible", (JSONObject) null, this.LJIILJJIL.getWebView());
            }
            CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
            if (!PatchProxy.proxy(new Object[0], cJPayJsBridgeWebView, CJPayJsBridgeWebView.LIZ, false, 18).isSupported && cJPayJsBridgeWebView.LIZIZ != null) {
                cJPayJsBridgeWebView.LIZIZ.onPause();
            }
        }
        super.onPause();
        try {
            Uri parse = Uri.parse(this.LJJIJIIJIL);
            CJPayPerformance LIZ2 = CJPayPerformance.LIZ();
            new StringBuilder();
            LIZ2.LIZJ(C0002O.m25086C(parse.getHost(), parse.getPath()));
        } catch (Exception unused) {
        }
        if (!this.LJIIJJI) {
            CJPayActivityManager.allowCaptureScreen(this);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 78).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 77).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 76).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 79).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                    if (this.LJIIIZ) {
                        finish();
                    }
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

    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 75).isSupported) {
            return;
        }
        this.LJJLIIIJLJLI = true;
        C135754cG5 c135754cG5 = new C135754cG5();
        try {
            c135754cG5.source = Integer.parseInt(this.LJJJLL.optString("clientSource"));
            c135754cG5.scene = this.LJJJLL.optString("scene");
            c135754cG5.faceScene = this.LJJJLL.optString("faceScene");
        } catch (Exception e) {
            e.printStackTrace();
        }
        EventManager.INSTANCE.notify(c135754cG5);
        finish();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        MethodCollector.m14708i(361);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(361);
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        C116118VnM c116118VnM = this.LJJIJ;
        if (!PatchProxy.proxy(new Object[0], c116118VnM, C116118VnM.LIZ, false, 4).isSupported) {
            for (h$a h_a : c116118VnM.LIZJ.values()) {
                c116118VnM.LIZIZ.removeCallbacks(h_a);
            }
            c116118VnM.LIZJ.clear();
        }
        LJFF();
        if (this.LJIILJJIL != null && this.LJJZZI != null) {
            JsBridgeManager.INSTANCE.unregisterJsBridgeWithWebView(this.LJJZZI, this.LJIILJJIL.getWebView());
            C137064cbE c137064cbE = this.LJJZZI;
            c137064cbE.LIZIZ = null;
            c137064cbE.LIZJ = null;
            CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
            if (!PatchProxy.proxy(new Object[0], cJPayJsBridgeWebView, CJPayJsBridgeWebView.LIZ, false, 13).isSupported && cJPayJsBridgeWebView.LIZIZ != null) {
                ViewParent parent = cJPayJsBridgeWebView.LIZIZ.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(cJPayJsBridgeWebView.LIZIZ);
                }
                cJPayJsBridgeWebView.LIZIZ.stopLoading();
                cJPayJsBridgeWebView.LIZIZ.getSettings().setJavaScriptEnabled(false);
                cJPayJsBridgeWebView.LIZIZ.clearHistory();
                cJPayJsBridgeWebView.LIZIZ.clearView();
                cJPayJsBridgeWebView.LIZIZ.removeAllViews();
            }
            this.LJJJLIIL = false;
            this.LJIILJJIL.LIZJ("ab_settings", "");
        }
        C137113cc1.LIZ = null;
        Map<String, CJPayHostInfo> map = LJJIIJ;
        if (map != null) {
            map.remove(this.LJJIJIL + this.LJLI);
        }
        MethodCollector.m14707o(361);
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
        if (cJPayJsBridgeWebView != null) {
            if (!PatchProxy.proxy(new Object[0], cJPayJsBridgeWebView, CJPayJsBridgeWebView.LIZ, false, 17).isSupported && cJPayJsBridgeWebView.LIZIZ != null) {
                cJPayJsBridgeWebView.LIZIZ.onResume();
            }
            CJPayJsBridgeWebView cJPayJsBridgeWebView2 = this.LJIILJJIL;
            if (!PatchProxy.proxy(new Object[0], cJPayJsBridgeWebView2, CJPayJsBridgeWebView.LIZ, false, 15).isSupported && cJPayJsBridgeWebView2.LIZIZ != null) {
                cJPayJsBridgeWebView2.LIZIZ.resumeTimers();
            }
        }
        if (this.LJIJJ) {
            this.LJIJJ = false;
            C2118a.LIZ().LIZ(0);
            finish();
        }
        try {
            Uri parse = Uri.parse(this.LJJIJIIJIL);
            CJPayPerformance LIZ2 = CJPayPerformance.LIZ();
            new StringBuilder();
            LIZ2.LIZIZ(C0002O.m25086C(parse.getHost(), parse.getPath()));
        } catch (Exception unused) {
        }
        if (this.LJIIJJI) {
            CJPayActivityManager.allowCaptureScreen(this);
        } else {
            CJPayActivityManager.disallowCaptureScreen(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z;
        int i;
        int code;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            CJPayInputKeyboardHelper.hideSystemKeyboard(this);
            if (!TextUtils.isEmpty(this.LJJIJIIJIL) && this.LJJIJIIJIL.contains("wx.tenpay.com")) {
                LIZLLL();
            }
            if (this.LJIJJ) {
                this.LJIJJ = false;
                C2118a.LIZ().LIZ(0);
                finish();
            } else {
                CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
                if (cJPayJsBridgeWebView != null) {
                    cJPayJsBridgeWebView.LIZIZ("", "click.backbutton");
                }
                if (!this.LJJZZIII && LJIILIIL()) {
                    z = true;
                    if ((!TextUtils.isEmpty(this.LJJLIIIIJ) || !TextUtils.isEmpty(this.LJJLI)) && ((this.LJJLIIIJ == 1 && !this.LJJLIIIJJIZ) || ((i = this.LJJLIIIJ) != 1 && i != 2))) {
                        if (this.LJJLIIIJ == 1) {
                            this.LJJLIIIJJIZ = true;
                        }
                        LIZIZ(this.LJJLI, this.LJJLIIIIJ);
                    } else {
                        CJPayJsBridgeWebView cJPayJsBridgeWebView2 = this.LJIILJJIL;
                        if (cJPayJsBridgeWebView2 != null && cJPayJsBridgeWebView2.LIZ() && !this.LJIIZILJ) {
                            this.LJIILJJIL.LIZIZ();
                        } else {
                            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 49);
                            if (!proxy2.isSupported ? !(C2118a.LIZ().LIZJ == null || this.LJL || ((code = C2118a.LIZ().LIZJ.getCode()) != 202 && code != 201 && code != 200)) : ((Boolean) proxy2.result).booleanValue()) {
                                C2118a.LIZ().LIZIZ();
                            }
                            finish();
                        }
                        z = false;
                    }
                }
            }
            z = false;
        }
        EventManager.INSTANCE.notify(new C135549cCm(this.LIZIZ));
        EventManager.INSTANCE.notifyNow(new C136215cNW(this.LJIIJ));
        if (this.LJJIIZ) {
            this.LJJIIZ = false;
            EventManager.INSTANCE.notify(new C136429cQy("-2", "", "", ""));
        }
        if (!z) {
            EventManager.INSTANCE.notifyNow(new C136527cSY(this.LIZIZ));
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        Bitmap LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJLIIJ = new SwipeToFinishView(this);
        this.mSwipeToFinishView = this.LJJLIIJ;
        this.LJIIL = (ViewGroup) findViewById(2131169854);
        setStatusBar(this.LJIIL);
        this.LJJJLZIJ = (RelativeLayout) this.LJIIL.findViewById(2131165243);
        this.LJJJZ = (ImageView) this.LJIIL.findViewById(2131165337);
        this.LJIILIIL = (TextView) this.LJIIL.findViewById(2131170118);
        this.LJJL = this.LJIIL.findViewById(2131170170);
        this.LJIILJJIL = (CJPayJsBridgeWebView) this.LJIIL.findViewById(2131170169);
        String queryParameter = Uri.parse(this.LJJIJIIJIL).getQueryParameter("enable_font_scale");
        if ("0".equals(queryParameter)) {
            this.LJLJI = 0;
        } else if ("1".equals(queryParameter)) {
            this.LJLJI = 1;
        }
        if (CJPayHostInfo.fontScale != 1.0f && this.LJLJI == 1) {
            this.LJIILJJIL.getSettings().setTextZoom((int) (CJPayHostInfo.fontScale * 100.0f));
            this.LJIILIIL.setTextSize(2, 17.0f);
        } else {
            this.LJIILJJIL.getSettings().setTextZoom(100);
            this.LJIILIIL.setTextSize(1, 17.0f);
        }
        this.LJIILJJIL.setUserAgent(this.LJLI);
        this.LJIILJJIL.setBackgroundColor(C135272c8J.LIZIZ(this, 2130772692));
        this.LJJL.setBackgroundColor(C135272c8J.LIZIZ(this, 2130772692));
        this.LJIILJJIL.getWebView().setBackgroundColor(C135272c8J.LIZIZ(this, 2130772692));
        if ("0".equals(this.LJJJJI)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, 2131165243);
            this.LJIILJJIL.setLayoutParams(layoutParams);
        } else {
            this.LJJJLZIJ.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623991));
        }
        if (this.LJJJJ) {
            LIZ(true);
        } else {
            LIZ(false);
        }
        if (this.LJJJJIZL) {
            if (this.LJJZ == 1) {
                LIZJ(C135272c8J.LIZIZ(this, 2130772692));
            } else {
                LIZ(false);
                String str = this.LJJIL;
                if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 17).isSupported) {
                    try {
                        LIZJ(Color.parseColor(str));
                    } catch (Exception unused) {
                    }
                }
            }
            this.LJIIL.post(new RunnableC137097cbl(this));
        }
        if (!TextUtils.isEmpty(this.LJJJIL)) {
            int i = Build.VERSION.SDK_INT;
            getWindow().setNavigationBarColor(CastProtectorUtils.parseColor(this.LJJJIL));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            if ("close".equals(this.LJJLJ)) {
                this.LJJJZ.setImageResource(2130840410);
            }
            if (!TextUtils.isEmpty(this.LJJIJLIJ)) {
                String str2 = this.LJJLJ;
                String str3 = this.LJJIJLIJ;
                int dipToPX = CJPayBasicUtils.dipToPX(this, 24.0f);
                int dipToPX2 = CJPayBasicUtils.dipToPX(this, 24.0f);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this, str2, str3, Integer.valueOf(dipToPX), Integer.valueOf(dipToPX2)}, null, C469794hp.LIZ, true, 4);
                if (proxy.isSupported) {
                    LIZ2 = (Bitmap) proxy.result;
                } else if (C469794hp.LIZIZ.equals(str2)) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, str3, Integer.valueOf(dipToPX), Integer.valueOf(dipToPX2)}, null, C469794hp.LIZ, true, 2);
                    if (proxy2.isSupported) {
                        LIZ2 = (Bitmap) proxy2.result;
                    } else {
                        LIZ2 = C469794hp.LIZ(this, str3, dipToPX, dipToPX2, 2130840410);
                    }
                } else {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{this, str3, Integer.valueOf(dipToPX), Integer.valueOf(dipToPX2)}, null, C469794hp.LIZ, true, 1);
                    if (proxy3.isSupported) {
                        LIZ2 = (Bitmap) proxy3.result;
                    } else {
                        LIZ2 = C469794hp.LIZ(this, str3, dipToPX, dipToPX2, 2130840407);
                    }
                }
                if (LIZ2 != null) {
                    this.LJJJZ.setImageBitmap(LIZ2);
                }
            }
            if (!TextUtils.isEmpty(this.LJJIZ)) {
                try {
                    this.LJIILIIL.setTextColor(Color.parseColor(this.LJJIZ));
                } catch (Exception unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.LJJJ)) {
                try {
                    this.LJJJLZIJ.setBackgroundColor(Color.parseColor(this.LJJJ));
                } catch (Exception unused3) {
                }
            }
            if ("dark".equals(this.LJJJI)) {
                C76765GOh.LIZ((Activity) this, (View) this.LJIIL, false);
            }
        }
        this.LJIILL = (CJPayTextLoadingView) this.LJIIL.findViewById(2131170108);
        this.LJIJI = (CJPayNetworkErrorView) this.LJIIL.findViewById(2131170160);
        this.LJIJI.setOnRefreshBenClickListener(new C137094cbi(this));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LJIJI.getLayoutParams();
        layoutParams2.topMargin = CJPayBasicUtils.dipToPX(this, 44.0f);
        this.LJIJI.setLayoutParams(layoutParams2);
        this.LJJJZ.setOnClickListener(new View$OnClickListenerC137105cbt(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            new GestureDetector(this, new C137088cbc(this));
        }
        if (C2118a.LIZ().LJIIIIZZ != null) {
            C2118a.LIZ().LJIIIIZZ.onWebViewInit(new WeakReference<>(this.LJIILJJIL.getWebView()));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && !TextUtils.isEmpty(this.LJJIJL) && "1".equals(this.LJJJJI) && this.LJIIL != null) {
            try {
                C135343c9S.LIZ().LIZ(this, this.LJIIL, this.LJJJJLI);
                this.LJIIL.setBackgroundColor(Color.parseColor(this.LJJIJL));
            } catch (Exception unused4) {
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && this.LJJJJZI == 1) {
            LIZ(false);
            this.LJIIL.post(new RunnableC137098cbm(this));
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZ(IBridgeContext iBridgeContext) {
        this.LJJLL = iBridgeContext;
    }

    private void LJIIJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        this.LJJIJIIJI = System.currentTimeMillis();
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 53).isSupported) {
            return;
        }
        if (StringUtil.isEmpty(str)) {
            str = "";
        }
        this.LJIJ = str;
    }

    private void LIZ(boolean z) {
        RelativeLayout relativeLayout;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 35).isSupported && (relativeLayout = this.LJJJLZIJ) != null) {
            if (z) {
                relativeLayout.setVisibility(0);
            } else {
                relativeLayout.setVisibility(8);
            }
        }
    }

    private void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        try {
            this.LJJLIIJ.setBackgroundColor(this.LJJIL);
            this.LJIIL.setBackgroundColor(i);
            this.LJJL.setBackgroundColor(i);
            this.LJIILJJIL.setBackgroundColor(i);
            this.LJIILJJIL.getWebView().setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    private void LJIIIIZZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJIIIZ(), LJIIIIZZ());
            LIZ2.put(PushConstants.WEB_URL, str);
            C2118a.LIZ().LIZ("wallet_rd_webview_url_empty", LIZ2);
            C2118a.LIZ().LIZ("wallet_rd_webview_url_empty", LIZ2);
        } catch (Throwable unused) {
        }
    }

    private void LJIILIIL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 74).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                this.LJJJLL = new JSONObject(str);
                return;
            } catch (JSONException e) {
                e.printStackTrace();
                this.LJJJLL = new JSONObject();
                return;
            }
        }
        this.LJJJLL = new JSONObject();
    }

    @Override // p003X.AbstractC137071cbL
    public final void LIZIZ(int i) {
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 56).isSupported && !isFinishing()) {
            if (1 != i) {
                z = false;
            }
            this.LJJLIL = z;
            finish();
        }
    }

    @Override // p003X.AbstractC137071cbL
    public final boolean LIZLLL(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 58);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (str.startsWith("sslocal://cjpay/webview")) {
            return true;
        }
        return false;
    }

    public final boolean LJI(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 70);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("https://cjpaysdk/facelive/callback")) {
            return true;
        }
        return false;
    }

    private void LJIIIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LJIIIIZZ(str);
            return;
        }
        try {
            if (TextUtils.isEmpty(Uri.parse(str).getScheme()) || TextUtils.isEmpty(Uri.parse(str).getHost())) {
                LJIIIIZZ(str);
            }
        } catch (Throwable unused) {
            LJIIIIZZ(str);
        }
    }

    private String LJIIJJI(String str) {
        String queryParameter;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 36);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (getIntent() != null) {
            if (getIntent().hasExtra(str)) {
                queryParameter = getIntent().getStringExtra(str);
            } else if (getIntent().getData() != null) {
                queryParameter = getIntent().getData().getQueryParameter(str);
            }
            if (queryParameter == null) {
                return "";
            }
            return queryParameter;
        }
        return "";
    }

    private void LJIIL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 44).isSupported) {
            return;
        }
        String LIZ2 = C136992ca3.LIZ().LIZ("cjpay_disallow_capture_screen_path");
        String path = Uri.parse(str).getPath();
        if (path != null && LIZ2 != null && !LIZ2.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(LIZ2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (jSONArray.getString(i).equals(path)) {
                        this.LJIIJJI = false;
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.LJIIJJI = true;
    }

    public final boolean LJFF(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 69);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("https://onekeysigncard/cardbind/quickbind/notify")) {
            return true;
        }
        return false;
    }

    public final boolean LJII(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 71);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJJJLL != null && !TextUtils.isEmpty(str)) {
            String optString = this.LJJJLL.optString("return_url");
            if (!TextUtils.isEmpty(optString) && str.startsWith(optString)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 32).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{this, configuration}, null, LIZ, true, 34).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, configuration}, null, LIZ, true, 33).isSupported) {
                super.onConfigurationChanged(configuration);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, configuration);
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (this.LJJJJIZL && this.LJJZ == 2 && this.LJIILLIIL) {
            CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
            if (cJPayJsBridgeWebView.getVisibility() == 0) {
                i = 8;
            }
            cJPayJsBridgeWebView.setVisibility(i);
            C76765GOh.LIZ((Activity) this);
        }
    }

    @Override // p003X.AbstractC137109cbx
    public final void LIZIZ(CJWebviewInfoBean cJWebviewInfoBean) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{cJWebviewInfoBean}, this, LIZ, false, 66).isSupported) {
            return;
        }
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        h5ParamBuilder.setContext(this);
        h5ParamBuilder.setUrl(cJWebviewInfoBean.url);
        h5ParamBuilder.setNeedTransparentActivity(true);
        h5ParamBuilder.setScreenType(cJWebviewInfoBean.fullPage);
        h5ParamBuilder.setHideWebView(Boolean.FALSE);
        h5ParamBuilder.setNavigationBarColor("");
        h5ParamBuilder.setModalViewBgcolor(cJWebviewInfoBean.backgroundColor);
        if (cJWebviewInfoBean.showLoading == 1) {
            z = true;
        } else {
            z = false;
        }
        h5ParamBuilder.setShowLoading(z);
        h5ParamBuilder.setPreFetchData(false);
        h5ParamBuilder.setHostBackUrl(cJWebviewInfoBean.hostBackUrl);
        Intent LIZ2 = LIZ(h5ParamBuilder);
        if (cJWebviewInfoBean.disableClose != 0) {
            LIZ2.putExtra("key_disable_close", cJWebviewInfoBean.disableClose);
        }
        if (cJWebviewInfoBean.timeout != -1) {
            LIZ2.putExtra("key_timeout", cJWebviewInfoBean.timeout);
        }
        if (cJWebviewInfoBean.canvasMode != 0) {
            LIZ2.putExtra("key_canvas_mode", cJWebviewInfoBean.canvasMode);
        }
        if (cJWebviewInfoBean.isFromBanner) {
            LIZ2.putExtra("key_is_from_banner", true);
        }
        if (cJWebviewInfoBean.callbackId != -1) {
            LIZ2.putExtra("key_callback_id", cJWebviewInfoBean.callbackId);
        }
        LIZ2.putExtra("key_enable_font_scale", cJWebviewInfoBean.enableFontScale);
        setIntent(LIZ2);
    }

    @Override // p003X.AbstractC137109cbx
    public final void LIZJ(CJWebviewInfoBean cJWebviewInfoBean) {
        String str;
        if (PatchProxy.proxy(new Object[]{cJWebviewInfoBean}, this, LIZ, false, 67).isSupported) {
            return;
        }
        if (StringUtil.isEmpty(cJWebviewInfoBean.hideStatusBar)) {
            str = "0";
        } else {
            str = cJWebviewInfoBean.hideStatusBar;
        }
        boolean equals = "0".equals(str);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        h5ParamBuilder.setContext(this);
        h5ParamBuilder.setUrl(cJWebviewInfoBean.url);
        h5ParamBuilder.setTitle(cJWebviewInfoBean.title);
        h5ParamBuilder.setShowTitle(equals);
        h5ParamBuilder.setIsTransTitleBar(str);
        h5ParamBuilder.setStatusBarColor(cJWebviewInfoBean.backgroundColor);
        h5ParamBuilder.setStatusBarTextStyle(cJWebviewInfoBean.statusBarTextStyle);
        h5ParamBuilder.setBackButtonIcon(cJWebviewInfoBean.backButtonIcon);
        h5ParamBuilder.setBackButtonColor(cJWebviewInfoBean.backButtonColor);
        h5ParamBuilder.setTitleTextColor(cJWebviewInfoBean.titleTextColor);
        h5ParamBuilder.setTitleBarBgColor(cJWebviewInfoBean.titleBarBgColor);
        h5ParamBuilder.setShowTitleBar("0".equals(cJWebviewInfoBean.hideTitleBar));
        h5ParamBuilder.setCanvasMode(cJWebviewInfoBean.canvasMode);
        h5ParamBuilder.setDisableClose(cJWebviewInfoBean.disableClose);
        h5ParamBuilder.setFromBanner(cJWebviewInfoBean.isFromBanner);
        h5ParamBuilder.setCallbackId(cJWebviewInfoBean.callbackId);
        h5ParamBuilder.setTimeout(cJWebviewInfoBean.timeout);
        h5ParamBuilder.setPreFetchData(false);
        h5ParamBuilder.setHostBackUrl(cJWebviewInfoBean.hostBackUrl);
        Intent LIZ2 = LIZ(h5ParamBuilder);
        LIZ2.putExtra("key_enable_font_scale", cJWebviewInfoBean.enableFontScale);
        setIntent(LIZ2);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        HashMap<String, String> hashMap;
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 68).isSupported) {
            return;
        }
        if (baseEvent instanceof CJPayLoginEvent) {
            int i = ((CJPayLoginEvent) baseEvent).LIZ;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    CJPayActivityManager.INSTANCE.finishAll(this);
                }
            } else if (this.LJJLL != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C2521l.LJIIJ, i);
                    this.LJJLL.callback(BridgeResult.Companion.createSuccessResult(jSONObject));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } else if (baseEvent instanceof C136524cSV) {
            if (isFinishing() || !this.LJJIIJZLJL) {
                return;
            }
            finish();
            overridePendingTransition(0, 0);
        } else if (baseEvent instanceof C137102cbq) {
            if (this.LJIILJJIL != null) {
                C137102cbq c137102cbq = (C137102cbq) baseEvent;
                this.LJIILJJIL.LIZIZ(c137102cbq.LIZ, c137102cbq.LIZIZ);
            }
        } else if ((baseEvent instanceof C137103cbr) && this.LJIL != null && (hashMap = ((C137103cbr) baseEvent).LIZ) != null && hashMap.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                this.LJIL.callback(BridgeResult.Companion.createSuccessResult(jSONObject2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Intent LIZ(H5ParamBuilder h5ParamBuilder) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{h5ParamBuilder}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (Intent) proxy.result;
        }
        if (h5ParamBuilder == null) {
            return null;
        }
        String url = h5ParamBuilder.getUrl();
        Intent intent = new Intent(h5ParamBuilder.getContext(), CJPayH5Activity.class);
        intent.putExtra("link_origin", url);
        if (h5ParamBuilder.getHostInfo() != null) {
            LJJIIJ.put(url + h5ParamBuilder.getCallbackId(), CJPayHostInfo.LIZ(h5ParamBuilder.getHostInfo()));
        }
        if (UGCMonitor.TYPE_POST.equals(h5ParamBuilder.getRequestType())) {
            intent.putExtra("post_url", url);
        }
        intent.putExtra("DisableH5History", h5ParamBuilder.isDisableH5History());
        if (!TextUtils.isEmpty(url)) {
            if (h5ParamBuilder.isPreFetchData()) {
                C116112VnG.LIZ("cjpay_h5", url);
            }
            Uri parse = Uri.parse(url);
            CJWebviewInfoBean cJWebviewInfoBean = new CJWebviewInfoBean(parse);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (C135343c9S.LIZ(url)) {
                intent.putExtra("key_is_support_multiple_theme", true);
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                if (!queryParameterNames.contains("tp_aid")) {
                    url = url + "&tp_aid=" + CJPayHostInfo.aid;
                }
                if (!queryParameterNames.contains("tp_lang")) {
                    url = url + "&tp_lang=" + CJPayHostInfo.languageTypeStr;
                }
                if (!queryParameterNames.contains("tp_theme")) {
                    url = LIZ(url, intent);
                }
            } else {
                url = LIZ(url + "?tp_aid=" + CJPayHostInfo.aid + "&tp_lang=" + CJPayHostInfo.languageTypeStr, intent);
            }
            if (cJWebviewInfoBean.disableClose != 0) {
                intent.putExtra("key_disable_close", cJWebviewInfoBean.disableClose);
            }
            if (cJWebviewInfoBean.timeout != -1) {
                intent.putExtra("key_timeout", cJWebviewInfoBean.timeout);
            }
            if (cJWebviewInfoBean.canvasMode != 0) {
                intent.putExtra("key_canvas_mode", cJWebviewInfoBean.canvasMode);
            }
            if (!TextUtils.isEmpty(cJWebviewInfoBean.statusBarTextStyle)) {
                intent.putExtra("key_status_bar_text_style", cJWebviewInfoBean.statusBarTextStyle);
            }
            intent.putExtra("key_enable_font_scale", cJWebviewInfoBean.enableFontScale);
        }
        if (h5ParamBuilder.getCanvasMode() != 0) {
            intent.putExtra("key_canvas_mode", h5ParamBuilder.getCanvasMode());
        }
        intent.putExtra("link", url);
        if (!TextUtils.isEmpty(h5ParamBuilder.getTitle())) {
            intent.putExtra("title", h5ParamBuilder.getTitle());
        }
        if (!intent.hasExtra("key_status_bar_text_style")) {
            intent.putExtra("key_status_bar_text_style", h5ParamBuilder.getStatusBarTextStyle());
        }
        intent.putExtra("show_title", h5ParamBuilder.isShowTitle());
        intent.putExtra("key_is_show_title_bar", h5ParamBuilder.isShowTitleBar());
        intent.putExtra("key_is_trans_title_bar", h5ParamBuilder.getIsTransTitleBar());
        intent.putExtra("key_background_color", h5ParamBuilder.getStatusBarColor());
        intent.putExtra("key_back_button_color", h5ParamBuilder.getBackButtonColor());
        intent.putExtra("key_is_need_transparent", h5ParamBuilder.isNeedTransparentActivity());
        intent.putExtra("key_show_loading", h5ParamBuilder.isShowLoading());
        intent.putExtra("key_screen_type", h5ParamBuilder.getScreenType());
        intent.putExtra("key_navigation_bar_color", h5ParamBuilder.getNavigationBarColor());
        intent.putExtra("key_from_dou_plus", h5ParamBuilder.isFromDouPlus());
        intent.putExtra("key_from_wx_independent_sign", h5ParamBuilder.isFromWxIndependentSign());
        intent.putExtra("key_wx_pay_is_hide_webview", h5ParamBuilder.getHideWebView());
        intent.putExtra("key_back_button_icon", h5ParamBuilder.getBackButtonIcon());
        intent.putExtra("key_title_text_color", h5ParamBuilder.getTitleTextColor());
        intent.putExtra("key_title_bar_bg_color", h5ParamBuilder.getTitleBarBgColor());
        intent.putExtra("request_type", h5ParamBuilder.getRequestType());
        intent.putExtra("post_form_data", h5ParamBuilder.getFormData());
        intent.putExtra("key_is_from_banner", h5ParamBuilder.isFromBanner());
        intent.putExtra("key_callback_id", h5ParamBuilder.getCallbackId());
        intent.putExtra("cj_pay_enter_from", h5ParamBuilder.getEnterFrom());
        intent.putExtra("key_extend_params", h5ParamBuilder.getExtendParams());
        intent.putExtra("host_back_url", h5ParamBuilder.getHostBackUrl());
        if (h5ParamBuilder.getContext() != null) {
            intent.putExtra("key_open_h5_context", h5ParamBuilder.getContext().toString());
        }
        if (!TextUtils.isEmpty(h5ParamBuilder.getReferer())) {
            intent.putExtra("key_wx_pay_refer", h5ParamBuilder.getReferer());
        }
        LJJII = System.currentTimeMillis();
        return intent;
    }

    public final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String LIZ2 = C136992ca3.LIZ().LIZ("cjpay_loading_path");
        ArrayList arrayList = new ArrayList();
        if (LIZ2 != null && !LIZ2.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(LIZ2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            arrayList2.addAll(Arrays.asList("/usercenter", "/cashdesk_withdraw", "/withdraw/faq", "/feoffline/cpay/apply/router", "/cardbind", "/finance_union_passport"));
        }
        arrayList2.addAll(arrayList);
        for (String str2 : arrayList2) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MethodCollector.m14708i(360);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(360);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[0], null, C137119cc7.LIZ, true, 1).isSupported && "en".equals(CJPayHostInfo.languageTypeStr) && Build.VERSION.SDK_INT >= 24 && !C137119cc7.LIZIZ) {
            try {
                if (CJPayHostInfo.applicationContext != null) {
                    new WebView(CJPayHostInfo.applicationContext).destroy();
                }
                C137119cc7.LIZIZ = true;
            } catch (Exception unused) {
            }
        }
        this.LJJIJ = new C116118VnM();
        C137074cbO c137074cbO = new C137074cbO();
        c137074cbO.LIZIZ = this;
        C137066cbG LIZ2 = c137074cbO.LIZ();
        Intent intent = getIntent();
        if (!PatchProxy.proxy(new Object[]{intent}, LIZ2, C137066cbG.LIZ, false, 3).isSupported && intent != null && intent.getBooleanExtra("isScheme", false)) {
            CJWebviewInfoBean cJWebviewInfoBean = (CJWebviewInfoBean) intent.getSerializableExtra("webviewInfo");
            if (LIZ2.LIZIZ != null) {
                if (cJWebviewInfoBean.LIZ()) {
                    LIZ2.LIZIZ.LIZIZ(cJWebviewInfoBean);
                } else {
                    LIZ2.LIZIZ.LIZJ(cJWebviewInfoBean);
                }
            }
        }
        if (getIntent() != null && !PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            this.LJJIJIIJIL = LJIIJJI("link");
            this.LJJIJIL = LJIIJJI("link_origin");
            LJIIIZ(this.LJJIJIL);
            this.LJFF = LJIIJJI("title");
            this.LJII = LIZ("show_title", true);
            this.LJJJJ = LIZ("key_is_show_title_bar", true);
            this.LJJJJI = LJIIJJI("key_is_trans_title_bar");
            this.LJJIJL = LJIIJJI("key_background_color");
            this.LJJJI = LJIIJJI("key_status_bar_text_style");
            this.LJJIJLIJ = LJIIJJI("key_back_button_color");
            this.LJJLJ = LJIIJJI("key_back_button_icon");
            this.LJJIZ = LJIIJJI("key_title_text_color");
            this.LJJJ = LJIIJJI("key_title_bar_bg_color");
            this.LJJJIL = LJIIJJI("key_navigation_bar_color");
            this.LJJJJIZL = LIZ("key_is_need_transparent", false);
            this.LJJJJJ = LIZ("key_from_dou_plus", false);
            this.LJIIIIZZ = LIZ("key_from_wx_independent_sign", false);
            this.LJJJJL = LIZ("key_show_loading", true);
            this.LJJZ = LIZ("key_screen_type", 0);
            this.LJJI = LJIIJJI("key_wx_pay_refer");
            this.LJJJJJL = LIZ("key_wx_pay_is_hide_webview", false);
            this.LIZIZ = LJIIJJI("cj_pay_enter_from");
            this.LIZJ = LJIIJJI("request_type");
            this.LIZLLL = LJIIJJI("post_form_data");
            this.f25446LJ = LJIIJJI("post_url");
            this.LJIIZILJ = LIZ("DisableH5History", false);
            this.LJJJJLL = LIZ("key_disable_close", 0);
            this.LJJJJZ = LIZ("key_timeout", -1);
            this.LJJJJZI = LIZ("key_canvas_mode", 0);
            this.LJIIJ = LJIIJJI("key_open_h5_context");
            LJIILIIL(LJIIJJI("key_extend_params"));
            LJIIJJI("host_back_url");
            this.LJLJI = LIZ("key_enable_font_scale", 1);
        }
        this.LJL = LIZ("key_is_from_banner", false);
        this.LJLI = LIZ("key_callback_id", -1);
        this.LJJJJLI = LIZ("key_is_support_multiple_theme", false);
        if (this.LJJJJLI) {
            supportMultipleTheme();
        }
        setSwipeThemeType();
        LIZLLL();
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 7).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 6).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused2) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (!PatchProxy.proxy(new Object[]{this}, null, C114421V2p.LIZ, true, 1).isSupported) {
            C114421V2p.LIZIZ.add(new WeakReference<>(this));
        }
        C76765GOh.LIZ((Activity) this);
        if (this.LJJJJIZL && this.LJJZ == 2) {
            setRequestedOrientation(0);
        }
        this.LJJZZI = new C137064cbE(this, this);
        if (this.LJIILJJIL != null && FWS.LIZ(this.LJJIJIIJIL)) {
            JsBridgeManager.INSTANCE.registerJsBridgeWithWebView(this.LJJZZI, this.LJIILJJIL.getWebView());
            R0P.LIZ(this.LJJIJIIJIL, "0", LJIIIZ(), LJIIIIZZ());
            this.LJJJLIIL = true;
        } else {
            R0P.LIZ(this.LJJIJIIJIL, "1", LJIIIZ(), LJIIIIZZ());
            String str = this.LJJIJIIJIL;
            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 22).isSupported) {
                try {
                    Uri parse = Uri.parse(str);
                    JSONObject jSONObject = new JSONObject();
                    new StringBuilder();
                    jSONObject.put(PushConstants.WEB_URL, C0002O.m25084C(parse.getScheme(), "://", parse.getHost(), parse.getPath()));
                    C2118a.LIZ().LIZ("wallet_rd_webview_illegal_domain", jSONObject);
                } catch (Exception unused3) {
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            String str2 = "";
            if (this.LJII) {
                TextView textView = this.LJIILIIL;
                if (!TextUtils.isEmpty(this.LJFF)) {
                    str2 = this.LJFF;
                }
                textView.setText(str2);
            } else {
                this.LJIILIIL.setText(str2);
            }
            if (this.LJJJJJL && this.LJJL.getLayoutParams() != null) {
                this.LJJL.getLayoutParams().height = 1;
                this.LJJL.getLayoutParams().width = 1;
            }
            if (CJPayBasicUtils.isNetworkAvailable(this)) {
                LIZ();
            } else {
                LIZJ();
            }
        }
        if (this.LJJLIIJ != null && (this.LJJJJLL == 1 || this.LJIIIIZZ)) {
            this.LJJLIIJ.setEnableSwipe(false);
        }
        if (this.LJJJJZ > 0) {
            this.LJIIL.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.base.h5.CJPayH5Activity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6099);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !CJPayH5Activity.this.LJIILLIIL && !CJPayH5Activity.this.isFinishing()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("service", "web");
                        hashMap.put("action", "timeout");
                        C2118a.LIZ().LIZ(106).LIZ(hashMap).LIZIZ();
                        CJPayH5Activity.this.finish();
                    }
                }
            }, this.LJJJJZ * 1000);
        }
        LJIIL(this.LJJIJIIJIL);
        MethodCollector.m14707o(360);
    }

    private int LIZ(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 37);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getIntent() == null) {
            return i;
        }
        if (getIntent().hasExtra(str)) {
            return getIntent().getIntExtra(str, i);
        }
        if (getIntent().getData() != null) {
            try {
                return Integer.parseInt(getIntent().getData().getQueryParameter(str));
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public final void LIZIZ(int i, String str) {
        HashSet<String> hashSet;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 73).isSupported && (hashSet = LJLIIIL) != null && str != null && !hashSet.contains(str)) {
            LJLIIIL.add(str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("hint", i);
                jSONObject.put("loadurl", str);
                C2118a.LIZ().LIZ("wallet_rd_hint_offline_resource", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static String LIZ(String str, Intent intent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, intent}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str2 = CJPayHostInfo.inheritTheme;
        if (C135343c9S.LIZ(str)) {
            if (!TextUtils.isEmpty(str2)) {
                if ("dark".equals(str2)) {
                    new StringBuilder();
                    return C0002O.m25086C(str, "&tp_theme=dark&sdk_theme=dark");
                }
                new StringBuilder();
                return C0002O.m25086C(str, "&tp_theme=light&sdk_theme=light");
            } else if (CJPayHostInfo.isFollowSystemTheme) {
                if (AppCompatDelegate.getDefaultNightMode() == 2) {
                    new StringBuilder();
                    return C0002O.m25086C(str, "&tp_theme=dark&sdk_theme=dark");
                }
                new StringBuilder();
                return C0002O.m25086C(str, "&tp_theme=light&sdk_theme=light");
            } else if (C135343c9S.LIZ().LIZJ() != null && !C135343c9S.LIZ().LIZJ().LIZ.isEmpty()) {
                String str3 = C135343c9S.LIZ().LIZJ().LIZ;
                new StringBuilder();
                return C0002O.m25083C(str, "&tp_theme=", str3, "&sdk_theme=", str3);
            } else {
                new StringBuilder();
                return C0002O.m25086C(str, "&tp_theme=light&sdk_theme=light");
            }
        }
        new StringBuilder();
        return C0002O.m25086C(str, "&tp_theme=light&sdk_theme=light");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 27);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (i == 4) {
            CJPayInputKeyboardHelper.hideSystemKeyboard(this);
            if (!TextUtils.isEmpty(this.LJJIJIIJIL) && this.LJJIJIIJIL.contains("wx.tenpay.com")) {
                LIZLLL();
            }
            if (this.LJIJJ) {
                this.LJIJJ = false;
                C2118a.LIZ().LIZ(0);
                finish();
                return true;
            }
            CJPayJsBridgeWebView cJPayJsBridgeWebView = this.LJIILJJIL;
            if (cJPayJsBridgeWebView != null) {
                cJPayJsBridgeWebView.LIZIZ("", "click.backbutton");
            }
            if (!LJIILIIL()) {
                return true;
            }
            if ((!TextUtils.isEmpty(this.LJJLIIIIJ) || !TextUtils.isEmpty(this.LJJLI)) && ((this.LJJLIIIJ == 1 && !this.LJJLIIIJJIZ) || ((i2 = this.LJJLIIIJ) != 1 && i2 != 2))) {
                if (this.LJJLIIIJ == 1) {
                    this.LJJLIIIJJIZ = true;
                }
                LIZIZ(this.LJJLI, this.LJJLIIIIJ);
                return true;
            }
            CJPayJsBridgeWebView cJPayJsBridgeWebView2 = this.LJIILJJIL;
            if (cJPayJsBridgeWebView2 != null && cJPayJsBridgeWebView2.LIZ() && !this.LJIIZILJ) {
                this.LJIILJJIL.LIZIZ();
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    private boolean LIZ(String str, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 38);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getIntent() == null) {
            return z;
        }
        if (getIntent().hasExtra(str)) {
            return getIntent().getBooleanExtra(str, z);
        }
        if (getIntent().getData() != null) {
            String queryParameter = getIntent().getData().getQueryParameter(str);
            try {
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Boolean.parseBoolean(queryParameter);
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZIZ(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p132h5.CJPayH5Activity.LIZIZ(java.lang.String, java.lang.String):void");
    }

    @Override // p003X.AbstractC137071cbL
    public final Intent LIZ(CJWebviewInfoBean cJWebviewInfoBean, CJPayHostInfo cJPayHostInfo) {
        String str;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJWebviewInfoBean, cJPayHostInfo}, this, LIZ, false, 60);
        if (proxy.isSupported) {
            return (Intent) proxy.result;
        }
        if (StringUtil.isEmpty(cJWebviewInfoBean.hideStatusBar)) {
            str = "0";
        } else {
            str = cJWebviewInfoBean.hideStatusBar;
        }
        boolean equals = "0".equals(str);
        cJWebviewInfoBean.LIZ();
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        h5ParamBuilder.setContext(this);
        h5ParamBuilder.setUrl(cJWebviewInfoBean.url);
        h5ParamBuilder.setTitle(cJWebviewInfoBean.title);
        h5ParamBuilder.setShowTitle(equals);
        h5ParamBuilder.setShowTitleBar(!"0".equals(cJWebviewInfoBean.hideTitleBar));
        h5ParamBuilder.setIsTransTitleBar(str);
        h5ParamBuilder.setStatusBarColor(cJWebviewInfoBean.backgroundColor);
        h5ParamBuilder.setBackButtonColor(cJWebviewInfoBean.backButtonColor);
        h5ParamBuilder.setNavigationBarColor("");
        h5ParamBuilder.setNeedTransparentActivity(cJWebviewInfoBean.isNeedTransparant);
        h5ParamBuilder.setScreenType(cJWebviewInfoBean.fullPage);
        h5ParamBuilder.setHideWebView(Boolean.FALSE);
        if (cJWebviewInfoBean.showLoading == 1) {
            z = true;
        }
        h5ParamBuilder.setShowLoading(z);
        h5ParamBuilder.setBackButtonIcon(cJWebviewInfoBean.backButtonIcon);
        h5ParamBuilder.setTitleTextColor(cJWebviewInfoBean.titleTextColor);
        h5ParamBuilder.setTitleBarBgColor(cJWebviewInfoBean.titleBarBgColor);
        h5ParamBuilder.setRequestType("");
        h5ParamBuilder.setFormData("");
        h5ParamBuilder.setCanvasMode(cJWebviewInfoBean.canvasMode);
        h5ParamBuilder.setStatusBarTextStyle(cJWebviewInfoBean.statusBarTextStyle);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.LIZIZ(cJPayHostInfo));
        Intent LIZ2 = LIZ(h5ParamBuilder);
        LIZ2.putExtra("key_is_from_banner", this.LJL);
        LIZ2.putExtra("key_enable_font_scale", cJWebviewInfoBean.enableFontScale);
        return LIZ2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, p003X.G4H
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), strArr, iArr}, this, LIZ, false, 47).isSupported) {
            return;
        }
        C65689Bvv c65689Bvv = this.LJJLIIIJLLLLLLLZ;
        if (c65689Bvv != null) {
            c65689Bvv.LIZ(i, strArr, iArr);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:
        if (r6 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r26, int r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p132h5.CJPayH5Activity.onActivityResult(int, int, android.content.Intent):void");
    }
}
