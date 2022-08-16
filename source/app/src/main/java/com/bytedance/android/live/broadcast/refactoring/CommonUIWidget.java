package com.bytedance.android.live.broadcast.refactoring;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.refactoring.CommonUIWidget;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86311Jzl;
import p003X.AbstractC86668KDe;
import p003X.C116971W2r;
import p003X.C144451eWj;
import p003X.RunnableC86346K0u;
import p003X.View$OnClickListenerC77585GiJ;

/* loaded from: classes5.dex */
public class CommonUIWidget extends AbstractBroadcastWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public Room f25939LJ;
    public Disposable LJFF;
    public final WeakHandler LJI;
    public final AbstractC86311Jzl LJII;

    static {
        Covode.recordClassIndex(17708);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        this.f25939LJ = (Room) this.dataCenter.get("data_room");
    }

    public final void LIZIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported && AbstractC86668KDe.LJJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue() && LiveConfigSettingKeys.SOUND_EFFECT_FEATURE_ENABLE.getValue().booleanValue()) {
            this.LJI.postDelayed(RunnableC86346K0u.LIZIZ, 30000L);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable = this.LJFF;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJFF.dispose();
        }
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported && this.LJII.LJIJI().getActivity() != null && isViewValid() && C144451eWj.LIZ((Context) this.LJII.LJIJI().getActivity(), "android.permission.ACCESS_FINE_LOCATION") && AbstractC80293Hkt.LJJLIIIJ.LIZ().intValue() != 1 && !AbstractC80293Hkt.LJJLIIIJJI.LIZ().booleanValue() && !AbstractC80293Hkt.LJJLIIIJL.LIZ().booleanValue() && this.f25939LJ.getOwner().getSecret() != 1) {
            final View$OnClickListenerC77585GiJ view$OnClickListenerC77585GiJ = new View$OnClickListenerC77585GiJ(this.LJII.LJIJI().getActivity(), this.f25939LJ);
            this.LJI.postDelayed(new Runnable(this, view$OnClickListenerC77585GiJ) { // from class: X.K26
                public static ChangeQuickRedirect LIZ;
                public final CommonUIWidget LIZIZ;
                public final View$OnClickListenerC77585GiJ LIZJ;

                static {
                    Covode.recordClassIndex(17790);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = view$OnClickListenerC77585GiJ;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LIZ(this.LIZJ);
                }
            }, LiveConfigSettingKeys.LIVE_OPEN_LOCATION_GUIDE_DELAY_TIME.getValue().intValue());
        }
    }

    public final /* synthetic */ void LIZ(View$OnClickListenerC77585GiJ view$OnClickListenerC77585GiJ) {
        if (!PatchProxy.proxy(new Object[]{view$OnClickListenerC77585GiJ}, this, LIZJ, false, 11).isSupported && this.LIZIZ) {
            C116971W2r.LIZJ(view$OnClickListenerC77585GiJ);
        }
    }

    public CommonUIWidget(AbstractC86311Jzl abstractC86311Jzl, WeakHandler weakHandler) {
        this.LJII = abstractC86311Jzl;
        this.LJI = weakHandler;
        int i = 0;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            this.LIZLLL = this.LJII.LJIJI().getContext().getResources().getConfiguration() != null ? this.LJII.LJIJI().getContext().getResources().getConfiguration().screenWidthDp : i;
        }
    }
}
