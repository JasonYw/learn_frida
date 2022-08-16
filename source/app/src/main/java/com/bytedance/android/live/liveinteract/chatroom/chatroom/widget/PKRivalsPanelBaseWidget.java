package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C79919Her;
import p003X.C80078HhQ;
import p003X.C80079HhR;
import p003X.HLJ;

/* loaded from: classes3.dex */
public final class PKRivalsPanelBaseWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ViewGroup LIZIZ;
    public ViewGroup LIZJ;
    public ViewGroup LIZLLL;

    /* renamed from: LJ */
    public ViewGroup f26299LJ;
    public TextView LJFF;
    public TextView LJI;
    public View LJII;
    public HLJ LJIIIIZZ;
    public View LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public final C79919Her LJIILIIL;

    static {
        Covode.recordClassIndex(26494);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699884;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIILIIL.LIZ(this);
    }

    public static final /* synthetic */ ViewGroup LIZ(PKRivalsPanelBaseWidget pKRivalsPanelBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelBaseWidget}, null, LIZ, true, 9);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = pKRivalsPanelBaseWidget.LIZIZ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public static final /* synthetic */ View LIZIZ(PKRivalsPanelBaseWidget pKRivalsPanelBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelBaseWidget}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = pKRivalsPanelBaseWidget.LJII;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIILIIL.LJI.observe(this, new C80078HhQ(this));
        this.LJIILIIL.LJIILLIIL.observe(this, new C80079HhR(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            enableSubWidgetManager();
            this.subWidgetManager.load(2131189060, new PKRivalsPanelSearchWidget(this.LJIILIIL, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL));
            this.subWidgetManager.load(2131180987, new PKRivalsPanelListWidget(this.LJIILIIL, this.LJIIJJI, this.LJIIL));
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        View findViewById = findViewById(2131186076);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (ViewGroup) findViewById;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131166269), "");
        View findViewById2 = findViewById(2131189060);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(2131180987);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(2131189253);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26299LJ = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(2131173940);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = (TextView) findViewById5;
        View findViewById6 = findViewById(2131173941);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (TextView) findViewById6;
        View findViewById7 = findViewById(2131172780);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = findViewById7;
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.bringToFront();
    }

    public PKRivalsPanelBaseWidget(C79919Her c79919Her, HLJ hlj, View view, boolean z, String str, boolean z2) {
        C106862S5w.LIZ(c79919Her, hlj, view, str);
        this.LJIILIIL = c79919Her;
        this.LJIIIIZZ = hlj;
        this.LJIIIZ = view;
        this.LJIIJ = z;
        this.LJIIJJI = str;
        this.LJIIL = z2;
    }
}
