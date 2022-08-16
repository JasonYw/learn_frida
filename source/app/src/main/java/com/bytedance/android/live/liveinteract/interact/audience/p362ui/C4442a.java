package com.bytedance.android.live.liveinteract.interact.audience.p362ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.interact.audience.p362ui.C4442a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78301Gtr;
import p003X.C78888H7y;
import p003X.C78889H7z;
import p003X.M0Q;
import p003X.M0R;
import p003X.View$OnClickListenerC78262GtE;
import p003X.animation.InterpolatorC80602Hps;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.ui.a */
/* loaded from: classes3.dex */
public final class C4442a extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public View.OnClickListener LIZJ;
    public User LIZLLL;

    /* renamed from: LJ */
    public boolean f26326LJ;
    public final String LJFF = "https://lf3-webcastcdn-tos.douyinstatic.com/obj/live-android/interact_alert_bg.webp";
    public CompositeDisposable LJI = new CompositeDisposable();
    public HashMap LJII;

    static {
        Covode.recordClassIndex(27415);
    }

    public final View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CompositeDisposable getCompositeDisposable() {
        return this.LJI;
    }

    public final boolean getHasAnim() {
        return this.f26326LJ;
    }

    public final User getUser() {
        return this.LIZLLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.LJI.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        M0R.LIZ((ImageView) LIZIZ(2131168140), this.LJFF, 2131623937);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9HB
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27419);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MethodCollector.m14708i(1885);
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                    MethodCollector.m14707o(1885);
                    return;
                }
                C106862S5w.LIZ(valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    C4442a.this.setAlpha(floatValue);
                    C4442a.this.setScaleX(floatValue);
                    C4442a.this.setScaleY(floatValue);
                    if (floatValue == 0.0f) {
                        ViewParent parent = C4442a.this.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.removeView(C4442a.this);
                            MethodCollector.m14707o(1885);
                            return;
                        }
                    }
                    MethodCollector.m14707o(1885);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                MethodCollector.m14707o(1885);
                throw nullPointerException;
            }
        });
        duration.setInterpolator(new animation.InterpolatorC80602Hps(0.25f, 0.1f, 0.25f, 0.1f));
        duration.start();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9HC
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27420);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MethodCollector.m14708i(1886);
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                    MethodCollector.m14707o(1886);
                    return;
                }
                C106862S5w.LIZ(valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    C4442a.this.setAlpha(floatValue);
                    if (floatValue == 0.0f) {
                        ViewParent parent = C4442a.this.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.removeView(C4442a.this);
                            MethodCollector.m14707o(1886);
                            return;
                        }
                    }
                    MethodCollector.m14707o(1886);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                MethodCollector.m14707o(1886);
                throw nullPointerException;
            }
        });
        duration.setInterpolator(new animation.InterpolatorC80602Hps(0.0f, 0.0f, 0.58f, 1.0f));
        duration.start();
    }

    public final void setHasAnim(boolean z) {
        this.f26326LJ = z;
    }

    public final void setLoading(boolean z) {
        this.LIZIZ = z;
    }

    public final void setUser(User user) {
        this.LIZLLL = user;
    }

    public final void setAcceptClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(onClickListener);
        this.LIZJ = onClickListener;
    }

    public final void setCompositeDisposable(CompositeDisposable compositeDisposable) {
        if (PatchProxy.proxy(new Object[]{compositeDisposable}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(compositeDisposable);
        this.LJI = compositeDisposable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4442a(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1887);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            LayoutInflater.from(getContext()).inflate(2131700384, this);
        }
        MethodCollector.m14707o(1887);
    }

    public final void setCloseListener(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(onClickListener);
        ((ImageView) LIZIZ(2131166073)).setOnClickListener(onClickListener);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported || getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i2 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
            ValueAnimator duration = ValueAnimator.ofInt(i2, i2 + i).setDuration(300L);
            duration.addUpdateListener(new C78889H7z(this));
            duration.setInterpolator(new animation.InterpolatorC80602Hps(0.25f, 0.1f, 0.25f, 0.1f));
            duration.start();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void LIZ(User user) {
        ImageModel imageModel;
        long j;
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZLLL = user;
        ((LottieAnimationView) LIZIZ(2131167002)).setAnimation("connect_loading.json");
        ImageView imageView = (ImageView) LIZIZ(2131165566);
        String str = null;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        M0Q.LIZIZ(imageView, imageModel);
        TextView textView = (TextView) LIZIZ(2131184124);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (user != null) {
            str = user.getNickName();
        }
        textView.setText(str);
        ((TextView) LIZIZ(2131165721)).setOnClickListener(new View$OnClickListenerC78262GtE(this, user));
        C78301Gtr c78301Gtr = C78301Gtr.LIZIZ;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        C78301Gtr.LIZ(c78301Gtr, Long.valueOf(j), true, null, "seat", true, null, null, null, null, null, 992, null);
    }

    public final void LIZ(int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 8).isSupported && !this.f26326LJ) {
            ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(300L);
            duration.addUpdateListener(new C78888H7y(this));
            duration.setInterpolator(new animation.InterpolatorC80602Hps(0.25f, 0.1f, 0.25f, 0.1f));
            duration.start();
            this.f26326LJ = true;
        }
    }
}
