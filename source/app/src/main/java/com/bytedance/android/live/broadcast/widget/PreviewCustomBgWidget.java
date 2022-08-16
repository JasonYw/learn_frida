package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.api.VoiceLiveThemeApi;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.room.IEntranceContext;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC414762bG;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.AbstractC81969ISl;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C2WC;
import p003X.C425332sJ;
import p003X.C77023GYf;
import p003X.C77347GeT;
import p003X.C81957IRz;
import p003X.C87308Kak;
import p003X.IS5;
import p003X.IS6;
import p003X.IS7;
import p003X.IS9;
import p003X.K8Q;

@AbstractC445813kF(LIZ = "AUDIO_THEME")
/* loaded from: classes3.dex */
public final class PreviewCustomBgWidget extends AbsPreviewWidget implements IEntranceContext, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public View LIZJ;
    public AbstractC81939IRh LIZLLL;

    /* renamed from: LJ */
    public AbstractC81969ISl f25984LJ;
    public AbstractC81935IRd LJFF;
    public Fragment LJI;
    public HSImageView LJIIL;
    public AbstractC2863ai LJIILJJIL;
    public final Lazy LJIILL = C77347GeT.LIZ(new PreviewCustomBgWidget$eventViewModel$2(this));
    public final Lazy LJIILLIIL = C77347GeT.LIZ(new PreviewCustomBgWidget$startLiveViewModel$2(this));
    public final Observer<ArrayList<VoiceLiveTheme>> LJIILIIL = new IS9(this);

    static {
        Covode.recordClassIndex(18483);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCustomBgWidget.class, "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewCustomBgWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewCustomBgWidget";
    }

    public final C3181o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.LJIILL, this, LIZIZ[0]));
    }

    public final C3199v LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIILLIIL, this, LIZIZ[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698439;
    }

    @Override // com.bytedance.android.live.room.IEntranceContext
    public final boolean isPreviewScene() {
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.room.IEntranceContext
    public final String getLiveType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C2VQ.LIZ(LJIIJJI().LIZ().LIZ());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        AbstractC81939IRh abstractC81939IRh = this.LIZLLL;
        if (abstractC81939IRh != null && abstractC81939IRh.isShowing()) {
            AbstractC81939IRh abstractC81939IRh2 = this.LIZLLL;
            if (abstractC81939IRh2 != null) {
                abstractC81939IRh2.dismiss();
            }
            this.LIZLLL = null;
        }
        AbstractC81935IRd abstractC81935IRd = this.LJFF;
        if (abstractC81935IRd != null) {
            abstractC81935IRd.LIZIZ(this.LJIILIIL, LIZLLL());
        }
    }

    public final int LIZLLL() {
        AudioInteractMode audioInteractMode;
        AbstractC413392Xt<C3258d> LJJI;
        C3258d LIZIZ2;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C3199v LIZJ = LIZJ();
        if (LIZJ == null || (LJJI = LIZJ.LJJI()) == null || (LIZIZ2 = LJJI.LIZIZ()) == null || (abstractC414762bG = LIZIZ2.LIZIZ) == null || (audioInteractMode = abstractC414762bG.LIZ()) == null) {
            audioInteractMode = AudioInteractMode.Radio;
        }
        if (audioInteractMode == AudioInteractMode.KTV) {
            return 1;
        }
        if (audioInteractMode != AudioInteractMode.Chat) {
            return 5;
        }
        return 2;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC81935IRd abstractC81935IRd;
        C2WC<LiveMode> LIZ2;
        Observable<LiveMode> LIZIZ2;
        Disposable subscribe;
        C3258d LIZIZ3;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        AudioInteractMode LIZ3;
        C2WC<LiveMode> LIZ4;
        FragmentActivity fragmentActivity;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        AbstractC2863ai abstractC2863ai = this.LJIILJJIL;
        LiveMode liveMode = null;
        if (abstractC2863ai != null) {
            abstractC81935IRd = abstractC2863ai.LJII();
        } else {
            abstractC81935IRd = null;
        }
        this.LJFF = abstractC81935IRd;
        AbstractC81935IRd abstractC81935IRd2 = this.LJFF;
        if (abstractC81935IRd2 != null) {
            abstractC81935IRd2.LIZJ(5);
        }
        this.LIZJ = findViewById(2131172730);
        this.LJIIL = (HSImageView) findViewById(2131177033);
        HSImageView hSImageView = this.LJIIL;
        if (hSImageView != null) {
            hSImageView.setActualImageResource(2130857729);
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7263n;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ5 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
        if (LIZ5.booleanValue()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                LJIIL().add(((VoiceLiveThemeApi) C425332sJ.LIZIZ.LIZ(VoiceLiveThemeApi.class)).getLatestOfficeBg(LIZLLL()).compose(C100839PnV.LIZJ()).subscribe(new IS7(this), new C77023GYf<>(this)));
            }
            View view = this.LIZJ;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        } else {
            View view2 = this.LIZJ;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(8);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            ILiveSDKService iLiveSDKService = (ILiveSDKService) ServiceManager.getService(ILiveSDKService.class);
            Fragment fragment = this.LJI;
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            this.f25984LJ = iLiveSDKService.createImagePicker(fragmentActivity, this.LJI, "PreviewTheme", 9, 16, 720, 1280, new C81957IRz(this), this, null);
        }
        LIZJ(new PreviewCustomBgWidget$onCreate$1(this));
        C3180k LIZ6 = C3180k.LIZLLL.LIZ();
        if (LIZ6 != null && (LIZ4 = LIZ6.LIZ()) != null) {
            liveMode = LIZ4.LIZ();
        }
        if (liveMode == LiveMode.AUDIO && (LIZIZ3 = LIZJ().LJJI().LIZIZ()) != null && (abstractC414762bG = LIZIZ3.LIZIZ) != null && (LIZ3 = abstractC414762bG.LIZ()) != null) {
            IS5.LIZIZ.LIZ(LIZ3);
        }
        C3180k LIZ7 = C3180k.LIZLLL.LIZ();
        if (LIZ7 != null && (LIZ2 = LIZ7.LIZ()) != null && (LIZIZ2 = LIZ2.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new IS6(this))) != null) {
            LIZ(subscribe);
        }
        LIZJ().LJJI().LIZ(new PreviewCustomBgWidget$onCreate$4(this));
    }

    public final void LIZ(Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(fragment);
        this.LJI = fragment;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC81969ISl abstractC81969ISl;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 12).isSupported && (abstractC81969ISl = this.f25984LJ) != null) {
            abstractC81969ISl.LIZ(i, i2, intent);
        }
    }
}
