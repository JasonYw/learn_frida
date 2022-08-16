package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class e$c {
    public final C6174n LIZ;
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(27663);
    }

    public final boolean LIZJ() {
        return this instanceof C4508e;
    }

    public final boolean LIZLLL() {
        return this instanceof C4507d;
    }

    public String toString() {
        return this.LIZIZ;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$c */
    /* loaded from: classes3.dex */
    public static final class C4506c extends e$c {
        public static final C4506c LIZJ = new C4506c();

        static {
            Covode.recordClassIndex(27666);
        }

        public C4506c() {
            super(new C6174n(), "None", (byte) 0);
        }
    }

    public final boolean LIZ() {
        if (!(this instanceof C4506c) && !(this instanceof C4505b)) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        if (!(this instanceof C4504a) && !(this instanceof C4509f)) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    public final boolean m15731LJ() {
        if (!(this instanceof C4504a) && !(this instanceof C4509f) && !(this instanceof C4508e) && !(this instanceof C4507d)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$a */
    /* loaded from: classes3.dex */
    public static final class C4504a extends e$c {
        static {
            Covode.recordClassIndex(27664);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4504a(C6174n c6174n) {
            super(c6174n, "Fighting", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$b */
    /* loaded from: classes3.dex */
    public static final class C4505b extends e$c {
        static {
            Covode.recordClassIndex(27665);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4505b(C6174n c6174n) {
            super(c6174n, "Finished", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$d */
    /* loaded from: classes3.dex */
    public static final class C4507d extends e$c {
        static {
            Covode.recordClassIndex(27667);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4507d(C6174n c6174n) {
            super(c6174n, "PunishFinish", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$e */
    /* loaded from: classes3.dex */
    public static final class C4508e extends e$c {
        static {
            Covode.recordClassIndex(27668);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4508e(C6174n c6174n) {
            super(c6174n, "Punishing", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.e$c$f */
    /* loaded from: classes3.dex */
    public static final class C4509f extends e$c {
        static {
            Covode.recordClassIndex(27669);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4509f(C6174n c6174n) {
            super(c6174n, "WaitingResult", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    public e$c(C6174n c6174n, String str) {
        this.LIZ = c6174n;
        this.LIZIZ = str;
    }

    public /* synthetic */ e$c(C6174n c6174n, String str, byte b) {
        this(c6174n, str);
    }
}
