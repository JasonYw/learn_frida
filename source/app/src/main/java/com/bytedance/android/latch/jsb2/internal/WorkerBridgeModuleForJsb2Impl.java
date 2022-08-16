package com.bytedance.android.latch.jsb2.internal;

import android.content.Context;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.latch.internal.C2763c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import com.bytedance.vmsdk.jsbridge.JSMethod;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C109426T6m;
import p003X.C73879FBh;
import p003X.C99567PJh;
import p003X.PU2;
import p003X.PUF;
import p003X.PUG;

/* loaded from: classes7.dex */
public final class WorkerBridgeModuleForJsb2Impl extends JSModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final ConcurrentHashMap<C13039ag, Callback> callbackRegistry = new ConcurrentHashMap<>();
    public boolean jsFunctionReturned;
    public final PU2 jsb2BridgeForWorker;
    public final C2763c stateHolder;

    static {
        Covode.recordClassIndex(13768);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerBridgeModuleForJsb2Impl(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        PUF puf = (PUF) obj;
        PU2 pu2 = puf.LIZ;
        if (!PatchProxy.proxy(new Object[]{this}, pu2, PU2.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            pu2.LIZJ = this;
        }
        this.jsb2BridgeForWorker = pu2;
        C2763c c2763c = puf.LIZIZ;
        WorkerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1 workerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1 = new WorkerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1(this);
        if (!PatchProxy.proxy(new Object[]{workerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1}, c2763c, C2763c.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(workerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1);
            C73879FBh.LIZ(c2763c.LIZJ.subscribe(new PUG(workerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1)), c2763c.LIZIZ);
        }
        this.stateHolder = c2763c;
    }

    public final void invokeCallback$lib_jsb2_release(JSONObject jSONObject, C13039ag c13039ag) {
        Object createFailure;
        if (PatchProxy.proxy(new Object[]{jSONObject, c13039ag}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c13039ag);
        Callback remove = this.callbackRegistry.remove(c13039ag);
        if (this.jsFunctionReturned) {
            return;
        }
        try {
            Object remove2 = jSONObject.remove(C2521l.LJIIJJI);
            if (remove2 != null && (remove2 instanceof JSONObject)) {
                ((JSONObject) remove2).remove("__data");
                ((JSONObject) remove2).remove(C2521l.LJIIIIZZ);
                String optString = ((JSONObject) remove2).optString(C2521l.LJIIIZ, "0");
                Intrinsics.checkExpressionValueIsNotNull(optString, "");
                jSONObject.put("eventId", Long.parseLong(optString));
                jSONObject.put(C2521l.LJIIL, remove2);
                jSONObject.put(C2521l.LJIIJ, ((JSONObject) remove2).optInt(C2521l.LJIIJ));
            }
            createFailure = C109426T6m.LIZ(jSONObject);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        if (createFailure != null && remove != null) {
            remove.invoke(createFailure);
        }
    }

    @JSMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        Object createFailure;
        String str2;
        if (PatchProxy.proxy(new Object[]{str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, readableMap, callback);
        try {
            createFailure = C109426T6m.LIZ(readableMap);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        String str3 = null;
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        JSONObject jSONObject = (JSONObject) createFailure;
        if (jSONObject != null) {
            PU2 pu2 = this.jsb2BridgeForWorker;
            JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL);
            if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                str2 = "{}";
            }
            String optString = jSONObject.optString("namespace");
            Intrinsics.checkExpressionValueIsNotNull(optString, "");
            if (optString.length() > 0) {
                str3 = optString;
            }
            String optString2 = jSONObject.optString(C2521l.LJIIIZ, "0");
            Intrinsics.checkExpressionValueIsNotNull(optString2, "");
            C99567PJh LIZ = C13039ag.LIZ();
            LIZ.LIZJ(str);
            LIZ.LIZLLL(str2);
            LIZ.m23002LJ(optString2);
            LIZ.LJFF(str3);
            C13039ag LIZ2 = LIZ.LIZ();
            Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
            this.callbackRegistry.put(LIZ2, callback);
            pu2.LIZ(LIZ2);
        }
    }
}
