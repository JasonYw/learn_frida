package com.bytedance.android.live.core.anim;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.live.core.anim.LiveDegradeFpsAnimator;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* loaded from: classes22.dex */
public class LiveDegradeFpsAnimator extends ValueAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mFpsConfig;
    public ValueAnimator.AnimatorUpdateListener mMainUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.live.core.anim.LiveDegradeFpsAnimator.1
        public static ChangeQuickRedirect LIZ;
        public long LIZJ;

        static {
            Covode.recordClassIndex(23285);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                return;
            }
            if (this.LIZJ % LiveDegradeFpsAnimator.this.mFpsConfig == 0 && LiveDegradeFpsAnimator.this.mUpdateListeners != null) {
                int size = LiveDegradeFpsAnimator.this.mUpdateListeners.size();
                for (int i = 0; i < size; i++) {
                    LiveDegradeFpsAnimator.this.mUpdateListeners.get(i).onAnimationUpdate(valueAnimator);
                }
            }
            this.LIZJ++;
        }
    };
    public ArrayList<ValueAnimator.AnimatorUpdateListener> mUpdateListeners;

    static {
        Covode.recordClassIndex(23284);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.removeAllUpdateListeners();
        ArrayList<ValueAnimator.AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.mUpdateListeners = null;
    }

    public LiveDegradeFpsAnimator() {
        this.mFpsConfig = 1L;
        if (LiveSettingKeys.LIVE_ANIMATOR_DEGRADE_FPS_OPT.getValue().intValue() > 0) {
            this.mFpsConfig = LiveSettingKeys.LIVE_ANIMATOR_DEGRADE_FPS_OPT.getValue().intValue();
        }
    }

    public LiveDegradeFpsAnimator setFpsConfig(int i) {
        if (i > 0) {
            this.mFpsConfig = i;
        }
        return this;
    }

    public static LiveDegradeFpsAnimator ofFloat(float... fArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fArr}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (LiveDegradeFpsAnimator) proxy.result;
        }
        LiveDegradeFpsAnimator liveDegradeFpsAnimator = new LiveDegradeFpsAnimator();
        liveDegradeFpsAnimator.setFloatValues(fArr);
        return liveDegradeFpsAnimator;
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (PatchProxy.proxy(new Object[]{animatorUpdateListener}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        if (this.mUpdateListeners == null) {
            this.mUpdateListeners = new ArrayList<>();
            super.addUpdateListener(this.mMainUpdateListener);
        }
        this.mUpdateListeners.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ArrayList<ValueAnimator.AnimatorUpdateListener> arrayList;
        if (PatchProxy.proxy(new Object[]{animatorUpdateListener}, this, changeQuickRedirect, false, 7).isSupported || (arrayList = this.mUpdateListeners) == null) {
            return;
        }
        arrayList.remove(animatorUpdateListener);
        if (this.mUpdateListeners.size() == 0) {
            super.removeUpdateListener(this.mMainUpdateListener);
            this.mUpdateListeners = null;
        }
    }

    public static LiveDegradeFpsAnimator ofObject(TypeEvaluator typeEvaluator, Object... objArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{typeEvaluator, objArr}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (LiveDegradeFpsAnimator) proxy.result;
        }
        LiveDegradeFpsAnimator liveDegradeFpsAnimator = new LiveDegradeFpsAnimator();
        liveDegradeFpsAnimator.setObjectValues(objArr);
        liveDegradeFpsAnimator.setEvaluator(typeEvaluator);
        return liveDegradeFpsAnimator;
    }

    public static final /* synthetic */ void lambda$ofFloat$0$LiveDegradeFpsAnimator(View view, String str, ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{view, str, valueAnimator}, null, changeQuickRedirect, true, 8).isSupported) {
            return;
        }
        callMethod(view, str, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static LiveDegradeFpsAnimator ofFloat(final View view, final String str, float... fArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str, fArr}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (LiveDegradeFpsAnimator) proxy.result;
        }
        LiveDegradeFpsAnimator liveDegradeFpsAnimator = new LiveDegradeFpsAnimator();
        liveDegradeFpsAnimator.setFloatValues(fArr);
        liveDegradeFpsAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, str) { // from class: X.4rL
            public static ChangeQuickRedirect LIZ;
            public final View LIZIZ;
            public final String LIZJ;

            static {
                Covode.recordClassIndex(23287);
            }

            {
                this.LIZIZ = view;
                this.LIZJ = str;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LiveDegradeFpsAnimator.lambda$ofFloat$0$LiveDegradeFpsAnimator(this.LIZIZ, this.LIZJ, valueAnimator);
            }
        });
        return liveDegradeFpsAnimator;
    }

    public static void callMethod(View view, String str, float f) {
        if (PatchProxy.proxy(new Object[]{view, str, Float.valueOf(f)}, null, changeQuickRedirect, true, 4).isSupported || view == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1225497657:
                if (!str.equals("translationX")) {
                    return;
                }
                view.setTranslationX(f);
                return;
            case -1225497656:
                if (!str.equals("translationY")) {
                    return;
                }
                view.setTranslationY(f);
                return;
            case -908189618:
                if (!str.equals("scaleX")) {
                    return;
                }
                view.setScaleX(f);
                return;
            case -908189617:
                if (!str.equals("scaleY")) {
                    return;
                }
                view.setScaleY(f);
                return;
            case 92909918:
                if (!str.equals("alpha")) {
                    return;
                }
                view.setAlpha(f);
                return;
            default:
                return;
        }
    }
}
