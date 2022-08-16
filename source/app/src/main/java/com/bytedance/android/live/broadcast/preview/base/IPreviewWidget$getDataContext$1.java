package com.bytedance.android.live.broadcast.preview.base;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86893KLv;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class IPreviewWidget$getDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ AbstractC3175a this$0;

    static {
        Covode.recordClassIndex(17222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPreviewWidget$getDataContext$1(AbstractC3175a abstractC3175a, Class cls) {
        super(0);
        this.this$0 = abstractC3175a;
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        AbstractC3177c abstractC3177c;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC3175a abstractC3175a = this.this$0;
        Class cls = this.$clazz;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC3175a, cls}, null, C86893KLv.LIZ, true, 5);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        IPreviewWidget$getDataContextInternal$1 iPreviewWidget$getDataContextInternal$1 = new IPreviewWidget$getDataContextInternal$1(abstractC3175a, cls);
        if (!AbstractC3177c.class.isAssignableFrom(cls)) {
            ALogger.m15800e(abstractC3175a.LIZ(), "try to getDataContext which is not PreviewDataContext");
        } else {
            AbstractC3177c LIZIZ = AbstractC3177c.LJIIJ.LIZIZ(cls);
            if (LIZIZ != null) {
                return LIZIZ;
            }
            Context LJIILLIIL = abstractC3175a.LJIILLIIL();
            if (LJIILLIIL != null && (LJIILLIIL instanceof FragmentActivity) && (abstractC3177c = (AbstractC3177c) PatchProxy.proxy(new Object[]{(FragmentActivity) LJIILLIIL, null, 2, null}, null, IQV.LIZ, true, 6).LIZ(cls)) != null) {
                abstractC3177c.LJJLIIIJILLIZJL();
                return abstractC3177c;
            }
        }
        return iPreviewWidget$getDataContextInternal$1.mo30099invoke();
    }
}
