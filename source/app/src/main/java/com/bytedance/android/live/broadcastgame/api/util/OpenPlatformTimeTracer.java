package com.bytedance.android.live.broadcastgame.api.util;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C87767Ki9;

/* loaded from: classes5.dex */
public final class OpenPlatformTimeTracer {
    public static ChangeQuickRedirect LIZ;
    public long LIZJ;
    public volatile boolean LJFF;
    public static final C87767Ki9 LJII = new C87767Ki9((byte) 0);
    public static final OpenPlatformTimeTracer LJI = new OpenPlatformTimeTracer();
    public final LinkedList<C3403b> LIZIZ = new LinkedList<>();
    public String LIZLLL = "";

    /* renamed from: LJ */
    public String f26033LJ = "";

    /* loaded from: classes5.dex */
    public enum EventName {
        room_enter_start,
        room_enter_end,
        live_toolbar_register,
        miniapp_widget_load,
        entrance_info_start,
        entrance_info_end,
        entrance_visiable_start,
        entrance_visiable_end,
        show_icon_time,
        stamp_v2_info_start,
        stamp_v2_info_end,
        show_card_time,
        miniapp_toolbar_load;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19271);
        }

        public static EventName valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (EventName) (proxy.isSupported ? proxy.result : Enum.valueOf(EventName.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EventName[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (EventName[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19270);
    }

    private final boolean LIZIZ(EventName eventName) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventName}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (C3403b c3403b : this.LIZIZ) {
            if (Intrinsics.areEqual(c3403b.LIZIZ, eventName.toString())) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        long currentTimeMillis = System.currentTimeMillis();
        ALogger.m15801d("OpenPlatformTimeTracer", str + " : " + (currentTimeMillis - this.LIZJ));
    }

    public final void LIZ(EventName eventName) {
        long j;
        C2WC<Map<String, String>> LJJIJIIJI;
        Map<String, String> LIZ2;
        String str;
        if (PatchProxy.proxy(new Object[]{eventName}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventName);
        if (LIZIZ(eventName)) {
            return;
        }
        if (this.LIZJ == 0) {
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ3 != null && (LJJIJIIJI = LIZ3.LJJIJIIJI()) != null && (LIZ2 = LJJIJIIJI.LIZ()) != null && (str = LIZ2.get("enter_api_time_stamp")) != null) {
                j = Long.parseLong(str);
            } else {
                j = 0;
            }
            this.LIZJ = j;
        }
        if (this.LIZJ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.add(new C3403b(eventName.toString(), currentTimeMillis - this.LIZJ));
        ALogger.m15801d("OpenPlatformTimeTracer", eventName.toString() + " : " + (currentTimeMillis - this.LIZJ));
        if (!this.LJFF) {
            if (eventName == EventName.entrance_info_start || eventName == EventName.entrance_info_end) {
                this.LJFF = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.util.OpenPlatformTimeTracer$b */
    /* loaded from: classes5.dex */
    public static final class C3403b {
        public static ChangeQuickRedirect LIZ;
        public final String LIZIZ;
        public final long LIZJ;

        static {
            Covode.recordClassIndex(19273);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3403b) {
                return C106862S5w.LIZ(((C3403b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenPlatformTimeTracer$LogRecord:%s,%s", LIZ());
        }

        public C3403b(String str, long j) {
            C106862S5w.LIZ(str);
            this.LIZIZ = str;
            this.LIZJ = j;
        }
    }

    public final void LIZ(List<C3403b> list, HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{list, hashMap}, this, LIZ, false, 6).isSupported) {
            return;
        }
        for (C3403b c3403b : list) {
            hashMap.put(c3403b.LIZIZ, String.valueOf(c3403b.LIZJ));
        }
    }

    public final void LIZ(EventName eventName, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{eventName, str, str2}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventName, str, str2);
        if (LIZIZ(eventName)) {
            return;
        }
        this.LIZLLL = str;
        this.f26033LJ = str2;
        LIZ(eventName);
    }
}
