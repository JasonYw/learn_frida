package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class h$c {
    public final C6166j LIZ;
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(29966);
    }

    public final boolean LIZJ() {
        return this instanceof C4906c;
    }

    public final boolean LIZLLL() {
        return this instanceof C4907d;
    }

    /* renamed from: LJ */
    public final boolean m15689LJ() {
        return this instanceof C4908e;
    }

    public String toString() {
        return this.LIZIZ;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.h$c$b */
    /* loaded from: classes3.dex */
    public static final class C4905b extends h$c {
        public static final C4905b LIZJ = new C4905b();

        static {
            Covode.recordClassIndex(29968);
        }

        public C4905b() {
            super(new C6166j(), "None", (byte) 0);
        }
    }

    public final boolean LIZ() {
        if (!(this instanceof C4905b) && !(this instanceof C4904a)) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        if (!(this instanceof C4906c) && !(this instanceof C4908e) && !(this instanceof C4907d)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.h$c$a */
    /* loaded from: classes3.dex */
    public static final class C4904a extends h$c {
        static {
            Covode.recordClassIndex(29967);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4904a(C6166j c6166j) {
            super(c6166j, "Finished", (byte) 0);
            C106862S5w.LIZ(c6166j);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.h$c$c */
    /* loaded from: classes3.dex */
    public static final class C4906c extends h$c {
        static {
            Covode.recordClassIndex(29969);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4906c(C6166j c6166j) {
            super(c6166j, "OnGoing", (byte) 0);
            C106862S5w.LIZ(c6166j);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.h$c$d */
    /* loaded from: classes3.dex */
    public static final class C4907d extends h$c {
        static {
            Covode.recordClassIndex(29970);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4907d(C6166j c6166j) {
            super(c6166j, "OnPausing", (byte) 0);
            C106862S5w.LIZ(c6166j);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.h$c$e */
    /* loaded from: classes3.dex */
    public static final class C4908e extends h$c {
        static {
            Covode.recordClassIndex(29971);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4908e(C6166j c6166j) {
            super(c6166j, "ShowResult", (byte) 0);
            C106862S5w.LIZ(c6166j);
        }
    }

    public h$c(C6166j c6166j, String str) {
        this.LIZ = c6166j;
        this.LIZIZ = str;
    }

    public /* synthetic */ h$c(C6166j c6166j, String str, byte b) {
        this(c6166j, str);
    }
}
