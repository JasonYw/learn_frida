package com.bef.effectsdk.game;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import androidx.core.view.MotionEventCompat;
import com.bef.effectsdk.OpenGLUtils;
import com.bef.effectsdk.game.NativeInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes10.dex */
public class BEFGameView extends GLSurfaceView implements GLSurfaceView.Renderer, NativeInterface.NativeMessageListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mAnimationInterval;
    public double mCurrentFps;
    public int mDstTexture;
    public int mFBO;
    public long mFps;
    public int mGlMatrixHandle;
    public int mGlPosHandle;
    public int mGlProgram;
    public int mGlTextureSampleHandle;
    public int mGlUvHandle;
    public long mHandle;
    public long mLastTickInNanoSeconds;
    public boolean mNativeInited;
    public int mSrcTexture;
    public long mStartTimeStampNanoSeconds;
    public boolean mSwallowTouches;
    public String mGameBundlePath = "";
    public float[] mMatrix = new float[16];
    public boolean mFirstLoopGuard = true;
    public boolean mMultipleTouchEnabled = true;
    public int[] mTouch_ids = new int[10];
    public float[] mTouch_xs = new float[10];
    public float[] mTouch_ys = new float[10];
    public HashSet<MessageListener> mListeners = new HashSet<>();
    public Queue<Runnable> mCacheMessages = new LinkedList();

    /* loaded from: classes10.dex */
    public interface MessageListener {
        static {
            Covode.recordClassIndex(9567);
        }

        int onMsgReceived(long j, long j2, long j3, String str);
    }

    static {
        Covode.recordClassIndex(9554);
    }

    public void destroyBEFGame() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public synchronized double getCurrentFps() {
        double d;
        MethodCollector.m14708i(665);
        d = this.mCurrentFps;
        MethodCollector.m14707o(665);
        return d;
    }

    public synchronized boolean getNativeInited() {
        boolean z;
        MethodCollector.m14708i(666);
        z = this.mNativeInited;
        MethodCollector.m14707o(666);
        return z;
    }

    public void pauseGame() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.3
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9559);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFGameView.this.mHandle != 0) {
                    NativeInterface.pause(BEFGameView.this.mHandle);
                }
            }
        });
    }

    public void resumeGame() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.4
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9560);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && BEFGameView.this.mHandle != 0) {
                    NativeInterface.resume(BEFGameView.this.mHandle);
                }
            }
        });
    }

    public void deleteBuffers() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{this.mSrcTexture}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.mDstTexture}, 0);
        GLES20.glDeleteBuffers(1, new int[]{this.mFBO}, 0);
    }

    public void initRenderObject() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mGlProgram = OpenGLUtils.loadProgram("attribute vec2 attUV;\nattribute vec2 attPosition;\nvarying vec2 textureCoord;\nuniform mat4 mvpMatrix;\n\nvoid main() {\n    gl_Position  = mvpMatrix * vec4(attPosition, 0.,1.);\n    textureCoord = attUV;\n}\n", "precision highp float;\n\nuniform sampler2D uTexture;\nvarying vec2 textureCoord;\nvoid main() {\n    gl_FragColor = texture2D(uTexture, textureCoord);\n}\n");
        this.mGlUvHandle = GLES20.glGetAttribLocation(this.mGlProgram, "attUV");
        this.mGlPosHandle = GLES20.glGetAttribLocation(this.mGlProgram, "attPosition");
        this.mGlMatrixHandle = GLES20.glGetUniformLocation(this.mGlProgram, "mvpMatrix");
        this.mGlTextureSampleHandle = GLES20.glGetUniformLocation(this.mGlProgram, "uTexture");
        getWidth();
        getHeight();
        this.mSrcTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        this.mDstTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.mFBO = iArr[0];
        GLES20.glBindFramebuffer(36160, this.mFBO);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mDstTexture, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void renderTextureToView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        int width = getWidth();
        int height = getHeight();
        GLES20.glViewport(0, 0, width, height);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glUseProgram(this.mGlProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mDstTexture);
        GLES20.glUniform1i(this.mGlTextureSampleHandle, 0);
        Matrix.setIdentityM(this.mMatrix, 0);
        GLES20.glUniformMatrix4fv(this.mGlMatrixHandle, 1, false, this.mMatrix, 0);
        GLES20.glEnableVertexAttribArray(this.mGlPosHandle);
        float f = height / 2.0f;
        GLES20.glVertexAttribPointer(this.mGlPosHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getVertexBufferWithParams(-1.0f, 1.0f, ((((width * 1.0f) / 720.0f) * 1280.0f) - f) / f, -1.0f));
        GLES20.glEnableVertexAttribArray(this.mGlUvHandle);
        GLES20.glVertexAttribPointer(this.mGlUvHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getUVBuffer());
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void setNativeInited(boolean z) {
        this.mNativeInited = z;
    }

    public void setSwallowTouches(boolean z) {
        this.mSwallowTouches = z;
    }

    /* loaded from: classes10.dex */
    public class BEFGameContextFactory implements GLSurfaceView.EGLContextFactory {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int EGL_CONTEXT_CLIENT_VERSION;

        static {
            Covode.recordClassIndex(9566);
        }

        public BEFGameContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLConfig}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EGLContext) proxy.result;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLContext}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
            if (BEFGameView.this.getNativeInited()) {
                BEFGameView.this.setNativeInited(false);
                NativeInterface.destroy(BEFGameView.this.mHandle);
                BEFGameView.this.deleteBuffers();
            }
        }
    }

    public void setFps(long j) {
        if (j >= 60) {
            this.mFps = 60L;
        } else {
            this.mFps = j;
        }
        long j2 = this.mFps;
        this.mCurrentFps = j2;
        this.mAnimationInterval = (1.0f / ((float) j2)) * 1.0E9f;
    }

    public void setGameBundlePath(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9555);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported || BEFGameView.this.mGameBundlePath.equals(str)) {
                    return;
                }
                BEFGameView bEFGameView = BEFGameView.this;
                bEFGameView.mGameBundlePath = str;
                if (bEFGameView.getNativeInited()) {
                    NativeInterface.setGameBundlePath(BEFGameView.this.mHandle, str);
                    BEFGameView.this.mFirstLoopGuard = true;
                }
            }
        });
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        super.surfaceDestroyed(surfaceHolder);
    }

    public int addMessageListener(MessageListener messageListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{messageListener}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (messageListener == null) {
            return 3;
        }
        this.mListeners.add(messageListener);
        return 0;
    }

    public int removeMessageListener(MessageListener messageListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{messageListener}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (messageListener == null) {
            return 3;
        }
        this.mListeners.remove(messageListener);
        return 0;
    }

    public void render(double d) {
        if (PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        NativeInterface.setSize(this.mHandle, 720, 1280);
        renderGameToTexture(d);
        renderTextureToView();
    }

    public void renderGameToTexture(double d) {
        if (PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.mFBO);
        GLES20.glViewport(0, 0, 720, 1280);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        NativeInterface.processFrame(this.mHandle, this.mSrcTexture, this.mDstTexture, d);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public BEFGameView(Context context) {
        super(context);
        MethodCollector.m14708i(664);
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderMediaOverlay(true);
        setEGLContextFactory(new BEFGameContextFactory());
        setRenderer(this);
        setRenderMode(1);
        setFps(60L);
        MethodCollector.m14707o(664);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        MethodCollector.m14708i(667);
        if (PatchProxy.proxy(new Object[]{gl10}, this, changeQuickRedirect, false, 9).isSupported) {
            MethodCollector.m14707o(667);
        } else if (getNativeInited() && !this.mGameBundlePath.isEmpty()) {
            if (this.mFirstLoopGuard) {
                this.mStartTimeStampNanoSeconds = System.nanoTime();
                this.mLastTickInNanoSeconds = System.nanoTime();
            }
            if (!this.mFirstLoopGuard) {
                while (!this.mCacheMessages.isEmpty()) {
                    this.mCacheMessages.poll().run();
                }
            }
            render((System.nanoTime() - this.mStartTimeStampNanoSeconds) / 1.0E9d);
            long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
            long j = this.mAnimationInterval;
            if (nanoTime < j) {
                try {
                    Thread.sleep((long) (((j - nanoTime) * 1.0d) / 1000000.0d));
                } catch (Exception unused) {
                }
            }
            this.mCurrentFps = 1.0d / (((System.nanoTime() - this.mLastTickInNanoSeconds) * 1.0d) / 1.0E9d);
            double d = this.mCurrentFps;
            long j2 = this.mFps;
            if (d >= j2) {
                this.mCurrentFps = j2;
            }
            this.mLastTickInNanoSeconds = System.nanoTime();
            this.mFirstLoopGuard = false;
            MethodCollector.m14707o(667);
        } else {
            MethodCollector.m14707o(667);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.mTouch_ids[i] = motionEvent.getPointerId(i);
            this.mTouch_xs[i] = motionEvent.getX(i);
            this.mTouch_ys[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action == 6) {
                            int action2 = motionEvent.getAction() >> 8;
                            if (this.mMultipleTouchEnabled || action2 == 0) {
                                convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                                final int[] iArr = {this.mTouch_ids[action2]};
                                final float[] fArr = {this.mTouch_xs[action2]};
                                final float[] fArr2 = {this.mTouch_ys[action2]};
                                queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.9
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    static {
                                        Covode.recordClassIndex(9565);
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                            return;
                                        }
                                        NativeInterface.touchesEnd(BEFGameView.this.mHandle, iArr, fArr, fArr2);
                                    }
                                });
                                return true;
                            }
                        }
                    } else {
                        int action3 = motionEvent.getAction() >> 8;
                        if (this.mMultipleTouchEnabled || action3 == 0) {
                            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                            final int[] iArr2 = {this.mTouch_ids[action3]};
                            final float[] fArr3 = {this.mTouch_xs[action3]};
                            final float[] fArr4 = {this.mTouch_ys[action3]};
                            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.5
                                public static ChangeQuickRedirect changeQuickRedirect;

                                static {
                                    Covode.recordClassIndex(9561);
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                        return;
                                    }
                                    NativeInterface.touchesBegin(BEFGameView.this.mHandle, iArr2, fArr3, fArr4);
                                }
                            });
                            return true;
                        }
                    }
                } else {
                    convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                    if (!this.mMultipleTouchEnabled) {
                        final int[] iArr3 = {this.mTouch_ids[0]};
                        final float[] fArr5 = {this.mTouch_xs[0]};
                        final float[] fArr6 = {this.mTouch_ys[0]};
                        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.7
                            public static ChangeQuickRedirect changeQuickRedirect;

                            static {
                                Covode.recordClassIndex(9563);
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                    return;
                                }
                                NativeInterface.touchesMove(BEFGameView.this.mHandle, iArr3, fArr5, fArr6);
                            }
                        });
                    } else {
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            final int[] iArr4 = {this.mTouch_ids[i2]};
                            final float[] fArr7 = {this.mTouch_xs[i2]};
                            final float[] fArr8 = {this.mTouch_ys[i2]};
                            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.8
                                public static ChangeQuickRedirect changeQuickRedirect;

                                static {
                                    Covode.recordClassIndex(9564);
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                                        return;
                                    }
                                    NativeInterface.touchesMove(BEFGameView.this.mHandle, iArr4, fArr7, fArr8);
                                }
                            });
                        }
                        return true;
                    }
                }
                return this.mSwallowTouches;
            }
            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
            final int[] iArr5 = {this.mTouch_ids[0]};
            final float[] fArr9 = {this.mTouch_xs[0]};
            final float[] fArr10 = {this.mTouch_ys[0]};
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.10
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9556);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    NativeInterface.touchesEnd(BEFGameView.this.mHandle, iArr5, fArr9, fArr10);
                }
            });
            return true;
        }
        convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
        final int[] iArr6 = {this.mTouch_ids[0]};
        final float[] fArr11 = {this.mTouch_xs[0]};
        final float[] fArr12 = {this.mTouch_ys[0]};
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.6
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9562);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                NativeInterface.touchesBegin(BEFGameView.this.mHandle, iArr6, fArr11, fArr12);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (PatchProxy.proxy(new Object[]{gl10, eGLConfig}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        this.mStartTimeStampNanoSeconds = System.nanoTime();
        this.mLastTickInNanoSeconds = System.nanoTime();
        long[] jArr = new long[2];
        NativeInterface.createHandle(jArr);
        this.mHandle = jArr[0];
        NativeInterface.init(this.mHandle, 720, 1280);
        NativeInterface.addMessageListener(this.mHandle, this);
        initRenderObject();
        setNativeInited(true);
        if (!this.mGameBundlePath.isEmpty()) {
            NativeInterface.setGameBundlePath(this.mHandle, this.mGameBundlePath);
        }
    }

    public void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        if (PatchProxy.proxy(new Object[]{fArr, fArr2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        float width = getWidth();
        float f = ((width * 1.0f) / 720.0f) * 1280.0f;
        float height = getHeight() - f;
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = fArr[i2];
            float f3 = fArr2[i2];
            fArr[i2] = ((f2 * 2.0f) / width) - 1.0f;
            fArr2[i2] = 1.0f - (((f3 - height) * 2.0f) / f);
        }
    }

    @Override // com.bef.effectsdk.game.NativeInterface.NativeMessageListener
    public int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), str}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMsgReceived(j, j2, j3, str);
        }
        return 0;
    }

    public int postMessage(final long j, final long j2, final long j3, final String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9557);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                BEFGameView.this.mCacheMessages.add(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9558);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        NativeInterface.postMessage(BEFGameView.this.mHandle, j, j2, j3, str);
                    }
                });
            }
        });
        return 0;
    }
}
