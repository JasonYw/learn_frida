package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class b$c {
    public final C6174n LIZ;
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(31340);
    }

    public final boolean LIZJ() {
        return this instanceof C5067a;
    }

    public final boolean LIZLLL() {
        return this instanceof C5071e;
    }

    public String toString() {
        return this.LIZIZ;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.b$c$c */
    /* loaded from: classes3.dex */
    public static final class C5069c extends b$c {
        public static final C5069c LIZJ = new C5069c();

        static {
            Covode.recordClassIndex(31343);
        }

        public C5069c() {
            super(new C6174n(), "None", (byte) 0);
        }
    }

    public final boolean LIZ() {
        if (!(this instanceof C5069c) && !(this instanceof C5068b)) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        if (!(this instanceof C5070d) && !(this instanceof C5067a) && !(this instanceof C5071e)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.b$c$a */
    /* loaded from: classes3.dex */
    public static final class C5067a extends b$c {
        static {
            Covode.recordClassIndex(31341);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5067a(C6174n c6174n) {
            super(c6174n, "Fighting", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.b$c$b */
    /* loaded from: classes3.dex */
    public static final class C5068b extends b$c {
        static {
            Covode.recordClassIndex(31342);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5068b(C6174n c6174n) {
            super(c6174n, "Finished", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.b$c$d */
    /* loaded from: classes3.dex */
    public static final class C5070d extends b$c {
        static {
            Covode.recordClassIndex(31344);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5070d(C6174n c6174n) {
            super(c6174n, "Preparing", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.b$c$e */
    /* loaded from: classes3.dex */
    public static final class C5071e extends b$c {
        static {
            Covode.recordClassIndex(31345);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5071e(C6174n c6174n) {
            super(c6174n, "Punishing", (byte) 0);
            C106862S5w.LIZ(c6174n);
        }
    }

    public b$c(C6174n c6174n, String str) {
        this.LIZ = c6174n;
        this.LIZIZ = str;
    }

    public /* synthetic */ b$c(C6174n c6174n, String str, byte b) {
        this(c6174n, str);
    }
}
