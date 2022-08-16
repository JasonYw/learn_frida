package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.event.C7068i;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C413602Yo;
import p003X.C86895KLx;
import p003X.C86896KLy;
import p003X.C87010KQi;
import p003X.KNN;
import p003X.LK1;

/* loaded from: classes5.dex */
public class PreviewCoverPickerWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public static final /* synthetic */ KProperty[] LJI;
    public Fragment LJII;
    public boolean LJIIIIZZ;
    public KNN LJIIIZ;
    public C9078n LJIIJ;
    public boolean LJIIJJI;
    public Disposable LJIILJJIL;
    public Disposable LJIILL;
    public final Lazy LJIIL = LIZ(C3199v.class);
    public final Lazy LJIILIIL = LIZ(C3181o.class);
    public final int LJIILLIIL = 10;
    public final int LJIIZILJ = 8;

    static {
        Covode.recordClassIndex(18478);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCoverPickerWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewCoverPickerWidget.class, "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LJI = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewCoverPickerWidget";
    }

    public final C3199v LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIL, this, LJI[0]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698438;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a120";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 16).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* renamed from: LJ */
    public int mo15868LJ() {
        return this.LJIILLIIL;
    }

    public int LJFF() {
        return this.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onClear() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 13).isSupported) {
            return;
        }
        super.onClear();
        this.LJII = null;
        KNN knn = this.LJIIIZ;
        if (knn != null) {
            knn.LIZIZ();
        }
        this.LJIIIZ = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 12).isSupported) {
            return;
        }
        KNN knn = this.LJIIIZ;
        if (knn != null) {
            knn.LIZIZ();
        }
        this.LJIIIZ = null;
        Disposable disposable = this.LJIILL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIILJJIL;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    private final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 8).isSupported) {
            return;
        }
        this.LJIIIZ = new KNN(this.contentView, this.LJII, LIZLLL(), LJFF(), mo15868LJ());
        KNN knn = this.LJIIIZ;
        if (knn != null) {
            knn.LIZ(LIZIZ().LIZ().LIZ());
        }
        Disposable subscribe = C87010KQi.LIZ().LIZ(C7068i.class).subscribe(new C86896KLy(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
        LIZ(LIZIZ().LIZ(new PreviewCoverPickerWidget$realInit$2(this)));
    }

    private final void LIZ(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 5).isSupported) {
            return;
        }
        Fragment fragment = this.LJII;
        if ((fragment == null || fragment.getContext() == null) && objArr != null) {
            Object obj = objArr[0];
            if (!(obj instanceof Fragment)) {
                obj = null;
            }
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                this.LJII = fragment2;
            }
        }
    }

    public final void LIZIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LJFF, false, 11).isSupported) {
            return;
        }
        if (LIZLLL().LJJJJL().LIZ().intValue() != 0 && liveMode == LiveMode.VIDEO) {
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                LK1.LIZIZ(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null) {
            LK1.LIZJ(viewGroup2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 3).isSupported) {
            return;
        }
        super.onInit(objArr);
        this.LJIIJJI = false;
        LIZ(objArr);
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 7).isSupported && this.isViewValid) {
            LJI();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LJFF, false, 9).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        KNN knn = this.LJIIIZ;
        if (knn != null && !PatchProxy.proxy(new Object[]{liveMode}, knn, KNN.LIZ, false, 12).isSupported && liveMode != knn.LJII) {
            knn.LJII = liveMode;
            knn.LIZLLL();
        }
        LIZIZ(liveMode);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        Object LIZ;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 4).isSupported) {
            return;
        }
        LIZ(objArr);
        if (this.LJIIIZ == null) {
            LJI();
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 2);
        if (proxy.isSupported) {
            LIZ = proxy.result;
        } else {
            LIZ = LIZ(this.LJIILIIL, this, LJI[1]);
        }
        ((C3181o) LIZ).LIZLLL().observe(this, new C86895KLx(this));
        C413602Yo.LIZ(LIZLLL().LJJJJL(), new PreviewCoverPickerWidget$onLoad$2(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        KNN knn;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LJFF, false, 14).isSupported && (knn = this.LJIIIZ) != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, knn, KNN.LIZ, false, 6);
            if (proxy.isSupported) {
                ((Boolean) proxy.result).booleanValue();
            } else {
                knn.f8441LJ.LIZ(i, i2, intent);
            }
        }
    }
}
