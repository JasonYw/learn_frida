package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Result<T> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Object value;

    static {
        Covode.recordClassIndex(3438);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3439);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Result<T> success(T t) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Result) proxy.result;
            }
            return new Result<>(t);
        }

        public final <T> Result<T> failure(Throwable th) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Result) proxy.result;
            }
            C106862S5w.LIZ(th);
            return new Result<>(ResultKt.createFailure(th));
        }
    }

    public final Object getValue() {
        return this.value;
    }

    public final boolean isFailure() {
        return this.value instanceof Failure;
    }

    public final Throwable exceptionOrNull() {
        Object obj = this.value;
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public final boolean isSuccess() {
        if (!(this.value instanceof Failure)) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static final class Failure {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final Throwable exception;

        static {
            Covode.recordClassIndex(3440);
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            return this.exception.hashCode();
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return "Failure(" + this.exception + LoggerUtil.S_RIGHT_TAG;
        }

        public Failure(Throwable th) {
            C106862S5w.LIZ(th);
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if ((obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception)) {
                return true;
            }
            return false;
        }
    }

    public final T getOrNull() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        if (isFailure()) {
            return null;
        }
        return (T) this.value;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Object obj = this.value;
        if (obj instanceof Failure) {
            return obj.toString();
        }
        return "Success(" + this.value + LoggerUtil.S_RIGHT_TAG;
    }

    public Result(Object obj) {
        this.value = obj;
    }
}
