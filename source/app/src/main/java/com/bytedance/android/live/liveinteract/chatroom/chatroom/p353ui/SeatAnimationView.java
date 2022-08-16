package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.SeatAnimTaskState;
import com.bytedance.android.livesdk.chatroom.p518ui.DynamicEmojiView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81014HwW;
import p003X.AbstractC81047Hx3;
import p003X.AbstractC81060HxG;
import p003X.C106862S5w;
import p003X.C78571GyD;
import p003X.C80847Htp;
import p003X.C80848Htq;
import p003X.C80852Htu;
import p003X.C80899Huf;
import p003X.C80963Hvh;
import p003X.C81033Hwp;
import p003X.C81061HxH;
import p003X.C81105Hxz;
import p003X.I0Z;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.SeatAnimationView */
/* loaded from: classes3.dex */
public final class SeatAnimationView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public C80847Htp LIZIZ;
    public View LIZJ;
    public C80852Htu LIZLLL;

    /* renamed from: LJ */
    public LinkSucAnimationView f26296LJ;
    public DynamicEmojiView LJFF;
    public HSImageView LJI;
    public ViewGroup LJII;
    public HSImageView LJIIIIZZ;
    public KtvSeatAnimationView LJIIIZ;
    public FollowHintAnimationView LJIIJ;
    public AbstractC81060HxG LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;

    static {
        Covode.recordClassIndex(26423);
    }

    public SeatAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SeatAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final DynamicEmojiView getDynamicEmojiView() {
        return this.LJFF;
    }

    public final HSImageView getEmojiMaskLayer() {
        return this.LJI;
    }

    public final AbstractC81060HxG getLinkSucAnimCallback() {
        return this.LJIIJJI;
    }

    public final LinkSucAnimationView getLinkSucAnimView() {
        return this.f26296LJ;
    }

    public final void LIZ(C81105Hxz c81105Hxz) {
        if (PatchProxy.proxy(new Object[]{c81105Hxz}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81105Hxz);
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp == null) {
            return;
        }
        c80847Htp.LIZ(c81105Hxz);
    }

    public final void LIZ(C81061HxH c81061HxH) {
        if (PatchProxy.proxy(new Object[]{c81061HxH}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81061HxH);
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp == null) {
            return;
        }
        c80847Htp.LIZ(c81061HxH);
    }

    public final SeatAnimTaskState getTaskState() {
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp != null) {
            return c80847Htp.LIZIZ;
        }
        return null;
    }

    public final void LIZJ() {
        DynamicEmojiView dynamicEmojiView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (dynamicEmojiView = this.LJFF) != null) {
            dynamicEmojiView.LIZIZ();
        }
    }

    public final FollowHintAnimationView getFollowHintAnimationView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (FollowHintAnimationView) proxy.result;
        }
        FollowHintAnimationView followHintAnimationView = this.LJIIJ;
        if (followHintAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return followHintAnimationView;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        DynamicEmojiView dynamicEmojiView = this.LJFF;
        if (dynamicEmojiView == null) {
            return false;
        }
        return dynamicEmojiView.LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        C80852Htu c80852Htu = this.LIZLLL;
        if (c80852Htu != null && !PatchProxy.proxy(new Object[0], c80852Htu, C80852Htu.LIZ, false, 7).isSupported) {
            c80852Htu.LIZJ = true;
            if (c80852Htu.LIZIZ != null) {
                Disposable disposable2 = c80852Htu.LIZIZ;
                Intrinsics.checkNotNull(disposable2);
                if (!disposable2.isDisposed() && (disposable = c80852Htu.LIZIZ) != null) {
                    disposable.dispose();
                }
            }
        }
    }

    public final void LIZ() {
        int i;
        int i2;
        int i3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        int i4 = this.LJIIL;
        if (i4 != 0 && (i3 = this.LJIILIIL) != 0) {
            LIZ(this.f26296LJ, i4, i3);
        }
        int i5 = this.LJIILJJIL;
        if (i5 != 0 && (i2 = this.LJIILL) != 0) {
            LIZ(this.LJFF, i5, i2);
            LIZ(this.LJIIIIZZ, this.LJIILJJIL, this.LJIILL);
        }
        int i6 = this.LJIILLIIL;
        if (i6 != 0 && (i = this.LJIIZILJ) != 0) {
            LIZ(this.LJI, i6, i);
        }
    }

    public final void LIZ(float f) {
        C80852Htu c80852Htu;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 25).isSupported && (c80852Htu = this.LIZLLL) != null) {
            c80852Htu.LIZ(f);
        }
    }

    public final void setEmojiCallback(I0Z i0z) {
        if (PatchProxy.proxy(new Object[]{i0z}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(i0z);
        DynamicEmojiView dynamicEmojiView = this.LJFF;
        if (dynamicEmojiView != null) {
            dynamicEmojiView.setEmojiAnimCallback(i0z);
        }
    }

    public final void setFollowHintAnimationView(FollowHintAnimationView followHintAnimationView) {
        if (PatchProxy.proxy(new Object[]{followHintAnimationView}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(followHintAnimationView);
        this.LJIIJ = followHintAnimationView;
    }

    public final void setGuestAvatar(ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(imageView);
        LinkSucAnimationView linkSucAnimationView = this.f26296LJ;
        if (linkSucAnimationView != null) {
            linkSucAnimationView.setGuestAvatar(imageView);
        }
    }

    public final void setGuestName(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(textView);
        LinkSucAnimationView linkSucAnimationView = this.f26296LJ;
        if (linkSucAnimationView != null) {
            linkSucAnimationView.setGuestName(textView);
        }
    }

    public final void setLinkSucCallback(AbstractC81060HxG abstractC81060HxG) {
        if (PatchProxy.proxy(new Object[]{abstractC81060HxG}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC81060HxG);
        this.LJIIJJI = abstractC81060HxG;
        LinkSucAnimationView linkSucAnimationView = this.f26296LJ;
        if (linkSucAnimationView != null) {
            linkSucAnimationView.setCallback(abstractC81060HxG);
        }
    }

    public final void setTaskChain(C81033Hwp c81033Hwp) {
        if (PatchProxy.proxy(new Object[]{c81033Hwp}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81033Hwp);
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp != null && !PatchProxy.proxy(new Object[]{c81033Hwp}, c80847Htp, C80847Htp.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c81033Hwp);
            c80847Htp.LIZJ = c81033Hwp;
        }
    }

    public final void setSeatAnimTaskListener(AbstractC81014HwW abstractC81014HwW) {
        if (PatchProxy.proxy(new Object[]{abstractC81014HwW}, this, LIZ, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC81014HwW);
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp != null && !PatchProxy.proxy(new Object[]{abstractC81014HwW}, c80847Htp, C80847Htp.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(abstractC81014HwW);
            for (AbstractC81047Hx3 abstractC81047Hx3 = c80847Htp.LIZJ; abstractC81047Hx3 != null; abstractC81047Hx3 = abstractC81047Hx3.LIZ()) {
                if (abstractC81047Hx3 instanceof C80848Htq) {
                    C80848Htq c80848Htq = (C80848Htq) abstractC81047Hx3;
                    if (!PatchProxy.proxy(new Object[]{abstractC81014HwW}, c80848Htq, C80848Htq.LIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(abstractC81014HwW);
                        c80848Htq.LIZIZ = abstractC81014HwW;
                    }
                } else if (abstractC81047Hx3 instanceof C80899Huf) {
                    C80899Huf c80899Huf = (C80899Huf) abstractC81047Hx3;
                    if (!PatchProxy.proxy(new Object[]{abstractC81014HwW}, c80899Huf, C80899Huf.LIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(abstractC81014HwW);
                        c80899Huf.LIZJ = abstractC81014HwW;
                    }
                }
            }
        }
    }

    public final void LIZ(C80963Hvh c80963Hvh) {
        if (PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80963Hvh);
        C80847Htp c80847Htp = this.LIZIZ;
        if (c80847Htp != null) {
            c80847Htp.LIZ(c80963Hvh);
        }
    }

    public final void LIZ(int i, int i2) {
        this.LJIIL = i;
        this.LJIILIIL = i2;
    }

    public final void LIZIZ(int i, int i2) {
        this.LJIILJJIL = i;
        this.LJIILL = i2;
    }

    public final void LIZLLL(int i, int i2) {
        this.LJIILLIIL = i;
        this.LJIIZILJ = i2;
    }

    public final void LIZJ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 24).isSupported) {
            return;
        }
        LIZ(this.LJFF, i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeatAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1775);
        MethodCollector.m14707o(1775);
    }

    private final void LIZ(View view, int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 26).isSupported && view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, boolean z, boolean z2, List<Integer> list) {
        int LIZ2;
        LinkSucAnimationView linkSucAnimationView;
        DynamicEmojiView dynamicEmojiView;
        HSImageView hSImageView;
        MethodCollector.m14708i(1774);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1774);
            return;
        }
        Context context = getContext();
        HSImageView hSImageView2 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this, Integer.valueOf(i), Byte.valueOf((byte) z), Byte.valueOf((byte) z2), list, null, 16, null}, null, LIZ, true, 11);
        if (proxy.isSupported) {
            LIZ2 = ((Integer) proxy.result).intValue();
        } else {
            LIZ2 = LIZ(i, z, z2, list, -1);
        }
        this.LIZJ = FrameLayout.inflate(context, LIZ2, this);
        View view = this.LIZJ;
        if (view != null) {
            linkSucAnimationView = (LinkSucAnimationView) view.findViewById(2131180936);
        } else {
            linkSucAnimationView = null;
        }
        this.f26296LJ = linkSucAnimationView;
        View view2 = this.LIZJ;
        if (view2 != null) {
            dynamicEmojiView = (DynamicEmojiView) view2.findViewById(2131173139);
        } else {
            dynamicEmojiView = null;
        }
        this.LJFF = dynamicEmojiView;
        View view3 = this.LIZJ;
        if (view3 != null) {
            hSImageView = (HSImageView) view3.findViewById(2131173861);
        } else {
            hSImageView = null;
        }
        this.LJI = hSImageView;
        this.LIZLLL = new C80852Htu(this.LIZJ);
        this.LJIIIZ = (KtvSeatAnimationView) findViewById(2131180069);
        View view4 = this.LIZJ;
        if (view4 != null) {
            hSImageView2 = (HSImageView) view4.findViewById(2131176411);
        }
        this.LJIIIIZZ = hSImageView2;
        this.LIZIZ = new C80847Htp();
        C80847Htp c80847Htp = this.LIZIZ;
        Intrinsics.checkNotNull(c80847Htp);
        c80847Htp.LIZ(i, this.LJIIIIZZ, this.f26296LJ, this.LIZLLL, this.LJFF, this.LJI, this.LJIIIZ);
        LIZ();
        MethodCollector.m14707o(1774);
    }

    public /* synthetic */ SeatAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final int LIZ(int i, boolean z, boolean z2, List<Integer> list, Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list, num}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 8) {
                    if (i != 9) {
                        if (i != 12) {
                            if (i != 13) {
                                return 2131700527;
                            }
                            if (z2) {
                                return 2131700599;
                            }
                            return 2131700610;
                        } else if (C78571GyD.LIZIZ(list)) {
                            return 2131700600;
                        } else {
                            if (num != null && num.intValue() == 10) {
                                if (z) {
                                    return 2131700601;
                                }
                                return 2131700602;
                            }
                            return 2131700605;
                        }
                    }
                    return 2131700407;
                } else if (z2) {
                    return 2131700599;
                } else {
                    return 2131700610;
                }
            } else if (z) {
                return 2131700521;
            } else {
                if (z2) {
                    return 2131700514;
                }
                return 2131700517;
            }
        }
        return 2131700311;
    }

    public static /* synthetic */ void LIZ(SeatAnimationView seatAnimationView, int i, boolean z, boolean z2, List list, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{seatAnimationView, Integer.valueOf(i), (byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list, Integer.valueOf(i2), null}, null, LIZ, true, 4).isSupported) {
            return;
        }
        if ((i2 & 8) != 0) {
            list = null;
        }
        seatAnimationView.LIZ(i, false, z2, list);
    }
}
