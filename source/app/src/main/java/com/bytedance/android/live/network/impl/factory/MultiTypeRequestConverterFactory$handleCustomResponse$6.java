package com.bytedance.android.live.network.impl.factory;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes22.dex */
public final class MultiTypeRequestConverterFactory$handleCustomResponse$6 extends Lambda implements Function0<Collection<Object>> {
    public static final MultiTypeRequestConverterFactory$handleCustomResponse$6 INSTANCE = new MultiTypeRequestConverterFactory$handleCustomResponse$6();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32657);
    }

    public MultiTypeRequestConverterFactory$handleCustomResponse$6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection<java.lang.Object>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Collection<Object> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return TypeIntrinsics.asMutableCollection(new ArrayList());
    }
}
