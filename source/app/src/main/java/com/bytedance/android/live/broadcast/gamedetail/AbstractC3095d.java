package com.bytedance.android.live.broadcast.gamedetail;

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
import p003X.C77581GiF;
import p003X.C81289I2h;
import p003X.HNU;
import p003X.IQX;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.d */
/* loaded from: classes3.dex */
public abstract class AbstractC3095d extends C13491f {
    public static ChangeQuickRedirect LJIILJJIL;
    public static final /* synthetic */ KProperty[] LJIILL;
    public static final C77581GiF LJIILLIIL = new C77581GiF((byte) 0);
    public final C81289I2h LIZ = HNU.LIZ(this, new CompositeDisposable(), BaseGamePromoteDetailViewModel$compositeDisposable$2.INSTANCE);

    static {
        Covode.recordClassIndex(16459);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbstractC3095d.class, "compositeDisposable", "getCompositeDisposable()Lcom/bytedance/live/datacontext/IConstantNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        LJIILL = new KProperty[]{propertyReference1Impl};
    }

    public final AbstractC413402Xu<CompositeDisposable> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILJJIL, false, 1);
        return (AbstractC413402Xu) (proxy.isSupported ? proxy.result : this.LIZ.LIZ(this, LJIILL[0]));
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LJIILJJIL, false, 3).isSupported) {
            return;
        }
        IQX.LIZ(this, getClass());
        IQX.LIZ(this, LJIILLIIL.LIZ(getClass()));
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LJIILJJIL, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return LIZJ().LIZIZ().add(disposable);
    }
}
