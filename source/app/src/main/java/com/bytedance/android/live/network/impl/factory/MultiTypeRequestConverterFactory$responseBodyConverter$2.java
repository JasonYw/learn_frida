package com.bytedance.android.live.network.impl.factory;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedInput;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class MultiTypeRequestConverterFactory$responseBodyConverter$2 extends Lambda implements Function1<TypedInput, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MultiTypeRequestConverterFactory$responseBodyConverter$1 $fallbackToGson$1;

    static {
        Covode.recordClassIndex(32661);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeRequestConverterFactory$responseBodyConverter$2(MultiTypeRequestConverterFactory$responseBodyConverter$1 multiTypeRequestConverterFactory$responseBodyConverter$1) {
        super(1);
        this.$fallbackToGson$1 = multiTypeRequestConverterFactory$responseBodyConverter$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(TypedInput typedInput) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{typedInput}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(typedInput);
        Converter<TypedInput, ?> mo30099invoke = this.$fallbackToGson$1.mo30099invoke();
        if (mo30099invoke != null) {
            return mo30099invoke.convert(typedInput);
        }
        return null;
    }
}
