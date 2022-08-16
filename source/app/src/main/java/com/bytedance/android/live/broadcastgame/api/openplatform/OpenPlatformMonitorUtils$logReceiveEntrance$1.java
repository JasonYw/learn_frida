package com.bytedance.android.live.broadcastgame.api.openplatform;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorUtils$logReceiveEntrance$1 extends Lambda implements Function1<C3401f, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $entranceStatus;
    public final /* synthetic */ boolean $fromEnterRoom;
    public final /* synthetic */ boolean $fromSei;

    static {
        Covode.recordClassIndex(19232);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorUtils$logReceiveEntrance$1(boolean z, boolean z2, String str) {
        super(1);
        this.$fromSei = z;
        this.$fromEnterRoom = z2;
        this.$entranceStatus = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3401f c3401f) {
        C3401f c3401f2 = c3401f;
        if (!PatchProxy.proxy(new Object[]{c3401f2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3401f2);
            c3401f2.LIZIZ(new C33961());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.OpenPlatformMonitorUtils$logReceiveEntrance$1$1 */
    /* loaded from: classes5.dex */
    public static final class C33961 extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19233);
        }

        public C33961() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(jSONObject2);
                jSONObject2.put("launch_from_sei", OpenPlatformMonitorUtils$logReceiveEntrance$1.this.$fromSei);
                jSONObject2.put("launch_from_enter_room", OpenPlatformMonitorUtils$logReceiveEntrance$1.this.$fromEnterRoom);
                jSONObject2.put("entrance_status", OpenPlatformMonitorUtils$logReceiveEntrance$1.this.$entranceStatus);
            }
            return Unit.INSTANCE;
        }
    }
}
