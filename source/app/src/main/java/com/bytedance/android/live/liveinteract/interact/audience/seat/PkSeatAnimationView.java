package com.bytedance.android.live.liveinteract.interact.audience.seat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.SeatAnimTaskState;
import com.bytedance.android.livesdk.chatroom.p518ui.DynamicEmojiView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.HJO;
import p003X.HJP;
import p003X.HJU;
import p003X.I0Z;

/* loaded from: classes3.dex */
public final class PkSeatAnimationView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public HJO LIZIZ;
    public View LIZJ;
    public DynamicEmojiView LIZLLL;

    /* renamed from: LJ */
    public HSImageView f26325LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    static {
        Covode.recordClassIndex(27404);
    }

    public PkSeatAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PkSeatAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final DynamicEmojiView getDynamicEmojiView() {
        return this.LIZLLL;
    }

    public final HSImageView getEmojiMaskLayer() {
        return this.f26325LJ;
    }

    public final SeatAnimTaskState getTaskState() {
        HJO hjo = this.LIZIZ;
        if (hjo != null) {
            return hjo.LIZIZ;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    public final void LIZ(HJU hju) {
        if (PatchProxy.proxy(new Object[]{hju}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(hju);
        HJO hjo = this.LIZIZ;
        if (hjo != null) {
            hjo.LIZ(hju);
        }
    }

    public final void setEmojiCallback(I0Z i0z) {
        if (PatchProxy.proxy(new Object[]{i0z}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(i0z);
        DynamicEmojiView dynamicEmojiView = this.LIZLLL;
        if (dynamicEmojiView != null) {
            dynamicEmojiView.setEmojiAnimCallback(i0z);
        }
    }

    public final void setTaskChain(HJP hjp) {
        if (PatchProxy.proxy(new Object[]{hjp}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(hjp);
        HJO hjo = this.LIZIZ;
        if (hjo != null && !PatchProxy.proxy(new Object[]{hjp}, hjo, HJO.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(hjp);
            hjo.LIZJ = hjp;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkSeatAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1876);
        MethodCollector.m14707o(1876);
    }

    public final void LIZ(View view, int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 10).isSupported && view != null) {
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

    public /* synthetic */ PkSeatAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
