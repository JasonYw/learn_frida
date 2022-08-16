package com.bytedance.android.latch.internal.jsb.module;

import android.content.Context;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.latch.internal.C2763c;
import com.bytedance.android.latch.internal.LatchStateHolder$handleStructResult$1;
import com.bytedance.android.latch.internal.LatchStateHolder$handleStructResult$2;
import com.bytedance.android.latch.internal.util.LatchException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.vmsdk.jsbridge.JSMethod;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC109433T6t;
import p003X.C106862S5w;
import p003X.C109426T6m;
import p003X.C109432T6s;
import p003X.C109434T6u;
import p003X.FCU;
import p003X.PR2;
import p003X.PR3;
import p003X.PUJ;

/* loaded from: classes10.dex */
public final class LatchInternalModule extends JSModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final PR3 dataHolder;
    public final AbstractC109433T6t logger;
    public final PUJ monitor;
    public final C2763c stateHolder;

    static {
        Covode.recordClassIndex(13744);
    }

    @JSMethod
    public final int getSDKVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return PR2.LIZ();
    }

    @JSMethod
    public final WritableMap getGlobalProps() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (WritableMap) proxy.result;
        }
        JavaOnlyMap from = JavaOnlyMap.from(C109426T6m.LIZ((Map) this.dataHolder.LIZ()));
        Intrinsics.checkExpressionValueIsNotNull(from, "");
        return from;
    }

    @JSMethod
    public final void initJsFinished() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        PUJ puj = this.monitor;
        if (!PatchProxy.proxy(new Object[0], puj, PUJ.LIZ, false, 2).isSupported) {
            puj.LIZ(2);
        }
    }

    @JSMethod
    public final void readyToRunScript() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        PUJ puj = this.monitor;
        if (!PatchProxy.proxy(new Object[0], puj, PUJ.LIZ, false, 1).isSupported) {
            puj.LIZ(1);
        }
    }

    @JSMethod
    public final WritableMap getFromInitialProps(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (WritableMap) proxy.result;
        }
        C106862S5w.LIZ(str);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Object LIZ = this.dataHolder.LIZ(str);
        if (LIZ instanceof Map) {
            LIZ = C109426T6m.LIZ((Map) LIZ);
        } else if (LIZ instanceof List) {
            LIZ = C109426T6m.LIZ((List) LIZ);
        }
        javaOnlyMap.put(str, LIZ);
        return javaOnlyMap;
    }

    @JSMethod
    public final void returnValue(ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        C2763c c2763c = this.stateHolder;
        JSONObject LIZ = C109426T6m.LIZ(readableMap);
        if (!PatchProxy.proxy(new Object[]{LIZ}, c2763c, C2763c.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(LIZ);
            if (LIZ.has(C2521l.LJIIL)) {
                Object obj = LIZ.get(C2521l.LJIIL);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (c2763c.LIZ(jSONObject)) {
                        c2763c.LIZ(obj);
                    } else if (!PatchProxy.proxy(new Object[]{jSONObject}, c2763c, C2763c.LIZ, false, 7).isSupported) {
                        LatchStateHolder$handleStructResult$1.INSTANCE.LIZ(jSONObject, FCU.LIZ(), new LatchStateHolder$handleStructResult$2(c2763c));
                    }
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(obj, "");
                    c2763c.LIZ(obj);
                }
            }
            c2763c.LIZJ.onNext(LIZ);
            c2763c.LJFF.mo30099invoke();
            if (c2763c.LIZLLL.get() == 0) {
                c2763c.LJI.mo30099invoke();
            }
        }
        PUJ puj = this.monitor;
        if (!PatchProxy.proxy(new Object[0], puj, PUJ.LIZ, false, 3).isSupported) {
            puj.LIZ(3);
        }
        AbstractC109433T6t abstractC109433T6t = this.logger;
        String hashMap = readableMap.toHashMap().toString();
        Intrinsics.checkExpressionValueIsNotNull(hashMap, "");
        C109434T6u.LIZ(abstractC109433T6t, hashMap, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchInternalModule(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        C109432T6s c109432T6s = (C109432T6s) obj;
        this.logger = c109432T6s.LIZ;
        this.stateHolder = c109432T6s.LIZIZ;
        this.dataHolder = c109432T6s.LIZJ;
        this.monitor = c109432T6s.LIZLLL;
    }

    @JSMethod
    public final void log(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C109434T6u.LIZIZ(this.logger, str, null, 2, null);
                    return;
                }
                AbstractC109433T6t abstractC109433T6t = this.logger;
                if (!PatchProxy.proxy(new Object[]{abstractC109433T6t, str, null, 2, null}, null, C109434T6u.LIZ, true, 3).isSupported) {
                    abstractC109433T6t.LIZJ(str, null);
                    return;
                }
                return;
            }
            C109434T6u.LIZ(this.logger, str, null, 2, null);
            return;
        }
        AbstractC109433T6t abstractC109433T6t2 = this.logger;
        if (!PatchProxy.proxy(new Object[]{abstractC109433T6t2, str, null, 2, null}, null, C109434T6u.LIZ, true, 1).isSupported) {
            abstractC109433T6t2.LIZ(str, null);
        }
    }

    @JSMethod
    public final void onError(int i, String str, ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, readableMap}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, readableMap);
        String str2 = "Occasion: " + i + ", message: " + str + ", extra: " + readableMap.toHashMap();
        C2763c c2763c = this.stateHolder;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str2}, c2763c, C2763c.LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(str2);
            c2763c.LJII.invoke(new LatchException(-i, str2, null, 4));
        }
        C109434T6u.LIZIZ(this.logger, str2, null, 2, null);
        PUJ puj = this.monitor;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        Intrinsics.checkExpressionValueIsNotNull(hashMap, "");
        puj.LIZ(i, str, hashMap);
    }
}
