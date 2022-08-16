package com.alipay.sdk.p082m.p123x;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.x.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1424c extends FrameLayout {

    /* renamed from: a */
    public Activity f22466a;

    /* renamed from: b */
    public final String f22467b;

    static {
        Covode.recordClassIndex(4925);
    }

    /* renamed from: a */
    public abstract void mo18723a(String str);

    /* renamed from: b */
    public abstract boolean mo18719b();

    /* renamed from: c */
    public abstract void mo18715c();

    /* renamed from: a */
    public boolean m18728a() {
        return "v1".equals(this.f22467b);
    }

    /* renamed from: a */
    public static void m18727a(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public AbstractC1424c(Activity activity, String str) {
        super(activity);
        this.f22466a = activity;
        this.f22467b = str;
    }

    /* renamed from: a */
    public void m18726a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            CookieSyncManager.createInstance(this.f22466a.getApplicationContext()).sync();
            C116971W2r.LIZ(CookieManager.getInstance(), str, str2);
            CookieSyncManager.getInstance().sync();
        }
    }
}
