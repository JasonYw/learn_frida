package com.alipay.sdk.p082m.p123x;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1396k;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.example.webviewclient_hook_library.WebViewClientUtils;
import java.lang.reflect.Method;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.OMO;

/* renamed from: com.alipay.sdk.m.x.e */
/* loaded from: classes17.dex */
public class C1434e extends LinearLayout {

    /* renamed from: m */
    public static Handler f22492m = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public ImageView f22493a;

    /* renamed from: b */
    public TextView f22494b;

    /* renamed from: c */
    public ImageView f22495c;

    /* renamed from: d */
    public ProgressBar f22496d;

    /* renamed from: e */
    public WebView f22497e;

    /* renamed from: f */
    public final C1440e f22498f;

    /* renamed from: g */
    public AbstractC1441f f22499g;

    /* renamed from: h */
    public AbstractC1442g f22500h;

    /* renamed from: i */
    public AbstractC1443h f22501i;

    /* renamed from: j */
    public final C1376a f22502j;

    /* renamed from: k */
    public View.OnClickListener f22503k;

    /* renamed from: l */
    public final float f22504l;

    /* renamed from: com.alipay.sdk.m.x.e$f */
    /* loaded from: classes17.dex */
    public interface AbstractC1441f {
        static {
            Covode.recordClassIndex(4942);
        }

        /* renamed from: a */
        boolean mo18686a(C1434e c1434e, String str, String str2, String str3, JsPromptResult jsPromptResult);

        /* renamed from: c */
        void mo18685c(C1434e c1434e, String str);
    }

    /* renamed from: com.alipay.sdk.m.x.e$g */
    /* loaded from: classes17.dex */
    public interface AbstractC1442g {
        static {
            Covode.recordClassIndex(4943);
        }

        /* renamed from: a */
        boolean mo18684a(C1434e c1434e, int i, String str, String str2);

        /* renamed from: a */
        boolean mo18683a(C1434e c1434e, SslErrorHandler sslErrorHandler, SslError sslError);

        /* renamed from: a */
        boolean mo18682a(C1434e c1434e, String str);

        /* renamed from: b */
        boolean mo18681b(C1434e c1434e, String str);

        /* renamed from: d */
        boolean mo18680d(C1434e c1434e, String str);
    }

    /* renamed from: com.alipay.sdk.m.x.e$h */
    /* loaded from: classes17.dex */
    public interface AbstractC1443h {
        static {
            Covode.recordClassIndex(4944);
        }

        /* renamed from: a */
        void mo18679a(C1434e c1434e);

        /* renamed from: b */
        void mo18678b(C1434e c1434e);
    }

    public static Object com_alipay_sdk_m_x_e_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alipay_sdk_m_x_e_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alipay_sdk_m_x_e_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    public ImageView getBackButton() {
        return this.f22493a;
    }

    public ProgressBar getProgressbar() {
        return this.f22496d;
    }

    public ImageView getRefreshButton() {
        return this.f22495c;
    }

    public TextView getTitle() {
        return this.f22494b;
    }

    public WebView getWebView() {
        return this.f22497e;
    }

    /* renamed from: com.alipay.sdk.m.x.e$a */
    /* loaded from: classes17.dex */
    public class View$OnClickListenerC1435a implements View.OnClickListener {
        static {
            Covode.recordClassIndex(4936);
        }

        /* renamed from: com.alipay.sdk.m.x.e$a$a */
        /* loaded from: classes17.dex */
        public class RunnableC1436a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ View f22506a;

            static {
                Covode.recordClassIndex(4937);
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22506a.setEnabled(true);
            }

            public RunnableC1436a(View view) {
                this.f22506a = view;
            }
        }

