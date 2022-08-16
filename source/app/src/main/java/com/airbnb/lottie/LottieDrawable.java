package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import p002O.C0002O;
import p003X.AbstractC145234ejO;
import p003X.AbstractC145304ekW;
import p003X.AbstractC145346elC;
import p003X.C109178Syi;
import p003X.C109181Syl;
import p003X.C109494T9c;
import p003X.C115854Vj6;
import p003X.C115855Vj7;
import p003X.C145192eii;
import p003X.C145202eis;
import p003X.C145244ejY;
import p003X.C145301ekT;
import p003X.C145320ekm;
import p003X.C145323ekp;
import p003X.C145324ekq;
import p003X.C145326eks;
import p003X.C145328eku;
import p003X.C145329ekv;
import p003X.C145332eky;
import p003X.C145334el0;
import p003X.C145335el1;
import p003X.C145336el2;
import p003X.C145337el3;
import p003X.C145339el5;
import p003X.C145340el6;
import p003X.C145341el7;
import p003X.C145342el8;
import p003X.C145343el9;
import p003X.C145344elA;
import p003X.C531576zH;
import p003X.RunnableC109174Sye;
import p003X.RunnableC145302ekU;

/* loaded from: classes19.dex */
public class LottieDrawable extends Drawable implements Animatable, Drawable.Callback {
    public static final String TAG;
    public Animator.AnimatorListener animatorListener;
    public C109181Syl asyncDrawComponent;
    public LottieComposition composition;
    public C145244ejY compositionLayer;
    public C145324ekq drawFpsTracer;
    public boolean enableMergePaths;
    public FontAssetDelegate fontAssetDelegate;
    public C109494T9c fontAssetManager;
    public float frameWhenAnimationStart;
    public ImageAssetDelegate imageAssetDelegate;
    public C115855Vj7 imageAssetManager;
    public String imageAssetsFolder;
    public WeakReference<LottieAnimationView> mHost;
    public boolean performanceTrackingEnabled;
    public TextDelegate textDelegate;
    public final Matrix matrix = new Matrix();
    public final LottieValueAnimator animator = new LottieValueAnimator();
    public float scale = 1.0f;
    public final Set<Object> colorFilterData = new HashSet();
    public final ArrayList<AbstractC0822a> lazyCompositionTasks = new ArrayList<>();
    public boolean isDirty = false;
    public boolean safeMode = false;
    public boolean isExtraScaleEnabled = true;
    public int alpha = MotionEventCompat.ACTION_MASK;
    public boolean disableRecycleBitmaps = false;
    public final ValueAnimator.AnimatorUpdateListener progressUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.1
        static {
            Covode.recordClassIndex(3940);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MethodCollector.m14708i(312);
            C145323ekp.LIZIZ(LottieDrawable.this);
            if (LottieDrawable.this.compositionLayer != null) {
                LottieDrawable lottieDrawable = LottieDrawable.this;
                if (C145320ekm.LIZ) {
                    if (C145320ekm.LIZLLL == null) {
                        C145320ekm.LIZLLL = new Random();
                    }
                    if (C145320ekm.LIZLLL.nextFloat() < 0.01d) {
                        lottieDrawable.getHost();
                    }
                }
                if (C145328eku.LIZ && LottieDrawable.this.canAsyncBitmapDraw()) {
                    C109181Syl c109181Syl = LottieDrawable.this.asyncDrawComponent;
                    c109181Syl.LIZLLL = Float.valueOf(LottieDrawable.this.animator.LIZLLL());
                    c109181Syl.LIZ.invalidateSelf();
                    if (c109181Syl.LIZJ == null) {
                        c109181Syl.LIZJ = C531576zH.LIZ(c109181Syl.LIZ);
                    }
                    c109181Syl.LIZJ.post(c109181Syl.f12335LJ);
                    MethodCollector.m14707o(312);
                } else if (LottieDrawable.this.asyncDrawEnabled) {
                    synchronized (LottieDrawable.this.asyncLock) {
                        try {
                            LottieDrawable.this.compositionLayer.LIZ(LottieDrawable.this.animator.LIZLLL());
                        } finally {
                            MethodCollector.m14707o(312);
                        }
                    }
                } else {
                    LottieDrawable.this.compositionLayer.LIZ(LottieDrawable.this.animator.LIZLLL());
                }
            }
        }
    };
    public int bitmapSize = 0;
    public boolean isJustAfterAnimationStart = false;
    public Object asyncLock = new Object();
    public boolean asyncDrawEnabled = false;
    public Bitmap mLastBitmap = null;
    public int layoutWidth = 0;
    public int layoutHeight = 0;

    /* renamed from: com.airbnb.lottie.LottieDrawable$a */
    /* loaded from: classes19.dex */
    public interface AbstractC0822a {
        static {
            Covode.recordClassIndex(3957);
        }

        void LIZ();
    }

    public void disableExtraScaleModeInFitXY() {
        this.isExtraScaleEnabled = false;
    }

    public void disableRecycleBitmaps() {
        this.disableRecycleBitmaps = true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public C145244ejY getCompositionLayer() {
        return this.compositionLayer;
    }

    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public float getScale() {
        return this.scale;
    }

    public TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public boolean isAsyncDrawEnabled() {
        return this.asyncDrawEnabled;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public void stop() {
        endAnimation();
    }

    public void clearComposition() {
        clearCompositionWithoutInvalidateSelf();
        invalidateSelf();
    }

    public int getFrame() {
        return (int) this.animator.LIZJ;
    }

    public float getMaxFrame() {
        return this.animator.LJIIJ();
    }

    public float getMinFrame() {
        return this.animator.LJIIIZ();
    }

    public float getProgress() {
        return this.animator.LIZLLL();
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getSpeed() {
        return this.animator.LIZ;
    }

    public boolean isRunning() {
        return isAnimating();
    }

    public void reverseAnimationSpeed() {
        this.animator.m20540LJ();
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(3939);
        TAG = LottieDrawable.class.getSimpleName();
    }

    private boolean isLottieDrawableInUse() {
        LottieAnimationView host = getHost();
        if (host != null && host.getDrawable() == this) {
            return true;
        }
        return false;
    }

    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.LJI();
    }

    public LottieAnimationView getHost() {
        WeakReference<LottieAnimationView> weakReference = this.mHost;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    public boolean hasMasks() {
        C145244ejY c145244ejY = this.compositionLayer;
        if (c145244ejY != null && c145244ejY.m21438LJ()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isLooping() {
        if (this.animator.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.LJII();
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
        Animator.AnimatorListener animatorListener = this.animatorListener;
        if (animatorListener != null) {
            this.animator.addListener(animatorListener);
        }
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(3939);
        TAG = LottieDrawable.class.getSimpleName();
    }

    private void configErrorReportResId() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            String str = this.imageAssetsFolder;
            if (str != null) {
                lottieComposition.errorReportResId = str;
            }
            ImageAssetDelegate imageAssetDelegate = this.imageAssetDelegate;
            if (imageAssetDelegate != null) {
                this.composition.errorReportResId = imageAssetDelegate.getClass().getName();
            }
        }
    }

    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private C109494T9c getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            this.fontAssetManager = new C109494T9c(getCallback(), this.fontAssetDelegate);
        }
        return this.fontAssetManager;
    }

    public void buildCompositionLayer() {
        this.compositionLayer = new C145244ejY(this, C145202eis.LIZ(this.composition), this.composition.getLayers(), this.composition);
        if (C145328eku.LIZ) {
            checkLottieSize();
        }
    }

    public void cancelAnimation() {
        if (this.asyncDrawEnabled) {
            C109181Syl c109181Syl = this.asyncDrawComponent;
            if (c109181Syl != null) {
                c109181Syl.LIZIZ();
                this.asyncDrawComponent.LIZ();
            }
            this.mLastBitmap = null;
        }
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.getBounds().height() * getScale());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.getBounds().width() * getScale());
    }

    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C145344elA(this));
        } else {
            this.animator.LJFF();
        }
    }

    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C145339el5(this));
        } else {
            this.animator.LJIIIIZZ();
        }
    }

    public void start() {
        if (C145328eku.LIZ) {
            Drawable.Callback callback = getCallback();
            if ((callback instanceof View) && !((View) callback).isInEditMode()) {
                playAnimation();
                return;
            }
            return;
        }
        playAnimation();
    }

    public boolean useTextGlyphs() {
        if (this.textDelegate == null && this.composition.getCharacters().size() > 0) {
            return true;
        }
        return false;
    }

    private boolean boundsMatchesCompositionAspectRatio() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null || getBounds().isEmpty() || lottieComposition.getBounds().isEmpty() || aspectRatio(getBounds()) == aspectRatio(lottieComposition.getBounds())) {
            return true;
        }
        return false;
    }

    private void clearCompositionWithoutInvalidateSelf() {
        recycleBitmaps();
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        LottieValueAnimator lottieValueAnimator = this.animator;
        lottieValueAnimator.LJFF = null;
        lottieValueAnimator.LIZLLL = -2.14748365E9f;
        lottieValueAnimator.f21092LJ = 2.14748365E9f;
    }

    private void updateBounds() {
        if (C145328eku.LIZ || this.composition == null) {
            return;
        }
        float scale = getScale();
        setBounds(0, 0, (int) (this.composition.getBounds().width() * scale), (int) (this.composition.getBounds().height() * scale));
    }

    public boolean canAsyncBitmapDraw() {
        boolean z;
        if (this.asyncDrawEnabled && isLottieDrawableInUse() && isRunning()) {
            z = true;
        } else {
            z = false;
        }
        if (this.isJustAfterAnimationStart) {
            if (z) {
                if (this.animator.LIZJ == this.frameWhenAnimationStart) {
                    return false;
                }
                this.isJustAfterAnimationStart = false;
                return z;
            }
            this.isJustAfterAnimationStart = false;
            return z;
        }
        return z;
    }

    public void checkLottieSize() {
        C145244ejY c145244ejY;
        int i;
        if (C145328eku.LIZ && C145328eku.LIZLLL && this.asyncDrawEnabled && (c145244ejY = this.compositionLayer) != null) {
            int i2 = 0;
            if (c145244ejY.LIZJ == null) {
                i = 0;
            } else {
                i = c145244ejY.LIZJ.LJIILIIL;
            }
            C145244ejY c145244ejY2 = this.compositionLayer;
            if (c145244ejY2.LIZJ != null) {
                i2 = c145244ejY2.LIZJ.LJIILJJIL;
            }
            int i3 = 1500750;
            if (C115854Vj6.LIZ) {
                i3 = 1000500;
            }
            if (i > 0 && i2 > 0 && i * i2 >= i3) {
                disableAsyncDraw();
            }
        }
    }

    public void disableAsyncDraw() {
        LottieAnimationView lottieAnimationView;
        if (this.asyncDrawEnabled) {
            this.asyncDrawEnabled = false;
            WeakReference<LottieAnimationView> weakReference = this.mHost;
            if (weakReference != null && (lottieAnimationView = weakReference.get()) != null) {
                lottieAnimationView.onAsyncDrawEnableChanged();
            }
            C109181Syl c109181Syl = this.asyncDrawComponent;
            if (c109181Syl != null) {
                c109181Syl.LIZIZ();
                this.asyncDrawComponent.LIZ();
            }
            if (this.mLastBitmap != null) {
                this.mLastBitmap = null;
            }
        }
    }

    public Bitmap getDrawingBitmap() {
        C109181Syl c109181Syl = this.asyncDrawComponent;
        if (c109181Syl != null) {
            Bitmap bitmap = this.mLastBitmap;
            Bitmap LIZ = C109178Syi.LIZ(c109181Syl.LIZ);
            if (LIZ != null) {
                if (bitmap != null && c109181Syl.LIZJ != null) {
                    c109181Syl.LIZJ.post(new RunnableC109174Sye(c109181Syl, bitmap));
                }
                C145323ekp.LIZ(c109181Syl.LIZ, true);
                bitmap = LIZ;
            } else {
                C145323ekp.LIZ(c109181Syl.LIZ, false);
            }
            this.mLastBitmap = bitmap;
            this.isDirty = false;
            return bitmap;
        }
        return null;
    }

    public void recycleBitmaps() {
        if (this.asyncDrawEnabled) {
            C109181Syl c109181Syl = this.asyncDrawComponent;
            if (c109181Syl != null) {
                c109181Syl.LIZIZ();
                this.asyncDrawComponent.LIZ();
            }
            this.mLastBitmap = null;
            C115855Vj7 c115855Vj7 = this.imageAssetManager;
            if (c115855Vj7 != null) {
                c115855Vj7.LIZIZ();
                return;
            }
            return;
        }
        C115855Vj7 c115855Vj72 = this.imageAssetManager;
        if (c115855Vj72 != null) {
            c115855Vj72.LIZ();
        }
    }

    public LottieDrawable() {
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public boolean hasMatte() {
        C145244ejY c145244ejY = this.compositionLayer;
        if (c145244ejY != null) {
            if (c145244ejY.LJIIIIZZ == null) {
                if (c145244ejY.LIZJ()) {
                    c145244ejY.LJIIIIZZ = Boolean.TRUE;
                    return true;
                }
                for (int size = c145244ejY.LJII.size() - 1; size >= 0; size--) {
                    if (c145244ejY.LJII.get(size).LIZJ()) {
                        c145244ejY.LJIIIIZZ = Boolean.TRUE;
                        return true;
                    }
                }
                c145244ejY.LJIIIIZZ = Boolean.FALSE;
            }
            if (c145244ejY.LJIIIIZZ.booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (!C145328eku.LIZ && !this.asyncDrawEnabled) {
            if (callback != null) {
                callback.invalidateDrawable(this);
                if (C145320ekm.LIZ) {
                    C145323ekp.LIZJ(this);
                }
            }
        } else if (this.isDirty) {
        } else {
            this.isDirty = true;
            if (callback != null) {
                try {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        callback.invalidateDrawable(this);
                        if (C145320ekm.LIZ) {
                            C145323ekp.LIZJ(this);
                        }
                    } else if (callback instanceof View) {
                        ((View) callback).postInvalidate();
                        if (C145320ekm.LIZ) {
                            C145323ekp.LIZJ(this);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private C115855Vj7 getImageAssetManager() {
        Context context;
        MethodCollector.m14708i(314);
        if (getCallback() == null) {
            MethodCollector.m14707o(314);
            return null;
        }
        C115855Vj7 c115855Vj7 = this.imageAssetManager;
        if (c115855Vj7 != null && (((context = getContext()) != null || c115855Vj7.LIZ != null) && ((c115855Vj7.LIZ == null || !c115855Vj7.LIZ.equals(context)) && !this.disableRecycleBitmaps))) {
            if (this.asyncDrawEnabled) {
                this.imageAssetManager.LIZIZ();
            } else {
                this.imageAssetManager.LIZ();
            }
            this.imageAssetManager = null;
        }
        if (this.imageAssetManager == null) {
            if (this.asyncDrawEnabled) {
                synchronized (this.asyncLock) {
                    try {
                        if (this.imageAssetManager == null) {
                            C115854Vj6.LIZ(getContext());
                            this.imageAssetManager = new C115855Vj7(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.getImages(), this.disableRecycleBitmaps);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m14707o(314);
                        throw th;
                    }
                }
            } else {
                C115854Vj6.LIZ(getContext());
                this.imageAssetManager = new C115855Vj7(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.getImages(), this.disableRecycleBitmaps);
            }
        }
        C115855Vj7 c115855Vj72 = this.imageAssetManager;
        MethodCollector.m14707o(314);
        return c115855Vj72;
    }

    public void setCompositionCompositionLayerAfter() {
        boolean z;
        LottieValueAnimator lottieValueAnimator = this.animator;
        LottieComposition lottieComposition = this.composition;
        if (lottieValueAnimator.LJFF == null) {
            z = true;
        } else {
            z = false;
        }
        lottieValueAnimator.LJFF = lottieComposition;
        if (z) {
            lottieValueAnimator.LIZ((int) Math.max(lottieValueAnimator.LIZLLL, lottieComposition.getStartFrame()), (int) Math.min(lottieValueAnimator.f21092LJ, lottieComposition.getEndFrame()));
        } else {
            lottieValueAnimator.LIZ((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        lottieValueAnimator.LIZ((int) lottieValueAnimator.LIZJ);
        if (!C145328eku.LIZ) {
            lottieValueAnimator.LIZIZ = System.nanoTime();
        }
        setProgress(this.animator.getAnimatedFraction());
        setScale(this.scale);
        updateBounds();
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            AbstractC0822a abstractC0822a = (AbstractC0822a) it.next();
            if (abstractC0822a != null) {
                abstractC0822a.LIZ();
            }
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        this.composition.setPerformanceTrackingEnabled(this.performanceTrackingEnabled);
    }

    public void setImagesAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public void setSafeMode(boolean z) {
        this.safeMode = z;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public void setRepeatCount(int i) {
        this.animator.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.animator.setRepeatMode(i);
    }

    public void setScale(float f) {
        this.scale = f;
        updateBounds();
    }

    public void setSpeed(float f) {
        this.animator.LIZ = f;
    }

    private float aspectRatio(Rect rect) {
        return rect.width() / rect.height();
    }

    public boolean checkCompositionChanged(LottieComposition lottieComposition) {
        LottieComposition lottieComposition2 = this.composition;
        if (lottieComposition2 != null && lottieComposition2 == lottieComposition) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    public void loop(boolean z) {
        int i;
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieValueAnimator.setRepeatCount(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
        if (C145328eku.LIZ) {
            invalidateSelf();
        }
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.fontAssetDelegate = fontAssetDelegate;
        C109494T9c c109494T9c = this.fontAssetManager;
        if (c109494T9c != null) {
            c109494T9c.f12409LJ = fontAssetDelegate;
        }
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.imageAssetDelegate = imageAssetDelegate;
        C115855Vj7 c115855Vj7 = this.imageAssetManager;
        if (c115855Vj7 != null) {
            c115855Vj7.LIZIZ = imageAssetDelegate;
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z);
        }
    }

    public void drawNewVersion(Canvas canvas) {
        C0810L.beginSection("Drawable#draw");
        if (this.compositionLayer == null) {
            return;
        }
        C0810L.beginSection("Drawable#draw");
        if (!this.safeMode && !C145328eku.LJIIIZ) {
            drawInternal(canvas);
        } else {
            try {
                drawInternal(canvas);
            } catch (Throwable unused) {
            }
        }
        C0810L.endSection("Drawable#draw");
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.enableMergePaths == z) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        this.enableMergePaths = z;
        if (this.composition != null) {
            buildCompositionLayer();
        }
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.compositionLayer == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.LIZ(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.composition == lottieComposition) {
            return false;
        }
        if (C145328eku.LIZ) {
            this.isDirty = false;
        }
        clearComposition();
        this.composition = lottieComposition;
        configErrorReportResId();
        buildCompositionLayer();
        setCompositionCompositionLayerAfter();
        return true;
    }

    public void setFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C145343el9(this, i));
        } else {
            this.animator.LIZ(i);
        }
    }

    public void setMaxFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C145341el7(this, i));
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.animator;
        lottieValueAnimator.LIZ((int) lottieValueAnimator.LIZLLL, i);
    }

    public void setMinFrame(int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C145340el6(this, i));
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.animator;
        lottieValueAnimator.LIZ(i, (int) lottieValueAnimator.f21092LJ);
    }

    private float getMaxScale(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.composition.getBounds().width(), canvas.getHeight() / this.composition.getBounds().height());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.isDirty = false;
        if (C145328eku.LIZ) {
            drawNewVersion(canvas);
        } else {
            drawOldVersion(canvas);
        }
        if (C145323ekp.LIZIZ) {
            C145324ekq c145324ekq = this.drawFpsTracer;
            if (c145324ekq != null) {
                c145324ekq.LIZJ();
            }
            if (C145323ekp.LIZ != null) {
                C145323ekp.LIZ.LIZJ();
            }
        }
    }

    public void drawInternal(Canvas canvas) {
        MethodCollector.m14708i(313);
        if (this.asyncDrawEnabled) {
            synchronized (this.asyncLock) {
                try {
                    if (!boundsMatchesCompositionAspectRatio()) {
                        drawWithNewAspectRatio(canvas);
                    } else {
                        drawWithOriginalAspectRatio(canvas);
                    }
                } finally {
                    MethodCollector.m14707o(313);
                }
            }
        } else if (!boundsMatchesCompositionAspectRatio()) {
            drawWithNewAspectRatio(canvas);
            MethodCollector.m14707o(313);
        } else {
            drawWithOriginalAspectRatio(canvas);
        }
    }

    public void setHost(LottieAnimationView lottieAnimationView) {
        if (C145328eku.LIZ && C145328eku.LIZLLL) {
            this.asyncDrawEnabled = true;
            this.mHost = new WeakReference<>(lottieAnimationView);
            Context context = lottieAnimationView.getContext();
            DisplayMetrics displayMetrics = null;
            if (context != null) {
                displayMetrics = context.getResources().getDisplayMetrics();
            }
            this.asyncDrawComponent = new C109181Syl(this, displayMetrics);
            this.animatorListener = new C145329ekv(this);
            this.animator.addListener(this.animatorListener);
        }
    }

    public void setMaxProgress(float f) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C145335el1(this, f));
        } else {
            setMaxFrame((int) C145192eii.LIZ(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f));
        }
    }

    public void setMinProgress(float f) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C145334el0(this, f));
        } else {
            setMinFrame((int) C145192eii.LIZ(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f));
        }
    }

    public void setProgress(float f) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C145337el3(this, f));
        } else {
            setFrame((int) C145192eii.LIZ(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f));
        }
    }

    private void drawWithNewAspectRatio(Canvas canvas) {
        if (this.compositionLayer == null) {
            return;
        }
        int i = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / this.composition.getBounds().width();
        float height = bounds.height() / this.composition.getBounds().height();
        if (this.isExtraScaleEnabled) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                float f = 1.0f / min;
                width /= f;
                height /= f;
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = bounds.width() / 2.0f;
                    float height2 = bounds.height() / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
        }
        this.matrix.reset();
        this.matrix.preScale(width, height);
        this.compositionLayer.LIZ(canvas, this.matrix, this.alpha);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    private void drawWithOriginalAspectRatio(Canvas canvas) {
        float f;
        if (this.compositionLayer == null) {
            return;
        }
        float f2 = this.scale;
        float maxScale = getMaxScale(canvas);
        if (f2 > maxScale) {
            f = this.scale / maxScale;
        } else {
            maxScale = f2;
            f = 1.0f;
        }
        int i = -1;
        if (f > 1.0f) {
            i = canvas.save();
            float width = this.composition.getBounds().width() / 2.0f;
            float height = this.composition.getBounds().height() / 2.0f;
            float f3 = width * maxScale;
            float f4 = height * maxScale;
            canvas.translate((getScale() * width) - f3, (getScale() * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.matrix.reset();
        this.matrix.preScale(maxScale, maxScale);
        this.compositionLayer.LIZ(canvas, this.matrix, this.alpha);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    public void drawOldVersion(Canvas canvas) {
        float f;
        C0810L.beginSection("Drawable#draw");
        if (this.compositionLayer == null) {
            return;
        }
        float f2 = this.scale;
        float maxScale = getMaxScale(canvas);
        if (f2 > maxScale) {
            f = this.scale / maxScale;
        } else {
            maxScale = f2;
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i > 0) {
            canvas.save();
            float width = this.composition.getBounds().width() / 2.0f;
            float height = this.composition.getBounds().height() / 2.0f;
            float f3 = width * maxScale;
            float f4 = height * maxScale;
            canvas.translate((getScale() * width) - f3, (getScale() * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.matrix.reset();
        this.matrix.preScale(maxScale, maxScale);
        this.compositionLayer.LIZ(canvas, this.matrix, this.alpha);
        C0810L.endSection("Drawable#draw");
        if (i > 0) {
            canvas.restore();
        }
    }

    public Bitmap getImageAsset(String str) {
        String str2;
        C115855Vj7 imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            return null;
        }
        if (C145328eku.LIZ) {
            try {
                return imageAssetManager.LIZ(str);
            } catch (IllegalStateException e) {
                Drawable.Callback callback = getCallback();
                if (callback != null && (callback instanceof LottieAnimationView)) {
                    str2 = ((LottieAnimationView) callback).getAnimationName();
                } else {
                    str2 = null;
                }
                if (this.safeMode || C145328eku.LJIIIZ || (C145328eku.LIZ && !C145320ekm.LIZ)) {
                    return null;
                }
                throw new IllegalStateException(C0002O.m25084C("animName:", str2, " message:", e.getMessage()));
            }
        }
        return imageAssetManager.LIZ(str);
    }

    public void setLayoutSize(int i, int i2) {
        this.layoutWidth = i;
        this.layoutHeight = i2;
    }

    private void buildCompositionLayerAsync(LottieComposition lottieComposition, AbstractC145304ekW abstractC145304ekW) {
        LottieTask.EXECUTOR.execute(new RunnableC145302ekU(this, lottieComposition, abstractC145304ekW));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new C145342el8(this, i, i2));
        } else {
            this.animator.LIZ(i, i2);
        }
    }

    public boolean setCompositionAsync(LottieComposition lottieComposition, AbstractC145346elC abstractC145346elC) {
        if (this.composition == lottieComposition) {
            if (abstractC145346elC != null) {
                abstractC145346elC.LIZ(false);
            }
            return false;
        }
        if (C145328eku.LIZ) {
            this.isDirty = false;
        }
        clearCompositionWithoutInvalidateSelf();
        this.composition = lottieComposition;
        configErrorReportResId();
        buildCompositionLayerAsync(lottieComposition, new C145326eks(this, lottieComposition, abstractC145346elC));
        return true;
    }

    public void setMinAndMaxProgress(float f, float f2) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C145336el2(this, f, f2));
        } else {
            setMinAndMaxFrame((int) C145192eii.LIZ(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f), (int) C145192eii.LIZ(this.composition.getStartFrame(), this.composition.getEndFrame(), f2));
        }
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        C115855Vj7 imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            return null;
        }
        if (bitmap == null) {
            LottieImageAsset lottieImageAsset = imageAssetManager.LIZJ.get(str);
            bitmap = lottieImageAsset.getBitmap();
            lottieImageAsset.setBitmap(null);
        } else if (C145328eku.LIZ) {
            Bitmap bitmap2 = imageAssetManager.LIZJ.get(str).getBitmap();
            imageAssetManager.LIZ(str, bitmap);
            bitmap = bitmap2;
        } else {
            imageAssetManager.LIZ(str, bitmap);
        }
        invalidateSelf();
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface getTypeface(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            X.T9c r2 = r5.getFontAssetManager()
            r3 = 0
            if (r2 == 0) goto L82
            X.T0A<java.lang.String> r0 = r2.LIZ
            r0.LIZ = r6
            r0.LIZIZ = r7
            java.util.Map<X.T0A<java.lang.String>, android.graphics.Typeface> r1 = r2.LIZIZ
            X.T0A<java.lang.String> r0 = r2.LIZ
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r2.LIZJ
            java.lang.Object r4 = r0.get(r6)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            if (r4 != 0) goto L58
            com.airbnb.lottie.FontAssetDelegate r0 = r2.f12409LJ
            if (r0 == 0) goto L2e
            com.airbnb.lottie.FontAssetDelegate r0 = r2.f12409LJ
            android.graphics.Typeface r3 = r0.fetchFont(r6)
        L2e:
            com.airbnb.lottie.FontAssetDelegate r0 = r2.f12409LJ
            if (r0 == 0) goto L42
            if (r3 != 0) goto L52
            com.airbnb.lottie.FontAssetDelegate r0 = r2.f12409LJ
            java.lang.String r1 = r0.getFontPath(r6)
            if (r1 == 0) goto L44
            android.content.res.AssetManager r0 = r2.LIZLLL
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r0, r1)
        L42:
            if (r3 != 0) goto L52
        L44:
            java.lang.String r1 = "fonts/"
            java.lang.String r0 = r2.LJFF
            java.lang.String r1 = p002O.C0002O.m25085C(r1, r6, r0)
            android.content.res.AssetManager r0 = r2.LIZLLL
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r0, r1)
        L52:
            r4 = r3
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r2.LIZJ
            r0.put(r6, r4)
        L58:
            r3 = 0
            java.lang.String r0 = "Italic"
            boolean r1 = r7.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r7.contains(r0)
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L7c
            r3 = 3
        L6a:
            int r0 = r4.getStyle()
            if (r0 == r3) goto L74
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
        L74:
            java.util.Map<X.T0A<java.lang.String>, android.graphics.Typeface> r1 = r2.LIZIZ
            X.T0A<java.lang.String> r0 = r2.LIZ
            r1.put(r0, r4)
            return r4
        L7c:
            r3 = 2
            goto L6a
        L7e:
            if (r0 == 0) goto L6a
            r3 = 1
            goto L6a
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.getTypeface(java.lang.String, java.lang.String):android.graphics.Typeface");
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) new C145301ekT(this, simpleLottieValueCallback));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new C145332eky(this, keyPath, t, lottieValueCallback));
            return;
        }
        if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().LIZ(t, lottieValueCallback);
        } else {
            List<KeyPath> resolveKeyPath = resolveKeyPath(keyPath);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).getResolvedElement().LIZ(t, lottieValueCallback);
            }
            if (resolveKeyPath.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (t == AbstractC145234ejO.LJIL) {
            setProgress(getProgress());
        }
    }
}
