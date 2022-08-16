package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C86870KKy;
import p003X.KL2;

/* loaded from: classes5.dex */
public final class PreviewAudioInteractModeChooserWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final KL2 LIZLLL = new KL2((byte) 0);
    public static final Map<AudioInteractMode, C3286b> LIZJ = MapsKt__MapsKt.mapOf(TuplesKt.m137to(AudioInteractMode.Radio, new C3286b(2131582146, 2130856086, 2130856087)), TuplesKt.m137to(AudioInteractMode.Chat, new C3286b(2131582144, 2130856078, 2130856080)), TuplesKt.m137to(AudioInteractMode.KTV, new C3286b(2131582145, 2130856083, 2130856084)));

    /* renamed from: LJ */
    public final String f25978LJ = "PreviewAudioInteractModeChooserWidget";
    public C86870KKy LIZIZ = new C86870KKy(false, false, 3);

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698426;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.f25978LJ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        ((C3199v) LIZ(C3199v.class).mo27335getValue()).LJJI().LIZ(new PreviewAudioInteractModeChooserWidget$onCreate$1(this));
        LJIIJJI().LIZ(new PreviewAudioInteractModeChooserWidget$onCreate$2(this));
    }

    static {
        Covode.recordClassIndex(18414);
    }

    public final void LIZ(C86870KKy c86870KKy) {
        if (PatchProxy.proxy(new Object[]{c86870KKy}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = c86870KKy;
        if (c86870KKy.LIZIZ && c86870KKy.LIZJ) {
            LJIILJJIL();
        } else {
            LJIILL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C86870KKy c86870KKy = this.LIZIZ;
        if (liveMode != LiveMode.AUDIO) {
            z = false;
        }
        LIZ(C86870KKy.LIZ(c86870KKy, z, false, 2, null));
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewAudioInteractModeChooserWidget$b */
    /* loaded from: classes5.dex */
    public static final class C3286b {
        public static ChangeQuickRedirect LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;

        static {
            Covode.recordClassIndex(18416);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3286b) {
                return C106862S5w.LIZ(((C3286b) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PreviewAudioInteractModeChooserWidget$Tab:%s,%s,%s", LIZ());
        }

        public C3286b(int i, int i2, int i3) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = i3;
        }
    }
}
