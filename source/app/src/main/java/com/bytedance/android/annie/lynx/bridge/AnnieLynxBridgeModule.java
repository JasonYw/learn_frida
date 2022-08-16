package com.bytedance.android.annie.lynx.bridge;

import android.content.Context;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.annie.lynx.C2607c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99567PJh;
import p003X.C99629PLr;
import p003X.T5D;
import p003X.TRC;

/* loaded from: classes7.dex */
public final class AnnieLynxBridgeModule extends LynxModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final C99629PLr bridgeImpl;
    public final ConcurrentHashMap<C13039ag, Callback> callRegistry = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(10820);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieLynxBridgeModule(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        this.bridgeImpl = (C99629PLr) (!(obj instanceof C99629PLr) ? null : obj);
        C99629PLr c99629PLr = this.bridgeImpl;
        if (c99629PLr != null && !PatchProxy.proxy(new Object[]{this}, c99629PLr, C99629PLr.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(this);
            c99629PLr.LIZIZ = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
        if (r0 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invokeCallback$annie_lynx_release(org.json.JSONObject r14, com.bytedance.ies.web.jsbridge2.C13039ag r15) {
        /*
            r13 = this;
            java.lang.String r10 = "code"
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r7 = 0
            r1[r7] = r14
            r6 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1[r6] = r15
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.annie.lynx.bridge.AnnieLynxBridgeModule.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r13, r0, r7, r2)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1a
            return
        L1a:
            p003X.C106862S5w.LIZ(r14, r15)
            r9 = r13
            java.lang.String r0 = "__params"
            java.lang.Object r8 = r14.remove(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = ""
            if (r8 == 0) goto L29
            goto L2c
        L29:
            r4 = r5
            r12 = 0
            goto L6f
        L2c:
            boolean r0 = r8 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L29
            X.KwU r1 = p003X.C88656KwU.LIZIZ     // Catch: java.lang.Throwable -> Lb8
            r0 = r8
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lb8
            boolean r12 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lb8
            r0 = r8
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r4 = r0.remove(r10)     // Catch: java.lang.Throwable -> Lb8
            r1 = r8
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "__data"
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lb8
            r1 = r8
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "__msg_type"
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "eventId"
            r11 = r8
            org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "__callback_id"
            java.lang.String r0 = "0"
            java.lang.String r0 = r11.optString(r1, r0)     // Catch: java.lang.Throwable -> Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Throwable -> Lb8
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lb8
            r14.put(r2, r0)     // Catch: java.lang.Throwable -> Lb8
            r14.put(r10, r4)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "data"
            r14.put(r0, r8)     // Catch: java.lang.Throwable -> Lb8
        L6f:
            java.util.concurrent.ConcurrentHashMap<com.bytedance.ies.web.jsbridge2.ag, com.lynx.react.bridge.Callback> r0 = r9.callRegistry     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r8 = r0.remove(r15)     // Catch: java.lang.Throwable -> Lb8
            com.lynx.react.bridge.Callback r8 = (com.lynx.react.bridge.Callback) r8     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L9d
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb8
            if (r12 == 0) goto L94
            X.PLu r0 = p003X.C99632PLu.LIZLLL     // Catch: java.lang.Throwable -> Lb8
            X.PPm r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Lb8
            X.PLs r1 = r0.LJFF     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto L94
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L98
        L94:
            com.lynx.react.bridge.WritableMap r0 = p003X.T5D.LIZ(r14)     // Catch: java.lang.Throwable -> Lb8
        L98:
            r2[r7] = r0     // Catch: java.lang.Throwable -> Lb8
            r8.invoke(r2)     // Catch: java.lang.Throwable -> Lb8
        L9d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r0 = r0 ^ r6
            if (r0 == 0) goto Lb2
            X.PPl r2 = p003X.C99727PPl.LIZIZ     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "LynxBridgeImpl"
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Throwable -> Lb8
            r2.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb8
            kotlin.Result.m30308constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r0 = move-exception
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m30308constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.lynx.bridge.AnnieLynxBridgeModule.invokeCallback$annie_lynx_release(org.json.JSONObject, com.bytedance.ies.web.jsbridge2.ag):void");
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        C13039ag c13039ag;
        String str2;
        if (PatchProxy.proxy(new Object[]{str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported || TRC.LIZLLL.LIZ(this.mContext, new String[]{"com/bytedance/android/annie/lynx/bridge/AnnieLynxBridgeModule", C2521l.LJIILJJIL, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V"}, str, readableMap, callback)) {
            return;
        }
        C106862S5w.LIZ(str, readableMap, callback);
        try {
            JSONObject LIZ = T5D.LIZ(readableMap);
            C99629PLr c99629PLr = this.bridgeImpl;
            if (c99629PLr != null) {
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
                for (C2607c c2607c : c99629PLr.LIZLLL) {
                    c2607c.LIZ(c13039ag);
                }
                c99629PLr.LIZ(c13039ag);
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
