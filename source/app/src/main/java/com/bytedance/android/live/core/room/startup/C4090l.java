package com.bytedance.android.live.core.room.startup;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC147779fOX;
import p003X.AbstractC147780fOY;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.room.startup.l */
/* loaded from: classes20.dex */
public final class C4090l {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Map<String, AbstractC4087b> LIZJ;
    public final C4088c LIZLLL;

    /* renamed from: LJ */
    public final List<String> f26184LJ;

    static {
        Covode.recordClassIndex(23609);
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && !Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()) && this.LIZLLL.LIZIZ) {
            LIZIZ("please check your call thread, this method must call on main thread. ");
        }
    }

    public final void LIZIZ() {
        Map<String, AbstractC4087b> map;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (map = this.LIZJ) != null && !map.isEmpty()) {
            this.LIZLLL.LIZJ.LIZ(this.LIZLLL.LIZLLL, "onDestroy is called.");
            for (AbstractC4087b abstractC4087b : this.LIZJ.values()) {
                abstractC4087b.LIZ(false);
            }
            this.LIZJ.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.core.room.startup.l$b */
    /* loaded from: classes20.dex */
    public static final class C4091b implements AbstractC147780fOY {
        public static ChangeQuickRedirect LIZ;
        public final C4088c LIZIZ;

        static {
            Covode.recordClassIndex(23611);
        }

        @Override // p003X.AbstractC147780fOY
        public final void LIZ(AbstractC4087b abstractC4087b) {
            if (PatchProxy.proxy(new Object[]{abstractC4087b}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(abstractC4087b);
        }

        public C4091b(C4088c c4088c) {
            C106862S5w.LIZ(c4088c);
            this.LIZIZ = c4088c;
        }

        @Override // p003X.AbstractC147780fOY
        public final void LIZ(AbstractC4087b abstractC4087b, long j, long j2) {
            if (PatchProxy.proxy(new Object[]{abstractC4087b, new Long(j), new Long(j2)}, this, LIZ, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(abstractC4087b);
            AbstractC147779fOX abstractC147779fOX = this.LIZIZ.LIZJ;
            abstractC147779fOX.LIZ("ROOM_TASK_LOGGER_RoomTaskManager", "DefaultTaskListener_" + this.LIZIZ.LJFF + ", " + abstractC4087b.LJIIIZ() + " task has finished. real cost time = " + (j2 - j) + ", wait time = " + j + ", finishedTime = " + j2);
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!this.LIZLLL.LIZIZ) {
            this.LIZLLL.LIZJ.LIZ(this.LIZLLL.LIZLLL, str, new Throwable());
            return;
        }
        throw new StartupException(str, new Throwable());
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZLLL.LIZJ.LIZ(this.LIZLLL.LIZLLL, C0002O.m25086C("startRelationTask ", str));
        LIZ();
        if (!this.LIZJ.containsKey(str)) {
            LIZIZ("please commit task firstly. ");
        }
        AbstractC4087b abstractC4087b = this.LIZJ.get(str);
        if (abstractC4087b != null) {
            abstractC4087b.LIZIZ();
        }
    }

    public C4090l(Map<String, AbstractC4087b> map, C4088c c4088c) {
        this.LIZJ = map;
        this.LIZLLL = c4088c;
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new RoomTaskManager$mDefaultTaskListener$2(this));
        this.f26184LJ = CollectionsKt__CollectionsKt.mutableListOf("P0_WIDGET_ROOM_TASK", "P1_WIDGET_ROOM_TASK", "P2_WIDGET_ROOM_TASK", "OTHER_WIDGET_ROOM_TASK");
    }

    public /* synthetic */ C4090l(Map map, C4088c c4088c, byte b) {
        this(map, c4088c);
    }

    public final void LIZ(String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (PatchProxy.proxy(new Object[]{str, (byte) 0, str2}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        Map<String, AbstractC4087b> map = this.LIZJ;
        if (map != null && !map.isEmpty()) {
            AbstractC147779fOX abstractC147779fOX = this.LIZLLL.LIZJ;
            String str3 = this.LIZLLL.LIZLLL;
            abstractC147779fOX.LIZ(str3, "resetTaskFamily is called. business tag is " + str + ", from = " + str2);
            Iterator<Map.Entry<String, AbstractC4087b>> it = this.LIZJ.entrySet().iterator();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (it.hasNext()) {
                Map.Entry<String, AbstractC4087b> next = it.next();
                if (Intrinsics.areEqual(next.getValue().LJIIIIZZ(), str) && !this.f26184LJ.contains(next.getValue().LJIIIZ())) {
                    next.getValue().LIZ(false);
                    it.remove();
                } else {
                    linkedHashMap.put(next.getValue().LJIIIZ(), next.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                AbstractC4087b abstractC4087b = this.LIZJ.get("P0_WIDGET_ROOM_TASK");
                if (abstractC4087b != null && abstractC4087b.m15792LJ()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AbstractC4087b abstractC4087b2 = this.LIZJ.get("P1_WIDGET_ROOM_TASK");
                if (abstractC4087b2 != null && abstractC4087b2.m15792LJ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC4087b abstractC4087b3 = this.LIZJ.get("P2_WIDGET_ROOM_TASK");
                if (abstractC4087b3 != null && abstractC4087b3.m15792LJ()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC4087b abstractC4087b4 = this.LIZJ.get("OTHER_WIDGET_ROOM_TASK");
                if (abstractC4087b4 != null && abstractC4087b4.m15792LJ()) {
                    z5 = true;
                }
                AbstractC4087b abstractC4087b5 = this.LIZJ.get("P0_WIDGET_ROOM_TASK");
                if (abstractC4087b5 != null) {
                    abstractC4087b5.LJFF();
                }
                AbstractC4087b abstractC4087b6 = this.LIZJ.get("P1_WIDGET_ROOM_TASK");
                if (abstractC4087b6 != null) {
                    abstractC4087b6.LJFF();
                }
                AbstractC4087b abstractC4087b7 = this.LIZJ.get("P2_WIDGET_ROOM_TASK");
                if (abstractC4087b7 != null) {
                    abstractC4087b7.LJFF();
                }
                AbstractC4087b abstractC4087b8 = this.LIZJ.get("OTHER_WIDGET_ROOM_TASK");
                if (abstractC4087b8 != null) {
                    abstractC4087b8.LJFF();
                }
                AbstractC147779fOX abstractC147779fOX2 = this.LIZLLL.LIZJ;
                String str4 = this.LIZLLL.LIZLLL;
                abstractC147779fOX2.LIZ(str4, "resetTaskFamily is called. isKeepTask  size  " + linkedHashMap.size() + ", p0Finished = " + z2 + ", p1Finished = " + z3 + ", p2Finished = " + z4 + ", endFinished = " + z5);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    AbstractC4087b abstractC4087b9 = (AbstractC4087b) entry.getValue();
                    if (z2 && !abstractC4087b9.m15792LJ() && abstractC4087b9.LIZ().contains("P0_WIDGET_ROOM_TASK")) {
                        abstractC4087b9.LIZ("P0_WIDGET_ROOM_TASK");
                    }
                    if (z3 && !abstractC4087b9.m15792LJ() && abstractC4087b9.LIZ().contains("P1_WIDGET_ROOM_TASK")) {
                        abstractC4087b9.LIZ("P1_WIDGET_ROOM_TASK");
                    }
                    if (z4 && !abstractC4087b9.m15792LJ() && abstractC4087b9.LIZ().contains("P2_WIDGET_ROOM_TASK")) {
                        abstractC4087b9.LIZ("P2_WIDGET_ROOM_TASK");
                    }
                    if (z5 && !abstractC4087b9.m15792LJ() && abstractC4087b9.LIZ().contains("OTHER_WIDGET_ROOM_TASK")) {
                        abstractC4087b9.LIZ("OTHER_WIDGET_ROOM_TASK");
                    }
                }
            }
        }
    }
}
