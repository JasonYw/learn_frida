package com.bytedance.android.live.media.impl.widget;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.media.impl.FadingEdgeHorizontalScrollView;
import com.bytedance.android.live.media.impl.portrait.a$a;
import com.bytedance.android.live.media.impl.widget.MediaTitleWidget;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5983ak;
import com.bytedance.android.livesdk.chatroom.p518ui.C6337ge;
import com.bytedance.android.livesdk.common.MarqueeTextView;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC441033cX;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C146239ezh;
import p003X.C148062fT6;
import p003X.C409882Kg;
import p003X.C412982We;
import p003X.C441013cV;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.LK1;
import p003X.LK5;
import p003X.RunnableC440963cQ;

/* loaded from: classes12.dex */
public final class MediaTitleWidget extends LiveRecyclableWidget implements View.OnClickListener, Observer<KVData>, a$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Room LIZIZ;
    public AbstractC441033cX LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public FadingEdgeHorizontalScrollView f26520LJ;
    public int LJFF;
    public ValueAnimator LJI;
    public MarqueeTextView LJII;
    public final C441013cV LJIIIIZZ = new C441013cV(this);
    public ViewPropertyAnimator LJIIIZ;
    public TextView LJIIJ;
    public View LJIIJJI;
    public View LJIIL;

    static {
        Covode.recordClassIndex(32472);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699999;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a141";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LJFF() {
        final MarqueeTextView marqueeTextView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (marqueeTextView = this.LJII) != null) {
            marqueeTextView.post(new Runnable() { // from class: X.3cP
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(32477);
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 331
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p003X.RunnableC440953cP.run():void");
                }
            });
        }
    }

    public final void LIZ() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        if (C412982We.LIZIZ.LIZ()) {
            LJFF();
            return;
        }
        if (isScreenPortrait()) {
            textView = this.LJIIJ;
        } else {
            textView = this.LIZLLL;
        }
        if (textView != null) {
            textView.post(new RunnableC440963cQ(this, textView));
        }
    }

    @Override // com.bytedance.android.live.media.impl.portrait.a$a
    public final void LIZIZ() {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator duration;
        DataCenter dataCenter;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        if (isScreenPortrait() && (dataCenter = this.dataCenter) != null) {
            dataCenter.put("data_media_introduction_showing", Boolean.TRUE);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            View view = this.LJIIJJI;
            if (view != null && (animate = view.animate()) != null && (rotation = animate.rotation(180.0f)) != null && (duration = rotation.setDuration(200L)) != null) {
                viewPropertyAnimator = duration.setInterpolator(new DecelerateInterpolator());
            } else {
                viewPropertyAnimator = null;
            }
            this.LJIIIZ = viewPropertyAnimator;
            ViewPropertyAnimator viewPropertyAnimator2 = this.LJIIIZ;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.start();
            }
        }
    }

    @Override // com.bytedance.android.live.media.impl.portrait.a$a
    public final void LIZJ() {
        View view;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        DataCenter dataCenter;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (isScreenPortrait() && (dataCenter = this.dataCenter) != null) {
            dataCenter.put("data_media_introduction_showing", Boolean.FALSE);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && (view = this.LJIIJJI) != null && (animate = view.animate()) != null && (rotation = animate.rotation(0.0f)) != null && (duration = rotation.setDuration(200L)) != null && (interpolator = duration.setInterpolator(new DecelerateInterpolator())) != null) {
            interpolator.start();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        AbstractC413392Xt<C6337ge> LLLJ;
        C6337ge LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.LJIIIZ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        View view = this.LJIIJJI;
        if (view != null) {
            view.setRotation(0.0f);
        }
        MarqueeTextView marqueeTextView = this.LJII;
        if (marqueeTextView != null) {
            marqueeTextView.cancelAnimation();
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
        if (LIZ2 != null && (LLLJ = LIZ2.LLLJ()) != null && (LIZIZ = LLLJ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(this.LJIIIIZZ);
        }
        this.dataCenter.removeObserver(this);
        ValueAnimator valueAnimator = this.LJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: LJ */
    private final void m15629LJ() {
        int i;
        View view;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        Object obj = dataCenter.get("data_is_media_replay");
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (((Boolean) obj).booleanValue()) {
            C146239ezh c146239ezh = new C146239ezh();
            View view2 = this.contentView;
            if (view2 != null) {
                c146239ezh.LIZ((ConstraintLayout) view2);
                if (C412982We.LIZIZ.LIZ()) {
                    i = 2131182691;
                } else {
                    i = 2131191116;
                }
                int LIZLLL = LK5.LIZLLL(2131429304);
                View view3 = this.LJIIL;
                if (view3 != null) {
                    view3.setPadding(0, 0, LIZLLL, 0);
                }
                if (!isScreenPortrait()) {
                    if (C412982We.LIZIZ.LIZ()) {
                        i = 2131182691;
                    } else {
                        i = 2131182822;
                    }
                    if (C412982We.LIZIZ.LIZ()) {
                        view = this.LJII;
                    } else {
                        view = this.LIZLLL;
                    }
                    final View view4 = view;
                    if (view4 != null) {
                        view4.post(new Runnable() { // from class: X.3cW
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(32478);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                UIUtils.updateLayoutMargin(view4, LK1.LIZLLL(34), -3, -3, -3);
                            }
                        });
                    }
                }
                c146239ezh.LIZ(2131182839, 3, i, 3);
                c146239ezh.LIZ(2131182839, 4, i, 4);
                c146239ezh.LIZIZ((ConstraintLayout) this.contentView);
                View view5 = this.LJIIL;
                if (view5 != null) {
                    view5.setVisibility(0);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
        View view6 = this.LJIIL;
        if (view6 != null) {
            view6.setVisibility(8);
        }
    }

    public final float LIZLLL() {
        View view;
        View view2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (isScreenPortrait()) {
            int LIZLLL = LK5.LIZLLL(2131429306);
            int LIZLLL2 = LK5.LIZLLL(2131429306);
            Intrinsics.checkNotNullExpressionValue(this.contentView, "");
            float width = (view2.getWidth() - LIZLLL2) - (LIZLLL * 1.0f);
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            Object obj = dataCenter.get("data_is_media_replay");
            if (obj == null) {
                obj = Boolean.FALSE;
            }
            if (((Boolean) obj).booleanValue()) {
                return (width - LK5.LIZLLL(2131429305)) - LK5.LIZLLL(2131429304);
            }
            return width;
        } else if (C412982We.LIZIZ.LIZ()) {
            Intrinsics.checkNotNullExpressionValue(this.contentView, "");
            return view.getWidth() - LK1.LIZJ(270);
        } else {
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            float width2 = view3.getWidth();
            DataCenter dataCenter2 = this.dataCenter;
            if (dataCenter2 != null) {
                Object obj2 = dataCenter2.get("data_is_media_replay");
                if (obj2 == null) {
                    obj2 = Boolean.FALSE;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return (width2 - LK5.LIZLLL(2131429305)) - LK5.LIZLLL(2131429304);
                }
                return width2;
            }
            return width2;
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 1).isSupported && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey())) {
            String key = kVData2.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -1672663294) {
                if (hashCode != 956730793) {
                    if (hashCode == 1511434086 && key.equals("data_room_short_title")) {
                        LIZ();
                    }
                } else if (key.equals("data_room_title")) {
                    LIZ();
                }
            } else if (key.equals("data_is_media_replay")) {
                m15629LJ();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean bool;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 12).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_media_introduction_showing", (String) Boolean.FALSE)) != null && bool.booleanValue()) {
            AbstractC441033cX abstractC441033cX = this.LIZJ;
            if (abstractC441033cX != null) {
                abstractC441033cX.LIZIZ();
                return;
            }
            return;
        }
        AbstractC441033cX abstractC441033cX2 = this.LIZJ;
        if (abstractC441033cX2 != null) {
            abstractC441033cX2.LIZ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            C4574547f.LIZ().LIZ("livesdk_click_room_title", C8668v.class, Room.class);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (C412982We.LIZIZ.LIZ()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                    TextView textView = (TextView) this.contentView.findViewById(2131182846);
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    TextView textView2 = (TextView) this.contentView.findViewById(2131182822);
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    FadingEdgeHorizontalScrollView fadingEdgeHorizontalScrollView = (FadingEdgeHorizontalScrollView) this.contentView.findViewById(2131191116);
                    if (fadingEdgeHorizontalScrollView != null) {
                        fadingEdgeHorizontalScrollView.setVisibility(8);
                    }
                }
                this.LJII = (MarqueeTextView) this.contentView.findViewById(2131182691);
                MarqueeTextView marqueeTextView = this.LJII;
                if (marqueeTextView != null) {
                    marqueeTextView.setVisibility(0);
                }
                MarqueeTextView marqueeTextView2 = this.LJII;
                if (marqueeTextView2 != null) {
                    marqueeTextView2.setTextSize(1, 19.0f);
                }
                MarqueeTextView marqueeTextView3 = this.LJII;
                if (marqueeTextView3 != null) {
                    marqueeTextView3.setSpeed(LK1.LIZLLL(38));
                }
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                    C146239ezh c146239ezh = new C146239ezh();
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(2131170683);
                    c146239ezh.LIZ(constraintLayout);
                    c146239ezh.LIZ(2131182848, 1, 2131182691, 2);
                    c146239ezh.LIZ(2131182848, 3, 2131182691, 3);
                    c146239ezh.LIZ(2131182848, 4, 2131182691, 4);
                    c146239ezh.LIZIZ(constraintLayout);
                }
            }
        } else {
            this.LJIIJ = (TextView) this.contentView.findViewById(2131182846);
            this.LIZLLL = (TextView) this.contentView.findViewById(2131182822);
            FadingEdgeHorizontalScrollView fadingEdgeHorizontalScrollView2 = (FadingEdgeHorizontalScrollView) this.contentView.findViewById(2131191116);
            if (fadingEdgeHorizontalScrollView2 != null) {
                fadingEdgeHorizontalScrollView2.setNeedLeftEdge(false);
            }
            this.f26520LJ = fadingEdgeHorizontalScrollView2;
        }
        this.LJIIJJI = this.contentView.findViewById(2131182848);
        this.LJIIL = this.contentView.findViewById(2131182839);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 8).isSupported) {
            return;
        }
        FadingEdgeHorizontalScrollView fadingEdgeHorizontalScrollView = this.f26520LJ;
        if (fadingEdgeHorizontalScrollView != null) {
            fadingEdgeHorizontalScrollView.scrollTo(0, 0);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            room = (Room) dataCenter.get("data_room", (String) null);
        } else {
            room = null;
        }
        this.LIZIZ = room;
        if (!isScreenPortrait()) {
            View view = this.LJIIJJI;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView = this.LJIIJ;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.LIZLLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            View view2 = this.LJIIJJI;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TextView textView3 = this.LJIIJ;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.LIZLLL;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        if (isScreenPortrait()) {
            View view3 = this.contentView;
            if (view3 != null) {
                view3.setOnClickListener(this);
            }
            TextView textView5 = this.LJIIJ;
            if (textView5 != null) {
                textView5.setOnClickListener(this);
            }
            MarqueeTextView marqueeTextView = this.LJII;
            if (marqueeTextView != null) {
                marqueeTextView.setOnClickListener(new MediaTitleWidget$onLoad$1(this));
            }
        } else {
            View view4 = this.contentView;
            if (view4 != null) {
                view4.setOnClickListener(null);
            }
            MarqueeTextView marqueeTextView2 = this.LJII;
            if (marqueeTextView2 != null) {
                marqueeTextView2.setOnClickListener(MediaTitleWidget$onLoad$2.INSTANCE);
            }
        }
        LIZ();
        m15629LJ();
        this.dataCenter.observe("data_room_title", this).observe("data_is_media_replay", this).observe("data_room_short_title", this);
        Consumer<C5983ak> consumer = new Consumer<C5983ak>() { // from class: X.3cT
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32475);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5983ak c5983ak) {
                C5983ak c5983ak2 = c5983ak;
                if (!PatchProxy.proxy(new Object[]{c5983ak2}, this, LIZ, false, 1).isSupported) {
                    if (c5983ak2.LIZIZ) {
                        UIUtils.updateLayoutMargin(MediaTitleWidget.this.LIZLLL, -3, -3, LK1.LIZLLL(270), -3);
                    } else {
                        UIUtils.updateLayoutMargin(MediaTitleWidget.this.LIZLLL, -3, -3, LK1.LIZLLL(300), -3);
                    }
                    MediaTitleWidget.this.LIZ();
                }
            }
        };
        if (!PatchProxy.proxy(new Object[]{C5983ak.class, consumer}, this, LIZ, false, 9).isSupported) {
            ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C5983ak.class).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(consumer);
        }
    }

    public final String LIZ(String str, int i, Paint paint) {
        float f;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), paint}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("...");
        while (true) {
            f = i;
            if (paint.measureText(sb.toString()) >= f) {
                break;
            }
            sb.append(LoggerUtil.BLANK_TAG);
        }
        if (paint.measureText(sb.toString()) >= f) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        return sb2;
    }
}
