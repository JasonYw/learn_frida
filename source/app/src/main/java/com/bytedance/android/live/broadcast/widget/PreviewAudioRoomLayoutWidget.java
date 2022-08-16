package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC81935IRd;
import p003X.IQN;
import p003X.IQO;
import p003X.IQP;
import p003X.K8Q;
import p003X.KK6;

/* loaded from: classes3.dex */
public final class PreviewAudioRoomLayoutWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2863ai LIZIZ;
    public IQP LIZJ;
    public VoiceLiveTheme LIZLLL;

    /* renamed from: LJ */
    public final View f25979LJ;
    public View LJI;
    public Boolean LJIILJJIL;
    public final String LJFF = "PreviewAudioRoomLayoutWidget";
    public final Map<AudioInteractMode, View> LJIIL = new LinkedHashMap();
    public final IQN LJIILIIL = new IQN(this);

    static {
        Covode.recordClassIndex(18428);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698428;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.LJFF;
    }

    public final ViewGroup LIZIZ() {
        View view = this.contentView;
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        return (ViewGroup) view;
    }

    private final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        RoomCreateInfo LIZ2 = LJIIJJI().LIZIZ().LIZ();
        if (LIZ2 == null) {
            return false;
        }
        return KK6.LIZ(LIZ2);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDestroy();
        View view = this.f25979LJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJIILIIL);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC81935IRd LJII;
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        IQN iqn = this.LJIILIIL;
        iqn.LIZIZ = new int[0];
        iqn.onGlobalLayout();
        View view = this.f25979LJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.LJIILIIL);
        }
        ((C3199v) LIZ(C3199v.class).mo27335getValue()).LJJI().LIZ(new PreviewAudioRoomLayoutWidget$onCreate$1(this));
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            LJII = (AbstractC81935IRd) proxy.result;
        } else {
            AbstractC2863ai abstractC2863ai = this.LIZIZ;
            if (abstractC2863ai == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LJII = abstractC2863ai.LJII();
        }
        LJII.LIZ(this, new IQO(this), 2);
    }

    public PreviewAudioRoomLayoutWidget(View view) {
        this.f25979LJ = view;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (liveMode == LiveMode.AUDIO) {
            View view = this.contentView;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.contentView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.broadcast.model.AudioInteractMode r14) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewAudioRoomLayoutWidget.LIZ(com.bytedance.android.live.broadcast.model.AudioInteractMode):void");
    }
}
