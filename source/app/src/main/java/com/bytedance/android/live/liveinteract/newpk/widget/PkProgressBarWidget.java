package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.gift.IGiftCoreService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PKProgressBar;
import com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.p726a.C8718a;
import com.bytedance.android.livesdk.model.C9069m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C458614Br;
import p003X.C472014lP;
import p003X.C80354Hls;
import p003X.C81978ISu;
import p003X.HXL;
import p003X.HXM;
import p003X.HXN;
import p003X.HXP;
import p003X.HXQ;
import p003X.HXR;
import p003X.HXS;
import p003X.HXT;
import p003X.HXU;
import p003X.HXW;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkProgressBarWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HXT LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final PkDataContext f26395LJ;
    public final C80354Hls LJFF;
    public final LinkCrossRoomDataHolder LJI = LinkCrossRoomDataHolder.LJII();
    public final CompositeDisposable LJII = new CompositeDisposable();
    public final Observer<C8718a> LJIIIIZZ = new HXM(this);
    public final Observer<C8718a> LJIIIZ = new HXS(this);
    public final Observer<AbstractC4256d> LJIIJ = new HXQ(this);
    public final Observer<Long> LJIIJJI = new HXL(this);
    public final Observer<AbstractC4675a> LJIIL = new HXW(this);
    public final Observer<Boolean> LJIILIIL = new HXU(this);
    public final Observer<Boolean> LJIILJJIL = new HXP(this);
    public final C458614Br LJIILL;

    static {
        Covode.recordClassIndex(28825);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LIZ() {
        int i;
        int i2 = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported || !this.LJIILL.LIZIZ()) {
            return;
        }
        boolean LIZLLL = this.LJIILL.LIZLLL();
        int LIZ2 = LK5.LIZ(250.0f);
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            if (LIZLLL) {
                i = 0;
            } else {
                i = LIZ2;
            }
            layoutParams2.leftMargin = i;
            if (LIZLLL) {
                LIZ2 = 0;
            }
            layoutParams2.rightMargin = LIZ2;
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            viewGroup2.setLayoutParams(layoutParams2);
            HXT hxt = this.LIZIZ;
            if (hxt == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                PkProgressBarV2 pkProgressV2 = hxt.getPkProgressV2();
                if (pkProgressV2 != null) {
                    pkProgressV2.setPadOrientation(LIZLLL);
                }
            }
            HXT hxt2 = this.LIZIZ;
            if (hxt2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return;
            }
            View progressBackground = hxt2.getProgressBackground();
            if (progressBackground == null) {
                return;
            }
            if (!LIZLLL) {
                i2 = LK5.LIZ(18.0f);
            }
            C472014lP.LIZ(progressBackground, i2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        this.f26395LJ.LJIIIZ.removeObserver(this.LJIIJ);
        this.f26395LJ.LJIILIIL.removeObserver(this.LJIIIIZZ);
        this.f26395LJ.LJIILL.removeObserver(this.LJIIIZ);
        this.f26395LJ.LJIIJJI.removeObserver(this.LJIIJJI);
        this.f26395LJ.LJJII.removeObserver(this.LJIILIIL);
        this.f26395LJ.LJJIII.removeObserver(this.LJIILJJIL);
        this.LJFF.LIZJ.removeObserver(this.LJIIL);
        HXT hxt = this.LIZIZ;
        if (hxt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PkProgressBarV2 pkProgressV2 = hxt.getPkProgressV2();
        if (!PatchProxy.proxy(new Object[0], pkProgressV2, PkProgressBarV2.LIZ, false, 40).isSupported) {
            if (!pkProgressV2.LJIILL.isDisposed()) {
                pkProgressV2.LJIILL.dispose();
            }
            ((IGiftCoreService) ServiceManager.getService(IGiftCoreService.class)).removeGiftSendResultListener(pkProgressV2);
        }
        this.LJII.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte, boolean] */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1978);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1978);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LIZJ = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new HXT(context);
        ViewGroup viewGroup = this.containerView;
        HXT hxt = this.LIZIZ;
        if (hxt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hxt, new ViewGroup.LayoutParams(-1, -1));
        HXT hxt2 = this.LIZIZ;
        if (hxt2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ?? r1 = this.LIZJ;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJI;
        Intrinsics.checkNotNullExpressionValue(linkCrossRoomDataHolder, "");
        PkDataContext pkDataContext = this.f26395LJ;
        C80354Hls c80354Hls = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(r1 == true ? (byte) 1 : (byte) 0), linkCrossRoomDataHolder, pkDataContext, c80354Hls}, hxt2, HXT.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(linkCrossRoomDataHolder, pkDataContext, c80354Hls);
            C116971W2r.LIZ(LayoutInflater.from(hxt2.getContext()), 2131700485, (ViewGroup) hxt2, true);
            PkProgressBarV2 pkProgressBarV2 = (PkProgressBarV2) hxt2.LIZ(2131185192);
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) r1)}, pkProgressBarV2, PkProgressBarV2.LIZ, false, 3).isSupported) {
                pkProgressBarV2.LIZLLL = r1;
                NoPaddingTextView noPaddingTextView = (NoPaddingTextView) pkProgressBarV2.LIZ(2131180729);
                if (noPaddingTextView != null) {
                    C3Q0.LJI(noPaddingTextView, LK5.LIZ(0.5f));
                }
                NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) pkProgressBarV2.LIZ(2131165275);
                if (noPaddingTextView2 != null) {
                    C3Q0.LJI(noPaddingTextView2, LK5.LIZ(0.5f));
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) pkProgressBarV2.LIZ(2131195232);
                if (appCompatTextView != null) {
                    appCompatTextView.setTextSize(2, 14.0f);
                }
                pkProgressBarV2.LJFF = pkProgressBarV2.LJIJ;
                ((PKProgressBar) pkProgressBarV2.LIZ(2131185194)).setIsAnchor(r1);
                PKProgressBar pKProgressBar = (PKProgressBar) pkProgressBarV2.LIZ(2131185194);
                if (pKProgressBar != null) {
                    pKProgressBar.setOnProgressChangeListner(pkProgressBarV2);
                }
                PKProgressBar pKProgressBar2 = (PKProgressBar) pkProgressBarV2.LIZ(2131185194);
                if (pKProgressBar2 != null) {
                    pKProgressBar2.setIsPortrait(pkProgressBarV2.LJIILJJIL);
                }
                PKProgressBar pKProgressBar3 = (PKProgressBar) pkProgressBarV2.LIZ(2131185194);
                if (pKProgressBar3 != null) {
                    pKProgressBar3.LIZ(LK5.LIZIZ(2131629097), LK5.LIZIZ(2131629097), LK5.LIZIZ(2131629098), LK5.LIZIZ(2131629098));
                }
                HSImageView hSImageView = (HSImageView) pkProgressBarV2.LIZ(2131183085);
                if (hSImageView != null) {
                    hSImageView.setVisibility(0);
                }
                SettingKey<C9069m> settingKey = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                C81978ISu.LIZ((SimpleDraweeView) pkProgressBarV2.LIZ(2131183085), settingKey.getValue().LIZ);
                Context context2 = pkProgressBarV2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                pkProgressBarV2.LIZIZ = Typeface.createFromAsset(context2.getAssets(), "fonts/clarity_mono_bold.otf");
                NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) pkProgressBarV2.LIZ(2131180729);
                if (noPaddingTextView3 != null) {
                    noPaddingTextView3.setTypeface(pkProgressBarV2.LIZIZ);
                }
                NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) pkProgressBarV2.LIZ(2131165275);
                if (noPaddingTextView4 != null) {
                    noPaddingTextView4.setTypeface(pkProgressBarV2.LIZIZ);
                }
                NoPaddingTextView noPaddingTextView5 = (NoPaddingTextView) pkProgressBarV2.LIZ(2131195232);
                if (noPaddingTextView5 != null) {
                    noPaddingTextView5.setTypeface(pkProgressBarV2.LIZIZ);
                }
                NoPaddingTextView noPaddingTextView6 = (NoPaddingTextView) pkProgressBarV2.LIZ(2131195232);
                if (noPaddingTextView6 != null) {
                    noPaddingTextView6.setVisibility(8);
                }
                ((IGiftCoreService) ServiceManager.getService(IGiftCoreService.class)).addGiftSendResultListener(pkProgressBarV2);
            }
            ((PkProgressBarV2) hxt2.LIZ(2131185192)).setPkDataContext(pkDataContext);
            ((PkProgressBarV2) hxt2.LIZ(2131185192)).setPkLynxInfoViewModel(c80354Hls);
            ((PkProgressBarV2) hxt2.LIZ(2131185192)).setDataholder(linkCrossRoomDataHolder);
        }
        HXT hxt3 = this.LIZIZ;
        if (hxt3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) hxt3, false);
        this.f26395LJ.LJIIIZ.observeForever(this.LJIIJ);
        this.f26395LJ.LJIILIIL.observeForever(this.LJIIIIZZ);
        this.f26395LJ.LJIILL.observeForever(this.LJIIIZ);
        this.f26395LJ.LJIIJJI.observeForever(this.LJIIJJI);
        this.f26395LJ.LJJII.observeForever(this.LJIILIIL);
        this.f26395LJ.LJJIII.observeForever(this.LJIILJJIL);
        this.LJFF.LIZJ.observeForever(this.LJIIL);
        QB4.LIZ(this.f26395LJ.LJIIJJI().LIZIZ().subscribe(new HXN(this)), this.LJII);
        QB4.LIZ(this.f26395LJ.LJIIL().LIZIZ().subscribe(new HXR(this)), this.LJII);
        LIZ();
        MethodCollector.m14707o(1978);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZ();
    }

    public static final /* synthetic */ HXT LIZ(PkProgressBarWidget pkProgressBarWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkProgressBarWidget}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (HXT) proxy.result;
        }
        HXT hxt = pkProgressBarWidget.LIZIZ;
        if (hxt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hxt;
    }

    public PkProgressBarWidget(PkDataContext pkDataContext, C80354Hls c80354Hls, C458614Br c458614Br) {
        C106862S5w.LIZ(pkDataContext, c80354Hls, c458614Br);
        this.f26395LJ = pkDataContext;
        this.LJFF = c80354Hls;
        this.LJIILL = c458614Br;
    }
}
