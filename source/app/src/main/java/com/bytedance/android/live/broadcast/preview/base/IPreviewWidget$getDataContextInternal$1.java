package com.bytedance.android.live.broadcast.preview.base;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class IPreviewWidget$getDataContextInternal$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ AbstractC3175a this$0;

    static {
        Covode.recordClassIndex(17223);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPreviewWidget$getDataContextInternal$1(AbstractC3175a abstractC3175a, Class cls) {
        super(0);
        this.this$0 = abstractC3175a;
        this.$clazz = cls;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.base.IPreviewWidget$getDataContextInternal$1$1 */
    /* loaded from: classes5.dex */
    public static final class C31731 extends Lambda implements Function0<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(17224);
        }

        public C31731() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Object mo30099invoke() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return IPreviewWidget$getDataContextInternal$1.this.$clazz.newInstance();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public final AbstractC3177c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC3177c) proxy.result;
        }
        ALogger.m15800e(this.this$0.LIZ(), C0002O.m25086C("get default context for ", this.$clazz.getName()));
        Pair LIZ = IQV.LIZ((Function0) new C31731());
        AbstractC3177c abstractC3177c = (AbstractC3177c) LIZ.component1();
        LIZ.component2();
        Intrinsics.checkNotNullExpressionValue(abstractC3177c, "");
        return abstractC3177c;
    }
}
