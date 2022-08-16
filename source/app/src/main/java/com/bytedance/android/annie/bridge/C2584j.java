package com.bytedance.android.annie.bridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.annie.api.bridge.BaseJSBridgeMethodFactory;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.android.annie.api.bridge.RegisterPolicy;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.C13031g;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.AbstractC13058u;
import com.bytedance.ies.web.jsbridge2.C13040ah;
import com.bytedance.ies.web.jsbridge2.C13042ai;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.ies.web.jsbridge2.C13055n;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.FutureTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC90724Lok;
import p003X.C106862S5w;
import p003X.C441453dD;
import p003X.C88647KwL;
import p003X.C88653KwR;
import p003X.C88674Kwm;
import p003X.C88714KxQ;
import p003X.C89502LOe;
import p003X.C89505LOh;
import p003X.C89750LXs;
import p003X.C89752LXu;
import p003X.C90746Lp6;
import p003X.C99148P3e;
import p003X.C99742PQa;
import p003X.C99745PQd;
import p003X.C99747PQf;
import p003X.C99748PQg;
import p003X.C99749PQh;
import p003X.C99750PQi;
import p003X.C99758PQq;
import p003X.C99783PRp;
import p003X.C99820PTa;
import p003X.L1B;
import p003X.PK0;
import p003X.PL8;
import p003X.PLT;
import p003X.PLW;
import p003X.PM1;
import p003X.PQD;
import p003X.PQM;
import p003X.PQP;
import p003X.PQR;
import p003X.PQT;
import p003X.PQU;
import p003X.PQV;
import p003X.PQX;
import p003X.PQY;
import p003X.PTW;

/* renamed from: com.bytedance.android.annie.bridge.j */
/* loaded from: classes7.dex */
public final class C2584j implements IJSBridgeManager {
    public static ChangeQuickRedirect LIZ;
    public C13040ah LIZIZ;
    public C13042ai LIZJ;

    /* renamed from: LJ */
    public IHybridComponent f25612LJ;
    public Context LJFF;
    public boolean LJI;
    public final ConcurrentLinkedQueue<String> LIZLLL = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<AbstractC2583h> LJIIIIZZ = new ConcurrentLinkedQueue<>();
    public RegisterPolicy LJIIIZ = RegisterPolicy.DEFAULT;
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(JSBridgeManager$asyncJsbMethodAB$2.INSTANCE);
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(JSBridgeManager$jsbMethodCallbackAB$2.INSTANCE);
    public volatile boolean LJII = true;
    public final FutureTask<Unit> LJIIL = new FutureTask<>(new PQX(this));

    static {
        Covode.recordClassIndex(10505);
    }

