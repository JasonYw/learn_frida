package com.bytedance.android.live.liveinteract.newpk.widget.link;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.PkLayoutData;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.LinkInRoomMuteView;
import com.bytedance.android.live.liveinteract.intercomment.InteractCommentWidget;
import com.bytedance.android.live.liveinteract.p382pk.C4737p;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.common.AnchorPauseTipsView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C458454Bb;
import p003X.C458614Br;
import p003X.C87010KQi;
import p003X.HK4;
import p003X.HMK;
import p003X.HS3;
import p003X.IQV;
import p003X.IQX;
import p003X.LK1;
import p003X.LK5;
import p003X.LOA;

/* loaded from: classes3.dex */
public class LinkCrossRoomNewWidget extends BaseLinkWidget implements Observer<KVData>, AbstractC4762ac, AbstractC4569445g {
    public static ChangeQuickRedirect LJIIJ;
    public InteractCommentWidget LIZIZ;
    public Room LJIIJJI;
    public boolean LJIIL;
    public final LinkCrossRoomDataHolder LJIILIIL;
    public C458614Br LJIILJJIL;
    public HMK LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public Guideline LJIJI;
    public View LJIJJ;
    public AnchorPauseTipsView LJIJJLI;
    public AnchorPauseTipsView LJIL;
    public LinkInRoomMuteView LJJ;
    public HSImageView LJJI;
    public final long LJJII;
    public final long LJJIII;
    public int LJIJ = LK5.LIZJ() / 2;
    public final CompositeDisposable LJJIFFI = new CompositeDisposable();

    static {
        Covode.recordClassIndex(28877);
    }

