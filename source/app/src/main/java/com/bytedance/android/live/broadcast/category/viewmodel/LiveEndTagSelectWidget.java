package com.bytedance.android.live.broadcast.category.viewmodel;

import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2961d;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.C86900KMc;
import p003X.C86903KMf;

/* loaded from: classes5.dex */
public final class LiveEndTagSelectWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final CategoryScene LIZIZ;
    public DialogFragment LIZJ;
    public final Lazy LIZLLL = C77347GeT.LIZ(new LiveEndTagSelectWidget$mCategoryViewModel$2(this));

    /* renamed from: LJ */
    public final Lazy f25797LJ = C77347GeT.LIZ(new LiveEndTagSelectWidget$mLiveTagDataHandler$2(this));

    static {
        Covode.recordClassIndex(15134);
    }

    public final C2970a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final C2961d LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2961d) (proxy.isSupported ? proxy.result : this.f25797LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        LIZ().LJIIIZ().observe(this, new C86900KMc(this));
        LIZ().m15906LJ().observe(this, new C86903KMf(this));
        LIZIZ().LIZ(CategoryScene.VIDEO);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            LIZIZ().LIZIZ();
        }
    }

    public LiveEndTagSelectWidget(CategoryScene categoryScene, DialogFragment dialogFragment) {
        C106862S5w.LIZ(categoryScene);
        this.LIZIZ = categoryScene;
        this.LIZJ = dialogFragment;
    }
}
