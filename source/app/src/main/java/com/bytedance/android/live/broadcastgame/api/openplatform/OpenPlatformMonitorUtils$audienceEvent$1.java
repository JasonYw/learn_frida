package com.bytedance.android.live.broadcastgame.api.openplatform;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C442083eE;
import p003X.C87717KhL;
import p003X.C87759Ki1;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorUtils$audienceEvent$1 extends Lambda implements Function1<C3401f, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87759Ki1 $appInfo;
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ String $errorMsg;
    public final /* synthetic */ C87717KhL $launchParam;
    public final /* synthetic */ int $status;

    static {
        Covode.recordClassIndex(19225);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorUtils$audienceEvent$1(C87759Ki1 c87759Ki1, C87717KhL c87717KhL, int i, Integer num, String str) {
        super(1);
        this.$appInfo = c87759Ki1;
        this.$launchParam = c87717KhL;
        this.$status = i;
        this.$errorCode = num;
        this.$errorMsg = str;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$audienceEvent$1$2 */
    /* loaded from: classes5.dex */
    public static final class C33932 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19227);
        }

        public C33932() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                if (OpenPlatformMonitorUtils$audienceEvent$1.this.$status == 1) {
                    jSONObject2.put("error_code", OpenPlatformMonitorUtils$audienceEvent$1.this.$errorCode);
                    jSONObject2.put("error_msg", OpenPlatformMonitorUtils$audienceEvent$1.this.$errorMsg);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3401f c3401f) {
        C3401f c3401f2 = c3401f;
        if (!PatchProxy.proxy(new Object[]{c3401f2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3401f2);
            c3401f2.LIZIZ(new C33921());
            c3401f2.LIZJ(new C33932());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$audienceEvent$1$1 */
    /* loaded from: classes5.dex */
    public static final class C33921 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19226);
        }

        public C33921() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            String LIZIZ;
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                C87759Ki1 c87759Ki1 = OpenPlatformMonitorUtils$audienceEvent$1.this.$appInfo;
                if (!PatchProxy.proxy(new Object[]{jSONObject2}, c87759Ki1, C87759Ki1.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(jSONObject2);
                    jSONObject2.put(Constants.APP_ID, c87759Ki1.LIZIZ);
                    jSONObject2.put("app_name", c87759Ki1.LIZJ);
                    String str = c87759Ki1.LIZLLL;
                    if (str != null) {
                        PluginType LIZ = PluginType.Companion.LIZ(str);
                        if (LIZ == null || (LIZIZ = PluginType.Companion.LIZIZ(LIZ)) == null) {
                            LIZIZ = PluginType.Companion.LIZIZ(PluginType.UNKNOWN_TYPE);
                        }
                        jSONObject2.put("app_type", LIZIZ);
                        jSONObject2.put("schema", str);
                        jSONObject2.put("schema_type", C442083eE.LIZ(str));
                    }
                }
                OpenPlatformMonitorUtils$audienceEvent$1.this.$launchParam.LIZ(jSONObject2);
            }
            return Unit.INSTANCE;
        }
    }
}
