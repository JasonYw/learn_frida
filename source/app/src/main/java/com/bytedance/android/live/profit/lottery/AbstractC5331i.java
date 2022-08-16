package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C449013pP;
import p003X.C449123pa;

/* renamed from: com.bytedance.android.live.profit.lottery.i */
/* loaded from: classes12.dex */
public abstract class AbstractC5331i {
    static {
        Covode.recordClassIndex(33480);
    }

    public AbstractC5331i() {
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.i$a */
    /* loaded from: classes12.dex */
    public static final class C5332a extends AbstractC5331i {
        public static final C5332a LIZ = new C5332a();

        public C5332a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(33481);
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.i$c */
    /* loaded from: classes12.dex */
    public static final class C5334c extends AbstractC5331i {
        public static final C5334c LIZ = new C5334c();

        public C5334c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(33483);
        }
    }

    public /* synthetic */ AbstractC5331i(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.i$b */
    /* loaded from: classes12.dex */
    public static final class C5333b extends AbstractC5331i {
        public static ChangeQuickRedirect LIZ;
        public final C5329g LIZIZ;

        static {
            Covode.recordClassIndex(33482);
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
            if (obj instanceof C5333b) {
                return C106862S5w.LIZ(((C5333b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryAction$Approve:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5333b(C5329g c5329g) {
            super((byte) 0);
            C106862S5w.LIZ(c5329g);
            this.LIZIZ = c5329g;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.i$d */
    /* loaded from: classes12.dex */
    public static final class C5335d extends AbstractC5331i {
        public static ChangeQuickRedirect LIZ;
        public final C449123pa LIZIZ;

        static {
            Covode.recordClassIndex(33484);
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
            if (obj instanceof C5335d) {
                return C106862S5w.LIZ(((C5335d) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryAction$Finish:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5335d(C449123pa c449123pa) {
            super((byte) 0);
            C106862S5w.LIZ(c449123pa);
            this.LIZIZ = c449123pa;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.i$e */
    /* loaded from: classes12.dex */
    public static final class C5336e extends AbstractC5331i {
        public static ChangeQuickRedirect LIZ;
        public final C449013pP LIZIZ;

        static {
            Covode.recordClassIndex(33485);
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
            if (obj instanceof C5336e) {
                return C106862S5w.LIZ(((C5336e) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryAction$Reject:%s", LIZ());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5336e(C449013pP c449013pP) {
            super((byte) 0);
            C106862S5w.LIZ(c449013pP);
            this.LIZIZ = c449013pP;
        }
    }
}
