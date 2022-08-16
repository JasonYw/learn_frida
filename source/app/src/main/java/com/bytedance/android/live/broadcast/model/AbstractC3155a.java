package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.broadcast.preview.C3180k;
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
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C81289I2h;
import p003X.C81909IQd;

/* renamed from: com.bytedance.android.live.broadcast.model.a */
/* loaded from: classes12.dex */
public abstract class AbstractC3155a extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, PreInitState.DISABLE, null, 2, null);

    static {
        Covode.recordClassIndex(16987);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbstractC3155a.class, "preInitContextState", "getPreInitContextState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C2WC<PreInitState> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public abstract void LIZ(C3180k c3180k);

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return this.LIZJ.add(disposable);
    }
}
