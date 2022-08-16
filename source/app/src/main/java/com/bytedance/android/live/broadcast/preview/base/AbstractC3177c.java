package com.bytedance.android.live.broadcast.preview.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C77580GiE;
import p003X.C81289I2h;
import p003X.HNU;
import p003X.IQX;

/* renamed from: com.bytedance.android.live.broadcast.preview.base.c */
/* loaded from: classes3.dex */
public abstract class AbstractC3177c extends C13491f {
    public static ChangeQuickRedirect LJIIIIZZ;
    public static final /* synthetic */ KProperty[] LJIIIZ;
    public static final C77580GiE LJIIJ = new C77580GiE((byte) 0);
    public final C81289I2h LIZ = HNU.LIZ(this, new CompositeDisposable(), PreviewDataContext$compositeDisposable$2.INSTANCE);

    static {
        Covode.recordClassIndex(17230);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbstractC3177c.class, "compositeDisposable", "getCompositeDisposable()Lcom/bytedance/live/datacontext/IConstantNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        LJIIIZ = new KProperty[]{propertyReference1Impl};
    }

    public final AbstractC413402Xu<CompositeDisposable> LJJLIIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 1);
        return (AbstractC413402Xu) (proxy.isSupported ? proxy.result : this.LIZ.LIZ(this, LJIIIZ[0]));
    }

    public final void LJJLIIIJILLIZJL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        IQX.LIZ(this, getClass());
        IQX.LIZ(this, LJIIJ.LIZ(getClass()));
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LJIIIIZZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return LJJLIIIJ().LIZIZ().add(disposable);
    }
}
