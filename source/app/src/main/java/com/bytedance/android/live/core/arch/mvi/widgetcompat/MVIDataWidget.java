package com.bytedance.android.live.core.arch.mvi.widgetcompat;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.arch.mvi.AbstractC4064e;
import com.bytedance.android.live.core.arch.mvi.AbstractC4065f;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import p003X.AbstractC134953c3A;
import p003X.AbstractC134954c3B;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C134955c3C;
import p003X.C134958c3F;
import p003X.C134969c3Q;

/* loaded from: classes17.dex */
public abstract class MVIDataWidget<STATE extends AbstractC4065f, INTENT extends AbstractC4064e, M extends AbstractC134953c3A<INTENT, STATE>, DATA extends C13491f> extends LiveRecyclableWidget implements AbstractC134954c3B<STATE, INTENT, M>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public M LIZIZ;

    static {
        Covode.recordClassIndex(23298);
    }

    public DATA LIZIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
        M m;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (m = this.LIZIZ) != null) {
            m.LIZIZ();
        }
    }

    public final void LIZ(INTENT intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(intent);
        M m = this.LIZIZ;
        if (m != null) {
            m.LIZ(intent);
        }
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZIZ */
    public void onChanged(STATE state) {
        if (!PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{this, state}, null, C134969c3Q.LIZ, true, 2).isSupported) {
            LIZ((MVIDataWidget<STATE, INTENT, M, DATA>) state);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        M m;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ = LIZ();
        M m2 = this.LIZIZ;
        if (m2 != null) {
            C134955c3C<STATE> LIZJ = m2.LIZJ();
            if (!PatchProxy.proxy(new Object[]{LIZJ}, this, LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(LIZJ);
                if (!PatchProxy.proxy(new Object[]{this, LIZJ}, null, C134969c3Q.LIZ, true, 1).isSupported) {
                    C106862S5w.LIZ(LIZJ);
                    LIZJ.observe(this, this);
                }
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (m = this.LIZIZ) != null) {
                m.LIZ(new C134958c3F(this));
            }
            m2.LIZ();
        }
    }
}
