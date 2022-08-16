package com.bytedance.android.annie.card.web;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.android.annie.scheme.p215vo.WebHybridParamVo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.PPO;

/* loaded from: classes7.dex */
public final class WebViewFactory {
    public static ChangeQuickRedirect LIZ;
    public static final WebViewFactory LIZIZ;
    public static final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) WebViewFactory$mCreators$2.INSTANCE);

    /* renamed from: com.bytedance.android.annie.card.web.WebViewFactory$a */
    /* loaded from: classes7.dex */
    public interface AbstractC2602a {
        static {
            Covode.recordClassIndex(10695);
        }

        WebView LIZ(Context context, WebHybridParamVo webHybridParamVo, List<? extends C2603c> list);
    }

    private final HashMap<WebViewType, AbstractC2602a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (HashMap) (proxy.isSupported ? proxy.result : LIZJ.mo27335getValue());
    }

    /* loaded from: classes7.dex */
    public enum WebViewType {
        ANNIE("Annie"),
        PIA("Pia");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String hybridName;

        public static WebViewType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (WebViewType) (proxy.isSupported ? proxy.result : Enum.valueOf(WebViewType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WebViewType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (WebViewType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(10694);
        }

        WebViewType(String str) {
            this.hybridName = str;
        }
    }

    static {
        Covode.recordClassIndex(10692);
        WebViewFactory webViewFactory = new WebViewFactory();
        LIZIZ = webViewFactory;
        webViewFactory.LIZ(WebViewType.ANNIE, new AbstractC2602a() { // from class: com.bytedance.android.annie.card.web.WebViewFactory.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(10693);
            }

            @Override // com.bytedance.android.annie.card.web.WebViewFactory.AbstractC2602a
            public final WebView LIZ(Context context, WebHybridParamVo webHybridParamVo, List<? extends C2603c> list) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, webHybridParamVo, list}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return (WebView) proxy.result;
                }
                C106862S5w.LIZ(context, webHybridParamVo, list);
                return new PPO(context, webHybridParamVo, list);
            }
        });
    }

    public final boolean LIZ(WebViewType webViewType, AbstractC2602a abstractC2602a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{webViewType, abstractC2602a}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(webViewType, abstractC2602a);
        if (LIZ().containsKey(webViewType)) {
            return false;
        }
        LIZ().put(webViewType, abstractC2602a);
        return true;
    }

    public final WebView LIZ(WebViewType webViewType, Context context, WebHybridParamVo webHybridParamVo, List<? extends C2603c> list) {
        WebView LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{webViewType, context, webHybridParamVo, list}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (WebView) proxy.result;
        }
        C106862S5w.LIZ(webViewType, context, webHybridParamVo, list);
        if (LIZ().containsKey(webViewType)) {
            AbstractC2602a abstractC2602a = LIZ().get(webViewType);
            if (abstractC2602a == null || (LIZ2 = abstractC2602a.LIZ(context, webHybridParamVo, list)) == null) {
                return new PPO(context, webHybridParamVo, list);
            }
            return LIZ2;
        }
        return new PPO(context, webHybridParamVo, list);
    }
}
