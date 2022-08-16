package com.alipay.sdk.p082m.p123x;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import com.alipay.sdk.p082m.p099i.C1287a;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p101j.C1297d;
import com.alipay.sdk.p082m.p101j.EnumC1296c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p123x.C1434e;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.x.d */
/* loaded from: classes2.dex */
public class C1425d extends AbstractC1424c implements C1434e.AbstractC1441f, C1434e.AbstractC1442g, C1434e.AbstractC1443h {

    /* renamed from: h */
    public final C1376a f22471h;

    /* renamed from: i */
    public boolean f22472i;

    /* renamed from: e */
    public boolean f22468e = true;

    /* renamed from: f */
    public String f22469f = "GET";

    /* renamed from: g */
    public boolean f22470g = false;

    /* renamed from: j */
    public C1434e f22473j = null;

    /* renamed from: k */
    public C1444f f22474k = new C1444f();

    static {
        Covode.recordClassIndex(4926);
    }

    /* renamed from: com.alipay.sdk.m.x.d$e  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractanimationAnimation$AnimationListenerC1431e implements Animation.AnimationListener {
        static {
            Covode.recordClassIndex(4932);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public AbstractanimationAnimation$AnimationListenerC1431e() {
        }

        public /* synthetic */ AbstractanimationAnimation$AnimationListenerC1431e(RunnableC1426a runnableC1426a) {
            this();
        }
    }

    /* renamed from: d */
    public boolean m18714d() {
        return this.f22472i;
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1441f
    /* renamed from: a */
    public synchronized boolean mo18686a(C1434e c1434e, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
            this.f22466a.runOnUiThread(new RunnableC1426a());
        }
        jsPromptResult.cancel();
        return true;
    }

    /* renamed from: com.alipay.sdk.m.x.d$a */
    /* loaded from: classes2.dex */
    public class RunnableC1426a implements Runnable {
        static {
            Covode.recordClassIndex(4927);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1425d.this.f22466a.finish();
        }

        public RunnableC1426a() {
        }
    }

    /* renamed from: h */
    private void m18710h() {
        C1434e c1434e = this.f22473j;
        if (c1434e != null) {
            C116971W2r.LIZIZ(c1434e.getWebView(), "javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    @Override // com.alipay.sdk.p082m.p123x.AbstractC1424c
    /* renamed from: c */
    public synchronized void mo18715c() {
        this.f22473j.m18705a();
        this.f22474k.m18677a();
    }

    /* renamed from: com.alipay.sdk.m.x.d$d */
    /* loaded from: classes2.dex */
    public class RunnableC1429d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22481a;

        /* renamed from: b */
        public final /* synthetic */ SslErrorHandler f22482b;

        static {
            Covode.recordClassIndex(4930);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1422b.m18729a(this.f22481a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new DialogInterface$OnClickListenerC1430a(), null, null);
        }

        /* renamed from: com.alipay.sdk.m.x.d$d$a */
        /* loaded from: classes2.dex */
        public class DialogInterface$OnClickListenerC1430a implements DialogInterface.OnClickListener {
            static {
                Covode.recordClassIndex(4931);
            }

            public DialogInterface$OnClickListenerC1430a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RunnableC1429d.this.f22482b.cancel();
                C1301a.m19211b(C1425d.this.f22471h, "net", "SSLDenied", "2");
                C1295b.m19239a(C1295b.m19241a());
                RunnableC1429d.this.f22481a.finish();
            }
        }

        public RunnableC1429d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f22481a = activity;
            this.f22482b = sslErrorHandler;
        }
    }

    /* renamed from: f */
    private synchronized void m18712f() {
        Activity activity = this.f22466a;
        C1434e c1434e = this.f22473j;
        if (activity != null && c1434e != null) {
            if (this.f22468e) {
                activity.finish();
            } else {
                c1434e.m18700a("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    /* renamed from: g */
    private synchronized boolean m18711g() {
        try {
            C1434e c1434e = new C1434e(this.f22466a, this.f22471h, new C1434e.C1440e(!m18728a(), !m18728a()));
            this.f22473j = c1434e;
            c1434e.setChromeProxy(this);
            this.f22473j.setWebClientProxy(this);
            this.f22473j.setWebEventProxy(this);
            addView(this.f22473j);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private synchronized void m18709i() {
        WebView webView = this.f22473j.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        }
        C1444f c1444f = this.f22474k;
        if (c1444f != null && !c1444f.m18675b()) {
            m18713e();
        } else {
            m18720a(false);
        }
    }

    /* renamed from: e */
    private synchronized boolean m18713e() {
        if (this.f22474k.m18675b()) {
            this.f22466a.finish();
        } else {
            this.f22470g = true;
            C1434e c1434e = this.f22473j;
            this.f22473j = this.f22474k.m18674c();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C1427b(c1434e));
            c1434e.setAnimation(translateAnimation);
            removeView(c1434e);
            addView(this.f22473j);
        }
        return true;
    }

    @Override // com.alipay.sdk.p082m.p123x.AbstractC1424c
    /* renamed from: b */
    public synchronized boolean mo18719b() {
        Activity activity = this.f22466a;
        if (activity == null) {
            return true;
        }
        if (m18728a()) {
            C1434e c1434e = this.f22473j;
            if (c1434e != null && c1434e.getWebView() != null) {
                if (c1434e.getWebView().canGoBack()) {
                    if (m18714d()) {
                        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.NETWORK_ERROR.m19230b());
                        C1295b.m19239a(C1295b.m19240a(m19229b.m19230b(), m19229b.m19233a(), ""));
                        activity.finish();
                    }
                } else {
                    C1295b.m19239a(C1295b.m19241a());
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        }
        if (!this.f22470g) {
            m18712f();
        }
        return true;
    }

    /* renamed from: com.alipay.sdk.m.x.d$b */
    /* loaded from: classes2.dex */
    public class C1427b extends AbstractanimationAnimation$AnimationListenerC1431e {

        /* renamed from: a */
        public final /* synthetic */ C1434e f22476a;

        static {
            Covode.recordClassIndex(4928);
        }

        @Override // com.alipay.sdk.p082m.p123x.C1425d.AbstractanimationAnimation$AnimationListenerC1431e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f22476a.m18705a();
            C1425d.this.f22470g = false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1427b(C1434e c1434e) {
            super(null);
            this.f22476a = c1434e;
        }
    }

    /* renamed from: com.alipay.sdk.m.x.d$f */
    /* loaded from: classes2.dex */
    public static class C1432f {

        /* renamed from: a */
        public final WeakReference<C1434e> f22485a;

        /* renamed from: b */
        public final String f22486b;

        /* renamed from: c */
        public final String f22487c;

        /* renamed from: d */
        public final JSONObject f22488d;

        /* renamed from: e */
        public boolean f22489e = false;

        static {
            Covode.recordClassIndex(4933);
        }

        /* renamed from: a */
        public static String m18708a(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return str.replace("'", "");
        }

        /* renamed from: a */
        public void m18707a(JSONObject jSONObject) {
            C1434e c1434e;
            if (this.f22489e || (c1434e = (C1434e) C1399n.m18793a(this.f22485a)) == null) {
                return;
            }
            this.f22489e = true;
            c1434e.m18700a(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", m18708a(this.f22487c), m18708a(jSONObject.toString())));
        }

        public C1432f(C1434e c1434e, String str, String str2, JSONObject jSONObject) {
            this.f22485a = new WeakReference<>(c1434e);
            this.f22486b = str;
            this.f22487c = str2;
            this.f22488d = jSONObject;
        }
    }

    /* renamed from: a */
    private synchronized void m18720a(boolean z) {
        C1295b.m19238a(z);
        this.f22466a.finish();
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1443h
    /* renamed from: b */
    public synchronized void mo18678b(C1434e c1434e) {
        m18712f();
    }

    /* renamed from: com.alipay.sdk.m.x.d$c */
    /* loaded from: classes2.dex */
    public class C1428c extends AbstractanimationAnimation$AnimationListenerC1431e {

        /* renamed from: a */
        public final /* synthetic */ C1434e f22478a;

        /* renamed from: b */
        public final /* synthetic */ String f22479b;

        static {
            Covode.recordClassIndex(4929);
        }

        @Override // com.alipay.sdk.p082m.p123x.C1425d.AbstractanimationAnimation$AnimationListenerC1431e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C1425d.this.removeView(this.f22478a);
            C1425d.this.f22473j.m18700a(this.f22479b);
            C1425d.this.f22470g = false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1428c(C1434e c1434e, String str) {
            super(null);
            this.f22478a = c1434e;
            this.f22479b = str;
        }
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1443h
    /* renamed from: a */
    public synchronized void mo18679a(C1434e c1434e) {
        c1434e.getWebView().reload();
        c1434e.getRefreshButton().setVisibility(4);
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22470g) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.alipay.sdk.p082m.p123x.AbstractC1424c
    /* renamed from: a */
    public synchronized void mo18723a(String str) {
        if ("POST".equals(this.f22469f)) {
            this.f22473j.m18699a(str, (byte[]) null);
        } else {
            this.f22473j.m18700a(str);
        }
        AbstractC1424c.m18727a(this.f22473j.getWebView());
    }

    /* renamed from: b */
    private synchronized void m18717b(String str) {
        int i;
        Map<String, String> m18785b = C1399n.m18785b(this.f22471h, str);
        if (str.startsWith("callNativeFunc")) {
            m18722a(m18785b.get(C2521l.LJI), m18785b.get("cbId"), m18785b.get(C2521l.LJIIL));
        } else if (str.startsWith("onBack")) {
            m18709i();
        } else if (str.startsWith("setTitle") && m18785b.containsKey("title")) {
            this.f22473j.getTitle().setText(m18785b.get("title"));
        } else if (str.startsWith("onRefresh")) {
            this.f22473j.getWebView().reload();
        } else if (str.startsWith("showBackButton") && m18785b.containsKey("bshow")) {
            boolean equals = TextUtils.equals("true", m18785b.get("bshow"));
            ImageView backButton = this.f22473j.getBackButton();
            if (equals) {
                i = 0;
            } else {
                i = 4;
            }
            backButton.setVisibility(i);
        } else if (str.startsWith("onExit")) {
            C1295b.m19239a(m18785b.get("result"));
            m18720a(TextUtils.equals("true", m18785b.get("bsucc")));
        } else {
            if (str.startsWith("onLoadJs")) {
                this.f22473j.m18700a("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        }
    }

    /* renamed from: com.alipay.sdk.m.x.d$g */
    /* loaded from: classes2.dex */
    public static class C1433g implements C1297d.AbstractC1298a {

        /* renamed from: a */
        public final C1432f f22490a;

        /* renamed from: b */
        public final String f22491b;

        static {
            Covode.recordClassIndex(4934);
        }

        public C1433g(C1432f c1432f, String str) {
            this.f22490a = c1432f;
            this.f22491b = str;
        }

        @Override // com.alipay.sdk.p082m.p101j.C1297d.AbstractC1298a
        /* renamed from: a */
        public void mo18706a(boolean z, JSONObject jSONObject, String str) {
            try {
                this.f22490a.m18707a(new JSONObject().put("success", z).put("random", this.f22491b).put(C2521l.LJIIJ, jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1442g
    /* renamed from: b */
    public synchronized boolean mo18681b(C1434e c1434e, String str) {
        C1376a c1376a = this.f22471h;
        C1301a.m19216a(c1376a, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + C1399n.m18760i(str));
        m18710h();
        c1434e.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1441f
    /* renamed from: c */
    public synchronized void mo18685c(C1434e c1434e, String str) {
        if (!str.startsWith("http") && !c1434e.getUrl().endsWith(str)) {
            this.f22473j.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1442g
    /* renamed from: d */
    public synchronized boolean mo18680d(C1434e c1434e, String str) {
        C1376a c1376a = this.f22471h;
        C1301a.m19216a(c1376a, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + C1399n.m18760i(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            m18710h();
        }
        return false;
    }

    /* renamed from: b */
    private synchronized boolean m18716b(String str, String str2) {
        C1434e c1434e = this.f22473j;
        try {
            C1434e c1434e2 = new C1434e(this.f22466a, this.f22471h, new C1434e.C1440e(!m18728a(), !m18728a()));
            this.f22473j = c1434e2;
            c1434e2.setChromeProxy(this);
            this.f22473j.setWebClientProxy(this);
            this.f22473j.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f22473j.getTitle().setText(str2);
            }
            this.f22470g = true;
            this.f22474k.m18676a(c1434e);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C1428c(c1434e, str));
            this.f22473j.setAnimation(translateAnimation);
            addView(this.f22473j);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1442g
    /* renamed from: a */
    public synchronized boolean mo18682a(C1434e c1434e, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.f22466a;
        if (activity == null) {
            return true;
        }
        if (C1399n.m18802a(this.f22471h, str, activity)) {
            return true;
        }
        if (str.startsWith("alipayjsbridge://")) {
            m18717b(str.substring(17));
        } else if (TextUtils.equals(str, "sdklite://h5quit")) {
            m18720a(false);
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            C116971W2r.LIZIZ(activity, intent);
        } else {
            this.f22473j.m18700a(str);
        }
        return true;
    }

    public C1425d(Activity activity, C1376a c1376a, String str) {
        super(activity, str);
        this.f22471h = c1376a;
        m18711g();
    }

    /* renamed from: a */
    public synchronized void m18721a(String str, String str2, boolean z) {
        this.f22469f = str2;
        this.f22473j.getTitle().setText(str);
        this.f22468e = z;
    }

    /* renamed from: a */
    private synchronized void m18722a(String str, String str2, String str3) {
        C1434e c1434e = this.f22473j;
        if (c1434e == null) {
            return;
        }
        JSONObject m18762h = C1399n.m18762h(str3);
        C1432f c1432f = new C1432f(c1434e, str, str2, m18762h);
        Context context = c1434e.getContext();
        String str4 = c1432f.f22486b;
        int i = 4;
        switch (str4.hashCode()) {
            case -1785164386:
                if (str4.equals("canUseTaoLogin")) {
                    String url = c1434e.getUrl();
                    if (!C1399n.m18803a(this.f22471h, url)) {
                        C1301a.m19211b(this.f22471h, "biz", "jsUrlErr", url);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    boolean m19226a = C1297d.m19226a(this.f22471h, context);
                    jSONObject.put("enabled", m19226a);
                    C1301a.m19216a(this.f22471h, "biz", "TbChk", String.valueOf(m19226a));
                    c1432f.m18707a(jSONObject);
                    return;
                }
                return;
            case -552487705:
                if (str4.equals("taoLogin")) {
                    String url2 = c1434e.getUrl();
                    if (!C1399n.m18803a(this.f22471h, url2)) {
                        C1301a.m19211b(this.f22471h, "biz", "jsUrlErr", url2);
                        return;
                    }
                    String optString = m18762h.optString("random");
                    JSONObject optJSONObject = m18762h.optJSONObject("options");
                    if (!TextUtils.isEmpty("random") && optJSONObject != null) {
                        String optString2 = optJSONObject.optString(PushConstants.WEB_URL);
                        String optString3 = optJSONObject.optString("action");
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && (context instanceof Activity)) {
                            C1297d.m19227a(this.f22471h, (Activity) context, 1010, optString2, optString3, new C1433g(c1432f, optString));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3015911:
                if (str4.equals("back")) {
                    m18709i();
                    return;
                }
                return;
            case 3127582:
                if (str4.equals("exit")) {
                    C1295b.m19239a(m18762h.optString("result", null));
                    m18720a(m18762h.optBoolean("success", false));
                    return;
                }
                return;
            case 110371416:
                if (str4.equals("title")) {
                    if (m18762h.has("title")) {
                        c1434e.getTitle().setText(m18762h.optString("title", ""));
                        return;
                    }
                    return;
                }
                return;
            case 1085444827:
                if (str4.equals("refresh")) {
                    c1434e.getWebView().reload();
                    return;
                }
                return;
            case 1703426986:
                if (str4.equals("pushWindow")) {
                    m18716b(m18762h.optString(PushConstants.WEB_URL), m18762h.optString("title", ""));
                    return;
                }
                return;
            case 1906413305:
                if (str4.equals("backButton")) {
                    boolean optBoolean = m18762h.optBoolean("show", true);
                    ImageView backButton = c1434e.getBackButton();
                    if (optBoolean) {
                        i = 0;
                    }
                    backButton.setVisibility(i);
                    return;
                }
                return;
            case 1947723784:
                if (str4.equals("sdkInfo")) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sdk_version", C1287a.f22143g);
                    jSONObject2.put("app_name", this.f22471h.m18935b());
                    jSONObject2.put("app_version", this.f22471h.m18931c());
                    c1432f.m18707a(jSONObject2);
                    return;
                }
                return;
            case 2033767917:
                if (str4.equals("refreshButton")) {
                    boolean optBoolean2 = m18762h.optBoolean("show", true);
                    ImageView refreshButton = c1434e.getRefreshButton();
                    if (optBoolean2) {
                        i = 0;
                    }
                    refreshButton.setVisibility(i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1442g
    /* renamed from: a */
    public synchronized boolean mo18683a(C1434e c1434e, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f22466a;
        if (activity == null) {
            return true;
        }
        C1376a c1376a = this.f22471h;
        C1301a.m19211b(c1376a, "net", "SSLError", "2-" + sslError);
        activity.runOnUiThread(new RunnableC1429d(activity, sslErrorHandler));
        return true;
    }

    @Override // com.alipay.sdk.p082m.p123x.C1434e.AbstractC1442g
    /* renamed from: a */
    public synchronized boolean mo18684a(C1434e c1434e, int i, String str, String str2) {
        this.f22472i = true;
        C1376a c1376a = this.f22471h;
        C1301a.m19211b(c1376a, "net", "webError", "onReceivedError:" + i + "|" + str2);
        c1434e.getRefreshButton().setVisibility(0);
        return false;
    }
}
