package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Resource {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public int cpu;

    /* renamed from: io */
    public C0726IO f21057io;

    /* renamed from: cn.ever.cloud.android.services.task.entity.Resource$IO */
    /* loaded from: classes23.dex */
    public static final class C0726IO {
        public static final Companion Companion = new Companion(null);
        public static ChangeQuickRedirect changeQuickRedirect;
        public int down;

        /* renamed from: up */
        public int f21058up;

        static {
            Covode.recordClassIndex(3099);
        }

        /* renamed from: cn.ever.cloud.android.services.task.entity.Resource$IO$Companion */
        /* loaded from: classes23.dex */
        public static final class Companion {
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3100);
            }

            public Companion() {
            }

            public final C0726IO zero() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return (C0726IO) proxy.result;
                }
                return new C0726IO(0, 0);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final int getDown() {
            return this.down;
        }

        public final int getUp() {
            return this.f21058up;
        }

        public final boolean isZero() {
            if (this.f21058up == 0 && this.down == 0) {
                return true;
            }
            return false;
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return "IO(up=" + this.f21058up + ", down=" + this.down + LoggerUtil.S_RIGHT_TAG;
        }

        public final C0726IO add(C0726IO c0726io) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c0726io}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (C0726IO) proxy.result;
            }
            C106862S5w.LIZ(c0726io);
            return new C0726IO(this.f21058up + c0726io.f21058up, this.down + c0726io.down);
        }

        public final boolean gte(C0726IO c0726io) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c0726io}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            C106862S5w.LIZ(c0726io);
            if (this.f21058up >= c0726io.f21058up && this.down >= c0726io.down) {
                return true;
            }
            return false;
        }

        public final C0726IO subtract(C0726IO c0726io) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c0726io}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (C0726IO) proxy.result;
            }
            C106862S5w.LIZ(c0726io);
            return new C0726IO(this.f21058up - c0726io.f21058up, this.down - c0726io.down);
        }

        public C0726IO(int i, int i2) {
            this.f21058up = i;
            this.down = i2;
        }
    }

    static {
        Covode.recordClassIndex(3097);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3098);
        }

        public Companion() {
        }

        public final Resource zero() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Resource) proxy.result;
            }
            return new Resource(C0726IO.Companion.zero(), 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Resource ioDown(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (Resource) proxy.result;
            }
            return m20559io(0, i);
        }

        public final Resource ioUp(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Resource) proxy.result;
            }
            return m20559io(i, 0);
        }

        public final Resource cpu(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Resource) proxy.result;
            }
            return new Resource(C0726IO.Companion.zero(), i);
        }

        /* renamed from: io */
        public final Resource m20559io(int i, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Resource) proxy.result;
            }
            return new Resource(new C0726IO(i, i2), 0);
        }
    }

    public final int getCpu() {
        return this.cpu;
    }

    public final C0726IO getIo() {
        return this.f21057io;
    }

    public final boolean isZero() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.f21057io.isZero() || this.cpu != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Resource(io=" + this.f21057io + ", cpu=" + this.cpu + LoggerUtil.S_RIGHT_TAG;
    }

    public final Resource add(Resource resource) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resource}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Resource) proxy.result;
        }
        C106862S5w.LIZ(resource);
        return new Resource(this.f21057io.add(resource.f21057io), this.cpu + resource.cpu);
    }

    public final boolean gte(Resource resource) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resource}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(resource);
        if (this.f21057io.gte(resource.f21057io) && this.cpu >= resource.cpu) {
            return true;
        }
        return false;
    }

    public final Resource subtract(Resource resource) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resource}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Resource) proxy.result;
        }
        C106862S5w.LIZ(resource);
        if (gte(resource)) {
            return new Resource(this.f21057io.subtract(resource.f21057io), this.cpu - resource.cpu);
        }
        LogHelper.INSTANCE.m20554e("TaskResource", "bad operation");
        return Companion.zero();
    }

    public Resource(C0726IO c0726io, int i) {
        C106862S5w.LIZ(c0726io);
        this.f21057io = c0726io;
        this.cpu = i;
    }
}
