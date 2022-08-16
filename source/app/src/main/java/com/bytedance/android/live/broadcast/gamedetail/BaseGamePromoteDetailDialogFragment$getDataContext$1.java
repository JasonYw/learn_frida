package com.bytedance.android.live.broadcast.gamedetail;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88931L2f;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class BaseGamePromoteDetailDialogFragment$getDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ AbstractC88931L2f this$0;

    static {
        Covode.recordClassIndex(16003);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGamePromoteDetailDialogFragment$getDataContext$1(AbstractC88931L2f abstractC88931L2f, Class cls) {
        super(0);
        this.this$0 = abstractC88931L2f;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC88931L2f abstractC88931L2f = this.this$0;
        Class cls = this.$clazz;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, abstractC88931L2f, AbstractC88931L2f.LJII, false, 7);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        BaseGamePromoteDetailDialogFragment$getDataContextInternal$1 baseGamePromoteDetailDialogFragment$getDataContextInternal$1 = new BaseGamePromoteDetailDialogFragment$getDataContextInternal$1(cls);
        if (!AbstractC3095d.class.isAssignableFrom(cls)) {
            ALogger.m15800e("GamePromoteBaseViewModel", "try to getDataContext which is not GamePromoteBaseViewModel");
            return baseGamePromoteDetailDialogFragment$getDataContextInternal$1.mo30099invoke();
        }
        AbstractC3095d LIZIZ = AbstractC3095d.LJIILLIIL.LIZIZ(cls);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        AbstractC3095d abstractC3095d = (AbstractC3095d) IQV.LIZ(abstractC88931L2f, (Function1) null, 2, (Object) null).LIZ(cls);
        abstractC3095d.LIZLLL();
        return abstractC3095d;
    }
}
