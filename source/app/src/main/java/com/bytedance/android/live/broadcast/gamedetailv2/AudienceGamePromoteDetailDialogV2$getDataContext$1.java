package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.android.live.broadcast.gamedetail.AbstractC3095d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89053L6x;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDetailDialogV2$getDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ C89053L6x this$0;

    static {
        Covode.recordClassIndex(16563);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGamePromoteDetailDialogV2$getDataContext$1(C89053L6x c89053L6x, Class cls) {
        super(0);
        this.this$0 = c89053L6x;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C89053L6x c89053L6x = this.this$0;
        Class cls = this.$clazz;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, c89053L6x, C89053L6x.LIZ, false, 16);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        AudienceGamePromoteDetailDialogV2$getDataContextInternal$1 audienceGamePromoteDetailDialogV2$getDataContextInternal$1 = new AudienceGamePromoteDetailDialogV2$getDataContextInternal$1(cls);
        if (!AbstractC3095d.class.isAssignableFrom(cls)) {
            ALogger.m15800e("GamePromoteBaseViewModel", "try to getDataContext which is not GamePromoteBaseViewModel");
            return audienceGamePromoteDetailDialogV2$getDataContextInternal$1.mo30099invoke();
        }
        AbstractC3095d LIZIZ = AbstractC3095d.LJIILLIIL.LIZIZ(cls);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        AbstractC3095d abstractC3095d = (AbstractC3095d) IQV.LIZ(c89053L6x, (Function1) null, 2, (Object) null).LIZ(cls);
        abstractC3095d.LIZLLL();
        return abstractC3095d;
    }
}
