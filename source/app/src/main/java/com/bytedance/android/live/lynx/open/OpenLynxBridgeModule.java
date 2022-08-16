package com.bytedance.android.live.lynx.open;

import android.content.Context;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99566PJg;
import p003X.C99567PJh;
import p003X.T5C;
import p003X.TRC;

/* loaded from: classes7.dex */
public final class OpenLynxBridgeModule extends LynxModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final C99566PJg bridgeImpl;
    public final ConcurrentHashMap<C13039ag, Callback> callRegistry = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(32268);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLynxBridgeModule(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        this.bridgeImpl = (C99566PJg) (!(obj instanceof C99566PJg) ? null : obj);
        C99566PJg c99566PJg = this.bridgeImpl;
        if (c99566PJg != null && !PatchProxy.proxy(new Object[]{this}, c99566PJg, C99566PJg.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            c99566PJg.LIZIZ = this;
        }
    }

    public final void invokeCallback$livehybrid_impl_cnDouyinRelease(JSONObject jSONObject, C13039ag c13039ag) {
        Unit unit;
        if (PatchProxy.proxy(new Object[]{jSONObject, c13039ag}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c13039ag);
        try {
            Callback remove = this.callRegistry.remove(c13039ag);
            if (remove != null) {
                Object[] objArr = new Object[1];
                Object remove2 = jSONObject.remove(C2521l.LJIIJJI);
                if (remove2 != null && (remove2 instanceof JSONObject)) {
                    ((JSONObject) remove2).remove("__data");
                    ((JSONObject) remove2).remove(C2521l.LJIIIIZZ);
                    ((JSONObject) remove2).remove(C2521l.LJIIIZ);
                    jSONObject.put(C2521l.LJIIJ, ((JSONObject) remove2).remove(C2521l.LJIIJ));
                    jSONObject.put(C2521l.LJIIL, remove2);
                }
                objArr[0] = T5C.LIZ(jSONObject);
                remove.invoke(objArr);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m30308constructorimpl(unit);
        } catch (Throwable th) {
            Result.m30308constructorimpl(ResultKt.createFailure(th));
        }
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        JSONObject LIZ;
        C99566PJg c99566PJg;
        C13039ag c13039ag;
        String str2;
        if (PatchProxy.proxy(new Object[]{str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported || TRC.LIZLLL.LIZ(this.mContext, new String[]{"com/bytedance/android/live/lynx/open/OpenLynxBridgeModule", C2521l.LJIILJJIL, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V"}, str, readableMap, callback)) {
            return;
        }
        C106862S5w.LIZ(str, readableMap, callback);
        try {
            LIZ = T5C.LIZ(readableMap);
            c99566PJg = this.bridgeImpl;
        } catch (Throwable th) {
            Result.m30308constructorimpl(ResultKt.createFailure(th));
        }
        if (c99566PJg != null) {
            JSONObject optJSONObject = LIZ.optJSONObject(C2521l.LJIIL);
            if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                str2 = "{}";
            }
            String optString = LIZ.optString("namespace", "webcast");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            String optString2 = LIZ.optString("eventId", "lynx");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, optString, optString2}, c99566PJg, C99566PJg.LIZ, false, 11);
            if (proxy.isSupported) {
                c13039ag = (C13039ag) proxy.result;
            } else {
                C106862S5w.LIZ(str, str2, optString, optString2);
                C99567PJh LIZ2 = C13039ag.LIZ();
                LIZ2.LIZJ(str);
                LIZ2.LIZLLL(str2);
                LIZ2.m23002LJ(optString2);
                LIZ2.LJFF(optString);
                c13039ag = LIZ2.LIZ();
                c99566PJg.LIZ(c13039ag);
            }
            if (c13039ag != null) {
                this.callRegistry.put(c13039ag, callback);
                Result.m30308constructorimpl(c13039ag);
                TRC.LIZLLL.LIZ((Object) null);
            }
        }
        c13039ag = null;
        Result.m30308constructorimpl(c13039ag);
        TRC.LIZLLL.LIZ((Object) null);
    }
}
