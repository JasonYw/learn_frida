package com.bytedance.accountseal.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC137557cjB;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C63497B3z;
import p003X.C63837BHb;
import p003X.C98175Old;
import p003X.OMO;
import p003X.PIJ;

/* loaded from: classes7.dex */
public final class SealWebView extends WebView {
    public static ChangeQuickRedirect LIZ = null;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C63497B3z LIZLLL = new C63497B3z();

    /* renamed from: LJ */
    public final PIJ f25588LJ = new PIJ(this);
    public AbstractC137557cjB LJFF;
    public static final String LJI = LJI;
    public static final String LJI = LJI;

    public final AbstractC137557cjB getCallback() {
        return this.LJFF;
    }

    static {
        Covode.recordClassIndex(9887);
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 6).isSupported && !OMO.LIZIZ.LIZIZ(this) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            super.goBack();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 12).isSupported) {
            C98175Old.LIZJ.removePageContainer(this);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                super.onDetachedFromWindow();
            }
        }
    }

    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        boolean canGoBack;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 9);
            if (proxy2.isSupported) {
                obj = proxy2.result;
            } else {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
                if (proxy3.isSupported) {
                    canGoBack = ((Boolean) proxy3.result).booleanValue();
                } else {
                    canGoBack = super.canGoBack();
                }
                if (!canGoBack || !OMO.LIZIZ.LIZ(this)) {
                    return false;
                }
                return true;
            }
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void setCallback(AbstractC137557cjB abstractC137557cjB) {
        this.LJFF = abstractC137557cjB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealWebView(Context context) {
        super(context, null);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(852);
        if (C63837BHb.LIZJ.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C116971W2r.LIZ(settings, sb.toString());
            }
        }
        MethodCollector.m14707o(852);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(853);
        MethodCollector.m14707o(853);
    }
}
