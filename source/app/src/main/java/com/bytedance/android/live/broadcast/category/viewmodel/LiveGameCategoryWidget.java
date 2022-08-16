package com.bytedance.android.live.broadcast.category.viewmodel;

import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2959a;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.C86898KMa;
import p003X.KLF;
import p003X.KMZ;

/* loaded from: classes5.dex */
public final class LiveGameCategoryWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final CategoryScene LIZIZ;
    public DialogFragment LIZJ;
    public final Lazy LIZLLL = C77347GeT.LIZ(new LiveGameCategoryWidget$mCategoryViewModel$2(this));

    /* renamed from: LJ */
    public final Lazy f25798LJ = C77347GeT.LIZ(new LiveGameCategoryWidget$mGameCategoryDataHandler$2(this));

    static {
        Covode.recordClassIndex(15141);
    }

    public final C2970a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final C2959a LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2959a) (proxy.isSupported ? proxy.result : this.f25798LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a221";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
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
        LIZ().LJFF().observe(this, new KLF(this));
        LIZ().m15906LJ().observe(this, new KMZ(this));
        LIZ().LJIILL().observe(this, new C86898KMa(this));
        LIZIZ().LIZ(CategoryScene.GAME);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            LIZIZ().LIZIZ();
        }
    }

    public LiveGameCategoryWidget(CategoryScene categoryScene, DialogFragment dialogFragment) {
        C106862S5w.LIZ(categoryScene);
        this.LIZIZ = categoryScene;
        this.LIZJ = dialogFragment;
    }
}
