package com.bytedance.android.live.browser.p302f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.p674j.p675a.AbstractC8031a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import java.util.List;
import p003X.B8Q;
import p003X.C101305Pv1;
import p003X.C65649BvH;

/* renamed from: com.bytedance.android.live.browser.f.c */
/* loaded from: classes26.dex */
public final class C3880c {
    public static ChangeQuickRedirect LIZ;
    public static final C3880c LIZIZ = new C3880c();
    public List<AbstractC8031a> LIZJ = new LinkedList();

    static {
        Covode.recordClassIndex(22007);
    }

    public C3880c() {
        this.LIZJ.add(new C101305Pv1());
        this.LIZJ.add(new C65649BvH());
        this.LIZJ.add(new B8Q());
    }

    public final String LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Uri.Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str);
        return buildUpon.build().toString();
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        for (AbstractC8031a abstractC8031a : this.LIZJ) {
            if (abstractC8031a instanceof B8Q) {
                ((B8Q) abstractC8031a).LIZ(str);
            }
        }
    }

    public final WebResourceResponse LIZ(String str, WebView webView) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, webView}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (WebResourceResponse) proxy.result;
        }
        Uri parse = Uri.parse(str);
        for (AbstractC8031a abstractC8031a : this.LIZJ) {
            WebResourceResponse LIZ2 = abstractC8031a.LIZ(parse, webView);
            if (LIZ2 != null) {
                return LIZ2;
            }
        }
        return null;
    }
}
