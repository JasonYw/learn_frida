package com.bytedance.android.live.lynx.bridge;

import android.content.Context;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.browser.p300a.c$a;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99564PJe;
import p003X.C99565PJf;
import p003X.C99567PJh;
import p003X.T5C;
import p003X.TRC;

/* loaded from: classes7.dex */
public final class LiveLynxBridgeModule extends LynxModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final C99564PJe bridgeImpl;
    public final ConcurrentHashMap<C13039ag, Callback> callRegistry = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(32160);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxBridgeModule(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        this.bridgeImpl = (C99564PJe) (!(obj instanceof C99564PJe) ? null : obj);
        C99564PJe c99564PJe = this.bridgeImpl;
        if (c99564PJe != null && !PatchProxy.proxy(new Object[]{this}, c99564PJe, C99564PJe.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            c99564PJe.LIZIZ = this;
        }
    }

    public final void invokeCallback$livehybrid_impl_cnDouyinRelease(JSONObject jSONObject, C13039ag c13039ag) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{jSONObject, c13039ag}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c13039ag);
        try {
            Object remove = jSONObject.remove(C2521l.LJIIJJI);
            if (remove != null && (remove instanceof JSONObject)) {
                ((JSONObject) remove).remove("__data");
                ((JSONObject) remove).remove(C2521l.LJIIIIZZ);
                String optString = ((JSONObject) remove).optString(C2521l.LJIIIZ, "0");
                Intrinsics.checkNotNullExpressionValue(optString, "");
                jSONObject.put("eventId", Long.parseLong(optString));
                if (!((JSONObject) remove).has("___error___")) {
                    jSONObject.put(C2521l.LJIIJ, ((JSONObject) remove).remove(C2521l.LJIIJ));
                } else {
                    jSONObject.put(C2521l.LJIIJ, 0);
                    jSONObject.put("errMsg", ((JSONObject) remove).remove("___error___"));
                }
                jSONObject.put(C2521l.LJIIL, remove);
            }
            WritableMap LIZ = T5C.LIZ(jSONObject);
            Callback remove2 = this.callRegistry.remove(c13039ag);
            if (remove2 != null) {
                remove2.invoke(LIZ);
            }
            if (!PatchProxy.proxy(new Object[]{LIZ, c13039ag}, null, C99565PJf.LIZ, true, 6).isSupported) {
                C106862S5w.LIZ(LIZ, c13039ag);
                if (C99565PJf.LJIIIIZZ.LIZ()) {
                    Iterator<T> it = C99565PJf.LIZLLL.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((c$a) obj).LIZIZ, c13039ag)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    c$a c_a = (c$a) obj;
                    if (c_a != null) {
                        C99565PJf.LIZLLL.remove(c_a);
                        C99565PJf.LIZLLL.add(new c$a(c13039ag, LIZ.toString()));
                    }
                    ALogger.m15797i("DebugHybridTools", "lynx-> jsbInfo=" + c13039ag + "，callackinfo " + LIZ);
                }
            }
            Result.m30308constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.m30308constructorimpl(ResultKt.createFailure(th));
        }
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        C13039ag c13039ag;
        String str2;
        Object obj;
        if (PatchProxy.proxy(new Object[]{str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported || TRC.LIZLLL.LIZ(this.mContext, new String[]{"com/bytedance/android/live/lynx/bridge/LiveLynxBridgeModule", C2521l.LJIILJJIL, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V"}, str, readableMap, callback)) {
            return;
        }
        C106862S5w.LIZ(str, readableMap, callback);
        try {
            JSONObject LIZ = T5C.LIZ(readableMap);
            C99564PJe c99564PJe = this.bridgeImpl;
            if (c99564PJe != null) {
                JSONObject optJSONObject = LIZ.optJSONObject(C2521l.LJIIL);
                if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                    str2 = "{}";
                }
                String optString = LIZ.optString("namespace", "webcast");
                Intrinsics.checkNotNullExpressionValue(optString, "");
                String optString2 = LIZ.optString("eventId", "0");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                C99567PJh LIZ2 = C13039ag.LIZ();
                LIZ2.LIZJ(str);
                LIZ2.LIZLLL(str2);
                LIZ2.m23002LJ(optString2);
                LIZ2.LJFF(optString);
                c13039ag = LIZ2.LIZ();
                Intrinsics.checkNotNullExpressionValue(c13039ag, "");
                this.callRegistry.put(c13039ag, callback);
                if (!PatchProxy.proxy(new Object[]{c13039ag}, null, C99565PJf.LIZ, true, 5).isSupported) {
                    C106862S5w.LIZ(c13039ag);
                    if (C99565PJf.LJIIIIZZ.LIZ()) {
                        Iterator<T> it = C99565PJf.LIZLLL.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (Intrinsics.areEqual(((c$a) obj).LIZIZ, c13039ag)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (((c$a) obj) == null) {
                            C99565PJf.LIZLLL.add(new c$a(c13039ag, null, 2));
                        }
                        ALogger.m15797i("DebugHybridTools", "lynx-> jsbInfo=" + c13039ag);
                    }
                }
                c99564PJe.LIZ(c13039ag);
            } else {
                c13039ag = null;
            }
            Result.m30308constructorimpl(c13039ag);
        } catch (Throwable th) {
            Result.m30308constructorimpl(ResultKt.createFailure(th));
        }
        TRC.LIZLLL.LIZ((Object) null);
    }
}
