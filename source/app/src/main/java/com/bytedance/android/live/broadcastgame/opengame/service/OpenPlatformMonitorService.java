package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3401f;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87739Khh;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorService implements AbstractC3717a, AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ = -1;
    public final Function1<JSONObject, Unit> LIZJ = new OpenPlatformMonitorService$appParam$1(this);
    public final Function1<JSONObject, Unit> LIZLLL = new OpenPlatformMonitorService$launchParam$1(this);

    /* renamed from: LJ */
    public final Lazy f26085LJ = LazyKt__LazyJVMKt.lazy(new OpenPlatformMonitorService$launchFrom$2(this));
    public C3682x LJFF;

    static {
        Covode.recordClassIndex(20998);
    }

    private final String LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.f26085LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    public final C3682x LJII() {
        return this.LJFF;
    }

    public static /* synthetic */ void LIZ(OpenPlatformMonitorService openPlatformMonitorService, boolean z, int i, Integer num, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, Byte.valueOf(z ? (byte) 1 : (byte) 0), 0, null, null, 12, null}, null, LIZ, true, 3).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZ(z, 0, (Integer) null, (String) null);
    }

    public final void LIZ(boolean z, int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), num, str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZ("ttlive_open_platform_bootconfig", LiveTracingMonitor.EventType.SERVER_API_CALL, i, num, str).LIZ(new OpenPlatformMonitorService$logFetchBootInfo$1(z)).LIZ();
    }

    public final void LIZ(int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ("ttlive_open_platform_resource_download", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str).LIZ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        LIZ(this, "ttlive_open_platform_first_screen", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 28, null).LIZ();
        this.LIZIZ = -1L;
    }

    public final void LIZ(String str, int i, Integer num, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), num, str2}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(str, "ttlive_open_platform_openapi_check_permission", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str2).LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        LIZ(this, "ttlive_open_platform_exit", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 28, null).LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        LIZ(this, "ttlive_open_platform_ready", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 28, null).LIZ();
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZ(this, "ttlive_open_platform_retry", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 28, null).LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        LIZ(this, "ttlive_open_platform_app_launch_start", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 28, null).LIZ();
        this.LIZIZ = System.currentTimeMillis();
    }

    public OpenPlatformMonitorService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LJFF = c3682x;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(this, str, "ttlive_open_platform_openapi_call", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 56, null).LIZ();
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(this, str, "ttlive_open_platform_pay_success", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, null, null, 48, null).LIZ();
    }

    private void LIZJ(int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ("ttlive_open_platform_app_start", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str).LIZ();
    }

    private void LIZLLL(int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZ("ttlive_open_platform_panel_show", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str).LIZ();
    }

    public final void LIZIZ(int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ("ttlive_open_platform_resource_load", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str).LIZ();
    }

    /* renamed from: LJ */
    private void m15841LJ(String str, int i, Integer num, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), num, str2}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(str, "ttlive_open_platform_pay_user_confirm", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str2).LIZ();
    }

    private void LIZLLL(String str, int i, Integer num, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), num, str2}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(str, "ttlive_open_platform_pay_condition_check", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str2).LIZ();
    }

    public final void LIZIZ(String str, int i, Integer num, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), num, str2}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(str, "ttlive_open_platform_openapi_execute", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str2).LIZ();
    }

    public final void LIZJ(String str, int i, Integer num, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), num, str2}, this, LIZ, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(str, "ttlive_open_platform_pay_order_create", LiveTracingMonitor.EventType.BUSSINESS_API_CALL, i, num, str2).LIZ();
    }

    private final C3401f LIZ(String str, LiveTracingMonitor.EventType eventType, int i, Integer num, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, eventType, Integer.valueOf(i), num, str2}, this, LIZ, false, 30);
        if (proxy.isSupported) {
            return (C3401f) proxy.result;
        }
        return C87739Khh.LIZIZ.LIZ(str, eventType, i, LJIIIIZZ()).LIZ(new OpenPlatformMonitorService$launchEvent$1(this, i, num, str2));
    }

    public static /* synthetic */ void LIZIZ(OpenPlatformMonitorService openPlatformMonitorService, int i, Integer num, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, Integer.valueOf(i), null, null, 6, null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZJ(i, null, null);
    }

    public static /* synthetic */ void LIZJ(OpenPlatformMonitorService openPlatformMonitorService, int i, Integer num, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, Integer.valueOf(i), null, null, 6, null}, null, LIZ, true, 9).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZIZ(i, null, null);
    }

    public static /* synthetic */ void LIZLLL(OpenPlatformMonitorService openPlatformMonitorService, int i, Integer num, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, Integer.valueOf(i), null, null, 6, null}, null, LIZ, true, 11).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZLLL(i, null, null);
    }

    private final C3401f LIZ(String str, String str2, LiveTracingMonitor.EventType eventType, int i, Integer num, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, eventType, Integer.valueOf(i), num, str3}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (C3401f) proxy.result;
        }
        return LIZ(str2, eventType, i, num, str3).LIZ(new OpenPlatformMonitorService$openApiEvent$1(str));
    }

    public static /* synthetic */ void LIZ(OpenPlatformMonitorService openPlatformMonitorService, int i, Integer num, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, 0, null, null, 6, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZ(0, null, null);
    }

    public static /* synthetic */ void LIZIZ(OpenPlatformMonitorService openPlatformMonitorService, String str, int i, Integer num, String str2, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, 0, null, null, 12, null}, null, LIZ, true, 18).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZIZ(str, 0, null, null);
    }

    public static /* synthetic */ void LIZJ(OpenPlatformMonitorService openPlatformMonitorService, String str, int i, Integer num, String str2, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, Integer.valueOf(i), null, null, 12, null}, null, LIZ, true, 20).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZLLL(str, i, null, null);
    }

    public static /* synthetic */ void LIZLLL(OpenPlatformMonitorService openPlatformMonitorService, String str, int i, Integer num, String str2, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, Integer.valueOf(i), null, null, 12, null}, null, LIZ, true, 22).isSupported) {
            return;
        }
        openPlatformMonitorService.m15841LJ(str, i, null, null);
    }

    public static /* synthetic */ void LIZ(OpenPlatformMonitorService openPlatformMonitorService, String str, int i, Integer num, String str2, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, 0, null, null, 12, null}, null, LIZ, true, 16).isSupported) {
            return;
        }
        openPlatformMonitorService.LIZ(str, 0, (Integer) null, (String) null);
    }

    public static /* synthetic */ C3401f LIZ(OpenPlatformMonitorService openPlatformMonitorService, String str, LiveTracingMonitor.EventType eventType, int i, Integer num, String str2, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, eventType, 0, null, null, 28, null}, null, LIZ, true, 31);
        if (proxy.isSupported) {
            return (C3401f) proxy.result;
        }
        return openPlatformMonitorService.LIZ(str, eventType, 0, null, null);
    }

    public static /* synthetic */ C3401f LIZ(OpenPlatformMonitorService openPlatformMonitorService, String str, String str2, LiveTracingMonitor.EventType eventType, int i, Integer num, String str3, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{openPlatformMonitorService, str, str2, eventType, 0, null, null, Integer.valueOf(i2), null}, null, LIZ, true, 33);
        if (proxy.isSupported) {
            return (C3401f) proxy.result;
        }
        return openPlatformMonitorService.LIZ(str, str2, eventType, 0, (Integer) null, (String) null);
    }
}
