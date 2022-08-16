package com.bytedance.android.annie.protobuf;

import com.bytedance.android.annie.protobuf.C2624e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC102244QOg;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$mergedConfigs$options$1 extends Lambda implements Function1<Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2624e.C2625b $config;

    static {
        Covode.recordClassIndex(10929);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$mergedConfigs$options$1(C2624e.C2625b c2625b) {
        super(1);
        this.$config = c2625b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>> entry) {
        boolean containsKey;
        Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>> entry2 = entry;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            containsKey = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(entry2);
            containsKey = this.$config.LIZ.containsKey(entry2.getKey());
        }
        return Boolean.valueOf(containsKey);
    }
}