    private final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return ((Boolean) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue())).booleanValue();
    }

    /* renamed from: LJ */
    private final boolean m15988LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return ((Boolean) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue())).booleanValue();
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final IHybridComponent getHybridComponent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return (IHybridComponent) proxy.result;
        }
        IHybridComponent iHybridComponent = this.f25612LJ;
        if (iHybridComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return iHybridComponent;
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final C13040ah getJSBridge2() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (C13040ah) proxy.result;
        }
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c13040ah;
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final C13042ai getJSBridge2IESSupport() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return (C13042ai) proxy.result;
        }
        C13042ai c13042ai = this.LIZJ;
        if (c13042ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c13042ai;
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final Activity getActivity() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (Activity) proxy.result;
        }
        Context context = this.LJFF;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        return (Activity) context;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        if (LIZLLL()) {
            this.LJII = false;
            AsyncTask.THREAD_POOL_EXECUTOR.execute(this.LJIIL);
        } else {
            LIZJ();
        }
        C99742PQa.LIZIZ.LIZ(this);
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIJ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ2 = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (LIZ2.booleanValue()) {
            if (!this.LJI) {
                PTW ptw = PTW.LIZIZ;
                C13040ah c13040ah = this.LIZIZ;
                if (c13040ah == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ptw.LIZ(c13040ah);
                return;
            }
            return;
        }
        PTW ptw2 = PTW.LIZIZ;
        C13040ah c13040ah2 = this.LIZIZ;
        if (c13040ah2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ptw2.LIZ(c13040ah2);
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        this.LJIIL.cancel(true);
        for (AbstractC2583h abstractC2583h : this.LJIIIIZZ) {
            abstractC2583h.LIZ();
        }
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13040ah.LIZIZ();
        C13042ai c13042ai = this.LIZJ;
        if (c13042ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13042ai.LIZ();
        if (!PatchProxy.proxy(new Object[]{this}, PQR.LIZJ, PQR.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            PQR.LIZIZ.remove(this);
        }
        PQV pqv = PQV.LIZLLL;
        C13040ah c13040ah2 = this.LIZIZ;
        if (c13040ah2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{c13040ah2}, pqv, PQV.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(c13040ah2);
            PQV.LIZJ.remove(c13040ah2);
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        PQV pqv = PQV.LIZLLL;
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C2585l LIZ2 = pqv.LIZ(c13040ah);
        if (LIZ2 == null) {
            return;
        }
        this.LJIIIZ = RegisterPolicy.SPECIFIED;
        for (Map.Entry<String, PK0<?, ?>> entry : LIZ2.LIZIZ.entrySet()) {
            registerMethod(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry2 : LIZ2.LIZJ.entrySet()) {
            registerMethod(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<String, IJavaMethod> entry3 : LIZ2.LIZLLL.entrySet()) {
            registerMethod(entry3.getKey(), entry3.getValue());
        }
    }

    private final void LJFF() {
        Map mapOf;
        Map mapOf2;
        Map mapOf3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        IHybridComponent iHybridComponent = this.f25612LJ;
        if (iHybridComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this, iHybridComponent}, null, C99758PQq.LIZ, true, 1);
        if (proxy.isSupported) {
            mapOf = (Map) proxy.result;
        } else {
            C106862S5w.LIZ(this, iHybridComponent);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m137to("closeAndOpen", new PQM(getActivity())), TuplesKt.m137to("sendLogV3", new PK0<JSONObject, Object>() { // from class: X.3dY
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(10650);
                }

                @Override // p003X.PK0
                public final /* synthetic */ Object invoke(JSONObject jSONObject, C13052h c13052h) {
                    JSONObject jSONObject2 = jSONObject;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{jSONObject2, c13052h}, this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    String optString = jSONObject2.optString("eventName");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("params");
                    HashMap hashMap = new HashMap();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            keys.remove();
                            hashMap.put(next, optString2);
                        }
                    }
                    new PQG().LIZ(optString, hashMap);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C2521l.LJIIJ, 1);
                    jSONObject3.put("msg", "SUCCESS");
                    return jSONObject3;
                }
            }), TuplesKt.m137to("toast", new C88653KwR()), TuplesKt.m137to("reportAppLog", new PK0<JSONObject, Object>() { // from class: X.3dY
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(10650);
                }

                @Override // p003X.PK0
                public final /* synthetic */ Object invoke(JSONObject jSONObject, C13052h c13052h) {
                    JSONObject jSONObject2 = jSONObject;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{jSONObject2, c13052h}, this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    String optString = jSONObject2.optString("eventName");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("params");
                    HashMap hashMap = new HashMap();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            keys.remove();
                            hashMap.put(next, optString2);
                        }
                    }
                    new PQG().LIZ(optString, hashMap);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C2521l.LJIIJ, 1);
                    jSONObject3.put("msg", "SUCCESS");
                    return jSONObject3;
                }
            }));
        }
        for (Map.Entry entry : mapOf.entrySet()) {
            registerMethod((String) entry.getKey(), (PK0) entry.getValue());
        }
        IHybridComponent iHybridComponent2 = this.f25612LJ;
        if (iHybridComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, iHybridComponent2}, null, C99758PQq.LIZ, true, 2);
        if (proxy2.isSupported) {
            mapOf2 = (Map) proxy2.result;
        } else {
            C106862S5w.LIZ(this, iHybridComponent2);
            mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m137to("getContainerID", new C99745PQd(iHybridComponent2)), TuplesKt.m137to("canIUse", new PQD(this)), TuplesKt.m137to("fetch", C88674Kwm.LIZIZ), TuplesKt.m137to("appInfo", C89752LXu.LIZIZ), TuplesKt.m137to("connectSocket", new C99748PQg(iHybridComponent2)), TuplesKt.m137to("closeSocket", new C99749PQh(iHybridComponent2)), TuplesKt.m137to("sendSocketData", new C99750PQi(iHybridComponent2)), TuplesKt.m137to("open", new PQP(iHybridComponent2)), TuplesKt.m137to("request", C88714KxQ.LIZIZ), TuplesKt.m137to("vibrate", C441453dD.LIZIZ), TuplesKt.m137to("getAppInfo", C89750LXs.LIZIZ), TuplesKt.m137to("setStorageItem", C89505LOh.LIZIZ), TuplesKt.m137to("getStorageItem", L1B.LIZIZ), TuplesKt.m137to("removeStorageItem", C89502LOe.LIZIZ), TuplesKt.m137to("showToast", C88647KwL.LIZIZ), TuplesKt.m137to("downloadFile", new C99148P3e(iHybridComponent2)), TuplesKt.m137to("saveDataURL", new C99747PQf(iHybridComponent2)), TuplesKt.m137to("close", new PQY(this)));
        }
        for (Map.Entry entry2 : mapOf2.entrySet()) {
            registerMethod((String) entry2.getKey(), (AbstractC13049f.AbstractC13051b) entry2.getValue());
        }
        IHybridComponent iHybridComponent3 = this.f25612LJ;
        if (iHybridComponent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{this, iHybridComponent3}, null, C99758PQq.LIZ, true, 3);
        if (proxy3.isSupported) {
            mapOf3 = (Map) proxy3.result;
        } else {
            C106862S5w.LIZ(this, iHybridComponent3);
            final WeakReference weakReference = new WeakReference(getActivity());
            mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("openLive", new IJavaMethod(weakReference) { // from class: X.6e1
                public static ChangeQuickRedirect LIZ;
                public WeakReference<Context> LIZIZ;

                static {
                    Covode.recordClassIndex(10634);
                }

                {
                    this.LIZIZ = weakReference;
                }

                @Override // com.bytedance.ies.web.jsbridge.IJavaMethod
                public final void call(C13031g c13031g, JSONObject jSONObject) {
                    if (PatchProxy.proxy(new Object[]{c13031g, jSONObject}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    jSONObject.put(C2521l.LJIIJ, 0);
                    String optString = c13031g.f29840LJ.optString("type");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(C2521l.LJIIJ, 0);
                        return;
                    }
                    JSONObject jSONObject2 = null;
                    if (c13031g.f29840LJ.has("args")) {
                        jSONObject2 = c13031g.f29840LJ.getJSONObject("args");
                    }
                    if ("scheme".equals(optString) && !PatchProxy.proxy(new Object[]{jSONObject2, jSONObject}, this, LIZ, false, 2).isSupported) {
                        if (jSONObject2 == null) {
                            jSONObject.put(C2521l.LJIIJ, 0);
                            return;
                        }
                        String string = jSONObject2.getString(PushConstants.WEB_URL);
                        Context context = this.LIZIZ.get();
                        if (context != null) {
                            M3D.LIZIZ.LIZ(context, Uri.parse(string));
                        }
                    }
                }
            }));
        }
        for (Map.Entry entry3 : mapOf3.entrySet()) {
            registerMethod((String) entry3.getKey(), (IJavaMethod) entry3.getValue());
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C13042ai c13042ai = this.LIZJ;
        if (c13042ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13040ah.LIZ(c13042ai);
        LJFF();
        for (BaseJSBridgeMethodFactory baseJSBridgeMethodFactory : PQR.LIZ()) {
            if (this.LJIIIZ == RegisterPolicy.SPECIFIED) {
                Map<String, IJavaMethod> provideLegacySpecifiedMethods = baseJSBridgeMethodFactory.provideLegacySpecifiedMethods(this);
                if (provideLegacySpecifiedMethods.isEmpty()) {
                    for (Map.Entry<String, IJavaMethod> entry : baseJSBridgeMethodFactory.provideLegacyMethods(this).entrySet()) {
                        registerMethod(entry.getKey(), entry.getValue());
                    }
                } else {
                    for (Map.Entry<String, IJavaMethod> entry2 : provideLegacySpecifiedMethods.entrySet()) {
                        registerMethod(entry2.getKey(), entry2.getValue());
                    }
                }
                Map<String, AbstractC13049f.AbstractC13051b> provideStatefulSpecifiedMethods = baseJSBridgeMethodFactory.provideStatefulSpecifiedMethods(this);
                if (provideStatefulSpecifiedMethods.isEmpty()) {
                    for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry3 : baseJSBridgeMethodFactory.provideStatefulMethods(this).entrySet()) {
                        registerMethod(entry3.getKey(), entry3.getValue());
                    }
                } else {
                    for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry4 : provideStatefulSpecifiedMethods.entrySet()) {
                        registerMethod(entry4.getKey(), entry4.getValue());
                    }
                }
                Map<String, PK0<?, ?>> provideStatelessSpecifiedMethods = baseJSBridgeMethodFactory.provideStatelessSpecifiedMethods(this);
                if (provideStatelessSpecifiedMethods.isEmpty()) {
                    for (Map.Entry<String, PK0<?, ?>> entry5 : baseJSBridgeMethodFactory.provideStatelessMethods(this).entrySet()) {
                        registerMethod(entry5.getKey(), entry5.getValue());
                    }
                } else {
                    for (Map.Entry<String, PK0<?, ?>> entry6 : provideStatelessSpecifiedMethods.entrySet()) {
                        registerMethod(entry6.getKey(), entry6.getValue());
                    }
                }
            } else {
                for (Map.Entry<String, IJavaMethod> entry7 : baseJSBridgeMethodFactory.provideLegacyMethods(this).entrySet()) {
                    registerMethod(entry7.getKey(), entry7.getValue());
                }
                for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry8 : baseJSBridgeMethodFactory.provideStatefulMethods(this).entrySet()) {
                    registerMethod(entry8.getKey(), entry8.getValue());
                }
                for (Map.Entry<String, PK0<?, ?>> entry9 : baseJSBridgeMethodFactory.provideStatelessMethods(this).entrySet()) {
                    registerMethod(entry9.getKey(), entry9.getValue());
                }
            }
        }
        PTW ptw = PTW.LIZIZ;
        C13040ah c13040ah2 = this.LIZIZ;
        if (c13040ah2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        for (Map.Entry<String, PK0<?, ?>> entry10 : ptw.LIZIZ(c13040ah2, this.LJIIIZ).entrySet()) {
            registerMethod(entry10.getKey(), entry10.getValue());
        }
        PTW ptw2 = PTW.LIZIZ;
        C13040ah c13040ah3 = this.LIZIZ;
        if (c13040ah3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry11 : ptw2.LIZ(c13040ah3, this.LJIIIZ).entrySet()) {
            registerMethod(entry11.getKey(), entry11.getValue());
        }
        PTW ptw3 = PTW.LIZIZ;
        C13040ah c13040ah4 = this.LIZIZ;
        if (c13040ah4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        for (Map.Entry<String, IJavaMethod> entry12 : ptw3.LIZJ(c13040ah4, this.LJIIIZ).entrySet()) {
            registerMethod(entry12.getKey(), entry12.getValue());
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final void unregisterFromFactory(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory) {
        if (PatchProxy.proxy(new Object[]{baseJSBridgeMethodFactory}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseJSBridgeMethodFactory);
        for (String str : SetsKt___SetsKt.plus(SetsKt___SetsKt.plus((Set) baseJSBridgeMethodFactory.provideStatefulMethods(this).keySet(), (Iterable) baseJSBridgeMethodFactory.provideStatelessMethods(this).keySet()), (Iterable) baseJSBridgeMethodFactory.provideLegacyMethods(this).keySet())) {
            C13040ah c13040ah = this.LIZIZ;
            if (c13040ah == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c13040ah.LIZ(str);
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final void registerMethodFromFactory(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory) {
        if (PatchProxy.proxy(new Object[]{baseJSBridgeMethodFactory}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseJSBridgeMethodFactory);
        Iterator<T> it = baseJSBridgeMethodFactory.provideLegacyMethods(this).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            registerMethod((String) entry.getKey(), (IJavaMethod) entry.getValue());
        }
        Iterator<T> it2 = baseJSBridgeMethodFactory.provideStatelessMethods(this).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            registerMethod((String) entry2.getKey(), (PK0) entry2.getValue());
        }
        Iterator<T> it3 = baseJSBridgeMethodFactory.provideStatefulMethods(this).entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            registerMethod((String) entry3.getKey(), (AbstractC13049f.AbstractC13051b) entry3.getValue());
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final <P, R> void registerMethod(String str, PK0<P, R> pk0) {
        if (PatchProxy.proxy(new Object[]{str, pk0}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pk0);
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13040ah.LIZ(str, (PK0<?, ?>) pk0);
        this.LIZLLL.add(str);
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final <T> void sendJSEvent(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!c13040ah.LJII) {
            C13040ah c13040ah2 = this.LIZIZ;
            if (c13040ah2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c13040ah2.LIZ(str, (String) t);
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final void registerMethod(String str, IJavaMethod iJavaMethod) {
        if (PatchProxy.proxy(new Object[]{str, iJavaMethod}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, iJavaMethod);
        C13042ai c13042ai = this.LIZJ;
        if (c13042ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13042ai.LIZ(str, iJavaMethod);
        this.LIZLLL.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.annie.api.bridge.IJSBridgeManager
    public final void registerMethod(String str, AbstractC13049f.AbstractC13051b abstractC13051b) {
        AbstractC13049f.AbstractC13051b abstractC13051b2;
        if (PatchProxy.proxy(new Object[]{str, abstractC13051b}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC13051b);
        if (!(abstractC13051b instanceof AbstractC2583h)) {
            abstractC13051b2 = null;
        } else {
            abstractC13051b2 = abstractC13051b;
        }
        if (abstractC13051b2 != null) {
            this.LJIIIIZZ.add(abstractC13051b2);
        }
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c13040ah.LIZ(str, abstractC13051b);
        this.LIZLLL.add(str);
    }

    public final void LIZ(IHybridComponent iHybridComponent, Context context, AbstractC13046b abstractC13046b, List<? extends AbstractC13058u> list, String str) {
        if (PatchProxy.proxy(new Object[]{iHybridComponent, context, abstractC13046b, list, str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(iHybridComponent, context, list);
        this.f25612LJ = iHybridComponent;
        this.LJFF = context;
        C13055n LIZ2 = C13040ah.LIZ(new PM1(abstractC13046b));
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ(context, LIZ2, abstractC13046b, list, str);
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C13042ai LIZ3 = C13042ai.LIZ((WebView) null, c13040ah);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        this.LIZJ = LIZ3;
        LIZ();
        LIZIZ();
        PQR.LIZJ.LIZ(this);
    }

    public final C13040ah LIZ(Context context, C13055n c13055n, AbstractC13046b abstractC13046b, List<? extends AbstractC13058u> list, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, c13055n, abstractC13046b, list, str}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C13040ah) proxy.result;
        }
        PQT.LIZIZ.LIZJ();
        if (LIZLLL()) {
            PQU.LIZIZ.LIZ(c13055n, new JSBridgeManager$createRealJSBridge$1(this, str));
        }
        c13055n.LIZIZ(C99783PRp.LJIIJ.LIZ().LIZJ);
        c13055n.LIZ(context);
        c13055n.LIZ(abstractC13046b);
        c13055n.LIZIZ(C99783PRp.LJIIJ.LIZ().LJIIJ);
        c13055n.LIZ(C99783PRp.LJIIJ.LIZ().LJIIJJI);
        c13055n.LIZJ(C99783PRp.LJIIJ.LIZ().LJIIL);
        if (PLT.LIZIZ.LIZ()) {
            c13055n.LIZ();
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIJI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ2 = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (LIZ2.booleanValue()) {
            C90746Lp6<Boolean> c90746Lp62 = AbstractC90724Lok.LJIIIZ;
            Intrinsics.checkNotNullExpressionValue(c90746Lp62, "");
            Boolean LIZ3 = c90746Lp62.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            c13055n.LIZ(LIZ3.booleanValue());
        }
        c13055n.LIZ(PLW.LIZIZ.LIZ());
        c13055n.LIZ(new C99820PTa());
        for (AbstractC13058u abstractC13058u : list) {
            c13055n.LIZIZ(abstractC13058u);
        }
        C13040ah LIZIZ = c13055n.LIZIZ();
        if (m15988LJ()) {
            PL8 pl8 = PL8.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
            pl8.LIZ(LIZIZ, new JSBridgeManager$createRealJSBridge$$inlined$apply$lambda$1(this, str));
        }
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        return LIZIZ;
    }
}
