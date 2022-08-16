package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PkTitleTextView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.widget.GradientTextView;
import com.bytedance.android.livesdkapi.depend.model.live.BattleOperationalPlay;
import com.bytedance.android.livesdkapi.depend.model.live.C9515l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C79518HWe;
import p003X.C79528HWo;
import p003X.C79530HWq;
import p003X.C79531HWr;
import p003X.C79532HWs;
import p003X.C79536HWw;
import p003X.C79538HWy;
import p003X.C79539HWz;
import p003X.HTW;
import p003X.LK1;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkTitleWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C79531HWr LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final PkDataContext f26400LJ;
    public final HTW LJFF;
    public final LinkCrossRoomDataHolder LJI = LinkCrossRoomDataHolder.LJII();
    public final CompositeDisposable LJII = new CompositeDisposable();
    public final Observer<Long> LJIIIIZZ = new C79532HWs(this);
    public final Observer<AbstractC4256d> LJIIIZ = new C79530HWq(this);
    public final Observer<C9515l> LJIIJ = new C79538HWy(this);
    public final Observer<C9515l> LJIIJJI = new C79539HWz(this);

    static {
        Covode.recordClassIndex(28856);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        this.f26400LJ.LJIIJJI.removeObserver(this.LJIIIIZZ);
        this.f26400LJ.LJIIIZ.removeObserver(this.LJIIIZ);
        this.LJFF.LJIIIIZZ.removeObserver(this.LJIIJ);
        this.LJFF.LJIIIZ.removeObserver(this.LJIIJJI);
        this.LJII.clear();
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        BattleOperationalPlay battleOperationalPlay = this.f26400LJ.LJJIJIL;
        if (battleOperationalPlay == null || battleOperationalPlay.LIZ != BattleOperationalPlay.OperationalPlayType.OperationalPlayType_MultipleMatches3.ordinal()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        C2WC<Integer> LLFFF;
        Observable<Integer> LIZIZ;
        Disposable subscribe;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ2;
        MethodCollector.m14708i(1983);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1983);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ2 = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ2.booleanValue();
        } else {
            z = false;
        }
        this.LIZJ = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C79531HWr(context);
        ViewGroup viewGroup = this.containerView;
        C79531HWr c79531HWr = this.LIZIZ;
        if (c79531HWr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(c79531HWr, new ViewGroup.LayoutParams(-1, -1));
        C79531HWr c79531HWr2 = this.LIZIZ;
        if (c79531HWr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        boolean z2 = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, c79531HWr2, C79531HWr.LIZ, false, 2).isSupported) {
            c79531HWr2.LIZIZ = z2;
            c79531HWr2.setOrientation(0);
            if (!PatchProxy.proxy(new Object[0], c79531HWr2, C79531HWr.LIZ, false, 3).isSupported) {
                PkTitleTextView pkTitleTextView = (PkTitleTextView) c79531HWr2.LIZ(2131194877);
                Intrinsics.checkNotNullExpressionValue(pkTitleTextView, "");
                pkTitleTextView.setTypeface(Typeface.DEFAULT);
                PkTitleTextView pkTitleTextView2 = (PkTitleTextView) c79531HWr2.LIZ(2131194877);
                Intrinsics.checkNotNullExpressionValue(pkTitleTextView2, "");
                TextPaint paint = pkTitleTextView2.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint, "");
                paint.setFakeBoldText(true);
                ((AppCompatTextView) c79531HWr2.LIZ(2131194877)).setTextSize(2, 12.0f);
                C79518HWe c79518HWe = new C79518HWe();
                Context context2 = c79531HWr2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ((PkTitleTextView) c79531HWr2.LIZ(2131194877)).LIZ(c79518HWe, new C79528HWo(context2));
                NoPaddingTextView noPaddingTextView = (NoPaddingTextView) c79531HWr2.LIZ(2131165258);
                Intrinsics.checkNotNullExpressionValue(noPaddingTextView, "");
                Context context3 = c79531HWr2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                noPaddingTextView.setTypeface(Typeface.createFromAsset(context3.getAssets(), "fonts/clarity_mono_bold.otf"));
                ((SimpleDraweeView) c79531HWr2.LIZ(2131179328)).setActualImageResource(c79531HWr2.getPKIconRes());
            }
            ((GradientTextView) c79531HWr2.LIZ(2131194877)).LIZ(true, CastProtectorUtils.parseColor("#ffca69e1"), CastProtectorUtils.parseColor("#ff7851ff"));
        }
        C79531HWr c79531HWr3 = this.LIZIZ;
        if (c79531HWr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) c79531HWr3, false);
        if (this.LJI.LJIIJJI == 0) {
            C79531HWr c79531HWr4 = this.LIZIZ;
            if (c79531HWr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79531HWr4.LIZ();
        }
        this.f26400LJ.LJIIJJI.observeForever(this.LJIIIIZZ);
        this.f26400LJ.LJIIIZ.observeForever(this.LJIIIZ);
        this.LJFF.LJIIIIZZ.observeForever(this.LJIIJ);
        this.LJFF.LJIIIZ.observeForever(this.LJIIJJI);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LLFFF = LIZ2.LLFFF()) != null && (LIZIZ = LLFFF.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new C79536HWw(this))) != null) {
            QB4.LIZ(subscribe, this.LJII);
            MethodCollector.m14707o(1983);
            return;
        }
        MethodCollector.m14707o(1983);
    }

    public static final /* synthetic */ C79531HWr LIZ(PkTitleWidget pkTitleWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkTitleWidget}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return (C79531HWr) proxy.result;
        }
        C79531HWr c79531HWr = pkTitleWidget.LIZIZ;
        if (c79531HWr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c79531HWr;
    }

    public final void LIZ(boolean z) {
        boolean z2 = true;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (!z || !(!Intrinsics.areEqual(this.f26400LJ.LJIIIZ.getValue(), AbstractC4256d.C4260d.LIZIZ)) || !(!Intrinsics.areEqual(this.f26400LJ.LJIIIZ.getValue(), AbstractC4256d.C4259c.LIZIZ))) {
            z2 = false;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        if (z2) {
            i = 4;
        }
        viewGroup.setVisibility(i);
    }

    public PkTitleWidget(PkDataContext pkDataContext, HTW htw) {
        C106862S5w.LIZ(pkDataContext, htw);
        this.f26400LJ = pkDataContext;
        this.LJFF = htw;
    }
}