    public void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIJ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 1;
    }

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
    }

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIILIIL() {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700833;
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIJ, false, 30).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PkLayoutData LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 28);
        if (proxy.isSupported) {
            return (PkLayoutData) proxy.result;
        }
        return new PkLayoutData(this.LJIILLIIL, this.LJIJ, this.LJIIZILJ);
    }

    public final C458614Br LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 1);
        if (proxy.isSupported) {
            return (C458614Br) proxy.result;
        }
        C458614Br c458614Br = this.LJIILJJIL;
        if (c458614Br == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c458614Br;
    }

    public final HMK LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 3);
        if (proxy.isSupported) {
            return (HMK) proxy.result;
        }
        HMK hmk = this.LJIILL;
        if (hmk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hmk;
    }

    public final Guideline LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 5);
        if (proxy.isSupported) {
            return (Guideline) proxy.result;
        }
        Guideline guideline = this.LJIJI;
        if (guideline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return guideline;
    }

    public final View LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 7);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJIJJ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    public final AnchorPauseTipsView LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 9);
        if (proxy.isSupported) {
            return (AnchorPauseTipsView) proxy.result;
        }
        AnchorPauseTipsView anchorPauseTipsView = this.LJIJJLI;
        if (anchorPauseTipsView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return anchorPauseTipsView;
    }

    public final AnchorPauseTipsView LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 11);
        if (proxy.isSupported) {
            return (AnchorPauseTipsView) proxy.result;
        }
        AnchorPauseTipsView anchorPauseTipsView = this.LJIL;
        if (anchorPauseTipsView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return anchorPauseTipsView;
    }

    public final LinkInRoomMuteView LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 13);
        if (proxy.isSupported) {
            return (LinkInRoomMuteView) proxy.result;
        }
        LinkInRoomMuteView linkInRoomMuteView = this.LJJ;
        if (linkInRoomMuteView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return linkInRoomMuteView;
    }

    public final HSImageView LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIJ, false, 15);
        if (proxy.isSupported) {
            return (HSImageView) proxy.result;
        }
        HSImageView hSImageView = this.LJJI;
        if (hSImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hSImageView;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void enableSubWidgetManager() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 20).isSupported) {
            return;
        }
        super.enableSubWidgetManager();
        WidgetManager widgetManager = this.subWidgetManager;
        if (!(widgetManager instanceof C458454Bb)) {
            widgetManager = null;
        }
        C458454Bb c458454Bb = (C458454Bb) widgetManager;
        if (c458454Bb != null) {
            c458454Bb.LIZLLL = true;
        }
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 25).isSupported) {
            return;
        }
        C458614Br c458614Br = this.LJIILJJIL;
        if (c458614Br == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        boolean LIZJ = c458614Br.LIZJ();
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            C458614Br c458614Br2 = this.LJIILJJIL;
            if (c458614Br2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJ = c458614Br2.LIZ();
            if (LIZJ) {
                layoutParams2.width = this.LJIJ * 2;
                layoutParams2.gravity = 17;
            } else {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
            }
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 21).isSupported) {
            return;
        }
        super.onDestroy();
        LIZ("unload", "");
        HMK hmk = this.LJIILL;
        if (hmk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], hmk, HMK.LIZ, false, 11).isSupported) {
            hmk.onCleared();
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJIILIIL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.removeObserver(this);
        }
        LOA.LIZ().LIZ(TimeCostUtil.Tag.LivePk.name(), TimeCostUtil.LIZ("isAnchor", String.valueOf(this.LJIIL)));
        this.LJIILIIL.LIZJ = false;
    }

    private final void LIZLLL() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DataCenter dataCenter;
        Integer num;
        DataCenter dataCenter2;
        Integer num2;
        int i6 = 0;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 26).isSupported) {
            return;
        }
        C458614Br c458614Br = this.LJIILJJIL;
        if (c458614Br == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!c458614Br.LIZIZ()) {
            return;
        }
        View view = this.LJIJJ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            C458614Br c458614Br2 = this.LJIILJJIL;
            if (c458614Br2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!c458614Br2.LIZLLL() && (dataCenter2 = this.dataCenter) != null && (num2 = (Integer) dataCenter2.get("data_pk_ui_change", (String) 0)) != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            layoutParams2.leftMargin = i;
            C458614Br c458614Br3 = this.LJIILJJIL;
            if (c458614Br3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!c458614Br3.LIZLLL() && (dataCenter = this.dataCenter) != null && (num = (Integer) dataCenter.get("data_pk_ui_change", (String) 0)) != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            layoutParams2.rightMargin = i2;
            View view2 = this.LJIJJ;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2.setLayoutParams(layoutParams2);
            AnchorPauseTipsView anchorPauseTipsView = this.LJIJJLI;
            if (anchorPauseTipsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ViewGroup.LayoutParams layoutParams3 = anchorPauseTipsView.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                C458614Br c458614Br4 = this.LJIILJJIL;
                if (c458614Br4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (c458614Br4.LIZLLL()) {
                    i3 = 2131190837;
                } else {
                    i3 = 0;
                }
                layoutParams4.topToTop = i3;
                C458614Br c458614Br5 = this.LJIILJJIL;
                if (c458614Br5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (c458614Br5.LIZLLL()) {
                    i4 = 2131190837;
                } else {
                    i4 = 0;
                }
                layoutParams4.bottomToBottom = i4;
                AnchorPauseTipsView anchorPauseTipsView2 = this.LJIJJLI;
                if (anchorPauseTipsView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                anchorPauseTipsView2.setLayoutParams(layoutParams4);
                AnchorPauseTipsView anchorPauseTipsView3 = this.LJIL;
                if (anchorPauseTipsView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ViewGroup.LayoutParams layoutParams5 = anchorPauseTipsView3.getLayoutParams();
                if (layoutParams5 != null) {
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    C458614Br c458614Br6 = this.LJIILJJIL;
                    if (c458614Br6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (c458614Br6.LIZLLL()) {
                        i5 = 2131190837;
                    } else {
                        i5 = 0;
                    }
                    layoutParams6.topToTop = i5;
                    C458614Br c458614Br7 = this.LJIILJJIL;
                    if (c458614Br7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (c458614Br7.LIZLLL()) {
                        i6 = 2131190837;
                    }
                    layoutParams6.bottomToBottom = i6;
                    AnchorPauseTipsView anchorPauseTipsView4 = this.LJIL;
                    if (anchorPauseTipsView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    anchorPauseTipsView4.setLayoutParams(layoutParams6);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        Room room;
        boolean z;
        long j;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        C2WC<Room> LIZ;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 17).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null) {
            room = LIZ.LIZ();
        } else {
            room = null;
        }
        this.LJIIJJI = room;
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJIILJJIL = LJJJI2.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIL = z;
        this.LJIILJJIL = new C458614Br(LJJJI(), this.dataCenter);
        this.LJIILL = new HMK(LJJJI(), this.LJIILIIL.LIZLLL, this.LJJIII);
        this.LJIILIIL.LIZJ = true;
        Pair LIZ2 = IQV.LIZ((Function0) LinkCrossRoomNewWidget$onCreate$1.INSTANCE);
        C4737p c4737p = (C4737p) LIZ2.component1();
        c4737p.LIZ().LIZIZ(this);
        IQX.LIZ(c4737p, "IPkService");
        this.LJJIFFI.add((Disposable) LIZ2.component2());
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 23).isSupported) {
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            Guideline guideline = (Guideline) view.findViewById(2131176115);
            Intrinsics.checkNotNullExpressionValue(guideline, "");
            this.LJIJI = guideline;
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById = view2.findViewById(2131190837);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LJIJJ = findViewById;
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            AnchorPauseTipsView anchorPauseTipsView = (AnchorPauseTipsView) view3.findViewById(2131180690);
            Intrinsics.checkNotNullExpressionValue(anchorPauseTipsView, "");
            this.LJIJJLI = anchorPauseTipsView;
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            AnchorPauseTipsView anchorPauseTipsView2 = (AnchorPauseTipsView) view4.findViewById(2131187984);
            Intrinsics.checkNotNullExpressionValue(anchorPauseTipsView2, "");
            this.LJIL = anchorPauseTipsView2;
            View view5 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            LinkInRoomMuteView linkInRoomMuteView = (LinkInRoomMuteView) view5.findViewById(2131183650);
            Intrinsics.checkNotNullExpressionValue(linkInRoomMuteView, "");
            this.LJJ = linkInRoomMuteView;
            View view6 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            HSImageView hSImageView = (HSImageView) view6.findViewById(2131197474);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            this.LJJI = hSImageView;
            LinkInRoomMuteView linkInRoomMuteView2 = this.LJJ;
            if (linkInRoomMuteView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            Room room2 = this.LJIIJJI;
            long j2 = 0;
            if (room2 != null) {
                j = room2.getId();
            } else {
                j = 0;
            }
            Room room3 = this.LJIIJJI;
            if (room3 != null) {
                j2 = room3.ownerUserId;
            }
            if (!PatchProxy.proxy(new Object[]{LJII, new Long(j), new Long(j2)}, linkInRoomMuteView2, LinkInRoomMuteView.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(LJII);
                linkInRoomMuteView2.f26293LJ = LJII;
                linkInRoomMuteView2.LJFF = j;
                linkInRoomMuteView2.LJI = j2;
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 19).isSupported && this.LIZIZ == null) {
            enableSubWidgetManager();
            View view7 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view7, "");
            this.LIZIZ = new InteractCommentWidget((ViewGroup) view7.findViewById(2131177998), this.containerView, 1);
            this.subWidgetManager.load(2131177998, (Widget) this.LIZIZ, false);
        }
        LIZJ();
        LIZLLL();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.observe("data_keyboard_status", this);
        }
        LOA.LIZ().LIZIZ(TimeCostUtil.Tag.LivePk.name(), mo29786getLifecycle(), getContext(), 10000);
        LOA.LIZ().LIZ(TimeCostUtil.Tag.LivePk.name(), mo29786getLifecycle(), getContext(), 10000);
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C5986ap.class).m151as(autoDispose())).LIZ(new HS3(this));
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZ */
    public void onChanged(KVData kVData) {
        String key;
        if (!PatchProxy.proxy(new Object[]{kVData}, this, LJIIJ, false, 24).isSupported && kVData != null && (key = kVData.getKey()) != null) {
            int hashCode = key.hashCode();
            if (hashCode != 1060055221) {
                if (hashCode == 1797384049 && key.equals("data_pk_renderview_width")) {
                    LIZJ();
                }
            } else if (!key.equals("data_keyboard_status")) {
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        if (PatchProxy.proxy(new Object[]{configuration}, this, LJIIJ, false, 22).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        C458614Br c458614Br = this.LJIILJJIL;
        if (c458614Br == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (configuration != null) {
            i = configuration.orientation;
        } else {
            i = -1;
        }
        c458614Br.f1151LJ = i;
        c458614Br.LJFF = configuration;
        LIZJ();
        LIZLLL();
    }

    public final void onEvent(C5986ap c5986ap) {
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, LJIIJ, false, 18).isSupported || c5986ap == null) {
            return;
        }
        if (c5986ap.LIZ == 30) {
            HK4.LIZIZ.LIZ("background");
            AnchorPauseTipsView anchorPauseTipsView = this.LJIJJLI;
            if (anchorPauseTipsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                LK1.LIZIZ(anchorPauseTipsView, true);
            }
        } else if (c5986ap.LIZ == 31) {
            HK4.LIZIZ.LIZ("suspend");
            AnchorPauseTipsView anchorPauseTipsView2 = this.LJIJJLI;
            if (anchorPauseTipsView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                LK1.LIZIZ(anchorPauseTipsView2, false);
            }
        }
    }

    public LinkCrossRoomNewWidget(long j, long j2) {
        this.LJJII = j;
        this.LJJIII = j2;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        this.LJIILIIL = LJII;
    }

    public final void LIZ(String str, String str2) {
        String str3;
        long j;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LJIIJ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (this.LJIIL) {
            if (this.LJIILIIL.LJIIIZ) {
                str3 = "inviter";
            } else {
                str3 = "invitee";
            }
        } else {
            str3 = "audience";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        hashMap.put("role", str3);
        hashMap.put("channel_id", Long.valueOf(this.LJIILIIL.LIZLLL));
        Room room = this.LJIIJJI;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", Long.valueOf(j));
        hashMap.put("guest_uid", Long.valueOf(this.LJIILIIL.LJFF));
        hashMap.put("start_time", Long.valueOf(this.LJIILIIL.LJIILIIL));
        hashMap.put("duration", Integer.valueOf(this.LJIILIIL.LJIIJJI));
        hashMap.put("pk_id", Long.valueOf(this.LJIILIIL.f26249LJ));
        hashMap.put("link_mic_id", this.LJIILIIL.LJIILL);
        hashMap.put("guest_link_mic_id", this.LJIILIIL.LJIIIIZZ);
        hashMap.put("extra", str2);
        C2IN.LIZIZ().LIZ("ttlive_pk", hashMap);
    }
}
