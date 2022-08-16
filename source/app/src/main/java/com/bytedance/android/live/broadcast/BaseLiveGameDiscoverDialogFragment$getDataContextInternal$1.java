package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.IQV;

/* loaded from: classes3.dex */
public final class BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;

    static {
        Covode.recordClassIndex(14284);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1(Class cls) {
        super(0);
        this.$clazz = cls;
    }

    /* renamed from: com.bytedance.android.live.broadcast.BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1$1 */
    /* loaded from: classes3.dex */
    public static final class C28561 extends Lambda implements Function0<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(14285);
        }

        public C28561() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Object mo30099invoke() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1.this.$clazz.newInstance();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public final AbstractC3004e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC3004e) proxy.result;
        }
        ALogger.m15800e("BaseLiveGameDiscoverViewModel", C0002O.m25086C("get default context for ", this.$clazz.getName()));
        AbstractC3004e abstractC3004e = (AbstractC3004e) IQV.LIZ((Function0) new C28561()).component1();
        Intrinsics.checkNotNullExpressionValue(abstractC3004e, "");
        return abstractC3004e;
    }
}
