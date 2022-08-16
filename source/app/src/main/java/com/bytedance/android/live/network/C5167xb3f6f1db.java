package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC141103deW;

/* renamed from: com.bytedance.android.live.network.MonitorTimeCostRequestConverterFactory$responseBodyConverter$$inlined$filterIsInstance$1 */
/* loaded from: classes22.dex */
public final class C5167xb3f6f1db extends Lambda implements Function1<Object, Boolean> {
    public static final C5167xb3f6f1db INSTANCE = new C5167xb3f6f1db();

    static {
        Covode.recordClassIndex(32607);
    }

    public C5167xb3f6f1db() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof AbstractC141103deW);
    }
}
