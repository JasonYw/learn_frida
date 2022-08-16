package com.bytedance.android.live.broadcast.category.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public final class PreviewLiveInfoGameCategoryWidget extends PreviewGameCategoryWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;

    static {
        Covode.recordClassIndex(15184);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLiveInfoGameCategoryWidget";
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698456;
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget, com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget, com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        if (LJIILIIL() != 0) {
            LJIILJJIL();
        }
    }
}
