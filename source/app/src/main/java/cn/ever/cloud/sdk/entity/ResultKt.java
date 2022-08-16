package cn.ever.cloud.sdk.entity;

import cn.ever.cloud.sdk.entity.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ResultKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3413);
    }

    public static final Object createFailure(Throwable th) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{th}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(th);
        return new Result.Failure(th);
    }

    public static final <T> T getOrThrow(Result<T> result) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(result);
        throwOnFailure(result);
        return (T) result.getValue();
    }

    public static final void throwOnFailure(Result<?> result) {
        if (PatchProxy.proxy(new Object[]{result}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(result);
        if (!(result.getValue() instanceof Result.Failure)) {
            return;
        }
        throw ((Result.Failure) result.getValue()).exception;
    }

    public static final <R> Result<R> runCatching(Function0<? extends R> function0) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function0}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(function0);
        try {
            return Result.Companion.success(function0.mo30099invoke());
        } catch (Throwable th) {
            return Result.Companion.failure(th);
        }
    }

    public static final <R, T extends R> R getOrDefault(Result<T> result, R r) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, r}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (R) proxy.result;
        }
        C106862S5w.LIZ(result);
        if (result.isFailure()) {
            return r;
        }
        return (R) result.getValue();
    }

    public static final <R, T extends R> R getOrElse(Result<T> result, Function1<? super Throwable, ? extends R> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (R) proxy.result;
        }
        C106862S5w.LIZ(result, function1);
        Throwable exceptionOrNull = result.exceptionOrNull();
        if (exceptionOrNull == null) {
            return (R) result.getValue();
        }
        return function1.invoke(exceptionOrNull);
    }

    public static final <R, T> Result<R> map(Result<T> result, Function1<? super T, ? extends R> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(result, function1);
        if (result.isSuccess()) {
            return Result.Companion.success(function1.invoke((Object) result.getValue()));
        }
        return new Result<>(result.getValue());
    }

    public static final <T> Result<T> onFailure(Result<T> result, Function1<? super Throwable, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(result, function1);
        Throwable exceptionOrNull = result.exceptionOrNull();
        if (exceptionOrNull != null) {
            function1.invoke(exceptionOrNull);
        }
        return result;
    }

    public static final <T> Result<T> onSuccess(Result<T> result, Function1<? super T, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(result, function1);
        if (result.isSuccess()) {
            function1.invoke((Object) result.getValue());
        }
        return result;
    }

    public static final <T, R> Result<R> runCatching(T t, Function1<? super T, ? extends R> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, function1}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(function1);
        try {
            return Result.Companion.success(function1.invoke(t));
        } catch (Throwable th) {
            return Result.Companion.failure(th);
        }
    }

    public static final <R, T> Result<R> mapCatching(Result<T> result, Function1<? super T, ? extends R> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(result, function1);
        if (result.isSuccess()) {
            try {
                return Result.Companion.success(function1.invoke((Object) result.getValue()));
            } catch (Throwable th) {
                return Result.Companion.failure(th);
            }
        }
        return new Result<>(result.getValue());
    }

    public static final <R, T> R fold(Result<T> result, Function1<? super T, ? extends R> function1, Function1<? super Throwable, ? extends R> function12) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{result, function1, function12}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (R) proxy.result;
        }
        C106862S5w.LIZ(result, function1, function12);
        Throwable exceptionOrNull = result.exceptionOrNull();
        if (exceptionOrNull == null) {
            return function1.invoke((Object) result.getValue());
        }
        return function12.invoke(exceptionOrNull);
    }
}
