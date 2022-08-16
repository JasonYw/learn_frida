package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C438153Uz;
import p003X.KK6;
import p003X.KLJ;

@AbstractC445813kF(LIZ = "GAME_ORIENTATION")
/* loaded from: classes5.dex */
public final class GameOrientationWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final Lazy LIZLLL = LIZ(C3199v.class);
    public boolean LIZJ = true;

    static {
        Covode.recordClassIndex(18341);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GameOrientationWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "GameOrientationWidget";
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZLLL, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a194";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698475;
        }
        return 2131698474;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        int i = C438153Uz.LIZIZ().getInt("xigua_game_live_broadcast_orientation", 1);
        this.containerView.setTag(2131185003, Integer.valueOf(i));
        LIZIZ().LJIILJJIL().LIZ(Integer.valueOf(i));
        LIZ(i);
        Disposable subscribe = LIZIZ().LJIILL().LIZIZ().subscribe(new KLJ(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
        LIZJ(new GameOrientationWidget$onCreate$2(this));
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                View view = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                ((ImageView) view.findViewById(2131168424)).setBackgroundResource(2130854320);
                View view2 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                TextView textView = (TextView) view2.findViewById(2131184635);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(this.context.getString(2131586055));
                return;
            }
            return;
        }
        View view3 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        ((ImageView) view3.findViewById(2131168424)).setBackgroundResource(2130854321);
        View view4 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        TextView textView2 = (TextView) view4.findViewById(2131184635);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setText(this.context.getString(2131586056));
    }
}
