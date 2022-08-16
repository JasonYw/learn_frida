package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3401f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorService$launchEvent$1 extends Lambda implements Function1<C3401f, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ String $errorMsg;
    public final /* synthetic */ int $status;
    public final /* synthetic */ OpenPlatformMonitorService this$0;

    static {
        Covode.recordClassIndex(21000);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorService$launchEvent$1(OpenPlatformMonitorService openPlatformMonitorService, int i, Integer num, String str) {
        super(1);
        this.this$0 = openPlatformMonitorService;
        this.$status = i;
        this.$errorCode = num;
        this.$errorMsg = str;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService$launchEvent$1$1 */
    /* loaded from: classes5.dex */
    public static final class C37001 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21001);
        }

        public C37001() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject);
                OpenPlatformMonitorService$launchEvent$1.this.this$0.LIZJ.invoke(jSONObject);
                OpenPlatformMonitorService$launchEvent$1.this.this$0.LIZLLL.invoke(jSONObject);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService$launchEvent$1$2 */
    /* loaded from: classes5.dex */
    public static final class C37012 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21002);
        }

        public C37012() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                if (OpenPlatformMonitorService$launchEvent$1.this.this$0.LIZIZ != -1) {
                    jSONObject2.put("duration", System.currentTimeMillis() - OpenPlatformMonitorService$launchEvent$1.this.this$0.LIZIZ);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService$launchEvent$1$3 */
    /* loaded from: classes5.dex */
    public static final class C37023 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21003);
        }

        public C37023() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                if (OpenPlatformMonitorService$launchEvent$1.this.$status == 1) {
                    jSONObject2.put("error_code", OpenPlatformMonitorService$launchEvent$1.this.$errorCode);
                    jSONObject2.put("error_msg", OpenPlatformMonitorService$launchEvent$1.this.$errorMsg);
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
            c3401f2.LIZIZ(new C37001());
            C37012 c37012 = new C37012();
            if (!PatchProxy.proxy(new Object[]{c37012}, c3401f2, C3401f.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(c37012);
                c37012.invoke(c3401f2.LJFF);
            }
            c3401f2.LIZJ(new C37023());
        }
        return Unit.INSTANCE;
    }
}
