package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC77582GiG;
import p003X.C106862S5w;
import p003X.C77335GeH;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class BaseLiveGameDiscoverDialogFragment$getDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ AbstractC77582GiG this$0;

    static {
        Covode.recordClassIndex(14283);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLiveGameDiscoverDialogFragment$getDataContext$1(AbstractC77582GiG abstractC77582GiG, Class cls) {
        super(0);
        this.this$0 = abstractC77582GiG;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        Object LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC77582GiG abstractC77582GiG = this.this$0;
        Class cls = this.$clazz;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, abstractC77582GiG, AbstractC77582GiG.LIZ, false, 3);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1 baseLiveGameDiscoverDialogFragment$getDataContextInternal$1 = new BaseLiveGameDiscoverDialogFragment$getDataContextInternal$1(cls);
        if (!AbstractC3004e.class.isAssignableFrom(cls)) {
            ALogger.m15800e("BaseLiveGameDiscoverViewModel", "try to getDataContext which is not BaseLiveGameViewModel");
            return baseLiveGameDiscoverDialogFragment$getDataContextInternal$1.mo30099invoke();
        }
        C77335GeH c77335GeH = AbstractC3004e.LIZJ;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{cls}, c77335GeH, C77335GeH.LIZ, false, 2);
        if (proxy3.isSupported) {
            LIZ = proxy3.result;
        } else {
            C106862S5w.LIZ(cls);
            LIZ = IQV.LIZ((Object) c77335GeH.LIZ(cls), (Class<Object>) cls);
            if (LIZ == null) {
                LIZ = IQV.LIZ((Object) cls, (Class<Object>) cls);
            }
            return LIZ;
        }
        if (LIZ == null) {
            C13491f LIZ2 = IQV.LIZ(abstractC77582GiG, (Function1) null, 2, (Object) null).LIZ(cls);
            if (!PatchProxy.proxy(new Object[0], LIZ2, AbstractC3004e.LIZ, false, 3).isSupported) {
                IQX.LIZ(LIZ2, LIZ2.getClass());
                IQX.LIZ(LIZ2, AbstractC3004e.LIZJ.LIZ(LIZ2.getClass()));
            }
            return LIZ2;
        }
        return LIZ;
    }
}
