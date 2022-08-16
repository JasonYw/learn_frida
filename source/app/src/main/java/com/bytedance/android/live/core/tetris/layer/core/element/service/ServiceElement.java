package com.bytedance.android.live.core.tetris.layer.core.element.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public abstract class ServiceElement<T> extends Element<T> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;

    static {
        Covode.recordClassIndex(23680);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final View LIZ(Context context, ViewGroup viewGroup) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, viewGroup}, this, LJIIIIZZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        return null;
    }

    public abstract void LJFF();

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceElement(AbstractC4092b abstractC4092b) {
        super(abstractC4092b);
        C106862S5w.LIZ(abstractC4092b);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIIIZZ, false, 2).isSupported) {
            return;
        }
        LJFF();
    }
}
