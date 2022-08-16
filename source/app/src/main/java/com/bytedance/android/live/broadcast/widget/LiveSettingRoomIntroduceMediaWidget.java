package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.live.broadcast.widget.LiveSettingRoomIntroduceMediaWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C87308Kak;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class LiveSettingRoomIntroduceMediaWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public final Function0<Unit> LJI;
    public View LJII;
    public TextView LJIIIIZZ;

    static {
        Covode.recordClassIndex(18357);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "LiveSettingRoomIntroduceWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699862;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 2).isSupported) {
            return;
        }
        super.onResume();
        C87308Kak<String> c87308Kak = AbstractC80293Hkt.f7147dP;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        if (!TextUtils.isEmpty(c87308Kak.LIZ())) {
            TextView textView = this.LJIIIIZZ;
            if (textView != null) {
                textView.setText(LK5.LIZ(2131583304));
                return;
            }
            return;
        }
        TextView textView2 = this.LJIIIIZZ;
        if (textView2 != null) {
            textView2.setText(LK5.LIZ(2131583303));
        }
    }

    public LiveSettingRoomIntroduceMediaWidget(Function0<Unit> function0) {
        C106862S5w.LIZ(function0);
        this.LJI = function0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 1).isSupported) {
            return;
        }
        this.LJII = findViewById(2131188302);
        findViewById(2131188295);
        this.LJIIIIZZ = (TextView) findViewById(2131188297);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 4).isSupported) {
            return;
        }
        View view = this.LJII;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: X.39L
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18358);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveSettingRoomIntroduceMediaWidget liveSettingRoomIntroduceMediaWidget = LiveSettingRoomIntroduceMediaWidget.this;
                    if (!PatchProxy.proxy(new Object[0], liveSettingRoomIntroduceMediaWidget, LiveSettingRoomIntroduceMediaWidget.LJFF, false, 3).isSupported) {
                        liveSettingRoomIntroduceMediaWidget.LJI.mo30099invoke();
                        if (liveSettingRoomIntroduceMediaWidget.context instanceof FragmentActivity) {
                            LiveMode LIZ2 = liveSettingRoomIntroduceMediaWidget.LIZIZ().LIZ().LIZ();
                            IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
                            Context context = liveSettingRoomIntroduceMediaWidget.context;
                            if (context != null) {
                                iBroadcastService.openRoomIntroMediaDialog((FragmentActivity) context, null, LIZ2);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
            });
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }
}
