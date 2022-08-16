package com.bytedance.android.live.network.impl.factory;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes2.dex */
public final class MultiTypeRequestConverterFactory$handleCustomResponse$4 extends Lambda implements Function1<ParameterizedType, Class<?>> {
    public static final MultiTypeRequestConverterFactory$handleCustomResponse$4 INSTANCE = new MultiTypeRequestConverterFactory$handleCustomResponse$4();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32656);
    }

    public MultiTypeRequestConverterFactory$handleCustomResponse$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final Class<?> invoke(ParameterizedType parameterizedType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parameterizedType}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Class) proxy.result;
        }
        C106862S5w.LIZ(parameterizedType);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        Object singleOrNull = ArraysKt___ArraysKt.singleOrNull(actualTypeArguments);
        if (!(singleOrNull instanceof Class)) {
            singleOrNull = null;
        }
        Class<?> cls = (Class) singleOrNull;
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException(("First type argument of type [" + parameterizedType + "] must be class.").toString());
    }
}
