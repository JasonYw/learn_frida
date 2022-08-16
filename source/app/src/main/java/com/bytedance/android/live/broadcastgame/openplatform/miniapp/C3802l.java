package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AudienceMiniCardService;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C87775KiH;
import p003X.C87807Kin;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.l */
/* loaded from: classes5.dex */
public final class C3802l {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public String LJFF;
    public final LinkedList<C3803b> LJI;

    /* renamed from: LJ */
    public static final C87775KiH f26111LJ = new C87775KiH((byte) 0);
    public static final ConcurrentHashMap<Integer, C3802l> LIZJ = new ConcurrentHashMap<>();
    public static final AtomicInteger LIZLLL = new AtomicInteger();

    static {
        Covode.recordClassIndex(21665);
    }

    public C3802l(int i) {
        this.LIZIZ = i;
        this.LJFF = "";
        this.LJI = new LinkedList<>();
    }

    public final C3802l LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C3802l) proxy.result;
        }
        C106862S5w.LIZ(str);
        this.LJFF = str;
        this.LJI.add(new C3803b(System.currentTimeMillis(), str));
        return this;
    }

    private final String LIZ(List<C3803b> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        for (C3803b c3803b : list) {
            String format = SimpleDateFormat.getDateTimeInstance().format(Long.valueOf(c3803b.LIZIZ));
            sb.append(format + ", " + c3803b.LIZJ + '\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        return sb2;
    }

    public final C3802l LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3802l) proxy.result;
        }
        C106862S5w.LIZ(str);
        this.LJI.add(new C3803b(System.currentTimeMillis(), str));
        return this;
    }

    public final void LIZ(boolean z) {
        String str;
        Room room;
        C2WC<Room> LIZ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (z) {
            str = "cancel";
        } else if (this.LJFF.length() == 0) {
            str = "success";
        } else {
            str = "fail";
        }
        C4574547f LIZ3 = C4574547f.LIZ();
        HashMap hashMap = new HashMap();
        hashMap.put("result", str);
        hashMap.put("errMsg", this.LJFF);
        hashMap.put("trace", LIZ(this.LJI));
        C87807Kin c87807Kin = AudienceMiniCardService.LIZLLL;
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        c87807Kin.LIZ(room, hashMap);
        LIZ3.LIZ("livesdk_small_program_show_entrance", hashMap, new Object[0]);
    }

    public /* synthetic */ C3802l(int i, byte b) {
        this(i);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.l$b */
    /* loaded from: classes5.dex */
    public static final class C3803b {
        public static ChangeQuickRedirect LIZ;
        public final long LIZIZ;
        public final String LIZJ;

        static {
            Covode.recordClassIndex(21667);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3803b) {
                return C106862S5w.LIZ(((C3803b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ShowEntranceTimeLineEvent$LogRecord:%s,%s", LIZ());
        }

        public C3803b(long j, String str) {
            C106862S5w.LIZ(str);
            this.LIZIZ = j;
            this.LIZJ = str;
        }
    }

    public static /* synthetic */ void LIZ(C3802l c3802l, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3802l, (byte) 0, 1, null}, null, LIZ, true, 4).isSupported) {
            return;
        }
        c3802l.LIZ(false);
    }
}
