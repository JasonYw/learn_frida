package com.bytedance.android.live.effect.view;

import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.gesture.EffectGestureDetectorV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C144769ebr;
import p003X.C144772ebu;
import p003X.C87010KQi;
import p003X.KAU;

/* loaded from: classes5.dex */
public final class EffectLiveCameraActivityProxy extends LiveEffectActivityProxy implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public C144769ebr LIZJ;
    public EffectGestureDetectorV2 LIZLLL;

    static {
        Covode.recordClassIndex(24817);
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable = this.LIZIZ;
        if (disposable != null) {
            disposable.isDisposed();
        }
        Disposable disposable2 = this.LIZIZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[]{C144772ebu.class}, this, LIZ, false, 4).isSupported) {
            this.LIZIZ = C87010KQi.LIZ().LIZ(C144772ebu.class).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KAU(this));
        }
        this.LIZLLL = new EffectGestureDetectorV2(this.LJJ, LiveEffectContextFactory.Type.DEFAULT);
        this.LIZJ = new C144769ebr(LiveEffectContextFactory.Type.DEFAULT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLiveCameraActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        C106862S5w.LIZ(fragmentActivity);
        LJIIIZ();
    }

    public final void onEvent(C144772ebu c144772ebu) {
        C144769ebr c144769ebr;
        if (!PatchProxy.proxy(new Object[]{c144772ebu}, this, LIZ, false, 3).isSupported && (c144769ebr = this.LIZJ) != null) {
            c144769ebr.onEvent(c144772ebu);
        }
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        EffectGestureDetectorV2 effectGestureDetectorV2 = this.LIZLLL;
        if (effectGestureDetectorV2 == null) {
            return false;
        }
        return effectGestureDetectorV2.LIZ(motionEvent);
    }
}
