package com.bytedance.android.live.broadcastgame.api.openplatform;

import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87717KhL;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorUtils$anchorEvent$1 extends Lambda implements Function1<C3401f, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ String $errorMsg;
    public final /* synthetic */ C3384q $item;
    public final /* synthetic */ C87717KhL $launchParam;
    public final /* synthetic */ int $status;

    static {
        Covode.recordClassIndex(19222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorUtils$anchorEvent$1(C3384q c3384q, C87717KhL c87717KhL, int i, Integer num, String str) {
        super(1);
        this.$item = c3384q;
        this.$launchParam = c87717KhL;
        this.$status = i;
        this.$errorCode = num;
        this.$errorMsg = str;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1$2 */
    /* loaded from: classes5.dex */
    public static final class C33912 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19224);
        }

        public C33912() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                if (OpenPlatformMonitorUtils$anchorEvent$1.this.$status == 1) {
                    jSONObject2.put("error_code", OpenPlatformMonitorUtils$anchorEvent$1.this.$errorCode);
                    jSONObject2.put("error_msg", OpenPlatformMonitorUtils$anchorEvent$1.this.$errorMsg);
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
            c3401f2.LIZIZ(new C33901());
            c3401f2.LIZJ(new C33912());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1$1 */
    /* loaded from: classes5.dex */
    public static final class C33901 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19223);
        }

        public C33901() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
            if (r1 != null) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ kotlin.Unit invoke(org.json.JSONObject r6) {
            /*
                r5 = this;
                org.json.JSONObject r6 = (org.json.JSONObject) r6
                r4 = 1
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r2 = 0
                r1[r2] = r6
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1.C33901.changeQuickRedirect
                com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r2, r4)
                boolean r0 = r0.isSupported
                if (r0 != 0) goto L92
                p003X.C106862S5w.LIZ(r6)
                com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1 r0 = com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1.this
                com.bytedance.android.live.broadcastgame.api.model.q r3 = r0.$item
                if (r3 == 0) goto L8b
                r0 = 2
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r1[r2] = r3
                r1[r4] = r6
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C442083eE.LIZ
                r2 = 0
                com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r2, r0, r4, r4)
                boolean r0 = r0.isSupported
                if (r0 != 0) goto L8b
                p003X.C106862S5w.LIZ(r3, r6)
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r3.LJFF()
                if (r0 == 0) goto Lab
                java.lang.String r1 = r0.LJLIIIL
            L38:
                java.lang.String r0 = "app_id"
                r6.put(r0, r1)
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r3.LJFF()
                if (r0 == 0) goto La9
                java.lang.String r1 = r0.f26026LJ
            L45:
                java.lang.String r0 = "app_name"
                r6.put(r0, r1)
                int r1 = r3.f26027LJ
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.OpenMicroApp
                int r0 = r0.value
                if (r1 != r0) goto L97
                com.bytedance.android.live.broadcastgame.api.openplatform.PluginType r1 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.MINI_APP
            L54:
                if (r1 == 0) goto L5e
                X.KkM r0 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.Companion
                java.lang.String r1 = r0.LIZIZ(r1)
                if (r1 != 0) goto L66
            L5e:
                X.KkM r1 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.Companion
                com.bytedance.android.live.broadcastgame.api.openplatform.PluginType r0 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.UNKNOWN_TYPE
                java.lang.String r1 = r1.LIZIZ(r0)
            L66:
                java.lang.String r0 = "app_type"
                r6.put(r0, r1)
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r3.LJFF()
                if (r0 == 0) goto L95
                java.lang.String r1 = r0.LJJLJLI
            L73:
                java.lang.String r0 = "schema"
                r6.put(r0, r1)
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r3.LJFF()
                if (r0 == 0) goto L86
                java.lang.String r0 = r0.LJJLJLI
                if (r0 == 0) goto L86
                java.lang.String r2 = p003X.C442083eE.LIZ(r0)
            L86:
                java.lang.String r0 = "schema_type"
                r6.put(r0, r2)
            L8b:
                com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1 r0 = com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1.this
                X.KhL r0 = r0.$launchParam
                r0.LIZ(r6)
            L92:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L95:
                r1 = r2
                goto L73
            L97:
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.OpenGame
                int r0 = r0.value
                if (r1 != r0) goto La0
                com.bytedance.android.live.broadcastgame.api.openplatform.PluginType r1 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.LYNX
                goto L54
            La0:
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.SonicMiniGame
                int r0 = r0.value
                if (r1 != r0) goto L5e
                com.bytedance.android.live.broadcastgame.api.openplatform.PluginType r1 = com.bytedance.android.live.broadcastgame.api.openplatform.PluginType.SONIC_GAME
                goto L54
            La9:
                r1 = r2
                goto L45
            Lab:
                r1 = r2
                goto L38
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$anchorEvent$1.C33901.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
