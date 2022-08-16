package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC521576j9;
import p003X.AbstractC521596jB;
import p003X.AbstractC521616jD;
import p003X.AbstractC521636jF;
import p003X.AbstractC521646jG;
import p003X.AbstractC521656jH;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DependConfig {
    public final AbstractC521596jB authDelegate;
    public final AbstractC521616jD eventDelegate;
    public final AbstractC521576j9 extDelegate;
    public final AbstractC521636jF loggerDelegate;
    public final AbstractC521646jG networkDelegate;
    public final AbstractC521656jH osRuntimeDelegate;

    static {
        Covode.recordClassIndex(3284);
    }

    public final AbstractC521596jB getAuthDelegate() {
        return this.authDelegate;
    }

    public final AbstractC521616jD getEventDelegate() {
        return this.eventDelegate;
    }

    public final AbstractC521576j9 getExtDelegate() {
        return this.extDelegate;
    }

    public final AbstractC521636jF getLoggerDelegate() {
        return this.loggerDelegate;
    }

    public final AbstractC521646jG getNetworkDelegate() {
        return this.networkDelegate;
    }

    public final AbstractC521656jH getOsRuntimeDelegate() {
        return this.osRuntimeDelegate;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public AbstractC521596jB authDelegate;
        public AbstractC521616jD eventDelegate;
        public AbstractC521576j9 extDelegate;
        public AbstractC521636jF loggerDelegate;
        public AbstractC521646jG networkDelegate;
        public AbstractC521656jH osRuntimeDelegate;

        static {
            Covode.recordClassIndex(3285);
        }

        @Deprecated(message = "not implement")
        public final Builder networkDelegate(AbstractC521646jG abstractC521646jG) {
            C106862S5w.LIZ(abstractC521646jG);
            return this;
        }

        public final DependConfig build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (DependConfig) proxy.result;
            }
            AbstractC521596jB abstractC521596jB = this.authDelegate;
            Intrinsics.checkNotNull(abstractC521596jB);
            return new DependConfig(abstractC521596jB, this.networkDelegate, this.osRuntimeDelegate, this.eventDelegate, this.loggerDelegate, this.extDelegate, null);
        }

        @Deprecated(message = "not use")
        public final Builder osRuntimeDelegate(AbstractC521656jH abstractC521656jH) {
            C106862S5w.LIZ(abstractC521656jH);
            this.osRuntimeDelegate = abstractC521656jH;
            return this;
        }

        public final Builder authDelegate(AbstractC521596jB abstractC521596jB) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC521596jB}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(abstractC521596jB);
            this.authDelegate = abstractC521596jB;
            return this;
        }

        public final Builder eventDelegate(AbstractC521616jD abstractC521616jD) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC521616jD}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(abstractC521616jD);
            this.eventDelegate = abstractC521616jD;
            return this;
        }

        public final Builder extDelegate(AbstractC521576j9 abstractC521576j9) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC521576j9}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(abstractC521576j9);
            this.extDelegate = abstractC521576j9;
            return this;
        }

        public final Builder loggerDelegate(AbstractC521636jF abstractC521636jF) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC521636jF}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(abstractC521636jF);
            this.loggerDelegate = abstractC521636jF;
            return this;
        }
    }

    public DependConfig(AbstractC521596jB abstractC521596jB, AbstractC521646jG abstractC521646jG, AbstractC521656jH abstractC521656jH, AbstractC521616jD abstractC521616jD, AbstractC521636jF abstractC521636jF, AbstractC521576j9 abstractC521576j9) {
        this.authDelegate = abstractC521596jB;
        this.networkDelegate = abstractC521646jG;
        this.osRuntimeDelegate = abstractC521656jH;
        this.eventDelegate = abstractC521616jD;
        this.loggerDelegate = abstractC521636jF;
        this.extDelegate = abstractC521576j9;
    }

    public /* synthetic */ DependConfig(AbstractC521596jB abstractC521596jB, AbstractC521646jG abstractC521646jG, AbstractC521656jH abstractC521656jH, AbstractC521616jD abstractC521616jD, AbstractC521636jF abstractC521636jF, AbstractC521576j9 abstractC521576j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC521596jB, abstractC521646jG, abstractC521656jH, abstractC521616jD, abstractC521636jF, abstractC521576j9);
    }
}
