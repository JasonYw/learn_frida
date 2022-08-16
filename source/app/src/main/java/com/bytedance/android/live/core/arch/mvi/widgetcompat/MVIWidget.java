package com.bytedance.android.live.core.arch.mvi.widgetcompat;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.arch.mvi.AbstractC4064e;
import com.bytedance.android.live.core.arch.mvi.AbstractC4065f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import p003X.AbstractC134953c3A;
import p003X.AbstractC4569445g;

/* loaded from: classes17.dex */
public abstract class MVIWidget<STATE extends AbstractC4065f, INTENT extends AbstractC4064e, M extends AbstractC134953c3A<INTENT, STATE>> extends MVIDataWidget<STATE, INTENT, M, C13491f> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(23300);
    }

    @Override // com.bytedance.android.live.core.arch.mvi.widgetcompat.MVIDataWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.core.arch.mvi.widgetcompat.MVIDataWidget, androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(Object obj) {
        onChanged((AbstractC4065f) obj);
    }

    @Override // com.bytedance.android.live.core.arch.mvi.widgetcompat.MVIDataWidget
    public final void LIZIZ(STATE state) {
        if (PatchProxy.proxy(new Object[]{state}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        super.onChanged(state);
    }
}
