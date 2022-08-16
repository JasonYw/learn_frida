package com.bef.effectsdk.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.MotionEventCompat;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.GLTextureView;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.view.ViewControllerInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes10.dex */
public class BEFView extends GLTextureView implements GLSurfaceView.Renderer, MessageCenter.Listener, ViewControllerInterface.NativeMessageListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mAdBundlePath;
    public AssetResourceFinder mAssetResourceFinder;
    public long mAttachedEffect;
    public Queue<Runnable> mCacheMessages;
    public boolean mDestroyed;
    public long mHandle;
    public long mLastAttachedEffect;
    public long mLastTickInNanoSeconds;
    public HashSet<MessageListener> mListeners;
    public float[] mMatrix;
    public boolean mMultipleTouchEnabled;
    public boolean mNativeInited;
    public Builder.Params mParams;
    public int mSourceTexture;
    public int[] mTouch_ids;
    public float[] mTouch_xs;
    public float[] mTouch_ys;

    /* loaded from: classes10.dex */
    public interface MessageListener {
        static {
            Covode.recordClassIndex(9606);
        }

        void onMessageReceived(long j, long j2, long j3, String str);
    }

    static {
        Covode.recordClassIndex(9587);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    /* loaded from: classes10.dex */
    public static class Color {

        /* renamed from: a */
        public float f25577a;

        /* renamed from: b */
        public float f25578b;

        /* renamed from: g */
        public float f25579g;

        /* renamed from: r */
        public float f25580r;

        static {
            Covode.recordClassIndex(9604);
        }

        public float alpha() {
            return this.f25577a;
        }

        public float blue() {
            return this.f25578b;
        }

        public float green() {
            return this.f25579g;
        }

        public float red() {
            return this.f25580r;
        }

        public Color() {
            setColor(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Color(float f, float f2, float f3, float f4) {
            setColor(f, f2, f3, f4);
        }

        public void setColor(float f, float f2, float f3, float f4) {
            this.f25580r = f;
            this.f25579g = f2;
            this.f25578b = f3;
            this.f25577a = f4;
        }
    }

    public synchronized boolean getNativeInited() {
        boolean z;
        MethodCollector.m14708i(694);
        z = this.mNativeInited;
        MethodCollector.m14707o(694);
        return z;
    }

    /* loaded from: classes5.dex */
    public enum BEFViewSceneKey {
        SHOOT,
        LIVE,
        LIVE_OGC,
        GAME,
        M10N;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BEFViewSceneKey[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (BEFViewSceneKey[]) proxy.result;
            }
            return (BEFViewSceneKey[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9601);
        }

        public static BEFViewSceneKey valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (BEFViewSceneKey) proxy.result;
            }
            return (BEFViewSceneKey) Enum.valueOf(BEFViewSceneKey.class, str);
        }
    }

    /* loaded from: classes5.dex */
    public enum FitMode {
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_SCREEN,
        FIT_WIDTH_BOTTOM,
        NO_CLIP;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FitMode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (FitMode[]) proxy.result;
            }
            return (FitMode[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9605);
        }

        public static FitMode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (FitMode) proxy.result;
            }
            return (FitMode) Enum.valueOf(FitMode.class, str);
        }
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onExitContext() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        destoryRender();
    }

    /* renamed from: com.bef.effectsdk.view.BEFView$12 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C248712 {
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode = new int[FitMode.valuesCustom().length];

        static {
            Covode.recordClassIndex(9591);
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.FIT_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.FIT_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.FILL_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.NO_CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Params mParams = new Params();

        static {
            Covode.recordClassIndex(9602);
        }

        public static Builder obtain() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            Builder builder = new Builder();
            Params params = builder.mParams;
            params.mRenderWidth = 720;
            params.mRenderHeight = 1280;
            params.mFPS = 30.0d;
            params.mFitMode = FitMode.FILL_SCREEN;
            Params params2 = builder.mParams;
            params2.mResourceFinder = null;
            params2.mSceneKey = BEFViewSceneKey.SHOOT;
            Params params3 = builder.mParams;
            params3.mNeglectTouchEvent = false;
            params3.mKeepStatusAtPause = false;
            return builder;
        }

        /* loaded from: classes10.dex */
        public class Params {
            public double mFPS;
            public FitMode mFitMode;
            public boolean mKeepStatusAtPause;
            public boolean mNeglectTouchEvent;
            public int mRenderHeight;
            public int mRenderWidth;
            public ResourceFinder mResourceFinder;
            public BEFViewSceneKey mSceneKey;

            static {
                Covode.recordClassIndex(9603);
            }

            public Params() {
            }
        }

        public final Builder setFPS(double d) {
            this.mParams.mFPS = d;
            return this;
        }

        public final Builder setFitMode(FitMode fitMode) {
            this.mParams.mFitMode = fitMode;
            return this;
        }

        public final Builder setKeepStatusAtPause(boolean z) {
            this.mParams.mKeepStatusAtPause = z;
            return this;
        }

        public final Builder setNeglectTouchEvent(boolean z) {
            this.mParams.mNeglectTouchEvent = z;
            return this;
        }

        public final Builder setResourceFinder(ResourceFinder resourceFinder) {
            this.mParams.mResourceFinder = resourceFinder;
            return this;
        }

        public final Builder setSceneKey(BEFViewSceneKey bEFViewSceneKey) {
            this.mParams.mSceneKey = bEFViewSceneKey;
            return this;
        }

        public final BEFView build(Context context) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (BEFView) proxy.result;
            }
            BEFView bEFView = new BEFView(context);
            bEFView.setParams(this.mParams);
            return bEFView;
        }

        public final Builder setRenderSize(int i, int i2) {
            Params params = this.mParams;
            params.mRenderWidth = i;
            params.mRenderHeight = i2;
            return this;
        }

        public final BEFView build(Context context, AttributeSet attributeSet) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (BEFView) proxy.result;
            }
            BEFView bEFView = new BEFView(context, attributeSet);
            bEFView.setParams(this.mParams);
            return bEFView;
        }
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported || this.mDestroyed) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.8
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9599);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                BEFView.this.destoryRender();
            }
        });
        super.onDestroy();
        this.mDestroyed = true;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported || this.mDestroyed) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.6
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9597);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                if (BEFView.this.mParams.mSceneKey != BEFViewSceneKey.GAME && !BEFView.this.mParams.mKeepStatusAtPause) {
                    BEFView.this.destoryRender();
                } else {
                    ViewControllerInterface.onPause(BEFView.this.mHandle);
                }
            }
        });
        super.onPause();
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18).isSupported || this.mDestroyed) {
            return;
        }
        super.onResume();
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.7
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9598);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                if (!BEFView.this.getNativeInited()) {
                    BEFView.this.initRender();
                } else {
                    ViewControllerInterface.onResume(BEFView.this.mHandle);
                }
            }
        });
    }

    public void destoryRender() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported && getNativeInited()) {
            setNativeInited(false);
            if (this.mParams.mResourceFinder != null) {
                this.mParams.mResourceFinder.release(this.mHandle);
            }
            AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0L);
            }
            ViewControllerInterface.removeMessageListener(this.mHandle, this);
            ViewControllerInterface.destroy(this.mHandle);
            this.mHandle = 0L;
            ViewControllerInterface.deleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener(this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0L;
        }
    }

    public void initRender() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        setNativeInited(false);
        long j = this.mHandle;
        if (j != 0) {
            try {
                ViewControllerInterface.destroy(j);
                this.mHandle = 0L;
            } catch (Exception unused) {
            }
        }
        int i = this.mSourceTexture;
        if (i > 0) {
            ViewControllerInterface.deleteTexture(i);
        }
        if (this.mHandle == 0) {
            long[] jArr = new long[2];
            ViewControllerInterface.createHandle(jArr, this.mParams.mSceneKey.ordinal());
            this.mHandle = jArr[0];
            if (this.mParams.mResourceFinder != null) {
                ViewControllerInterface.setResourceFinder(this.mHandle, this.mParams.mResourceFinder.createNativeResourceFinder(this.mHandle), 0L);
            } else {
                ViewControllerInterface.setResourceFinder(this.mHandle, 0L, 0L);
            }
            ViewControllerInterface.init(this.mHandle, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        }
        ViewControllerInterface.addMessageListener(this.mHandle, this);
        MessageCenter.init();
        MessageCenter.addListener(this);
        this.mLastTickInNanoSeconds = System.nanoTime();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.mParams.mRenderWidth, this.mParams.mRenderHeight, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glViewport(0, 0, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        this.mSourceTexture = iArr[0];
        String str = this.mAdBundlePath;
        if (str != "") {
            ViewControllerInterface.setStickerPath(this.mHandle, str);
        }
        this.mLastAttachedEffect = 0L;
        setNativeInited(true);
    }

    public void setParams(Builder.Params params) {
        this.mParams = params;
    }

    public synchronized void attachEffect(long j) {
        MethodCollector.m14708i(692);
        this.mAttachedEffect = j;
        MethodCollector.m14707o(692);
    }

    public synchronized void setNativeInited(boolean z) {
        MethodCollector.m14708i(695);
        this.mNativeInited = z;
        MethodCollector.m14707o(695);
    }

    public BEFView(Context context) {
        super(context);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    public synchronized int addMessageListener(MessageListener messageListener) {
        MethodCollector.m14708i(697);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{messageListener}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(697);
            return intValue;
        } else if (messageListener == null) {
            MethodCollector.m14707o(697);
            return -1;
        } else {
            this.mListeners.add(messageListener);
            MethodCollector.m14707o(697);
            return 0;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!getNativeInited() || this.mAdBundlePath == "" || this.mParams.mNeglectTouchEvent) {
            return false;
        }
        dealWithTouches(motionEvent);
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public synchronized int removeMessageListener(MessageListener messageListener) {
        MethodCollector.m14708i(698);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{messageListener}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(698);
            return intValue;
        } else if (messageListener == null) {
            MethodCollector.m14707o(698);
            return -1;
        } else {
            this.mListeners.remove(messageListener);
            MethodCollector.m14707o(698);
            return 0;
        }
    }

    public synchronized void setStickerPath(final String str) {
        MethodCollector.m14708i(696);
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            MethodCollector.m14707o(696);
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9588);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFView.this.getNativeInited()) {
                    BEFView bEFView = BEFView.this;
                    bEFView.mAdBundlePath = str;
                    ViewControllerInterface.setStickerPath(bEFView.mHandle, str);
                }
            }
        });
        MethodCollector.m14707o(696);
    }

    private void init(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        this.mAssetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.mAssetResourceFinder.createNativeResourceFinder(0L);
        this.mDestroyed = false;
    }

    public synchronized boolean setExternalTouchEvent(MotionEvent motionEvent) {
        MethodCollector.m14708i(701);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(701);
            return booleanValue;
        } else if (getNativeInited() && this.mAdBundlePath != "") {
            dealWithTouches(motionEvent);
            MethodCollector.m14707o(701);
            return true;
        } else {
            MethodCollector.m14707o(701);
            return false;
        }
    }

    private void dealWithTouches(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.mTouch_ids[i] = motionEvent.getPointerId(i);
            this.mTouch_xs[i] = motionEvent.getX(i);
            this.mTouch_ys[i] = motionEvent.getY(i);
        }
        convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
        int actionIndex = motionEvent.getActionIndex();
        if (this.mMultipleTouchEnabled || actionIndex == 0) {
            int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 5) {
                            if (action != 6) {
                                return;
                            }
                        }
                    } else {
                        final int[] iArr = new int[pointerCount];
                        final float[] fArr = new float[pointerCount];
                        final float[] fArr2 = new float[pointerCount];
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            iArr[i2] = this.mTouch_ids[i2];
                            fArr[i2] = this.mTouch_xs[i2];
                            fArr2[i2] = this.mTouch_ys[i2];
                        }
                        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.4
                            public static ChangeQuickRedirect changeQuickRedirect;

                            static {
                                Covode.recordClassIndex(9595);
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                    return;
                                }
                                ViewControllerInterface.touchMoveEvent(BEFView.this.mHandle, iArr, fArr, fArr2, pointerCount);
                            }
                        });
                        return;
                    }
                }
                final int[] iArr2 = {this.mTouch_ids[actionIndex]};
                final float[] fArr3 = {this.mTouch_xs[actionIndex]};
                final float[] fArr4 = {this.mTouch_ys[actionIndex]};
                queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.5
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9596);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        ViewControllerInterface.touchEndEvent(BEFView.this.mHandle, iArr2, fArr3, fArr4, pointerCount);
                    }
                });
                return;
            }
            final int[] iArr3 = {this.mTouch_ids[actionIndex]};
            final float[] fArr5 = {this.mTouch_xs[actionIndex]};
            final float[] fArr6 = {this.mTouch_ys[actionIndex]};
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.3
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9594);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    ViewControllerInterface.touchBeginEvent(BEFView.this.mHandle, iArr3, fArr5, fArr6, pointerCount);
                }
            });
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        MethodCollector.m14708i(693);
        if (PatchProxy.proxy(new Object[]{gl10}, this, changeQuickRedirect, false, 6).isSupported) {
            MethodCollector.m14707o(693);
        } else if (!getNativeInited()) {
            MethodCollector.m14707o(693);
        } else {
            long j = this.mAttachedEffect;
            if (j != this.mLastAttachedEffect) {
                ViewControllerInterface.attachEffect(this.mHandle, j);
                this.mLastAttachedEffect = this.mAttachedEffect;
            }
            long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
            double d = (1.0d / this.mParams.mFPS) * 1.0E9d;
            double d2 = nanoTime;
            if (d2 < d) {
                try {
                    Thread.sleep((long) (((d - d2) * 1.0d) / 1000000.0d));
                } catch (Exception unused) {
                }
            }
            this.mLastTickInNanoSeconds = System.nanoTime();
            while (!this.mCacheMessages.isEmpty()) {
                this.mCacheMessages.poll().run();
            }
            double nanoTime2 = System.nanoTime() / 1.0E9d;
            int width = getWidth();
            int height = getHeight();
            Matrix.setIdentityM(this.mMatrix, 0);
            RectF rectF = new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
            float f = width;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, height);
            PointF fitResolution = fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
            PointF fitResolution2 = fitResolution(new PointF(this.mParams.mRenderWidth, this.mParams.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
            if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                fitResolution = new PointF(0.0f, 0.0f);
                fitResolution2 = new PointF(f, (this.mParams.mRenderHeight * width) / this.mParams.mRenderWidth);
            }
            ViewControllerInterface.processFrame(this.mHandle, this.mSourceTexture, this.mParams.mRenderWidth, this.mParams.mRenderHeight, this.mMatrix, new float[]{fitResolution.x, fitResolution.y, fitResolution2.x - fitResolution.x, fitResolution2.y - fitResolution.y}, nanoTime2);
            MethodCollector.m14707o(693);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (PatchProxy.proxy(new Object[]{gl10, eGLConfig}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        initRender();
    }

    public synchronized void setRenderCacheData(final String str, final String str2) {
        MethodCollector.m14708i(702);
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 21).isSupported) {
            MethodCollector.m14707o(702);
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.9
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9600);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheData(BEFView.this.mHandle, str, str2);
                }
            }
        });
        MethodCollector.m14707o(702);
    }

    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        MethodCollector.m14708i(703);
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22).isSupported) {
            MethodCollector.m14707o(703);
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.10
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9589);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTexture(BEFView.this.mHandle, str, str2);
                }
            }
        });
        MethodCollector.m14707o(703);
    }

    public BEFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        PointF fitResolution;
        if (PatchProxy.proxy(new Object[]{fArr, fArr2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            PointF pointF = new PointF(f, f2);
            float f3 = width;
            float f4 = height;
            RectF rectF = new RectF(0.0f, 0.0f, f3, f4);
            new PointF();
            if (this.mParams.mFitMode == FitMode.FILL_SCREEN) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), FitMode.NO_CLIP);
            } else if (this.mParams.mFitMode == FitMode.NO_CLIP) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), FitMode.FILL_SCREEN);
            } else if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                float f5 = ((f3 * 1.0f) / this.mParams.mRenderWidth) * this.mParams.mRenderHeight;
                fArr[i2] = (f * 1.0f) / f3;
                fArr2[i2] = ((f2 - (f4 - f5)) * 1.0f) / f5;
            } else {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), this.mParams.mFitMode);
            }
            fArr[i2] = fitResolution.x / this.mParams.mRenderWidth;
            fArr2[i2] = fitResolution.y / this.mParams.mRenderHeight;
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        postMessage(i, i2, i3, str);
    }

    @Override // com.bef.effectsdk.view.ViewControllerInterface.NativeMessageListener
    public synchronized int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        MethodCollector.m14708i(700);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), str}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(700);
            return intValue;
        }
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(j, j2, j3, str);
        }
        MethodCollector.m14707o(700);
        return 0;
    }

    public synchronized int postMessage(final long j, final long j2, final long j3, final String str) {
        MethodCollector.m14708i(699);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), str}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(699);
            return intValue;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9592);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                BEFView.this.mCacheMessages.add(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9593);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        ViewControllerInterface.postMessage(BEFView.this.mHandle, j, j2, j3, str);
                    }
                });
            }
        });
        MethodCollector.m14707o(699);
        return 0;
    }

    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i, final int i2) {
        MethodCollector.m14708i(704);
        if (PatchProxy.proxy(new Object[]{str, bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 23).isSupported) {
            MethodCollector.m14707o(704);
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.11
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9590);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTextureWithBuffer(BEFView.this.mHandle, str, bArr, i, i2);
                }
            }
        });
        MethodCollector.m14707o(704);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.PointF fitResolution(android.graphics.PointF r14, android.graphics.RectF r15, android.graphics.RectF r16, com.bef.effectsdk.view.BEFView.FitMode r17) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.fitResolution(android.graphics.PointF, android.graphics.RectF, android.graphics.RectF, com.bef.effectsdk.view.BEFView$FitMode):android.graphics.PointF");
    }
}
