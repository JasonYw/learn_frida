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
public final class OpenPlatformMonitorService$logFetchBootInfo$1 extends Lambda implements Function1<C3401f, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isFromCache;

    static {
        Covode.recordClassIndex(21006);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorService$logFetchBootInfo$1(boolean z) {
        super(1);
        this.$isFromCache = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3401f c3401f) {
        C3401f c3401f2 = c3401f;
        if (!PatchProxy.proxy(new Object[]{c3401f2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3401f2);
            c3401f2.LIZIZ(new C37031());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService$logFetchBootInfo$1$1 */
    /* loaded from: classes5.dex */
    public static final class C37031 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21007);
        }

        public C37031() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                jSONObject2.put("is_from_cached", OpenPlatformMonitorService$logFetchBootInfo$1.this.$isFromCache);
            }
            return Unit.INSTANCE;
        }
    }
}
