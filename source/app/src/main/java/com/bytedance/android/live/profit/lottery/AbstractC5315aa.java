package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C449013pP;
import p003X.C449123pa;

/* renamed from: com.bytedance.android.live.profit.lottery.aa */
/* loaded from: classes12.dex */
public abstract class AbstractC5315aa {
    static {
        Covode.recordClassIndex(33454);
    }

    public AbstractC5315aa() {
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$c */
    /* loaded from: classes12.dex */
    public static final class C5318c extends AbstractC5315aa {
        public static final C5318c LIZ = new C5318c();

        public C5318c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(33457);
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$e */
    /* loaded from: classes12.dex */
    public static final class C5320e extends AbstractC5315aa {
        public static final C5320e LIZ = new C5320e();

        public C5320e() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(33459);
        }
    }

    public /* synthetic */ AbstractC5315aa(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$a */
    /* loaded from: classes12.dex */
    public static final class C5316a extends AbstractC5315aa {
        public static ChangeQuickRedirect LIZ;
        public final C5329g LIZIZ;

        static {
            Covode.recordClassIndex(33455);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5316a) {
                return C106862S5w.LIZ(((C5316a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryState$Drawing:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5316a(C5329g c5329g) {
            super((byte) 0);
            C106862S5w.LIZ(c5329g);
            this.LIZIZ = c5329g;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$d */
    /* loaded from: classes12.dex */
    public static final class C5319d extends AbstractC5315aa {
        public static ChangeQuickRedirect LIZ;
        public final C449013pP LIZIZ;

        static {
            Covode.recordClassIndex(33458);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5319d) {
                return C106862S5w.LIZ(((C5319d) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryState$Rejected:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5319d(C449013pP c449013pP) {
            super((byte) 0);
            C106862S5w.LIZ(c449013pP);
            this.LIZIZ = c449013pP;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$f */
    /* loaded from: classes12.dex */
    public static final class C5321f extends AbstractC5315aa {
        public static ChangeQuickRedirect LIZ;
        public final C5329g LIZIZ;

        static {
            Covode.recordClassIndex(33460);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5321f) {
                return C106862S5w.LIZ(((C5321f) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryState$Waiting:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5321f(C5329g c5329g) {
            super((byte) 0);
            C106862S5w.LIZ(c5329g);
            this.LIZIZ = c5329g;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.aa$b */
    /* loaded from: classes12.dex */
    public static final class C5317b extends AbstractC5315aa {
        public static ChangeQuickRedirect LIZ;
        public final C5329g LIZIZ;
        public final C449123pa LIZJ;

        static {
            Covode.recordClassIndex(33456);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ, this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5317b) {
                return C106862S5w.LIZ(((C5317b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryState$Finished:%s,%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5317b(C5329g c5329g, C449123pa c449123pa) {
            super((byte) 0);
            C106862S5w.LIZ(c5329g, c449123pa);
            this.LIZIZ = c5329g;
            this.LIZJ = c449123pa;
        }
    }
}
