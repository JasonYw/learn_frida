package com.bytedance.android.live.broadcast.videocast;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.IP3;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcast.videocast.d */
/* loaded from: classes3.dex */
public final class C3251d {
    public static ChangeQuickRedirect LIZ;
    public Dialog LIZIZ;
    public final VideoPlayControlWidget LIZJ;
    public int LIZLLL = -1;

    /* renamed from: LJ */
    public int f25952LJ = -1;
    public int LJFF;
    public int LJI;
    public View LJII;

    static {
        Covode.recordClassIndex(18076);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Dialog dialog = this.LIZIZ;
        if (dialog != null) {
            C116971W2r.LIZ(dialog);
        }
        this.LIZIZ = null;
    }

    public C3251d(VideoPlayControlWidget videoPlayControlWidget) {
        C106862S5w.LIZ(videoPlayControlWidget);
        this.LIZJ = videoPlayControlWidget;
    }

    private final ImageView LIZ(Context context) {
        MethodCollector.m14708i(1341);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            ImageView imageView = (ImageView) proxy.result;
            MethodCollector.m14707o(1341);
            return imageView;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2130857977);
        MethodCollector.m14707o(1341);
        return imageView2;
    }

    public final void LIZIZ(FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(frameLayout);
        LIZ(frameLayout, false);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = this.LJFF;
            marginLayoutParams.bottomMargin = this.LJI;
            marginLayoutParams.width = this.LIZLLL;
            marginLayoutParams.height = this.f25952LJ;
            frameLayout.setLayoutParams(marginLayoutParams);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                View view = this.LIZJ.contentView;
                view.animate().alpha(0.0f).setDuration(100L).setListener(new IP3(this, view)).start();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void LIZ(FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(frameLayout);
        LIZ(frameLayout, true);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.LJFF = marginLayoutParams.rightMargin;
            this.LJI = marginLayoutParams.bottomMargin;
            this.LIZLLL = frameLayout.getWidth();
            this.f25952LJ = frameLayout.getHeight();
            int LIZLLL = LK1.LIZLLL(13);
            int LIZLLL2 = LK1.LIZLLL(29);
            int LIZLLL3 = LK1.LIZLLL(108);
            int LIZLLL4 = LK1.LIZLLL(201);
            marginLayoutParams.rightMargin = LIZLLL;
            marginLayoutParams.bottomMargin = LIZLLL2;
            marginLayoutParams.width = LIZLLL3;
            marginLayoutParams.height = LIZLLL4;
            frameLayout.setLayoutParams(marginLayoutParams);
            LIZ(frameLayout, true);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                View view = this.LIZJ.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setTranslationX(130.0f);
                view.setVisibility(0);
                view.setAlpha(1.0f);
                view.animate().translationX(0.0f).setDuration(660L).setStartDelay(400L).start();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void LIZ(FrameLayout frameLayout, boolean z) {
        ViewGroup LIZLLL;
        MethodCollector.m14708i(1340);
        if (PatchProxy.proxy(new Object[]{frameLayout, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1340);
            return;
        }
        View view = this.LJII;
        if (view != null && (LIZLLL = LK1.LIZLLL(view)) != null) {
            LIZLLL.removeView(this.LJII);
        }
        if (!z) {
            MethodCollector.m14707o(1340);
            return;
        }
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LJII = LIZ(context);
        frameLayout.addView(this.LJII, -1, -1);
        MethodCollector.m14707o(1340);
    }
}