        public View$OnClickListenerC1435a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC1443h abstractC1443h = C1434e.this.f22501i;
            if (abstractC1443h != null) {
                view.setEnabled(false);
                C1434e.f22492m.postDelayed(new RunnableC1436a(view), 256L);
                if (view == C1434e.this.f22493a) {
                    abstractC1443h.mo18678b(C1434e.this);
                } else if (view == C1434e.this.f22495c) {
                    abstractC1443h.mo18679a(C1434e.this);
                }
            }
        }
    }

    public String getUrl() {
        return this.f22497e.getUrl();
    }

    static {
        Covode.recordClassIndex(4935);
    }

    /* renamed from: a */
    public void m18705a() {
        removeAllViews();
        this.f22497e.removeAllViews();
        C116971W2r.LIZ(this.f22497e, (WebViewClient) null);
        this.f22497e.setWebChromeClient(null);
        this.f22497e.destroy();
    }

    /* renamed from: com.alipay.sdk.m.x.e$e */
    /* loaded from: classes2.dex */
    public static final class C1440e {

        /* renamed from: a */
        public boolean f22512a;

        /* renamed from: b */
        public boolean f22513b;

        static {
            Covode.recordClassIndex(4941);
        }

        public C1440e(boolean z, boolean z2) {
            this.f22512a = z;
            this.f22513b = z2;
        }
    }

    public void setWebEventProxy(AbstractC1443h abstractC1443h) {
        this.f22501i = abstractC1443h;
    }

    /* renamed from: com.alipay.sdk.m.x.e$c */
    /* loaded from: classes17.dex */
    public class C1438c extends WebChromeClient {
        static {
            Covode.recordClassIndex(4939);
        }

        public C1438c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            C1434e.this.f22499g.mo18685c(C1434e.this, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (C1434e.this.f22498f.f22513b) {
                if (i > 90) {
                    C1434e.this.f22496d.setVisibility(4);
                    return;
                }
                if (C1434e.this.f22496d.getVisibility() == 4) {
                    C1434e.this.f22496d.setVisibility(0);
                }
                C1434e.this.f22496d.setProgress(i);
                return;
            }
            C1434e.this.f22496d.setVisibility(8);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return C1434e.this.f22499g.mo18686a(C1434e.this, str, str2, str3, jsPromptResult);
        }
    }

    /* renamed from: com.alipay.sdk.m.x.e$d */
    /* loaded from: classes17.dex */
    public class C1439d extends WebViewClient {
        static {
            Covode.recordClassIndex(4940);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return WebViewClientUtils.insertActionInMethod(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return m18689x16d3abe2(this, webView, str);
        }

        public C1439d() {
        }

        public boolean com_alipay_sdk_m_x_e$d__shouldOverrideUrlLoading$___twin___(WebView webView, String str) {
            if (!C1434e.this.f22500h.mo18682a(C1434e.this, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!C1434e.this.f22500h.mo18681b(C1434e.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        /* renamed from: com_alipay_sdk_m_x_e$d_com_bytedance_ies_security_lancet_web_SecLinkLancet_shouldOverrideUrlLoading */
        public static boolean m18689x16d3abe2(C1439d c1439d, WebView webView, String str) {
            if (OMO.LIZIZ.LIZIZ(webView, str)) {
                return true;
            }
            return c1439d.com_alipay_sdk_m_x_e$d__shouldOverrideUrlLoading$___twin___(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!C1434e.this.f22500h.mo18680d(C1434e.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (!C1434e.this.f22500h.mo18683a(C1434e.this, sslErrorHandler, sslError)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (!C1434e.this.f22500h.mo18684a(C1434e.this, i, str, str2)) {
                super.onReceivedError(webView, i, str, str2);
            }
        }
    }

    /* renamed from: a */
    private int m18704a(int i) {
        return (int) (i * this.f22504l);
    }

    /* renamed from: a */
    public void m18700a(String str) {
        C116971W2r.LIZIZ(this.f22497e, str);
        AbstractC1424c.m18727a(this.f22497e);
    }

    public void setChromeProxy(AbstractC1441f abstractC1441f) {
        this.f22499g = abstractC1441f;
        if (abstractC1441f == null) {
            this.f22497e.setWebChromeClient(null);
        } else {
            this.f22497e.setWebChromeClient(new C1438c());
        }
    }

    public void setWebClientProxy(AbstractC1442g abstractC1442g) {
        this.f22500h = abstractC1442g;
        if (abstractC1442g == null) {
            C116971W2r.LIZ(this.f22497e, (WebViewClient) null);
        } else {
            C116971W2r.LIZ(this.f22497e, new C1439d());
        }
    }

    /* renamed from: b */
    private void m18697b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, 16973855);
        this.f22496d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(17301612));
        this.f22496d.setMax(100);
        this.f22496d.setBackgroundColor(-218103809);
        addView(this.f22496d, new LinearLayout.LayoutParams(-1, m18704a(2)));
    }

    /* renamed from: a */
    private void m18703a(Context context) {
        int i;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        if (this.f22498f.f22512a) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        ImageView imageView = new ImageView(context);
        this.f22493a = imageView;
        imageView.setOnClickListener(this.f22503k);
        this.f22493a.setScaleType(ImageView.ScaleType.CENTER);
        this.f22493a.setImageDrawable(C1396k.m18827a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", context));
        this.f22493a.setPadding(m18704a(12), 0, m18704a(12), 0);
        linearLayout.addView(this.f22493a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(m18704a(1), m18704a(25)));
        TextView textView = new TextView(context);
        this.f22494b = textView;
        textView.setTextColor(-15658735);
        this.f22494b.setTextSize(17.0f);
        this.f22494b.setMaxLines(1);
        this.f22494b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(m18704a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f22494b, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.f22495c = imageView2;
        imageView2.setOnClickListener(this.f22503k);
        this.f22495c.setScaleType(ImageView.ScaleType.CENTER);
        this.f22495c.setImageDrawable(C1396k.m18827a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", context));
        this.f22495c.setPadding(m18704a(12), 0, m18704a(12), 0);
        linearLayout.addView(this.f22495c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, m18704a(48)));
    }

    /* renamed from: c */
    private void m18695c(Context context) {
        WebView webView = new WebView(context);
        this.f22497e = webView;
        webView.setVerticalScrollbarOverlay(true);
        m18702a(this.f22497e, context);
        WebSettings settings = this.f22497e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAppCachePath(C116971W2r.LIZIZ(context).getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f22497e.setVerticalScrollbarOverlay(true);
        this.f22497e.setDownloadListener(new C1437b(context));
        try {
            try {
                this.f22497e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f22497e.removeJavascriptInterface("accessibility");
                this.f22497e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.f22497e.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.f22497e, "searchBoxJavaBridge_");
                    com_alipay_sdk_m_x_e_java_lang_reflect_Method_invoke(method, this.f22497e, new Object[]{"accessibility"});
                    com_alipay_sdk_m_x_e_java_lang_reflect_Method_invoke(method, this.f22497e, new Object[]{"accessibilityTraversal"});
                }
            }
        } catch (Throwable unused2) {
        }
        AbstractC1424c.m18727a(this.f22497e);
        addView(this.f22497e, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: com.alipay.sdk.m.x.e$b */
    /* loaded from: classes8.dex */
    public class C1437b implements DownloadListener {

        /* renamed from: a */
        public final /* synthetic */ Context f22508a;

        static {
            Covode.recordClassIndex(4938);
        }

        public C1437b(Context context) {
            this.f22508a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                C116971W2r.LIZ(this.f22508a, intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m18702a(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        WebSettings settings = webView.getSettings();
        new StringBuilder();
        C116971W2r.LIZ(settings, C0002O.m25086C(userAgentString, C1399n.m18766g(context)));
    }

    /* renamed from: a */
    public void m18699a(String str, byte[] bArr) {
        C116971W2r.LIZ(this.f22497e, str, bArr);
    }

    public C1434e(Context context, C1376a c1376a, C1440e c1440e) {
        this(context, null, c1376a, c1440e);
    }

    public C1434e(Context context, AttributeSet attributeSet, C1376a c1376a, C1440e c1440e) {
        super(context, attributeSet);
        this.f22503k = new View$OnClickListenerC1435a();
        this.f22498f = c1440e == null ? new C1440e(false, false) : c1440e;
        this.f22502j = c1376a;
        this.f22504l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        m18703a(context);
        m18697b(context);
        m18695c(context);
    }
}
