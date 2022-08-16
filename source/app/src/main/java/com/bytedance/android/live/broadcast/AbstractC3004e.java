package com.bytedance.android.live.broadcast;

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
import p003X.AbstractC412992Wf;
import p003X.C106862S5w;
import p003X.C77335GeH;
import p003X.C81289I2h;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.broadcast.e */
/* loaded from: classes3.dex */
public abstract class AbstractC3004e extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C77335GeH LIZJ = new C77335GeH((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, new CompositeDisposable(), BaseLiveGameDiscoverViewModel$compositeDisposable$2.INSTANCE);

    static {
        Covode.recordClassIndex(15677);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbstractC3004e.class, "compositeDisposable", "getCompositeDisposable()Lcom/bytedance/live/datacontext/IConstantNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final boolean LIZ(Disposable disposable) {
        Object LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy2.isSupported) {
            LIZ2 = proxy2.result;
        } else {
            LIZ2 = this.LIZLLL.LIZ(this, LIZIZ[0]);
        }
        return ((CompositeDisposable) ((AbstractC412992Wf) LIZ2).LIZIZ()).add(disposable);
    }
}
