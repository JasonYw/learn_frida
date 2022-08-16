package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.p1543ui.view.AndroidView;
import p003X.C106862S5w;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.lynx.ui.f */
/* loaded from: classes17.dex */
public final class C5163f extends AndroidView implements LifecycleOwner {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mAutoPlay;
    public boolean mIsShowLastFrame;
    public boolean mIsShowPoster;
    public Bitmap mLastFrame;
    public Bitmap mPoster;
    public LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
    public Paint mPaint = new Paint();
    public RectF mRectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());

    static {
        Covode.recordClassIndex(32399);
    }

    public final void videoEnd() {
        this.mPoster = null;
    }

    public final void videoStart() {
        this.mLastFrame = null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle mo29786getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final boolean getMAutoPlay() {
        return this.mAutoPlay;
    }

    public final boolean getMIsShowLastFrame() {
        return this.mIsShowLastFrame;
    }

    public final boolean getMIsShowPoster() {
        return this.mIsShowPoster;
    }

    public final Bitmap getMLastFrame() {
        return this.mLastFrame;
    }

    public final LifecycleRegistry getMLifecycleRegistry() {
        return this.mLifecycleRegistry;
    }

    public final Paint getMPaint() {
        return this.mPaint;
    }

    public final Bitmap getMPoster() {
        return this.mPoster;
    }

    public final RectF getMRectF() {
        return this.mRectF;
    }

    @Override // com.lynx.tasm.behavior.p1543ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (this.mAutoPlay) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // com.lynx.tasm.behavior.p1543ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    public final void setMAutoPlay(boolean z) {
        this.mAutoPlay = z;
    }

    public final void setMIsShowLastFrame(boolean z) {
        this.mIsShowLastFrame = z;
    }

    public final void setMIsShowPoster(boolean z) {
        this.mIsShowPoster = z;
    }

    public final void setMLastFrame(Bitmap bitmap) {
        this.mLastFrame = bitmap;
    }

    public final void setMPoster(Bitmap bitmap) {
        this.mPoster = bitmap;
    }

    public final void setMLifecycleRegistry(LifecycleRegistry lifecycleRegistry) {
        if (PatchProxy.proxy(new Object[]{lifecycleRegistry}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(lifecycleRegistry);
        this.mLifecycleRegistry = lifecycleRegistry;
    }

    public final void setMPaint(Paint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(paint);
        this.mPaint = paint;
    }

    public final void setMRectF(RectF rectF) {
        if (PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(rectF);
        this.mRectF = rectF;
    }

    public C5163f(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 7).isSupported || canvas == null) {
            return;
        }
        if (this.mPoster != null && this.mIsShowPoster) {
            this.mRectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(this.mLastFrame, (Rect) null, this.mRectF, this.mPaint);
        } else if (this.mLastFrame != null && this.mIsShowLastFrame) {
            this.mRectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(this.mLastFrame, (Rect) null, this.mRectF, this.mPaint);
        } else if (this.mPoster == null) {
            boolean z = this.mIsShowLastFrame;
        }
    }

    @Override // com.lynx.tasm.behavior.p1543ui.view.AndroidView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onMeasure(i, i2);
        for (View view : LK1.LIZ((ViewGroup) this)) {
            view.measure(i, i2);
        }
    }
}
