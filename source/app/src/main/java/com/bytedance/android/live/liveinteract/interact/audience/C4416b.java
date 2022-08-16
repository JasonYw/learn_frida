package com.bytedance.android.live.liveinteract.interact.audience;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.FollowHintAnimationView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.interact.audience.C4416b;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g;
import com.bytedance.android.live.p482ui.LinkGuestSendGiftView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78574GyG;
import p003X.C79046HEa;
import p003X.C81294I2m;
import p003X.H63;
import p003X.H64;
import p003X.LK1;
import p003X.animation.InterpolatorC80602Hps;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.b */
/* loaded from: classes3.dex */
public final class C4416b extends FrameLayout implements o$b {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public View LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public TextView f26319LJ;
    public final DataCenter LJFF;
    public boolean LJI;
    public Disposable LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public final o$a LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public TextView LJIILJJIL;
    public View LJIILL;
    public LinkGuestSendGiftView LJIILLIIL;
    public boolean LJIIZILJ = true;
    public DialogFragment LJIJ;
    public boolean LJIJI;
    public FollowHintAnimationView LJIJJ;
    public final C4369e LJIJJLI;

    /* renamed from: com.bytedance.android.live.liveinteract.interact.audience.b$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4417a {
        static {
            Covode.recordClassIndex(27062);
        }
    }

    static {
        Covode.recordClassIndex(27061);
    }

    public final C4369e getMFollowHintAnimManager() {
        return this.LJIJJLI;
    }

    public final o$a getPresenter() {
        return this.LJIIJJI;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported || this.LJIJI) {
            return;
        }
        this.LJIJI = true;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4Fp
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27065);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    C4416b.this.setAlpha(((Float) animatedValue).floatValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        });
        duration.setInterpolator(new animation.InterpolatorC80602Hps(0.0f, 0.0f, 0.58f, 1.0f));
        duration.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Dialog dialog;
        DialogFragment dialogFragment;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIJJI.LIZ();
        Disposable disposable = this.LJII;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJII = null;
        DialogFragment dialogFragment2 = this.LJIJ;
        if (dialogFragment2 != null && (dialog = dialogFragment2.getDialog()) != null && dialog.isShowing() && (dialogFragment = this.LJIJ) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        this.LJIJ = null;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Room room;
        int i;
        MethodCollector.m14708i(1835);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1835);
            return;
        }
        super.onAttachedToWindow();
        View.inflate(getContext(), 2131700390, this);
        setOnClickListener(new H63(this));
        this.LJIILIIL = findViewById(2131184443);
        this.LJIILJJIL = (TextView) findViewById(2131184511);
        this.LIZIZ = (TextView) findViewById(2131171653);
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIILLIIL = (LinkGuestSendGiftView) findViewById(2131184503);
        LinkGuestSendGiftView linkGuestSendGiftView = this.LJIILLIIL;
        if (linkGuestSendGiftView != null) {
            if (this.LJIIZILJ) {
                i = 0;
            } else {
                i = 8;
            }
            linkGuestSendGiftView.setVisibility(i);
        }
        LinkGuestSendGiftView linkGuestSendGiftView2 = this.LJIILLIIL;
        if (linkGuestSendGiftView2 != null) {
            linkGuestSendGiftView2.setOnClickListener(new H64(this));
        }
        DataCenter dataCenter = this.LJFF;
        if (dataCenter != null && (room = (Room) dataCenter.get("data_room", (String) new Room())) != null && room.isThirdParty) {
            Object obj = this.LJFF.get("data_is_portrait", (String) Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            if (((Boolean) obj).booleanValue()) {
                TextView textView = this.LJIILJJIL;
                if (textView != null) {
                    textView.setTextSize(9.0f);
                }
                LinkGuestSendGiftView linkGuestSendGiftView3 = this.LJIILLIIL;
                if (linkGuestSendGiftView3 != null) {
                    linkGuestSendGiftView3.LIZ(LK1.LIZLLL(8), 8.0f);
                }
                UIUtils.updateLayout(this.LJIILLIIL, -3, LK1.LIZLLL(9));
                UIUtils.updateLayoutMargin(this.LJIILLIIL, 0, -3, -3, -3);
                UIUtils.updateLayoutMargin(findViewById(2131178014), LK1.LIZLLL(2), -3, LK1.LIZLLL(2), -3);
            }
        }
        findViewById(2131184502);
        this.LJIILL = findViewById(2131194352);
        this.LIZJ = findViewById(2131180909);
        this.f26319LJ = (TextView) findViewById(2131180908);
        this.LIZLLL = (HSImageView) findViewById(2131180906);
        this.LJIJJ = (FollowHintAnimationView) findViewById(2131175536);
        FollowHintAnimationView followHintAnimationView = this.LJIJJ;
        if (followHintAnimationView != null) {
            FollowHintAnimationView.LIZ(followHintAnimationView, 4, false, null, 4, null);
        }
        this.LJIIJJI.LIZ((o$a) this);
        LIZ(true);
        MethodCollector.m14707o(1835);
    }

    public final void setMicRoomHost(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(String str) {
        LinkGuestSendGiftView linkGuestSendGiftView;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported && (linkGuestSendGiftView = this.LJIILLIIL) != null) {
            linkGuestSendGiftView.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void setVisibility(boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(boolean z) {
        View view;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported && (view = this.LJIILIIL) != null) {
            if (z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public final void setIsOpenSendGift(boolean z) {
        Boolean bool;
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LJIIIIZZ) {
            DataCenter dataCenter = this.LJFF;
            if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_support_send_gift_to_official_channel_host", (String) Boolean.TRUE)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
        }
        LinkGuestSendGiftView linkGuestSendGiftView = this.LJIILLIIL;
        if (linkGuestSendGiftView == null) {
            this.LJIIZILJ = z;
        } else {
            linkGuestSendGiftView.setAllowSendGift(z);
        }
    }

    public final void LIZ(View view) {
        ViewParent parent;
        MethodCollector.m14708i(1836);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1836);
        } else if (view == null) {
            MethodCollector.m14707o(1836);
        } else {
            removeView(this.LJIIL);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.LJIIL = view;
            View view2 = this.LJIIL;
            if (view2 != null && (parent = view2.getParent()) != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.LJIIL);
            }
            addView(this.LJIIL, 0);
            MethodCollector.m14707o(1836);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if ((getChildAt(0) instanceof p003X.HGU) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        r1 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r0 = r11.LIZ();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        LIZ(new p003X.HGU(r1, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
        if (r0 != false) goto L34;
     */
    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.C4416b.LIZ(com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo):void");
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (this.LJIIJJI.LIZLLL()) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (!LIZ2.LIZJ()) {
                TextView textView = this.LIZIZ;
                if (textView != null) {
                    textView.setText("");
                }
                TextView textView2 = this.LIZIZ;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                }
                return;
            }
        }
        this.LJIIIZ = j;
        if (j == 0) {
            TextView textView3 = this.LIZIZ;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = this.LIZIZ;
            if (textView4 != null) {
                textView4.setVisibility(8);
                return;
            }
            return;
        }
        this.LJIIJ = j - j2;
        if (this.LJIIJ < 0) {
            this.LJIIJ = 0L;
        }
        LIZ(false, Long.valueOf(j2));
        TextView textView5 = this.LIZIZ;
        if (textView5 != null) {
            textView5.setText(C81294I2m.LIZLLL(this.LJIIJ));
        }
        TextView textView6 = this.LIZIZ;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        this.LJIIJJI.LIZ(this.LJIIJ);
        ALogger.m15797i("ttlive_link_paid", "updateCountDown remaining=" + this.LJIIJ + " expectLeave=" + j + " current=" + j2);
    }

    public final void LIZ(boolean z, Long l) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), l}, this, LIZ, false, 11).isSupported && this.LJIIJJI.LIZLLL()) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.LIZJ() && this.LJIIJ == 1) {
                if (z) {
                    C78574GyG.LIZIZ.LIZ(this.LJIIJ, this.LJIIIZ);
                } else {
                    C78574GyG.LIZIZ.LIZ(this.LJIIJ, this.LJIIIZ, l);
                }
                AbstractC4773g LIZ3 = AbstractC4773g.LJIIJJI.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZLLL("limit_time_up");
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4416b(Context context, o$a o_a, AbstractC4417a abstractC4417a, DataCenter dataCenter, C4369e c4369e) {
        super(context);
        C106862S5w.LIZ(context, o_a);
        MethodCollector.m14708i(1837);
        this.LJIIJJI = o_a;
        this.LJIJJLI = c4369e;
        this.LJFF = dataCenter;
        MethodCollector.m14707o(1837);
    }
}
