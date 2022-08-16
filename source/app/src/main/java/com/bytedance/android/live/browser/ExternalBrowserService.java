package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.jsb.IExternalBrowserService;
import com.bytedance.android.livesdkapi.jsb.IExternalLiveHybridComponent;
import com.bytedance.android.livesdkapi.jsb.IExternalLiveLynxCallback;
import com.bytedance.android.livesdkapi.jsb.IExternalLiveWebCallback;
import com.bytedance.android.livesdkapi.jsb.IOuterAnnieCardCallback;
import com.bytedance.android.livesdkapi.jsb.IOuterAnnieCardComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.event.Event;
import com.bytedance.ies.xbridge.event.EventCenter;
import com.bytedance.ies.xbridge.model.collections.defaultimpl.DefaultXReadableMapImpl;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C150254g2Y;
import p003X.C150255g2Z;
import p003X.C3JU;
import p003X.LX3;
import p003X.LX4;
import p003X.LX5;
import p003X.LX7;
import p003X.LX8;
import p003X.LX9;
import p003X.LXA;
import p003X.LXB;
import p003X.LXC;
import p003X.LXD;
import p003X.PQK;
import p003X.S5C;

/* loaded from: classes5.dex */
public final class ExternalBrowserService implements IExternalBrowserService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(21882);
        } else {
            Covode.recordClassIndex(21882);
        }
    }

    @Override // com.bytedance.android.livesdkapi.jsb.IExternalBrowserService
    public final void enqueueEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
        EventCenter.enqueueEvent(new Event(str, System.currentTimeMillis(), new DefaultXReadableMapImpl(jSONObject)));
    }

    @Override // com.bytedance.android.livesdkapi.jsb.IExternalBrowserService
    public final <T> void sendEventToAllJsBridges(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ((IBrowserService) ServiceManager.getService(IBrowserService.class)).sendEventToAllJsBridges(str, t);
    }

    private final Uri handleUrl(String str, boolean z) {
        Uri.Builder buildUpon;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        if (z) {
            buildUpon = Uri.parse("sslocal://webcast_lynxview?hybrid_type=lynx").buildUpon();
            Intrinsics.checkNotNullExpressionValue(buildUpon, "");
        } else {
            buildUpon = Uri.parse("sslocal://webcast_webview?hybrid_type=h5").buildUpon();
            Intrinsics.checkNotNullExpressionValue(buildUpon, "");
        }
        Uri build = Uri.parse(str).buildUpon().build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        Set<String> queryParameterNames = build.getQueryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        for (String str2 : queryParameterNames) {
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String queryParameter = build.getQueryParameter(str2);
            if (queryParameter != null) {
                linkedHashMap.put(str2, queryParameter);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
        }
        buildUpon.appendQueryParameter(PushConstants.WEB_URL, build.toString());
        Uri build2 = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    @Override // com.bytedance.android.livesdkapi.jsb.IExternalBrowserService
    public final IOuterAnnieCardComponent createAnnieCardComponent(Context context, Uri uri, IOuterAnnieCardCallback iOuterAnnieCardCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, iOuterAnnieCardCallback}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (IOuterAnnieCardComponent) proxy.result;
        }
        C106862S5w.LIZ(context, uri, iOuterAnnieCardCallback);
        HybridCard hybridCard = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).getHybridCard(context, uri, new LXA(iOuterAnnieCardCallback));
        if (hybridCard == null) {
            return null;
        }
        return new LX9(hybridCard);
    }

    @Override // com.bytedance.android.livesdkapi.jsb.IExternalBrowserService
    public final IExternalLiveHybridComponent createLynxComponent(Activity activity, String str, IExternalLiveLynxCallback iExternalLiveLynxCallback, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, str, iExternalLiveLynxCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (IExternalLiveHybridComponent) proxy.result;
        }
        C106862S5w.LIZ(activity, str);
        if (z) {
            HybridCard hybridCard = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).getHybridCard(activity, handleUrl(str, true), new C150254g2Y(iExternalLiveLynxCallback));
            if (hybridCard == null) {
                return null;
            }
            return new LX7(hybridCard, str);
        }
        try {
            LX5 createLynxComponent = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).createLynxComponent(activity, -1, str, LynxThreadStrategy.ALL_ON_UI, str, new C150255g2Z(iExternalLiveLynxCallback), new PQK(iExternalLiveLynxCallback), false);
            if (createLynxComponent != null) {
                return new LX4(createLynxComponent);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.jsb.IExternalBrowserService
    public final IExternalLiveHybridComponent createWebViewRecord(Activity activity, String str, IExternalLiveWebCallback iExternalLiveWebCallback, boolean z) {
        String LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, str, iExternalLiveWebCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (IExternalLiveHybridComponent) proxy.result;
        }
        C106862S5w.LIZ(activity, str);
        if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
            LIZ = str;
        } else {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "");
            LIZ = S5C.LIZ(parse, PushConstants.WEB_URL, "");
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            HybridCard hybridCard = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).getHybridCard(activity, handleUrl(LIZ, false), new LXC(iExternalLiveWebCallback));
            if (hybridCard == null) {
                return null;
            }
            return new LX8(hybridCard, str);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            C3JU createWebViewRecord = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).createWebViewRecord(activity, LIZ, new LXB(iExternalLiveWebCallback), new LXD(iExternalLiveWebCallback));
            if (createWebViewRecord != null) {
                return new LX3(createWebViewRecord);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
