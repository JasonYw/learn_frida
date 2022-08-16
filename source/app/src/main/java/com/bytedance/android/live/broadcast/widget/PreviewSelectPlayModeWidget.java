package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C413602Yo;
import p003X.KLA;
import p003X.KMC;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class PreviewSelectPlayModeWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public KMC LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25996LJ;
    public final String LJFF = "PreviewSelectPlayModeWidget";
    public final Lazy LJI = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18649);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewSelectPlayModeWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[0]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698467;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.LJFF;
    }

    public final void LIZJ() {
        TextView textView = this.f25996LJ;
        this.f25996LJ = this.LIZLLL;
        this.LIZLLL = textView;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        LiveMode liveMode;
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(C413602Yo.LIZ(LIZIZ().LJJL(), new PreviewSelectPlayModeWidget$onCreate$1(this)));
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        C2WC<LiveMode> c2wc = LIZIZ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode != LiveMode.VIDEO) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        View view = this.contentView;
        this.LIZLLL = (TextView) view.findViewById(2131185273);
        this.f25996LJ = (TextView) view.findViewById(2131184116);
        View view2 = this.contentView;
        if (view2 != null) {
            view2.setOnClickListener(new KLA(this));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 5).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        if (liveMode != LiveMode.VIDEO) {
            z = false;
        }
        LK1.LIZ(viewGroup, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(TextView textView, boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        float f;
        TranslateAnimation translateAnimation;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{textView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        float f2 = 1.0f;
        if (z2 != 0) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        } else {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        }
        alphaAnimation.setDuration(300L);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z), Byte.valueOf((byte) z2)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            translateAnimation = (TranslateAnimation) proxy.result;
        } else {
            if (z2 != 0) {
                if (z != 0) {
                    f2 = -1.0f;
                }
                f = 0.0f;
            } else {
                if (z == 0) {
                    f2 = -1.0f;
                }
                f = f2;
                f2 = 0.0f;
            }
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
            translateAnimation.setDuration(300L);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        textView.startAnimation(animationSet);
        if (z2 != 0) {
            i = 4;
        }
        textView.setVisibility(i);
    }
}
