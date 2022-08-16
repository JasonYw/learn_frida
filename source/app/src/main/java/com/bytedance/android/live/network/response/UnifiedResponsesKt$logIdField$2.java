package com.bytedance.android.live.network.response;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class UnifiedResponsesKt$logIdField$2 extends Lambda implements Function0<Field> {
    public static final UnifiedResponsesKt$logIdField$2 INSTANCE = new UnifiedResponsesKt$logIdField$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32726);
    }

    public UnifiedResponsesKt$logIdField$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.reflect.Field] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Field mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Field declaredField = ExtraResponse.class.getDeclaredField("logId");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
