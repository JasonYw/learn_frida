package com.bytedance.android.annie.api.bridge;

import android.content.Intent;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;

/* loaded from: classes5.dex */
public abstract class FragmentStateFulProvider<T extends AbstractC13049f<?, ?>> implements HybridFragment.ILifeCycleListener, AbstractC13049f.AbstractC13051b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public T mRealMethod;

    static {
        Covode.recordClassIndex(10452);
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment.ILifeCycleListener
    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract AbstractC13049f<?, ?> provideRealMethod();

    public final T getMRealMethod() {
        return this.mRealMethod;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f.AbstractC13051b
    public AbstractC13049f<?, ?> provideMethod() {
        T t;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC13049f) proxy.result;
        }
        AbstractC13049f<?, ?> provideRealMethod = provideRealMethod();
        if (!(provideRealMethod instanceof AbstractC13049f)) {
            t = null;
        } else {
            t = (T) provideRealMethod;
        }
        this.mRealMethod = t;
        return provideRealMethod;
    }

    public final void setMRealMethod(T t) {
        this.mRealMethod = t;
    }
}
