package com.bytedance.android.live.network.impl.factory;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C102259QOv;

/* loaded from: classes8.dex */
public final class MultiTypeRequestConverterFactory$responseBodyConverter$1 extends Lambda implements Function0<Converter<TypedInput, ?>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Annotation[] $annotations;
    public final /* synthetic */ Retrofit $retrofit;
    public final /* synthetic */ Type $type;
    public final /* synthetic */ C102259QOv this$0;

    static {
        Covode.recordClassIndex(32660);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeRequestConverterFactory$responseBodyConverter$1(C102259QOv c102259QOv, Type type, Annotation[] annotationArr, Retrofit retrofit) {
        super(0);
        this.this$0 = c102259QOv;
        this.$type = type;
        this.$annotations = annotationArr;
        this.$retrofit = retrofit;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public final Converter<TypedInput, ?> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Converter) proxy.result;
        }
        return this.this$0.LIZIZ.responseBodyConverter(this.$type, this.$annotations, this.$retrofit);
    }
}
