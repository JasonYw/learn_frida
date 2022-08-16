package com.bytedance.android.live.broadcastgame.api.openplatform;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.f */
/* loaded from: classes5.dex */
public final class C3401f {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final LiveTracingMonitor.EventType LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final JSONObject f26031LJ;
    public final JSONObject LJFF;
    public final JSONObject LJI;

    static {
        Covode.recordClassIndex(19243);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL), this.f26031LJ, this.LJFF, this.LJI};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3401f) {
            return C106862S5w.LIZ(((C3401f) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenPlatformMonitorEvent:%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        ALogger.m15801d("OpenPlatformMonitorV2", "\n Service: " + this.LIZIZ + " statusCode: " + this.LIZLLL + " \n Category: " + this.f26031LJ + " \n Metric: " + this.LJFF + "  \n Extra: " + this.LJI);
        LiveTracingMonitor.LIZ(this.LIZIZ, LiveTracingMonitor.EventModule.OPEN_PLATFORM, this.LIZJ, this.f26031LJ, this.LJFF, this.LJI);
    }

    public final C3401f LIZ(Function1<? super C3401f, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C3401f) proxy.result;
        }
        C106862S5w.LIZ(function1);
        function1.invoke(this);
        return this;
    }

    public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        function1.invoke(this.f26031LJ);
    }

    public final void LIZJ(Function1<? super JSONObject, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        function1.invoke(this.LJI);
    }

    public C3401f(String str, LiveTracingMonitor.EventType eventType, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C106862S5w.LIZ(str, eventType, jSONObject, jSONObject2, jSONObject3);
        this.LIZIZ = str;
        this.LIZJ = eventType;
        this.LIZLLL = i;
        this.f26031LJ = jSONObject;
        this.LJFF = jSONObject2;
        this.LJI = jSONObject3;
    }

    public /* synthetic */ C3401f(String str, LiveTracingMonitor.EventType eventType, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i2) {
        this(str, eventType, i, new JSONObject(), new JSONObject(), new JSONObject());
    }
}
