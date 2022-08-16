package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.AbstractC80496HoA;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class d$c {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(31836);
    }

    public final boolean LIZ() {
        return this instanceof AbstractC80496HoA;
    }

    public final boolean LIZIZ() {
        return this instanceof C5133e;
    }

    /* renamed from: LJ */
    public final boolean m15640LJ() {
        return this instanceof C5132d;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.d$c$a */
    /* loaded from: classes3.dex */
    public static final class C5129a extends C5133e {

        /* renamed from: LJ */
        public static final C5129a f26501LJ = new C5129a();

        public C5129a() {
            super(null, "Empty", 1);
        }

        static {
            Covode.recordClassIndex(31837);
        }
    }

    public final boolean LIZJ() {
        if (this.LIZIZ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        if (this.LIZIZ == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25083C(this.LIZLLL, "{mode=", Integer.valueOf(this.LIZIZ), " id=", this.LIZJ);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.d$c$b */
    /* loaded from: classes3.dex */
    public static final class C5130b extends AbstractC80496HoA {
        static {
            Covode.recordClassIndex(31838);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5130b(String str, int i) {
            super(str, i, "LinkerOn");
            C106862S5w.LIZ(str);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.d$c$c */
    /* loaded from: classes3.dex */
    public static final class C5131c extends AbstractC80496HoA {
        static {
            Covode.recordClassIndex(31839);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5131c(String str, int i) {
            super(str, i, "RemoteOn");
            C106862S5w.LIZ(str);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.d$c$d */
    /* loaded from: classes3.dex */
    public static final class C5132d extends AbstractC80496HoA {
        static {
            Covode.recordClassIndex(31840);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5132d(String str, int i) {
            super(str, i, "SelfOn");
            C106862S5w.LIZ(str);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.d$c$e */
    /* loaded from: classes3.dex */
    public static class C5133e extends d$c {
        static {
            Covode.recordClassIndex(31841);
        }

        public C5133e() {
            this(null, null, 3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5133e(String str, String str2) {
            super(0, str, str2, (byte) 0);
            C106862S5w.LIZ(str, str2);
        }

        public /* synthetic */ C5133e(String str, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "VideoOff" : str2);
        }
    }

    public d$c(int i, String str, String str2) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    public /* synthetic */ d$c(int i, String str, String str2, byte b) {
        this(i, str, str2);
    }
}
