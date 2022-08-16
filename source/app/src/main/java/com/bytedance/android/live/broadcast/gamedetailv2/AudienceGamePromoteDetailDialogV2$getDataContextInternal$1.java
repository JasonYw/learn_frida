package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.android.live.broadcast.gamedetail.AbstractC3095d;
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

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDetailDialogV2$getDataContextInternal$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;

    static {
        Covode.recordClassIndex(16564);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGamePromoteDetailDialogV2$getDataContextInternal$1(Class cls) {
        super(0);
        this.$clazz = cls;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.AudienceGamePromoteDetailDialogV2$getDataContextInternal$1$1 */
    /* loaded from: classes5.dex */
    public static final class C31141 extends Lambda implements Function0<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16565);
        }

        public C31141() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Object mo30099invoke() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return AudienceGamePromoteDetailDialogV2$getDataContextInternal$1.this.$clazz.newInstance();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public final AbstractC3095d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC3095d) proxy.result;
        }
        ALogger.m15800e("GamePromoteBaseViewModel", C0002O.m25086C("get default context for ", this.$clazz.getName()));
        AbstractC3095d abstractC3095d = (AbstractC3095d) IQV.LIZ((Function0) new C31141()).component1();
        Intrinsics.checkNotNullExpressionValue(abstractC3095d, "");
        return abstractC3095d;
    }
}
