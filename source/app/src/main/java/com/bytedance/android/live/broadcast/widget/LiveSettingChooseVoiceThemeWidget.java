package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C414192aL;
import p003X.IS5;

/* loaded from: classes3.dex */
public final class LiveSettingChooseVoiceThemeWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AudioInteractMode LIZIZ = AudioInteractMode.Chat;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new LiveSettingChooseVoiceThemeWidget$eventViewModel$2(this));
    public final Function0<Unit> LIZLLL;

    /* renamed from: LJ */
    public View f25973LJ;

    static {
        Covode.recordClassIndex(18354);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699853;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public LiveSettingChooseVoiceThemeWidget(Function0<Unit> function0) {
        C106862S5w.LIZ(function0);
        this.LIZLLL = function0;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f25973LJ = findViewById(2131188324);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        View view = this.f25973LJ;
        if (view != null) {
            view.setOnClickListener(C414192aL.LIZ(0L, new LiveSettingChooseVoiceThemeWidget$onLoad$1(this), 1, null));
        }
        IS5.LIZIZ.LIZ(this.LIZIZ);
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }
}
