package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.p050e.a$b;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.json.JSONObject;
import p003X.AbstractC145234ejO;
import p003X.AbstractC145346elC;
import p003X.C138283cv1;
import p003X.C145320ekm;
import p003X.C145323ekp;
import p003X.C145327ekt;
import p003X.C145328eku;

/* loaded from: classes19.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final CacheStrategy DEFAULT_CACHE_STRATEGY;
    public static final String TAG;
    public String animationName;
    public int animationResId;
    public LottieComposition composition;
    public LottieTask compositionTask;
    public CacheStrategy defaultCacheStrategy;
    public boolean isInitialized;
    public final LottieListener<LottieComposition> loadedListener = new LottieListener<LottieComposition>() { // from class: com.airbnb.lottie.LottieAnimationView.1
        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                Covode.recordClassIndex(3905);
            } else {
                Covode.recordClassIndex(3905);
            }
        }

        @Override // com.airbnb.lottie.LottieListener
        public final /* synthetic */ void onResult(LottieComposition lottieComposition) {
            LottieAnimationView.this.setComposition(lottieComposition);
        }
    };
    public final LottieListener<Throwable> failureListener = new LottieListener<Throwable>(this) { // from class: com.airbnb.lottie.LottieAnimationView.2
        static {
            Covode.recordClassIndex(3906);
        }

        @Override // com.airbnb.lottie.LottieListener
        public final /* synthetic */ void onResult(Throwable th) {
            Throwable th2 = th;
            if (C145328eku.LIZ && ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                return;
            }
            C145327ekt.LIZ().LIZ(new IllegalStateException("Unable to parse composition", th2), LottieCompositionFactory.getCurCacheList());
        }
    };
    public final LottieDrawable lottieDrawable = new LottieDrawable();
    public boolean playAnimationWhenShown = false;
    public boolean playAnimationWhenDrawableNotThisLottie = false;
    public boolean resumeAnimationWhenDrawableNotThisLottie = false;
    public boolean wasAnimatingWhenNotShown = false;
    public boolean wasAnimatingWhenDetached = false;
    public boolean autoPlay = false;
    public boolean useHardwareLayer = false;
    public boolean hasSetUseHardwareLayer = false;
    public boolean disableRecycleBitmap = false;
    public RenderMode renderMode = RenderMode.AUTOMATIC;
    public boolean disableOptInit = false;
    public int buildDrawingCacheDepth = 0;
    public final Set<LottieOnCompositionLoadedListener> lottieOnCompositionLoadedListeners = new HashSet();
    public boolean forceMarkViewShown = false;
    public final Runnable playAction = new Runnable() { // from class: com.airbnb.lottie.LottieAnimationView.6
        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                Covode.recordClassIndex(3910);
            } else {
                Covode.recordClassIndex(3910);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (LottieAnimationView.this.isShown()) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.forceMarkViewShown = true;
                if (lottieAnimationView.playAnimationWhenShown) {
                    LottieAnimationView.this.playAnimation();
                } else if (LottieAnimationView.this.wasAnimatingWhenNotShown) {
                    LottieAnimationView.this.resumeAnimation();
                }
                LottieAnimationView.this.forceMarkViewShown = false;
            }
        }
    };

    public void disableOptInit() {
        this.disableOptInit = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        m20545x3e541d80(this, parcelable);
    }

    public String getAnimationName() {
        return this.animationName;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public boolean getUseHardwareAcceleration() {
        return this.useHardwareLayer;
    }

    public void onAsyncDrawEnableChanged() {
        enableOrDisableHardwareLayer();
    }

    public void disableAsyncDraw() {
        this.lottieDrawable.disableAsyncDraw();
    }

    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getScale() {
        return this.lottieDrawable.getScale();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isMergePathsEnabledForKitKatAndAbove();
    }

    public void recycleBitmaps() {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (lottieDrawable != null) {
            lottieDrawable.recycleBitmaps();
        }
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void useExperimentalHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    public void useHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            static {
                Covode.recordClassIndex(3915);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };
        public String LIZ;
        public int LIZIZ;
        public float LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public String f21080LJ;
        public int LJFF;
        public int LJI;

        static {
            Covode.recordClassIndex(3914);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readString();
            this.LIZJ = parcel.readFloat();
            this.LIZLLL = parcel.readInt() != 1 ? false : true;
            this.f21080LJ = parcel.readString();
            this.LJFF = parcel.readInt();
            this.LJI = parcel.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.LIZ);
            parcel.writeFloat(this.LIZJ);
            parcel.writeInt(this.LIZLLL ? 1 : 0);
            parcel.writeString(this.f21080LJ);
            parcel.writeInt(this.LJFF);
            parcel.writeInt(this.LJI);
        }
    }

    private boolean isLottieAttachedToWindow() {
        int i = Build.VERSION.SDK_INT;
        return isAttachedToWindow();
    }

    public void clearComposition() {
        this.composition = null;
        this.lottieDrawable.clearComposition();
    }

    public void disableRecycleBitmap() {
        this.disableRecycleBitmap = true;
        this.lottieDrawable.disableRecycleBitmaps();
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            return lottieComposition.getDuration();
        }
        return 0L;
    }

    public void resetFailureListener() {
        LottieTask lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeFailureListener(this.failureListener);
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(3904);
        DEFAULT_CACHE_STRATEGY = CacheStrategy.Weak;
        TAG = LottieAnimationView.class.getSimpleName();
    }

    private void cancelLoaderTask() {
        LottieTask lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeListener(this.loadedListener);
            this.compositionTask.removeFailureListener(this.failureListener);
        }
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(3904);
        DEFAULT_CACHE_STRATEGY = CacheStrategy.Weak;
        TAG = LottieAnimationView.class.getSimpleName();
    }

    private boolean isLottieTmpDetached() {
        if (!isLottieAttachedToWindow()) {
            return false;
        }
        View view = this;
        do {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return true;
            }
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        } while (view != null);
        return false;
    }

    private boolean isShownM() {
        if (C145328eku.LJIIJJI) {
            if (this.forceMarkViewShown || isShown()) {
                return true;
            }
            return false;
        } else if (getVisibility() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void cancelAnimation() {
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        removeCallbacks(this.playAction);
        this.lottieDrawable.cancelAnimation();
        enableOrDisableHardwareLayer();
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        removeCallbacks(this.playAction);
        this.lottieDrawable.pauseAnimation();
        enableOrDisableHardwareLayer();
    }

    public void startDrawFpsTracer() {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C145323ekp.LIZIZ) {
            if (lottieDrawable != null) {
                if (lottieDrawable.drawFpsTracer != null) {
                    lottieDrawable.drawFpsTracer.LIZ();
                }
            } else if (C145323ekp.LIZ == null) {
            } else {
                C145323ekp.LIZ.LIZ();
            }
        }
    }

    public void stopDrawFpsTracer() {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C145323ekp.LIZIZ) {
            if (lottieDrawable != null) {
                if (lottieDrawable.drawFpsTracer != null) {
                    lottieDrawable.drawFpsTracer.LIZIZ();
                }
            } else if (C145323ekp.LIZ != null) {
                C145323ekp.LIZ.LIZIZ();
            }
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$8 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C08188 {
        public static final /* synthetic */ int[] LIZ = new int[RenderMode.values().length];

        static {
            Covode.recordClassIndex(3912);
            try {
                LIZ[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes19.dex */
    public enum CacheStrategy {
        None,
        Weak,
        Strong;

        static {
            Covode.recordClassIndex(3913);
        }
    }

    private void enableOrDisableHardwareLayer() {
        boolean z;
        try {
            int i = 2;
            if (C145328eku.LIZ && !this.hasSetUseHardwareLayer && C145328eku.f19341LJ) {
                int i2 = C08188.LIZ[this.renderMode.ordinal()];
                if (i2 != 1 && (i2 == 2 || i2 != 3 || Build.VERSION.SDK_INT < 26)) {
                    i = 1;
                }
                if (C145328eku.LIZLLL && this.lottieDrawable.isAsyncDrawEnabled()) {
                    i = 1;
                }
                if (i != getLayerType()) {
                    setLayerType(i, null);
                    return;
                }
                return;
            }
            if (this.useHardwareLayer && this.lottieDrawable.isAnimating()) {
                z = true;
            } else {
                z = false;
            }
            if ((!C145328eku.LIZ || !C145328eku.LIZLLL || !this.lottieDrawable.isAsyncDrawEnabled()) && z) {
                setLayerType(i, null);
            }
            i = 1;
            setLayerType(i, null);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Integer num;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C145320ekm.LIZ) {
            StringBuilder sb = new StringBuilder("traceLottieViewOnDetachedFromWindow  {isShown=");
            sb.append(isShown());
            sb.append(" visibility:");
            sb.append(getVisibility());
            sb.append("  view=");
            sb.append(hashCode());
            sb.append(" drawable=");
            if (lottieDrawable != null) {
                num = Integer.valueOf(lottieDrawable.hashCode());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" visible:");
            sb.append(isShown());
            sb.append("}");
        }
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        if (!this.disableRecycleBitmap) {
            m20547xcd6a9bd(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = this.animationName;
        savedState.LIZIZ = this.animationResId;
        savedState.LIZJ = this.lottieDrawable.getProgress();
        if (C145328eku.LIZ) {
            if (this.lottieDrawable.isAnimating() || (!ViewCompat.isAttachedToWindow(this) && this.wasAnimatingWhenDetached)) {
                z = true;
            } else {
                z = false;
            }
            savedState.LIZLLL = z;
        } else {
            savedState.LIZLLL = this.lottieDrawable.isAnimating();
        }
        savedState.f21080LJ = this.lottieDrawable.getImageAssetsFolder();
        savedState.LJFF = this.lottieDrawable.getRepeatMode();
        savedState.LJI = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void playAnimation() {
        if (C145328eku.LIZ) {
            if (isShownM()) {
                Drawable drawable = getDrawable();
                LottieDrawable lottieDrawable = this.lottieDrawable;
                if (drawable != lottieDrawable) {
                    this.playAnimationWhenDrawableNotThisLottie = true;
                    return;
                } else {
                    lottieDrawable.playAnimation();
                    enableOrDisableHardwareLayer();
                }
            } else {
                if (C145328eku.LJIIJJI && isLottieTmpDetached()) {
                    removeCallbacks(this.playAction);
                    post(this.playAction);
                }
                this.playAnimationWhenShown = true;
            }
            this.playAnimationWhenDrawableNotThisLottie = false;
            this.resumeAnimationWhenDrawableNotThisLottie = false;
            return;
        }
        this.lottieDrawable.playAnimation();
        enableOrDisableHardwareLayer();
    }

    public void resumeAnimation() {
        if (C145328eku.LIZ) {
            if (isShownM()) {
                Drawable drawable = getDrawable();
                LottieDrawable lottieDrawable = this.lottieDrawable;
                if (drawable != lottieDrawable) {
                    this.resumeAnimationWhenDrawableNotThisLottie = true;
                    return;
                } else {
                    lottieDrawable.resumeAnimation();
                    enableOrDisableHardwareLayer();
                }
            } else {
                if (C145328eku.LJIIJJI && isLottieTmpDetached()) {
                    removeCallbacks(this.playAction);
                    post(this.playAction);
                }
                this.playAnimationWhenShown = false;
                this.wasAnimatingWhenNotShown = true;
            }
            this.playAnimationWhenDrawableNotThisLottie = false;
            this.resumeAnimationWhenDrawableNotThisLottie = false;
            return;
        }
        this.lottieDrawable.resumeAnimation();
        enableOrDisableHardwareLayer();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Integer num;
        super.onAttachedToWindow();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C145320ekm.LIZ) {
            StringBuilder sb = new StringBuilder("traceLottieViewOnAttachedToWindow  {isShown=");
            sb.append(isShown());
            sb.append(" visibility:");
            sb.append(getVisibility());
            sb.append("  view=");
            sb.append(hashCode());
            sb.append(" drawable=");
            if (lottieDrawable != null) {
                num = Integer.valueOf(lottieDrawable.hashCode());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" visible:");
            sb.append(isShown());
            sb.append("}");
        }
        if (C145328eku.LIZ) {
            if (!isInEditMode() && (this.autoPlay || this.wasAnimatingWhenDetached)) {
                playAnimation();
                this.autoPlay = false;
                this.wasAnimatingWhenDetached = false;
            }
            if (Build.VERSION.SDK_INT < 23) {
                onVisibilityChanged(this, getVisibility());
            }
        } else if (this.autoPlay || this.wasAnimatingWhenDetached) {
            playAnimation();
        }
    }

    /* renamed from: INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps */
    public static void m20547xcd6a9bd(LottieAnimationView lottieAnimationView) {
        try {
            lottieAnimationView.recycleBitmaps();
        } catch (Exception unused) {
        }
    }

    public void useExperimentalHardwareAcceleration(boolean z) {
        useHardwareAcceleration(z);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.enableMergePathsForKitKatAndAbove(z);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.lottieOnCompositionLoadedListeners.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.lottieDrawable.resolveKeyPath(keyPath);
    }

    public void setAnimation(JsonReader jsonReader) {
        setAnimation(jsonReader, (String) null);
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.lottieDrawable.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFrame(int i) {
        this.lottieDrawable.setFrame(i);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.lottieDrawable.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.setMaxFrame(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.setMaxProgress(f);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.setMinProgress(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(float f) {
        this.lottieDrawable.setProgress(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
        enableOrDisableHardwareLayer();
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.setSafeMode(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.setSpeed(f);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.lottieDrawable.setTextDelegate(textDelegate);
    }

    public boolean addLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
        return this.lottieOnCompositionLoadedListeners.add(lottieOnCompositionLoadedListener);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable.setRepeatCount(i);
    }

    public void setAnimationFromJson(String str) {
        C145320ekm.LIZ(this, this.lottieDrawable, "jsonString");
        setAnimationFromJson(str, null);
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        LottieTask lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeFailureListener(this.failureListener);
            this.compositionTask.addFailureListener(lottieListener);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m20547xcd6a9bd(this);
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m20547xcd6a9bd(this);
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void useHardwareAcceleration(boolean z) {
        this.hasSetUseHardwareLayer = true;
        if (this.useHardwareLayer == z) {
            return;
        }
        this.useHardwareLayer = z;
        enableOrDisableHardwareLayer();
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        Bitmap drawingBitmap;
        if (C145328eku.LIZ && this.lottieDrawable.canAsyncBitmapDraw() && (drawingBitmap = this.lottieDrawable.getDrawingBitmap()) != null) {
            return drawingBitmap;
        }
        return super.getDrawingCache(z);
    }

    public void setAnimationFromUrl(String str) {
        C145320ekm.LIZ(this, this.lottieDrawable, str);
        clearComposition();
        cancelLoaderTask();
        LottieTask<LottieComposition> fromUrl = LottieCompositionFactory.fromUrl(getContext(), str);
        fromUrl.addListener(this.loadedListener);
        fromUrl.addFailureListener(this.failureListener);
        this.compositionTask = fromUrl;
    }

    public void setDrawFpsTracerOutputListener(a$b a_b) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C145323ekp.LIZIZ) {
            C145323ekp.LIZ(lottieDrawable);
            if (lottieDrawable != null) {
                if (lottieDrawable.drawFpsTracer != null) {
                    lottieDrawable.drawFpsTracer.LIZ(a_b);
                }
            } else if (C145323ekp.LIZ == null) {
            } else {
                C145323ekp.LIZ.LIZ(a_b);
            }
        }
    }

    public void setScale(float f) {
        this.lottieDrawable.setScale(f);
        if (getDrawable() == this.lottieDrawable) {
            setImageDrawable(null, false);
            setImageDrawable(this.lottieDrawable, false);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        if (C145328eku.LIZ && drawable != this.lottieDrawable && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable = (LottieDrawable) drawable;
            if (lottieDrawable.isAnimating()) {
                lottieDrawable.cancelAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimation(JSONObject jSONObject) {
        C145320ekm.LIZ(this, this.lottieDrawable, "json object");
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setComposition(LottieComposition lottieComposition) {
        this.lottieDrawable.setCallback(this);
        this.composition = lottieComposition;
        if (C145328eku.LIZ && C145328eku.LIZIZ && !this.disableOptInit && (getDrawable() == null || getDrawable() == this.lottieDrawable)) {
            this.lottieDrawable.setCompositionAsync(lottieComposition, new AbstractC145346elC() { // from class: com.airbnb.lottie.LottieAnimationView.5
                static {
                    Covode.recordClassIndex(3909);
                }

                @Override // p003X.AbstractC145346elC
                public final void LIZ(boolean z) {
                    LottieAnimationView.this.setCompositionAfter(z);
                }
            });
        } else {
            setCompositionAfter(this.lottieDrawable.setComposition(lottieComposition));
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init(null);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        if (C145328eku.LIZ) {
            if (this.lottieDrawable.canAsyncBitmapDraw()) {
                return;
            }
            C0810L.beginSection("buildDrawingCache");
            this.buildDrawingCacheDepth++;
            super.buildDrawingCache(z);
            if (this.buildDrawingCacheDepth == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
                setRenderMode(RenderMode.HARDWARE);
            }
            this.buildDrawingCacheDepth--;
            C0810L.endSection("buildDrawingCache");
            return;
        }
        super.buildDrawingCache(z);
    }

    /* renamed from: com_airbnb_lottie_LottieAnimationView__onRestoreInstanceState$___twin___ */
    public void m20546x1f3acb70(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.LIZ;
        if (!TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.LIZIZ;
        int i = this.animationResId;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.LIZJ);
        if (savedState.LIZLLL) {
            playAnimation();
        }
        this.lottieDrawable.setImagesAssetsFolder(savedState.f21080LJ);
        setRepeatMode(savedState.LJFF);
        setRepeatCount(savedState.LJI);
    }

    public void setAnimation(final int i) {
        C145320ekm.LIZ(this, this.lottieDrawable, Integer.valueOf(i));
        this.animationResId = i;
        this.animationName = null;
        LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(Integer.toString(i));
        if (LIZ != null) {
            setComposition(LIZ);
            return;
        }
        clearComposition();
        cancelLoaderTask();
        LottieTask<LottieComposition> fromRawRes = LottieCompositionFactory.fromRawRes(getContext(), i);
        fromRawRes.addListener(new LottieListener<LottieComposition>(this) { // from class: com.airbnb.lottie.LottieAnimationView.3
            static {
                Covode.recordClassIndex(3907);
            }

            @Override // com.airbnb.lottie.LottieListener
            public final /* synthetic */ void onResult(LottieComposition lottieComposition) {
                LottieCompositionCache.LIZ().LIZ(Integer.toString(i), lottieComposition);
            }
        });
        fromRawRes.addListener(this.loadedListener);
        fromRawRes.addFailureListener(this.failureListener);
        this.compositionTask = fromRawRes;
    }

    public void setCompositionAfter(boolean z) {
        Object[] array;
        enableOrDisableHardwareLayer();
        if (getDrawable() == this.lottieDrawable && !z) {
            if (C145328eku.LIZ) {
                onVisibilityChanged(this, getVisibility());
                return;
            }
            return;
        }
        if (C145328eku.LIZ) {
            setImageDrawable(null, false);
            setImageDrawable(this.lottieDrawable, false);
            onVisibilityChanged(this, getVisibility());
        } else {
            setImageDrawable(null);
            setImageDrawable(this.lottieDrawable);
        }
        requestLayout();
        if (C145328eku.LJIIJ) {
            if (this.lottieOnCompositionLoadedListeners.size() > 0 && (array = this.lottieOnCompositionLoadedListeners.toArray()) != null) {
                for (Object obj : array) {
                    if (obj != null && (obj instanceof LottieOnCompositionLoadedListener)) {
                        ((LottieOnCompositionLoadedListener) obj).onCompositionLoaded(this.composition);
                    }
                }
                return;
            }
            return;
        }
        for (LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener : this.lottieOnCompositionLoadedListeners) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(this.composition);
        }
    }

    public void setAnimation(final String str) {
        try {
            C145320ekm.LIZ(this, this.lottieDrawable, str);
            this.animationName = str;
            this.animationResId = 0;
            LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(str);
            if (LIZ != null) {
                setComposition(LIZ);
                return;
            }
            clearComposition();
            cancelLoaderTask();
            LottieTask<LottieComposition> fromAsset = LottieCompositionFactory.fromAsset(getContext(), str);
            fromAsset.addListener(new LottieListener<LottieComposition>(this) { // from class: com.airbnb.lottie.LottieAnimationView.4
                static {
                    Covode.recordClassIndex(3908);
                }

                @Override // com.airbnb.lottie.LottieListener
                public final /* synthetic */ void onResult(LottieComposition lottieComposition) {
                    LottieCompositionCache.LIZ().LIZ(str, lottieComposition);
                }
            });
            fromAsset.addListener(this.loadedListener);
            fromAsset.addFailureListener(this.failureListener);
            this.compositionTask = fromAsset;
        } catch (Exception e) {
            C145327ekt.LIZ().LIZ(new IllegalStateException("setAnimation error!", e), str);
        }
    }

    private void init(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{2130772003, 2130772518, 2130772520, 2130772521, 2130772522, 2130773212, 2130773667, 2130773668, 2130773683, 2130773684, 2130773685, 2130773686, 2130773687});
        this.defaultCacheStrategy = CacheStrategy.values()[obtainStyledAttributes.getInt(6, DEFAULT_CACHE_STRATEGY.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            boolean hasValue2 = obtainStyledAttributes.hasValue(1);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(1);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(12)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(2, false)) {
            this.wasAnimatingWhenDetached = true;
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setRepeatCount(obtainStyledAttributes.getInt(5, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(4));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(8, false));
        if (obtainStyledAttributes.hasValue(7)) {
            addValueCallback(new KeyPath("**"), (KeyPath) AbstractC145234ejO.LJJ, (LottieValueCallback<KeyPath>) new LottieValueCallback(new C138283cv1(obtainStyledAttributes.getColor(7, 0))));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.lottieDrawable.setScale(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        if (C145328eku.LIZ && C145328eku.LIZLLL) {
            this.lottieDrawable.setHost(this);
        }
        obtainStyledAttributes.recycle();
        enableOrDisableHardwareLayer();
        if (C145328eku.LIZ) {
            LottieCompositionFactory.checkAndRegisterLowMemoryListener(getContext());
        }
        this.isInitialized = true;
    }

    /* renamed from: com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_onRestoreInstanceState */
    public static void m20545x3e541d80(LottieAnimationView lottieAnimationView, Parcelable parcelable) {
        try {
            lottieAnimationView.m20546x1f3acb70(parcelable);
        } catch (Throwable unused) {
        }
    }

    public void setAnimation(int i, CacheStrategy cacheStrategy) {
        setAnimation(i);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.setMinAndMaxProgress(f, f2);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    public void setAnimation(String str, CacheStrategy cacheStrategy) {
        setAnimation(str);
    }

    public void setAnimation(JsonReader jsonReader, String str) {
        C145320ekm.LIZ(this, this.lottieDrawable, "jsonReader");
        clearComposition();
        cancelLoaderTask();
        LottieTask<LottieComposition> fromJsonReader = LottieCompositionFactory.fromJsonReader(jsonReader, str);
        fromJsonReader.addListener(this.loadedListener);
        fromJsonReader.addFailureListener(this.failureListener);
        this.compositionTask = fromJsonReader;
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new JsonReader(new StringReader(str)), str2);
    }

    private void setImageDrawable(Drawable drawable, boolean z) {
        if (z && drawable != this.lottieDrawable) {
            m20547xcd6a9bd(this);
        }
        cancelLoaderTask();
        super.setImageDrawable(drawable);
        if (C145328eku.LIZ && this.isInitialized && drawable == this.lottieDrawable) {
            if (!isAnimating()) {
                if (this.playAnimationWhenDrawableNotThisLottie) {
                    playAnimation();
                } else if (this.resumeAnimationWhenDrawableNotThisLottie) {
                    resumeAnimation();
                }
            }
            this.playAnimationWhenDrawableNotThisLottie = false;
            this.resumeAnimationWhenDrawableNotThisLottie = false;
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Integer num;
        super.onVisibilityChanged(view, i);
        if (!C145328eku.LIZ || !this.isInitialized) {
            return;
        }
        if (isShownM()) {
            if (this.wasAnimatingWhenNotShown) {
                resumeAnimation();
            } else if (this.playAnimationWhenShown) {
                playAnimation();
            }
            this.wasAnimatingWhenNotShown = false;
            this.playAnimationWhenShown = false;
        } else if (isAnimating()) {
            pauseAnimation();
            this.wasAnimatingWhenNotShown = true;
        }
        LottieDrawable lottieDrawable = this.lottieDrawable;
        boolean z = this.wasAnimatingWhenNotShown;
        if (C145320ekm.LIZ) {
            StringBuilder sb = new StringBuilder("traceLottieViewOnVisibilityChanged  {isShown=");
            sb.append(isShown());
            sb.append(" visibility:");
            sb.append(getVisibility());
            sb.append("  wasAnimatingWhenNotShown=");
            sb.append(z);
            sb.append("  view=");
            sb.append(hashCode());
            sb.append(" drawable=");
            if (lottieDrawable != null) {
                num = Integer.valueOf(lottieDrawable.hashCode());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" visible:");
            sb.append(isShown());
            sb.append("}");
        }
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, final SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) new LottieValueCallback<T>(this) { // from class: com.airbnb.lottie.LottieAnimationView.7
            static {
                Covode.recordClassIndex(3911);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        LottieDrawable lottieDrawable;
        super.onSizeChanged(i, i2, i3, i4);
        if (C145328eku.LIZ && C145328eku.LIZLLL && (lottieDrawable = this.lottieDrawable) != null) {
            lottieDrawable.setLayoutSize(i, i2);
        }
    }
}
