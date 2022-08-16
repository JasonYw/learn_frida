package com.bytedance.android.live.core.room.startup;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC147779fOX;
import p003X.AbstractC147780fOY;
import p003X.AbstractC147781fOZ;
import p003X.C106862S5w;
import p003X.HandlerC123242Yey;
import p003X.RunnableC147773fOR;

/* renamed from: com.bytedance.android.live.core.room.startup.b */
/* loaded from: classes20.dex */
public abstract class AbstractC4087b implements AbstractC147781fOZ {
    public static ChangeQuickRedirect LIZ;
    public AbstractC147780fOY LIZLLL;

    /* renamed from: LJ */
    public C4090l f26181LJ;
    public Function0<Unit> LJI;
    public volatile int LJIIIIZZ;
    public final String LIZIZ = "ROOM_TASK_LOGGER_AbsRoomTask";
    public C4088c LIZJ = new C4088c(this.LIZIZ);
    public List<AbstractC4087b> LJFF = new ArrayList();
    public final HandlerC123242Yey LJII = new HandlerC123242Yey(this, Looper.getMainLooper());
    public final Map<String, Integer> LJIIIZ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(23595);
    }

    public boolean LIZJ() {
        return false;
    }

    public final void LJFF() {
        this.LJIIIIZZ = 0;
    }

    /* renamed from: LJ */
    public final boolean m15792LJ() {
        if (this.LJIIIIZZ == 3) {
            return true;
        }
        return false;
    }

    public List<String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return new ArrayList();
    }

    public final void LJI() {
        List<String> LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (LIZ2 = LIZ()) != null && !LIZ2.isEmpty()) {
            for (String str : LIZ2) {
                this.LJIIIZ.put(str, 0);
            }
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (this.LJIIIIZZ != 0 && this.LIZJ.LIZIZ) {
            throw new StartupException(C0002O.m25085C("You try to run task ", LJIIIZ(), " twice, please check is there a circular dependency."));
        }
        AbstractC147779fOX abstractC147779fOX = this.LIZJ.LIZJ;
        String str = this.LIZJ.f26182LJ;
        new StringBuilder();
        String LJIIIZ = LJIIIZ();
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "");
        abstractC147779fOX.LIZ(str, C0002O.m25085C(LJIIIZ, " task start. trigger threadName = ", currentThread.getName()));
        this.LJIIIIZZ = 1;
        RunnableC147773fOR runnableC147773fOR = new RunnableC147773fOR(this, SystemClock.uptimeMillis());
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            C4089d.LIZLLL.LIZ();
        }
        if (LIZJ()) {
            this.LJII.post(runnableC147773fOR);
        } else {
            runnableC147773fOR.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZLLL() {
        /*
            r7 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.room.startup.AbstractC4087b.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            java.util.List<com.bytedance.android.live.core.room.startup.b> r0 = r7.LJFF
            java.util.Iterator r6 = r0.iterator()
        L16:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r6.next()
            com.bytedance.android.live.core.room.startup.b r2 = (com.bytedance.android.live.core.room.startup.AbstractC4087b) r2
            r5 = r7
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r3] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.room.startup.AbstractC4087b.LIZ
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r4, r2, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L16
            java.lang.String r4 = r5.LJIIIZ()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.LJIIIZ
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L16
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.LJIIIZ
            r5 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r4, r0)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.room.startup.AbstractC4087b.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r2, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L16
        L62:
            int r0 = r2.LJIIIIZZ
            if (r0 != 0) goto L16
            r2.LIZIZ()
            goto L16
        L6a:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.LJIIIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L74:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r5) goto L74
            goto L16
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.room.startup.AbstractC4087b.LIZLLL():void");
    }

    public final void LIZ(C4088c c4088c) {
        if (PatchProxy.proxy(new Object[]{c4088c}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4088c);
        this.LIZJ = c4088c;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJIIIZ.containsKey(str)) {
            this.LJIIIZ.put(str, 0);
        }
        this.LIZJ.LIZJ.LIZ(this.LIZJ.f26182LJ, C0002O.m25084C("resetParentStatus is called. parent task ", str, ", self name is ", LJIIIZ()));
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 11).isSupported) {
            return;
        }
        AbstractC147779fOX abstractC147779fOX = this.LIZJ.LIZJ;
        String str = this.LIZJ.f26182LJ;
        abstractC147779fOX.LIZ(str, LJIIIZ() + " task is stopped, current state is " + this.LJIIIIZZ + ", isStop = false");
        this.LJIIIIZZ = 4;
        this.LJII.removeCallbacksAndMessages(null);
    }
}
